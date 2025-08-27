package defpackage;

/* renamed from: yae  reason: default package */
public final class yae extends Thread {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yae(int i, Object obj) {
        super("ExoPlayer:SimpleDecoder");
        this.a = i;
        this.b = obj;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ibe ibe = (ibe) this.b;
                ibe.getClass();
                do {
                    try {
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                } while (ibe.e());
                return;
            default:
                co0 co0 = (co0) this.b;
                co0.getClass();
                do {
                    try {
                    } catch (InterruptedException e2) {
                        throw new IllegalStateException(e2);
                    }
                } while (co0.j());
                return;
        }
    }
}
