SUMMARY = "Instrument Cluster Recipe"
DESCRIPTION = "SEA:ME DES02 Instrument Cluster application recipe"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://github.com/FALCON-RACER/DES_Instrument-Cluster.git"
SRC_URI[sha256sum] = "e586e2c365c6f3b435aa5b79dccf3836c4b53d7c0ea1467a12c8a7ce57698dd4"

S = "${WORKDIR}/git/instrument_cluster"

inherit qt6-cmake

DEPENDS +=" \
	qtbase \
	qtdeclarative \
	qtquick3d \
	qtquicktimeline \
	qtserialbus \
	qtremoteobjects \
	qtscxml \
	qtwayland \
	qttools \
"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${B}/instrument_cluster ${D}${bindir}
}

