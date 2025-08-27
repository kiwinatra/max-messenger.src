package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: rpe  reason: default package */
public final class rpe extends SuspendLambda implements Function2 {
    public boe a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ upe o;
    public final /* synthetic */ long v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rpe(upe upe, long j, Continuation continuation) {
        super(2, continuation);
        this.o = upe;
        this.v = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        rpe rpe = new rpe(this.o, this.v, continuation);
        rpe.c = obj;
        return rpe;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rpe) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.b
            r2 = 1
            r3 = 2
            long r4 = r11.v
            upe r6 = r11.o
            if (r1 == 0) goto L_0x002c
            if (r1 == r2) goto L_0x0024
            if (r1 != r3) goto L_0x001c
            boe r0 = r11.a
            java.lang.Object r11 = r11.c
            d14 r11 = (defpackage.d14) r11
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0075
        L_0x001c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0024:
            java.lang.Object r1 = r11.c
            d14 r1 = (defpackage.d14) r1
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0047
        L_0x002c:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.Object r12 = r11.c
            r1 = r12
            d14 r1 = (defpackage.d14) r1
            kotlin.Lazy r12 = r6.v
            java.lang.Object r12 = r12.getValue()
            bte r12 = (defpackage.bte) r12
            r11.c = r1
            r11.b = r2
            java.lang.Object r12 = r12.a(r4, r11)
            if (r12 != r0) goto L_0x0047
            return r0
        L_0x0047:
            boe r12 = (defpackage.boe) r12
            kotlin.Lazy r7 = r6.x
            java.lang.Object r7 = r7.getValue()
            vi5 r7 = (defpackage.vi5) r7
            r7.getClass()
            c10 r8 = new c10
            r9 = 24
            r8.<init>(r4, r9)
            om0 r7 = r7.j
            r7.getClass()
            yia r9 = new yia
            r10 = 1
            r9.<init>(r7, r8, r10)
            r11.c = r1
            r11.a = r12
            r11.b = r3
            java.lang.Object r11 = defpackage.bs0.g(r9, r11)
            if (r11 != r0) goto L_0x0073
            return r0
        L_0x0073:
            r0 = r12
            r12 = r11
        L_0x0075:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r11 = r12.booleanValue()
            xme r12 = r6.v0
            if (r0 == 0) goto L_0x0088
            java.lang.Long r1 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r4)
            gpe r11 = defpackage.upe.k(r0, r11, r1)
            goto L_0x008a
        L_0x0088:
            gpe r11 = defpackage.gpe.w0
        L_0x008a:
            r12.setValue(r11)
            xme r11 = r6.z0
            java.lang.Object r12 = r11.getValue()
            mqe r12 = (defpackage.mqe) r12
            if (r12 != 0) goto L_0x00a1
            java.lang.Long r11 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r4)
            r6.j(r11)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L_0x00a1:
            java.util.List r0 = r12.v
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r0, 10)
            r1.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x00b2:
            boolean r3 = r0.hasNext()
            r6 = 0
            if (r3 == 0) goto L_0x00d8
            java.lang.Object r3 = r0.next()
            gpe r3 = (defpackage.gpe) r3
            long r7 = r3.a
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            r8 = 3071(0xbff, float:4.303E-42)
            if (r7 != 0) goto L_0x00cc
            gpe r3 = defpackage.gpe.h(r3, r6, r2, r8)
            goto L_0x00d4
        L_0x00cc:
            boolean r7 = r3.Y
            if (r7 == 0) goto L_0x00d4
            gpe r3 = defpackage.gpe.h(r3, r6, r6, r8)
        L_0x00d4:
            r1.add(r3)
            goto L_0x00b2
        L_0x00d8:
            r0 = 239(0xef, float:3.35E-43)
            mqe r12 = defpackage.mqe.h(r12, r1, r6, r6, r0)
            r11.getClass()
            r0 = 0
            r11.m(r0, r12)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rpe.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
