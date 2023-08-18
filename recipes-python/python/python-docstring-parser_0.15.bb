
SUMMARY = "Parse Python docstrings in reST, Google and Numpydoc format"
HOMEPAGE = "https://github.com/rr-/docstring_parser"
AUTHOR = "Marcin Kurczewski <dash@wind.garden>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=4014649477385d83f428a6adae447a49"

SRC_URI = "https://files.pythonhosted.org/packages/e8/2d/ea1dfc15b909cc660f657a3a9d698a2916b7f3b05535a2d72e8d7ea3ad5b/docstring_parser-0.15.tar.gz"
SRC_URI[md5sum] = "d2a30059fe0b6376d1964b6d9ffca35f"
SRC_URI[sha256sum] = "48ddc093e8b1865899956fcc03b03e66bb7240c310fac5af81814580c55bf682"

S = "${WORKDIR}/docstring_parser-0.15"

RDEPENDS_${PN} = ""

inherit setuptools3
