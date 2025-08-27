package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.transformer.ExportException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: msd  reason: default package */
public final class msd implements vt, ut {
    public static final ea6 z;
    public final tb7 a;
    public final boolean b;
    public final boolean c;
    public final tt d;
    public final qd3 e;
    public final ut f;
    public final k7f g;
    public final HashMap h = new HashMap();
    public final HashMap i = new HashMap();
    public final qb7 j = new jb7(4);
    public final AtomicInteger k = new AtomicInteger();
    public final AtomicInteger l = new AtomicInteger();
    public boolean m = true;
    public int n;
    public vt o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public volatile boolean u;
    public volatile long v;
    public volatile long w;
    public volatile long x;
    public volatile boolean y;

    static {
        ba6 ba6 = new ba6();
        ba6.m = vq9.l("audio/mp4a-latm");
        ba6.B = 44100;
        ba6.A = 2;
        z = ba6.a();
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [qb7, jb7] */
    public msd(f05 f05, boolean z2, tt ttVar, qd3 qd3, orf orf, c7f c7f, Looper looper) {
        tb7 tb7 = f05.a;
        this.a = tb7;
        this.b = f05.b;
        this.c = z2;
        this.d = ttVar;
        this.e = qd3;
        this.f = orf;
        this.g = c7f.a(looper, (Handler.Callback) null);
        this.o = ttVar.b((e05) tb7.get(0), looper, this, qd3);
    }

    public final int a(jq5 jq5) {
        if (this.b) {
            return 3;
        }
        int a2 = this.o.a(jq5);
        int size = this.a.size();
        if (size == 1 || a2 == 0) {
            return a2;
        }
        int i2 = (this.n * 100) / size;
        if (a2 == 2) {
            i2 += jq5.b / size;
        }
        jq5.b = i2;
        return 2;
    }

    public final void b(int i2) {
        this.k.set(i2);
        this.l.set(i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: lsd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.bcd c(defpackage.ea6 r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.n
            int r0 = defpackage.y7e.y(r0)
            defpackage.v0g.H(r0)
            java.util.LinkedHashMap r1 = defpackage.p94.a
            java.lang.Class<p94> r1 = defpackage.p94.class
            monitor-enter(r1)
            monitor-exit(r1)
            boolean r1 = r9.m
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0069
            ut r1 = r9.f
            bcd r1 = r1.c(r10)
            if (r1 != 0) goto L_0x0020
            goto L_0x00e3
        L_0x0020:
            lsd r5 = new lsd
            r5.<init>(r9, r1, r0)
            java.util.HashMap r1 = r9.h
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r1.put(r6, r5)
            boolean r1 = r9.c
            if (r1 == 0) goto L_0x00a9
            java.util.concurrent.atomic.AtomicInteger r1 = r9.k
            int r1 = r1.get()
            if (r1 != r4) goto L_0x00a9
            if (r0 != r3) goto L_0x00a9
            ut r1 = r9.f
            ea6 r6 = z
            ba6 r6 = r6.a()
            java.lang.String r7 = "audio/raw"
            java.lang.String r7 = defpackage.vq9.l(r7)
            r6.m = r7
            r6.C = r3
            ea6 r7 = new ea6
            r7.<init>(r6)
            bcd r1 = r1.c(r7)
            defpackage.n79.o(r1)
            java.util.HashMap r6 = r9.h
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            lsd r8 = new lsd
            r8.<init>(r9, r1, r0)
            r6.put(r7, r8)
            goto L_0x00a9
        L_0x0069:
            java.util.concurrent.atomic.AtomicInteger r1 = r9.k
            int r1 = r1.get()
            if (r1 != r4) goto L_0x007d
            if (r0 != r4) goto L_0x007d
            java.util.HashMap r1 = r9.h
            int r1 = r1.size()
            if (r1 != r3) goto L_0x007d
            r1 = r4
            goto L_0x007e
        L_0x007d:
            r1 = 0
        L_0x007e:
            r1 = r1 ^ r4
            java.lang.String r5 = "Inputs with no video track are not supported when the output contains a video track"
            defpackage.n79.m(r5, r1)
            java.util.HashMap r1 = r9.h
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.get(r5)
            r5 = r1
            lsd r5 = (defpackage.lsd) r5
            java.util.Locale r1 = java.util.Locale.US
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r6 = "The preceding MediaItem does not contain any track of type "
            r1.<init>(r6)
            r1.append(r0)
            java.lang.String r6 = ". If the Composition contains a sequence that starts with items without audio tracks (like images), followed by items with audio tracks, Composition.Builder.experimentalSetForceAudioTrack() needs to be set to true."
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            defpackage.n79.p(r5, r1)
        L_0x00a9:
            r9.i(r0, r10)
            java.util.concurrent.atomic.AtomicInteger r10 = r9.k
            int r10 = r10.get()
            if (r10 != r4) goto L_0x00e2
            java.util.HashMap r10 = r9.h
            int r10 = r10.size()
            if (r10 != r3) goto L_0x00e2
            java.util.HashMap r10 = r9.h
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x00c6:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x00e2
            java.lang.Object r1 = r10.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getKey()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r0 == r1) goto L_0x00c6
            r9.i(r1, r2)
            goto L_0x00c6
        L_0x00e2:
            r2 = r5
        L_0x00e3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.msd.c(ea6):bcd");
    }

    public final void d(ExportException exportException) {
        this.f.d(exportException);
    }

    public final wb7 e() {
        return this.o.e();
    }

    public final void f(long j2) {
        boolean z2 = j2 != -9223372036854775807L || this.n == this.a.size() - 1;
        n79.f("Could not retrieve required duration for EditedMediaItem " + this.n, z2);
        this.w = ((e05) this.a.get(this.n)).b(j2);
        this.v = j2;
        if (this.a.size() == 1 && !this.b) {
            this.f.f(this.w);
        }
    }

    public final boolean g(int i2, ea6 ea6) {
        int i3 = 0;
        boolean z2 = y7e.y(ea6.n) == 1;
        LinkedHashMap linkedHashMap = p94.a;
        synchronized (p94.class) {
        }
        if (!this.m) {
            return z2 ? this.q : this.r;
        }
        if (this.c && this.k.get() == 1 && !z2) {
            i3 = 1;
        }
        if (!this.p) {
            this.f.b(this.k.get() + i3);
            this.p = true;
        }
        boolean g2 = this.f.g(i2, ea6);
        if (z2) {
            this.q = g2;
        } else {
            this.r = g2;
        }
        if (i3 != 0) {
            this.f.g(2, z);
            this.q = true;
        }
        return g2;
    }

    public final void h() {
        int i2 = this.s;
        tb7 tb7 = this.a;
        int size = tb7.size() * i2;
        int i3 = this.n;
        if (size + i3 >= this.t) {
            ir8 ir8 = ((e05) tb7.get(i3)).a;
            wb7 e2 = this.o.e();
            this.j.a(new xd5((String) e2.get(1), (String) e2.get(2)));
            this.t++;
        }
    }

    public final void i(int i2, ea6 ea6) {
        nma nma = (nma) this.i.get(Integer.valueOf(i2));
        if (nma != null) {
            nma.b((e05) this.a.get(this.n), (i2 != 1 || !this.b || !this.q) ? this.v : -9223372036854775807L, ea6, this.n == this.a.size() - 1);
        }
    }

    public final void j(long j2, boolean z2) {
        this.x = j2;
        this.y = z2;
    }

    public final void release() {
        this.o.release();
        this.u = true;
    }

    public final void start() {
        this.o.start();
        if (this.a.size() > 1 || this.b) {
            this.f.f(-9223372036854775807L);
        }
    }
}
