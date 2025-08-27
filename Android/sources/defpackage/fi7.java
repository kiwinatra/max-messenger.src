package defpackage;

/* renamed from: fi7  reason: default package */
public final class fi7 implements k9c, hs7 {
    public final Object a;

    public fi7(Object obj) {
        this.a = obj;
    }

    public static fi7 a(Object obj) {
        if (obj != null) {
            return new fi7(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    public final Object get() {
        return this.a;
    }
}
