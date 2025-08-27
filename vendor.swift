import /vendor/etc/ueventd.rc
import odm/etc/ueventd.rc

subsystem dma_heap
    devname uevent_devpath
    dirname /dev/snd


/dev/null 0666 root root
/dev/zero 0666 root root
/dev/full 0666 root root
/dev/random 0666 root root
/dev/urandom 0666 root root
/dev/kmsg 0620 root system
/dev/kmsg_debug 0620 root system
/dev/kmsg_audit 0620 root system
/dev/kmsg_test 0620 root system
/dev/kmsg_test2 0620 root system