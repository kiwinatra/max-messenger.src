package defpackage;

/* renamed from: n9f  reason: default package */
public final class n9f extends RuntimeException {
    public final /* synthetic */ String a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n9f(String str, String str2) {
        super(str);
        this.a = str2;
    }

    public final String getLocalizedMessage() {
        return this.a;
    }
}
