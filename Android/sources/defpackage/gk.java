package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* renamed from: gk  reason: default package */
public final class gk {
    public static final /* synthetic */ KProperty[] p;
    public final rl a;
    public final j6d b;
    public final x23 c;
    public final gaf d;
    public final rk e;
    public final String f = gk.class.getName();
    public final Lazy g = LazyKt.lazy(new oj(this, 0));
    public final Lazy h = LazyKt.lazy(new oj(this, 1));
    public final Lazy i = LazyKt.lazy(new oj(this, 2));
    public final jx3 j;
    public final wie k;
    public final wie l;
    public final wie m;
    public final ConcurrentHashMap n;
    public final CopyOnWriteArrayList o;

    static {
        Class<gk> cls = gk.class;
        p = new KProperty[]{rae.s(cls, "warmupJob", "getWarmupJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "updateJob", "getUpdateJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "animojiSetsUpdateJob", "getAnimojiSetsUpdateJob()Lkotlinx/coroutines/Job;", 0)};
    }

    public gk(rl rlVar, j6d j6d, x23 x23, gaf gaf, rk rkVar, m95 m95) {
        this.a = rlVar;
        this.b = j6d;
        this.c = x23;
        this.d = gaf;
        this.e = rkVar;
        this.j = e14.a(((osa) gaf).b().plus(new n95(m95)));
        this.k = o5a.U();
        this.l = o5a.U();
        this.m = o5a.U();
        this.n = new ConcurrentHashMap();
        this.o = new CopyOnWriteArrayList();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.gk r10, java.util.Map r11, kotlin.coroutines.Continuation r12) {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof defpackage.pj
            if (r0 == 0) goto L_0x0016
            r0 = r12
            pj r0 = (defpackage.pj) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.w = r1
            goto L_0x001b
        L_0x0016:
            pj r0 = new pj
            r0.<init>(r10, r12)
        L_0x001b:
            java.lang.Object r12 = r0.o
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.util.ArrayList r10 = r0.c
            java.util.Map r11 = r0.b
            gk r0 = r0.a
            kotlin.ResultKt.throwOnFailure(r12)
            r1 = r10
            r10 = r0
            goto L_0x007d
        L_0x0034:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003c:
            kotlin.ResultKt.throwOnFailure(r12)
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x004b
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x010f
        L_0x004b:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            pi r2 = r10.h()
            r0.a = r10
            r0.b = r11
            r0.c = r12
            r0.w = r3
            r2.getClass()
            java.lang.String r3 = "SELECT * FROM animoji"
            r4 = 0
            d7d r3 = defpackage.d7d.a(r4, r3)
            android.os.CancellationSignal r4 = new android.os.CancellationSignal
            r4.<init>()
            oi r5 = new oi
            r6 = 0
            r5.<init>(r2, r3, r6)
            i6d r2 = r2.a
            java.lang.Object r0 = defpackage.i8b.q(r2, r4, r5, r0)
            if (r0 != r1) goto L_0x007b
            goto L_0x010f
        L_0x007b:
            r1 = r12
            r12 = r0
        L_0x007d:
            java.util.List r12 = (java.util.List) r12
            boolean r0 = r12.isEmpty()
            r2 = 0
            if (r0 == 0) goto L_0x0092
            java.util.Set r11 = r11.keySet()
            boolean r11 = r1.addAll(r11)
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r11)
            goto L_0x00e8
        L_0x0092:
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x009a:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00e8
            java.lang.Object r0 = r11.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r5 = r0.longValue()
            r0 = r12
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x00c1:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x00d5
            java.lang.Object r7 = r0.next()
            r8 = r7
            dj r8 = (defpackage.dj) r8
            long r8 = r8.a
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x00c1
            goto L_0x00d6
        L_0x00d5:
            r7 = r2
        L_0x00d6:
            dj r7 = (defpackage.dj) r7
            if (r7 == 0) goto L_0x00e0
            long r7 = r7.b
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x009a
        L_0x00e0:
            java.lang.Long r0 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r3)
            r1.add(r0)
            goto L_0x009a
        L_0x00e8:
            java.lang.String r10 = r10.f
            a67 r11 = defpackage.z68.b
            if (r11 != 0) goto L_0x00ef
            goto L_0x010f
        L_0x00ef:
            boolean r12 = r11.c()
            if (r12 == 0) goto L_0x010f
            w78 r12 = defpackage.w78.o
            int r0 = r1.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = " animojis for update"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r11.d(r12, r10, r0, r2)
        L_0x010f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk.a(gk, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.gk r10, defpackage.qu r11, kotlin.coroutines.Continuation r12) {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof defpackage.qj
            if (r0 == 0) goto L_0x0016
            r0 = r12
            qj r0 = (defpackage.qj) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x001b
        L_0x0016:
            qj r0 = new qj
            r0.<init>(r10, r12)
        L_0x001b:
            java.lang.Object r12 = r0.v
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            java.util.Map r10 = r0.o
            java.util.ArrayList r11 = r0.c
            java.util.ArrayList r1 = r0.b
            gk r0 = r0.a
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00b0
        L_0x0035:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003d:
            kotlin.ResultKt.throwOnFailure(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.List r2 = r11.o
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0052:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0066
            java.lang.Object r5 = r2.next()
            lmd r5 = (defpackage.lmd) r5
            java.util.List r5 = r5.n
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            kotlin.collections.CollectionsKt__MutableCollectionsKt.addAll(r4, r5)
            goto L_0x0052
        L_0x0066:
            java.util.Map r11 = r11.z
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L_0x007a
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L_0x007a
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0160
        L_0x007a:
            kotlin.Lazy r2 = r10.h
            java.lang.Object r2 = r2.getValue()
            ok r2 = (defpackage.ok) r2
            r0.a = r10
            r0.b = r12
            r0.c = r4
            r0.o = r11
            r0.x = r3
            r2.getClass()
            java.lang.String r5 = "SELECT * FROM animoji_set"
            r6 = 0
            d7d r5 = defpackage.d7d.a(r6, r5)
            android.os.CancellationSignal r6 = new android.os.CancellationSignal
            r6.<init>()
            ni r7 = new ni
            r8 = 2
            r7.<init>(r8, r2, r5)
            i6d r2 = r2.a
            java.lang.Object r0 = defpackage.i8b.q(r2, r6, r7, r0)
            if (r0 != r1) goto L_0x00ab
            goto L_0x0160
        L_0x00ab:
            r1 = r12
            r12 = r0
            r0 = r10
            r10 = r11
            r11 = r4
        L_0x00b0:
            java.util.List r12 = (java.util.List) r12
            boolean r2 = r12.isEmpty()
            r4 = 0
            if (r2 == 0) goto L_0x00cd
            boolean r2 = r10.isEmpty()
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x00cd
            java.util.Set r10 = r10.keySet()
            boolean r10 = r1.addAll(r10)
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r10)
            goto L_0x0139
        L_0x00cd:
            boolean r2 = r12.isEmpty()
            if (r2 == 0) goto L_0x00e2
            boolean r2 = r11.isEmpty()
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x00e2
            boolean r10 = r1.addAll(r11)
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r10)
            goto L_0x0139
        L_0x00e2:
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x00ea:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0137
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Long r2 = (java.lang.Long) r2
            java.lang.Object r11 = r11.getValue()
            java.lang.Long r11 = (java.lang.Long) r11
            r3 = r12
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0109:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0124
            java.lang.Object r5 = r3.next()
            r6 = r5
            nk r6 = (defpackage.nk) r6
            long r6 = r6.a
            if (r2 != 0) goto L_0x011b
            goto L_0x0109
        L_0x011b:
            long r8 = r2.longValue()
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x0109
            goto L_0x0125
        L_0x0124:
            r5 = r4
        L_0x0125:
            nk r5 = (defpackage.nk) r5
            if (r5 == 0) goto L_0x0133
            long r5 = r5.e
            long r7 = r11.longValue()
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 >= 0) goto L_0x00ea
        L_0x0133:
            r1.add(r2)
            goto L_0x00ea
        L_0x0137:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
        L_0x0139:
            java.lang.String r10 = r0.f
            a67 r11 = defpackage.z68.b
            if (r11 != 0) goto L_0x0140
            goto L_0x0160
        L_0x0140:
            boolean r12 = r11.c()
            if (r12 == 0) goto L_0x0160
            w78 r12 = defpackage.w78.o
            int r0 = r1.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " animoji sets for update"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r11.d(r12, r10, r0, r4)
        L_0x0160:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk.b(gk, qu, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: kotlin.jvm.internal.Ref$ObjectRef} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: gk} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02e4, code lost:
        if (r1 != null) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02e6, code lost:
        defpackage.z68.f(r3.f, "Fail request reactions by ids.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02f1, code lost:
        if (kotlin.Result.m30isSuccessimpl(r0) != false) goto L_0x02f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02f3, code lost:
        r4.a = r0;
        r4.b = null;
        r4.c = null;
        r4.o = null;
        r4.v = null;
        r4.y = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x030e, code lost:
        if (r3.m(((defpackage.du) r0).v, r2.element, r4) == r5) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0124, code lost:
        r6 = (defpackage.bsc) r0.i.getValue();
        r4.a = r0;
        r4.b = r9;
        r4.c = r1;
        r4.o = null;
        r4.y = 2;
        r6.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x014a, code lost:
        if (defpackage.i8b.r(r6.a, new defpackage.ni(21, r6, r1.element), r4) != r5) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x014e, code lost:
        r6 = r9;
        r9 = r0;
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0151, code lost:
        r4.a = r9;
        r4.b = r6;
        r4.c = r0;
        r4.y = 3;
        r1 = r9.h().a(r0.element.c, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x016a, code lost:
        if (r1 != r5) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x016e, code lost:
        r1 = (java.util.List) r1;
        r10 = new defpackage.jz9((java.lang.Object) null);
        r11 = r0.element.c.size();
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0182, code lost:
        if (r12 >= r11) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0184, code lost:
        r13 = ((java.lang.Number) r0.element.c.get(r12)).longValue();
        r15 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0199, code lost:
        if ((r15 instanceof java.util.Collection) == false) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01a2, code lost:
        if (((java.util.Collection) r15).isEmpty() == false) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01a5, code lost:
        r8 = r15.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01ad, code lost:
        if (r8.hasNext() == false) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01af, code lost:
        r17 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01bb, code lost:
        if (((defpackage.dj) r8.next()).a != r13) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01be, code lost:
        r8 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01c1, code lost:
        r10.e(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01c4, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01c7, code lost:
        r3 = r9.h();
        r4.a = r9;
        r4.b = r6;
        r4.c = r0;
        r4.o = r1;
        r4.v = r10;
        r4.y = 4;
        r3.getClass();
        r2 = defpackage.i8b.q(r3.a, new android.os.CancellationSignal(), new defpackage.oi(r3, defpackage.d7d.a(0, "SELECT COUNT(*) FROM animoji"), 2), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01f2, code lost:
        if (r2 != r5) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01f6, code lost:
        r3 = r1;
        r1 = r2;
        r2 = r0;
        r0 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0200, code lost:
        if (((java.lang.Number) r1).intValue() != 0) goto L_0x0212;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0202, code lost:
        kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0.f(defpackage.wa8.d(r6.keySet())));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0212, code lost:
        r1 = r6.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x021e, code lost:
        if (r1.hasNext() == false) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0220, code lost:
        r6 = (java.util.Map.Entry) r1.next();
        r7 = ((java.lang.Number) r6.getKey()).longValue();
        r10 = ((java.lang.Number) r6.getValue()).longValue();
        r6 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0245, code lost:
        if (r6.hasNext() == false) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0247, code lost:
        r12 = r6.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0252, code lost:
        if (((defpackage.dj) r12).a != r7) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0255, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0256, code lost:
        r12 = (defpackage.dj) r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0258, code lost:
        if (r12 == null) goto L_0x0260;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x025e, code lost:
        if (r12.b >= r10) goto L_0x021a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0260, code lost:
        r0.e(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0268, code lost:
        if (r0.b() == false) goto L_0x02a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x026a, code lost:
        defpackage.z68.c(r9.f, "Didn't have reactions for update, fill from db.", new java.lang.Object[0]);
        r0 = (defpackage.pm7) r9.k.getValue(r9, p[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x027e, code lost:
        if (r0 == null) goto L_0x0286;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0284, code lost:
        if (r0.isActive() != false) goto L_0x02a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0286, code lost:
        r4.a = null;
        r4.b = null;
        r4.c = null;
        r4.o = null;
        r4.v = null;
        r4.y = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x029c, code lost:
        if (r9.f(r2.element, r4) != r5) goto L_0x02a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        r1 = kotlin.Result.Companion;
        r1 = r9.a;
        r3 = new defpackage.yt(defpackage.wa8.b(r0), 8);
        r4.a = r9;
        r4.b = r2;
        r4.c = null;
        r4.o = null;
        r4.v = null;
        r4.y = 6;
        r1 = ((defpackage.jna) r1).T(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02c7, code lost:
        if (r1 != r5) goto L_0x02ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02ca, code lost:
        r3 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        r0 = kotlin.Result.m23constructorimpl((defpackage.du) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02d2, code lost:
        r3 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02d4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02d6, code lost:
        r1 = kotlin.Result.Companion;
        r0 = kotlin.Result.m23constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02e0, code lost:
        r1 = kotlin.Result.m26exceptionOrNullimpl(r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(defpackage.gk r17, java.util.List r18, java.util.Map r19, kotlin.coroutines.Continuation r20) {
        /*
            r0 = r17
            r1 = r20
            r2 = 2
            r3 = 1
            r17.getClass()
            boolean r4 = r1 instanceof defpackage.ak
            if (r4 == 0) goto L_0x001c
            r4 = r1
            ak r4 = (defpackage.ak) r4
            int r5 = r4.y
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001c
            int r5 = r5 - r6
            r4.y = r5
            goto L_0x0021
        L_0x001c:
            ak r4 = new ak
            r4.<init>(r0, r1)
        L_0x0021:
            java.lang.Object r1 = r4.w
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r4.y
            r8 = 0
            switch(r6) {
                case 0: goto L_0x00a3;
                case 1: goto L_0x0089;
                case 2: goto L_0x007a;
                case 3: goto L_0x006b;
                case 4: goto L_0x0051;
                case 5: goto L_0x004c;
                case 6: goto L_0x003a;
                case 7: goto L_0x0035;
                default: goto L_0x002d;
            }
        L_0x002d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0311
        L_0x003a:
            java.lang.Object r0 = r4.b
            r2 = r0
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            java.lang.Object r0 = r4.a
            r3 = r0
            gk r3 = (defpackage.gk) r3
            kotlin.ResultKt.throwOnFailure(r1)     // Catch:{ all -> 0x0049 }
            goto L_0x02cb
        L_0x0049:
            r0 = move-exception
            goto L_0x02d6
        L_0x004c:
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x02a0
        L_0x0051:
            jz9 r0 = r4.v
            java.lang.Object r2 = r4.o
            java.util.List r2 = (java.util.List) r2
            kotlin.jvm.internal.Ref$ObjectRef r3 = r4.c
            java.lang.Object r6 = r4.b
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r9 = r4.a
            gk r9 = (defpackage.gk) r9
            kotlin.ResultKt.throwOnFailure(r1)
            r16 = r3
            r3 = r2
            r2 = r16
            goto L_0x01fa
        L_0x006b:
            kotlin.jvm.internal.Ref$ObjectRef r0 = r4.c
            java.lang.Object r6 = r4.b
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r9 = r4.a
            gk r9 = (defpackage.gk) r9
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x016e
        L_0x007a:
            kotlin.jvm.internal.Ref$ObjectRef r0 = r4.c
            java.lang.Object r6 = r4.b
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r9 = r4.a
            gk r9 = (defpackage.gk) r9
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0151
        L_0x0089:
            java.lang.Object r0 = r4.o
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
            kotlin.jvm.internal.Ref$ObjectRef r6 = r4.c
            java.lang.Object r9 = r4.b
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r10 = r4.a
            gk r10 = (defpackage.gk) r10
            kotlin.ResultKt.throwOnFailure(r1)
            r16 = r1
            r1 = r0
            r0 = r10
            r10 = r6
            r6 = r16
            goto L_0x010f
        L_0x00a3:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            r6 = r18
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x00b3:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x00d5
            java.lang.Object r9 = r6.next()
            r10 = r9
            lmd r10 = (defpackage.lmd) r10
            ekd r11 = r10.a
            ekd r12 = defpackage.ekd.Y
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r12)
            if (r11 == 0) goto L_0x00b3
            java.lang.String r10 = r10.b
            java.lang.String r11 = "POPULAR"
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r11)
            if (r10 == 0) goto L_0x00b3
            goto L_0x00d6
        L_0x00d5:
            r9 = r8
        L_0x00d6:
            lmd r9 = (defpackage.lmd) r9
            if (r9 == 0) goto L_0x00e6
            asc r6 = new asc
            java.lang.String r10 = r9.b
            long r11 = r9.j
            java.util.List r9 = r9.f
            r6.<init>(r11, r10, r9)
            goto L_0x00e7
        L_0x00e6:
            r6 = r8
        L_0x00e7:
            r1.element = r6
            if (r6 != 0) goto L_0x0122
            java.lang.String r6 = r0.f
            java.lang.String r9 = "Didn't find section with Reactions from backend response"
            defpackage.z68.c(r6, r9, new java.lang.Object[0])
            kotlin.Lazy r6 = r0.i
            java.lang.Object r6 = r6.getValue()
            bsc r6 = (defpackage.bsc) r6
            r4.a = r0
            r9 = r19
            r4.b = r9
            r4.c = r1
            r4.o = r1
            r4.y = r3
            java.lang.Object r6 = r6.a(r4)
            if (r6 != r5) goto L_0x010e
            goto L_0x0313
        L_0x010e:
            r10 = r1
        L_0x010f:
            r1.element = r6
            T r1 = r10.element
            if (r1 != 0) goto L_0x0120
            java.lang.String r0 = r0.f
            java.lang.String r1 = "Didn't find section with Reactions in database"
            defpackage.z68.c(r0, r1, new java.lang.Object[0])
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            goto L_0x0313
        L_0x0120:
            r1 = r10
            goto L_0x0124
        L_0x0122:
            r9 = r19
        L_0x0124:
            kotlin.Lazy r6 = r0.i
            java.lang.Object r6 = r6.getValue()
            bsc r6 = (defpackage.bsc) r6
            T r10 = r1.element
            asc r10 = (defpackage.asc) r10
            r4.a = r0
            r4.b = r9
            r4.c = r1
            r4.o = r8
            r4.y = r2
            r6.getClass()
            ni r11 = new ni
            r12 = 21
            r11.<init>(r12, r6, r10)
            i6d r6 = r6.a
            java.lang.Object r6 = defpackage.i8b.r(r6, r11, r4)
            if (r6 != r5) goto L_0x014e
            goto L_0x0313
        L_0x014e:
            r6 = r9
            r9 = r0
            r0 = r1
        L_0x0151:
            pi r1 = r9.h()
            T r10 = r0.element
            asc r10 = (defpackage.asc) r10
            java.util.List r10 = r10.c
            java.util.Collection r10 = (java.util.Collection) r10
            r4.a = r9
            r4.b = r6
            r4.c = r0
            r11 = 3
            r4.y = r11
            java.lang.Object r1 = r1.a(r10, r4)
            if (r1 != r5) goto L_0x016e
            goto L_0x0313
        L_0x016e:
            java.util.List r1 = (java.util.List) r1
            jz9 r10 = new jz9
            r10.<init>((java.lang.Object) r8)
            T r11 = r0.element
            asc r11 = (defpackage.asc) r11
            java.util.List r11 = r11.c
            java.util.Collection r11 = (java.util.Collection) r11
            int r11 = r11.size()
            r12 = 0
        L_0x0182:
            if (r12 >= r11) goto L_0x01c7
            T r13 = r0.element
            asc r13 = (defpackage.asc) r13
            java.util.List r13 = r13.c
            java.lang.Object r13 = r13.get(r12)
            java.lang.Number r13 = (java.lang.Number) r13
            long r13 = r13.longValue()
            r15 = r1
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            boolean r8 = r15 instanceof java.util.Collection
            if (r8 == 0) goto L_0x01a5
            r8 = r15
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x01a5
            goto L_0x01c1
        L_0x01a5:
            java.util.Iterator r8 = r15.iterator()
        L_0x01a9:
            boolean r15 = r8.hasNext()
            if (r15 == 0) goto L_0x01c1
            java.lang.Object r15 = r8.next()
            dj r15 = (defpackage.dj) r15
            r17 = r8
            long r7 = r15.a
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 != 0) goto L_0x01be
            goto L_0x01c4
        L_0x01be:
            r8 = r17
            goto L_0x01a9
        L_0x01c1:
            r10.e(r13)
        L_0x01c4:
            int r12 = r12 + r3
            r8 = 0
            goto L_0x0182
        L_0x01c7:
            pi r3 = r9.h()
            r4.a = r9
            r4.b = r6
            r4.c = r0
            r4.o = r1
            r4.v = r10
            r7 = 4
            r4.y = r7
            r3.getClass()
            java.lang.String r7 = "SELECT COUNT(*) FROM animoji"
            r8 = 0
            d7d r7 = defpackage.d7d.a(r8, r7)
            android.os.CancellationSignal r8 = new android.os.CancellationSignal
            r8.<init>()
            oi r11 = new oi
            r11.<init>(r3, r7, r2)
            i6d r2 = r3.a
            java.lang.Object r2 = defpackage.i8b.q(r2, r8, r11, r4)
            if (r2 != r5) goto L_0x01f6
            goto L_0x0313
        L_0x01f6:
            r3 = r1
            r1 = r2
            r2 = r0
            r0 = r10
        L_0x01fa:
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 != 0) goto L_0x0212
            java.util.Set r1 = r6.keySet()
            jz9 r1 = defpackage.wa8.d(r1)
            boolean r1 = r0.f(r1)
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            goto L_0x0264
        L_0x0212:
            java.util.Set r1 = r6.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x021a:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0264
            java.lang.Object r6 = r1.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.Number r7 = (java.lang.Number) r7
            long r7 = r7.longValue()
            java.lang.Object r6 = r6.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            long r10 = r6.longValue()
            r6 = r3
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x0241:
            boolean r12 = r6.hasNext()
            if (r12 == 0) goto L_0x0255
            java.lang.Object r12 = r6.next()
            r13 = r12
            dj r13 = (defpackage.dj) r13
            long r13 = r13.a
            int r13 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r13 != 0) goto L_0x0241
            goto L_0x0256
        L_0x0255:
            r12 = 0
        L_0x0256:
            dj r12 = (defpackage.dj) r12
            if (r12 == 0) goto L_0x0260
            long r12 = r12.b
            int r6 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r6 >= 0) goto L_0x021a
        L_0x0260:
            r0.e(r7)
            goto L_0x021a
        L_0x0264:
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x02a4
            java.lang.String r0 = r9.f
            java.lang.String r1 = "Didn't have reactions for update, fill from db."
            defpackage.z68.c(r0, r1, new java.lang.Object[0])
            kotlin.reflect.KProperty[] r0 = p
            r1 = 0
            r0 = r0[r1]
            wie r1 = r9.k
            java.lang.Object r0 = r1.getValue(r9, r0)
            pm7 r0 = (defpackage.pm7) r0
            if (r0 == 0) goto L_0x0286
            boolean r0 = r0.isActive()
            if (r0 != 0) goto L_0x02a0
        L_0x0286:
            T r0 = r2.element
            asc r0 = (defpackage.asc) r0
            r1 = 0
            r4.a = r1
            r4.b = r1
            r4.c = r1
            r4.o = r1
            r4.v = r1
            r1 = 5
            r4.y = r1
            java.lang.Object r0 = r9.f(r0, r4)
            if (r0 != r5) goto L_0x02a0
            goto L_0x0313
        L_0x02a0:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            goto L_0x0313
        L_0x02a4:
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch:{ all -> 0x02d4 }
            rl r1 = r9.a     // Catch:{ all -> 0x02d4 }
            yt r3 = new yt     // Catch:{ all -> 0x02d4 }
            long[] r0 = defpackage.wa8.b(r0)     // Catch:{ all -> 0x02d4 }
            r6 = 8
            r3.<init>((long[]) r0, (int) r6)     // Catch:{ all -> 0x02d4 }
            r4.a = r9     // Catch:{ all -> 0x02d4 }
            r4.b = r2     // Catch:{ all -> 0x02d4 }
            r6 = 0
            r4.c = r6     // Catch:{ all -> 0x02d4 }
            r4.o = r6     // Catch:{ all -> 0x02d4 }
            r4.v = r6     // Catch:{ all -> 0x02d4 }
            r0 = 6
            r4.y = r0     // Catch:{ all -> 0x02d4 }
            jna r1 = (defpackage.jna) r1     // Catch:{ all -> 0x02d4 }
            java.lang.Object r1 = r1.T(r3, r4)     // Catch:{ all -> 0x02d4 }
            if (r1 != r5) goto L_0x02ca
            goto L_0x0313
        L_0x02ca:
            r3 = r9
        L_0x02cb:
            du r1 = (defpackage.du) r1     // Catch:{ all -> 0x0049 }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r1)     // Catch:{ all -> 0x0049 }
            goto L_0x02e0
        L_0x02d2:
            r3 = r9
            goto L_0x02d6
        L_0x02d4:
            r0 = move-exception
            goto L_0x02d2
        L_0x02d6:
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)
        L_0x02e0:
            java.lang.Throwable r1 = kotlin.Result.m26exceptionOrNullimpl(r0)
            if (r1 == 0) goto L_0x02ed
            java.lang.String r6 = r3.f
            java.lang.String r7 = "Fail request reactions by ids."
            defpackage.z68.f(r6, r7, r1)
        L_0x02ed:
            boolean r1 = kotlin.Result.m30isSuccessimpl(r0)
            if (r1 == 0) goto L_0x0311
            r1 = r0
            du r1 = (defpackage.du) r1
            java.util.List r1 = r1.v
            T r2 = r2.element
            asc r2 = (defpackage.asc) r2
            r4.a = r0
            r6 = 0
            r4.b = r6
            r4.c = r6
            r4.o = r6
            r4.v = r6
            r0 = 7
            r4.y = r0
            java.lang.Object r0 = r3.m(r1, r2, r4)
            if (r0 != r5) goto L_0x0311
            goto L_0x0313
        L_0x0311:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
        L_0x0313:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk.c(gk, java.util.List, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static hi l(dj djVar) {
        return new hi(djVar.a, djVar.c, djVar.d, djVar.e, djVar.g);
    }

    public final void d() {
        ((qjd) this.c).k("user.reactionsLastSync", 0L);
        pi h2 = h();
        i6d i6d = h2.a;
        i6d.b();
        mi miVar = h2.c;
        gf6 E = miVar.E();
        try {
            i6d.c();
            E.n();
            i6d.r();
            i6d.l();
            miVar.S(E);
            ok okVar = (ok) this.h.getValue();
            i6d i6d2 = okVar.a;
            i6d2.b();
            mi miVar2 = okVar.c;
            gf6 E2 = miVar2.E();
            try {
                i6d2.c();
                E2.n();
                i6d2.r();
                i6d2.l();
                miVar2.S(E2);
                bsc bsc = (bsc) this.i.getValue();
                i6d i6d3 = bsc.a;
                i6d3.b();
                uf9 uf9 = bsc.c;
                gf6 E3 = uf9.E();
                try {
                    i6d3.c();
                    E3.n();
                    i6d3.r();
                    i6d3.l();
                    uf9.S(E3);
                } catch (Throwable th) {
                    uf9.S(E3);
                    throw th;
                }
            } catch (Throwable th2) {
                miVar2.S(E2);
                throw th2;
            }
        } catch (Throwable th3) {
            miVar.S(E);
            throw th3;
        }
    }

    public final Object e(jz9 jz9, Continuation continuation) {
        Object I = ev0.I(((osa) this.d).a(), new uj(this, jz9, (Continuation) null), continuation);
        return I == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? I : Unit.INSTANCE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(defpackage.asc r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.xj
            if (r0 == 0) goto L_0x0013
            r0 = r11
            xj r0 = (defpackage.xj) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            xj r0 = new xj
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L_0x003c
            if (r2 == r3) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x007c
        L_0x002c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0034:
            asc r10 = r0.b
            gk r9 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0059
        L_0x003c:
            kotlin.ResultKt.throwOnFailure(r11)
            java.util.concurrent.CopyOnWriteArrayList r11 = r9.o
            r11.clear()
            pi r11 = r9.h()
            java.util.List r2 = r10.c
            java.util.Collection r2 = (java.util.Collection) r2
            r0.a = r9
            r0.b = r10
            r0.v = r3
            java.lang.Object r11 = r11.a(r2, r0)
            if (r11 != r1) goto L_0x0059
            return r1
        L_0x0059:
            java.util.List r11 = (java.util.List) r11
            boolean r2 = r11.isEmpty()
            r3 = 0
            if (r2 == 0) goto L_0x007f
            java.util.List r10 = r10.c
            java.util.concurrent.CopyOnWriteArrayList r11 = r9.o
            java.util.Collection r10 = (java.util.Collection) r10
            r11.addAll(r10)
            jz9 r10 = defpackage.wa8.d(r10)
            r0.a = r3
            r0.b = r3
            r0.v = r4
            java.lang.Object r9 = r9.e(r10, r0)
            if (r9 != r1) goto L_0x007c
            return r1
        L_0x007c:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L_0x007f:
            java.util.List r0 = r10.c
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            r1 = 0
        L_0x0088:
            if (r1 >= r0) goto L_0x00c9
            java.util.List r2 = r10.c
            java.lang.Object r2 = r2.get(r1)
            java.lang.Number r2 = (java.lang.Number) r2
            long r4 = r2.longValue()
            java.util.concurrent.CopyOnWriteArrayList r2 = r9.o
            java.lang.Long r6 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r4)
            r2.add(r6)
            r2 = r11
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x00a6:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x00ba
            java.lang.Object r6 = r2.next()
            r7 = r6
            dj r7 = (defpackage.dj) r7
            long r7 = r7.a
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x00a6
            goto L_0x00bb
        L_0x00ba:
            r6 = r3
        L_0x00bb:
            dj r6 = (defpackage.dj) r6
            if (r6 == 0) goto L_0x00c6
            hi r2 = l(r6)
            r9.j(r2)
        L_0x00c6:
            int r1 = r1 + 1
            goto L_0x0088
        L_0x00c9:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk.f(asc, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final hi g(String str) {
        Object obj;
        if (str.length() == 0) {
            return null;
        }
        Iterator it = this.n.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            hi hiVar = (hi) ((tz9) obj).getValue();
            if (Intrinsics.areEqual((Object) hiVar != null ? hiVar.b : null, (Object) str)) {
                break;
            }
        }
        tz9 tz9 = (tz9) obj;
        if (tz9 != null) {
            return (hi) tz9.getValue();
        }
        return null;
    }

    public final pi h() {
        return (pi) this.g.getValue();
    }

    public final tz9 i(long j2) {
        return (tz9) this.n.computeIfAbsent(Long.valueOf(j2), new yi(1, new h9(9)));
    }

    public final void j(hi hiVar) {
        Object value;
        tz9 i2 = i(hiVar.a);
        do {
            value = i2.getValue();
            hi hiVar2 = (hi) value;
        } while (!i2.b(value, hiVar));
    }

    public final void k() {
        f14 f14 = f14.b;
        ck ckVar = new ck(this, (Continuation) null);
        jx3 jx3 = this.j;
        aje v = ev0.v(jx3, (CoroutineContext) null, f14, ckVar, 1);
        KProperty[] kPropertyArr = p;
        this.l.setValue(this, kPropertyArr[1], v);
        if (this.e.a()) {
            aje v2 = ev0.v(jx3, (CoroutineContext) null, f14, new bk(this, (Continuation) null), 1);
            this.m.setValue(this, kPropertyArr[2], v2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0161 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(java.util.List r21, defpackage.asc r22, kotlin.coroutines.Continuation r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r23
            boolean r2 = r1 instanceof defpackage.dk
            if (r2 == 0) goto L_0x0017
            r2 = r1
            dk r2 = (defpackage.dk) r2
            int r3 = r2.w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.w = r3
            goto L_0x001c
        L_0x0017:
            dk r2 = new dk
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.o
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.w
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x0049
            if (r4 == r7) goto L_0x003a
            if (r4 != r6) goto L_0x0032
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0162
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003a:
            asc r0 = r2.c
            java.util.List r4 = r2.b
            java.util.List r4 = (java.util.List) r4
            gk r7 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)
            r8 = r0
            r0 = r7
            goto L_0x00c2
        L_0x0049:
            kotlin.ResultKt.throwOnFailure(r1)
            r1 = r21
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0059:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x0093
            java.lang.Object r8 = r1.next()
            gi r8 = (defpackage.gi) r8
            if (r8 == 0) goto L_0x008c
            dj r19 = new dj
            long r10 = r8.a
            long r12 = r8.d
            java.lang.Long r17 = java.lang.Long.valueOf(r12)
            java.lang.String r15 = r8.f
            java.lang.String r14 = r8.g
            long r12 = r8.b
            java.lang.String r9 = r8.c
            java.lang.String r8 = r8.e
            r16 = r9
            r9 = r19
            r18 = r14
            r14 = r16
            r16 = r15
            r15 = r8
            r9.<init>(r10, r12, r14, r15, r16, r17, r18)
            r8 = r19
            goto L_0x008d
        L_0x008c:
            r8 = r5
        L_0x008d:
            if (r8 == 0) goto L_0x0059
            r4.add(r8)
            goto L_0x0059
        L_0x0093:
            boolean r1 = r4.isEmpty()
            r1 = r1 ^ r7
            if (r1 == 0) goto L_0x00be
            pi r1 = r20.h()
            r2.a = r0
            r8 = r21
            java.util.List r8 = (java.util.List) r8
            r2.b = r8
            r8 = r22
            r2.c = r8
            r2.w = r7
            r1.getClass()
            ni r7 = new ni
            r9 = 0
            r7.<init>(r9, r1, r4)
            i6d r1 = r1.a
            java.lang.Object r1 = defpackage.i8b.r(r1, r7, r2)
            if (r1 != r3) goto L_0x00c0
            return r3
        L_0x00be:
            r8 = r22
        L_0x00c0:
            r4 = r21
        L_0x00c2:
            r0.getClass()
            kotlin.reflect.KProperty[] r1 = p
            r7 = 0
            r1 = r1[r7]
            wie r7 = r0.k
            java.lang.Object r1 = r7.getValue(r0, r1)
            pm7 r1 = (defpackage.pm7) r1
            if (r1 == 0) goto L_0x00d7
            r1.b(r5)
        L_0x00d7:
            java.lang.String r1 = r0.f
            java.lang.String r7 = "updateReactions"
            defpackage.z68.c(r1, r7, new java.lang.Object[0])
            jz9 r1 = new jz9
            int r7 = r4.size()
            r1.<init>((int) r7)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x00ed:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0101
            java.lang.Object r7 = r4.next()
            gi r7 = (defpackage.gi) r7
            if (r7 == 0) goto L_0x00ed
            long r9 = r7.a
            r1.e(r9)
            goto L_0x00ed
        L_0x0101:
            java.util.concurrent.ConcurrentHashMap r4 = r0.n
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x010b:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0153
            java.lang.Object r7 = r4.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r9 = r7.getKey()
            java.lang.Number r9 = (java.lang.Number) r9
            long r9 = r9.longValue()
            java.lang.Object r7 = r7.getValue()
            tz9 r7 = (defpackage.tz9) r7
            boolean r11 = r1.a(r9)
            if (r11 == 0) goto L_0x010b
            java.lang.String r11 = r0.f
            a67 r12 = defpackage.z68.b
            if (r12 != 0) goto L_0x0134
            goto L_0x0145
        L_0x0134:
            boolean r13 = r12.c()
            if (r13 == 0) goto L_0x0145
            w78 r13 = defpackage.w78.o
            java.lang.String r14 = "set null for #"
            java.lang.String r9 = defpackage.wj6.i(r9, r14)
            r12.d(r13, r11, r9, r5)
        L_0x0145:
            java.lang.Object r9 = r7.getValue()
            r10 = r9
            hi r10 = (defpackage.hi) r10
            boolean r9 = r7.b(r9, r5)
            if (r9 == 0) goto L_0x0145
            goto L_0x010b
        L_0x0153:
            r2.a = r5
            r2.b = r5
            r2.c = r5
            r2.w = r6
            java.lang.Object r0 = r0.f(r8, r2)
            if (r0 != r3) goto L_0x0162
            return r3
        L_0x0162:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk.m(java.util.List, asc, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
