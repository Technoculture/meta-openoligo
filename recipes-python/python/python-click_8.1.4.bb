
SUMMARY = "Composable command line interface toolkit"
HOMEPAGE = "https://palletsprojects.com/p/click/"
AUTHOR = " <>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=1fa98232fd645608937a0fdc82e999b8"

SRC_URI = "https://files.pythonhosted.org/packages/77/88/b0cc5fe95c31c301e9823ea9b028f669c0dcfa205ff71111037a5ed4892c/click-8.1.4.tar.gz"
SRC_URI[md5sum] = "d19686712c4a599bc8bf1f6f3ea7947d"
SRC_URI[sha256sum] = "b97d0c74955da062a7d4ef92fadb583806a585b2ea81958a81bd72726cbb8e37"

S = "${WORKDIR}/click-8.1.4"

RDEPENDS_${PN} = ""

inherit setuptools3
