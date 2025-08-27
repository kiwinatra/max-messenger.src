package defpackage;

import android.util.Pair;

/* renamed from: d09  reason: default package */
public final /* synthetic */ class d09 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wsb b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ l28 o;
    public final /* synthetic */ es8 v;

    public /* synthetic */ d09(wsb wsb, Pair pair, l28 l28, es8 es8, int i) {
        this.a = i;
        this.b = wsb;
        this.c = pair;
        this.o = l28;
        this.v = es8;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                Pair pair = this.c;
                ((wb4) ((j09) this.b.b).j).s(((Integer) pair.first).intValue(), (nz8) pair.second, this.o, this.v);
                return;
            case 1:
                Pair pair2 = this.c;
                ((wb4) ((j09) this.b.b).j).A(((Integer) pair2.first).intValue(), (nz8) pair2.second, this.o, this.v);
                return;
            default:
                Pair pair3 = this.c;
                ((wb4) ((j09) this.b.b).j).v(((Integer) pair3.first).intValue(), (nz8) pair3.second, this.o, this.v);
                return;
        }
    }
}
