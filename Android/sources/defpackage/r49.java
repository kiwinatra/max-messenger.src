package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* renamed from: r49  reason: default package */
public final class r49 extends xag {
    public final Lazy X;
    public Set Y = SetsKt.emptySet();
    public aje Z;
    public final long b;
    public final ij2 c;
    public final Integer o;
    public final Function0 v;
    public final Lazy v0 = LazyKt.lazy(new c28(4, this));
    public final Function0 w;
    public final etc w0;
    public final t39 x;
    public final wb x0;
    public final Lazy y;
    public final Lazy z;

    public r49(long j, ij2 ij2, Lazy lazy, Integer num, s49 s49, Function0 function0) {
        a49 a49 = a49.a;
        Lazy h = a49.getAccessor().h(gaf.class);
        Lazy h2 = a49.getAccessor().h(eu3.class);
        this.b = j;
        this.c = ij2;
        this.o = num;
        this.v = s49;
        this.w = function0;
        this.x = (t39) a49.getAccessor().g(t39.class);
        this.y = h;
        this.z = lazy;
        this.X = h2;
        bs5 F = bs0.F(bs0.b0(new wb(26, ((z49) lazy.getValue()).getMembers(), this), new uu5((Continuation) null, (Object) this, 7)), ((osa) ((gaf) h.getValue())).a());
        List emptyList = CollectionsKt.emptyList();
        etc X2 = bs0.X(F, this.a, z6e.a, emptyList);
        this.w0 = X2;
        this.x0 = bs0.u(X2, ((z49) lazy.getValue()).b(), (bs5) function0.invoke(), new vi1(this, (Continuation) null, 2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
        if (r12 == r1) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fb, code lost:
        if (r12 == r1) goto L_0x006f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object j(defpackage.n39 r9, defpackage.r49 r10, java.util.List r11, kotlin.coroutines.Continuation r12) {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof defpackage.n49
            if (r0 == 0) goto L_0x0016
            r0 = r12
            n49 r0 = (defpackage.n49) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x001b
        L_0x0016:
            n49 r0 = new n49
            r0.<init>(r10, r12)
        L_0x001b:
            java.lang.Object r12 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00ff
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            java.util.List r9 = r0.a
            r11 = r9
            java.util.List r11 = (java.util.List) r11
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0072
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r12)
            boolean r12 = r9 instanceof defpackage.k39
            ij2 r2 = r10.c
            long r5 = r10.b
            if (r12 == 0) goto L_0x0085
            k39 r9 = (defpackage.k39) r9
            long r7 = r9.a
            int r12 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r12 != 0) goto L_0x0102
            ij2 r12 = r9.b
            if (r12 != r2) goto L_0x0102
            java.util.Collection r9 = r9.c
            boolean r12 = r9.isEmpty()
            if (r12 == 0) goto L_0x0062
            goto L_0x0102
        L_0x0062:
            r12 = r11
            java.util.List r12 = (java.util.List) r12
            r0.a = r12
            r0.o = r4
            java.lang.Object r12 = r10.k(r9, r0)
            if (r12 != r1) goto L_0x0072
        L_0x006f:
            r11 = r1
            goto L_0x0102
        L_0x0072:
            java.util.List r12 = (java.util.List) r12
            java.util.Collection r11 = (java.util.Collection) r11
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.List r9 = kotlin.collections.CollectionsKt.plus(r11, r12)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Set r9 = kotlin.collections.CollectionsKt.toSet(r9)
        L_0x0082:
            r11 = r9
            goto L_0x0102
        L_0x0085:
            boolean r12 = r9 instanceof defpackage.m39
            if (r12 == 0) goto L_0x00d1
            m39 r9 = (defpackage.m39) r9
            long r0 = r9.a
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r10 != 0) goto L_0x0102
            ij2 r10 = r9.b
            if (r10 != r2) goto L_0x0102
            java.util.Collection r9 = r9.c
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L_0x009e
            goto L_0x0102
        L_0x009e:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r12 = r11.iterator()
        L_0x00a9:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00c6
            java.lang.Object r0 = r12.next()
            r1 = r0
            z29 r1 = (defpackage.z29) r1
            long r1 = r1.a
            java.lang.Long r1 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r1)
            boolean r1 = r9.contains(r1)
            if (r1 == 0) goto L_0x00a9
            r10.add(r0)
            goto L_0x00a9
        L_0x00c6:
            java.util.Set r9 = kotlin.collections.CollectionsKt.toSet(r10)
            java.util.List r9 = kotlin.collections.CollectionsKt.minus(r11, r9)
            java.util.Collection r9 = (java.util.Collection) r9
            goto L_0x0082
        L_0x00d1:
            boolean r12 = r9 instanceof defpackage.l39
            if (r12 == 0) goto L_0x0103
            r12 = r9
            l39 r12 = (defpackage.l39) r12
            java.util.List r12 = r12.a
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x00e1
            goto L_0x0102
        L_0x00e1:
            kotlin.Lazy r12 = r10.y
            java.lang.Object r12 = r12.getValue()
            gaf r12 = (defpackage.gaf) r12
            osa r12 = (defpackage.osa) r12
            q04 r12 = r12.a()
            o49 r2 = new o49
            r4 = 0
            r2.<init>(r9, r10, r11, r4)
            r0.o = r3
            java.lang.Object r12 = defpackage.ev0.I(r12, r2, r0)
            if (r12 != r1) goto L_0x00ff
            goto L_0x006f
        L_0x00ff:
            java.util.Collection r12 = (java.util.Collection) r12
            r11 = r12
        L_0x0102:
            return r11
        L_0x0103:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r49.j(n39, r49, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(java.util.Collection r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.l49
            if (r0 == 0) goto L_0x0013
            r0 = r9
            l49 r0 = (defpackage.l49) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x0018
        L_0x0013:
            l49 r0 = new l49
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x007d
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            kotlin.Lazy r9 = r7.y
            java.lang.Object r9 = r9.getValue()
            gaf r9 = (defpackage.gaf) r9
            osa r9 = (defpackage.osa) r9
            q04 r9 = r9.b()
            if (r9 != 0) goto L_0x004a
            kotlin.coroutines.CoroutineContext r9 = r0.getContext()
        L_0x004a:
            jx3 r9 = defpackage.e14.a(r9)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r8, 10)
            r2.<init>(r4)
            java.util.Iterator r8 = r8.iterator()
        L_0x005b:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x0074
            java.lang.Object r4 = r8.next()
            k49 r5 = new k49
            r6 = 0
            r5.<init>(r4, r6, r7)
            r4 = 3
            nk4 r4 = defpackage.ev0.d(r9, r6, r5, r4)
            r2.add(r4)
            goto L_0x005b
        L_0x0074:
            r0.c = r3
            java.lang.Object r9 = defpackage.j4b.g(r2, r0)
            if (r9 != r1) goto L_0x007d
            return r1
        L_0x007d:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.List r7 = kotlin.collections.CollectionsKt.filterNotNull(r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r49.k(java.util.Collection, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
