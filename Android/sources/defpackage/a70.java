package defpackage;

/* renamed from: a70  reason: default package */
public final /* synthetic */ class a70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p7d b;
    public final /* synthetic */ i70 c;

    public /* synthetic */ a70(p7d p7d, i70 i70, int i) {
        this.a = i;
        this.b = p7d;
        this.c = i70;
    }

    public final void run() {
        i70 i70 = this.c;
        p7d p7d = this.b;
        int i = this.a;
        p7d.getClass();
        switch (i) {
            case 0:
                int i2 = v0g.a;
                wb4 wb4 = ((nc5) p7d.c).a.A0;
                td J = wb4.J();
                wb4.K(J, 1032, new mb4(J, i70, 1));
                return;
            default:
                int i3 = v0g.a;
                wb4 wb42 = ((nc5) p7d.c).a.A0;
                td J2 = wb42.J();
                wb42.K(J2, 1031, new mb4(J2, i70, 0));
                return;
        }
    }
}
