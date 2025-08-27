package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: ulf  reason: default package */
public final class ulf {
    public final int a;
    public volatile boolean b;
    public final a0a c = cvg.a();
    public final Lazy d;
    public final Lazy e;
    public final String f;
    public rlf g;
    public AsynchronousSocketChannel h;
    public final Lazy i;
    public final Lazy j;

    public ulf(Lazy lazy, Lazy lazy2, int i2) {
        this.a = i2;
        this.d = lazy;
        this.e = lazy2;
        this.f = ulf.class.getName();
        this.i = LazyKt.lazy(new vra(29, lazy2, this));
        this.j = LazyKt.lazy(new a2d(10, lazy2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.slf
            if (r0 == 0) goto L_0x0013
            r0 = r5
            slf r0 = (defpackage.slf) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            slf r0 = new slf
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            ulf r4 = r0.a
            kotlin.ResultKt.throwOnFailure(r5)     // Catch:{ all -> 0x002b }
            goto L_0x0047
        L_0x002b:
            r5 = move-exception
            goto L_0x006f
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r5)
            rlf r5 = r4.g     // Catch:{ all -> 0x002b }
            if (r5 == 0) goto L_0x0047
            r0.a = r4     // Catch:{ all -> 0x002b }
            r0.o = r3     // Catch:{ all -> 0x002b }
            java.lang.Object r5 = r5.e(r0)     // Catch:{ all -> 0x002b }
            if (r5 != r1) goto L_0x0047
            return r1
        L_0x0047:
            r5 = 0
            r4.b = r5     // Catch:{ all -> 0x002b }
            kotlin.Lazy r5 = r4.e
            java.lang.Object r5 = r5.getValue()
            tt0 r5 = (defpackage.tt0) r5
            java.nio.ByteBuffer r0 = r4.c()
            r5.b(r0)
            kotlin.Lazy r5 = r4.e
            java.lang.Object r5 = r5.getValue()
            tt0 r5 = (defpackage.tt0) r5
            kotlin.Lazy r4 = r4.j
            java.lang.Object r4 = r4.getValue()
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            r5.b(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L_0x006f:
            kotlin.Lazy r0 = r4.e
            java.lang.Object r0 = r0.getValue()
            tt0 r0 = (defpackage.tt0) r0
            java.nio.ByteBuffer r1 = r4.c()
            r0.b(r1)
            kotlin.Lazy r0 = r4.e
            java.lang.Object r0 = r0.getValue()
            tt0 r0 = (defpackage.tt0) r0
            kotlin.Lazy r4 = r4.j
            java.lang.Object r4 = r4.getValue()
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            r0.b(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ulf.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ab A[Catch:{ Exception -> 0x014a, all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b3 A[SYNTHETIC, Splitter:B:39:0x00b3] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f0 A[Catch:{ all -> 0x0176 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0139 A[Catch:{ Exception -> 0x014a, all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x014c A[SYNTHETIC, Splitter:B:66:0x014c] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0178 A[SYNTHETIC, Splitter:B:78:0x0178] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0192 A[Catch:{ all -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x019a A[Catch:{ all -> 0x0198 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.tlf
            if (r0 == 0) goto L_0x0013
            r0 = r15
            tlf r0 = (defpackage.tlf) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            tlf r0 = new tlf
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.w
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.y
            java.lang.String r3 = "Required value was null."
            r4 = 443(0x1bb, float:6.21E-43)
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r2 == 0) goto L_0x0090
            if (r2 == r8) goto L_0x007d
            if (r2 == r7) goto L_0x005f
            if (r2 == r6) goto L_0x004b
            if (r2 == r5) goto L_0x003b
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003b:
            java.lang.Object r13 = r0.b
            java.lang.Exception r13 = (java.lang.Exception) r13
            java.lang.Object r14 = r0.a
            xz9 r14 = (defpackage.xz9) r14
            kotlin.ResultKt.throwOnFailure(r15)     // Catch:{ all -> 0x0048 }
            goto L_0x0173
        L_0x0048:
            r13 = move-exception
            goto L_0x01a9
        L_0x004b:
            java.lang.Object r13 = r0.c
            javax.net.ssl.SSLEngine r13 = (javax.net.ssl.SSLEngine) r13
            java.lang.Object r14 = r0.b
            xz9 r14 = (defpackage.xz9) r14
            java.lang.Object r2 = r0.a
            ulf r2 = (defpackage.ulf) r2
            kotlin.ResultKt.throwOnFailure(r15)     // Catch:{ all -> 0x005c }
            goto L_0x012d
        L_0x005c:
            r13 = move-exception
            goto L_0x0185
        L_0x005f:
            ulf r13 = r0.v
            javax.net.ssl.SSLEngine r14 = r0.o
            java.lang.Object r2 = r0.c
            xz9 r2 = (defpackage.xz9) r2
            java.lang.Object r7 = r0.b
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r10 = r0.a
            ulf r10 = (defpackage.ulf) r10
            kotlin.ResultKt.throwOnFailure(r15)     // Catch:{ all -> 0x0078 }
            r12 = r7
            r7 = r2
            r2 = r10
            r10 = r12
            goto L_0x00e8
        L_0x0078:
            r13 = move-exception
            r14 = r2
            r2 = r10
            goto L_0x0185
        L_0x007d:
            java.lang.Object r13 = r0.c
            xz9 r13 = (defpackage.xz9) r13
            java.lang.Object r14 = r0.b
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r2 = r0.a
            ulf r2 = (defpackage.ulf) r2
            kotlin.ResultKt.throwOnFailure(r15)
            r15 = r14
            r14 = r13
            r13 = r2
            goto L_0x00a7
        L_0x0090:
            kotlin.ResultKt.throwOnFailure(r15)
            a0a r15 = r13.c
            r0.a = r13
            r0.b = r14
            r0.c = r15
            r0.y = r8
            java.lang.Object r2 = r15.d(r0)
            if (r2 != r1) goto L_0x00a4
            return r1
        L_0x00a4:
            r12 = r15
            r15 = r14
            r14 = r12
        L_0x00a7:
            boolean r2 = r13.b     // Catch:{ all -> 0x0048 }
            if (r2 == 0) goto L_0x00b3
            kotlin.Unit r13 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0048 }
            a0a r14 = (defpackage.a0a) r14
            r14.e(r9)
            return r13
        L_0x00b3:
            kotlin.Lazy r2 = r13.d     // Catch:{ all -> 0x0182 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0182 }
            javax.net.ssl.SSLContext r2 = (javax.net.ssl.SSLContext) r2     // Catch:{ all -> 0x0182 }
            javax.net.ssl.SSLEngine r2 = r2.createSSLEngine(r15, r4)     // Catch:{ all -> 0x0182 }
            r2.setUseClientMode(r8)     // Catch:{ all -> 0x0182 }
            int r10 = r15.hashCode()     // Catch:{ all -> 0x0182 }
            android.net.TrafficStats.setThreadStatsTag(r10)     // Catch:{ all -> 0x0182 }
            dle r10 = new dle     // Catch:{ all -> 0x0182 }
            r11 = 26
            r10.<init>(r11)     // Catch:{ all -> 0x0182 }
            r0.a = r13     // Catch:{ all -> 0x0182 }
            r0.b = r15     // Catch:{ all -> 0x0182 }
            r0.c = r14     // Catch:{ all -> 0x0182 }
            r0.o = r2     // Catch:{ all -> 0x0182 }
            r0.v = r13     // Catch:{ all -> 0x0182 }
            r0.y = r7     // Catch:{ all -> 0x0182 }
            java.lang.Object r7 = defpackage.ryg.W(r10, r0)     // Catch:{ all -> 0x0182 }
            if (r7 != r1) goto L_0x00e3
            return r1
        L_0x00e3:
            r10 = r15
            r15 = r7
            r7 = r14
            r14 = r2
            r2 = r13
        L_0x00e8:
            java.nio.channels.AsynchronousSocketChannel r15 = (java.nio.channels.AsynchronousSocketChannel) r15     // Catch:{ all -> 0x0176 }
            r13.h = r15     // Catch:{ all -> 0x0176 }
            java.nio.channels.AsynchronousSocketChannel r13 = r2.h     // Catch:{ all -> 0x0176 }
            if (r13 == 0) goto L_0x0178
            java.net.InetSocketAddress r15 = new java.net.InetSocketAddress     // Catch:{ all -> 0x0176 }
            r15.<init>(r10, r4)     // Catch:{ all -> 0x0176 }
            r0.a = r2     // Catch:{ all -> 0x0176 }
            r0.b = r7     // Catch:{ all -> 0x0176 }
            r0.c = r14     // Catch:{ all -> 0x0176 }
            r0.o = r9     // Catch:{ all -> 0x0176 }
            r0.v = r9     // Catch:{ all -> 0x0176 }
            r0.y = r6     // Catch:{ all -> 0x0176 }
            lw1 r4 = new lw1     // Catch:{ all -> 0x0176 }
            kotlin.coroutines.Continuation r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)     // Catch:{ all -> 0x0176 }
            r4.<init>(r8, r6)     // Catch:{ all -> 0x0176 }
            r4.u()     // Catch:{ all -> 0x0176 }
            ev r6 = defpackage.ev.c     // Catch:{ all -> 0x0176 }
            r13.connect(r15, r4, r6)     // Catch:{ all -> 0x0176 }
            java.lang.Object r13 = r4.t()     // Catch:{ all -> 0x0176 }
            java.lang.Object r15 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch:{ all -> 0x0176 }
            if (r13 != r15) goto L_0x011f
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)     // Catch:{ all -> 0x0176 }
        L_0x011f:
            java.lang.Object r15 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch:{ all -> 0x0176 }
            if (r13 != r15) goto L_0x0126
            goto L_0x0128
        L_0x0126:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0176 }
        L_0x0128:
            if (r13 != r1) goto L_0x012b
            return r1
        L_0x012b:
            r13 = r14
            r14 = r7
        L_0x012d:
            kotlin.Lazy r15 = r2.e     // Catch:{ Exception -> 0x014a }
            java.lang.Object r15 = r15.getValue()     // Catch:{ Exception -> 0x014a }
            tt0 r15 = (defpackage.tt0) r15     // Catch:{ Exception -> 0x014a }
            java.nio.channels.AsynchronousSocketChannel r4 = r2.h     // Catch:{ Exception -> 0x014a }
            if (r4 == 0) goto L_0x014c
            rlf r3 = new rlf     // Catch:{ Exception -> 0x014a }
            r3.<init>(r15, r13, r4)     // Catch:{ Exception -> 0x014a }
            r2.g = r3     // Catch:{ Exception -> 0x014a }
            r2.b = r8     // Catch:{ Exception -> 0x014a }
            kotlin.Unit r13 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0048 }
            a0a r14 = (defpackage.a0a) r14
            r14.e(r9)
            return r13
        L_0x014a:
            r13 = move-exception
            goto L_0x0156
        L_0x014c:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x014a }
            java.lang.String r15 = r3.toString()     // Catch:{ Exception -> 0x014a }
            r13.<init>(r15)     // Catch:{ Exception -> 0x014a }
            throw r13     // Catch:{ Exception -> 0x014a }
        L_0x0156:
            java.lang.String r15 = r2.f     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "Got exception during connecting"
            defpackage.z68.f(r15, r3, r13)     // Catch:{ all -> 0x0048 }
            r15 = 0
            r2.b = r15     // Catch:{ all -> 0x0048 }
            rlf r15 = r2.g     // Catch:{ all -> 0x0048 }
            if (r15 == 0) goto L_0x0173
            r0.a = r14     // Catch:{ all -> 0x0048 }
            r0.b = r13     // Catch:{ all -> 0x0048 }
            r0.c = r9     // Catch:{ all -> 0x0048 }
            r0.y = r5     // Catch:{ all -> 0x0048 }
            java.lang.Object r15 = r15.e(r0)     // Catch:{ all -> 0x0048 }
            if (r15 != r1) goto L_0x0173
            return r1
        L_0x0173:
            throw r13     // Catch:{ all -> 0x0048 }
        L_0x0174:
            r14 = r7
            goto L_0x0185
        L_0x0176:
            r13 = move-exception
            goto L_0x0174
        L_0x0178:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0176 }
            java.lang.String r14 = r3.toString()     // Catch:{ all -> 0x0176 }
            r13.<init>(r14)     // Catch:{ all -> 0x0176 }
            throw r13     // Catch:{ all -> 0x0176 }
        L_0x0182:
            r15 = move-exception
            r2 = r13
            r13 = r15
        L_0x0185:
            java.lang.String r15 = r2.f     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = "Got exception during initialize and connect raw channel"
            defpackage.z68.f(r15, r0, r13)     // Catch:{ all -> 0x0048 }
            kotlin.Result$Companion r15 = kotlin.Result.Companion     // Catch:{ all -> 0x0198 }
            java.nio.channels.AsynchronousSocketChannel r15 = r2.h     // Catch:{ all -> 0x0198 }
            if (r15 == 0) goto L_0x019a
            r15.close()     // Catch:{ all -> 0x0198 }
            kotlin.Unit r15 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0198 }
            goto L_0x019b
        L_0x0198:
            r15 = move-exception
            goto L_0x019f
        L_0x019a:
            r15 = r9
        L_0x019b:
            kotlin.Result.m23constructorimpl(r15)     // Catch:{ all -> 0x0198 }
            goto L_0x01a8
        L_0x019f:
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x0048 }
            java.lang.Object r15 = kotlin.ResultKt.createFailure(r15)     // Catch:{ all -> 0x0048 }
            kotlin.Result.m23constructorimpl(r15)     // Catch:{ all -> 0x0048 }
        L_0x01a8:
            throw r13     // Catch:{ all -> 0x0048 }
        L_0x01a9:
            a0a r14 = (defpackage.a0a) r14
            r14.e(r9)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ulf.b(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final ByteBuffer c() {
        return (ByteBuffer) this.i.getValue();
    }

    public final Object d(ByteBuffer byteBuffer, ContinuationImpl continuationImpl) {
        rlf rlf = this.g;
        if (rlf != null) {
            return rlf.n(new nw0(byteBuffer), continuationImpl);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
