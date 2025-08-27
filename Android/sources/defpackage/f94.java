package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: f94  reason: default package */
public final class f94 {
    public static final /* synthetic */ int g = 0;
    public final e94 a;
    public final Runnable b;
    public final Function1 c;
    public final lfd d;
    public final dac e = new dac();
    public or7 f;

    static {
        Duration.Companion companion = Duration.Companion;
        DurationKt.toDuration(100, DurationUnit.MILLISECONDS);
    }

    public f94(e94 e94, Runnable runnable, Function1 function1, lfd lfd) {
        this.a = e94;
        this.b = runnable;
        this.c = function1;
        this.d = lfd;
        b();
    }

    public final void a() {
        or7 or7 = this.f;
        if (or7 == null || or7.f()) {
            b();
        }
        this.e.d(0);
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [bia] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r9 = this;
            e94 r0 = r9.a
            boolean r1 = r0 instanceof defpackage.c94
            dac r3 = r9.e
            if (r1 == 0) goto L_0x0017
            c94 r0 = (defpackage.c94) r0
            long r0 = r0.a
            long r0 = kotlin.time.Duration.m1371getInWholeMillisecondsimpl(r0)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            bia r0 = r3.z(r0, r2)
            goto L_0x003d
        L_0x0017:
            boolean r1 = r0 instanceof defpackage.d94
            if (r1 == 0) goto L_0x005e
            d94 r0 = (defpackage.d94) r0
            long r0 = r0.a
            long r4 = kotlin.time.Duration.m1371getInWholeMillisecondsimpl(r0)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            r3.getClass()
            lfd r7 = defpackage.xfd.a()
            java.lang.String r0 = "unit is null"
            java.util.Objects.requireNonNull(r6, r0)
            java.lang.String r0 = "scheduler is null"
            java.util.Objects.requireNonNull(r7, r0)
            ika r0 = new ika
            r8 = 0
            r2 = r0
            r2.<init>(r3, r4, r6, r7, r8)
        L_0x003d:
            lfd r1 = r9.d
            lja r0 = r0.s(r1)
            vs6 r1 = new vs6
            r2 = 16
            r1.<init>((int) r2, (java.lang.Object) r9)
            rt6 r2 = new rt6
            r3 = 16
            r2.<init>((int) r3, (java.lang.Object) r9)
            dj6 r3 = defpackage.m58.e
            or7 r4 = new or7
            r4.<init>(r1, r2, r3)
            r0.a(r4)
            r9.f = r4
            return
        L_0x005e:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f94.b():void");
    }
}
