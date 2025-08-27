package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: jy5  reason: default package */
public final class jy5 {
    public final String a;
    public final fu2 b;
    public final u82 c;
    public final xme d;
    public final on2 e;
    public final AtomicInteger f;
    public final xme g;
    public final String h;

    public jy5(String str, fu2 fu2, u82 u82, sv0 sv0, q04 q04) {
        this.a = str;
        this.b = fu2;
        this.c = u82;
        xme a2 = f6e.a((Object) null);
        this.d = a2;
        this.e = new on2(new etc(a2), 28);
        jx3 a3 = e14.a(q04);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.f = atomicInteger;
        xme a4 = f6e.a(Integer.valueOf(atomicInteger.get()));
        this.g = a4;
        this.h = a81.m("FolderCountersDataSource-", str);
        sv0.d(this);
        zm4 zm4 = new zm4(new bs5[]{((ia2) u82).j(), a4}, 1);
        Duration.Companion companion = Duration.Companion;
        bs0.K(new ps5(gt5.d(zm4, DurationKt.toDuration(1000, DurationUnit.MILLISECONDS)), new hy5(this, (Continuation) null), 5), a3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.jy5 r11, kotlin.coroutines.Continuation r12) {
        /*
            r11.getClass()
            boolean r0 = r12 instanceof defpackage.iy5
            if (r0 == 0) goto L_0x0016
            r0 = r12
            iy5 r0 = (defpackage.iy5) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x001b
        L_0x0016:
            iy5 r0 = new iy5
            r0.<init>(r11, r12)
        L_0x001b:
            java.lang.Object r12 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L_0x0042
            if (r2 == r3) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            au2 r11 = r0.b
            jy5 r0 = r0.a
            kotlin.ResultKt.throwOnFailure(r12)
            r3 = r11
            goto L_0x0095
        L_0x0034:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003c:
            jy5 r11 = r0.a
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x005e
        L_0x0042:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.String r12 = r11.h
            java.lang.String r2 = "updateCounter"
            defpackage.z68.c(r12, r2, new java.lang.Object[0])
            u82 r12 = r11.c
            java.lang.String r2 = r11.a
            r0.a = r11
            r0.v = r3
            ia2 r12 = (defpackage.ia2) r12
            java.lang.Object r12 = r12.d(r2, r0)
            if (r12 != r1) goto L_0x005e
            goto L_0x0123
        L_0x005e:
            zx5 r12 = (defpackage.zx5) r12
            if (r12 != 0) goto L_0x0066
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L_0x0123
        L_0x0066:
            boolean r2 = r12.b()
            if (r2 == 0) goto L_0x006f
            yt2 r12 = defpackage.yt2.a
            goto L_0x0080
        L_0x006f:
            zt2 r2 = new zt2
            java.util.Set r6 = r12.Y
            java.util.Set r7 = r12.w
            java.util.Set r8 = r12.Z
            java.util.Set r9 = r12.v0
            java.util.Map r10 = r12.y0
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            r12 = r2
        L_0x0080:
            fu2 r2 = r11.b
            r0.a = r11
            r0.b = r12
            r0.v = r4
            my2 r2 = (defpackage.my2) r2
            java.util.List r0 = r2.r(r12)
            if (r0 != r1) goto L_0x0092
            goto L_0x0123
        L_0x0092:
            r3 = r12
            r12 = r0
            r0 = r11
        L_0x0095:
            java.util.List r12 = (java.util.List) r12
            java.util.Collection r12 = (java.util.Collection) r12
            fu2 r11 = r0.b
            r2 = r11
            my2 r2 = (defpackage.my2) r2
            r6 = 0
            r7 = 2147483647(0x7fffffff, float:NaN)
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.List r11 = r2.s(r3, r4, r6, r7)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.List r11 = kotlin.collections.CollectionsKt.plus(r12, r11)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            boolean r12 = r11 instanceof java.util.Collection
            r1 = 0
            if (r12 == 0) goto L_0x00c2
            r12 = r11
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x00c2
            goto L_0x00e0
        L_0x00c2:
            java.util.Iterator r11 = r11.iterator()
        L_0x00c6:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00e0
            java.lang.Object r12 = r11.next()
            a32 r12 = (defpackage.a32) r12
            m72 r12 = r12.b
            int r12 = r12.m
            if (r12 <= 0) goto L_0x00c6
            int r1 = r1 + 1
            if (r1 >= 0) goto L_0x00c6
            kotlin.collections.CollectionsKt.throwCountOverflow()
            goto L_0x00c6
        L_0x00e0:
            java.lang.String r11 = r0.h
            a67 r12 = defpackage.z68.b
            r2 = 0
            if (r12 != 0) goto L_0x00e8
            goto L_0x010f
        L_0x00e8:
            boolean r3 = r12.c()
            if (r3 == 0) goto L_0x010f
            w78 r3 = defpackage.w78.o
            xme r4 = r0.d
            java.lang.Object r4 = r4.getValue()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "updateCounter: unreadChatsCount = "
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r6 = ", old = "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r12.d(r3, r11, r4, r2)
        L_0x010f:
            xme r11 = r0.d
            if (r1 > 0) goto L_0x0116
            r14 r12 = defpackage.r14.b
            goto L_0x011b
        L_0x0116:
            r14 r12 = new r14
            r12.<init>(r1)
        L_0x011b:
            r11.getClass()
            r11.m(r2, r12)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x0123:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jy5.a(jy5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b() {
        Integer valueOf = Integer.valueOf(this.f.incrementAndGet());
        xme xme = this.g;
        xme.getClass();
        xme.m((Object) null, valueOf);
    }

    @oye
    public final void onEvent(xy2 xy2) {
        b();
    }

    @oye
    public final void onEvent(ke7 ke7) {
        b();
    }

    @oye
    public final void onEvent(w88 w88) {
        b();
    }
}
