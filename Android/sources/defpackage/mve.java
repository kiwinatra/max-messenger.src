package defpackage;

import java.util.Collection;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;

/* renamed from: mve  reason: default package */
public final class mve extends xag {
    public final xme X;
    public final etc Y;
    public final ts Z;
    public final long b;
    public final due c;
    public final gaf o;
    public final iue v;
    public final Lazy w;
    public final Lazy x;
    public final s85 y = new s85(0);
    public final s85 z = new s85(0);

    /* JADX WARNING: type inference failed for: r1v5, types: [qae, ts] */
    public mve(long j, due due, gaf gaf, iue iue, Lazy lazy, Lazy lazy2) {
        this.b = j;
        this.c = due;
        this.o = gaf;
        this.v = iue;
        this.w = lazy;
        this.x = lazy2;
        xme a = f6e.a(v8e.c);
        this.X = a;
        this.Y = new etc(a);
        this.Z = new qae(0);
        bs0.K(bs0.F(new ps5(new i21(due.e, iue.e, gve.a, 4), new hve(this, (Continuation) null), 5), ((osa) gaf).b()), this.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object j(defpackage.mve r10, java.util.List r11, defpackage.fue r12, kotlin.coroutines.Continuation r13) {
        /*
            r10.getClass()
            boolean r0 = r13 instanceof defpackage.ive
            if (r0 == 0) goto L_0x0016
            r0 = r13
            ive r0 = (defpackage.ive) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x001b
        L_0x0016:
            ive r0 = new ive
            r0.<init>(r10, r13)
        L_0x001b:
            java.lang.Object r13 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L_0x0040
            if (r2 == r3) goto L_0x003a
            if (r2 != r4) goto L_0x0032
            mve r10 = r0.a
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x00c7
        L_0x0032:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003a:
            mve r10 = r0.a
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0090
        L_0x0040:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Class<mve> r13 = defpackage.mve.class
            java.lang.String r13 = r13.getName()
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x004e
            goto L_0x007e
        L_0x004e:
            boolean r5 = r2.c()
            if (r5 == 0) goto L_0x007e
            w78 r5 = defpackage.w78.o
            int r6 = r11.size()
            r12.getClass()
            fue r7 = defpackage.iue.k
            if (r12 != r7) goto L_0x0063
            r7 = r3
            goto L_0x0064
        L_0x0063:
            r7 = 0
        L_0x0064:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Showcase content. Sets size from sections:"
            r8.<init>(r9)
            r8.append(r6)
            java.lang.String r6 = ", search in initial:"
            r8.append(r6)
            r8.append(r7)
            java.lang.String r6 = r8.toString()
            r7 = 0
            r2.d(r5, r13, r6, r7)
        L_0x007e:
            r12.getClass()
            fue r13 = defpackage.iue.k
            if (r12 != r13) goto L_0x00a3
            r0.a = r10
            r0.o = r3
            java.lang.Object r13 = r10.m(r11, r0)
            if (r13 != r1) goto L_0x0090
            goto L_0x00d1
        L_0x0090:
            java.util.List r13 = (java.util.List) r13
            boolean r11 = r13.isEmpty()
            if (r11 == 0) goto L_0x009b
            v8e r11 = defpackage.v8e.c
            goto L_0x00ca
        L_0x009b:
            v8e r11 = new v8e
            u8e r12 = defpackage.u8e.b
            r11.<init>(r12, r13)
            goto L_0x00ca
        L_0x00a3:
            boolean r11 = r12.b
            if (r11 == 0) goto L_0x00bc
            xme r11 = r10.X
            java.lang.Object r11 = r11.getValue()
            v8e r11 = (defpackage.v8e) r11
            u8e r12 = defpackage.u8e.a
            java.util.List r13 = r11.b
            r11.getClass()
            v8e r11 = new v8e
            r11.<init>(r12, r13)
            goto L_0x00ca
        L_0x00bc:
            r0.a = r10
            r0.o = r4
            java.lang.Object r13 = r10.l(r12, r0)
            if (r13 != r1) goto L_0x00c7
            goto L_0x00d1
        L_0x00c7:
            r11 = r13
            v8e r11 = (defpackage.v8e) r11
        L_0x00ca:
            xme r10 = r10.X
            r10.setValue(r11)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x00d1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mve.j(mve, java.util.List, fue, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean k() {
        Collection collection;
        iue iue = this.v;
        if (!iue.a()) {
            due due = this.c;
            Long l = (Long) due.f.get();
            if ((l != null && l.longValue() == 0) || !(!((Collection) due.d.getValue()).isEmpty())) {
                return false;
            }
        } else if (((eue) iue.g.get()).a == 0 || (collection = ((fue) iue.d.getValue()).a) == null || collection.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(defpackage.fue r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.jve
            if (r0 == 0) goto L_0x0013
            r0 = r7
            jve r0 = (defpackage.jve) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            jve r0 = new jve
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            u8e r5 = r0.a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0067
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r7)
            java.util.List r7 = r6.a
            java.util.Collection r7 = (java.util.Collection) r7
            if (r7 == 0) goto L_0x0046
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0043
            goto L_0x0046
        L_0x0043:
            u8e r7 = defpackage.u8e.c
            goto L_0x0048
        L_0x0046:
            u8e r7 = defpackage.u8e.o
        L_0x0048:
            u8e r2 = defpackage.u8e.o
            if (r7 != r2) goto L_0x0051
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x006c
        L_0x0051:
            java.util.List r6 = r6.a
            if (r6 != 0) goto L_0x0059
            java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
        L_0x0059:
            r0.a = r7
            r0.o = r3
            java.lang.Object r5 = r5.m(r6, r0)
            if (r5 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r4 = r7
            r7 = r5
            r5 = r4
        L_0x0067:
            r6 = r7
            java.util.List r6 = (java.util.List) r6
            r7 = r5
            r5 = r6
        L_0x006c:
            v8e r6 = new v8e
            r6.<init>(r7, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mve.l(fue, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(java.util.List r39, kotlin.coroutines.Continuation r40) {
        /*
            r38 = this;
            r0 = r40
            boolean r1 = r0 instanceof defpackage.kve
            if (r1 == 0) goto L_0x0017
            r1 = r0
            kve r1 = (defpackage.kve) r1
            int r2 = r1.y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.y = r2
            r2 = r38
            goto L_0x001e
        L_0x0017:
            kve r1 = new kve
            r2 = r38
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.w
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r1.y
            r5 = 1
            if (r4 == 0) goto L_0x004c
            if (r4 != r5) goto L_0x0044
            java.util.Collection r2 = r1.v
            java.util.Collection r2 = (java.util.Collection) r2
            bqe r4 = r1.o
            java.util.Iterator r6 = r1.c
            java.util.Collection r7 = r1.b
            java.util.Collection r7 = (java.util.Collection) r7
            mve r8 = r1.a
            kotlin.ResultKt.throwOnFailure(r0)
            r37 = r4
            r4 = r2
            r2 = r8
            r8 = r6
            r6 = r37
            goto L_0x0095
        L_0x0044:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004c:
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r39
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            int r6 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r0, 10)
            r4.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
        L_0x0061:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0134
            java.lang.Object r0 = r6.next()
            bqe r0 = (defpackage.bqe) r0
            kotlin.Lazy r7 = r2.w
            java.lang.Object r7 = r7.getValue()
            ai5 r7 = (defpackage.ai5) r7
            long r8 = r0.a
            yia r7 = r7.d(r8)
            r1.a = r2
            r8 = r4
            java.util.Collection r8 = (java.util.Collection) r8
            r1.b = r8
            r1.c = r6
            r1.o = r0
            r1.v = r8
            r1.y = r5
            java.lang.Object r7 = defpackage.bs0.g(r7, r1)
            if (r7 != r3) goto L_0x0091
            return r3
        L_0x0091:
            r8 = r6
            r6 = r0
            r0 = r7
            r7 = r4
        L_0x0095:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r18 = r0.booleanValue()
            r2.getClass()
            long r10 = r6.a
            java.lang.String r0 = r6.b
            if (r0 != 0) goto L_0x00a6
            java.lang.String r0 = ""
        L_0x00a6:
            mgf r12 = new mgf
            r12.<init>(r0)
            java.util.List r0 = r6.h
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r15 = new java.util.ArrayList
            int r9 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r0, 10)
            r15.<init>(r9)
            java.util.Iterator r0 = r0.iterator()
        L_0x00bc:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x010e
            java.lang.Object r9 = r0.next()
            boe r9 = (defpackage.boe) r9
            gpe r13 = new gpe
            r14 = r6
            long r5 = r9.a
            r38 = r0
            java.lang.String r0 = r9.y
            boolean r16 = defpackage.cvg.A(r0)
            if (r16 == 0) goto L_0x00d9
            java.lang.String r0 = r9.o
        L_0x00d9:
            r26 = r0
            r31 = 0
            r39 = r1
            long r0 = r9.a
            r36 = r2
            r35 = r3
            long r2 = r9.Z
            java.lang.String r9 = r9.v0
            r28 = 0
            r29 = 0
            r30 = 0
            r34 = 2016(0x7e0, float:2.825E-42)
            r19 = r13
            r20 = r5
            r22 = r2
            r24 = r2
            r27 = r9
            r32 = r0
            r19.<init>(r20, r22, r24, r26, r27, r28, r29, r30, r31, r32, r34)
            r15.add(r13)
            r0 = r38
            r1 = r39
            r6 = r14
            r3 = r35
            r2 = r36
            r5 = 1
            goto L_0x00bc
        L_0x010e:
            r39 = r1
            r36 = r2
            r35 = r3
            r14 = r6
            lqe r16 = defpackage.lqe.v
            mqe r0 = new mqe
            r1 = 0
            r17 = 0
            r2 = r14
            java.lang.String r13 = r2.c
            r19 = 72
            r9 = r0
            r14 = r1
            r9.<init>(r10, r12, r13, r14, r15, r16, r17, r18, r19)
            r4.add(r0)
            r1 = r39
            r4 = r7
            r6 = r8
            r3 = r35
            r2 = r36
            r5 = 1
            goto L_0x0061
        L_0x0134:
            java.util.List r4 = (java.util.List) r4
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            ed7 r0 = new ed7
            r1 = 13
            r0.<init>(r1)
            java.util.List r0 = kotlin.collections.CollectionsKt.sortedWith(r4, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mve.m(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
