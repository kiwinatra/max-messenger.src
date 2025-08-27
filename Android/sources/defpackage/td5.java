package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: td5  reason: default package */
public final class td5 extends grg {
    public final /* synthetic */ ud5 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public td5(ud5 ud5) {
        super(1);
        this.c = ud5;
    }

    public final boolean E(int i, int i2, Bundle bundle) {
        int i3;
        ud5 ud5 = this.c;
        View view = ud5.i;
        if (i != -1) {
            boolean z = true;
            if (i2 == 1) {
                return ud5.w(i);
            }
            if (i2 == 2) {
                return ud5.j(i);
            }
            if (i2 == 64) {
                AccessibilityManager accessibilityManager = ud5.h;
                if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i3 = ud5.k) != i) {
                    if (i3 != Integer.MIN_VALUE) {
                        ud5.k = IntCompanionObject.MIN_VALUE;
                        ud5.i.invalidate();
                        ud5.x(i3, 65536);
                    }
                    ud5.k = i;
                    view.invalidate();
                    ud5.x(i, 32768);
                    return z;
                }
            } else if (i2 != 128) {
                return ud5.s(i, i2, bundle);
            } else {
                if (ud5.k == i) {
                    ud5.k = IntCompanionObject.MIN_VALUE;
                    view.invalidate();
                    ud5.x(i, 65536);
                    return z;
                }
            }
            z = false;
            return z;
        }
        WeakHashMap weakHashMap = gag.a;
        return view.performAccessibilityAction(i2, bundle);
    }

    public final g4 w(int i) {
        return new g4(AccessibilityNodeInfo.obtain(this.c.r(i).a));
    }

    public final g4 x(int i) {
        ud5 ud5 = this.c;
        int i2 = i == 2 ? ud5.k : ud5.l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return w(i2);
    }
}
