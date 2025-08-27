package defpackage;

import java.util.ArrayList;

/* renamed from: oge  reason: default package */
public final /* synthetic */ class oge implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tge b;
    public final /* synthetic */ qge c;

    public /* synthetic */ oge(tge tge, qge qge, int i) {
        this.a = i;
        this.b = tge;
        this.c = qge;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                tge tge = this.b;
                ArrayList arrayList = tge.b;
                qge qge = this.c;
                if (arrayList.contains(qge)) {
                    rae.a(qge.a, qge.c.S0, tge.a);
                    return;
                }
                return;
            default:
                tge tge2 = this.b;
                ArrayList arrayList2 = tge2.b;
                qge qge2 = this.c;
                arrayList2.remove(qge2);
                tge2.c.remove(qge2);
                return;
        }
    }
}
