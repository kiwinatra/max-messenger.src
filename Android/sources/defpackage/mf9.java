package defpackage;

/* renamed from: mf9  reason: default package */
public enum mf9 {
    UNKNOWN("UNKNOWN"),
    USER("USER"),
    GROUP("GROUP"),
    CHANNEL("CHANNEL"),
    CHANNEL_ADMIN("CHANNEL_ADMIN");
    
    public final String a;

    /* access modifiers changed from: public */
    mf9(String str) {
        this.a = str;
    }

    public final String toString() {
        return wj6.n(new StringBuilder("{value='"), this.a, "'}");
    }
}
