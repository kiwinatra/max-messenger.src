package defpackage;

/* renamed from: c0h  reason: default package */
public final class c0h implements y1h {
    public static final c0h b = new c0h(0);
    public final /* synthetic */ int a;

    public /* synthetic */ c0h(int i) {
        this.a = i;
    }

    public final j2h a(Class cls) {
        switch (this.a) {
            case 0:
                Class<p0h> cls2 = p0h.class;
                if (cls2.isAssignableFrom(cls)) {
                    try {
                        return (j2h) p0h.e(cls.asSubclass(cls2)).m(3);
                    } catch (Exception e) {
                        throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                    }
                } else {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return p0h.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
