package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;

/* renamed from: te0  reason: default package */
public final class te0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(te0.class, "notCompletedCount$volatile");
    public final mk4[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public te0(mk4[] mk4Arr) {
        this.a = mk4Arr;
        this.notCompletedCount$volatile = mk4Arr.length;
    }

    public final Object a(Continuation continuation) {
        lw1 lw1 = new lw1(1, IntrinsicsKt.intercepted(continuation));
        lw1.u();
        mk4[] mk4Arr = this.a;
        int length = mk4Arr.length;
        re0[] re0Arr = new re0[length];
        for (int i = 0; i < length; i++) {
            mk4 mk4 = mk4Arr[i];
            ((qn7) mk4).start();
            re0 re0 = new re0(this, lw1);
            re0.w = kv0.H(mk4, re0);
            Unit unit = Unit.INSTANCE;
            re0Arr[i] = re0;
        }
        se0 se0 = new se0(re0Arr);
        for (int i2 = 0; i2 < length; i2++) {
            re0 re02 = re0Arr[i2];
            re02.getClass();
            re0.y.set(re02, se0);
        }
        if (!(lw1.x.get(lw1) instanceof naa)) {
            se0.a();
        } else {
            cvg.z(lw1, se0);
        }
        Object t = lw1.t();
        if (t == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return t;
    }
}
