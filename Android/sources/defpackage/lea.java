package defpackage;

/* renamed from: lea  reason: default package */
public enum lea {
    ;

    public static boolean a(cla cla, Object obj) {
        if (obj == a) {
            cla.b();
            return true;
        } else if (obj instanceof jea) {
            cla.onError(((jea) obj).a);
            return true;
        } else {
            cla.d(obj);
            return false;
        }
    }

    public static boolean b(cla cla, Object obj) {
        if (obj == a) {
            cla.b();
            return true;
        } else if (obj instanceof jea) {
            cla.onError(((jea) obj).a);
            return true;
        } else if (obj instanceof iea) {
            cla.c(((iea) obj).a);
            return false;
        } else {
            cla.d(obj);
            return false;
        }
    }

    public final String toString() {
        return "NotificationLite.Complete";
    }
}
