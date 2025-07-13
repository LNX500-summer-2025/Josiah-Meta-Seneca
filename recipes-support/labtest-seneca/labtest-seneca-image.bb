SUMMARY = "Simple C++ program using Makefile"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/LNX500-summer-2025/josiahLNX500-test.git;protocol=https;branch=LAB_TEST"
SRCREV = "${AUTOREV}"


S = "${WORKDIR}/git"

do_compile() {
    oe_runmake
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/build/simple-library ${D}${bindir}
}

FILES:${PN} += "${bindir}/simple-library ${bindir}/simple-library-test"
