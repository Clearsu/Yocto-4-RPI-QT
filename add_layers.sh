#!/bin/bash

bitbake-layers add-layer ../meta-raspberrypi
bitbake-layers add-layer ../meta-customimage
bitbake-layers add-layer ../meta-qt6
bitbake-layers add-layer ../meta-qttest
bitbake-layers add-layer ../meta-openembedded/meta-oe

