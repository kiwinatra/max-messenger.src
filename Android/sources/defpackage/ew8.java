package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: ew8  reason: default package */
public final class ew8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ er7 b;
    public final /* synthetic */ nv8 c;
    public final /* synthetic */ Collection o;
    public final /* synthetic */ gw8 v;

    public /* synthetic */ ew8(gw8 gw8, er7 er7, nv8 nv8, ArrayList arrayList, int i) {
        this.a = i;
        this.v = gw8;
        this.b = er7;
        this.c = nv8;
        this.o = arrayList;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.P(this.v, this.c, (ArrayList) this.o);
                return;
            default:
                this.b.P(this.v, this.c, (ArrayList) this.o);
                return;
        }
    }
}
