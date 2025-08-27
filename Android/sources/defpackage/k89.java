package defpackage;

/* renamed from: k89  reason: default package */
public final /* synthetic */ class k89 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p89 b;

    public /* synthetic */ k89(p89 p89, int i) {
        this.a = i;
        this.b = p89;
    }

    public final void run() {
        int i = this.a;
        p89 p89 = this.b;
        switch (i) {
            case 0:
                p89.setCornersForCollage(p89.x);
                return;
            default:
                p89.M();
                return;
        }
    }
}
