require u-boot-atmel.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://README;beginline=1;endline=22;md5=9915e8cb100eb5dbb366010a0f10296c"

SRCREV = "1e7d2e5973c1fb780e55e28a801c6c574158ac14"

PV = "v2018.07-at91+git${SRCPV}"

COMPATIBLE_MACHINE = '(sama5d3xek|sama5d3-xplained|sama5d3-xplained-sd|at91sam9x5ek|at91sam9rlek|at91sam9m10g45ek|sama5d4ek|sama5d4-xplained|sama5d4-xplained-sd|sama5d2-xplained|sama5d2-xplained-sd|sama5d2-xplained-emmc|sama5d2-ptc-ek|sama5d2-ptc-ek-sd|sama5d27-som1-ek|sama5d27-som1-ek-sd)'

UBRANCH = "u-boot-2018.07-at91"
SRC_URI = "git://github.com/linux4sam/u-boot-at91.git;protocol=https;branch=${UBRANCH}"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
