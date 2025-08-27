package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: vp3  reason: default package */
public final class vp3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ yp3 c;
    public final /* synthetic */ long o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vp3(int i, yp3 yp3, long j, Continuation continuation) {
        super(2, continuation);
        this.b = i;
        this.c = yp3;
        this.o = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new vp3(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vp3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x01af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 0
            r1 = 1
            r2 = 2
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r10.a
            r5 = 4
            r6 = 3
            yp3 r7 = r10.c
            if (r4 == 0) goto L_0x002e
            if (r4 == r1) goto L_0x002a
            if (r4 == r2) goto L_0x0025
            if (r4 == r6) goto L_0x0020
            if (r4 != r5) goto L_0x0018
            goto L_0x0020
        L_0x0018:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0020:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0283
        L_0x0025:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x01ab
        L_0x002a:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0083
        L_0x002e:
            kotlin.ResultKt.throwOnFailure(r11)
            int r11 = defpackage.rra.d
            long r8 = r10.o
            int r4 = r10.b
            if (r4 != r11) goto L_0x0058
            s85 r10 = r7.x0
            vt3 r11 = defpackage.vt3.b
            r11.getClass()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = ":profile?id="
            r11.<init>(r0)
            r11.append(r8)
            java.lang.String r0 = "&type=contact"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            defpackage.a81.r(r11, r10)
            goto L_0x0283
        L_0x0058:
            int r11 = defpackage.rra.f
            if (r4 != r11) goto L_0x006c
            s85 r10 = r7.x0
            b4b r11 = new b4b
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r11.<init>(r0)
            defpackage.xag.h(r10, r11)
            goto L_0x0283
        L_0x006c:
            int r11 = defpackage.rra.i
            if (r4 != r11) goto L_0x00a2
            kotlin.Lazy r11 = r7.w
            java.lang.Object r11 = r11.getValue()
            qx2 r11 = (defpackage.qx2) r11
            r10.a = r1
            my2 r11 = (defpackage.my2) r11
            java.lang.Object r11 = r11.u(r8, r10)
            if (r11 != r3) goto L_0x0083
            return r3
        L_0x0083:
            a32 r11 = (defpackage.a32) r11
            if (r11 == 0) goto L_0x0283
            s85 r10 = r7.x0
            vt3 r0 = defpackage.vt3.b
            r0.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ":chats?id="
            r0.<init>(r1)
            long r1 = r11.a
            java.lang.String r11 = "&type=local"
            java.lang.String r11 = defpackage.wj6.m(r0, r1, r11)
            defpackage.a81.r(r11, r10)
            goto L_0x0283
        L_0x00a2:
            int r11 = defpackage.rra.e
            if (r4 != r11) goto L_0x00a8
            goto L_0x0283
        L_0x00a8:
            int r11 = defpackage.rra.b
            if (r4 != r11) goto L_0x0109
            kotlin.Lazy r10 = r7.v
            java.lang.Object r10 = r10.getValue()
            eu3 r10 = (defpackage.eu3) r10
            km3 r10 = r10.a
            java.util.concurrent.ConcurrentHashMap r11 = r10.a
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            java.lang.Object r11 = r11.get(r1)
            vk3 r11 = (defpackage.vk3) r11
            if (r11 == 0) goto L_0x00c5
            goto L_0x00c9
        L_0x00c5:
            vk3 r11 = r10.p(r8, r0)
        L_0x00c9:
            if (r11 != 0) goto L_0x00ce
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L_0x00ce:
            pg3 r10 = defpackage.xk3.a
            g8e r10 = new g8e
            long r1 = r11.r()
            int r11 = defpackage.sra.d
            igf r3 = new igf
            r3.<init>(r11)
            int r11 = defpackage.sra.c
            igf r4 = new igf
            r4.<init>(r11)
            pg3 r11 = new pg3
            int r0 = defpackage.rra.j
            int r5 = defpackage.sra.b
            igf r6 = new igf
            r6.<init>(r5)
            og3 r5 = defpackage.og3.a
            r11.<init>(r0, r6, r5)
            pg3 r0 = defpackage.xk3.a
            pg3[] r11 = new defpackage.pg3[]{r11, r0}
            java.util.List r5 = kotlin.collections.CollectionsKt.listOf(r11)
            r0 = r10
            r0.<init>(r1, r3, r4, r5)
            s85 r11 = r7.y0
            defpackage.xag.h(r11, r10)
            goto L_0x0283
        L_0x0109:
            int r11 = defpackage.rra.c
            if (r4 != r11) goto L_0x0174
            kotlin.Lazy r10 = r7.v
            java.lang.Object r10 = r10.getValue()
            eu3 r10 = (defpackage.eu3) r10
            km3 r10 = r10.a
            java.util.concurrent.ConcurrentHashMap r11 = r10.a
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            java.lang.Object r11 = r11.get(r1)
            vk3 r11 = (defpackage.vk3) r11
            if (r11 == 0) goto L_0x0126
            goto L_0x012a
        L_0x0126:
            vk3 r11 = r10.p(r8, r0)
        L_0x012a:
            if (r11 != 0) goto L_0x012f
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L_0x012f:
            pg3 r10 = defpackage.xk3.a
            g8e r10 = new g8e
            long r1 = r11.r()
            int r0 = defpackage.sra.f
            java.lang.String r11 = r11.f()
            if (r11 != 0) goto L_0x0141
            java.lang.String r11 = ""
        L_0x0141:
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            kgf r3 = new kgf
            java.util.List r11 = kotlin.collections.ArraysKt.toList((T[]) r11)
            r3.<init>(r0, r11)
            pg3 r11 = new pg3
            int r0 = defpackage.rra.l
            int r4 = defpackage.sra.e
            igf r5 = new igf
            r5.<init>(r4)
            og3 r4 = defpackage.og3.a
            r11.<init>(r0, r5, r4)
            pg3 r0 = defpackage.xk3.a
            pg3[] r11 = new defpackage.pg3[]{r11, r0}
            java.util.List r5 = kotlin.collections.CollectionsKt.listOf(r11)
            r4 = 0
            r0 = r10
            r0.<init>(r1, r3, r4, r5)
            s85 r11 = r7.y0
            defpackage.xag.h(r11, r10)
            goto L_0x0283
        L_0x0174:
            int r11 = defpackage.rra.a
            if (r4 != r11) goto L_0x0184
            s85 r10 = r7.x0
            qje r11 = new qje
            r11.<init>(r8, r0)
            defpackage.xag.h(r10, r11)
            goto L_0x0283
        L_0x0184:
            int r11 = defpackage.rra.h
            if (r4 != r11) goto L_0x0194
            s85 r10 = r7.x0
            qje r11 = new qje
            r11.<init>(r8, r1)
            defpackage.xag.h(r10, r11)
            goto L_0x0283
        L_0x0194:
            int r11 = defpackage.rra.g
            if (r4 != r11) goto L_0x01c9
            kotlin.Lazy r11 = r7.w
            java.lang.Object r11 = r11.getValue()
            qx2 r11 = (defpackage.qx2) r11
            r10.a = r2
            my2 r11 = (defpackage.my2) r11
            java.lang.Object r11 = r11.u(r8, r10)
            if (r11 != r3) goto L_0x01ab
            return r3
        L_0x01ab:
            a32 r11 = (defpackage.a32) r11
            if (r11 == 0) goto L_0x0283
            s85 r10 = r7.y0
            f8e r1 = new f8e
            int r2 = defpackage.sra.l
            igf r3 = new igf
            r3.<init>(r2)
            mp3 r2 = new mp3
            long r4 = r11.a
            r2.<init>(r7, r4, r0)
            r1.<init>(r3, r2)
            defpackage.xag.h(r10, r1)
            goto L_0x0283
        L_0x01c9:
            int r11 = defpackage.rra.l
            r0 = 0
            if (r4 != r11) goto L_0x01fa
            s85 r11 = r7.y0
            f8e r2 = new f8e
            int r4 = defpackage.sra.h
            igf r5 = new igf
            r5.<init>(r4)
            mp3 r4 = new mp3
            r4.<init>(r7, r8, r1)
            r2.<init>(r5, r4)
            defpackage.xag.h(r11, r2)
            gaf r11 = r7.c
            osa r11 = (defpackage.osa) r11
            q04 r11 = r11.b()
            tp3 r1 = new tp3
            r1.<init>(r7, r8, r0)
            r10.a = r6
            java.lang.Object r10 = defpackage.ev0.I(r11, r1, r10)
            if (r10 != r3) goto L_0x0283
            return r3
        L_0x01fa:
            int r11 = defpackage.rra.j
            if (r4 != r11) goto L_0x022a
            s85 r11 = r7.y0
            f8e r1 = new f8e
            int r4 = defpackage.sra.g
            igf r6 = new igf
            r6.<init>(r4)
            mp3 r4 = new mp3
            r4.<init>(r7, r8, r2)
            r1.<init>(r6, r4)
            defpackage.xag.h(r11, r1)
            gaf r11 = r7.c
            osa r11 = (defpackage.osa) r11
            q04 r11 = r11.b()
            up3 r1 = new up3
            r1.<init>(r7, r8, r0)
            r10.a = r5
            java.lang.Object r10 = defpackage.ev0.I(r11, r1, r10)
            if (r10 != r3) goto L_0x0283
            return r3
        L_0x022a:
            int r10 = defpackage.rra.q
            if (r4 != r10) goto L_0x0236
            s85 r10 = r7.y0
            ma r11 = defpackage.ma.a
            defpackage.xag.h(r10, r11)
            goto L_0x0283
        L_0x0236:
            int r10 = defpackage.rra.r
            if (r4 != r10) goto L_0x0242
            s85 r10 = r7.y0
            q34 r11 = defpackage.q34.a
            defpackage.xag.h(r10, r11)
            goto L_0x0283
        L_0x0242:
            int r10 = defpackage.wua.e
            if (r4 != r10) goto L_0x0258
            s85 r10 = r7.x0
            vt3 r11 = defpackage.vt3.b
            r11.getClass()
            pa4 r11 = new pa4
            java.lang.String r0 = ":invite/phone"
            r11.<init>(r0)
            defpackage.xag.h(r10, r11)
            goto L_0x0283
        L_0x0258:
            int r10 = defpackage.wua.k
            if (r4 != r10) goto L_0x026e
            s85 r10 = r7.x0
            vt3 r11 = defpackage.vt3.b
            r11.getClass()
            pa4 r11 = new pa4
            java.lang.String r0 = ":invite/qr"
            r11.<init>(r0)
            defpackage.xag.h(r10, r11)
            goto L_0x0283
        L_0x026e:
            int r10 = defpackage.wua.d
            if (r4 != r10) goto L_0x0283
            s85 r10 = r7.x0
            vt3 r11 = defpackage.vt3.b
            r11.getClass()
            pa4 r11 = new pa4
            java.lang.String r0 = ":contact-list/share-invite"
            r11.<init>(r0)
            defpackage.xag.h(r10, r11)
        L_0x0283:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
