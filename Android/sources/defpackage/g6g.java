package defpackage;

/* renamed from: g6g  reason: default package */
public final class g6g {
    public final e4 a;
    public final y5g b;
    public final ap0 c = new ap0();
    public final akf d = new akf(1);
    public final akf e = new akf(1);
    public final zy f = new zy(4, (byte) 0);
    public v8g g;
    public v8g h = v8g.e;
    public long i;
    public long j = -9223372036854775807L;

    public g6g(e4 e4Var, y5g y5g) {
        this.a = e4Var;
        this.b = y5g;
    }

    public final void a() {
        zy zyVar = this.f;
        boolean z = false;
        zyVar.b = 0;
        zyVar.c = -1;
        zyVar.o = 0;
        this.j = -9223372036854775807L;
        akf akf = this.e;
        if (akf.h() > 0) {
            n79.g(akf.h() > 0);
            while (akf.h() > 1) {
                akf.e();
            }
            Object e2 = akf.e();
            e2.getClass();
            akf.a(0, (Long) e2);
        }
        v8g v8g = this.g;
        akf akf2 = this.d;
        if (v8g != null) {
            akf2.b();
        } else if (akf2.h() > 0) {
            if (akf2.h() > 0) {
                z = true;
            }
            n79.g(z);
            while (akf2.h() > 1) {
                akf2.e();
            }
            Object e3 = akf2.e();
            e3.getClass();
            this.g = (v8g) e3;
        }
    }
}
