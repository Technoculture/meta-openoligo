
SUMMARY = "Easy async ORM for python, built with relations in mind"
HOMEPAGE = "https://github.com/tortoise/tortoise-orm"
AUTHOR = "Andrey Bondar <andrey@bondar.ru>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b29ad1304a66a532e8ceb55165cd212c"

SRC_URI = "https://files.pythonhosted.org/packages/8a/47/4369c766243067776b4899b1041281d0fc2452b67a0d5a4b7ac72f3e962f/tortoise_orm-0.19.3.tar.gz"
SRC_URI[md5sum] = "a060189ed4c661e012f07e828e2ce63b"
SRC_URI[sha256sum] = "ca574bca5191f55608f9013314b1f5d1c6ffd4165a1fcc2f60f6c902f529b3b6"

S = "${WORKDIR}/tortoise_orm-0.19.3"

RDEPENDS_${PN} = "python-aiosqlite python-iso8601 python-pypika-tortoise python-pytz"

inherit setuptools3
