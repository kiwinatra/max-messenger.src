package defpackage;

import kotlin.Lazy;

/* renamed from: j98  reason: default package */
public final class j98 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;

    public j98(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
        this.e = lazy7;
        this.f = lazy5;
        this.g = lazy6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bb A[Catch:{ TamErrorException -> 0x017b }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0149 A[Catch:{ TamErrorException -> 0x017b }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014e A[Catch:{ TamErrorException -> 0x017b }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x014f A[Catch:{ TamErrorException -> 0x017b }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r19, java.lang.String r20, kotlin.coroutines.Continuation r21) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r21
            java.lang.String r3 = "login: onEnded by "
            boolean r4 = r2 instanceof defpackage.i98
            if (r4 == 0) goto L_0x001c
            r4 = r2
            i98 r4 = (defpackage.i98) r4
            int r5 = r4.x
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001c
            int r5 = r5 - r6
            r4.x = r5
        L_0x001a:
            r11 = r4
            goto L_0x0022
        L_0x001c:
            i98 r4 = new i98
            r4.<init>(r1, r2)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r2 = r11.v
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r11.x
            r12 = 0
            java.lang.String r13 = "j98"
            r6 = 3
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L_0x007b
            if (r5 == r8) goto L_0x0063
            if (r5 == r7) goto L_0x004f
            if (r5 != r6) goto L_0x0047
            long r0 = r11.o
            j98 r4 = r11.a
            kotlin.ResultKt.throwOnFailure(r2)     // Catch:{ TamErrorException -> 0x0043 }
            r14 = r0
            r1 = r4
            goto L_0x014a
        L_0x0043:
            r0 = move-exception
            r1 = r4
            goto L_0x018c
        L_0x0047:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004f:
            long r0 = r11.o
            java.lang.Object r5 = r11.b
            l88 r5 = (defpackage.l88) r5
            j98 r7 = r11.a
            kotlin.ResultKt.throwOnFailure(r2)     // Catch:{ TamErrorException -> 0x005f }
            r14 = r0
            r8 = r5
            r1 = r7
            goto L_0x0115
        L_0x005f:
            r0 = move-exception
            r1 = r7
            goto L_0x018c
        L_0x0063:
            long r0 = r11.o
            java.lang.String r5 = r11.c
            java.lang.Object r8 = r11.b
            java.lang.String r8 = (java.lang.String) r8
            j98 r9 = r11.a
            kotlin.ResultKt.throwOnFailure(r2)     // Catch:{ TamErrorException -> 0x0077 }
            r16 = r0
            r0 = r8
            r1 = r9
            r9 = r16
            goto L_0x00b5
        L_0x0077:
            r0 = move-exception
            r1 = r9
            goto L_0x018c
        L_0x007b:
            kotlin.ResultKt.throwOnFailure(r2)
            kotlin.Lazy r2 = r1.d
            java.lang.Object r2 = r2.getValue()
            vlb r2 = (defpackage.vlb) r2
            r2.b()
            kotlin.time.Duration$Companion r2 = kotlin.time.Duration.Companion     // Catch:{ TamErrorException -> 0x017b }
            long r9 = java.lang.System.nanoTime()     // Catch:{ TamErrorException -> 0x017b }
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.NANOSECONDS     // Catch:{ TamErrorException -> 0x017b }
            long r9 = kotlin.time.DurationKt.toDuration((long) r9, (kotlin.time.DurationUnit) r2)     // Catch:{ TamErrorException -> 0x017b }
            java.lang.String r2 = "login: onStarted"
            defpackage.z68.c(r13, r2, new java.lang.Object[0])     // Catch:{ TamErrorException -> 0x017b }
            kotlin.Lazy r2 = r1.a     // Catch:{ TamErrorException -> 0x017b }
            java.lang.Object r2 = r2.getValue()     // Catch:{ TamErrorException -> 0x017b }
            coa r2 = (defpackage.coa) r2     // Catch:{ TamErrorException -> 0x017b }
            r11.a = r1     // Catch:{ TamErrorException -> 0x017b }
            r11.b = r0     // Catch:{ TamErrorException -> 0x017b }
            r5 = r20
            r11.c = r5     // Catch:{ TamErrorException -> 0x017b }
            r11.o = r9     // Catch:{ TamErrorException -> 0x017b }
            r11.x = r8     // Catch:{ TamErrorException -> 0x017b }
            java.lang.Object r2 = r2.b(r0, r11)     // Catch:{ TamErrorException -> 0x017b }
            if (r2 != r4) goto L_0x00b5
            return r4
        L_0x00b5:
            l88 r2 = (defpackage.l88) r2     // Catch:{ TamErrorException -> 0x017b }
            fo3 r8 = r2.c     // Catch:{ TamErrorException -> 0x017b }
            if (r8 == 0) goto L_0x0180
            kotlin.Lazy r14 = r1.c     // Catch:{ TamErrorException -> 0x017b }
            java.lang.Object r14 = r14.getValue()     // Catch:{ TamErrorException -> 0x017b }
            doa r14 = (defpackage.doa) r14     // Catch:{ TamErrorException -> 0x017b }
            java.lang.String r15 = r8.a()     // Catch:{ TamErrorException -> 0x017b }
            r6 = 0
            r14.a(r15, r0, r6)     // Catch:{ TamErrorException -> 0x017b }
            kotlin.Lazy r0 = r1.b     // Catch:{ TamErrorException -> 0x017b }
            java.lang.Object r0 = r0.getValue()     // Catch:{ TamErrorException -> 0x017b }
            x23 r0 = (defpackage.x23) r0     // Catch:{ TamErrorException -> 0x017b }
            long r14 = r8.a     // Catch:{ TamErrorException -> 0x017b }
            java.lang.Long r6 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r14)     // Catch:{ TamErrorException -> 0x017b }
            qjd r0 = (defpackage.qjd) r0     // Catch:{ TamErrorException -> 0x017b }
            r0.y(r6)     // Catch:{ TamErrorException -> 0x017b }
            kotlin.Lazy r0 = r1.b     // Catch:{ TamErrorException -> 0x017b }
            java.lang.Object r0 = r0.getValue()     // Catch:{ TamErrorException -> 0x017b }
            x23 r0 = (defpackage.x23) r0     // Catch:{ TamErrorException -> 0x017b }
            a33 r0 = (defpackage.a33) r0     // Catch:{ TamErrorException -> 0x017b }
            java.lang.String r6 = "user.Phone"
            r0.l(r6, r5)     // Catch:{ TamErrorException -> 0x017b }
            java.lang.String r0 = "login: auth and token are saved"
            defpackage.z68.c(r13, r0, new java.lang.Object[0])     // Catch:{ TamErrorException -> 0x017b }
            kotlin.Lazy r0 = r1.e     // Catch:{ TamErrorException -> 0x017b }
            java.lang.Object r0 = r0.getValue()     // Catch:{ TamErrorException -> 0x017b }
            eu3 r0 = (defpackage.eu3) r0     // Catch:{ TamErrorException -> 0x017b }
            java.util.List r5 = kotlin.collections.CollectionsKt.listOf(r8)     // Catch:{ TamErrorException -> 0x017b }
            tm3 r6 = defpackage.tm3.b     // Catch:{ TamErrorException -> 0x017b }
            r11.a = r1     // Catch:{ TamErrorException -> 0x017b }
            r11.b = r2     // Catch:{ TamErrorException -> 0x017b }
            r11.c = r12     // Catch:{ TamErrorException -> 0x017b }
            r11.o = r9     // Catch:{ TamErrorException -> 0x017b }
            r11.x = r7     // Catch:{ TamErrorException -> 0x017b }
            km3 r0 = r0.a     // Catch:{ TamErrorException -> 0x017b }
            java.util.List r0 = r0.C(r5, r6)     // Catch:{ TamErrorException -> 0x017b }
            if (r0 != r4) goto L_0x0113
            return r4
        L_0x0113:
            r8 = r2
            r14 = r9
        L_0x0115:
            kotlin.Lazy r0 = r1.f     // Catch:{ TamErrorException -> 0x017b }
            java.lang.Object r0 = r0.getValue()     // Catch:{ TamErrorException -> 0x017b }
            r5 = r0
            e98 r5 = (defpackage.e98) r5     // Catch:{ TamErrorException -> 0x017b }
            kotlin.Lazy r0 = r1.b     // Catch:{ TamErrorException -> 0x017b }
            java.lang.Object r0 = r0.getValue()     // Catch:{ TamErrorException -> 0x017b }
            x23 r0 = (defpackage.x23) r0     // Catch:{ TamErrorException -> 0x017b }
            qjd r0 = (defpackage.qjd) r0     // Catch:{ TamErrorException -> 0x017b }
            long r6 = r0.n()     // Catch:{ TamErrorException -> 0x017b }
            kotlin.Lazy r0 = r1.b     // Catch:{ TamErrorException -> 0x017b }
            java.lang.Object r0 = r0.getValue()     // Catch:{ TamErrorException -> 0x017b }
            x23 r0 = (defpackage.x23) r0     // Catch:{ TamErrorException -> 0x017b }
            qjd r0 = (defpackage.qjd) r0     // Catch:{ TamErrorException -> 0x017b }
            long r9 = r0.o()     // Catch:{ TamErrorException -> 0x017b }
            r11.a = r1     // Catch:{ TamErrorException -> 0x017b }
            r11.b = r12     // Catch:{ TamErrorException -> 0x017b }
            r11.o = r14     // Catch:{ TamErrorException -> 0x017b }
            r0 = 3
            r11.x = r0     // Catch:{ TamErrorException -> 0x017b }
            java.lang.Object r0 = r5.q(r6, r8, r9, r11)     // Catch:{ TamErrorException -> 0x017b }
            if (r0 != r4) goto L_0x014a
            return r4
        L_0x014a:
            a67 r0 = defpackage.z68.b     // Catch:{ TamErrorException -> 0x017b }
            if (r0 != 0) goto L_0x014f
            goto L_0x017d
        L_0x014f:
            boolean r2 = r0.c()     // Catch:{ TamErrorException -> 0x017b }
            if (r2 == 0) goto L_0x017d
            w78 r2 = defpackage.w78.o     // Catch:{ TamErrorException -> 0x017b }
            kotlin.time.Duration$Companion r4 = kotlin.time.Duration.Companion     // Catch:{ TamErrorException -> 0x017b }
            long r4 = java.lang.System.nanoTime()     // Catch:{ TamErrorException -> 0x017b }
            kotlin.time.DurationUnit r6 = kotlin.time.DurationUnit.NANOSECONDS     // Catch:{ TamErrorException -> 0x017b }
            long r4 = kotlin.time.DurationKt.toDuration((long) r4, (kotlin.time.DurationUnit) r6)     // Catch:{ TamErrorException -> 0x017b }
            long r4 = kotlin.time.Duration.m1388minusLRDsOJo(r4, r14)     // Catch:{ TamErrorException -> 0x017b }
            java.lang.String r4 = kotlin.time.Duration.m1402toStringimpl(r4)     // Catch:{ TamErrorException -> 0x017b }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ TamErrorException -> 0x017b }
            r5.<init>(r3)     // Catch:{ TamErrorException -> 0x017b }
            r5.append(r4)     // Catch:{ TamErrorException -> 0x017b }
            java.lang.String r3 = r5.toString()     // Catch:{ TamErrorException -> 0x017b }
            r0.d(r2, r13, r3, r12)     // Catch:{ TamErrorException -> 0x017b }
            goto L_0x017d
        L_0x017b:
            r0 = move-exception
            goto L_0x018c
        L_0x017d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0180:
            java.lang.String r0 = "To login account should have profile and user id"
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ TamErrorException -> 0x017b }
            java.lang.String r0 = r0.toString()     // Catch:{ TamErrorException -> 0x017b }
            r2.<init>(r0)     // Catch:{ TamErrorException -> 0x017b }
            throw r2     // Catch:{ TamErrorException -> 0x017b }
        L_0x018c:
            qaf r2 = r0.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "login: OnFailed - "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            defpackage.z68.c(r13, r2, new java.lang.Object[0])
            kotlin.Lazy r1 = r1.g
            java.lang.Object r1 = r1.getValue()
            z88 r1 = (defpackage.z88) r1
            qaf r2 = r0.a
            r1.a(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j98.a(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
