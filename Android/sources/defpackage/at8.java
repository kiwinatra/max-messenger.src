package defpackage;

import android.os.Bundle;

/* renamed from: at8  reason: default package */
public final /* synthetic */ class at8 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ef b;
    public final /* synthetic */ qo8 c;
    public final /* synthetic */ String o;
    public final /* synthetic */ Bundle v;

    public /* synthetic */ at8(ef efVar, qo8 qo8, String str, Bundle bundle) {
        this.b = efVar;
        this.c = qo8;
        this.o = str;
        this.v = bundle;
    }

    public final void run() {
        String str;
        yvd yvd;
        switch (this.a) {
            case 0:
                ef efVar = this.b;
                ((zs8) efVar.d).getClass();
                ((oc4) efVar.g).execute(new at8(efVar, this.c, this.o, this.v));
                return;
            default:
                this.b.getClass();
                qo8 qo8 = this.c;
                qo8.I0();
                po8 po8 = qo8.c;
                wvf m = (!po8.isConnected() ? zvd.b : po8.B0()).a.iterator();
                while (true) {
                    boolean hasNext = m.hasNext();
                    str = this.o;
                    if (hasNext) {
                        yvd = (yvd) m.next();
                        if (yvd.a != 0 || !yvd.b.equals(str)) {
                        }
                    } else {
                        yvd = null;
                    }
                }
                if (yvd != null) {
                    qo8.I0();
                    zvd B0 = !po8.isConnected() ? zvd.b : po8.B0();
                    B0.getClass();
                    if (B0.a.contains(yvd)) {
                        yvd yvd2 = new yvd(str, this.v);
                        Bundle bundle = Bundle.EMPTY;
                        qo8.I0();
                        zz7 D0 = po8.isConnected() ? po8.D0(yvd2, bundle) : o5a.F(new swd(-100));
                        D0.d(new uj6(0, D0, new y35(27, (Object) str)), dp4.a);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ at8(ef efVar, ex8 ex8, String str, Bundle bundle, qo8 qo8) {
        this.b = efVar;
        this.o = str;
        this.v = bundle;
        this.c = qo8;
    }
}
