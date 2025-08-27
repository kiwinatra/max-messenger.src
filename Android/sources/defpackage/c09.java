package defpackage;

import android.util.Pair;

/* renamed from: c09  reason: default package */
public final /* synthetic */ class c09 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wsb b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ c09(wsb wsb, Pair pair, int i) {
        this.a = i;
        this.b = wsb;
        this.c = pair;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                Pair pair = this.c;
                ((wb4) ((j09) this.b.b).j).B(((Integer) pair.first).intValue(), (nz8) pair.second);
                return;
            case 1:
                Pair pair2 = this.c;
                ((wb4) ((j09) this.b.b).j).E(((Integer) pair2.first).intValue(), (nz8) pair2.second);
                return;
            case 2:
                Pair pair3 = this.c;
                ((wb4) ((j09) this.b.b).j).F(((Integer) pair3.first).intValue(), (nz8) pair3.second);
                return;
            default:
                Pair pair4 = this.c;
                ((wb4) ((j09) this.b.b).j).D(((Integer) pair4.first).intValue(), (nz8) pair4.second);
                return;
        }
    }
}
