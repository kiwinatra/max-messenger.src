package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.coroutines.Continuation;

/* renamed from: bq4  reason: default package */
public abstract class bq4 extends ndf {
    public int c;

    public bq4(int i) {
        super(0, jef.g);
        this.c = i;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract Continuation c();

    public Throwable d(Object obj) {
        jb3 jb3 = obj instanceof jb3 ? (jb3) obj : null;
        if (jb3 != null) {
            return jb3.a;
        }
        return null;
    }

    public Object e(Object obj) {
        return obj;
    }

    public final void g(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                ExceptionsKt.addSuppressed(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            u04.a(new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), c().getContext());
        }
    }

    public abstract Object h();

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0086, code lost:
        if (r4.l0() != false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ae, code lost:
        if (r4.l0() != false) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            jq5 r0 = r10.b
            kotlin.coroutines.Continuation r1 = r10.c()     // Catch:{ all -> 0x001e }
            zp4 r1 = (defpackage.zp4) r1     // Catch:{ all -> 0x001e }
            kotlin.coroutines.Continuation r2 = r1.v     // Catch:{ all -> 0x001e }
            java.lang.Object r1 = r1.x     // Catch:{ all -> 0x001e }
            kotlin.coroutines.CoroutineContext r3 = r2.getContext()     // Catch:{ all -> 0x001e }
            java.lang.Object r1 = defpackage.eif.b(r3, r1)     // Catch:{ all -> 0x001e }
            bpa r4 = defpackage.eif.a     // Catch:{ all -> 0x001e }
            r5 = 0
            if (r1 == r4) goto L_0x0021
            ivf r4 = defpackage.o04.c(r2, r3, r1)     // Catch:{ all -> 0x001e }
            goto L_0x0022
        L_0x001e:
            r1 = move-exception
            goto L_0x00b4
        L_0x0021:
            r4 = r5
        L_0x0022:
            kotlin.coroutines.CoroutineContext r6 = r2.getContext()     // Catch:{ all -> 0x0041 }
            java.lang.Object r7 = r10.h()     // Catch:{ all -> 0x0041 }
            java.lang.Throwable r8 = r10.d(r7)     // Catch:{ all -> 0x0041 }
            if (r8 != 0) goto L_0x0043
            int r9 = r10.c     // Catch:{ all -> 0x0041 }
            boolean r9 = defpackage.cq4.a(r9)     // Catch:{ all -> 0x0041 }
            if (r9 == 0) goto L_0x0043
            om7 r9 = defpackage.om7.a     // Catch:{ all -> 0x0041 }
            kotlin.coroutines.CoroutineContext$Element r6 = r6.get(r9)     // Catch:{ all -> 0x0041 }
            pm7 r6 = (defpackage.pm7) r6     // Catch:{ all -> 0x0041 }
            goto L_0x0044
        L_0x0041:
            r2 = move-exception
            goto L_0x00a8
        L_0x0043:
            r6 = r5
        L_0x0044:
            if (r6 == 0) goto L_0x0061
            boolean r9 = r6.isActive()     // Catch:{ all -> 0x0041 }
            if (r9 != 0) goto L_0x0061
            java.util.concurrent.CancellationException r6 = r6.n()     // Catch:{ all -> 0x0041 }
            r10.b(r7, r6)     // Catch:{ all -> 0x0041 }
            kotlin.Result$Companion r7 = kotlin.Result.Companion     // Catch:{ all -> 0x0041 }
            java.lang.Object r6 = kotlin.ResultKt.createFailure(r6)     // Catch:{ all -> 0x0041 }
            java.lang.Object r6 = kotlin.Result.m23constructorimpl(r6)     // Catch:{ all -> 0x0041 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x0041 }
            goto L_0x007e
        L_0x0061:
            if (r8 == 0) goto L_0x0071
            kotlin.Result$Companion r6 = kotlin.Result.Companion     // Catch:{ all -> 0x0041 }
            java.lang.Object r6 = kotlin.ResultKt.createFailure(r8)     // Catch:{ all -> 0x0041 }
            java.lang.Object r6 = kotlin.Result.m23constructorimpl(r6)     // Catch:{ all -> 0x0041 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x0041 }
            goto L_0x007e
        L_0x0071:
            kotlin.Result$Companion r6 = kotlin.Result.Companion     // Catch:{ all -> 0x0041 }
            java.lang.Object r6 = r10.e(r7)     // Catch:{ all -> 0x0041 }
            java.lang.Object r6 = kotlin.Result.m23constructorimpl(r6)     // Catch:{ all -> 0x0041 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x0041 }
        L_0x007e:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0041 }
            if (r4 == 0) goto L_0x0088
            boolean r2 = r4.l0()     // Catch:{ all -> 0x001e }
            if (r2 == 0) goto L_0x008b
        L_0x0088:
            defpackage.eif.a(r3, r1)     // Catch:{ all -> 0x001e }
        L_0x008b:
            r0.getClass()     // Catch:{ all -> 0x0095 }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0095 }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x0095 }
            goto L_0x00a0
        L_0x0095:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)
        L_0x00a0:
            java.lang.Throwable r0 = kotlin.Result.m26exceptionOrNullimpl(r0)
            r10.g(r5, r0)
            goto L_0x00d2
        L_0x00a8:
            if (r4 == 0) goto L_0x00b0
            boolean r4 = r4.l0()     // Catch:{ all -> 0x001e }
            if (r4 == 0) goto L_0x00b3
        L_0x00b0:
            defpackage.eif.a(r3, r1)     // Catch:{ all -> 0x001e }
        L_0x00b3:
            throw r2     // Catch:{ all -> 0x001e }
        L_0x00b4:
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch:{ all -> 0x00c0 }
            r0.getClass()     // Catch:{ all -> 0x00c0 }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00c0 }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x00c0 }
            goto L_0x00cb
        L_0x00c0:
            r0 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)
        L_0x00cb:
            java.lang.Throwable r0 = kotlin.Result.m26exceptionOrNullimpl(r0)
            r10.g(r1, r0)
        L_0x00d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bq4.run():void");
    }
}
