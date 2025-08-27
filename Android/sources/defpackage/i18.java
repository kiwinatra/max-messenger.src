package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: i18  reason: default package */
public final /* synthetic */ class i18 implements ri8, qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j18 b;
    public final /* synthetic */ long c;

    public /* synthetic */ i18(j18 j18, long j, int i) {
        this.a = i;
        this.b = j18;
        this.c = j;
    }

    public void accept(Object obj) {
        ec2 ec2 = (ec2) obj;
        j18 j18 = this.b;
        j18.getClass();
        j18.a();
        long j = ec2.c;
        j18.B0.getClass();
        dc2 a2 = ec2.a();
        a2.g = ((ltb) j18.X).a.m();
        ec2 ec22 = new ec2(a2);
        j18.z.e(ec22).a();
        ha9 r = j18.Y.r(ec22.c);
        long j2 = ec22.b;
        j18.o.d(Long.valueOf(j2));
        if (r != null) {
            z68.c("j18", "stopMyLocation messageId = %d", Long.valueOf(this.c));
            a32 G = j18.Z.G(j2);
            if (G != null) {
                ((jna) j18.v0).G(G.b.a, r.c);
                j18.h();
            }
        }
    }

    public void e(rh8 rh8) {
        rh8 rh82 = rh8;
        switch (this.a) {
            case 0:
                j18 j18 = this.b;
                j18.getClass();
                j18.a();
                ai8 d = j18.z.d(this.c);
                ec2 ec2 = ec2.i;
                ec2 ec22 = (ec2) d.c(ec2);
                if (ec22 == ec2) {
                    rh8.b();
                    return;
                }
                ai8 ai8 = new ai8(new wh8(2, j18.y.a(), new oq3(ec22.a, ec22.h, ec22.f, ec22.g, 0)), new zb2(14), 1);
                qq3 qq3 = qq3.e;
                qq3 qq32 = (qq3) ai8.c(qq3);
                if (qq32 == qq3) {
                    rh8.b();
                    return;
                }
                rh82.a(new uc9(ec22.c, ec22.a, qq32.c, qq32.b, ec22.f > ((ltb) j18.X).a.m(), ec22.h, ec22.e));
                return;
            default:
                j18 j182 = this.b;
                j182.getClass();
                j18.a();
                ai8 d2 = j182.z.d(this.c);
                ec2 ec23 = ec2.i;
                ec2 ec24 = (ec2) d2.c(ec23);
                if (ec24 == ec23 || ec24.e == LongCompanionObject.MAX_VALUE) {
                    rh8.b();
                    return;
                }
                wbe a2 = j182.y.a();
                long j = ec24.a;
                String str = ec24.h;
                long j2 = ec24.f;
                long j3 = ec24.g;
                List list = (List) new wh8(2, new yia(new oa3(1, new wh8(2, a2, new oq3(j, str, j2, j3, 1)), new q0a(0)), new zb2(14), 3).B(), new yb2(2, j, j2, j3)).c(Collections.emptyList());
                if (list.isEmpty()) {
                    rh8.b();
                    return;
                } else {
                    rh82.a(list);
                    return;
                }
        }
    }
}
