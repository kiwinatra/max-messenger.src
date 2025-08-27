package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.media3.transformer.ExportException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: md4  reason: default package */
public final class md4 {
    public final MediaCodec.BufferInfo a = new MediaCodec.BufferInfo();
    public final MediaFormat b;
    public final ea6 c;
    public final MediaCodec d;
    public final Surface e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final AtomicBoolean i = new AtomicBoolean();
    public ea6 j;
    public ByteBuffer k;
    public int l = -1;
    public int m = -1;
    public boolean n;
    public boolean o;

    /* JADX WARNING: type inference failed for: r6v0, types: [android.view.Surface, android.media.MediaCrypto] */
    /* JADX WARNING: type inference failed for: r6v1, types: [android.view.Surface] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: CFG modification limit reached, blocks count: 165 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public md4(android.content.Context r10, defpackage.ea6 r11, android.media.MediaFormat r12, java.lang.String r13, boolean r14, android.view.Surface r15) {
        /*
            r9 = this;
            r0 = 1
            r9.<init>()
            r9.c = r11
            r9.b = r12
            r9.g = r14
            java.lang.String r11 = r11.n
            r11.getClass()
            boolean r11 = defpackage.vq9.k(r11)
            r9.h = r11
            android.media.MediaCodec$BufferInfo r1 = new android.media.MediaCodec$BufferInfo
            r1.<init>()
            r9.a = r1
            r1 = -1
            r9.l = r1
            r9.m = r1
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>()
            r9.i = r1
            java.util.LinkedHashMap r1 = defpackage.p94.a
            java.lang.Class<p94> r1 = defpackage.p94.class
            monitor-enter(r1)
            java.lang.Class<p94> r2 = defpackage.p94.class
            monitor-enter(r2)     // Catch:{ all -> 0x00d4 }
            monitor-exit(r2)     // Catch:{ all -> 0x00d4 }
            monitor-exit(r1)
            int r1 = defpackage.v0g.a
            r2 = 3
            r3 = 0
            r4 = 31
            if (r1 < r4) goto L_0x0044
            java.lang.String r5 = "color-transfer-request"
            int r5 = defpackage.hsg.t(r12, r5, r3)
            if (r5 != r2) goto L_0x0044
            r5 = r0
            goto L_0x0045
        L_0x0044:
            r5 = r3
        L_0x0045:
            r6 = 0
            android.media.MediaCodec r7 = android.media.MediaCodec.createByCodecName(r13)     // Catch:{ Exception -> 0x0092 }
            java.lang.String r8 = "configureCodec"
            android.os.Trace.beginSection(r8)     // Catch:{ Exception -> 0x006e }
            r8 = r14 ^ 1
            r7.configure(r12, r15, r6, r8)     // Catch:{ Exception -> 0x006e }
            android.os.Trace.endSection()     // Catch:{ Exception -> 0x006e }
            if (r5 == 0) goto L_0x0070
            android.media.MediaFormat r15 = r7.getInputFormat()     // Catch:{ Exception -> 0x006e }
            if (r1 < r4) goto L_0x0068
            java.lang.String r1 = "color-transfer-request"
            int r15 = defpackage.hsg.t(r15, r1, r3)     // Catch:{ Exception -> 0x006e }
            if (r15 != r2) goto L_0x0068
            r3 = r0
        L_0x0068:
            java.lang.String r15 = "Tone-mapping requested but not supported by the decoder."
            defpackage.n79.f(r15, r3)     // Catch:{ Exception -> 0x006e }
            goto L_0x0070
        L_0x006e:
            r10 = move-exception
            goto L_0x0094
        L_0x0070:
            if (r11 == 0) goto L_0x0078
            if (r14 != 0) goto L_0x0078
            android.view.Surface r6 = r7.createInputSurface()     // Catch:{ Exception -> 0x006e }
        L_0x0078:
            java.lang.String r11 = "startCodec"
            android.os.Trace.beginSection(r11)     // Catch:{ Exception -> 0x006e }
            r7.start()     // Catch:{ Exception -> 0x006e }
            android.os.Trace.endSection()     // Catch:{ Exception -> 0x006e }
            r9.d = r7
            r9.e = r6
            boolean r10 = defpackage.v0g.M(r10)
            if (r10 == 0) goto L_0x008e
            goto L_0x008f
        L_0x008e:
            r0 = 5
        L_0x008f:
            r9.f = r0
            return
        L_0x0092:
            r10 = move-exception
            r7 = r6
        L_0x0094:
            java.lang.String r11 = "MediaCodec error"
            defpackage.i8b.l(r10, r11)
            if (r6 == 0) goto L_0x009e
            r6.release()
        L_0x009e:
            if (r7 == 0) goto L_0x00a3
            r7.release()
        L_0x00a3:
            boolean r11 = r10 instanceof java.io.IOException
            if (r11 != 0) goto L_0x00bb
            boolean r11 = r10 instanceof android.media.MediaCodec.CodecException
            if (r11 == 0) goto L_0x00ac
            goto L_0x00bb
        L_0x00ac:
            boolean r11 = r10 instanceof java.lang.IllegalArgumentException
            if (r11 == 0) goto L_0x00b8
            if (r14 == 0) goto L_0x00b5
            r11 = 3003(0xbbb, float:4.208E-42)
            goto L_0x00c2
        L_0x00b5:
            r11 = 4003(0xfa3, float:5.61E-42)
            goto L_0x00c2
        L_0x00b8:
            r11 = 1001(0x3e9, float:1.403E-42)
            goto L_0x00c2
        L_0x00bb:
            if (r14 == 0) goto L_0x00c0
            r11 = 3001(0xbb9, float:4.205E-42)
            goto L_0x00c2
        L_0x00c0:
            r11 = 4001(0xfa1, float:5.607E-42)
        L_0x00c2:
            boolean r9 = r9.h
            ci3 r15 = new ci3
            java.lang.String r12 = r12.toString()
            r15.<init>(r12, r13, r9, r14)
            androidx.media3.transformer.ExportException r9 = androidx.media3.transformer.ExportException.c(r10, r11, r15)
            throw r9
        L_0x00d2:
            monitor-exit(r1)     // Catch:{ all -> 0x00d4 }
            throw r9
        L_0x00d4:
            r9 = move-exception
            goto L_0x00d2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.md4.<init>(android.content.Context, ea6, android.media.MediaFormat, java.lang.String, boolean, android.view.Surface):void");
    }

    public final ExportException a(RuntimeException runtimeException) {
        boolean z = this.g;
        return ExportException.c(runtimeException, z ? 3002 : 4002, new ci3(this.b.toString(), b(), this.h, z));
    }

    public final String b() {
        int i2 = v0g.a;
        MediaCodec mediaCodec = this.d;
        return i2 >= 29 ? ld4.a(mediaCodec) : mediaCodec.getName();
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 119 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.nio.ByteBuffer c() {
        /*
            r2 = this;
            r0 = 1
            boolean r0 = r2.f(r0)
            if (r0 != 0) goto L_0x0009
            r2 = 0
            return r2
        L_0x0009:
            android.media.MediaCodec$BufferInfo r0 = r2.a
            long r0 = r0.presentationTimeUs
            java.util.LinkedHashMap r0 = defpackage.p94.a
            java.lang.Class<p94> r0 = defpackage.p94.class
            monitor-enter(r0)
            java.lang.Class<p94> r1 = defpackage.p94.class
            monitor-enter(r1)     // Catch:{ all -> 0x001c }
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
            monitor-exit(r0)
            java.nio.ByteBuffer r2 = r2.k
            return r2
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            throw r2
        L_0x001c:
            r2 = move-exception
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.md4.c():java.nio.ByteBuffer");
    }

    public final boolean d() {
        return this.o && this.m == -1;
    }

    public final boolean e(ba4 ba4) {
        MediaCodec mediaCodec = this.d;
        if (this.n) {
            return false;
        }
        if (this.l < 0) {
            try {
                int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0);
                this.l = dequeueInputBuffer;
                if (dequeueInputBuffer < 0) {
                    return false;
                }
                try {
                    ba4.v = mediaCodec.getInputBuffer(dequeueInputBuffer);
                    ba4.z();
                } catch (RuntimeException e2) {
                    i8b.l(e2, "MediaCodec error");
                    throw a(e2);
                }
            } catch (RuntimeException e3) {
                i8b.l(e3, "MediaCodec error");
                throw a(e3);
            }
        }
        ba4.v.getClass();
        return true;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 176 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f(boolean r11) {
        /*
            r10 = this;
            java.lang.String r0 = "MediaCodec error"
            android.media.MediaCodec r1 = r10.d
            android.media.MediaCodec$BufferInfo r2 = r10.a
            int r3 = r10.m
            r4 = 1
            if (r3 < 0) goto L_0x000c
            return r4
        L_0x000c:
            boolean r3 = r10.o
            r5 = 0
            if (r3 == 0) goto L_0x0012
            return r5
        L_0x0012:
            r6 = 0
            int r3 = r1.dequeueOutputBuffer(r2, r6)     // Catch:{ RuntimeException -> 0x00df }
            r10.m = r3     // Catch:{ RuntimeException -> 0x00df }
            r6 = 2
            if (r3 >= 0) goto L_0x008a
            r11 = -2
            if (r3 != r11) goto L_0x0089
            android.media.MediaFormat r11 = r1.getOutputFormat()
            ea6 r0 = r10.c
            sp9 r1 = r0.k
            ea6 r11 = defpackage.hsg.h(r11)
            ba6 r3 = r11.a()
            r3.j = r1
            java.lang.String r1 = "audio/raw"
            boolean r7 = r10.g
            if (r7 == 0) goto L_0x0047
            int r8 = r11.D
            r9 = -1
            if (r8 != r9) goto L_0x0047
            java.lang.String r11 = r11.n
            boolean r11 = java.util.Objects.equals(r11, r1)
            if (r11 == 0) goto L_0x0047
            r3.C = r6
        L_0x0047:
            ea6 r11 = new ea6
            r11.<init>(r3)
            r10.j = r11
            if (r7 == 0) goto L_0x006d
            java.lang.String r11 = r0.n
            boolean r11 = java.util.Objects.equals(r11, r1)
            if (r11 == 0) goto L_0x006d
            ea6 r11 = r10.j
            ba6 r11 = r11.a()
            int r1 = r0.B
            r11.A = r1
            int r0 = r0.D
            r11.C = r0
            ea6 r0 = new ea6
            r0.<init>(r11)
            r10.j = r0
        L_0x006d:
            if (r7 != 0) goto L_0x0078
            boolean r11 = r10.h
            if (r11 == 0) goto L_0x0078
            java.util.concurrent.atomic.AtomicBoolean r10 = r10.i
            r10.set(r4)
        L_0x0078:
            long r10 = r2.presentationTimeUs
            java.util.LinkedHashMap r10 = defpackage.p94.a
            java.lang.Class<p94> r10 = defpackage.p94.class
            monitor-enter(r10)
            java.lang.Class<p94> r11 = defpackage.p94.class
            monitor-enter(r11)     // Catch:{ all -> 0x0087 }
            monitor-exit(r11)     // Catch:{ all -> 0x0087 }
            monitor-exit(r10)
            goto L_0x0089
        L_0x0085:
            monitor-exit(r10)     // Catch:{ all -> 0x0087 }
            throw r11
        L_0x0087:
            r11 = move-exception
            goto L_0x0085
        L_0x0089:
            return r5
        L_0x008a:
            int r3 = r2.flags
            r3 = r3 & 4
            if (r3 == 0) goto L_0x00af
            r10.o = r4
            java.util.LinkedHashMap r3 = defpackage.p94.a
            java.lang.Class<p94> r3 = defpackage.p94.class
            monitor-enter(r3)
            java.lang.Class<p94> r7 = defpackage.p94.class
            monitor-enter(r7)     // Catch:{ all -> 0x00ad }
            monitor-exit(r7)     // Catch:{ all -> 0x00ad }
            monitor-exit(r3)
            int r3 = r2.size
            if (r3 != 0) goto L_0x00a4
            r10.i()
            return r5
        L_0x00a4:
            int r3 = r2.flags
            r3 = r3 & -5
            r2.flags = r3
            goto L_0x00af
        L_0x00ab:
            monitor-exit(r3)     // Catch:{ all -> 0x00ad }
            throw r10
        L_0x00ad:
            r10 = move-exception
            goto L_0x00ab
        L_0x00af:
            int r3 = r2.flags
            r3 = r3 & r6
            if (r3 == 0) goto L_0x00b8
            r10.i()
            return r5
        L_0x00b8:
            if (r11 == 0) goto L_0x00de
            int r11 = r10.m     // Catch:{ RuntimeException -> 0x00d5 }
            java.nio.ByteBuffer r11 = r1.getOutputBuffer(r11)     // Catch:{ RuntimeException -> 0x00d5 }
            r11.getClass()     // Catch:{ RuntimeException -> 0x00d5 }
            r10.k = r11     // Catch:{ RuntimeException -> 0x00d5 }
            int r0 = r2.offset
            r11.position(r0)
            java.nio.ByteBuffer r10 = r10.k
            int r11 = r2.offset
            int r0 = r2.size
            int r11 = r11 + r0
            r10.limit(r11)
            goto L_0x00de
        L_0x00d5:
            r11 = move-exception
            defpackage.i8b.l(r11, r0)
            androidx.media3.transformer.ExportException r10 = r10.a(r11)
            throw r10
        L_0x00de:
            return r4
        L_0x00df:
            r11 = move-exception
            defpackage.i8b.l(r11, r0)
            androidx.media3.transformer.ExportException r10 = r10.a(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.md4.f(boolean):boolean");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: CFG modification limit reached, blocks count: 149 */
    public final void g(defpackage.ba4 r10) {
        /*
            r9 = this;
            boolean r0 = r9.n
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "Input buffer can not be queued after the input stream has ended."
            defpackage.n79.m(r2, r0)
            java.nio.ByteBuffer r0 = r10.v
            r2 = 0
            if (r0 == 0) goto L_0x0021
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L_0x0021
            java.nio.ByteBuffer r0 = r10.v
            int r0 = r0.position()
            java.nio.ByteBuffer r3 = r10.v
            int r3 = r3.remaining()
            goto L_0x0023
        L_0x0021:
            r0 = r2
            r3 = r0
        L_0x0023:
            long r4 = r10.x
            r6 = 4
            boolean r7 = r10.h(r6)
            if (r7 == 0) goto L_0x0055
            r9.n = r1
            java.util.LinkedHashMap r7 = defpackage.p94.a
            java.lang.Class<p94> r7 = defpackage.p94.class
            monitor-enter(r7)
            java.lang.Class<p94> r8 = defpackage.p94.class
            monitor-enter(r8)     // Catch:{ all -> 0x0053 }
            monitor-exit(r8)     // Catch:{ all -> 0x0053 }
            monitor-exit(r7)
            boolean r7 = r9.g
            if (r7 == 0) goto L_0x004f
            java.nio.ByteBuffer r0 = r10.v
            if (r0 == 0) goto L_0x0048
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r1 = r2
        L_0x0048:
            defpackage.n79.n(r1)
            r4 = 0
            r3 = r2
            goto L_0x0057
        L_0x004f:
            r2 = r0
            goto L_0x0057
        L_0x0051:
            monitor-exit(r7)     // Catch:{ all -> 0x0053 }
            throw r9
        L_0x0053:
            r9 = move-exception
            goto L_0x0051
        L_0x0055:
            r6 = r2
            goto L_0x004f
        L_0x0057:
            android.media.MediaCodec r0 = r9.d     // Catch:{ RuntimeException -> 0x0073 }
            int r1 = r9.l     // Catch:{ RuntimeException -> 0x0073 }
            r0.queueInputBuffer(r1, r2, r3, r4, r6)     // Catch:{ RuntimeException -> 0x0073 }
            java.util.LinkedHashMap r0 = defpackage.p94.a
            java.lang.Class<p94> r0 = defpackage.p94.class
            monitor-enter(r0)
            java.lang.Class<p94> r1 = defpackage.p94.class
            monitor-enter(r1)     // Catch:{ all -> 0x0071 }
            monitor-exit(r1)     // Catch:{ all -> 0x0071 }
            monitor-exit(r0)
            r0 = -1
            r9.l = r0
            r9 = 0
            r10.v = r9
            return
        L_0x006f:
            monitor-exit(r0)     // Catch:{ all -> 0x0071 }
            throw r9
        L_0x0071:
            r9 = move-exception
            goto L_0x006f
        L_0x0073:
            r10 = move-exception
            java.lang.String r0 = "MediaCodec error"
            defpackage.i8b.l(r10, r0)
            androidx.media3.transformer.ExportException r9 = r9.a(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.md4.g(ba4):void");
    }

    public final void h() {
        this.k = null;
        Surface surface = this.e;
        if (surface != null) {
            surface.release();
        }
        this.d.release();
    }

    public final void i() {
        MediaCodec.BufferInfo bufferInfo = this.a;
        n79.o(bufferInfo);
        j(bufferInfo.presentationTimeUs, false);
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 126 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(long r4, boolean r6) {
        /*
            r3 = this;
            r0 = 0
            r3.k = r0
            android.media.MediaCodec r0 = r3.d
            if (r6 == 0) goto L_0x0020
            int r6 = r3.m     // Catch:{ RuntimeException -> 0x001e }
            r1 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r1
            r0.releaseOutputBuffer(r6, r4)     // Catch:{ RuntimeException -> 0x001e }
            java.util.LinkedHashMap r4 = defpackage.p94.a     // Catch:{ RuntimeException -> 0x001e }
            java.lang.Class<p94> r4 = defpackage.p94.class
            monitor-enter(r4)     // Catch:{ RuntimeException -> 0x001e }
            java.lang.Class<p94> r5 = defpackage.p94.class
            monitor-enter(r5)     // Catch:{ all -> 0x001c }
            monitor-exit(r5)     // Catch:{ all -> 0x001c }
            monitor-exit(r4)     // Catch:{ RuntimeException -> 0x001e }
            goto L_0x0026
        L_0x001a:
            monitor-exit(r4)     // Catch:{ all -> 0x001c }
            throw r5     // Catch:{ RuntimeException -> 0x001e }
        L_0x001c:
            r5 = move-exception
            goto L_0x001a
        L_0x001e:
            r4 = move-exception
            goto L_0x002a
        L_0x0020:
            int r4 = r3.m     // Catch:{ RuntimeException -> 0x001e }
            r5 = 0
            r0.releaseOutputBuffer(r4, r5)     // Catch:{ RuntimeException -> 0x001e }
        L_0x0026:
            r4 = -1
            r3.m = r4
            return
        L_0x002a:
            java.lang.String r5 = "MediaCodec error"
            defpackage.i8b.l(r4, r5)
            androidx.media3.transformer.ExportException r3 = r3.a(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.md4.j(long, boolean):void");
    }
}
