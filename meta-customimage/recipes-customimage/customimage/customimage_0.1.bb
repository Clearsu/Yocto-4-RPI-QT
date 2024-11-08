SUMMARY = "Custom image with RaspberryPi4b and Qt6"
DESCRIPTION = "Custom image for SEA-ME DES module"
LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL += "\
	qtbase \
	qtdeclarative \
	qttools \
	qttest \
	xcb-util-cursor \
"
