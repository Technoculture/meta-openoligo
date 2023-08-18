
SUMMARY = "The next generation HTTP client."
HOMEPAGE = ""
AUTHOR = " <Tom Christie <tom@tomchristie.com>>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=c624803bdf6fc1c4ce39f5ae11d7bd05"

SRC_URI = "https://files.pythonhosted.org/packages/f8/2a/114d454cb77657dbf6a293e69390b96318930ace9cd96b51b99682493276/httpx-0.24.1.tar.gz"
SRC_URI[md5sum] = "e4ef137ab868b760dc87b59e1761dc41"
SRC_URI[sha256sum] = "5853a43053df830c20f8110c5e69fe44d035d850b2dfe795e196f00fdb774bdd"

S = "${WORKDIR}/httpx-0.24.1"

RDEPENDS_${PN} = "python-certifi python-httpcore python-idna python-sniffio"

inherit setuptools3
