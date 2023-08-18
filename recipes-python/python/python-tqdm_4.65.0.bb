
SUMMARY = "Fast, Extensible Progress Meter"
HOMEPAGE = "https://tqdm.github.io"
AUTHOR = " <>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=11d25fcf36b46ad8183211310c7fc465"

SRC_URI = "https://files.pythonhosted.org/packages/3d/78/81191f56abb7d3d56963337dbdff6aa4f55805c8afd8bad64b0a34199e9b/tqdm-4.65.0.tar.gz"
SRC_URI[md5sum] = "a6f3177ac10c0c6e3f5e972852154146"
SRC_URI[sha256sum] = "1871fb68a86b8fb3b59ca4cdd3dcccbc7e6d613eeed31f4c332531977b89beb5"

S = "${WORKDIR}/tqdm-4.65.0"

RDEPENDS_${PN} = ""

inherit setuptools3
