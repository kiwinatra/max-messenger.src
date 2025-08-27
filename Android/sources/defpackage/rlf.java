package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousByteChannel;
import javax.net.ssl.SSLEngine;

/* renamed from: rlf  reason: default package */
public final class rlf {
    public final SSLEngine a;
    public final AsynchronousByteChannel b;
    public final String c = rlf.class.getName();
    public final a0a d = cvg.a();
    public volatile boolean e;
    public volatile boolean f;
    public volatile boolean g;
    public volatile boolean h;
    public final zt0 i;
    public final zt0 j;
    public final zt0 k;
    public nw0 l;
    public int m;
    public final nw0 n;

    public rlf(tt0 tt0, SSLEngine sSLEngine, AsynchronousByteChannel asynchronousByteChannel) {
        this.a = sSLEngine;
        this.b = asynchronousByteChannel;
        this.i = new zt0("inEncrypted", true, tt0);
        this.j = new zt0("outEncrypted", false, tt0);
        this.k = new zt0("inPlain", true, tt0);
        this.n = new nw0(new ByteBuffer[]{ByteBuffer.allocate(0)});
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0082 A[Catch:{ all -> 0x0031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0089 A[Catch:{ all -> 0x0031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.nio.ByteBuffer r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            java.lang.String r0 = "Read from channel; response: "
            boolean r1 = r9 instanceof defpackage.alf
            if (r1 == 0) goto L_0x0015
            r1 = r9
            alf r1 = (defpackage.alf) r1
            int r2 = r1.w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.w = r2
            goto L_0x001a
        L_0x0015:
            alf r1 = new alf
            r1.<init>(r7, r9)
        L_0x001a:
            java.lang.Object r9 = r1.o
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.w
            r4 = 1
            if (r3 == 0) goto L_0x003b
            if (r3 != r4) goto L_0x0033
            rlf r7 = r1.c
            java.nio.ByteBuffer r8 = r1.b
            rlf r1 = r1.a
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ all -> 0x0031 }
            goto L_0x0060
        L_0x0031:
            r7 = move-exception
            goto L_0x0092
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlin.Result$Companion r9 = kotlin.Result.Companion     // Catch:{ all -> 0x008f }
            java.lang.String r9 = r7.c     // Catch:{ all -> 0x008f }
            java.lang.String r3 = "Reading from channel"
            defpackage.z68.l(r9, r3, new java.lang.Object[0])     // Catch:{ all -> 0x008f }
            blf r9 = new blf     // Catch:{ all -> 0x008f }
            r3 = 0
            r9.<init>(r7, r8, r3)     // Catch:{ all -> 0x008f }
            r1.a = r7     // Catch:{ all -> 0x008f }
            r1.b = r8     // Catch:{ all -> 0x008f }
            r1.c = r7     // Catch:{ all -> 0x008f }
            r1.w = r4     // Catch:{ all -> 0x008f }
            r5 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r9 = defpackage.okf.b(r5, r9, r1)     // Catch:{ all -> 0x008f }
            if (r9 != r2) goto L_0x005f
            return r2
        L_0x005f:
            r1 = r7
        L_0x0060:
            java.lang.Number r9 = (java.lang.Number) r9     // Catch:{ all -> 0x0031 }
            int r9 = r9.intValue()     // Catch:{ all -> 0x0031 }
            java.lang.String r7 = r7.c     // Catch:{ all -> 0x0031 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0031 }
            r2.<init>(r0)     // Catch:{ all -> 0x0031 }
            r2.append(r9)     // Catch:{ all -> 0x0031 }
            java.lang.String r0 = ", buffer: "
            r2.append(r0)     // Catch:{ all -> 0x0031 }
            r2.append(r8)     // Catch:{ all -> 0x0031 }
            java.lang.String r8 = r2.toString()     // Catch:{ all -> 0x0031 }
            defpackage.z68.l(r7, r8, new java.lang.Object[0])     // Catch:{ all -> 0x0031 }
            r7 = -1
            if (r9 == r7) goto L_0x0089
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0031 }
            java.lang.Object r7 = kotlin.Result.m23constructorimpl(r7)     // Catch:{ all -> 0x0031 }
            goto L_0x009c
        L_0x0089:
            ykf r7 = new ykf     // Catch:{ all -> 0x0031 }
            r7.<init>()     // Catch:{ all -> 0x0031 }
            throw r7     // Catch:{ all -> 0x0031 }
        L_0x008f:
            r8 = move-exception
            r1 = r7
            r7 = r8
        L_0x0092:
            kotlin.Result$Companion r8 = kotlin.Result.Companion
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)
            java.lang.Object r7 = kotlin.Result.m23constructorimpl(r7)
        L_0x009c:
            java.lang.Throwable r8 = kotlin.Result.m26exceptionOrNullimpl(r7)
            if (r8 == 0) goto L_0x00a4
            r1.f = r4
        L_0x00a4:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rlf.a(java.nio.ByteBuffer, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.nio.ByteBuffer r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.clf
            if (r0 == 0) goto L_0x0013
            r0 = r11
            clf r0 = (defpackage.clf) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            clf r0 = new clf
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.nio.ByteBuffer r9 = r0.b
            rlf r10 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)
            r8 = r10
            r10 = r9
            r9 = r8
            goto L_0x003b
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r11)
        L_0x003b:
            boolean r11 = r10.hasRemaining()
            if (r11 == 0) goto L_0x007c
            java.lang.String r11 = r9.c
            a67 r2 = defpackage.z68.b
            r4 = 0
            if (r2 != 0) goto L_0x0049
            goto L_0x0067
        L_0x0049:
            boolean r5 = r2.c()
            if (r5 == 0) goto L_0x0067
            w78 r5 = defpackage.w78.c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "calling channel.write("
            r6.<init>(r7)
            r6.append(r10)
            java.lang.String r7 = ")"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r2.d(r5, r11, r6, r4)
        L_0x0067:
            dlf r11 = new dlf
            r11.<init>(r9, r10, r4)
            r0.a = r9
            r0.b = r10
            r0.v = r3
            r4 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r11 = defpackage.okf.b(r4, r11, r0)
            if (r11 != r1) goto L_0x003b
            return r1
        L_0x007c:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rlf.b(java.nio.ByteBuffer, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0063 A[Catch:{ SSLException -> 0x0032, all -> 0x002f }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064 A[Catch:{ SSLException -> 0x0032, all -> 0x002f }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(defpackage.nw0 r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            java.lang.String r0 = "engine.unwrap() result="
            boolean r1 = r10 instanceof defpackage.elf
            if (r1 == 0) goto L_0x0015
            r1 = r10
            elf r1 = (defpackage.elf) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.v = r2
            goto L_0x001a
        L_0x0015:
            elf r1 = new elf
            r1.<init>(r8, r10)
        L_0x001a:
            java.lang.Object r10 = r1.c
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.v
            r4 = 1
            if (r3 == 0) goto L_0x003c
            if (r3 != r4) goto L_0x0034
            nw0 r9 = r1.b
            rlf r8 = r1.a
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ SSLException -> 0x0032 }
            goto L_0x005b
        L_0x002f:
            r9 = move-exception
            goto L_0x00a9
        L_0x0032:
            r9 = move-exception
            goto L_0x00a6
        L_0x0034:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003c:
            kotlin.ResultKt.throwOnFailure(r10)
            zt0 r10 = r8.i
            java.nio.ByteBuffer r10 = r10.e()
            r10.flip()
            xkf r10 = new xkf     // Catch:{ SSLException -> 0x0032 }
            r3 = 1
            r10.<init>(r8, r9, r3)     // Catch:{ SSLException -> 0x0032 }
            r1.a = r8     // Catch:{ SSLException -> 0x0032 }
            r1.b = r9     // Catch:{ SSLException -> 0x0032 }
            r1.v = r4     // Catch:{ SSLException -> 0x0032 }
            java.lang.Object r10 = defpackage.ryg.W(r10, r1)     // Catch:{ SSLException -> 0x0032 }
            if (r10 != r2) goto L_0x005b
            return r2
        L_0x005b:
            javax.net.ssl.SSLEngineResult r10 = (javax.net.ssl.SSLEngineResult) r10     // Catch:{ SSLException -> 0x0032 }
            java.lang.String r1 = r8.c     // Catch:{ SSLException -> 0x0032 }
            a67 r2 = defpackage.z68.b     // Catch:{ SSLException -> 0x0032 }
            if (r2 != 0) goto L_0x0064
            goto L_0x009c
        L_0x0064:
            boolean r3 = r2.c()     // Catch:{ SSLException -> 0x0032 }
            if (r3 == 0) goto L_0x009c
            w78 r3 = defpackage.w78.c     // Catch:{ SSLException -> 0x0032 }
            javax.net.ssl.SSLEngine r5 = r8.a     // Catch:{ SSLException -> 0x0032 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = r5.getHandshakeStatus()     // Catch:{ SSLException -> 0x0032 }
            zt0 r6 = r8.i     // Catch:{ SSLException -> 0x0032 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SSLException -> 0x0032 }
            r7.<init>(r0)     // Catch:{ SSLException -> 0x0032 }
            r7.append(r10)     // Catch:{ SSLException -> 0x0032 }
            java.lang.String r0 = ", engineStatus="
            r7.append(r0)     // Catch:{ SSLException -> 0x0032 }
            r7.append(r5)     // Catch:{ SSLException -> 0x0032 }
            java.lang.String r0 = ", inEncrypted="
            r7.append(r0)     // Catch:{ SSLException -> 0x0032 }
            r7.append(r6)     // Catch:{ SSLException -> 0x0032 }
            java.lang.String r0 = ", dest="
            r7.append(r0)     // Catch:{ SSLException -> 0x0032 }
            r7.append(r9)     // Catch:{ SSLException -> 0x0032 }
            java.lang.String r9 = r7.toString()     // Catch:{ SSLException -> 0x0032 }
            r0 = 0
            r2.d(r3, r1, r9, r0)     // Catch:{ SSLException -> 0x0032 }
        L_0x009c:
            zt0 r8 = r8.i
            java.nio.ByteBuffer r8 = r8.e()
            r8.compact()
            return r10
        L_0x00a6:
            r8.f = r4     // Catch:{ all -> 0x002f }
            throw r9     // Catch:{ all -> 0x002f }
        L_0x00a9:
            zt0 r8 = r8.i
            java.nio.ByteBuffer r8 = r8.e()
            r8.compact()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rlf.c(nw0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(defpackage.nw0 r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            java.lang.String r0 = "engine.wrap() result: ["
            boolean r1 = r8 instanceof defpackage.flf
            if (r1 == 0) goto L_0x0015
            r1 = r8
            flf r1 = (defpackage.flf) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.v = r2
            goto L_0x001a
        L_0x0015:
            flf r1 = new flf
            r1.<init>(r6, r8)
        L_0x001a:
            java.lang.Object r8 = r1.c
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.v
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            nw0 r7 = r1.b
            rlf r6 = r1.a
            kotlin.ResultKt.throwOnFailure(r8)     // Catch:{ SSLException -> 0x002f }
            goto L_0x004f
        L_0x002f:
            r7 = move-exception
            goto L_0x0083
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0039:
            kotlin.ResultKt.throwOnFailure(r8)
            xkf r8 = new xkf     // Catch:{ SSLException -> 0x002f }
            r3 = 0
            r8.<init>(r6, r7, r3)     // Catch:{ SSLException -> 0x002f }
            r1.a = r6     // Catch:{ SSLException -> 0x002f }
            r1.b = r7     // Catch:{ SSLException -> 0x002f }
            r1.v = r4     // Catch:{ SSLException -> 0x002f }
            java.lang.Object r8 = defpackage.ryg.W(r8, r1)     // Catch:{ SSLException -> 0x002f }
            if (r8 != r2) goto L_0x004f
            return r2
        L_0x004f:
            javax.net.ssl.SSLEngineResult r8 = (javax.net.ssl.SSLEngineResult) r8     // Catch:{ SSLException -> 0x002f }
            java.lang.String r1 = r6.c     // Catch:{ SSLException -> 0x002f }
            javax.net.ssl.SSLEngine r2 = r6.a     // Catch:{ SSLException -> 0x002f }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = r2.getHandshakeStatus()     // Catch:{ SSLException -> 0x002f }
            zt0 r3 = r6.j     // Catch:{ SSLException -> 0x002f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SSLException -> 0x002f }
            r5.<init>(r0)     // Catch:{ SSLException -> 0x002f }
            r5.append(r8)     // Catch:{ SSLException -> 0x002f }
            java.lang.String r0 = "]; engine status: "
            r5.append(r0)     // Catch:{ SSLException -> 0x002f }
            r5.append(r2)     // Catch:{ SSLException -> 0x002f }
            java.lang.String r0 = "; srcBuffer: "
            r5.append(r0)     // Catch:{ SSLException -> 0x002f }
            r5.append(r7)     // Catch:{ SSLException -> 0x002f }
            java.lang.String r7 = ", outEncrypted: "
            r5.append(r7)     // Catch:{ SSLException -> 0x002f }
            r5.append(r3)     // Catch:{ SSLException -> 0x002f }
            java.lang.String r7 = r5.toString()     // Catch:{ SSLException -> 0x002f }
            defpackage.z68.l(r1, r7, new java.lang.Object[0])     // Catch:{ SSLException -> 0x002f }
            return r8
        L_0x0083:
            r6.f = r4
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rlf.d(nw0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0075 A[Catch:{ all -> 0x0031, all -> 0x00a8 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0080 A[Catch:{ all -> 0x0031, all -> 0x00a8 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.glf
            if (r0 == 0) goto L_0x0013
            r0 = r7
            glf r0 = (defpackage.glf) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            glf r0 = new glf
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r5) goto L_0x0041
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            rlf r6 = r0.a
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ all -> 0x0031 }
            goto L_0x0081
        L_0x0031:
            r7 = move-exception
            goto L_0x009d
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            rlf r6 = r0.a
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ all -> 0x0031 }
            goto L_0x0076
        L_0x0041:
            rlf r6 = r0.a
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ all -> 0x0031 }
            goto L_0x0064
        L_0x0047:
            kotlin.ResultKt.throwOnFailure(r7)
            boolean r7 = r6.g     // Catch:{ all -> 0x0031 }
            if (r7 != 0) goto L_0x008d
            boolean r7 = r6.f     // Catch:{ all -> 0x0031 }
            if (r7 != 0) goto L_0x0087
            r6.g = r5     // Catch:{ all -> 0x0031 }
            zt0 r7 = r6.j     // Catch:{ all -> 0x0031 }
            r7.c()     // Catch:{ all -> 0x0031 }
            r0.a = r6     // Catch:{ all -> 0x0031 }
            r0.o = r5     // Catch:{ all -> 0x0031 }
            java.lang.Object r7 = r6.p(r0)     // Catch:{ all -> 0x0031 }
            if (r7 != r1) goto L_0x0064
            return r1
        L_0x0064:
            javax.net.ssl.SSLEngine r7 = r6.a     // Catch:{ all -> 0x0031 }
            r7.closeOutbound()     // Catch:{ all -> 0x0031 }
            nw0 r7 = r6.n     // Catch:{ all -> 0x0031 }
            r0.a = r6     // Catch:{ all -> 0x0031 }
            r0.o = r4     // Catch:{ all -> 0x0031 }
            java.lang.Object r7 = r6.m(r7, r0)     // Catch:{ all -> 0x0031 }
            if (r7 != r1) goto L_0x0076
            return r1
        L_0x0076:
            r0.a = r6     // Catch:{ all -> 0x0031 }
            r0.o = r3     // Catch:{ all -> 0x0031 }
            java.lang.Object r7 = r6.p(r0)     // Catch:{ all -> 0x0031 }
            if (r7 != r1) goto L_0x0081
            return r1
        L_0x0081:
            java.nio.channels.AsynchronousByteChannel r7 = r6.b     // Catch:{ all -> 0x0031 }
            r7.close()     // Catch:{ all -> 0x0031 }
            goto L_0x008d
        L_0x0087:
            java.nio.channels.ClosedChannelException r7 = new java.nio.channels.ClosedChannelException     // Catch:{ all -> 0x0031 }
            r7.<init>()     // Catch:{ all -> 0x0031 }
            throw r7     // Catch:{ all -> 0x0031 }
        L_0x008d:
            zt0 r7 = r6.i
            r7.a()
            zt0 r7 = r6.k
            r7.a()
            zt0 r6 = r6.j
            r6.a()
            goto L_0x00a5
        L_0x009d:
            java.lang.String r0 = r6.c     // Catch:{ all -> 0x00a8 }
            java.lang.String r1 = "error doing TLS shutdown on close(), continuing"
            defpackage.z68.f(r0, r1, r7)     // Catch:{ all -> 0x00a8 }
            goto L_0x008d
        L_0x00a5:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L_0x00a8:
            r7 = move-exception
            zt0 r0 = r6.i
            r0.a()
            zt0 r0 = r6.k
            r0.a()
            zt0 r6 = r6.j
            r6.a()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rlf.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r9v15, types: [xz9] */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:11|12|13|50|51|52) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x00b8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0070 A[Catch:{ all -> 0x0078 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007d A[SYNTHETIC, Splitter:B:36:0x007d] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a4 A[Catch:{ ykf -> 0x00b8 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(kotlin.coroutines.Continuation r10) {
        /*
            r9 = this;
            r0 = 2
            boolean r1 = r10 instanceof defpackage.hlf
            if (r1 == 0) goto L_0x0014
            r1 = r10
            hlf r1 = (defpackage.hlf) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0014
            int r2 = r2 - r3
            r1.v = r2
            goto L_0x0019
        L_0x0014:
            hlf r1 = new hlf
            r1.<init>(r9, r10)
        L_0x0019:
            java.lang.Object r10 = r1.c
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.v
            r4 = 3
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x0052
            if (r3 == r5) goto L_0x0048
            if (r3 == r0) goto L_0x0040
            if (r3 != r4) goto L_0x0038
            xz9 r9 = r1.b
            rlf r0 = r1.a
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ ykf -> 0x00b8 }
            goto L_0x00a5
        L_0x0035:
            r10 = move-exception
            goto L_0x00be
        L_0x0038:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0040:
            xz9 r9 = r1.b
            rlf r0 = r1.a
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x0035 }
            goto L_0x0098
        L_0x0048:
            xz9 r9 = r1.b
            rlf r3 = r1.a
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = r9
            r9 = r3
            goto L_0x006c
        L_0x0052:
            kotlin.ResultKt.throwOnFailure(r10)
            boolean r10 = r9.f
            if (r10 != 0) goto L_0x00c4
            boolean r10 = r9.g
            if (r10 != 0) goto L_0x00c4
            a0a r10 = r9.d
            r1.a = r9
            r1.b = r10
            r1.v = r5
            java.lang.Object r3 = r10.d(r1)
            if (r3 != r2) goto L_0x006c
            return r2
        L_0x006c:
            boolean r3 = r9.e     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x007d
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0078 }
            a0a r10 = (defpackage.a0a) r10
            r10.e(r6)
            return r9
        L_0x0078:
            r9 = move-exception
            r8 = r10
            r10 = r9
            r9 = r8
            goto L_0x00be
        L_0x007d:
            java.lang.String r3 = r9.c     // Catch:{ all -> 0x0078 }
            java.lang.String r7 = "Starting SSLEngine.beginHandshake()"
            defpackage.z68.c(r3, r7, new java.lang.Object[0])     // Catch:{ all -> 0x0078 }
            wkf r3 = new wkf     // Catch:{ all -> 0x0078 }
            r3.<init>(r9, r0)     // Catch:{ all -> 0x0078 }
            r1.a = r9     // Catch:{ all -> 0x0078 }
            r1.b = r10     // Catch:{ all -> 0x0078 }
            r1.v = r0     // Catch:{ all -> 0x0078 }
            java.lang.Object r0 = defpackage.ryg.W(r3, r1)     // Catch:{ all -> 0x0078 }
            if (r0 != r2) goto L_0x0096
            return r2
        L_0x0096:
            r0 = r9
            r9 = r10
        L_0x0098:
            r1.a = r0     // Catch:{ ykf -> 0x00b8 }
            r1.b = r9     // Catch:{ ykf -> 0x00b8 }
            r1.v = r4     // Catch:{ ykf -> 0x00b8 }
            java.lang.Object r10 = r0.o(r1)     // Catch:{ ykf -> 0x00b8 }
            if (r10 != r2) goto L_0x00a5
            return r2
        L_0x00a5:
            java.lang.String r10 = r0.c     // Catch:{ ykf -> 0x00b8 }
            java.lang.String r1 = "Ended SSLEngine.beginHandshake()"
            defpackage.z68.c(r10, r1, new java.lang.Object[0])     // Catch:{ ykf -> 0x00b8 }
            r0.e = r5     // Catch:{ ykf -> 0x00b8 }
            kotlin.Unit r10 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0035 }
            a0a r9 = (defpackage.a0a) r9
            r9.e(r6)
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L_0x00b8:
            java.nio.channels.ClosedChannelException r10 = new java.nio.channels.ClosedChannelException     // Catch:{ all -> 0x0035 }
            r10.<init>()     // Catch:{ all -> 0x0035 }
            throw r10     // Catch:{ all -> 0x0035 }
        L_0x00be:
            a0a r9 = (defpackage.a0a) r9
            r9.e(r6)
            throw r10
        L_0x00c4:
            java.nio.channels.ClosedChannelException r9 = new java.nio.channels.ClosedChannelException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rlf.f(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.ilf
            if (r0 == 0) goto L_0x0013
            r0 = r8
            ilf r0 = (defpackage.ilf) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            ilf r0 = new ilf
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r6) goto L_0x0046
            if (r2 == r5) goto L_0x0043
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            rlf r7 = r0.a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x007d
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003c:
            rlf r7 = r0.a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x00be
        L_0x0043:
            rlf r7 = r0.a
            goto L_0x004c
        L_0x0046:
            rlf r7 = r0.a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x00a8
        L_0x004c:
            kotlin.ResultKt.throwOnFailure(r8)
        L_0x004f:
            javax.net.ssl.SSLEngine r8 = r7.a
            javax.net.ssl.SSLEngineResult$HandshakeStatus r8 = r8.getHandshakeStatus()
            if (r8 != 0) goto L_0x0059
            r8 = -1
            goto L_0x0061
        L_0x0059:
            int[] r2 = defpackage.zkf.$EnumSwitchMapping$0
            int r8 = r8.ordinal()
            r8 = r2[r8]
        L_0x0061:
            if (r8 == r6) goto L_0x00b3
            if (r8 == r5) goto L_0x009b
            if (r8 == r4) goto L_0x0098
            if (r8 == r3) goto L_0x008c
            r2 = 5
            if (r8 != r2) goto L_0x0080
            wkf r8 = new wkf
            r2 = 1
            r8.<init>(r7, r2)
            r0.a = r7
            r0.o = r3
            java.lang.Object r8 = defpackage.ryg.W(r8, r0)
            if (r8 != r1) goto L_0x007d
            return r1
        L_0x007d:
            kotlin.Unit r8 = (kotlin.Unit) r8
            goto L_0x004f
        L_0x0080:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Unsupported usage"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x008c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Unreachable status"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x0098:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L_0x009b:
            r0.a = r7
            r0.o = r6
            nw0 r8 = r7.n
            java.lang.Object r8 = r7.m(r8, r0)
            if (r8 != r1) goto L_0x00a8
            return r1
        L_0x00a8:
            r0.a = r7
            r0.o = r5
            java.lang.Object r8 = r7.p(r0)
            if (r8 != r1) goto L_0x004f
            return r1
        L_0x00b3:
            r0.a = r7
            r0.o = r4
            java.lang.Object r8 = r7.i(r0)
            if (r8 != r1) goto L_0x00be
            return r1
        L_0x00be:
            int r8 = r7.m
            if (r8 <= 0) goto L_0x004f
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rlf.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:(1:(1:(3:12|13|14)(2:16|17))(3:18|19|20))(3:21|22|23)|115|116|117|118) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:115:0x018b */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x017f A[Catch:{ ykf -> 0x018b }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0185 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b2 A[Catch:{ ykf -> 0x00e5, all -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c6 A[Catch:{ ykf -> 0x00e5, all -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c8 A[Catch:{ ykf -> 0x00e5, all -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d8 A[Catch:{ ykf -> 0x00e5, all -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ef A[SYNTHETIC, Splitter:B:63:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(defpackage.nw0 r19, kotlin.coroutines.Continuation r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r2 instanceof defpackage.jlf
            if (r3 == 0) goto L_0x0019
            r3 = r2
            jlf r3 = (defpackage.jlf) r3
            int r4 = r3.w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.w = r4
            goto L_0x001e
        L_0x0019:
            jlf r3 = new jlf
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.o
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.w
            r6 = 0
            r7 = 0
            r8 = 1
            r9 = 4
            r10 = 3
            r11 = 2
            r12 = -1
            if (r5 == 0) goto L_0x006b
            if (r5 == r8) goto L_0x0063
            if (r5 == r11) goto L_0x0058
            if (r5 == r10) goto L_0x004d
            if (r5 != r9) goto L_0x0045
            int r0 = r3.c
            nw0 r1 = r3.b
            rlf r5 = r3.a
            kotlin.ResultKt.throwOnFailure(r2)     // Catch:{ ykf -> 0x018b }
            goto L_0x014e
        L_0x0042:
            r0 = move-exception
            goto L_0x0194
        L_0x0045:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004d:
            int r0 = r3.c
            nw0 r1 = r3.b
            rlf r5 = r3.a
            kotlin.ResultKt.throwOnFailure(r2)     // Catch:{ ykf -> 0x018b }
            goto L_0x0160
        L_0x0058:
            int r0 = r3.c
            nw0 r1 = r3.b
            rlf r5 = r3.a
            kotlin.ResultKt.throwOnFailure(r2)     // Catch:{ ykf -> 0x018b }
            goto L_0x017c
        L_0x0063:
            nw0 r0 = r3.b
            rlf r1 = r3.a
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x00aa
        L_0x006b:
            kotlin.ResultKt.throwOnFailure(r2)
            java.lang.String r2 = r0.c
            a67 r5 = defpackage.z68.b
            if (r5 != 0) goto L_0x0075
            goto L_0x008e
        L_0x0075:
            boolean r13 = r5.c()
            if (r13 == 0) goto L_0x008e
            w78 r13 = defpackage.w78.o
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "read: dest="
            r14.<init>(r15)
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            r5.d(r13, r2, r14, r6)
        L_0x008e:
            long r13 = r19.a()
            r15 = 0
            int r2 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r2 <= 0) goto L_0x0199
            r3.a = r0
            r3.b = r1
            r3.w = r8
            java.lang.Object r2 = r0.f(r3)
            if (r2 != r4) goto L_0x00a5
            return r4
        L_0x00a5:
            r17 = r1
            r1 = r0
            r0 = r17
        L_0x00aa:
            boolean r2 = r1.f     // Catch:{ ykf -> 0x00e5, all -> 0x00e1 }
            if (r2 != 0) goto L_0x0185
            boolean r2 = r1.g     // Catch:{ ykf -> 0x00e5, all -> 0x00e1 }
            if (r2 != 0) goto L_0x0185
            r1.l = r0     // Catch:{ ykf -> 0x00e5, all -> 0x00e1 }
            zt0 r2 = r1.k     // Catch:{ ykf -> 0x00e5, all -> 0x00e1 }
            java.nio.ByteBuffer r2 = r2.f     // Catch:{ ykf -> 0x00e5, all -> 0x00e1 }
            if (r2 == 0) goto L_0x00c3
            int r2 = r2.position()     // Catch:{ ykf -> 0x00e5, all -> 0x00e1 }
            if (r2 != 0) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            r2 = r7
            goto L_0x00c4
        L_0x00c3:
            r2 = r8
        L_0x00c4:
            if (r2 == 0) goto L_0x00c8
            r2 = r7
            goto L_0x00d2
        L_0x00c8:
            zt0 r2 = r1.k     // Catch:{ ykf -> 0x00e5, all -> 0x00e1 }
            java.nio.ByteBuffer r2 = r2.e()     // Catch:{ ykf -> 0x00e5, all -> 0x00e1 }
            int r2 = r2.position()     // Catch:{ ykf -> 0x00e5, all -> 0x00e1 }
        L_0x00d2:
            r1.m = r2     // Catch:{ ykf -> 0x00e5, all -> 0x00e1 }
            boolean r2 = r1.h     // Catch:{ ykf -> 0x00e5, all -> 0x00e1 }
            if (r2 == 0) goto L_0x00e8
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r12)     // Catch:{ ykf -> 0x00e5, all -> 0x00e1 }
            r1.m = r7
            r1.l = r6
            return r0
        L_0x00e1:
            r0 = move-exception
            r5 = r1
            goto L_0x0194
        L_0x00e5:
            r5 = r1
            goto L_0x018b
        L_0x00e8:
            r5 = r1
            r1 = r0
            r0 = r7
        L_0x00eb:
            r2 = 150(0x96, float:2.1E-43)
            if (r0 == r2) goto L_0x017f
            int r2 = r5.m     // Catch:{ ykf -> 0x018b }
            if (r2 <= 0) goto L_0x0113
            zt0 r0 = r5.k     // Catch:{ ykf -> 0x018b }
            java.nio.ByteBuffer r0 = r0.f     // Catch:{ ykf -> 0x018b }
            if (r0 == 0) goto L_0x0101
            int r0 = r0.position()     // Catch:{ ykf -> 0x018b }
            if (r0 != 0) goto L_0x0100
            goto L_0x0101
        L_0x0100:
            r8 = r7
        L_0x0101:
            if (r8 == 0) goto L_0x0106
            int r0 = r5.m     // Catch:{ ykf -> 0x018b }
            goto L_0x010a
        L_0x0106:
            int r0 = r5.j(r1)     // Catch:{ ykf -> 0x018b }
        L_0x010a:
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)     // Catch:{ ykf -> 0x018b }
            r5.m = r7
            r5.l = r6
            return r0
        L_0x0113:
            javax.net.ssl.SSLEngine r2 = r5.a     // Catch:{ ykf -> 0x018b }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = r2.getHandshakeStatus()     // Catch:{ ykf -> 0x018b }
            if (r2 != 0) goto L_0x011d
            r2 = r12
            goto L_0x0125
        L_0x011d:
            int[] r13 = defpackage.zkf.$EnumSwitchMapping$0     // Catch:{ ykf -> 0x018b }
            int r2 = r2.ordinal()     // Catch:{ ykf -> 0x018b }
            r2 = r13[r2]     // Catch:{ ykf -> 0x018b }
        L_0x0125:
            if (r2 == r8) goto L_0x016d
            if (r2 == r11) goto L_0x016d
            if (r2 == r10) goto L_0x0151
            if (r2 == r9) goto L_0x0151
            r13 = 5
            if (r2 == r13) goto L_0x0139
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r12)     // Catch:{ ykf -> 0x018b }
            r5.m = r7
            r5.l = r6
            return r0
        L_0x0139:
            wkf r2 = new wkf     // Catch:{ ykf -> 0x018b }
            r13 = 0
            r2.<init>(r5, r13)     // Catch:{ ykf -> 0x018b }
            r3.a = r5     // Catch:{ ykf -> 0x018b }
            r3.b = r1     // Catch:{ ykf -> 0x018b }
            r3.c = r0     // Catch:{ ykf -> 0x018b }
            r3.w = r9     // Catch:{ ykf -> 0x018b }
            java.lang.Object r2 = defpackage.ryg.W(r2, r3)     // Catch:{ ykf -> 0x018b }
            if (r2 != r4) goto L_0x014e
            return r4
        L_0x014e:
            kotlin.Unit r2 = (kotlin.Unit) r2     // Catch:{ ykf -> 0x018b }
            goto L_0x017c
        L_0x0151:
            r3.a = r5     // Catch:{ ykf -> 0x018b }
            r3.b = r1     // Catch:{ ykf -> 0x018b }
            r3.c = r0     // Catch:{ ykf -> 0x018b }
            r3.w = r10     // Catch:{ ykf -> 0x018b }
            java.lang.Object r2 = r5.i(r3)     // Catch:{ ykf -> 0x018b }
            if (r2 != r4) goto L_0x0160
            return r4
        L_0x0160:
            boolean r2 = r5.h     // Catch:{ ykf -> 0x018b }
            if (r2 == 0) goto L_0x017c
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r12)     // Catch:{ ykf -> 0x018b }
            r5.m = r7
            r5.l = r6
            return r0
        L_0x016d:
            r3.a = r5     // Catch:{ ykf -> 0x018b }
            r3.b = r1     // Catch:{ ykf -> 0x018b }
            r3.c = r0     // Catch:{ ykf -> 0x018b }
            r3.w = r11     // Catch:{ ykf -> 0x018b }
            java.lang.Object r2 = r5.o(r3)     // Catch:{ ykf -> 0x018b }
            if (r2 != r4) goto L_0x017c
            return r4
        L_0x017c:
            int r0 = r0 + r8
            goto L_0x00eb
        L_0x017f:
            one.me.sdk.transfer.upload.network.InfiniteLoopException r0 = new one.me.sdk.transfer.upload.network.InfiniteLoopException     // Catch:{ ykf -> 0x018b }
            r0.<init>()     // Catch:{ ykf -> 0x018b }
            throw r0     // Catch:{ ykf -> 0x018b }
        L_0x0185:
            java.nio.channels.ClosedChannelException r0 = new java.nio.channels.ClosedChannelException     // Catch:{ ykf -> 0x00e5, all -> 0x00e1 }
            r0.<init>()     // Catch:{ ykf -> 0x00e5, all -> 0x00e1 }
            throw r0     // Catch:{ ykf -> 0x00e5, all -> 0x00e1 }
        L_0x018b:
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r12)     // Catch:{ all -> 0x0042 }
            r5.m = r7
            r5.l = r6
            return r0
        L_0x0194:
            r5.m = r7
            r5.l = r6
            throw r0
        L_0x0199:
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rlf.h(nw0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051 A[Catch:{ all -> 0x002e }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0060 A[Catch:{ all -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006e A[SYNTHETIC, Splitter:B:29:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.klf
            if (r0 == 0) goto L_0x0013
            r0 = r8
            klf r0 = (defpackage.klf) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            klf r0 = new klf
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            rlf r7 = r0.a
            kotlin.ResultKt.throwOnFailure(r8)     // Catch:{ all -> 0x002e }
            goto L_0x0047
        L_0x002e:
            r8 = move-exception
            goto L_0x00b1
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0039:
            rlf r7 = r0.a
            kotlin.ResultKt.throwOnFailure(r8)     // Catch:{ all -> 0x002e }
            goto L_0x0052
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r8)
            zt0 r8 = r7.i
            r8.c()
        L_0x0047:
            r0.a = r7     // Catch:{ all -> 0x002e }
            r0.o = r4     // Catch:{ all -> 0x002e }
            java.lang.Object r8 = r7.k(r0)     // Catch:{ all -> 0x002e }
            if (r8 != r1) goto L_0x0052
            return r1
        L_0x0052:
            javax.net.ssl.SSLEngineResult r8 = (javax.net.ssl.SSLEngineResult) r8     // Catch:{ all -> 0x002e }
            javax.net.ssl.SSLEngine r2 = r7.a     // Catch:{ all -> 0x002e }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = r2.getHandshakeStatus()     // Catch:{ all -> 0x002e }
            int r5 = r8.bytesProduced()     // Catch:{ all -> 0x002e }
            if (r5 <= 0) goto L_0x006e
            int r8 = r8.bytesProduced()     // Catch:{ all -> 0x002e }
            r7.m = r8     // Catch:{ all -> 0x002e }
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x002e }
        L_0x0068:
            zt0 r7 = r7.i
            r7.d()
            return r8
        L_0x006e:
            javax.net.ssl.SSLEngineResult$Status r5 = r8.getStatus()     // Catch:{ all -> 0x002e }
            javax.net.ssl.SSLEngineResult$Status r6 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch:{ all -> 0x002e }
            if (r5 != r6) goto L_0x007b
            r7.h = r4     // Catch:{ all -> 0x002e }
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x002e }
            goto L_0x0068
        L_0x007b:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r8 = r8.getHandshakeStatus()     // Catch:{ all -> 0x002e }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch:{ all -> 0x002e }
            if (r8 == r5) goto L_0x00ae
            javax.net.ssl.SSLEngineResult$HandshakeStatus r8 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK     // Catch:{ all -> 0x002e }
            if (r2 == r8) goto L_0x00ae
            javax.net.ssl.SSLEngineResult$HandshakeStatus r8 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP     // Catch:{ all -> 0x002e }
            if (r2 != r8) goto L_0x008c
            goto L_0x00ae
        L_0x008c:
            zt0 r8 = r7.i     // Catch:{ all -> 0x002e }
            java.nio.ByteBuffer r8 = r8.e()     // Catch:{ all -> 0x002e }
            boolean r8 = r8.hasRemaining()     // Catch:{ all -> 0x002e }
            if (r8 != 0) goto L_0x009d
            zt0 r8 = r7.i     // Catch:{ all -> 0x002e }
            r8.b()     // Catch:{ all -> 0x002e }
        L_0x009d:
            zt0 r8 = r7.i     // Catch:{ all -> 0x002e }
            java.nio.ByteBuffer r8 = r8.e()     // Catch:{ all -> 0x002e }
            r0.a = r7     // Catch:{ all -> 0x002e }
            r0.o = r3     // Catch:{ all -> 0x002e }
            java.lang.Object r8 = r7.a(r8, r0)     // Catch:{ all -> 0x002e }
            if (r8 != r1) goto L_0x0047
            return r1
        L_0x00ae:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x002e }
            goto L_0x0068
        L_0x00b1:
            zt0 r7 = r7.i
            r7.d()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rlf.i(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final int j(nw0 nw0) {
        zt0 zt0 = this.k;
        zt0.e().flip();
        ByteBuffer e2 = zt0.e();
        int i2 = 0;
        for (int i3 = nw0.b; i3 < nw0.d; i3++) {
            ByteBuffer byteBuffer = nw0.a[i3];
            if (e2.hasRemaining()) {
                int min = Math.min(e2.remaining(), byteBuffer.remaining());
                if (min < 0) {
                    throw new IllegalArgumentException("negative length".toString());
                } else if (e2.remaining() < min) {
                    throw new IllegalArgumentException(a81.l("source buffer does not have enough remaining capacity (", e2.remaining(), " < ", min, ")").toString());
                } else if (byteBuffer.remaining() >= min) {
                    if (min != 0) {
                        byteBuffer.put(e2.array(), e2.position(), min);
                        e2.position(e2.position() + min);
                    }
                    i2 += min;
                } else {
                    throw new IllegalArgumentException(a81.l("destination buffer does not have enough remaining capacity (", byteBuffer.remaining(), " < ", min, ")").toString());
                }
            }
        }
        zt0.e().compact();
        if (!zt0.d() && zt0.f != null) {
            zt0.f(zt0.e().position());
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(kotlin.coroutines.Continuation r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.llf
            if (r0 == 0) goto L_0x0013
            r0 = r11
            llf r0 = (defpackage.llf) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            llf r0 = new llf
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            nw0 r10 = r0.b
            rlf r2 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)
            r9 = r0
            r0 = r10
            r10 = r2
        L_0x002f:
            r2 = r9
            goto L_0x0061
        L_0x0031:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0039:
            kotlin.ResultKt.throwOnFailure(r11)
            nw0 r11 = r10.l
            if (r11 == 0) goto L_0x0041
            goto L_0x0050
        L_0x0041:
            zt0 r11 = r10.k
            r11.c()
            nw0 r2 = new nw0
            java.nio.ByteBuffer r11 = r11.e()
            r2.<init>((java.nio.ByteBuffer) r11)
            r11 = r2
        L_0x0050:
            r0.a = r10
            r0.b = r11
            r0.v = r3
            java.lang.Object r2 = r10.c(r11, r0)
            if (r2 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r9 = r0
            r0 = r11
            r11 = r2
            goto L_0x002f
        L_0x0061:
            javax.net.ssl.SSLEngineResult r11 = (javax.net.ssl.SSLEngineResult) r11
            javax.net.ssl.SSLEngine r4 = r10.a
            javax.net.ssl.SSLEngineResult$HandshakeStatus r4 = r4.getHandshakeStatus()
            int r5 = r11.bytesProduced()
            if (r5 <= 0) goto L_0x0070
            return r11
        L_0x0070:
            javax.net.ssl.SSLEngineResult$Status r5 = r11.getStatus()
            javax.net.ssl.SSLEngineResult$Status r6 = javax.net.ssl.SSLEngineResult.Status.CLOSED
            if (r5 != r6) goto L_0x0079
            return r11
        L_0x0079:
            javax.net.ssl.SSLEngineResult$Status r5 = r11.getStatus()
            javax.net.ssl.SSLEngineResult$Status r6 = javax.net.ssl.SSLEngineResult.Status.BUFFER_UNDERFLOW
            if (r5 != r6) goto L_0x0082
            return r11
        L_0x0082:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = r11.getHandshakeStatus()
            javax.net.ssl.SSLEngineResult$HandshakeStatus r6 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED
            if (r5 == r6) goto L_0x00cd
            javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK
            if (r4 == r5) goto L_0x00cd
            javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP
            if (r4 != r5) goto L_0x0093
            goto L_0x00cd
        L_0x0093:
            javax.net.ssl.SSLEngineResult$Status r11 = r11.getStatus()
            javax.net.ssl.SSLEngineResult$Status r4 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW
            if (r11 != r4) goto L_0x00cb
            nw0 r11 = r10.l
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r11)
            zt0 r4 = r10.k
            if (r11 == 0) goto L_0x00bd
            r4.c()
            java.nio.ByteBuffer r11 = r4.e()
            int r11 = r11.capacity()
            long r5 = (long) r11
            long r7 = r0.a()
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 > 0) goto L_0x00c0
            r4.b()
            goto L_0x00c0
        L_0x00bd:
            r4.b()
        L_0x00c0:
            nw0 r11 = new nw0
            java.nio.ByteBuffer r0 = r4.e()
            r11.<init>((java.nio.ByteBuffer) r0)
        L_0x00c9:
            r0 = r2
            goto L_0x0050
        L_0x00cb:
            r11 = r0
            goto L_0x00c9
        L_0x00cd:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rlf.k(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d A[SYNTHETIC, Splitter:B:22:0x005d] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0080 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0081 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0099 A[SYNTHETIC, Splitter:B:39:0x0099] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c6 A[SYNTHETIC, Splitter:B:49:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(defpackage.nw0 r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.mlf
            if (r0 == 0) goto L_0x0013
            r0 = r13
            mlf r0 = (defpackage.mlf) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            mlf r0 = new mlf
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.v
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            int r11 = r0.o
            long r5 = r0.c
            nw0 r12 = r0.b
            rlf r2 = r0.a
            kotlin.ResultKt.throwOnFailure(r13)     // Catch:{ all -> 0x0035 }
            goto L_0x00aa
        L_0x0035:
            r11 = move-exception
            goto L_0x00cc
        L_0x0038:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0040:
            int r11 = r0.o
            long r5 = r0.c
            nw0 r12 = r0.b
            rlf r2 = r0.a
            kotlin.ResultKt.throwOnFailure(r13)     // Catch:{ all -> 0x0035 }
            goto L_0x0070
        L_0x004c:
            kotlin.ResultKt.throwOnFailure(r13)
            long r5 = r12.a()
            zt0 r13 = r11.j
            r13.c()
            r13 = 0
        L_0x0059:
            r2 = 150(0x96, float:2.1E-43)
            if (r13 == r2) goto L_0x00c6
            r0.a = r11     // Catch:{ all -> 0x00c2 }
            r0.b = r12     // Catch:{ all -> 0x00c2 }
            r0.c = r5     // Catch:{ all -> 0x00c2 }
            r0.o = r13     // Catch:{ all -> 0x00c2 }
            r0.x = r4     // Catch:{ all -> 0x00c2 }
            java.lang.Object r2 = r11.p(r0)     // Catch:{ all -> 0x00c2 }
            if (r2 != r1) goto L_0x006e
            return r1
        L_0x006e:
            r2 = r11
            r11 = r13
        L_0x0070:
            long r7 = r12.a()     // Catch:{ all -> 0x0035 }
            r9 = 0
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 != 0) goto L_0x0099
            java.lang.String r11 = r2.c     // Catch:{ all -> 0x0035 }
            a67 r12 = defpackage.z68.b     // Catch:{ all -> 0x0035 }
            if (r12 != 0) goto L_0x0081
            goto L_0x008f
        L_0x0081:
            boolean r13 = r12.c()     // Catch:{ all -> 0x0035 }
            if (r13 == 0) goto L_0x008f
            w78 r13 = defpackage.w78.c     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = "wrapAndWrite: remaining=0, exiting loop"
            r1 = 0
            r12.d(r13, r11, r0, r1)     // Catch:{ all -> 0x0035 }
        L_0x008f:
            java.lang.Long r11 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r5)     // Catch:{ all -> 0x0035 }
        L_0x0093:
            zt0 r12 = r2.j
            r12.d()
            return r11
        L_0x0099:
            r0.a = r2     // Catch:{ all -> 0x0035 }
            r0.b = r12     // Catch:{ all -> 0x0035 }
            r0.c = r5     // Catch:{ all -> 0x0035 }
            r0.o = r11     // Catch:{ all -> 0x0035 }
            r0.x = r3     // Catch:{ all -> 0x0035 }
            java.lang.Object r13 = r2.m(r12, r0)     // Catch:{ all -> 0x0035 }
            if (r13 != r1) goto L_0x00aa
            return r1
        L_0x00aa:
            javax.net.ssl.SSLEngineResult r13 = (javax.net.ssl.SSLEngineResult) r13     // Catch:{ all -> 0x0035 }
            javax.net.ssl.SSLEngineResult$Status r13 = r13.getStatus()     // Catch:{ all -> 0x0035 }
            javax.net.ssl.SSLEngineResult$Status r7 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch:{ all -> 0x0035 }
            if (r13 != r7) goto L_0x00be
            long r11 = r12.a()     // Catch:{ all -> 0x0035 }
            long r5 = r5 - r11
            java.lang.Long r11 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r5)     // Catch:{ all -> 0x0035 }
            goto L_0x0093
        L_0x00be:
            int r13 = r11 + 1
            r11 = r2
            goto L_0x0059
        L_0x00c2:
            r12 = move-exception
            r2 = r11
            r11 = r12
            goto L_0x00cc
        L_0x00c6:
            one.me.sdk.transfer.upload.network.InfiniteLoopException r12 = new one.me.sdk.transfer.upload.network.InfiniteLoopException     // Catch:{ all -> 0x00c2 }
            r12.<init>()     // Catch:{ all -> 0x00c2 }
            throw r12     // Catch:{ all -> 0x00c2 }
        L_0x00cc:
            zt0 r12 = r2.j
            r12.d()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rlf.l(nw0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(defpackage.nw0 r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.nlf
            if (r0 == 0) goto L_0x0013
            r0 = r8
            nlf r0 = (defpackage.nlf) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            nlf r0 = new nlf
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            nw0 r6 = r0.b
            rlf r7 = r0.a
            kotlin.ResultKt.throwOnFailure(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L_0x0048
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r8)
        L_0x003b:
            r0.a = r6
            r0.b = r7
            r0.v = r3
            java.lang.Object r8 = r6.d(r7, r0)
            if (r8 != r1) goto L_0x0048
            return r1
        L_0x0048:
            javax.net.ssl.SSLEngineResult r8 = (javax.net.ssl.SSLEngineResult) r8
            javax.net.ssl.SSLEngineResult$Status r2 = r8.getStatus()
            if (r2 != 0) goto L_0x0052
            r2 = -1
            goto L_0x005a
        L_0x0052:
            int[] r4 = defpackage.zkf.$EnumSwitchMapping$1
            int r2 = r2.ordinal()
            r2 = r4[r2]
        L_0x005a:
            if (r2 == r3) goto L_0x007d
            r4 = 2
            if (r2 == r4) goto L_0x007d
            r8 = 3
            if (r2 == r8) goto L_0x0077
            r6 = 4
            if (r2 == r6) goto L_0x006b
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L_0x006b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Undefined status"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x0077:
            zt0 r8 = r6.j
            r8.b()
            goto L_0x003b
        L_0x007d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rlf.m(nw0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n(defpackage.nw0 r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.olf
            if (r0 == 0) goto L_0x0013
            r0 = r11
            olf r0 = (defpackage.olf) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            olf r0 = new olf
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 == r5) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0082
        L_0x002d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0035:
            nw0 r10 = r0.b
            rlf r9 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x006d
        L_0x003d:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.String r11 = r9.c
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x0047
            goto L_0x0060
        L_0x0047:
            boolean r6 = r2.c()
            if (r6 == 0) goto L_0x0060
            w78 r6 = defpackage.w78.o
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "write: "
            r7.<init>(r8)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            r2.d(r6, r11, r7, r3)
        L_0x0060:
            r0.a = r9
            r0.b = r10
            r0.v = r5
            java.lang.Object r11 = r9.f(r0)
            if (r11 != r1) goto L_0x006d
            return r1
        L_0x006d:
            boolean r11 = r9.f
            if (r11 != 0) goto L_0x0083
            boolean r11 = r9.g
            if (r11 != 0) goto L_0x0083
            r0.a = r3
            r0.b = r3
            r0.v = r4
            java.lang.Object r11 = r9.l(r10, r0)
            if (r11 != r1) goto L_0x0082
            return r1
        L_0x0082:
            return r11
        L_0x0083:
            java.nio.channels.ClosedChannelException r9 = new java.nio.channels.ClosedChannelException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rlf.n(nw0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.plf
            if (r0 == 0) goto L_0x0013
            r0 = r6
            plf r0 = (defpackage.plf) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            plf r0 = new plf
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            rlf r5 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)     // Catch:{ all -> 0x002e }
            goto L_0x005c
        L_0x002e:
            r6 = move-exception
            goto L_0x0064
        L_0x0030:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0038:
            rlf r5 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)     // Catch:{ all -> 0x002e }
            goto L_0x0051
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r6)
            zt0 r6 = r5.j
            r6.c()
            r0.a = r5     // Catch:{ all -> 0x002e }
            r0.o = r4     // Catch:{ all -> 0x002e }
            java.lang.Object r6 = r5.p(r0)     // Catch:{ all -> 0x002e }
            if (r6 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r0.a = r5     // Catch:{ all -> 0x002e }
            r0.o = r3     // Catch:{ all -> 0x002e }
            java.lang.Object r6 = r5.g(r0)     // Catch:{ all -> 0x002e }
            if (r6 != r1) goto L_0x005c
            return r1
        L_0x005c:
            zt0 r5 = r5.j
            r5.d()
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L_0x0064:
            zt0 r5 = r5.j
            r5.d()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rlf.o(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object p(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.qlf
            if (r0 == 0) goto L_0x0013
            r0 = r5
            qlf r0 = (defpackage.qlf) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            qlf r0 = new qlf
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            rlf r4 = r0.a
            kotlin.ResultKt.throwOnFailure(r5)     // Catch:{ all -> 0x002b }
            goto L_0x0063
        L_0x002b:
            r5 = move-exception
            goto L_0x006a
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r5)
            zt0 r5 = r4.j
            java.nio.ByteBuffer r5 = r5.e()
            int r5 = r5.position()
            if (r5 != 0) goto L_0x0047
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L_0x0047:
            zt0 r5 = r4.j
            java.nio.ByteBuffer r5 = r5.e()
            r5.flip()
            kotlin.Result$Companion r5 = kotlin.Result.Companion     // Catch:{ all -> 0x002b }
            zt0 r5 = r4.j     // Catch:{ all -> 0x002b }
            java.nio.ByteBuffer r5 = r5.e()     // Catch:{ all -> 0x002b }
            r0.a = r4     // Catch:{ all -> 0x002b }
            r0.o = r3     // Catch:{ all -> 0x002b }
            java.lang.Object r5 = r4.b(r5, r0)     // Catch:{ all -> 0x002b }
            if (r5 != r1) goto L_0x0063
            return r1
        L_0x0063:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x002b }
            java.lang.Object r5 = kotlin.Result.m23constructorimpl(r5)     // Catch:{ all -> 0x002b }
            goto L_0x0074
        L_0x006a:
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r5 = kotlin.ResultKt.createFailure(r5)
            java.lang.Object r5 = kotlin.Result.m23constructorimpl(r5)
        L_0x0074:
            java.lang.Throwable r0 = kotlin.Result.m26exceptionOrNullimpl(r5)
            if (r0 == 0) goto L_0x007c
            r4.f = r3
        L_0x007c:
            zt0 r4 = r4.j
            java.nio.ByteBuffer r4 = r4.e()
            r4.compact()
            kotlin.ResultKt.throwOnFailure(r5)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rlf.p(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
