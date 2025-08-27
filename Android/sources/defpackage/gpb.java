package defpackage;

import android.os.Handler;
import androidx.media3.common.ParserException;

/* renamed from: gpb  reason: default package */
public final class gpb implements zpf {
    public final jcd a;
    public final ox0 b = new ox0(12, false);
    public final xp9 c = new ba4(1);
    public long d = -9223372036854775807L;
    public final /* synthetic */ hpb e;

    /* JADX WARNING: type inference failed for: r2v3, types: [xp9, ba4] */
    public gpb(hpb hpb, cb4 cb4) {
        this.e = hpb;
        this.a = new jcd(cb4, (pw4) null, (gw4) null);
    }

    public final void a(long j, int i, int i2, int i3, xpf xpf) {
        long f;
        long j2;
        this.a.a(j, i, i2, i3, xpf);
        while (this.a.s(false)) {
            xp9 xp9 = this.c;
            xp9.z();
            if (this.a.x(this.b, xp9, 0, false) == -4) {
                xp9.C();
            } else {
                xp9 = null;
            }
            if (xp9 != null) {
                long j3 = xp9.x;
                sp9 k = ((vp) this.e.z).k(xp9);
                if (k != null) {
                    c95 c95 = (c95) k.a[0];
                    String str = c95.a;
                    String str2 = c95.b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j2 = v0g.V(v0g.q(c95.v));
                        } catch (ParserException unused) {
                            j2 = -9223372036854775807L;
                        }
                        if (j2 != -9223372036854775807L) {
                            epb epb = new epb(j3, j2);
                            Handler handler = this.e.b;
                            handler.sendMessage(handler.obtainMessage(1, epb));
                        }
                    }
                }
            }
        }
        jcd jcd = this.a;
        ccd ccd = jcd.a;
        synchronized (jcd) {
            int i4 = jcd.s;
            f = i4 == 0 ? -1 : jcd.f(i4);
        }
        ccd.c(f);
    }

    public final void b(l8b l8b, int i, int i2) {
        this.a.b(l8b, i, 0);
    }

    public final int c(c74 c74, int i, boolean z) {
        return this.a.c(c74, i, z);
    }

    public final void e(ea6 ea6) {
        this.a.e(ea6);
    }
}
