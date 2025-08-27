package defpackage;

/* renamed from: wv0  reason: default package */
public enum wv0 {
    UNKNOWN("UNKNOWN");
    
    public static final wv0[] c = null;
    public final String a;

    static {
        c = values();
    }

    /* access modifiers changed from: public */
    wv0(String str) {
        this.a = str;
    }

    public final String toString() {
        return wj6.n(new StringBuilder("{value='"), this.a, "'}");
    }
}
