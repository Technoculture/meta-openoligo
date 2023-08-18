
SUMMARY = "The little ASGI library that shines."
HOMEPAGE = ""
AUTHOR = " <Tom Christie <tom@tomchristie.com>>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=11e8c8dbfd5fa373c703de492140ff7a"

SRC_URI = "https://files.pythonhosted.org/packages/f2/7b/05e2ddc8d0da28c3c916d637cfe509d16e7a2e2cf7faa7cb888446326a30/starlette-0.28.0.tar.gz"
SRC_URI[md5sum] = "730531bd248e21fc9e9243367900bc07"
SRC_URI[sha256sum] = "7bf3da5e997e796cc202cef2bd3f96a7d9b1e1943203c2fe2b42e020bc658482"

S = "${WORKDIR}/starlette-0.28.0"

RDEPENDS_${PN} = "python-anyio"

inherit setuptools3
