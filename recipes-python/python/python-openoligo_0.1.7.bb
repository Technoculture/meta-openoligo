
SUMMARY = "An open-source platform for programmatically interacting with and managing Nucleic acid sequences synthesis processes."
HOMEPAGE = ""
AUTHOR = "Satyam Tiwary <satyam@technoculture.io>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "https://files.pythonhosted.org/packages/d8/31/887a9ae7c497d79fbcc37f892b761e65583202cbc0e2a632429fab150d9d/openoligo-0.1.7.tar.gz"
SRC_URI[md5sum] = "d1c15426c4b75522906ccbe80cb34b12"
SRC_URI[sha256sum] = "501aae640225bdf147c76335d5f47d73ac9f847110dbd61c4ae91e24ce169aa5"

S = "${WORKDIR}/openoligo-0.1.7"

RDEPENDS_${PN} = "python-aerich python-anyio python-fastapi python-httpx python-pdocs python-python-dotenv python-rich python-sh python-tortoise-orm python-tqdm python-types-tqdm python-uvicorn"

inherit setuptools3
