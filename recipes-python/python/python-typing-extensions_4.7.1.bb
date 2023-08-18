
SUMMARY = "Backported and Experimental Type Hints for Python 3.7+"
HOMEPAGE = ""
AUTHOR = " <"Guido van Rossum, Jukka Lehtosalo, Łukasz Langa, Michael Lee" <levkivskyi@gmail.com>>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fcf6b249c2641540219a727f35d8d2c2"

SRC_URI = "https://files.pythonhosted.org/packages/3c/8b/0111dd7d6c1478bf83baa1cab85c686426c7a6274119aceb2bd9d35395ad/typing_extensions-4.7.1.tar.gz"
SRC_URI[md5sum] = "06e7fff4b1d51f8dc6f49b16e71de54e"
SRC_URI[sha256sum] = "b75ddc264f0ba5615db7ba217daeb99701ad295353c45f9e95963337ceeeffb2"

S = "${WORKDIR}/typing_extensions-4.7.1"

RDEPENDS_${PN} = ""

inherit setuptools3
