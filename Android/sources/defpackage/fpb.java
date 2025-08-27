package defpackage;

import android.os.Handler;
import com.google.android.exoplayer2.ParserException;

/* renamed from: fpb  reason: default package */
public final class fpb implements ypf {
    public final icd a;
    public final xe8 b = new xe8(13, false);
    public final wp9 c = new aa4(1);
    public long d = -9223372036854775807L;
    public final /* synthetic */ hpb e;

    /* JADX WARNING: type inference failed for: r2v3, types: [wp9, aa4] */
    public fpb(hpb hpb, cb4 cb4) {
        this.e = hpb;
        this.a = new icd(cb4, (ow4) null, (fw4) null);
    }

    public final int a(b74 b74, int i, boolean z) {
        return this.a.e(b74, i, z);
    }

    public final void b(long j, int i, int i2, int i3, wpf wpf) {
        long g;
        long j2;
        this.a.b(j, i, i2, i3, wpf);
        while (this.a.t(false)) {
            wp9 wp9 = this.c;
            wp9.z();
            if (this.a.y(this.b, wp9, 0, false) == -4) {
                wp9.C();
            } else {
                wp9 = null;
            }
            if (wp9 != null) {
                long j3 = wp9.w;
                rp9 o = ((up) this.e.z).o(wp9);
                if (o != null) {
                    b95 b95 = (b95) o.a[0];
                    String str = b95.a;
                    String str2 = b95.b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j2 = t0g.G(t0g.n(b95.v));
                        } catch (ParserException unused) {
                            j2 = -9223372036854775807L;
                        }
                        if (j2 != -9223372036854775807L) {
                            dpb dpb = new dpb(j3, j2);
                            Handler handler = this.e.b;
                            handler.sendMessage(handler.obtainMessage(1, dpb));
                        }
                    }
                }
            }
        }
        icd icd = this.a;
        ccd ccd = icd.a;
        synchronized (icd) {
            int i4 = icd.s;
            g = i4 == 0 ? -1 : icd.g(i4);
        }
        ccd.c(g);
    }

    public final void c(int i, g1g g1g) {
        this.a.f(i, g1g);
    }

    public final void d(ca6 ca6) {
        this.a.d(ca6);
    }
}
