package defpackage;

import android.util.Pair;

/* renamed from: b09  reason: default package */
public final /* synthetic */ class b09 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wsb b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ es8 o;

    public /* synthetic */ b09(wsb wsb, Pair pair, es8 es8, int i) {
        this.a = i;
        this.b = wsb;
        this.c = pair;
        this.o = es8;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                Pair pair = this.c;
                int intValue = ((Integer) pair.first).intValue();
                nz8 nz8 = (nz8) pair.second;
                nz8.getClass();
                ((wb4) ((j09) this.b.b).j).C(intValue, nz8, this.o);
                return;
            default:
                Pair pair2 = this.c;
                ((wb4) ((j09) this.b.b).j).G(((Integer) pair2.first).intValue(), (nz8) pair2.second, this.o);
                return;
        }
    }
}
