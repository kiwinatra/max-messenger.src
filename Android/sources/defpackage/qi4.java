package defpackage;

/* renamed from: qi4  reason: default package */
public final /* synthetic */ class qi4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ do1 b;

    public /* synthetic */ qi4(do1 do1, int i) {
        this.a = i;
        this.b = do1;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
                return;
            default:
                this.b.b((Object) null);
                return;
        }
    }
}
