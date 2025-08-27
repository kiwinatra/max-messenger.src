package defpackage;

/* renamed from: e70  reason: default package */
public final /* synthetic */ class e70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p7d b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ e70(p7d p7d, Exception exc, int i) {
        this.a = i;
        this.b = p7d;
        this.c = exc;
    }

    public final void run() {
        Exception exc = this.c;
        p7d p7d = this.b;
        int i = this.a;
        p7d.getClass();
        switch (i) {
            case 0:
                int i2 = v0g.a;
                wb4 wb4 = ((nc5) p7d.c).a.A0;
                td J = wb4.J();
                wb4.K(J, 1029, new nb4(4, J, exc));
                return;
            default:
                int i3 = v0g.a;
                wb4 wb42 = ((nc5) p7d.c).a.A0;
                td J2 = wb42.J();
                wb42.K(J2, 1014, new nb4(8, J2, exc));
                return;
        }
    }
}
