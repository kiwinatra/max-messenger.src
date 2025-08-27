package defpackage;

/* renamed from: fc5  reason: default package */
public final /* synthetic */ class fc5 implements i08, h08, pk3, qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ fc5(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                ((ypb) obj).F(this.b, this.c);
                return;
            case 4:
                ((ypb) obj).h0(this.b, this.c);
                return;
            default:
                j10 j10 = (j10) obj;
                boolean X = ld8.X(j10);
                if (j10.d != null || X) {
                    int i = this.b;
                    int i2 = this.c;
                    if (X) {
                        h20 a2 = j10.b().d.d.a();
                        a2.i = i;
                        a2.m = i2;
                        k20 k20 = new k20(a2);
                        j10 j = j10.b().d.j();
                        j.d = k20;
                        l20 a3 = j.a();
                        r10 a4 = j10.b().a();
                        a4.e = a3;
                        j10.r = new s10(a4);
                        return;
                    }
                    h20 a5 = j10.c().a();
                    a5.i = i;
                    a5.m = i2;
                    j10.d = new k20(a5);
                    return;
                }
                return;
        }
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((sob) obj).m(this.b, this.c);
                return;
            case 1:
                ((rob) obj).m(this.b, this.c);
                return;
            default:
                ((sob) obj).m(this.b, this.c);
                return;
        }
    }
}
