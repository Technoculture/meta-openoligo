
SUMMARY = "Sniff out which async library your code is running under"
HOMEPAGE = "https://github.com/python-trio/sniffio"
AUTHOR = "Nathaniel J. Smith <njs@pobox.com>"
LICENSE = ""
LIC_FILES_CHKSUM = "file://LICENSE.APACHE2;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://files.pythonhosted.org/packages/cd/50/d49c388cae4ec10e8109b1b833fd265511840706808576df3ada99ecb0ac/sniffio-1.3.0.tar.gz"
SRC_URI[md5sum] = "abb96bcda81817d6c632915c53ac29c8"
SRC_URI[sha256sum] = "e60305c5e5d314f5389259b7f22aaa33d8f7dee49763119234af3755c55b9101"

S = "${WORKDIR}/sniffio-1.3.0"

RDEPENDS_${PN} = ""

inherit setuptools3
