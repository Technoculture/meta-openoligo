
SUMMARY = "Python port of markdown-it. Markdown parsing, done right!"
HOMEPAGE = "None"
AUTHOR = "None <Chris Sewell <chrisj_sewell@hotmail.com>>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a38a1697260a7ad7bf29f44b362db1fc"

SRC_URI = "https://files.pythonhosted.org/packages/38/71/3b932df36c1a044d397a1f92d1cf91ee0a503d91e470cbd670aa66b07ed0/markdown-it-py-3.0.0.tar.gz"
SRC_URI[md5sum] = "a00d59ed2704f6590fdde0e9bad04c7c"
SRC_URI[sha256sum] = "e3f60a94fa066dc52ec76661e37c851cb232d92f9886b15cb560aaada2df8feb"

S = "${WORKDIR}/markdown-it-py-3.0.0"

RDEPENDS_${PN} = "python-mdurl"

inherit setuptools3
