
SUMMARY = "Dictdiffer is a library that helps you to diff and patch dictionaries."
HOMEPAGE = "https://github.com/inveniosoftware/dictdiffer"
AUTHOR = "Invenio Collaboration <info@inveniosoftware.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5319f20678c5972ead78588780fbd47a"

SRC_URI = "https://files.pythonhosted.org/packages/61/7b/35cbccb7effc5d7e40f4c55e2b79399e1853041997fcda15c9ff160abba0/dictdiffer-0.9.0.tar.gz"
SRC_URI[md5sum] = "524b353b969300d4dc6aa6720c953657"
SRC_URI[sha256sum] = "17bacf5fbfe613ccf1b6d512bd766e6b21fb798822a133aa86098b8ac9997578"

S = "${WORKDIR}/dictdiffer-0.9.0"

RDEPENDS_${PN} = ""

inherit pypi setuptools3
PYPI_PACKAGE = "dictdiffer"

DEPENDS += "python3-pip-native"

do_configure() {
    ${PYTHON}  ${S}/setup.py bdist_wheel
}
