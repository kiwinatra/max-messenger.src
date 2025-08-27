package defpackage;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;

/* renamed from: ocf  reason: default package */
public final class ocf {
    public final pbf a;

    public ocf(pbf pbf) {
        this.a = pbf;
    }

    public static long a(pbf pbf, mcf mcf) {
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, "ocf", "execute " + mcf, (Throwable) null);
        }
        if (mcf.b) {
            qm qmVar = mcf.a;
            long j = mcf.d;
            int i = mcf.e;
            wbf wbf = (wbf) pbf;
            wbf.getClass();
            if (qmVar instanceof hdb) {
                ((aua) wbf.j.getValue()).b().execute(new qbf(wbf, qmVar, j, i));
                return qmVar.a;
            }
            throw new IllegalArgumentException("task must be instance of PersistableTask");
        }
        qm qmVar2 = mcf.a;
        return ((wbf) pbf).b(qmVar2, (lcf) qmVar2, mcf.c);
    }

    public static long b(ocf ocf, qm qmVar) {
        ocf.getClass();
        return a(ocf.a, new mcf(qmVar, false, false, 0, 0));
    }

    public static /* synthetic */ long d(ocf ocf, qm qmVar, boolean z, int i, int i2) {
        if ((i2 & 8) != 0) {
            i = 0;
        }
        return ocf.c(qmVar, z, 0, i);
    }

    public final long c(qm qmVar, boolean z, long j, int i) {
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            StringBuilder sb = new StringBuilder("executeAndSave ");
            qm qmVar2 = qmVar;
            sb.append(qmVar);
            sb.append(", ");
            boolean z2 = z;
            sb.append(z);
            sb.append(", ");
            sb.append(j);
            sb.append(", ");
            sb.append(i);
            a67.d(w78, "ocf", sb.toString(), (Throwable) null);
        } else {
            qm qmVar3 = qmVar;
            boolean z3 = z;
            long j2 = j;
            int i2 = i;
        }
        mcf mcf = new mcf(qmVar, true, z, j, i);
        a67 a672 = z68.b;
        if (a672 != null && a672.c()) {
            w78 w782 = w78.o;
            a672.d(w782, "ocf", "tamService != null, execute task " + mcf + " ", (Throwable) null);
        }
        return a(this.a, mcf);
    }

    public final Object e(fbf fbf, Continuation continuation) {
        lw1 lw1 = new lw1(1, IntrinsicsKt.intercepted(continuation));
        lw1.u();
        ncf ncf = new ncf(lw1);
        wbf wbf = (wbf) this.a;
        Lazy lazy = wbf.m;
        ((zbf) lazy.getValue()).e();
        d6a d6a = new d6a(12, (Object) ncf);
        zbf zbf = (zbf) lazy.getValue();
        long d = wbf.d(fbf);
        xvd xvd = (xvd) zbf.f.get();
        if (xvd != null && !zbf.d(fbf, d6a)) {
            xvd.g(fbf, false, d, d6a);
        }
        Object t = lw1.t();
        if (t == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return t;
    }
}
