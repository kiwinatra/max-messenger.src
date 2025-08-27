package defpackage;

/* renamed from: v84  reason: default package */
public final /* synthetic */ class v84 implements x6 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v84(z84 z84, mj5 mj5, boolean z) {
        this.c = z84;
        this.d = mj5;
        this.b = z;
    }

    public final void run() {
        Object obj = this.d;
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                z84 z84 = (z84) obj2;
                w84 w84 = z84.g;
                mj5 mj5 = (mj5) obj;
                z84.c(new w84(w84.a, this.b, SetsKt___SetsKt.plus(w84.e, Long.valueOf(mj5.a)), w84.c, mj5));
                return;
            default:
                a2a a2a = (a2a) obj2;
                a2a.getClass();
                z68.a("a2a", "Sticker set marked");
                n99 n99 = a2a.v.a.b;
                d6a d6a = n99.B0;
                boolean z = this.b;
                ype ype = (ype) obj;
                if (z) {
                    d6a.n(ype);
                } else {
                    d6a.o(ype);
                }
                n99.C0.s(z);
                return;
        }
    }

    public /* synthetic */ v84(a2a a2a, boolean z, ype ype) {
        this.c = a2a;
        this.b = z;
        this.d = ype;
    }
}
