package defpackage;

/* renamed from: v0  reason: default package */
public final class v0 extends Throwable {
    public final /* synthetic */ int a;

    public /* synthetic */ v0() {
        this.a = 4;
    }

    public synchronized Throwable fillInStackTrace() {
        switch (this.a) {
            case 0:
                synchronized (this) {
                }
                return this;
            case 1:
                synchronized (this) {
                }
                return this;
            case 2:
                synchronized (this) {
                }
                return this;
            case 3:
                synchronized (this) {
                }
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(String str, int i) {
        super(str);
        this.a = i;
    }
}
