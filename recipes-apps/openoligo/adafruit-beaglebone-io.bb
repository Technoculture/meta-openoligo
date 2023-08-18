DESCRIPTION = "Adafruit's BeagleBone IO Python Library"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;md5=a63d34caee7a19acf29a707b67b5b73e"
SRCNAME = "adafruit-beaglebone-io-python"

COMPATIBLE_MACHINE = "(beaglebone)"

SRC_URI = "git://github.com/adafruit/adafruit-beaglebone-io-python;protocol=https;branch=master"
SRCREV = "cf306ed7f9f24111d0949dd60ac232e81241bffe"

S = "${WORKDIR}/git"

inherit setuptools3 python3-dir

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_PACKAGE_STRIP = "1"

PACKAGES = "${PN}"
FILES_${PN} += " \
    ${PYTHON_SITEPACKAGES_DIR}/${SRCNAME}/*.py \
    lib/firmware/* \
"

