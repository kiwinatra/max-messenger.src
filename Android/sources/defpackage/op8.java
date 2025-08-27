package defpackage;

/* renamed from: op8  reason: default package */
public final /* synthetic */ class op8 implements i08 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ni3 b;

    public /* synthetic */ op8(ni3 ni3, int i) {
        this.a = i;
        this.b = ni3;
    }

    public final void invoke(Object obj) {
        sob sob = (sob) obj;
        switch (this.a) {
            case 0:
                sob.w(((ppb) this.b.a).o);
                return;
            case 1:
                sob.s0(((ppb) this.b.a).q);
                return;
            case 2:
                ppb ppb = (ppb) this.b.a;
                sob.i(ppb.r, ppb.s);
                return;
            case 3:
                sob.p0((pob) this.b.c);
                return;
            case 4:
                ppb ppb2 = (ppb) this.b.a;
                sob.f0(ppb2.j, ppb2.k);
                return;
            case 5:
                sob.c0(((ppb) this.b.a).m);
                return;
            case 6:
                sob.h(((ppb) this.b.a).y);
                return;
            case 7:
                sob.e(4, ((ppb) this.b.a).t);
                return;
            case 8:
                sob.n(((ppb) this.b.a).v);
                return;
            case 9:
                sob.o0(((ppb) this.b.a).g);
                return;
            case 10:
                sob.onRepeatModeChanged(((ppb) this.b.a).h);
                return;
            default:
                sob.O(((ppb) this.b.a).i);
                return;
        }
    }
}
