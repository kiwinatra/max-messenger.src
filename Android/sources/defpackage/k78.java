package defpackage;

import java.util.EnumSet;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: k78  reason: default package */
public final class k78 implements s98 {
    public final String a = k78.class.getName();
    public final Lazy b;
    public final Lazy c;
    public final Lazy o;
    public final Lazy v;
    public final Lazy w;
    public final st0 x;
    public final Lazy y;

    public k78(xq xqVar, gaf gaf, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6) {
        Lazy lazy7 = lazy;
        Lazy lazy8 = lazy3;
        this.b = lazy2;
        this.c = lazy8;
        this.o = lazy4;
        this.v = lazy7;
        this.w = lazy6;
        Duration.Companion companion = Duration.Companion;
        long duration = DurationKt.toDuration(1000, DurationUnit.MILLISECONDS);
        osa osa = (osa) gaf;
        this.x = new st0(osa.b(), osa.a(), duration, new vq7(4, (Object) this), new i78(lazy7, (Continuation) null), new wk(19, this, lazy5), new wq0(2, z68.a, z68.class, "d", "d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", 0, 16));
        this.y = LazyKt.lazy(new ur(19, lazy8));
        ((udg) xqVar).i.add(new g78(0, this));
    }

    public static void h(k78 k78, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = ((rh3) k78.w.getValue()).b() == mi3.b;
        boolean d = k78.d();
        boolean contains = ((EnumSet) k78.y.getValue()).contains(h78.b);
        String str = k78.a;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, str, "Trying to flush analytics, timeFromLastSend=" + iq.U(Long.valueOf(((qjd) ((x23) k78.b.getValue())).g.getLong("user.lastSentLogTime", 0))) + ", timeToSend=" + d + ", wifi=" + z2 + ", force=" + z + ", sendOnAnyNetwork=" + contains, (Throwable) null);
        }
        if (contains || z2 || d || z) {
            ((jqg) k78.o.getValue()).a(new evd(false, true));
        }
    }

    public final void a() {
    }

    public final o7d b() {
        return (o7d) this.v.getValue();
    }

    public final boolean c() {
        Duration.Companion companion = Duration.Companion;
        akd akd = (akd) ((bud) this.c.getValue());
        akd.getClass();
        long duration = DurationKt.toDuration(akd.r(PmsKey.f103sendlogsintervalsec, 10800) / ((long) 12), DurationUnit.SECONDS);
        long currentTimeMillis = System.currentTimeMillis();
        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
        return Duration.m1352compareToLRDsOJo(Duration.m1388minusLRDsOJo(DurationKt.toDuration(currentTimeMillis, durationUnit), DurationKt.toDuration(((qjd) ((x23) this.b.getValue())).g.getLong("user.lastSentCriticalLogTime", 0), durationUnit)), duration) >= 0;
    }

    public final boolean d() {
        Duration.Companion companion = Duration.Companion;
        long currentTimeMillis = System.currentTimeMillis();
        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
        long r0 = Duration.m1388minusLRDsOJo(DurationKt.toDuration(currentTimeMillis, durationUnit), DurationKt.toDuration(((qjd) ((x23) this.b.getValue())).g.getLong("user.lastSentLogTime", 0), durationUnit));
        akd akd = (akd) ((bud) this.c.getValue());
        akd.getClass();
        long duration = DurationKt.toDuration(akd.r(PmsKey.f103sendlogsintervalsec, 10800), DurationUnit.SECONDS);
        if (Duration.m1352compareToLRDsOJo(duration, Duration.Companion.m1456getZEROUwyO8pc()) < 0) {
            duration = DurationKt.toDuration(3, DurationUnit.HOURS);
        }
        return Duration.m1352compareToLRDsOJo(r0, duration) > 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(boolean r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.j78
            if (r0 == 0) goto L_0x0013
            r0 = r12
            j78 r0 = (defpackage.j78) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            j78 r0 = new j78
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            k78 r10 = r0.a
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0098
        L_0x002b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r12)
            boolean r12 = r10.c()
            java.lang.String r2 = r10.a
            a67 r4 = defpackage.z68.b
            if (r4 != 0) goto L_0x0041
            goto L_0x0087
        L_0x0041:
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x0087
            w78 r5 = defpackage.w78.o
            kotlin.Lazy r6 = r10.b
            java.lang.Object r6 = r6.getValue()
            x23 r6 = (defpackage.x23) r6
            qjd r6 = (defpackage.qjd) r6
            ls7 r6 = r6.g
            java.lang.String r7 = "user.lastSentCriticalLogTime"
            r8 = 0
            long r6 = r6.getLong(r7, r8)
            java.lang.Long r6 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r6)
            java.lang.String r6 = defpackage.iq.U(r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Trying to flush critical analytics, awaitFlush="
            r7.<init>(r8)
            r7.append(r11)
            java.lang.String r8 = ", timeFromLastSend="
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = ", timeToSend="
            r7.append(r6)
            r7.append(r12)
            java.lang.String r6 = r7.toString()
            r7 = 0
            r4.d(r5, r2, r6, r7)
        L_0x0087:
            if (r12 == 0) goto L_0x00a9
            if (r11 == 0) goto L_0x0098
            st0 r11 = r10.x
            r0.a = r10
            r0.o = r3
            java.lang.Object r11 = r11.b(r0)
            if (r11 != r1) goto L_0x0098
            return r1
        L_0x0098:
            kotlin.Lazy r10 = r10.o
            java.lang.Object r10 = r10.getValue()
            jqg r10 = (defpackage.jqg) r10
            evd r11 = new evd
            r12 = 0
            r11.<init>(r12, r12)
            r10.a(r11)
        L_0x00a9:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k78.g(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
