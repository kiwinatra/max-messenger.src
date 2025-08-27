package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.tamtam.logout.a;

/* renamed from: wt2  reason: default package */
public final class wt2 implements dt2, vz6 {
    public final AtomicBoolean X = new AtomicBoolean(true);
    public final AtomicBoolean Y = new AtomicBoolean(false);
    public final i04 Z = new i04();
    public final zz6 a;
    public final gaf b;
    public final s04 c;
    public final ns2 o;
    public final bo3 v;
    public final xme v0 = f6e.a(ss2.c);
    public final a w;
    public final ut2 w0 = new ut2(this);
    public final Lazy x;
    public final String x0;
    public final Lazy y;
    public final jx3 y0;
    public final Lazy z;
    public final q40 z0;

    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, q40] */
    public wt2(String str, Lazy lazy, zz6 zz6, Lazy lazy2, gaf gaf, s04 s04, gy5 gy5, bo3 bo3, a aVar, Lazy lazy3) {
        this.a = zz6;
        this.b = gaf;
        this.c = s04;
        this.o = gy5;
        this.v = bo3;
        this.w = aVar;
        this.x = lazy;
        this.y = lazy2;
        this.z = lazy3;
        String j = tr1.j(wt2.class.getName(), StringsKt__StringsJVMKt.replace$default(str, '.', '_', false, 4, (Object) null));
        this.x0 = j;
        jx3 a2 = e14.a(((osa) gaf).a().plus(s04));
        this.y0 = a2;
        String m = a81.m("chats-list-job-executor#", str);
        ui0 ui0 = new ui0(2);
        ? obj = new Object();
        obj.a = a2;
        obj.c = m;
        obj.b = ui0;
        obj.o = m5a.a(1, IntCompanionObject.MAX_VALUE, cu0.b);
        obj.v = new ConcurrentHashMap();
        obj.w = new AtomicInteger(0);
        ui0.invoke(m, "init " + obj);
        this.z0 = obj;
        z68.c(j, "init " + this, new Object[0]);
        bs0.K(new ps5((n6e) obj.o, new jn7(obj, new et2(this, (Continuation) null), (Continuation) null), 5), a2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x014b A[LOOP:2: B:45:0x0145->B:47:0x014b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0222 A[LOOP:5: B:75:0x021c->B:77:0x0222, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.wt2 r18, defpackage.ks2 r19, kotlin.coroutines.Continuation r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = 1
            r18.getClass()
            boolean r4 = r2 instanceof defpackage.ft2
            if (r4 == 0) goto L_0x001d
            r4 = r2
            ft2 r4 = (defpackage.ft2) r4
            int r5 = r4.x
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001d
            int r5 = r5 - r6
            r4.x = r5
            goto L_0x0022
        L_0x001d:
            ft2 r4 = new ft2
            r4.<init>(r0, r2)
        L_0x0022:
            java.lang.Object r2 = r4.v
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r4.x
            r7 = 0
            r8 = 0
            r9 = 3
            r10 = 2
            if (r6 == 0) goto L_0x0066
            if (r6 == r3) goto L_0x0062
            if (r6 == r10) goto L_0x0049
            if (r6 != r9) goto L_0x0041
            java.lang.Object r0 = r4.b
            ws r0 = (defpackage.ws) r0
            wt2 r1 = r4.a
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x033b
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0049:
            ws r0 = r4.o
            java.util.List r1 = r4.c
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r6 = r4.b
            ks2 r6 = (defpackage.ks2) r6
            wt2 r10 = r4.a
            kotlin.ResultKt.throwOnFailure(r2)
            r11 = r0
            r0 = r10
            r17 = r2
            r2 = r1
            r1 = r6
            r6 = r17
            goto L_0x00ef
        L_0x0062:
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x00aa
        L_0x0066:
            kotlin.ResultKt.throwOnFailure(r2)
            java.lang.String r2 = r0.x0
            a67 r6 = defpackage.z68.b
            if (r6 != 0) goto L_0x0070
            goto L_0x0090
        L_0x0070:
            boolean r11 = r6.c()
            if (r11 == 0) goto L_0x0090
            w78 r11 = defpackage.w78.o
            java.util.Set r12 = r1.c
            int r12 = r12.size()
            zz6 r13 = r0.a
            i04 r13 = r13.h
            java.lang.Object[] r13 = r13.b
            int r13 = r13.length
            java.lang.String r14 = "handleChatsUpdate start "
            java.lang.String r15 = ", history = "
            java.lang.String r12 = defpackage.g63.h(r14, r12, r13, r15)
            r6.d(r11, r2, r12, r8)
        L_0x0090:
            xme r2 = r0.v0
            java.lang.Object r2 = r2.getValue()
            ss2 r2 = (defpackage.ss2) r2
            java.util.List r2 = r2.a
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L_0x00ae
            r4.x = r3
            java.lang.Object r0 = r0.d(r4)
            if (r0 != r5) goto L_0x00aa
            goto L_0x036b
        L_0x00aa:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            goto L_0x036b
        L_0x00ae:
            r6 = r2
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            ws r11 = new ws
            r11.<init>((int) r7)
            java.util.Iterator r6 = r6.iterator()
        L_0x00ba:
            boolean r12 = r6.hasNext()
            if (r12 == 0) goto L_0x00d0
            java.lang.Object r12 = r6.next()
            xk2 r12 = (defpackage.xk2) r12
            long r12 = r12.a
            java.lang.Long r12 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r12)
            r11.add(r12)
            goto L_0x00ba
        L_0x00d0:
            java.util.Set r6 = r1.a
            kotlin.Lazy r12 = r0.y
            java.lang.Object r12 = r12.getValue()
            js2 r12 = (defpackage.js2) r12
            r4.a = r0
            r4.b = r1
            r13 = r2
            java.util.List r13 = (java.util.List) r13
            r4.c = r13
            r4.o = r11
            r4.x = r10
            java.lang.Object r6 = r12.a(r6, r4)
            if (r6 != r5) goto L_0x00ef
            goto L_0x036b
        L_0x00ef:
            java.util.List r6 = (java.util.List) r6
            java.lang.String r10 = r0.x0
            a67 r12 = defpackage.z68.b
            if (r12 != 0) goto L_0x00f8
            goto L_0x0110
        L_0x00f8:
            boolean r13 = r12.c()
            if (r13 == 0) goto L_0x0110
            w78 r13 = defpackage.w78.o
            zz6 r14 = r0.a
            i04 r14 = r14.h
            java.lang.Object[] r14 = r14.b
            int r14 = r14.length
            java.lang.String r15 = "handleChatsUpdate step 1; history = "
            java.lang.String r14 = defpackage.wj6.h(r14, r15)
            r12.d(r13, r10, r14, r8)
        L_0x0110:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r12 = r6.iterator()
        L_0x011b:
            boolean r13 = r12.hasNext()
            r14 = 0
            if (r13 == 0) goto L_0x013a
            java.lang.Object r13 = r12.next()
            r9 = r13
            xk2 r9 = (defpackage.xk2) r9
            r16 = r4
            long r3 = r9.z0
            int r3 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r3 != 0) goto L_0x0135
            r10.add(r13)
        L_0x0135:
            r4 = r16
            r3 = 1
            r9 = 3
            goto L_0x011b
        L_0x013a:
            r16 = r4
            ws r3 = new ws
            r3.<init>((int) r7)
            java.util.Iterator r4 = r10.iterator()
        L_0x0145:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x015b
            java.lang.Object r9 = r4.next()
            xk2 r9 = (defpackage.xk2) r9
            long r12 = r9.a
            java.lang.Long r9 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r12)
            r3.add(r9)
            goto L_0x0145
        L_0x015b:
            java.util.Set r1 = r1.a
            java.util.Set r1 = kotlin.collections.SetsKt.minus(r1, r3)
            r11.retainAll(r1)
            zz6 r1 = r0.a
            r1.c(r11)
            jz9 r1 = new jz9
            int r3 = r2.size()
            r1.<init>((int) r3)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r3 = r2.iterator()
        L_0x0178:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0190
            java.lang.Object r4 = r3.next()
            xk2 r4 = (defpackage.xk2) r4
            long r12 = r4.z0
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 != 0) goto L_0x0178
            long r12 = r4.a
            r1.e(r12)
            goto L_0x0178
        L_0x0190:
            java.lang.String r3 = r0.x0
            a67 r4 = defpackage.z68.b
            if (r4 != 0) goto L_0x0197
            goto L_0x01af
        L_0x0197:
            boolean r9 = r4.c()
            if (r9 == 0) goto L_0x01af
            w78 r9 = defpackage.w78.o
            zz6 r12 = r0.a
            i04 r12 = r12.h
            java.lang.Object[] r12 = r12.b
            int r12 = r12.length
            java.lang.String r13 = "handleChatsUpdate step 2; history = "
            java.lang.String r12 = defpackage.wj6.h(r12, r13)
            r4.d(r9, r3, r12, r8)
        L_0x01af:
            kotlin.jvm.internal.Ref$IntRef r3 = new kotlin.jvm.internal.Ref$IntRef
            r3.<init>()
            kotlin.jvm.internal.Ref$IntRef r4 = new kotlin.jvm.internal.Ref$IntRef
            r4.<init>()
            java.util.Iterator r9 = r10.iterator()
        L_0x01bd:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x01f3
            java.lang.Object r10 = r9.next()
            xk2 r10 = (defpackage.xk2) r10
            long r12 = r10.a
            boolean r12 = r1.a(r12)
            if (r12 == 0) goto L_0x01dd
            int r12 = r4.element
            r13 = 1
            int r12 = r12 + r13
            r4.element = r12
            zz6 r12 = r0.a
            r12.r(r10)
            goto L_0x01f0
        L_0x01dd:
            r13 = 1
            long r14 = r10.a
            boolean r12 = r1.a(r14)
            if (r12 != 0) goto L_0x01f0
            int r12 = r3.element
            int r12 = r12 + r13
            r3.element = r12
            zz6 r12 = r0.a
            r12.b(r10)
        L_0x01f0:
            r14 = 0
            goto L_0x01bd
        L_0x01f3:
            java.lang.String r1 = r0.x0
            a67 r9 = defpackage.z68.b
            if (r9 != 0) goto L_0x01fa
            goto L_0x0211
        L_0x01fa:
            boolean r10 = r9.c()
            if (r10 == 0) goto L_0x0211
            w78 r10 = defpackage.w78.o
            int r3 = r3.element
            int r4 = r4.element
            java.lang.String r12 = "handleChatsUpdate step 3: insert="
            java.lang.String r13 = ", update="
            java.lang.String r3 = defpackage.g63.h(r12, r3, r4, r13)
            r9.d(r10, r1, r3, r8)
        L_0x0211:
            iz9 r1 = defpackage.ua8.a
            iz9 r1 = new iz9
            r1.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x021c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0239
            java.lang.Object r3 = r2.next()
            xk2 r3 = (defpackage.xk2) r3
            long r9 = r3.a
            int r4 = r1.b(r9)
            java.lang.Object[] r12 = r1.c
            r13 = r12[r4]
            long[] r13 = r1.b
            r13[r4] = r9
            r12[r4] = r3
            goto L_0x021c
        L_0x0239:
            ws r2 = new ws
            r2.<init>((int) r7)
            kotlin.jvm.internal.Ref$IntRef r3 = new kotlin.jvm.internal.Ref$IntRef
            r3.<init>()
            boolean r4 = r11.isEmpty()
            r9 = 1
            r4 = r4 ^ r9
            if (r4 == 0) goto L_0x0281
            i04 r4 = r0.Z
            boolean r9 = r4 instanceof java.util.Collection
            if (r9 == 0) goto L_0x0258
            boolean r9 = r4.isEmpty()
            if (r9 == 0) goto L_0x0258
            goto L_0x027f
        L_0x0258:
            java.util.Iterator r4 = r4.iterator()
        L_0x025c:
            r9 = r4
            f04 r9 = (defpackage.f04) r9
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x027f
            java.lang.Object r9 = r9.next()
            xk2 r9 = (defpackage.xk2) r9
            long r9 = r9.a
            java.lang.Long r9 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r9)
            boolean r9 = r11.contains(r9)
            if (r9 == 0) goto L_0x025c
            r9 = 1
            int r7 = r7 + r9
            if (r7 >= 0) goto L_0x025c
            kotlin.collections.CollectionsKt.throwCountOverflow()
            goto L_0x025c
        L_0x027f:
            r3.element = r7
        L_0x0281:
            java.lang.String r4 = r0.x0
            a67 r7 = defpackage.z68.b
            if (r7 != 0) goto L_0x0288
            goto L_0x02a0
        L_0x0288:
            boolean r9 = r7.c()
            if (r9 == 0) goto L_0x02a0
            w78 r9 = defpackage.w78.o
            zz6 r10 = r0.a
            i04 r10 = r10.h
            java.lang.Object[] r10 = r10.b
            int r10 = r10.length
            java.lang.String r11 = "handleChatsUpdate step 4 ; history = "
            java.lang.String r10 = defpackage.wj6.h(r10, r11)
            r7.d(r9, r4, r10, r8)
        L_0x02a0:
            java.util.Iterator r4 = r6.iterator()
        L_0x02a4:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0302
            java.lang.Object r6 = r4.next()
            xk2 r6 = (defpackage.xk2) r6
            long r9 = r6.a
            java.lang.Object r7 = r1.a(r9)
            xk2 r7 = (defpackage.xk2) r7
            if (r7 != 0) goto L_0x02cb
            long r9 = r6.z0
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 <= 0) goto L_0x02cb
            int r6 = r3.element
            r7 = 1
            int r6 = r6 + r7
            r3.element = r6
        L_0x02c8:
            r13 = 0
            goto L_0x02a4
        L_0x02cb:
            if (r7 == 0) goto L_0x02c8
            long r9 = r7.z0
            long r11 = r6.z0
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x02c8
            r13 = 0
            int r6 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r6 <= 0) goto L_0x02e6
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 <= 0) goto L_0x02e6
            int r6 = r3.element
            r9 = 1
            int r6 = r6 + r9
            r3.element = r6
            goto L_0x02a4
        L_0x02e6:
            r9 = 1
            int r10 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r10 <= 0) goto L_0x02fa
            int r6 = r3.element
            int r6 = r6 + r9
            r3.element = r6
            long r6 = r7.a
            java.lang.Long r6 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r6)
            r2.add(r6)
            goto L_0x02a4
        L_0x02fa:
            if (r6 <= 0) goto L_0x02a4
            int r6 = r3.element
            int r6 = r6 + r9
            r3.element = r6
            goto L_0x02a4
        L_0x0302:
            java.lang.String r1 = r0.x0
            a67 r4 = defpackage.z68.b
            if (r4 != 0) goto L_0x0309
            goto L_0x0321
        L_0x0309:
            boolean r6 = r4.c()
            if (r6 == 0) goto L_0x0321
            w78 r6 = defpackage.w78.o
            zz6 r7 = r0.a
            i04 r7 = r7.h
            java.lang.Object[] r7 = r7.b
            int r7 = r7.length
            java.lang.String r9 = "handleChatsUpdate step 5; history = "
            java.lang.String r7 = defpackage.wj6.h(r7, r9)
            r4.d(r6, r1, r7, r8)
        L_0x0321:
            int r1 = r3.element
            if (r1 <= 0) goto L_0x033d
            r4 = r16
            r4.a = r0
            r4.b = r2
            r4.c = r8
            r4.o = r8
            r1 = 3
            r4.x = r1
            java.lang.Object r1 = r0.g(r4)
            if (r1 != r5) goto L_0x0339
            goto L_0x036b
        L_0x0339:
            r1 = r0
            r0 = r2
        L_0x033b:
            r2 = r0
            r0 = r1
        L_0x033d:
            boolean r1 = r2.isEmpty()
            r3 = 1
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x034a
            zz6 r1 = r0.a
            r1.c(r2)
        L_0x034a:
            java.lang.String r1 = r0.x0
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x0351
            goto L_0x0369
        L_0x0351:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x0369
            w78 r3 = defpackage.w78.o
            zz6 r0 = r0.a
            i04 r0 = r0.h
            java.lang.Object[] r0 = r0.b
            int r0 = r0.length
            java.lang.String r4 = "handleChatsUpdate finish; history = "
            java.lang.String r0 = defpackage.wj6.h(r0, r4)
            r2.d(r3, r1, r0, r8)
        L_0x0369:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
        L_0x036b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wt2.a(wt2, ks2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.wt2 r16, defpackage.sn3 r17, kotlin.coroutines.Continuation r18) {
        /*
            r6 = r16
            r0 = r18
            r16.getClass()
            boolean r1 = r0 instanceof defpackage.ht2
            if (r1 == 0) goto L_0x001b
            r1 = r0
            ht2 r1 = (defpackage.ht2) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001b
            int r2 = r2 - r3
            r1.v = r2
        L_0x0019:
            r7 = r1
            goto L_0x0021
        L_0x001b:
            ht2 r1 = new ht2
            r1.<init>(r6, r0)
            goto L_0x0019
        L_0x0021:
            java.lang.Object r0 = r7.c
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.v
            r9 = 0
            r10 = 1
            if (r1 == 0) goto L_0x0040
            if (r1 != r10) goto L_0x0038
            kotlin.jvm.internal.Ref$BooleanRef r1 = r7.b
            wt2 r2 = r7.a
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x00ce
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0040:
            kotlin.ResultKt.throwOnFailure(r0)
            java.lang.String r0 = r6.x0
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x004c
        L_0x0049:
            r11 = r17
            goto L_0x0067
        L_0x004c:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x0049
            w78 r2 = defpackage.w78.o
            r11 = r17
            va8 r3 = r11.a
            r4 = 31
            java.lang.String r3 = defpackage.va8.d(r3, r9, r9, r4)
            java.lang.String r4 = "handleContactsUpdateEvent "
            java.lang.String r3 = defpackage.a81.m(r4, r3)
            r1.d(r2, r0, r3, r9)
        L_0x0067:
            kotlin.jvm.internal.Ref$BooleanRef r12 = new kotlin.jvm.internal.Ref$BooleanRef
            r12.<init>()
            xme r0 = r6.v0
            java.lang.Object r0 = r0.getValue()
            ss2 r0 = (defpackage.ss2) r0
            java.util.List r0 = r0.a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            gaf r1 = r6.b
            osa r1 = (defpackage.osa) r1
            q04 r1 = r1.b()
            s04 r2 = r6.c
            kotlin.coroutines.CoroutineContext r1 = r1.plus(r2)
            if (r1 != 0) goto L_0x008c
            kotlin.coroutines.CoroutineContext r1 = r7.getContext()
        L_0x008c:
            jx3 r13 = defpackage.e14.a(r1)
            java.util.ArrayList r14 = new java.util.ArrayList
            int r1 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r0, 10)
            r14.<init>(r1)
            java.util.Iterator r15 = r0.iterator()
        L_0x009d:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00be
            java.lang.Object r1 = r15.next()
            gt2 r5 = new gt2
            r2 = 0
            r0 = r5
            r3 = r16
            r4 = r12
            r10 = r5
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 3
            nk4 r0 = defpackage.ev0.d(r13, r9, r10, r0)
            r14.add(r0)
            r10 = 1
            goto L_0x009d
        L_0x00be:
            r7.a = r6
            r7.b = r12
            r0 = 1
            r7.v = r0
            java.lang.Object r0 = defpackage.j4b.g(r14, r7)
            if (r0 != r8) goto L_0x00cc
            goto L_0x00f3
        L_0x00cc:
            r2 = r6
            r1 = r12
        L_0x00ce:
            java.lang.String r0 = r2.x0
            a67 r3 = defpackage.z68.b
            if (r3 != 0) goto L_0x00d5
            goto L_0x00e2
        L_0x00d5:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x00e2
            w78 r4 = defpackage.w78.o
            java.lang.String r5 = "handleContactsUpdateEvent finish"
            r3.d(r4, r0, r5, r9)
        L_0x00e2:
            boolean r0 = r1.element
            if (r0 == 0) goto L_0x00f1
            q40 r0 = r2.z0
            it2 r1 = new it2
            r2 = 2
            r1.<init>(r2, r9)
            defpackage.q40.y(r0, r1)
        L_0x00f1:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
        L_0x00f3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wt2.b(wt2, sn3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.kt2
            if (r0 == 0) goto L_0x0013
            r0 = r5
            kt2 r0 = (defpackage.kt2) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            kt2 r0 = new kt2
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            wt2 r4 = r0.a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x004c
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r5)
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.Y
            r5.set(r3)
            zz6 r5 = r4.a
            r5.j = r4
            q40 r5 = r4.z0
            r0.a = r4
            r0.o = r3
            java.lang.Object r5 = r5.j(r0)
            if (r5 != r1) goto L_0x004c
            return r1
        L_0x004c:
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.Y
            r5.set(r3)
            q40 r5 = r4.z0
            lt2 r0 = new lt2
            r1 = 0
            r0.<init>(r4, r1)
            defpackage.q40.y(r5, r0)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wt2.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.mt2
            if (r0 == 0) goto L_0x0013
            r0 = r5
            mt2 r0 = (defpackage.mt2) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            mt2 r0 = new mt2
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            wt2 r4 = r0.a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0052
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r5)
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.X
            r2 = 0
            boolean r5 = r5.compareAndSet(r3, r2)
            if (r5 == 0) goto L_0x0063
            kotlin.Lazy r5 = r4.x
            java.lang.Object r5 = r5.getValue()
            zi5 r5 = (defpackage.zi5) r5
            r0.a = r4
            r0.o = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L_0x0052
            return r1
        L_0x0052:
            java.util.List r5 = (java.util.List) r5
            i04 r0 = r4.Z
            java.util.Collection r5 = (java.util.Collection) r5
            r0.addAll(r5)
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4.f(r0)
        L_0x0063:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wt2.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e() {
        if (this.Y.compareAndSet(false, true)) {
            q40.y(this.z0, new nt2(this, (Continuation) null)).V(new l(28, this));
        }
    }

    public final void f(long j) {
        String str = this.x0;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, str, wj6.i(j, "loadNext: "), (Throwable) null);
        }
        zz6 zz6 = this.a;
        kn5 kn5 = zz6.e;
        if (kn5 != null) {
            String b2 = kn5.b(j);
            kn5.c("loadNext: " + b2);
        }
        zz6.q();
        if (!zz6.d().i().isEmpty()) {
            if (kn5 != null) {
                kn5.c("loadNext: Chunks not empty, started loading from datasources");
            }
            gz6 P = kv0.P(zz6.f(j));
            if (P != null) {
                j = P.h();
            }
            zz6.j(zz6.b, j, false, true, false);
            zz6.k(zz6.c, j, false, true);
        } else {
            zz6.l(j);
        }
        if (kn5 != null) {
            n54.y(kn5, zz6.e());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.vt2
            if (r0 == 0) goto L_0x0013
            r0 = r5
            vt2 r0 = (defpackage.vt2) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            vt2 r0 = new vt2
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            wt2 r4 = r0.a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0049
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r5)
            kotlin.Lazy r5 = r4.x
            java.lang.Object r5 = r5.getValue()
            zi5 r5 = (defpackage.zi5) r5
            r0.a = r4
            r0.o = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            java.util.List r5 = (java.util.List) r5
            i04 r0 = r4.Z
            r0.clear()
            i04 r4 = r4.Z
            java.util.Collection r5 = (java.util.Collection) r5
            r4.addAll(r5)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wt2.g(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
