package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: np4  reason: default package */
public final class np4 implements xvb {
    public final /* synthetic */ int a;
    public final r2f b;
    public final cd4 c;
    public final xvb d;

    public /* synthetic */ np4(r2f r2f, cd4 cd4, xvb xvb, int i) {
        this.a = i;
        this.b = r2f;
        this.c = cd4;
        this.d = xvb;
    }

    public static Map c(ej7 ej7, yvb yvb, boolean z, int i) {
        if (!ej7.i(yvb, "DiskCacheProducer")) {
            return null;
        }
        return z ? xb7.b("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i)) : xb7.a("cached_value_found", String.valueOf(z));
    }

    public final void a(zi0 zi0, yvb yvb) {
        switch (this.a) {
            case 0:
                ik0 ik0 = (ik0) yvb;
                qa7 qa7 = ik0.a;
                if (!qa7.d(16)) {
                    d(zi0, yvb);
                    return;
                }
                bwb bwb = ik0.c;
                bwb.j(yvb, "DiskCacheProducer");
                cd4 cd4 = this.c;
                cd4.getClass();
                uae g = cd4.g(qa7.b);
                rp4 rp4 = (rp4) this.b.get();
                vu0 i = i8b.i(qa7, (vu0) rp4.d.getValue(), rp4.a(), (xb7) rp4.f.getValue());
                if (i == null) {
                    bwb.d(yvb, "DiskCacheProducer", new Exception("Got no disk cache for CacheChoice: " + Integer.valueOf(qa7.a.ordinal()).toString()), (Map) null);
                    d(zi0, yvb);
                    return;
                }
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                i.b(g, atomicBoolean).continueWith(new lp4(this, (ej7) bwb, yvb, zi0));
                ik0.a(new mp4(0, atomicBoolean));
                return;
            default:
                ik0 ik02 = (ik0) yvb;
                if (ik02.v.a >= 2) {
                    ik02.h("disk", "nil-result_write");
                    zi0.g(1, (Object) null);
                    return;
                }
                if (ik02.a.d(32)) {
                    zi0 = new op4(zi0, yvb, this.b, this.c);
                }
                this.d.a(zi0, yvb);
                return;
        }
    }

    public void d(zi0 zi0, yvb yvb) {
        ik0 ik0 = (ik0) yvb;
        if (ik0.v.a >= 2) {
            ik0.h("disk", "nil-result_read");
            zi0.g(1, (Object) null);
            return;
        }
        this.d.a(zi0, yvb);
    }
}
