package defpackage;

/* renamed from: ff4  reason: default package */
public abstract class ff4 {
    public static final vk4 a;

    static {
        String str;
        vk4 vk4;
        int i = z7f.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (!(str != null ? Boolean.parseBoolean(str) : false)) {
            vk4 = ef4.z;
        } else {
            bi4 bi4 = dq4.a;
            gc8 gc8 = lc8.a;
            vk4 = ((gc8.t0() instanceof ks9) || !(gc8 instanceof vk4)) ? ef4.z : (vk4) gc8;
        }
        a = vk4;
    }
}
