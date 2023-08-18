SUMMARY = "Python subprocess replacement"
HOMEPAGE = "https://amoffat.github.io/sh/"
AUTHOR = "Andrew Moffat <arwmoffat@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=5317094292296f03405f59ae5f6544b6"

SRC_URI = "https://files.pythonhosted.org/packages/f3/54/ea1fe5ab317a4d942c71d80df534343cf148739f716ca6224ebcec83cb10/sh-2.0.4.tar.gz"
SRC_URI[md5sum] = "3e1f5c7a21458580840c9f5844a6011f"
SRC_URI[sha256sum] = "a18920f0839991bc9dfddb6dcc006c360b1064ba96257359f0ea356e9fa75a60"

S = "${WORKDIR}/sh-2.0.4"

PR = "r1"


DEPENDS += "python3-pip-native"

inherit pypi package

do_configure() {
    # We don't need to configure anything, so we can skip this step.
    :
}

do_compile() {
    # We don't need to compile anything, so we can skip this step.
    :
}



FILES_${PN} += "${PYTHON_SITEPACKAGES_DIR}/"


