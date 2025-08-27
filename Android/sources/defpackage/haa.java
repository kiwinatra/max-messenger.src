package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: haa  reason: default package */
public abstract class haa {
    public final d14 a;
    public final Lazy b;
    public pm7 c;
    public Function2 d;

    public haa(d14 d14, Lazy lazy) {
        this.a = d14;
        this.b = lazy;
    }

    public final void a() {
        pm7 pm7 = this.c;
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        this.c = null;
        faa faa = (faa) this;
        ReentrantLock reentrantLock = faa.f;
        reentrantLock.lock();
        try {
            faa.e.g();
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long b() {
        Duration.Companion companion = Duration.Companion;
        cud cud = ((ltb) ((jtb) this.b.getValue())).b;
        cud.getClass();
        return DurationKt.toDuration(cud.r(PmsKey.f89noncontactcollectioninterval, TimeUnit.SECONDS.toMillis(10)), DurationUnit.MILLISECONDS);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(defpackage.jz9 r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.gaa
            if (r0 == 0) goto L_0x0013
            r0 = r10
            gaa r0 = (defpackage.gaa) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            gaa r0 = new gaa
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            haa r8 = r0.a
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ Error -> 0x002e, all -> 0x002c }
            goto L_0x0094
        L_0x002c:
            r9 = move-exception
            goto L_0x0077
        L_0x002e:
            r8 = move-exception
            goto L_0x0097
        L_0x0030:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Class r10 = r8.getClass()
            java.lang.String r10 = r10.getName()
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x0048
            goto L_0x005f
        L_0x0048:
            boolean r5 = r2.c()
            if (r5 == 0) goto L_0x005f
            w78 r5 = defpackage.w78.o
            r6 = 31
            java.lang.String r6 = defpackage.va8.d(r9, r3, r3, r6)
            java.lang.String r7 = "request ids "
            java.lang.String r6 = defpackage.a81.m(r7, r6)
            r2.d(r5, r10, r6, r3)
        L_0x005f:
            boolean r10 = r9.b()
            if (r10 == 0) goto L_0x0068
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L_0x0068:
            kotlin.jvm.functions.Function2 r10 = r8.d     // Catch:{ Error -> 0x002e, all -> 0x002c }
            if (r10 == 0) goto L_0x0094
            r0.a = r8     // Catch:{ Error -> 0x002e, all -> 0x002c }
            r0.o = r4     // Catch:{ Error -> 0x002e, all -> 0x002c }
            java.lang.Object r8 = r10.invoke(r9, r0)     // Catch:{ Error -> 0x002e, all -> 0x002c }
            if (r8 != r1) goto L_0x0094
            return r1
        L_0x0077:
            r8.a()
            boolean r9 = r9 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L_0x0081
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L_0x0081:
            faa r8 = (defpackage.faa) r8
            r8.a()
            eaa r9 = new eaa
            r9.<init>(r8, r3)
            r10 = 3
            d14 r0 = r8.a
            aje r9 = defpackage.ev0.v(r0, r3, r3, r9, r10)
            r8.c = r9
        L_0x0094:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L_0x0097:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.haa.c(jz9, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
