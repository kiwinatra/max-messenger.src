package defpackage;

import kotlin.Lazy;

/* renamed from: xrd  reason: default package */
public final class xrd {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;

    public xrd(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
        this.e = lazy5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r16, long r18, long r20, long r22, defpackage.hqc r24, defpackage.vd9 r25, kotlin.coroutines.Continuation r26) {
        /*
            r15 = this;
            r1 = r15
            r0 = r24
            r2 = r25
            r3 = r26
            boolean r4 = r3 instanceof defpackage.wrd
            if (r4 == 0) goto L_0x001a
            r4 = r3
            wrd r4 = (defpackage.wrd) r4
            int r5 = r4.X
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001a
            int r5 = r5 - r6
            r4.X = r5
            goto L_0x001f
        L_0x001a:
            wrd r4 = new wrd
            r4.<init>(r15, r3)
        L_0x001f:
            java.lang.Object r3 = r4.y
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r4.X
            java.lang.String r7 = "xrd"
            r8 = 1
            if (r6 == 0) goto L_0x004c
            if (r6 != r8) goto L_0x0044
            long r0 = r4.x
            long r5 = r4.w
            long r8 = r4.v
            long r10 = r4.o
            vd9 r2 = r4.c
            hqc r12 = r4.b
            xrd r4 = r4.a
            kotlin.ResultKt.throwOnFailure(r3)     // Catch:{ all -> 0x0041 }
            goto L_0x00b4
        L_0x0041:
            r0 = move-exception
            goto L_0x00d7
        L_0x0044:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004c:
            kotlin.ResultKt.throwOnFailure(r3)
            kotlin.Lazy r3 = r1.b
            java.lang.Object r3 = r3.getValue()
            bud r3 = (defpackage.bud) r3
            r3.getClass()
            gqc r3 = defpackage.gqc.a
            java.lang.String r3 = "reactions, sendReaction"
            defpackage.z68.c(r7, r3, new java.lang.Object[0])
            kotlin.Lazy r3 = r1.c     // Catch:{ all -> 0x00d5 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00d5 }
            r9 = r3
            ae9 r9 = (defpackage.ae9) r9     // Catch:{ all -> 0x00d5 }
            qqc r14 = new qqc     // Catch:{ all -> 0x00d5 }
            kotlin.Lazy r3 = r1.e     // Catch:{ all -> 0x00d5 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00d5 }
            yd9 r3 = (defpackage.yd9) r3     // Catch:{ all -> 0x00d5 }
            r3.getClass()     // Catch:{ all -> 0x00d5 }
            bk3 r3 = defpackage.rqc.b     // Catch:{ all -> 0x00d5 }
            int r6 = r2.a     // Catch:{ all -> 0x00d5 }
            r3.getClass()     // Catch:{ all -> 0x00d5 }
            rqc r3 = defpackage.bk3.m(r6)     // Catch:{ all -> 0x00d5 }
            r14.<init>(r3, r0)     // Catch:{ all -> 0x00d5 }
            r4.a = r1     // Catch:{ all -> 0x00d5 }
            r4.b = r0     // Catch:{ all -> 0x00d5 }
            r4.c = r2     // Catch:{ all -> 0x00d5 }
            r12 = r16
            r4.o = r12     // Catch:{ all -> 0x00d5 }
            r10 = r18
            r4.v = r10     // Catch:{ all -> 0x00d5 }
            r3 = r9
            r8 = r20
            r4.w = r8     // Catch:{ all -> 0x00d5 }
            r0 = r22
            r4.x = r0     // Catch:{ all -> 0x00d5 }
            r6 = 1
            r4.X = r6     // Catch:{ all -> 0x00d5 }
            r9 = r3
            r10 = r16
            r12 = r18
            kotlin.Unit r3 = r9.e(r10, r12, r14)     // Catch:{ all -> 0x00d5 }
            if (r3 != r5) goto L_0x00ab
            return r5
        L_0x00ab:
            r4 = r15
            r10 = r16
            r8 = r18
            r5 = r20
            r12 = r24
        L_0x00b4:
            kotlin.Lazy r3 = r4.a     // Catch:{ all -> 0x0041 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0041 }
            rl r3 = (defpackage.rl) r3     // Catch:{ all -> 0x0041 }
            java.lang.CharSequence r12 = r12.a     // Catch:{ all -> 0x0041 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0041 }
            jna r3 = (defpackage.jna) r3     // Catch:{ all -> 0x0041 }
            r15 = r3
            r16 = r10
            r18 = r8
            r20 = r5
            r22 = r0
            r24 = r12
            r25 = r2
            r15.L(r16, r18, r20, r22, r24, r25)     // Catch:{ all -> 0x0041 }
            goto L_0x00ef
        L_0x00d5:
            r0 = move-exception
            r4 = r15
        L_0x00d7:
            java.lang.String r1 = "reactions, sendReaction async query failed"
            defpackage.z68.f(r7, r1, r0)
            kotlin.Lazy r1 = r4.d
            java.lang.Object r1 = r1.getValue()
            m95 r1 = (defpackage.m95) r1
            ru.ok.tamtam.util.HandledException r2 = new ru.ok.tamtam.util.HandledException
            r2.<init>(r0)
            r0 = 0
            uta r1 = (defpackage.uta) r1
            r1.c(r2, r0)
        L_0x00ef:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xrd.a(long, long, long, long, hqc, vd9, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
