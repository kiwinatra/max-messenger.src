package defpackage;

/* renamed from: lc3  reason: default package */
public final class lc3 extends RuntimeException {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lc3(String str, int i) {
        super(str);
        this.a = i;
    }

    public synchronized Throwable fillInStackTrace() {
        switch (this.a) {
            case 0:
                synchronized (this) {
                }
                return this;
            default:
                return super.fillInStackTrace();
        }
    }
}
