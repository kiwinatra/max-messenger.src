package defpackage;

/* renamed from: vv0  reason: default package */
public enum vv0 {
    DEFAULT("DEFAULT"),
    POSITIVE("POSITIVE"),
    NEGATIVE("NEGATIVE"),
    UNKNOWN("UNKNOWN");
    
    public static final vv0[] w = null;
    public final String a;

    static {
        w = values();
    }

    /* access modifiers changed from: public */
    vv0(String str) {
        this.a = str;
    }

    public final String toString() {
        return wj6.n(new StringBuilder("{value='"), this.a, "'}");
    }
}
