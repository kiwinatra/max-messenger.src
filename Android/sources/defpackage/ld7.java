package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ld7  reason: default package */
public final class ld7 extends SuspendLambda implements Function2 {
    public zc7 a;
    public int b;
    public int c;
    public /* synthetic */ Object o;
    public final /* synthetic */ yd7 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ld7(yd7 yd7, Continuation continuation) {
        super(2, continuation);
        this.v = yd7;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ld7 ld7 = new ld7(this.v, continuation);
        ld7.o = obj;
        return ld7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ld7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0111 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            yd7 r11 = r0.v
            r12 = 1
            r13 = 3
            r14 = 2
            java.lang.String r15 = "prefetch "
            if (r2 == 0) goto L_0x004d
            if (r2 == r12) goto L_0x0042
            if (r2 == r14) goto L_0x0030
            if (r2 != r13) goto L_0x0028
            int r1 = r0.b
            zc7 r2 = r0.a
            java.lang.Object r0 = r0.o
            d14 r0 = (defpackage.d14) r0
            kotlin.ResultKt.throwOnFailure(r20)
            r3 = r2
            r2 = r0
            r0 = r20
            goto L_0x0113
        L_0x0028:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0030:
            zc7 r2 = r0.a
            java.lang.Object r3 = r0.o
            d14 r3 = (defpackage.d14) r3
            kotlin.ResultKt.throwOnFailure(r20)
            r4 = r20
            r18 = r3
            r3 = r2
            r2 = r18
            goto L_0x00fa
        L_0x0042:
            java.lang.Object r2 = r0.o
            d14 r2 = (defpackage.d14) r2
            kotlin.ResultKt.throwOnFailure(r20)
            r3 = r20
            goto L_0x00c4
        L_0x004d:
            kotlin.ResultKt.throwOnFailure(r20)
            java.lang.Object r2 = r0.o
            d14 r2 = (defpackage.d14) r2
            java.lang.String r3 = defpackage.yd7.C0
            java.util.concurrent.atomic.AtomicInteger r4 = r11.v0
            int r4 = r4.get()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r15)
            r5.append(r4)
            java.lang.String r4 = ": start to load virtual albums"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            defpackage.z68.c(r3, r4, new java.lang.Object[0])
            java.util.concurrent.atomic.AtomicInteger r4 = r11.v0
            int r4 = r4.get()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r15)
            r5.append(r4)
            java.lang.String r4 = ": start fetch medias"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            defpackage.z68.c(r3, r4, new java.lang.Object[0])
            zcf r5 = new zcf
            java.util.concurrent.atomic.AtomicInteger r3 = r11.v0
            int r3 = r3.get()
            java.lang.String r4 = " virtual albums recent items"
            java.lang.String r3 = defpackage.a81.j(r3, r15, r4)
            r5.<init>(r3)
            sk6 r4 = defpackage.sk6.a
            r0.o = r2
            r0.c = r12
            gaf r3 = r11.c
            osa r3 = (defpackage.osa) r3
            q04 r10 = r3.b()
            hd7 r9 = new hd7
            r16 = 0
            r7 = 40
            r8 = 0
            r17 = 0
            r3 = r9
            r6 = r11
            r12 = r9
            r9 = r17
            r13 = r10
            r10 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r3 = defpackage.ev0.I(r13, r12, r0)
            if (r3 != r1) goto L_0x00c4
            return r1
        L_0x00c4:
            zc7 r3 = (defpackage.zc7) r3
            boolean r4 = defpackage.e14.f(r2)
            if (r4 != 0) goto L_0x00cf
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00cf:
            java.lang.String r4 = defpackage.yd7.C0
            java.util.concurrent.atomic.AtomicInteger r5 = r11.v0
            int r5 = r5.get()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r15)
            r6.append(r5)
            java.lang.String r5 = ": finish fetch medias"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            defpackage.z68.c(r4, r5, new java.lang.Object[0])
            rk6 r4 = defpackage.rk6.a
            r0.o = r2
            r0.a = r3
            r0.c = r14
            java.lang.Object r4 = defpackage.yd7.a(r4, r11, r0)
            if (r4 != r1) goto L_0x00fa
            return r1
        L_0x00fa:
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            tk6 r5 = defpackage.tk6.a
            r0.o = r2
            r0.a = r3
            r0.b = r4
            r6 = 3
            r0.c = r6
            java.lang.Object r0 = defpackage.yd7.a(r5, r11, r0)
            if (r0 != r1) goto L_0x0112
            return r1
        L_0x0112:
            r1 = r4
        L_0x0113:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            boolean r2 = defpackage.e14.f(r2)
            if (r2 != 0) goto L_0x0122
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0122:
            java.util.concurrent.atomic.AtomicInteger r2 = r11.x0
            int r4 = r1 + r0
            r2.set(r4)
            java.util.concurrent.ConcurrentHashMap r2 = r11.y0
            r2.clear()
            xme r5 = r11.w
            java.lang.Object r6 = r5.getValue()
            wk6 r6 = (defpackage.wk6) r6
            vk6 r6 = r6.a
            java.util.List r7 = r3.a
            r2.put(r6, r7)
            java.util.List r6 = r3.a
            java.lang.Object r6 = kotlin.collections.CollectionsKt.firstOrNull(r6)
            k48 r6 = (defpackage.k48) r6
            java.util.concurrent.ConcurrentHashMap r7 = r11.z0
            if (r6 == 0) goto L_0x0154
            java.lang.Object r8 = r5.getValue()
            wk6 r8 = (defpackage.wk6) r8
            vk6 r8 = r8.a
            r7.put(r8, r6)
        L_0x0154:
            xme r6 = r11.y
            java.lang.Object r8 = r6.getValue()
            wk6 r8 = (defpackage.wk6) r8
            vk6 r8 = r8.a
            java.util.List r9 = r3.b
            r2.put(r8, r9)
            java.lang.Object r8 = kotlin.collections.CollectionsKt.firstOrNull(r9)
            k48 r8 = (defpackage.k48) r8
            if (r8 == 0) goto L_0x0176
            java.lang.Object r9 = r6.getValue()
            wk6 r9 = (defpackage.wk6) r9
            vk6 r9 = r9.a
            r7.put(r9, r8)
        L_0x0176:
            xme r8 = r11.z
            java.lang.Object r9 = r8.getValue()
            wk6 r9 = (defpackage.wk6) r9
            vk6 r9 = r9.a
            java.util.List r3 = r3.c
            r2.put(r9, r3)
            java.lang.Object r2 = kotlin.collections.CollectionsKt.firstOrNull(r3)
            k48 r2 = (defpackage.k48) r2
            if (r2 == 0) goto L_0x0198
            java.lang.Object r3 = r8.getValue()
            wk6 r3 = (defpackage.wk6) r3
            vk6 r3 = r3.a
            r7.put(r3, r2)
        L_0x0198:
            java.lang.Object r2 = r5.getValue()
            wk6 r2 = (defpackage.wk6) r2
            r3 = 9
            r7 = 1
            wk6 r2 = defpackage.wk6.a(r2, r4, r7, r3)
            r5.getClass()
            r4 = 0
            r5.m(r4, r2)
            java.lang.Object r2 = r6.getValue()
            wk6 r2 = (defpackage.wk6) r2
            wk6 r0 = defpackage.wk6.a(r2, r0, r7, r3)
            r6.getClass()
            r6.m(r4, r0)
            java.lang.Object r0 = r8.getValue()
            wk6 r0 = (defpackage.wk6) r0
            wk6 r0 = defpackage.wk6.a(r0, r1, r7, r3)
            r8.getClass()
            r8.m(r4, r0)
            xme r0 = r11.Y
            java.lang.Object r1 = r0.getValue()
            o85 r1 = (defpackage.o85) r1
            if (r1 == 0) goto L_0x01dc
            java.lang.Object r1 = r1.a
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L_0x01e0
        L_0x01dc:
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        L_0x01e0:
            o85 r2 = new o85
            r2.<init>(r1)
            r0.getClass()
            r0.m(r4, r2)
            java.lang.String r0 = defpackage.yd7.C0
            java.util.concurrent.atomic.AtomicInteger r1 = r11.v0
            int r1 = r1.get()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r1)
            java.lang.String r1 = ": finish load virtual albums"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            defpackage.z68.c(r0, r1, new java.lang.Object[0])
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
