
SUMMARY = "Simple module to parse ISO 8601 dates"
HOMEPAGE = "https://github.com/micktwomey/pyiso8601"
AUTHOR = "Michael Twomey <mick@twomeylee.name>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aab31f2ef7ba214a5a341eaa47a7f367"

SRC_URI = "https://files.pythonhosted.org/packages/27/23/97cd1cb5792ece594ec5cf16cc4921f91838c689c82c8078ee442751f8dc/iso8601-2.0.0.tar.gz"
SRC_URI[md5sum] = "4b6b6c90a17845c03e99efbefea834d0"
SRC_URI[sha256sum] = "739960d37c74c77bd9bd546a76562ccb581fe3d4820ff5c3141eb49c839fda8f"

S = "${WORKDIR}/iso8601-2.0.0"

RDEPENDS_${PN} = ""

inherit pypi python_poetry_core
