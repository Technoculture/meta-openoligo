# The is automatic generated Code by "makePipRecipes.py"
# (build by Robin Sebastian (https://github.com/robseb) (git@robseb.de) Vers.: 1.2) 

SUMMARY = "Recipe to embedded the Python PiP Package hug"
HOMEPAGE ="https://pypi.org/project/hug"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=76238df88e30d561de27e47c85d6e7e1"

inherit pypi setuptools3
PYPI_PACKAGE = "hug"
SRC_URI[md5sum] = "3355631e28ccab572630277360a4a2c3"
SRC_URI[sha256sum] = "b0edace2acb618873779c9ce6ecf9165db54fef95c22262f5700fcdd9febaec9"

RDEPENDS_${PN} = "pytest-runner"

S = "${WORKDIR}/hug-2.6.1"
