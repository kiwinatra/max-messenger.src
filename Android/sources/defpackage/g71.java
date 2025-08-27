package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import one.me.calllist.ui.page.CallHistoryPageScreen;

/* renamed from: g71  reason: default package */
public final class g71 extends e54 {
    public final String Z = g71.class.getName();
    public List v0 = CollectionsKt.emptyList();

    public g71(zx3 zx3) {
        super(zx3, 1);
    }

    public final void G(e9d e9d, int i) {
        CallHistoryPageScreen callHistoryPageScreen;
        if (!e9d.n()) {
            int ordinal = ((y71) this.v0.get(i)).c.ordinal();
            if (ordinal == 0) {
                s9a s9a = CallHistoryPageScreen.X;
                x71 x71 = x71.ALL;
                s9a.getClass();
                callHistoryPageScreen = new CallHistoryPageScreen(x71);
            } else if (ordinal == 1) {
                s9a s9a2 = CallHistoryPageScreen.X;
                x71 x712 = x71.MISSING;
                s9a2.getClass();
                callHistoryPageScreen = new CallHistoryPageScreen(x712);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            CallHistoryPageScreen callHistoryPageScreen2 = callHistoryPageScreen;
            callHistoryPageScreen2.setRetainViewMode(yx3.b);
            e9d.R(new i9d(callHistoryPageScreen2, (String) null, (ey3) null, (ey3) null, false, -1));
        }
    }

    /* renamed from: L */
    public final void z(k9d k9d) {
        k9d.E0 = null;
        super.L(k9d);
    }

    public final int j() {
        return this.v0.size();
    }
}
