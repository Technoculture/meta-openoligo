
SUMMARY = "Typing stubs for tqdm"
HOMEPAGE = "https://github.com/python/typeshed"
AUTHOR = " <>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://setup.py;md5=f2aa5f077fd13db4794437ff006bb6fd"

SRC_URI = "https://files.pythonhosted.org/packages/52/03/69d62641581dce114c557588758da417a178c8cf08016ece1dcbd0904edd/types-tqdm-4.65.0.1.tar.gz"
SRC_URI[md5sum] = "f36f5f42cfee65252148665e21403006"
SRC_URI[sha256sum] = "972dd871b6b2b8ff32f1f0f6fdfdf5a4ba2b0b848453689391bec8bd858fb1c4"

S = "${WORKDIR}/types-tqdm-4.65.0.1"

RDEPENDS_${PN} = ""

inherit setuptools3
