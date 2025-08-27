package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: v3f  reason: default package */
public final /* synthetic */ class v3f implements eo1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ String c;

    public /* synthetic */ v3f(AtomicReference atomicReference, String str, int i) {
        this.a = i;
        this.b = atomicReference;
        this.c = str;
    }

    public final Object r(do1 do1) {
        switch (this.a) {
            case 0:
                this.b.set(do1);
                return wj6.n(new StringBuilder(), this.c, "-cancellation");
            case 1:
                this.b.set(do1);
                return wj6.n(new StringBuilder(), this.c, "-status");
            default:
                this.b.set(do1);
                return wj6.n(new StringBuilder(), this.c, "-Surface");
        }
    }
}
