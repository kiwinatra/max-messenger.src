package defpackage;

/* renamed from: a0h  reason: default package */
public enum a0h {
    DOUBLE_LIST_PACKED(35, 3, r47),
    SINT64_LIST_PACKED(48, 3, r60);
    
    public static final a0h[] o = null;
    public final int a;

    static {
        o = new a0h[r1];
        for (a0h a0h : values()) {
            o[a0h.a] = a0h;
        }
    }

    /* access modifiers changed from: public */
    a0h(int i, int i2, a1h a1h) {
        this.a = i;
        int i3 = i2 - 1;
        if (i3 == 1) {
            a1h.getClass();
        } else if (i3 == 3) {
            a1h.getClass();
        }
        if (i2 == 1) {
            a1h a1h2 = a1h.VOID;
            a1h.ordinal();
        }
    }

    public final int a() {
        return this.a;
    }
}
