package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: f4  reason: default package */
public final class f4 {
    public final Object a;

    public f4(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.a = collectionItemInfo;
    }

    public static f4 a(boolean z, int i, int i2, int i3, int i4) {
        return new f4(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }
}
