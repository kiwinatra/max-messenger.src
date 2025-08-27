package defpackage;

/* renamed from: kl2  reason: default package */
public enum kl2 {
    SOUND("SOUND"),
    VIBRATION("VIBR"),
    LED("LED");
    
    public static final int v = 0;
    public final String a;

    static {
        v = values().length;
    }

    /* access modifiers changed from: public */
    kl2(String str) {
        this.a = str;
    }

    public final String toString() {
        return wj6.n(new StringBuilder("{value='"), this.a, "'}");
    }
}
