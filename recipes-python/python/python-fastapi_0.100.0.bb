
SUMMARY = "FastAPI framework, high performance, easy to learn, fast to code, ready for production"
HOMEPAGE = ""
AUTHOR = " <Sebastián Ramírez <tiangolo@gmail.com>>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=95792ff3fe8e11aa49ceb247e66e4810"

SRC_URI = "https://files.pythonhosted.org/packages/65/e0/f9d77b3a1569e2217abf260b0b1462401736973d1c5d3d335f6f2009daa2/fastapi-0.100.0.tar.gz"
SRC_URI[md5sum] = "7be7265419e17e99f464a692bd3f945f"
SRC_URI[sha256sum] = "acb5f941ea8215663283c10018323ba7ea737c571b67fc7e88e9469c7eb1d12e"

S = "${WORKDIR}/fastapi-0.100.0"

RDEPENDS_${PN} = "python-pydantic python-starlette python-typing-extensions"

inherit setuptools3
