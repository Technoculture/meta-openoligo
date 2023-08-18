DESCRIPTION = "Fairly minimal image for openoligo app (openoligo)"
LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_INSTALL:append = " gcc g++ make cmake"
IMAGE_INSTALL:append = " openssh"
IMAGE_INSTALL:append = " rsync git"
IMAGE_INSTALL:append = " ntp ntpdate"
IMAGE_INSTALL:append = " net-tools iputils dhcpcd "
IMAGE_INSTALL:append = " which gzip python3 python3-pip python3-dev"
IMAGE_INSTALL:append = " wget zlib patchelf curl"
IMAGE_INSTALL:append = " packagegroup-core-buildessential"
IMAGE_INSTALL:append = " python3-poetry-core"
DISTRO_FEATURES:append = " avahi"
IMAGE_INSTALL:append = " avahi-daemon"
IMAGE_INSTALL:append = " openoligo adafruit-beaglebone-io strace "
CORE_IMAGE_EXTRA_INSTALL += " libgpiod libgpiod-dev libgpiod-tools beaglebone-capes"
IMAGE_INSTALL:append= " mdns"


IMAGE_INSTALL:append = " python3-jupyter python3-jupyter-client python3-jupyter-console python3-jupyter-core python3-jupyterlab python3-jupyterlab-pygments python3-jupyterlab-server python3-jupyterlab-widgets  python3-jupyter-packaging python3-jupyter-server"

# Add the packages to IMAGE_INSTALL
IMAGE_INSTALL:append = " \
    python-aerich \
    python-docstring-parser \
    python-charset-normalizer \
    python-click \
    python-docstring-parser \
    python-h11 \
    python-httpcore \
    python-mako \
    python-pypika-tortoise \
    python-python-dotenv \
    python-tortoise-orm \
    python-types-tqdm \"


IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE:append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "", d)}"


EXTRA_USERS_PARAMS = "\
    groupadd gpio;\
    usermod -a -G gpio root;\
    "
