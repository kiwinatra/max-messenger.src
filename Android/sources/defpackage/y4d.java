package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: y4d  reason: default package */
public final /* synthetic */ class y4d implements zi6, eo1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object v;

    public /* synthetic */ y4d(nr4 nr4, z3f z3f, xjf xjf, zc0 zc0, lb0 lb0) {
        this.a = nr4;
        this.b = z3f;
        this.c = xjf;
        this.o = zc0;
        this.v = lb0;
    }

    public Object apply(Object obj) {
        return ((jha) obj).l(new zc4((Object) (Function1) this.a, (Object) (zf0) this.c, (Object) (Function2) this.o, (Object) (lfd) this.v, (Object) (Function1) this.b));
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [v2f] */
    /* JADX WARNING: type inference failed for: r3v5, types: [z4g] */
    /* JADX WARNING: type inference failed for: r3v6, types: [ay2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object r(defpackage.do1 r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.a
            nr4 r0 = (defpackage.nr4) r0
            java.lang.Object r1 = r12.b
            z3f r1 = (defpackage.z3f) r1
            java.lang.Object r2 = r12.c
            r5 = r2
            xjf r5 = (defpackage.xjf) r5
            java.lang.Object r2 = r12.o
            zc0 r2 = (defpackage.zc0) r2
            java.lang.Object r12 = r12.v
            lb0 r12 = (defpackage.lb0) r12
            r0.getClass()
            vy4 r9 = r1.c
            wc0 r2 = defpackage.e4g.b(r12, r9, r2)
            yc0 r6 = r12.a
            android.util.Size r7 = r1.b
            android.util.Range r12 = r1.d
            sa0 r8 = r2.c
            if (r8 == 0) goto L_0x0032
            ay2 r11 = new ay2
            java.lang.String r4 = r2.a
            r3 = r11
            r10 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x003c
        L_0x0032:
            z4g r11 = new z4g
            java.lang.String r4 = r2.a
            r3 = r11
            r8 = r9
            r9 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
        L_0x003c:
            java.lang.Object r12 = r11.get()
            uc0 r12 = (defpackage.uc0) r12
            java.lang.Object r2 = r0.e     // Catch:{ InvalidConfigException -> 0x0095 }
            ts1 r2 = (defpackage.ts1) r2     // Catch:{ InvalidConfigException -> 0x0095 }
            java.lang.Object r3 = r0.c     // Catch:{ InvalidConfigException -> 0x0095 }
            java.util.concurrent.Executor r3 = (java.util.concurrent.Executor) r3     // Catch:{ InvalidConfigException -> 0x0095 }
            r2.getClass()     // Catch:{ InvalidConfigException -> 0x0095 }
            g65 r2 = new g65     // Catch:{ InvalidConfigException -> 0x0095 }
            r2.<init>(r3, r12)     // Catch:{ InvalidConfigException -> 0x0095 }
            r0.f = r2     // Catch:{ InvalidConfigException -> 0x0095 }
            n55 r12 = r2.f
            boolean r2 = r12 instanceof defpackage.f65
            if (r2 != 0) goto L_0x0065
            java.lang.AssertionError r12 = new java.lang.AssertionError
            java.lang.String r1 = "The EncoderInput of video isn't a SurfaceInput."
            r12.<init>(r1)
            r13.d(r12)
            goto L_0x0099
        L_0x0065:
            f65 r12 = (defpackage.f65) r12
            java.lang.Object r2 = r0.d
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            fkd r3 = new fkd
            r4 = 7
            r3.<init>(r0, r13, r1, r4)
            java.lang.Object r1 = r12.a
            monitor-enter(r1)
            r12.o = r3     // Catch:{ all -> 0x0092 }
            r2.getClass()     // Catch:{ all -> 0x0092 }
            r12.v = r2     // Catch:{ all -> 0x0092 }
            android.view.Surface r13 = r12.b     // Catch:{ all -> 0x0092 }
            monitor-exit(r1)     // Catch:{ all -> 0x0092 }
            if (r13 == 0) goto L_0x0099
            tsd r2 = (defpackage.tsd) r2
            bk4 r1 = new bk4     // Catch:{ RejectedExecutionException -> 0x008d }
            r4 = 21
            r1.<init>(r4, r3, r13)     // Catch:{ RejectedExecutionException -> 0x008d }
            r2.execute(r1)     // Catch:{ RejectedExecutionException -> 0x008d }
            goto L_0x0099
        L_0x008d:
            g65 r12 = r12.w
            java.lang.String r12 = r12.a
            goto L_0x0099
        L_0x0092:
            r12 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0092 }
            throw r12
        L_0x0095:
            r12 = move-exception
            r13.d(r12)
        L_0x0099:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "ConfigureVideoEncoderFuture "
            r12.<init>(r13)
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y4d.r(do1):java.lang.Object");
    }

    public /* synthetic */ y4d(Function1 function1, zf0 zf0, Function2 function2, lfd lfd, Function1 function12) {
        this.a = function1;
        this.c = zf0;
        this.o = function2;
        this.v = lfd;
        this.b = function12;
    }
}
