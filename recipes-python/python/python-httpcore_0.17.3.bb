
SUMMARY = "A minimal low-level HTTP client."
HOMEPAGE = "https://github.com/encode/httpcore"
AUTHOR = "Tom Christie <tom@tomchristie.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=1c1f23b073da202e1f4f9e426490210c"

SRC_URI = "https://files.pythonhosted.org/packages/63/ad/c98ecdbfe04417e71e143bf2f2fb29128e4787d78d1cedba21bd250c7e7a/httpcore-0.17.3.tar.gz"
SRC_URI[md5sum] = "1485d26994074d33b8ee753e2864f908"
SRC_URI[sha256sum] = "a6f30213335e34c1ade7be6ec7c47f19f50c56db36abef1a9dfa3815b1cb3888"

S = "${WORKDIR}/httpcore-0.17.3"

RDEPENDS_${PN} = "python-h11 python-sniffio python-anyio python-certifi"

inherit setuptools3
