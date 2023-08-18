
SUMMARY = "A pure-Python, bring-your-own-I/O implementation of HTTP/1.1"
HOMEPAGE = "https://github.com/python-hyper/h11"
AUTHOR = "Nathaniel J. Smith <njs@pobox.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f5501d19c3116f4aaeef89369f458693"

SRC_URI = "https://files.pythonhosted.org/packages/f5/38/3af3d3633a34a3316095b39c8e8fb4853a28a536e55d347bd8d8e9a14b03/h11-0.14.0.tar.gz"
SRC_URI[md5sum] = "84c33fc0aa1f868928114c4d02c43dc2"
SRC_URI[sha256sum] = "8f19fbbe99e72420ff35c00b27a34cb9937e902a8b810e2c88300c6f0a3b699d"

S = "${WORKDIR}/h11-0.14.0"

RDEPENDS_${PN} = ""

inherit setuptools3
