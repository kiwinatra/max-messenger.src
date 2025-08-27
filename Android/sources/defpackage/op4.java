package defpackage;

import java.util.Map;

/* renamed from: op4  reason: default package */
public final class op4 extends hl4 {
    public final yvb c;
    public final r2f d;
    public final cd4 e;

    public op4(zi0 zi0, yvb yvb, r2f r2f, cd4 cd4) {
        super(zi0);
        this.c = yvb;
        this.d = r2f;
        this.e = cd4;
    }

    public final void h(int i, Object obj) {
        j55 j55 = (j55) obj;
        yvb yvb = this.c;
        ik0 ik0 = (ik0) yvb;
        ik0.c.j(yvb, "DiskCacheWriteProducer");
        boolean b = zi0.b(i);
        bwb bwb = ik0.c;
        zi0 zi0 = this.b;
        if (!b && j55 != null && (i & 10) == 0) {
            j55.m0();
            if (j55.c != h97.c) {
                cd4 cd4 = this.e;
                cd4.getClass();
                qa7 qa7 = ik0.a;
                uae g = cd4.g(qa7.b);
                rp4 rp4 = (rp4) this.d.get();
                vu0 i2 = i8b.i(qa7, (vu0) rp4.d.getValue(), rp4.a(), (xb7) rp4.f.getValue());
                if (i2 == null) {
                    bwb.d(yvb, "DiskCacheWriteProducer", new Exception("Got no disk cache for CacheChoice: " + Integer.valueOf(qa7.a.ordinal()).toString()), (Map) null);
                    zi0.g(i, j55);
                    return;
                }
                i2.d(g, j55);
                bwb.a(yvb, "DiskCacheWriteProducer", (Map) null);
                zi0.g(i, j55);
                return;
            }
        }
        bwb.a(yvb, "DiskCacheWriteProducer", (Map) null);
        zi0.g(i, j55);
    }
}
