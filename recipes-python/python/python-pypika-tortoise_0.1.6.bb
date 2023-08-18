
SUMMARY = "Forked from pypika and streamline just for tortoise-orm"
HOMEPAGE = "https://github.com/tortoise/pypika-tortoise"
AUTHOR = "long2ice <long2ice@gmail.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "https://files.pythonhosted.org/packages/86/55/1bfd4150f664d2e07b36c8f442178cc1f717bb9ae6cae20f21e851c208c6/pypika-tortoise-0.1.6.tar.gz"
SRC_URI[md5sum] = "98c9677516f06f61f211f834d51949a6"
SRC_URI[sha256sum] = "d802868f479a708e3263724c7b5719a26ad79399b2a70cea065f4a4cadbebf36"

S = "${WORKDIR}/pypika-tortoise-0.1.6"

RDEPENDS_${PN} = ""

inherit setuptools3
