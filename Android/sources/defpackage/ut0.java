package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ut0  reason: default package */
public final /* synthetic */ class ut0 implements eo1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicReference b;

    public /* synthetic */ ut0(AtomicReference atomicReference, int i) {
        this.a = i;
        this.b = atomicReference;
    }

    public final Object r(do1 do1) {
        switch (this.a) {
            case 0:
                this.b.set(do1);
                return "Data closed";
            case 1:
                this.b.set(new ps1(0, do1));
                return "OnScreenFlashUiApplied";
            case 2:
                this.b.set(do1);
                return "Data closed";
            case 3:
                this.b.set(do1);
                return "acquireInputBuffer";
            case 4:
                this.b.set(do1);
                return "mReleasedFuture";
            default:
                this.b.set(do1);
                return "Terminate InputBuffer";
        }
    }
}
