package defpackage;

import ru.ok.tamtam.util.HandledException;

/* renamed from: neb  reason: default package */
public final /* synthetic */ class neb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oeb b;

    public /* synthetic */ neb(oeb oeb, int i) {
        this.a = i;
        this.b = oeb;
    }

    public final void run() {
        oeb oeb = this.b;
        switch (this.a) {
            case 0:
                oeb.e();
                return;
            default:
                oeb.getClass();
                try {
                    oeb.e();
                    return;
                } catch (Exception e) {
                    z68.f("oeb", "syncInternal: exception", e);
                    ((uta) oeb.h).c(new HandledException(e), true);
                    return;
                }
        }
    }
}
