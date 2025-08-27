package defpackage;

import kotlin.Unit;

/* renamed from: v85  reason: default package */
public final class v85 extends x85 {
    public final kw1 c;
    public final /* synthetic */ z85 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v85(z85 z85, long j, lw1 lw1) {
        super(j);
        this.o = z85;
        this.c = lw1;
    }

    public final void run() {
        this.c.i(this.o, Unit.INSTANCE);
    }

    public final String toString() {
        return super.toString() + this.c;
    }
}
