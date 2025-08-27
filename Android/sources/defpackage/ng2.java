package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ng2  reason: default package */
public final class ng2 extends SuspendLambda implements Function2 {
    public a89 a;
    public int b;
    public final /* synthetic */ gh2 c;
    public final /* synthetic */ m29 o;
    public final /* synthetic */ boolean v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ng2(gh2 gh2, m29 m29, boolean z, Continuation continuation) {
        super(2, continuation);
        this.c = gh2;
        this.o = m29;
        this.v = z;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ng2(this.c, this.o, this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ng2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r8 = r23
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r8.b
            r1 = 0
            r2 = 3
            r3 = 4
            r4 = 2
            r5 = 1
            gh2 r6 = r8.c
            if (r0 == 0) goto L_0x0036
            if (r0 == r5) goto L_0x0030
            if (r0 == r4) goto L_0x0027
            if (r0 == r2) goto L_0x0022
            if (r0 != r3) goto L_0x001a
            goto L_0x0022
        L_0x001a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0022:
            kotlin.ResultKt.throwOnFailure(r24)
            goto L_0x0180
        L_0x0027:
            a89 r0 = r8.a
            kotlin.ResultKt.throwOnFailure(r24)
            r3 = r24
            goto L_0x00c4
        L_0x0030:
            kotlin.ResultKt.throwOnFailure(r24)
            r0 = r24
            goto L_0x004a
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r24)
            m29 r0 = r8.o
            long r10 = r0.m()
            r8.b = r5
            kotlin.reflect.KProperty[] r0 = defpackage.gh2.P0
            java.lang.Object r0 = r6.t(r10, r8)
            if (r0 != r9) goto L_0x004a
            return r9
        L_0x004a:
            a89 r0 = (defpackage.a89) r0
            if (r0 != 0) goto L_0x0051
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0051:
            kotlin.reflect.KProperty[] r7 = defpackage.gh2.P0
            a32 r7 = r6.o()
            if (r7 == 0) goto L_0x0183
            m72 r7 = r7.b
            long r14 = r7.a
            ha9 r7 = r0.a
            long r12 = r7.c
            w28 r7 = r7.x0
            if (r7 == 0) goto L_0x00d0
            java.lang.Object r7 = r7.b
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x00d0
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            kotlin.coroutines.CoroutineContext r10 = r23.getContext()
            jx3 r11 = defpackage.e14.a(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            int r3 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r7, 10)
            r10.<init>(r3)
            java.util.Iterator r3 = r7.iterator()
        L_0x0082:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x00b7
            java.lang.Object r7 = r3.next()
            mg2 r5 = new mg2
            r16 = 0
            m29 r4 = r8.o
            r18 = r10
            r10 = r5
            r24 = r3
            r3 = r11
            r11 = r7
            r19 = r12
            r12 = r16
            r13 = r4
            r21 = r14
            r16 = r19
            r10.<init>(r11, r12, r13, r14, r16)
            nk4 r4 = defpackage.ev0.d(r3, r1, r5, r2)
            r5 = r18
            r5.add(r4)
            r11 = r3
            r10 = r5
            r12 = r19
            r4 = 2
            r5 = 1
            r3 = r24
            goto L_0x0082
        L_0x00b7:
            r5 = r10
            r8.a = r0
            r3 = 2
            r8.b = r3
            java.lang.Object r3 = defpackage.j4b.g(r5, r8)
            if (r3 != r9) goto L_0x00c4
            return r9
        L_0x00c4:
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x00d0
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r3 = kotlin.collections.CollectionsKt.filterNotNull(r3)
            r7 = r3
            goto L_0x00d1
        L_0x00d0:
            r7 = r1
        L_0x00d1:
            if (r7 == 0) goto L_0x0180
            ha9 r3 = r0.a
            w28 r3 = r3.x0
            if (r3 == 0) goto L_0x00eb
            java.lang.Object r3 = r3.b
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x00eb
            int r3 = r3.size()
            int r4 = r7.size()
            if (r3 != r4) goto L_0x00eb
            goto L_0x0180
        L_0x00eb:
            boolean r3 = r7.isEmpty()
            ha9 r4 = r0.a
            r5 = 1
            if (r3 != r5) goto L_0x00ff
            java.lang.String r3 = r4.y
            if (r3 == 0) goto L_0x0105
            int r3 = r3.length()
            if (r3 != 0) goto L_0x00ff
            goto L_0x0105
        L_0x00ff:
            eg2 r3 = r6.c
            eg2 r5 = defpackage.eg2.a
            if (r3 == r5) goto L_0x014a
        L_0x0105:
            kotlin.reflect.KProperty[] r3 = defpackage.gh2.P0
            a32 r3 = r6.o()
            if (r3 != 0) goto L_0x0110
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0110:
            vk3 r0 = r0.b
            boolean r0 = r0.w
            vj5 r5 = r6.x0
            boolean r0 = defpackage.cd9.a(r3, r5, r0)
            if (r0 != 0) goto L_0x011f
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x011f:
            kotlin.Lazy r0 = r6.X
            java.lang.Object r0 = r0.getValue()
            na9 r0 = (defpackage.na9) r0
            long r3 = r4.b
            r8.a = r1
            r8.b = r2
            r0.getClass()
            java.lang.Long r1 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r3)
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
            boolean r2 = r8.v
            java.lang.Object r0 = r0.a(r2, r1, r8)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L_0x0145
            goto L_0x0147
        L_0x0145:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x0147:
            if (r0 != r9) goto L_0x0180
            return r9
        L_0x014a:
            a32 r2 = r6.o()
            if (r2 != 0) goto L_0x0153
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0153:
            cd9 r3 = r0.w
            boolean r0 = r3.b(r2, r0)
            if (r0 != 0) goto L_0x015e
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x015e:
            kotlin.Lazy r0 = r6.z
            java.lang.Object r0 = r0.getValue()
            uz4 r0 = (defpackage.uz4) r0
            long r2 = r4.b
            r8.a = r1
            r1 = 4
            r8.b = r1
            r10 = 1
            long r5 = r4.z
            java.lang.String r11 = r4.y
            r1 = r2
            r3 = r5
            r5 = r11
            r6 = r7
            r7 = r10
            r8 = r23
            java.lang.Object r0 = r0.a(r1, r3, r5, r6, r7, r8)
            if (r0 != r9) goto L_0x0180
            return r9
        L_0x0180:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0183:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ng2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
