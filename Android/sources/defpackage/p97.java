package defpackage;

/* renamed from: p97  reason: default package */
public final /* synthetic */ class p97 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r97 b;

    public /* synthetic */ p97(r97 r97, int i) {
        this.a = i;
        this.b = r97;
    }

    public final void run() {
        int i = this.a;
        r97 r97 = this.b;
        switch (i) {
            case 0:
                r97.a();
                return;
            default:
                r97.b();
                return;
        }
    }
}
