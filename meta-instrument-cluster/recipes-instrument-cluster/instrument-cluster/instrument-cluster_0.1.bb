SUMMARY = "Instrument Cluster Recipe"
DESCRIPTION = "SEA:ME DES02 Instrument Cluster application recipe"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://github.com/FALCON-RACER/DES_Instrument-Cluster.git"
SRC_URI[sha256sum] = "a1de2a0485b8387b4125f1114a2bbc684c07bdc093d933ed5b0e9c06bbaa5bc4"

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

