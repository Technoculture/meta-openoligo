
SUMMARY = "A super-fast templating language that borrows the best ideas from the existing templating languages."
HOMEPAGE = "https://www.makotemplates.org/"
AUTHOR = "Mike Bayer <mike@zzzcomputing.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ad08dd28df88e64b35bcac27c822ee34"

SRC_URI = "https://files.pythonhosted.org/packages/05/5f/2ba6e026d33a0e6ddc1dddf9958677f76f5f80c236bd65309d280b166d3e/Mako-1.2.4.tar.gz"
SRC_URI[md5sum] = "651f365616611fcd4f2702a9002e2195"
SRC_URI[sha256sum] = "d60a3903dc3bb01a18ad6a89cdbe2e4eadc69c0bc8ef1e3773ba53d44c3f7a34"

S = "${WORKDIR}/Mako-1.2.4"

RDEPENDS_${PN} = ""

inherit setuptools3
