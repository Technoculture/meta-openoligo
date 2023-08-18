
SUMMARY = "Read key-value pairs from a .env file and set them as environment variables"
HOMEPAGE = "https://github.com/theskumar/python-dotenv"
AUTHOR = "Saurabh Kumar <me+github@saurabh-kumar.com>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e914cdb773ae44a732b392532d88f072"

SRC_URI = "https://files.pythonhosted.org/packages/31/06/1ef763af20d0572c032fa22882cfbfb005fba6e7300715a37840858c919e/python-dotenv-1.0.0.tar.gz"
SRC_URI[md5sum] = "47129adbbaf20422e8d19fe99d74be33"
SRC_URI[sha256sum] = "a8df96034aae6d2d50a4ebe8216326c61c3eb64836776504fcca410e5937a3ba"

S = "${WORKDIR}/python-dotenv-1.0.0"

RDEPENDS_${PN} = ""

inherit setuptools3
