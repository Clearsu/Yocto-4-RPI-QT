SUMMARY = "Instrument Cluster Recipe"
DESCRIPTION = "SEA:ME DES02 Instrument Cluster application recipe"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/FALCON-RACER/DES_Instrument-Cluster.git;protocol=https;branch=main"
SRCREV = "6b06b51373c7585fc14ffde7947d0b8858e11ff6"

S = "${WORKDIR}/git/instrument_cluster"

inherit qt6-cmake

DEPENDS +=" \
	i2c-tools \
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
    install -m 0755 ${B}/InstrumentCluster ${D}${bindir}
}

