DESCRIPTION = "Reusable constraint types to use with typing.Annotated"
HOMEPAGE = ""
AUTHOR = "Samuel Colvin <s@muelcolvin.com>, Adrian Garcia Badaracco <1755071+adriangb@users.noreply.github.com>, Zac Hatfield-Dodds <zac@zhd.dev>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c6afb13fdc220497ee5cded1e717ed67"

SRC_URI = "https://files.pythonhosted.org/packages/42/97/41ccb6acac36fdd13592a686a21b311418f786f519e5794b957afbcea938/annotated_types-0.5.0.tar.gz"
SRC_URI[md5sum] = "45a0d68f2cb300d45126622d2724b78a"
SRC_URI[sha256sum] = "47cdc3490d9ac1506ce92c7aaa76c579dc3509ff11e098fc867e5130ab7be802"

S = "${WORKDIR}/annotated_types-0.5.0"

RDEPENDS_${PN} = ""

inherit pypi setuptools3

PYPI_PACKAGE = "annotated_types"

do_compile() {
    poetry build

}

do_compile() {
    # Use system Poetry to install the package
    ${SYSTEM_POETRY_BINARY} install --no-dev --no-root --extras "" --target=${D}${PYTHON_SITEPACKAGES_DIR}
}

SYSTEM_POETRY_BINARY = "/home/dell/.local/bin/poetry"
EXTRAENV += "PATH=${PATH}:/home/dell/.local/bin"


