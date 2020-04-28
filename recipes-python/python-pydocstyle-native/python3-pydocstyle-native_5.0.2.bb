SUMMARY = "docstring style checker"
HOMEPAGE = "https://github.com/PyCQA/pydocstyle/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=6a43617fba5e0cbfca6820bd2b8d16b9"

DEPENDS += "${PYTHON_PN}-snowballstemmer-native"

SRC_URI = "git://github.com/PyCQA/pydocstyle.git;protocol=https"
SRCREV = "59396eb50d1d1a59fdccdd71cf4031577c02ab54"

S = "${WORKDIR}/git"

inherit native
inherit setuptools3
