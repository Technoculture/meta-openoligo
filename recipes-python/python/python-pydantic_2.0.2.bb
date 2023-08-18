
SUMMARY = "Data validation using Python type hints"
HOMEPAGE = ""
AUTHOR = " <Samuel Colvin <s@muelcolvin.com>, Eric Jolibois <em.jolibois@gmail.com>, Hasan Ramezani <hasan.r67@gmail.com>, Adrian Garcia Badaracco <1755071+adriangb@users.noreply.github.com>, Terrence Dorsey <terry@pydantic.dev>, David Montague <david@pydantic.dev>>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=09280955509d1c4ca14bae02f21d49a6"

SRC_URI = "https://files.pythonhosted.org/packages/3c/39/e526f3ca06e062e0ad773555f5349ff5d9ed50bfa62c45df8e74fff9ff14/pydantic-2.0.2.tar.gz"
SRC_URI[md5sum] = "45364b70d19c9c14921454ffb8cc4166"
SRC_URI[sha256sum] = "b802f5245b8576315fe619e5989fd083448fa1258638ef9dac301ca60878396d"

S = "${WORKDIR}/pydantic-2.0.2"

RDEPENDS_${PN} = "python-annotated-types python-pydantic-core python-typing-extensions"

inherit setuptools3
