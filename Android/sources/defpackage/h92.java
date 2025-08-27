package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: h92  reason: default package */
public final class h92 extends SuspendLambda implements Function2 {
    public ia2 a;
    public Set b;
    public int c;
    public final /* synthetic */ ia2 o;
    public final /* synthetic */ Set v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h92(ia2 ia2, Set set, Continuation continuation) {
        super(2, continuation);
        this.o = ia2;
        this.v = set;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new h92(this.o, this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h92) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0240, code lost:
        if (r5 != false) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x026a, code lost:
        if (r5 != false) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x028f, code lost:
        if (r5 != false) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02b1, code lost:
        if (r5 != false) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x02c6, code lost:
        if (r5 != false) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x02d8, code lost:
        if (r5 != false) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007f, code lost:
        r5 = r4.m();
     */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0120 A[EDGE_INSN: B:204:0x0120->B:71:0x0120 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0156 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001c
            if (r1 != r3) goto L_0x0014
            java.util.Set r0 = r12.b
            ia2 r12 = r12.a
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0044
        L_0x0014:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x001c:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.String r13 = defpackage.ia2.K0
            ia2 r13 = r12.o
            kotlin.Lazy r1 = r13.Z
            java.lang.Object r1 = r1.getValue()
            qx2 r1 = (defpackage.qx2) r1
            r12.a = r13
            java.util.Set r4 = r12.v
            r12.b = r4
            r12.c = r3
            my2 r1 = (defpackage.my2) r1
            r62 r12 = r1.n()
            java.util.ArrayList r12 = r12.B(r2)
            if (r12 != r0) goto L_0x0040
            return r0
        L_0x0040:
            r0 = r4
            r11 = r13
            r13 = r12
            r12 = r11
        L_0x0044:
            java.util.List r13 = (java.util.List) r13
            java.lang.String r1 = defpackage.ia2.K0
            r12.getClass()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0057
            java.util.List r12 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x02fa
        L_0x0057:
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x0062:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L_0x02f9
            java.lang.Object r4 = r13.next()
            a32 r4 = (defpackage.a32) r4
            q82 r5 = defpackage.q82.y
            boolean r5 = r0.contains(r5)
            r6 = 0
            if (r5 == 0) goto L_0x007d
            boolean r5 = r4.N()
            if (r5 != 0) goto L_0x007f
        L_0x007d:
            r5 = r6
            goto L_0x0092
        L_0x007f:
            vk3 r5 = r4.m()
            if (r5 == 0) goto L_0x007d
            boolean r5 = r5.c()
            if (r5 == 0) goto L_0x007d
            boolean r5 = r4.J()
            if (r5 != 0) goto L_0x007d
            r5 = r3
        L_0x0092:
            if (r5 != 0) goto L_0x00bb
            q82 r5 = defpackage.q82.z
            boolean r5 = r0.contains(r5)
            if (r5 == 0) goto L_0x00a2
            boolean r5 = r4.N()
            if (r5 != 0) goto L_0x00a4
        L_0x00a2:
            r5 = r6
            goto L_0x00bb
        L_0x00a4:
            vk3 r5 = r4.m()
            if (r5 == 0) goto L_0x00a2
            vm3 r5 = r5.a
            um3 r5 = r5.c
            tm3 r5 = r5.k
            tm3 r7 = defpackage.tm3.b
            if (r5 != r7) goto L_0x00a2
            boolean r5 = r4.J()
            if (r5 != 0) goto L_0x00a2
            r5 = r3
        L_0x00bb:
            if (r5 != 0) goto L_0x00ce
            q82 r5 = defpackage.q82.X
            boolean r5 = r0.contains(r5)
            if (r5 == 0) goto L_0x00cd
            boolean r5 = r4.J()
            if (r5 == 0) goto L_0x00cd
            r5 = r3
            goto L_0x00ce
        L_0x00cd:
            r5 = r6
        L_0x00ce:
            if (r5 != 0) goto L_0x00e3
            q82 r5 = defpackage.q82.v
            boolean r5 = r0.contains(r5)
            if (r5 == 0) goto L_0x00e0
            boolean r5 = r4.K()
            if (r5 == 0) goto L_0x00e0
            r5 = r3
            goto L_0x00e1
        L_0x00e0:
            r5 = r6
        L_0x00e1:
            r7 = r5
            goto L_0x00e4
        L_0x00e3:
            r7 = r6
        L_0x00e4:
            if (r5 != 0) goto L_0x015c
            q82 r5 = defpackage.q82.w
            boolean r5 = r0.contains(r5)
            if (r5 == 0) goto L_0x0124
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L_0x00f5
            goto L_0x0113
        L_0x00f5:
            java.util.Iterator r5 = r0.iterator()
        L_0x00f9:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0113
            java.lang.Object r8 = r5.next()
            q82 r8 = (defpackage.q82) r8
            cd4 r9 = defpackage.q82.a
            r9.getClass()
            java.util.LinkedHashSet r9 = defpackage.q82.c
            boolean r8 = r9.contains(r8)
            if (r8 == 0) goto L_0x00f9
            goto L_0x0124
        L_0x0113:
            boolean r5 = r4.L()
            if (r5 != 0) goto L_0x0122
            boolean r5 = r4.R()
            if (r5 == 0) goto L_0x0120
            goto L_0x0122
        L_0x0120:
            r5 = r6
            goto L_0x0154
        L_0x0122:
            r5 = r3
            goto L_0x0154
        L_0x0124:
            q82 r5 = defpackage.q82.w
            boolean r5 = r0.contains(r5)
            if (r5 == 0) goto L_0x0120
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L_0x0133
            goto L_0x0120
        L_0x0133:
            java.util.Iterator r5 = r0.iterator()
        L_0x0137:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0120
            java.lang.Object r8 = r5.next()
            q82 r8 = (defpackage.q82) r8
            cd4 r9 = defpackage.q82.a
            r9.getClass()
            java.util.LinkedHashSet r9 = defpackage.q82.c
            boolean r8 = r9.contains(r8)
            if (r8 == 0) goto L_0x0137
            boolean r5 = r4.L()
        L_0x0154:
            if (r7 != 0) goto L_0x015b
            if (r5 == 0) goto L_0x0159
            goto L_0x015b
        L_0x0159:
            r7 = r6
            goto L_0x015c
        L_0x015b:
            r7 = r3
        L_0x015c:
            if (r5 != 0) goto L_0x016f
            q82 r5 = defpackage.q82.x
            boolean r5 = r0.contains(r5)
            if (r5 == 0) goto L_0x016e
            boolean r5 = r4.N()
            if (r5 == 0) goto L_0x016e
            r5 = r3
            goto L_0x016f
        L_0x016e:
            r5 = r6
        L_0x016f:
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto L_0x0176
            goto L_0x0194
        L_0x0176:
            java.util.Iterator r8 = r0.iterator()
        L_0x017a:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0194
            java.lang.Object r9 = r8.next()
            q82 r9 = (defpackage.q82) r9
            cd4 r10 = defpackage.q82.a
            r10.getClass()
            java.util.LinkedHashSet r10 = defpackage.q82.o
            boolean r9 = r10.contains(r9)
            if (r9 == 0) goto L_0x017a
            goto L_0x0195
        L_0x0194:
            r5 = r3
        L_0x0195:
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto L_0x019c
            goto L_0x01fd
        L_0x019c:
            java.util.Iterator r8 = r0.iterator()
        L_0x01a0:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x01fd
            java.lang.Object r9 = r8.next()
            q82 r9 = (defpackage.q82) r9
            cd4 r10 = defpackage.q82.a
            r10.getClass()
            java.util.LinkedHashSet r10 = defpackage.q82.c
            boolean r9 = r10.contains(r9)
            if (r9 == 0) goto L_0x01a0
            if (r7 == 0) goto L_0x01fd
            q82 r7 = defpackage.q82.Z
            boolean r8 = r0.contains(r7)
            if (r8 == 0) goto L_0x01dd
            q82 r8 = defpackage.q82.Y
            boolean r8 = r0.contains(r8)
            if (r8 == 0) goto L_0x01dd
            boolean r7 = r4.c0()
            if (r7 != 0) goto L_0x01d7
            boolean r7 = r4.e0()
            if (r7 == 0) goto L_0x01db
        L_0x01d7:
            if (r5 == 0) goto L_0x01db
        L_0x01d9:
            r5 = r3
            goto L_0x01fd
        L_0x01db:
            r5 = r6
            goto L_0x01fd
        L_0x01dd:
            q82 r8 = defpackage.q82.Y
            boolean r8 = r0.contains(r8)
            if (r8 == 0) goto L_0x01ee
            boolean r7 = r4.e0()
            if (r7 == 0) goto L_0x01db
            if (r5 == 0) goto L_0x01db
            goto L_0x01d9
        L_0x01ee:
            boolean r7 = r0.contains(r7)
            if (r7 == 0) goto L_0x01db
            boolean r7 = r4.c0()
            if (r7 == 0) goto L_0x01db
            if (r5 == 0) goto L_0x01db
            goto L_0x01d9
        L_0x01fd:
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L_0x0205
            goto L_0x02dc
        L_0x0205:
            java.util.Iterator r7 = r0.iterator()
        L_0x0209:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x02dc
            java.lang.Object r8 = r7.next()
            q82 r8 = (defpackage.q82) r8
            cd4 r9 = defpackage.q82.a
            r9.getClass()
            java.util.LinkedHashSet r9 = defpackage.q82.b
            boolean r8 = r9.contains(r8)
            if (r8 == 0) goto L_0x0209
            q82 r7 = defpackage.q82.v0
            boolean r8 = r0.contains(r7)
            if (r8 == 0) goto L_0x0248
            q82 r8 = defpackage.q82.w0
            boolean r8 = r0.contains(r8)
            if (r8 == 0) goto L_0x0248
            q82 r8 = defpackage.q82.x0
            boolean r8 = r0.contains(r8)
            if (r8 == 0) goto L_0x0248
            m72 r7 = r4.b
            int r7 = r7.m
            if (r7 <= 0) goto L_0x0245
            if (r5 == 0) goto L_0x0245
        L_0x0242:
            r5 = r3
            goto L_0x02dc
        L_0x0245:
            r5 = r6
            goto L_0x02dc
        L_0x0248:
            boolean r8 = r0.contains(r7)
            kotlin.Lazy r9 = r12.b
            if (r8 == 0) goto L_0x026d
            q82 r8 = defpackage.q82.x0
            boolean r8 = r0.contains(r8)
            if (r8 == 0) goto L_0x026d
            m72 r7 = r4.b
            int r7 = r7.m
            if (r7 <= 0) goto L_0x0245
            java.lang.Object r7 = r9.getValue()
            x23 r7 = (defpackage.x23) r7
            boolean r7 = r4.X(r7)
            if (r7 == 0) goto L_0x0245
            if (r5 == 0) goto L_0x0245
            goto L_0x0242
        L_0x026d:
            q82 r8 = defpackage.q82.w0
            boolean r10 = r0.contains(r8)
            if (r10 == 0) goto L_0x0292
            q82 r10 = defpackage.q82.x0
            boolean r10 = r0.contains(r10)
            if (r10 == 0) goto L_0x0292
            m72 r7 = r4.b
            int r7 = r7.m
            if (r7 <= 0) goto L_0x0245
            java.lang.Object r7 = r9.getValue()
            x23 r7 = (defpackage.x23) r7
            boolean r7 = r4.X(r7)
            if (r7 != 0) goto L_0x0245
            if (r5 == 0) goto L_0x0245
            goto L_0x0242
        L_0x0292:
            boolean r10 = r0.contains(r7)
            if (r10 == 0) goto L_0x029f
            boolean r10 = r0.contains(r8)
            if (r10 == 0) goto L_0x029f
            goto L_0x02dc
        L_0x029f:
            boolean r8 = r0.contains(r8)
            if (r8 == 0) goto L_0x02b4
            java.lang.Object r7 = r9.getValue()
            x23 r7 = (defpackage.x23) r7
            boolean r7 = r4.X(r7)
            if (r7 != 0) goto L_0x0245
            if (r5 == 0) goto L_0x0245
            goto L_0x0242
        L_0x02b4:
            boolean r7 = r0.contains(r7)
            if (r7 == 0) goto L_0x02ca
            java.lang.Object r7 = r9.getValue()
            x23 r7 = (defpackage.x23) r7
            boolean r7 = r4.X(r7)
            if (r7 == 0) goto L_0x0245
            if (r5 == 0) goto L_0x0245
            goto L_0x0242
        L_0x02ca:
            q82 r7 = defpackage.q82.x0
            boolean r7 = r0.contains(r7)
            if (r7 == 0) goto L_0x02dc
            m72 r7 = r4.b
            int r7 = r7.m
            if (r7 <= 0) goto L_0x0245
            if (r5 == 0) goto L_0x0245
            goto L_0x0242
        L_0x02dc:
            q82 r7 = defpackage.q82.y0
            boolean r7 = r0.contains(r7)
            if (r7 == 0) goto L_0x02ee
            if (r5 == 0) goto L_0x02ed
            m72 r5 = r4.b
            boolean r5 = r5.k0
            if (r5 == 0) goto L_0x02ed
            r6 = r3
        L_0x02ed:
            r5 = r6
        L_0x02ee:
            if (r5 == 0) goto L_0x02f1
            goto L_0x02f2
        L_0x02f1:
            r4 = r2
        L_0x02f2:
            if (r4 == 0) goto L_0x0062
            r1.add(r4)
            goto L_0x0062
        L_0x02f9:
            r12 = r1
        L_0x02fa:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h92.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
