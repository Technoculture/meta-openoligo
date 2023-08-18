
SUMMARY = "A simple program and library to auto generate API documentation for Python modules."
HOMEPAGE = ""
AUTHOR = "Timothy Crosley <timothy.crosley@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=76b5c9e9b1c6aa0b9bdfbd1008bad49e"

SRC_URI = "https://files.pythonhosted.org/packages/80/55/2aca02c7015f52e30fb7ce920b967276c1a4198812db703e322a0ed43390/pdocs-1.2.0.tar.gz"
SRC_URI[md5sum] = "4269c9eba0481f737131f546817abf1e"
SRC_URI[sha256sum] = "996ad4d5039b59a9a112d29abfb3995ec4ed8d8415ddce6947c3a5248adb428b"

S = "${WORKDIR}/pdocs-1.2.0"

RDEPENDS_${PN} = "python-markdown python-mako python-hug python-docstring-parser"

inherit setuptools3
