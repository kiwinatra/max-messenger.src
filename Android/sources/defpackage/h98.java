package defpackage;

/* renamed from: h98  reason: default package */
public enum h98 {
    LOGIN("LOGIN"),
    RECOVERY("RECOVERY"),
    PHONE_BINDING("PHONE_BINDING"),
    PHONE_CONFIRM("PHONE_CONFIRM");
    
    public final String a;

    /* access modifiers changed from: public */
    h98(String str) {
        this.a = str;
    }

    public final String toString() {
        return wj6.n(new StringBuilder("{value='"), this.a, "'}");
    }
}
