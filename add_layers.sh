#!/bin/bash

bitbake-layers add-layer ../meta-openembedded/meta-oe
bitbake-layers add-layer ../meta-qt6
bitbake-layers add-layer ../meta-raspberrypi
bitbake-layers add-layer ../meta-instrument-cluster
bitbake-layers add-layer ../meta-custom-image

