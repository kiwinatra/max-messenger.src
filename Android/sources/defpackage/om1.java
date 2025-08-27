package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: om1  reason: default package */
public final /* synthetic */ class om1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ om1(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((Boolean) obj).booleanValue();
                ((tm1) this.c).E0.setVisibility(this.b ? 0 : 8);
                return Unit.INSTANCE;
            default:
                int ordinal = ((g0b) obj).ordinal();
                k7c k7c = (k7c) this.c;
                if (ordinal == 0 || ordinal == 1) {
                    k7c.l();
                } else {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            k7c.v(this.b);
                        } else if (ordinal != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    k7c.L0 = false;
                }
                return Unit.INSTANCE;
        }
    }
}
