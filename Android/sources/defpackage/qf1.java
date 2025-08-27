package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: qf1  reason: default package */
public final class qf1 extends ObservableProperty {
    public final /* synthetic */ int a;
    public final /* synthetic */ rf1 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qf1(rf1 rf1, int i) {
        super(null);
        this.a = i;
        switch (i) {
            case 1:
                of1 of1 = of1.a;
                this.b = rf1;
                super(of1);
                return;
            default:
                this.b = rf1;
                return;
        }
    }

    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        anb anb;
        switch (this.a) {
            case 0:
                k2b k2b = (k2b) obj2;
                if (!Intrinsics.areEqual((Object) (k2b) obj, (Object) k2b)) {
                    this.b.getFakePipView().setCustomTheme(k2b);
                    return;
                }
                return;
            case 1:
                of1 of1 = (of1) obj2;
                if (((of1) obj) != of1) {
                    int ordinal = of1.ordinal();
                    rf1 rf1 = this.b;
                    if (ordinal == 0) {
                        anb = ymb.a;
                    } else if (ordinal == 1) {
                        anb = new xmb(rf1, new b8d((Object) rf1), rf1.getPipPositionMediator());
                    } else if (ordinal == 2) {
                        anb = new jmb(rf1, new xv1(8, (Object) rf1), rf1.getPipPositionMediator());
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    rf1.o = anb;
                    return;
                }
                return;
            default:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    nmb nmb = (nmb) obj2;
                    nmb nmb2 = (nmb) obj;
                    rf1 rf12 = this.b;
                    rf12.c(rf12.getLeft(), rf12.getTop(), rf12.getRight(), rf12.getBottom());
                    return;
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qf1(nmb nmb, rf1 rf1) {
        super(nmb);
        this.a = 2;
        this.b = rf1;
    }
}
