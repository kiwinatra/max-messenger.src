package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: y40  reason: default package */
public final class y40 implements ds5 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object o;

    public /* synthetic */ y40(ds5 ds5, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = ds5;
        this.c = obj;
        this.o = obj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0221  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            r0 = 2
            r1 = 0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r5 = r9.a
            switch(r5) {
                case 0: goto L_0x0259;
                case 1: goto L_0x01ed;
                case 2: goto L_0x0179;
                case 3: goto L_0x0079;
                case 4: goto L_0x0024;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.Object r0 = r9.b
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            java.lang.Object r1 = r9.c
            java.lang.Object r9 = r9.o
            hvf r9 = (defpackage.hvf) r9
            java.lang.Object r9 = defpackage.n54.Y(r0, r10, r1, r9, r11)
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r9 != r10) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
        L_0x0023:
            return r9
        L_0x0024:
            boolean r0 = r11 instanceof defpackage.kke
            if (r0 == 0) goto L_0x0035
            r0 = r11
            kke r0 = (defpackage.kke) r0
            int r1 = r0.b
            r5 = r1 & r4
            if (r5 == 0) goto L_0x0035
            int r1 = r1 - r4
            r0.b = r1
            goto L_0x003a
        L_0x0035:
            kke r0 = new kke
            r0.<init>(r9, r11)
        L_0x003a:
            java.lang.Object r11 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r0.b
            if (r4 == 0) goto L_0x0050
            if (r4 != r3) goto L_0x004a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0076
        L_0x004a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r2)
            throw r9
        L_0x0050:
            kotlin.ResultKt.throwOnFailure(r11)
            xy2 r10 = (defpackage.xy2) r10
            java.lang.Object r10 = r9.c
            ru.ok.messages.calls.utils.StartCallsViewModel r10 = (ru.ok.messages.calls.utils.StartCallsViewModel) r10
            r62 r10 = r10.h
            java.lang.Object r11 = r9.o
            pje r11 = (defpackage.pje) r11
            lje r11 = (defpackage.lje) r11
            long r4 = r11.a
            a32 r10 = r10.G(r4)
            if (r10 == 0) goto L_0x0076
            r0.b = r3
            java.lang.Object r9 = r9.b
            ds5 r9 = (defpackage.ds5) r9
            java.lang.Object r9 = r9.a(r10, r0)
            if (r9 != r1) goto L_0x0076
            goto L_0x0078
        L_0x0076:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x0078:
            return r1
        L_0x0079:
            boolean r0 = r11 instanceof defpackage.cp2
            if (r0 == 0) goto L_0x008a
            r0 = r11
            cp2 r0 = (defpackage.cp2) r0
            int r5 = r0.b
            r6 = r5 & r4
            if (r6 == 0) goto L_0x008a
            int r5 = r5 - r4
            r0.b = r5
            goto L_0x008f
        L_0x008a:
            cp2 r0 = new cp2
            r0.<init>(r9, r11)
        L_0x008f:
            java.lang.Object r11 = r0.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r0.b
            if (r5 == 0) goto L_0x00a6
            if (r5 != r3) goto L_0x00a0
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0176
        L_0x00a0:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r2)
            throw r9
        L_0x00a6:
            kotlin.ResultKt.throwOnFailure(r11)
            ouf r10 = (defpackage.ouf) r10
            java.lang.Object r11 = r9.c
            lp2 r11 = (defpackage.lp2) r11
            etc r11 = r11.Q0
            ome r11 = r11.a
            java.lang.Object r11 = r11.getValue()
            a32 r11 = (defpackage.a32) r11
            if (r11 == 0) goto L_0x0169
            ya8 r10 = r10.a
            long r5 = r11.a
            java.lang.Object r10 = r10.f(r5)
            sr2 r10 = (defpackage.sr2) r10
            if (r10 != 0) goto L_0x00c9
            goto L_0x0169
        L_0x00c9:
            java.lang.Object r11 = r9.o
            kotlin.Lazy r11 = (kotlin.Lazy) r11
            java.lang.Object r11 = r11.getValue()
            luf r11 = (defpackage.luf) r11
            vb2 r11 = (defpackage.vb2) r11
            r11.getClass()
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            java.lang.CharSequence r10 = r10.b
            r2.<init>(r10)
            int r10 = r2.length()
            r5 = 33
            r6 = 8203(0x200b, float:1.1495E-41)
            if (r10 != 0) goto L_0x00ea
            goto L_0x0147
        L_0x00ea:
            kotlin.Result$Companion r10 = kotlin.Result.Companion     // Catch:{ all -> 0x0107 }
            int r10 = r2.length()     // Catch:{ all -> 0x0107 }
            int r10 = r10 - r3
            int r7 = r2.length()     // Catch:{ all -> 0x0107 }
            java.lang.Class<bge> r8 = defpackage.bge.class
            java.lang.Object[] r10 = r2.getSpans(r10, r7, r8)     // Catch:{ all -> 0x0107 }
            r7 = 0
            java.lang.Object r10 = kotlin.collections.ArraysKt.getOrNull((T[]) r10, (int) r7)     // Catch:{ all -> 0x0107 }
            bge r10 = (defpackage.bge) r10     // Catch:{ all -> 0x0107 }
            java.lang.Object r10 = kotlin.Result.m23constructorimpl(r10)     // Catch:{ all -> 0x0107 }
            goto L_0x0112
        L_0x0107:
            r10 = move-exception
            kotlin.Result$Companion r7 = kotlin.Result.Companion
            java.lang.Object r10 = kotlin.ResultKt.createFailure(r10)
            java.lang.Object r10 = kotlin.Result.m23constructorimpl(r10)
        L_0x0112:
            boolean r7 = kotlin.Result.m29isFailureimpl(r10)
            if (r7 == 0) goto L_0x0119
            goto L_0x011a
        L_0x0119:
            r1 = r10
        L_0x011a:
            bge r1 = (defpackage.bge) r1
            if (r1 == 0) goto L_0x0122
            r2.removeSpan(r1)
            goto L_0x0125
        L_0x0122:
            r2.append(r6)
        L_0x0125:
            bge r10 = new bge
            r1 = 4
            float r1 = (float) r1
            android.content.res.Resources r7 = defpackage.vo4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r1 = r1 * r7
            int r1 = kotlin.math.MathKt.roundToInt((float) r1)
            r10.<init>(r1)
            int r1 = r2.length()
            int r1 = r1 - r3
            int r7 = r2.length()
            r2.setSpan(r10, r1, r7, r5)
        L_0x0147:
            r2.append(r6)
            kotlin.Lazy r10 = r11.v
            java.lang.Object r10 = r10.getValue()
            bq5 r10 = (defpackage.bq5) r10
            int r11 = r2.length()
            int r11 = r11 - r3
            int r1 = r2.length()
            r2.setSpan(r10, r11, r1, r5)
            int r10 = defpackage.gge.a
            gge r10 = defpackage.sq6.A(r2, r3)
            mgf r1 = new mgf
            r1.<init>(r10)
        L_0x0169:
            r0.b = r3
            java.lang.Object r9 = r9.b
            ds5 r9 = (defpackage.ds5) r9
            java.lang.Object r9 = r9.a(r1, r0)
            if (r9 != r4) goto L_0x0176
            goto L_0x0178
        L_0x0176:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x0178:
            return r4
        L_0x0179:
            boolean r5 = r11 instanceof defpackage.ap2
            if (r5 == 0) goto L_0x018a
            r5 = r11
            ap2 r5 = (defpackage.ap2) r5
            int r6 = r5.b
            r7 = r6 & r4
            if (r7 == 0) goto L_0x018a
            int r6 = r6 - r4
            r5.b = r6
            goto L_0x018f
        L_0x018a:
            ap2 r5 = new ap2
            r5.<init>(r9, r11)
        L_0x018f:
            java.lang.Object r11 = r5.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r5.b
            if (r6 == 0) goto L_0x01ad
            if (r6 == r3) goto L_0x01a7
            if (r6 != r0) goto L_0x01a1
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x01ea
        L_0x01a1:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r2)
            throw r9
        L_0x01a7:
            ds5 r9 = r5.c
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x01df
        L_0x01ad:
            kotlin.ResultKt.throwOnFailure(r11)
            k2b r10 = (defpackage.k2b) r10
            java.lang.Object r10 = r9.b
            ds5 r10 = (defpackage.ds5) r10
            r5.c = r10
            r5.b = r3
            java.lang.Object r11 = r9.c
            srd r11 = (defpackage.srd) r11
            java.lang.Object r2 = r11.a
            kotlin.Lazy r2 = (kotlin.Lazy) r2
            java.lang.Object r2 = r2.getValue()
            gaf r2 = (defpackage.gaf) r2
            osa r2 = (defpackage.osa) r2
            q04 r2 = r2.b()
            o28 r3 = new o28
            java.lang.Object r9 = r9.o
            android.content.Context r9 = (android.content.Context) r9
            r3.<init>(r11, r9, r1)
            java.lang.Object r11 = defpackage.ev0.I(r2, r3, r5)
            if (r11 != r4) goto L_0x01de
            goto L_0x01ec
        L_0x01de:
            r9 = r10
        L_0x01df:
            r5.c = r1
            r5.b = r0
            java.lang.Object r9 = r9.a(r11, r5)
            if (r9 != r4) goto L_0x01ea
            goto L_0x01ec
        L_0x01ea:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x01ec:
            return r4
        L_0x01ed:
            boolean r5 = r11 instanceof defpackage.h21
            if (r5 == 0) goto L_0x01fe
            r5 = r11
            h21 r5 = (defpackage.h21) r5
            int r6 = r5.b
            r7 = r6 & r4
            if (r7 == 0) goto L_0x01fe
            int r6 = r6 - r4
            r5.b = r6
            goto L_0x0203
        L_0x01fe:
            h21 r5 = new h21
            r5.<init>(r9, r11)
        L_0x0203:
            java.lang.Object r11 = r5.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r5.b
            if (r6 == 0) goto L_0x0221
            if (r6 == r3) goto L_0x021b
            if (r6 != r0) goto L_0x0215
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0256
        L_0x0215:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r2)
            throw r9
        L_0x021b:
            ds5 r9 = r5.c
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x024b
        L_0x0221:
            kotlin.ResultKt.throwOnFailure(r11)
            tn3 r10 = (defpackage.tn3) r10
            kotlin.reflect.KProperty[] r10 = defpackage.k21.p
            java.lang.Object r10 = r9.c
            k21 r10 = (defpackage.k21) r10
            kotlin.Lazy r10 = r10.b
            java.lang.Object r10 = r10.getValue()
            qx2 r10 = (defpackage.qx2) r10
            java.lang.Object r11 = r9.o
            a32 r11 = (defpackage.a32) r11
            long r6 = r11.a
            java.lang.Object r9 = r9.b
            ds5 r9 = (defpackage.ds5) r9
            r5.c = r9
            r5.b = r3
            my2 r10 = (defpackage.my2) r10
            java.lang.Object r11 = r10.l(r6, r5)
            if (r11 != r4) goto L_0x024b
            goto L_0x0258
        L_0x024b:
            r5.c = r1
            r5.b = r0
            java.lang.Object r9 = r9.a(r11, r5)
            if (r9 != r4) goto L_0x0256
            goto L_0x0258
        L_0x0256:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x0258:
            return r4
        L_0x0259:
            boolean r0 = r11 instanceof defpackage.x40
            if (r0 == 0) goto L_0x026a
            r0 = r11
            x40 r0 = (defpackage.x40) r0
            int r1 = r0.b
            r5 = r1 & r4
            if (r5 == 0) goto L_0x026a
            int r1 = r1 - r4
            r0.b = r1
            goto L_0x026f
        L_0x026a:
            x40 r0 = new x40
            r0.<init>(r9, r11)
        L_0x026f:
            java.lang.Object r11 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r0.b
            if (r4 == 0) goto L_0x0285
            if (r4 != r3) goto L_0x027f
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x02bc
        L_0x027f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r2)
            throw r9
        L_0x0285:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r9.b
            ds5 r11 = (defpackage.ds5) r11
            r2 = r10
            java.lang.Number r2 = (java.lang.Number) r2
            r2.floatValue()
            java.lang.Object r2 = r9.c
            c50 r2 = (defpackage.c50) r2
            java.lang.Long r2 = r2.f
            java.lang.Object r9 = r9.o
            kotlin.Lazy r9 = (kotlin.Lazy) r9
            java.lang.Object r9 = r9.getValue()
            dy9 r9 = (defpackage.dy9) r9
            xy9 r9 = (defpackage.xy9) r9
            long r4 = r9.l()
            if (r2 != 0) goto L_0x02ab
            goto L_0x02bc
        L_0x02ab:
            long r6 = r2.longValue()
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x02bc
            r0.b = r3
            java.lang.Object r9 = r11.a(r10, r0)
            if (r9 != r1) goto L_0x02bc
            goto L_0x02be
        L_0x02bc:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x02be:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y40.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public y40(ds5 ds5, CoroutineContext coroutineContext) {
        this.a = 5;
        this.b = coroutineContext;
        this.c = coroutineContext.fold(0, eif.b);
        this.o = new hvf(ds5, (Continuation) null);
    }
}
