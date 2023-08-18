
SUMMARY = "Style preserving TOML library"
HOMEPAGE = "https://github.com/sdispater/tomlkit"
AUTHOR = "Sébastien Eustace <sebastien@eustace.io>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=31aac0dbc1babd278d5386dadb7f8e82"

SRC_URI = "https://files.pythonhosted.org/packages/10/37/dd53019ccb72ef7d73fff0bee9e20b16faff9658b47913a35d79e89978af/tomlkit-0.11.8.tar.gz"
SRC_URI[md5sum] = "6caa167afece01b0a426ecec4197e3c1"
SRC_URI[sha256sum] = "9330fc7faa1db67b541b28e62018c17d20be733177d290a13b24c62d1614e0c3"

S = "${WORKDIR}/tomlkit-0.11.8"

RDEPENDS_${PN} = ""

inherit setuptools3
