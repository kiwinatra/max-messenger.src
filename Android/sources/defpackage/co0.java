package defpackage;

import androidx.media3.decoder.DecoderException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: co0  reason: default package */
public final class co0 implements xye, y94 {
    public final yae a;
    public final Object b;
    public final ArrayDeque c;
    public final ArrayDeque d;
    public final ba4[] e;
    public final ca4[] f;
    public int g;
    public int h;
    public ba4 i;
    public DecoderException j;
    public boolean k;
    public boolean l;
    public long m;
    public final /* synthetic */ int n;
    public final Object o;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public co0(ize ize) {
        this(new cze[2], new eze[2]);
        this.n = 1;
        int i2 = this.g;
        ba4[] ba4Arr = this.e;
        n79.n(i2 == ba4Arr.length);
        for (ba4 B : ba4Arr) {
            B.B(1024);
        }
        this.o = ize;
    }

    public final void a(long j2) {
        boolean z;
        synchronized (this.b) {
            try {
                if (this.g != this.e.length) {
                    if (!this.k) {
                        z = false;
                        n79.n(z);
                        this.m = j2;
                    }
                }
                z = true;
                n79.n(z);
                this.m = j2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(long j2) {
    }

    public final ba4 e() {
        switch (this.n) {
            case 0:
                return new ba4(1);
            default:
                return new ba4(1);
        }
    }

    public final Object f() {
        ba4 ba4;
        synchronized (this.b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException == null) {
                    n79.n(this.i == null);
                    int i2 = this.g;
                    if (i2 == 0) {
                        ba4 = null;
                    } else {
                        ba4[] ba4Arr = this.e;
                        int i3 = i2 - 1;
                        this.g = i3;
                        ba4 = ba4Arr[i3];
                    }
                    this.i = ba4;
                } else {
                    throw decoderException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ba4;
    }

    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                ba4 ba4 = this.i;
                if (ba4 != null) {
                    ba4.z();
                    int i2 = this.g;
                    this.g = i2 + 1;
                    this.e[i2] = ba4;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    ba4 ba42 = (ba4) this.c.removeFirst();
                    ba42.z();
                    int i3 = this.g;
                    this.g = i3 + 1;
                    this.e[i3] = ba42;
                }
                while (!this.d.isEmpty()) {
                    ((ca4) this.d.removeFirst()).A();
                }
            } finally {
            }
        }
    }

    public final ca4 g() {
        switch (this.n) {
            case 0:
                return new bo0(this);
            default:
                return new qy1(this);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [androidx.media3.decoder.DecoderException, java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r1v3, types: [androidx.media3.decoder.DecoderException, java.lang.Exception] */
    public final DecoderException h(Throwable th) {
        switch (this.n) {
            case 0:
                return new Exception("Unexpected decode error", th);
            default:
                return new Exception("Unexpected decode error", th);
        }
    }

    public final DecoderException i(ba4 ba4, ca4 ca4, boolean z) {
        switch (this.n) {
            case 0:
                bo0 bo0 = (bo0) ca4;
                try {
                    ByteBuffer byteBuffer = ba4.v;
                    byteBuffer.getClass();
                    n79.n(byteBuffer.hasArray());
                    n79.g(byteBuffer.arrayOffset() == 0);
                    byte[] array = byteBuffer.array();
                    int remaining = byteBuffer.remaining();
                    ((fm0) this.o).getClass();
                    bo0.v = fm0.b(remaining, array);
                    bo0.c = ba4.x;
                    return null;
                } catch (ImageDecoderException e2) {
                    return e2;
                }
            default:
                cze cze = (cze) ba4;
                eze eze = (eze) ca4;
                try {
                    ByteBuffer byteBuffer2 = cze.v;
                    byteBuffer2.getClass();
                    byte[] array2 = byteBuffer2.array();
                    int limit = byteBuffer2.limit();
                    ize ize = (ize) this.o;
                    if (z) {
                        ize.reset();
                    }
                    vye f2 = ize.f(0, array2, limit);
                    long j2 = cze.x;
                    long j3 = cze.Y;
                    eze.c = j2;
                    eze.v = f2;
                    if (j3 != LongCompanionObject.MAX_VALUE) {
                        j2 = j3;
                    }
                    eze.w = j2;
                    eze.o = false;
                    return null;
                } catch (SubtitleDecoderException e3) {
                    return e3;
                }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        if (r1.h(4) == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        r4.a(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004a, code lost:
        r4.c = r1.x;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
        if (r1.h(134217728) == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        r4.a(134217728);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        r6 = r1.x;
        r8 = r13.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r9 = r13.m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0067, code lost:
        if (r9 == -9223372036854775807L) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006b, code lost:
        if (r6 < r9) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006e, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0070, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0071, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0072, code lost:
        if (r0 != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0074, code lost:
        r4.o = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r0 = i(r1, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007c, code lost:
        r0 = h(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0081, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0082, code lost:
        r0 = h(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean j() {
        /*
            r13 = this;
            java.lang.Object r0 = r13.b
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r13.l     // Catch:{ all -> 0x0020 }
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0023
            java.util.ArrayDeque r1 = r13.c     // Catch:{ all -> 0x0020 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0020 }
            if (r1 != 0) goto L_0x0017
            int r1 = r13.h     // Catch:{ all -> 0x0020 }
            if (r1 <= 0) goto L_0x0017
            r1 = r3
            goto L_0x0018
        L_0x0017:
            r1 = r2
        L_0x0018:
            if (r1 != 0) goto L_0x0023
            java.lang.Object r1 = r13.b     // Catch:{ all -> 0x0020 }
            r1.wait()     // Catch:{ all -> 0x0020 }
            goto L_0x0003
        L_0x0020:
            r13 = move-exception
            goto L_0x00c0
        L_0x0023:
            boolean r1 = r13.l     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x0029
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r2
        L_0x0029:
            java.util.ArrayDeque r1 = r13.c     // Catch:{ all -> 0x0020 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x0020 }
            ba4 r1 = (defpackage.ba4) r1     // Catch:{ all -> 0x0020 }
            ca4[] r4 = r13.f     // Catch:{ all -> 0x0020 }
            int r5 = r13.h     // Catch:{ all -> 0x0020 }
            int r5 = r5 - r3
            r13.h = r5     // Catch:{ all -> 0x0020 }
            r4 = r4[r5]     // Catch:{ all -> 0x0020 }
            boolean r5 = r13.k     // Catch:{ all -> 0x0020 }
            r13.k = r2     // Catch:{ all -> 0x0020 }
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            r0 = 4
            boolean r6 = r1.h(r0)
            if (r6 == 0) goto L_0x004a
            r4.a(r0)
            goto L_0x0092
        L_0x004a:
            long r6 = r1.x
            r4.c = r6
            r0 = 134217728(0x8000000, float:3.85186E-34)
            boolean r6 = r1.h(r0)
            if (r6 == 0) goto L_0x0059
            r4.a(r0)
        L_0x0059:
            long r6 = r1.x
            java.lang.Object r8 = r13.b
            monitor-enter(r8)
            long r9 = r13.m     // Catch:{ all -> 0x00bd }
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0070
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x006e
            goto L_0x0070
        L_0x006e:
            r0 = r2
            goto L_0x0071
        L_0x0070:
            r0 = r3
        L_0x0071:
            monitor-exit(r8)     // Catch:{ all -> 0x00bd }
            if (r0 != 0) goto L_0x0076
            r4.o = r3
        L_0x0076:
            androidx.media3.decoder.DecoderException r0 = r13.i(r1, r4, r5)     // Catch:{ RuntimeException -> 0x0081, OutOfMemoryError -> 0x007b }
            goto L_0x0086
        L_0x007b:
            r0 = move-exception
            androidx.media3.decoder.DecoderException r0 = r13.h(r0)
            goto L_0x0086
        L_0x0081:
            r0 = move-exception
            androidx.media3.decoder.DecoderException r0 = r13.h(r0)
        L_0x0086:
            if (r0 == 0) goto L_0x0092
            java.lang.Object r5 = r13.b
            monitor-enter(r5)
            r13.j = r0     // Catch:{ all -> 0x008f }
            monitor-exit(r5)     // Catch:{ all -> 0x008f }
            return r2
        L_0x008f:
            r13 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x008f }
            throw r13
        L_0x0092:
            java.lang.Object r0 = r13.b
            monitor-enter(r0)
            boolean r2 = r13.k     // Catch:{ all -> 0x009d }
            if (r2 == 0) goto L_0x009f
            r4.A()     // Catch:{ all -> 0x009d }
            goto L_0x00ac
        L_0x009d:
            r13 = move-exception
            goto L_0x00bb
        L_0x009f:
            boolean r2 = r4.o     // Catch:{ all -> 0x009d }
            if (r2 == 0) goto L_0x00a7
            r4.A()     // Catch:{ all -> 0x009d }
            goto L_0x00ac
        L_0x00a7:
            java.util.ArrayDeque r2 = r13.d     // Catch:{ all -> 0x009d }
            r2.addLast(r4)     // Catch:{ all -> 0x009d }
        L_0x00ac:
            r1.z()     // Catch:{ all -> 0x009d }
            int r2 = r13.g     // Catch:{ all -> 0x009d }
            int r4 = r2 + 1
            r13.g = r4     // Catch:{ all -> 0x009d }
            ba4[] r13 = r13.e     // Catch:{ all -> 0x009d }
            r13[r2] = r1     // Catch:{ all -> 0x009d }
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            return r3
        L_0x00bb:
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            throw r13
        L_0x00bd:
            r13 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00bd }
            throw r13
        L_0x00c0:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.co0.j():boolean");
    }

    /* renamed from: k */
    public final ca4 d() {
        synchronized (this.b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                } else if (this.d.isEmpty()) {
                    return null;
                } else {
                    ca4 ca4 = (ca4) this.d.removeFirst();
                    return ca4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: l */
    public final void c(ba4 ba4) {
        synchronized (this.b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException == null) {
                    n79.g(ba4 == this.i);
                    this.c.addLast(ba4);
                    if (!this.c.isEmpty() && this.h > 0) {
                        this.b.notify();
                    }
                    this.i = null;
                } else {
                    throw decoderException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(ca4 ca4) {
        synchronized (this.b) {
            ca4.z();
            int i2 = this.h;
            this.h = i2 + 1;
            this.f[i2] = ca4;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }

    public final void release() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public co0(ba4[] ba4Arr, ca4[] ca4Arr) {
        this.b = new Object();
        this.m = -9223372036854775807L;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = ba4Arr;
        this.g = ba4Arr.length;
        for (int i2 = 0; i2 < this.g; i2++) {
            this.e[i2] = e();
        }
        this.f = ca4Arr;
        this.h = ca4Arr.length;
        for (int i3 = 0; i3 < this.h; i3++) {
            this.f[i3] = g();
        }
        yae yae = new yae(1, this);
        this.a = yae;
        yae.start();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public co0(fm0 fm0) {
        this(new ba4[1], new bo0[1]);
        this.n = 0;
        this.o = fm0;
    }
}
