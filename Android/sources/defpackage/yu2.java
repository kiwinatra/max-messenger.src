package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: yu2  reason: default package */
public final class yu2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean X;
    public List a;
    public ov2 b;
    public Collection c;
    public Iterator o;
    public List v;
    public Collection w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ ov2 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yu2(ov2 ov2, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.z = ov2;
        this.X = z2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        yu2 yu2 = new yu2(this.z, this.X, continuation);
        yu2.y = obj;
        return yu2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yu2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = 2
            r2 = 1
            r3 = 0
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r0.x
            ov2 r6 = r0.z
            if (r5 == 0) goto L_0x0045
            if (r5 == r2) goto L_0x0020
            if (r5 != r1) goto L_0x0018
            kotlin.ResultKt.throwOnFailure(r20)
            goto L_0x01a6
        L_0x0018:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0020:
            java.util.Collection r5 = r0.w
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.List r7 = r0.v
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r8 = r0.o
            java.util.Collection r9 = r0.c
            java.util.Collection r9 = (java.util.Collection) r9
            ov2 r10 = r0.b
            java.util.List r11 = r0.a
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r0.y
            d14 r12 = (defpackage.d14) r12
            kotlin.ResultKt.throwOnFailure(r20)
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r8
            r8 = r7
            r7 = r9
            r9 = r20
            goto L_0x00ce
        L_0x0045:
            kotlin.ResultKt.throwOnFailure(r20)
            java.lang.Object r5 = r0.y
            d14 r5 = (defpackage.d14) r5
            ruc r7 = r6.b
            java.util.List r7 = r7.a()
            ruc r8 = r6.b
            java.util.List r8 = r8.b()
            st3 r9 = r6.c
            java.util.List r9 = r9.a()
            defpackage.e14.e(r5)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r7, 10)
            r10.<init>(r11)
            java.util.Iterator r7 = r7.iterator()
        L_0x0070:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L_0x0086
            java.lang.Object r11 = r7.next()
            vk3 r11 = (defpackage.vk3) r11
            ny2 r12 = r6.v
            cuc r11 = r12.b(r11)
            r10.add(r11)
            goto L_0x0070
        L_0x0086:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r7 = new java.util.ArrayList
            int r11 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r8, 10)
            r7.<init>(r11)
            java.util.Iterator r8 = r8.iterator()
            r12 = r5
            r5 = r7
            r11 = r9
            r7 = r10
            r10 = r6
        L_0x009a:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00da
            java.lang.Object r9 = r8.next()
            ald r9 = (defpackage.ald) r9
            dld r13 = r10.w
            r0.y = r12
            r14 = r11
            java.util.List r14 = (java.util.List) r14
            r0.a = r14
            r0.b = r10
            r14 = r5
            java.util.Collection r14 = (java.util.Collection) r14
            r0.c = r14
            r0.o = r8
            r15 = r7
            java.util.List r15 = (java.util.List) r15
            r0.v = r15
            r0.w = r14
            r0.x = r2
            java.lang.Object r9 = r13.b(r9, r0)
            if (r9 != r4) goto L_0x00c8
            return r4
        L_0x00c8:
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r8
            r8 = r7
            r7 = r5
        L_0x00ce:
            ykd r9 = (defpackage.ykd) r9
            r5.add(r9)
            r5 = r7
            r7 = r8
            r8 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            goto L_0x009a
        L_0x00da:
            java.util.List r5 = (java.util.List) r5
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r11, 10)
            r8.<init>(r9)
            java.util.Iterator r9 = r11.iterator()
        L_0x00eb:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0101
            java.lang.Object r10 = r9.next()
            vk3 r10 = (defpackage.vk3) r10
            ny2 r11 = r6.v
            zo3 r10 = r11.a(r10)
            r8.add(r10)
            goto L_0x00eb
        L_0x0101:
            z77 r9 = new z77
            r9.<init>(r7, r5, r8)
            defpackage.e14.e(r12)
            xme r5 = r6.C0
            vu2 r7 = new vu2
            uu2 r14 = defpackage.uu2.c
            java.util.List r17 = kotlin.collections.CollectionsKt.emptyList()
            boolean r8 = r0.X
            java.lang.String r15 = ""
            r13 = r7
            r16 = r9
            r18 = r8
            r13.<init>(r14, r15, r16, r17, r18)
            r5.getClass()
            r8 = 0
            r5.m(r8, r7)
            kotlin.Lazy r5 = r6.A0
            java.lang.Object r5 = r5.getValue()
            bo3 r5 = (defpackage.bo3) r5
            bs5 r5 = r5.a()
            kotlin.Lazy r7 = r6.z0
            java.lang.Object r7 = r7.getValue()
            ns2 r7 = (defpackage.ns2) r7
            wi0 r7 = (defpackage.wi0) r7
            ps5 r7 = r7.b()
            bs5[] r9 = new defpackage.bs5[r1]
            r9[r3] = r5
            r9[r2] = r7
            g12 r5 = defpackage.bs0.M(r9)
            kotlin.time.Duration$Companion r7 = kotlin.time.Duration.Companion
            kotlin.time.DurationUnit r7 = kotlin.time.DurationUnit.SECONDS
            long r9 = kotlin.time.DurationKt.toDuration((int) r2, (kotlin.time.DurationUnit) r7)
            g12 r5 = defpackage.gt5.d(r5, r9)
            dv2 r7 = new dv2
            r7.<init>(r5, r6, r3)
            dv2 r5 = new dv2
            r5.<init>(r7, r6, r2)
            fv2 r2 = new fv2
            r2.<init>(r6, r8)
            ps5 r7 = new ps5
            r9 = 5
            r7.<init>(r5, r2, r9)
            sa r2 = new sa
            r5 = 4
            r2.<init>((java.lang.Object) r6, (kotlin.coroutines.Continuation) r8, (int) r5, (boolean) r3)
            wb r5 = new wb
            r9 = 15
            r5.<init>(r9, r7, r2)
            gaf r2 = r6.x
            osa r2 = (defpackage.osa) r2
            q04 r2 = r2.a()
            bs5 r2 = defpackage.bs0.F(r5, r2)
            r5 = 3
            bs5 r2 = defpackage.bs0.j(r2, r3, r5)
            pm7 r2 = defpackage.bs0.K(r2, r12)
            r0.y = r8
            r0.a = r8
            r0.b = r8
            r0.c = r8
            r0.o = r8
            r0.v = r8
            r0.w = r8
            r0.x = r1
            qn7 r2 = (defpackage.qn7) r2
            java.lang.Object r0 = r2.d(r0)
            if (r0 != r4) goto L_0x01a6
            return r4
        L_0x01a6:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yu2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
