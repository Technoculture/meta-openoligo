SUMMARY = "Example recipe for a Python project managed with Poetry"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"
SECTION = "app"

PR = "r1"

inherit setuptools3 package 

SRC_URI = "git://github.com/Technoculture/OpenOligo.git;protocol=https;branch=dev"
SRCREV = "1dfac7bc19db393383d410f2ab89c50f0d0c4293"

PV = "1.0+git${SRCREV}"

S = "${WORKDIR}/git"

DEPENDS += "python3-pip-native"

do_configure() {
    ${PYTHON}  ${S}/setup.py bdist_wheel
}

do_install() {
  install -d ${D}${PYTHON_SITEPACKAGES_DIR}
  cp ${S}/dist/OpenOligo-0.1.8-py3-none-any.whl ${D}${PYTHON_SITEPACKAGES_DIR}
  cd ${D}${PYTHON_SITEPACKAGES_DIR}
  ${PYTHON} -m pip install OpenOligo-0.1.8-py3-none-any.whl --no-deps --prefix=${D}${PYTHON_SITEPACKAGES_DIR}
}

FILES_${PN} += " \
    ${PYTHON_SITEPACKAGES_DIR}/ \
"


