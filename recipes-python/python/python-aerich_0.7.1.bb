
SUMMARY = "A database migrations tool for Tortoise ORM."
HOMEPAGE = "https://github.com/tortoise/aerich"
AUTHOR = "long2ice <long2ice@gmail.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4671a53ae013bd1a0ab08920c339c56"

SRC_URI = "https://files.pythonhosted.org/packages/2a/e0/865a5229cb804b9fa68e095c827dcd1c68d2a35413e813a89a8f0693a760/aerich-0.7.1.tar.gz"
SRC_URI[md5sum] = "9b0d064dbaa2d01df5a5bd1df6897f31"
SRC_URI[sha256sum] = "501f6598ae51e3ce19b1bfc21ff365f582e7447e6aa5215629451c40341d6eb8"

S = "${WORKDIR}/aerich-0.7.1"

RDEPENDS_${PN} = "python-click python-dictdiffer python-pydantic python-tomlkit python-tortoise-orm"

inherit setuptools3
