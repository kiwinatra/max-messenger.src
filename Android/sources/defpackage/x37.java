package defpackage;

import kotlin.Unit;

/* renamed from: x37  reason: default package */
public final class x37 extends mdf {
    public final /* synthetic */ a47 e;
    public final /* synthetic */ int f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x37(String str, a47 a47, int i, int i2) {
        super(str, true);
        this.e = a47;
        this.f = i;
    }

    public final long a() {
        this.e.Z.getClass();
        synchronized (this.e) {
            this.e.J0.remove(Integer.valueOf(this.f));
            Unit unit = Unit.INSTANCE;
        }
        return -1;
    }
}
