package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;

/* renamed from: yme  reason: default package */
public final class yme extends k3 {
    public final AtomicReference a = new AtomicReference((Object) null);

    public final boolean a(j3 j3Var) {
        xme xme = (xme) j3Var;
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(f6e.h);
        return true;
    }

    public final Continuation[] b(j3 j3Var) {
        xme xme = (xme) j3Var;
        this.a.set((Object) null);
        return ct.a;
    }

    public final Object c(wme wme) {
        lw1 lw1 = new lw1(1, IntrinsicsKt.intercepted(wme));
        lw1.u();
        AtomicReference atomicReference = this.a;
        bpa bpa = f6e.h;
        while (true) {
            if (!atomicReference.compareAndSet(bpa, lw1)) {
                if (atomicReference.get() != bpa) {
                    Result.Companion companion = Result.Companion;
                    lw1.resumeWith(Result.m23constructorimpl(Unit.INSTANCE));
                    break;
                }
            } else {
                break;
            }
        }
        Object t = lw1.t();
        if (t == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(wme);
        }
        return t == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? t : Unit.INSTANCE;
    }
}
