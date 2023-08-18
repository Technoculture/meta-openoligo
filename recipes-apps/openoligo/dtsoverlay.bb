# Recipe to compile and install Device Tree Overlays

SUMMARY = "Device Tree Overlays"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://bb-evdpins-overlay.dts;md5=d0debc0c0799a83c29f93482ef859150"
SECTION = "dtbo"

# Add dtc as a build dependency
DEPENDS += "dtc-native"

# Specify the source files (DTOs)
SRC_URI = " \
    file://bb-evdpins-overlay.dts \
    file://bb-valve1pins-overlay.dts \
    file://bb-valve2pins-overlay.dts \
"

# Set the destination directory for the compiled DTOs
DTC_OVERLAYS_DIR = "/boot/dtb/${KERNEL_VERSION}/"

# Copy the source files to the ${S} directory during do_unpack
do_unpack() {
    cp ${WORKDIR}/bb-evdpins-overlay.dts ${S}
    cp ${WORKDIR}/bb-valve1pins-overlay.dts ${S}
    cp ${WORKDIR}/bb-valve2pins-overlay.dts ${S}
}

# Compile the DTOs using the Device Tree Compiler (dtc) on the host PC
do_compile() {
    do_dtc_compile
}

# Custom function to run the dtc command for each .dts file
do_dtc_compile() {
    for src_file in ${S}/*.dts; do
        dtc -O dtb -o ${S}/$(basename ${src_file%.*}).dtbo ${src_file}
    done
}

# Install the compiled DTOs into the destination directory
do_install() {
    install -d ${D}/${DTC_OVERLAYS_DIR}
    for src_file in ${S}/*.dtbo; do
        install -m 0644 ${src_file} ${D}/${DTC_OVERLAYS_DIR}
    done
}

# Specify the files to be included in the package
# Specify the files to be included in the package
FILES:${PN} += "/boot"
FILES:${PN} += "/boot/dtb/*"

