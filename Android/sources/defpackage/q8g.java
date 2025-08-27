package defpackage;

import android.util.Pair;
import android.view.Surface;
import java.util.List;

/* renamed from: q8g  reason: default package */
public final class q8g {
    public final f43 a;
    public final ea6 b;
    public final List c;
    public final hrf d;
    public final ni3 e;
    public final String f;
    public final int g;
    public r3f h;
    public volatile md4 i;
    public volatile int j;
    public volatile boolean k;

    public q8g(f43 f43, ea6 ea6, tb7 tb7, hrf hrf, ni3 ni3) {
        m53 m53 = ea6.A;
        n79.g(m53 != null);
        this.a = f43;
        this.b = ea6;
        this.c = tb7;
        this.d = hrf;
        this.e = ni3;
        String str = ea6.n;
        str.getClass();
        String str2 = hrf.c;
        String str3 = "video/hevc";
        if (str2 != null) {
            str = str2;
        } else if (vq9.i(str)) {
            str = str3;
        }
        int i2 = hrf.d;
        if (i2 == 0 && m53.g(m53) && k65.g(str, m53).isEmpty()) {
            if (k65.g(str3, m53).isEmpty()) {
                i2 = 2;
            }
            Pair create = Pair.create(str3, Integer.valueOf(i2));
            this.f = (String) create.first;
            this.g = ((Integer) create.second).intValue();
        }
        str3 = str;
        Pair create2 = Pair.create(str3, Integer.valueOf(i2));
        this.f = (String) create2.first;
        this.g = ((Integer) create2.second).intValue();
    }

    public final r3f a(int i2, int i3) {
        m53 m53;
        if (this.k) {
            return null;
        }
        r3f r3f = this.h;
        if (r3f != null) {
            return r3f;
        }
        if (i2 < i3) {
            this.j = 90;
            int i4 = i3;
            i3 = i2;
            i2 = i4;
        }
        if (this.b.w % 180 == this.j % 180) {
            this.j = this.b.w;
        }
        ba6 ba6 = new ba6();
        ba6.s = i2;
        ba6.t = i3;
        boolean z = false;
        ba6.v = 0;
        ba6.u = this.b.v;
        ba6.m = vq9.l(this.f);
        ea6 ea6 = this.b;
        if (m53.g(ea6.A) && this.g != 0) {
            m53 = m53.h;
        } else if (m53.i.equals(ea6.A)) {
            m53 = m53.h;
        } else {
            m53 = ea6.A;
            m53.getClass();
        }
        ba6.z = m53;
        ba6.i = this.b.j;
        ea6 ea62 = new ea6(ba6);
        f43 f43 = this.a;
        ba6 a2 = ea62.a();
        a2.m = vq9.l(dcd.i(ea62, this.c));
        this.i = f43.u(new ea6(a2));
        ea6 ea63 = this.i.c;
        ni3 ni3 = this.e;
        hrf hrf = this.d;
        if (this.j != 0) {
            z = true;
        }
        int i5 = this.g;
        yy a3 = hrf.a();
        if (hrf.d != i5) {
            a3.b = i5;
        }
        if (!v0g.a(ea62.n, ea63.n)) {
            a3.c(ea63.n);
        }
        if (z) {
            int i6 = ea62.t;
            int i7 = ea63.t;
            if (i6 != i7) {
                a3.a = i7;
            }
        } else {
            int i8 = ea62.u;
            int i9 = ea63.u;
            if (i8 != i9) {
                a3.a = i9;
            }
        }
        ni3.e(a3.a());
        Surface surface = this.i.e;
        n79.o(surface);
        this.h = new r3f(surface, ea63.t, ea63.u, this.j);
        if (this.k) {
            this.i.h();
        }
        return this.h;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 128 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r2 = this;
            md4 r0 = r2.i
            if (r0 == 0) goto L_0x003a
            md4 r2 = r2.i
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.i
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x001b
            r0 = 30
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0014 }
            goto L_0x001b
        L_0x0014:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x001b:
            java.util.LinkedHashMap r0 = defpackage.p94.a
            java.lang.Class<p94> r0 = defpackage.p94.class
            monitor-enter(r0)
            java.lang.Class<p94> r1 = defpackage.p94.class
            monitor-enter(r1)     // Catch:{ all -> 0x0038 }
            monitor-exit(r1)     // Catch:{ all -> 0x0038 }
            monitor-exit(r0)
            android.media.MediaCodec r0 = r2.d     // Catch:{ RuntimeException -> 0x002b }
            r0.signalEndOfInputStream()     // Catch:{ RuntimeException -> 0x002b }
            goto L_0x003a
        L_0x002b:
            r0 = move-exception
            java.lang.String r1 = "MediaCodec error"
            defpackage.i8b.l(r0, r1)
            androidx.media3.transformer.ExportException r2 = r2.a(r0)
            throw r2
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            throw r2
        L_0x0038:
            r2 = move-exception
            goto L_0x0036
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q8g.b():void");
    }
}
