SUMMARY = "Qt test recipe"
DESCRIPTION = "Qt test recipe"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://CMakeLists.txt \
           file://main.cpp \
           file://ApplicationFlow.qml \
           file://ApplicationFlowForm.ui.qml \
           file://Brewing.qml \
           file://BrewingForm.ui.qml \
           file://ChoosingCoffee.ui.qml \
           file://CoffeeButton.qml \
           file://CupForm.ui.qml \
           file://EmptyCupForm.ui.qml \
           file://NavigationButton.ui.qml \
           file://SideBar.qml \
           file://SideBarForm.ui.qml \
           file://images/cup_structure/coffee_cup_large.png \
           file://images/cup_structure/coffee_cup_outline.png \
           file://images/cup_structure/cup_elements/coffee_cup_back.png \
           file://images/cup_structure/cup_elements/coffee_cup_coverplate.png \
           file://images/cup_structure/cup_elements/coffee_cup_front.png \
           file://images/cup_structure/liquids/liquid_coffee.png \
           file://images/cup_structure/liquids/liquid_foam.png \
           file://images/cup_structure/liquids/liquid_milk.png \
           file://images/icons/coffees/Americano.png \
           file://images/icons/coffees/Espresso.png \
           file://images/icons/coffees/Latte.png \
           file://images/icons/coffees/Macchiato.png \
           file://images/icons/coffees/cappucino.png \
           file://images/icons/contents/coffee.png \
           file://images/icons/contents/milk.png \
           file://images/icons/contents/sugar.png \
           file://images/ui_controls/buttons/back/white.png \
           file://images/ui_controls/buttons/go/white.png \
           file://images/ui_controls/line.png \
           file://imports/Coffee/Constants.qml \
           file://imports/Coffee/TitilliumWeb-Regular.ttf \
           file://imports/Coffee/qmldir \
           file://main.qml \
           file://qtquickcontrols2.conf"

S = "${WORKDIR}"

inherit qt6-cmake

DEPENDS += "qtbase qtdeclarative"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${B}/coffee ${D}${bindir}
}

