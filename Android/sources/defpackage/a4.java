package defpackage;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;

/* renamed from: a4  reason: default package */
public final class a4 {
    public static final a4 e = new a4(16, (String) null);
    public static final a4 f = new a4((int) ConstantsKt.DEFAULT_BLOCK_SIZE, (String) null);
    public static final a4 g = new a4((int) ConstantsKt.DEFAULT_BUFFER_SIZE, (String) null);
    public static final a4 h = new a4(262144, (String) null);
    public static final a4 i = new a4(524288, (String) null);
    public static final a4 j = new a4(1048576, (String) null);
    public static final a4 k = new a4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, (String) null, (p4) null, (Class) null);
    public static final a4 l = new a4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, (String) null, (p4) null, (Class) null);
    public static final a4 m = new a4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, (String) null, (p4) null, m4.class);
    public final Object a;
    public final int b;
    public final Class c;
    public final p4 d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
        new a4(1, (String) null);
        new a4(2, (String) null);
        new a4(4, (String) null);
        new a4(8, (String) null);
        new a4(32, (String) null);
        new a4(64, (String) null);
        new a4((int) Uuid.SIZE_BITS, (String) null);
        Class<i4> cls = i4.class;
        new a4((Class) cls, 256);
        new a4((Class) cls, (int) ConstantsKt.MINIMUM_BLOCK_SIZE);
        Class<j4> cls2 = j4.class;
        new a4((Class) cls2, 1024);
        new a4((Class) cls2, 2048);
        new a4(16384, (String) null);
        new a4(32768, (String) null);
        new a4(65536, (String) null);
        new a4(n4.class, 131072);
        new a4(o4.class, 2097152);
        int i2 = Build.VERSION.SDK_INT;
        new a4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, (String) null, (p4) null, (Class) null);
        new a4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, (String) null, (p4) null, l4.class);
        new a4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, (String) null, (p4) null, (Class) null);
        new a4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, (String) null, (p4) null, (Class) null);
        new a4(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, 16908358, (String) null, (p4) null, (Class) null);
        new a4(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, 16908359, (String) null, (p4) null, (Class) null);
        new a4(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, 16908360, (String) null, (p4) null, (Class) null);
        new a4(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, 16908361, (String) null, (p4) null, (Class) null);
        new a4(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, (String) null, (p4) null, (Class) null);
        new a4(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, 16908354, (String) null, (p4) null, k4.class);
        new a4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, 16908356, (String) null, (p4) null, (Class) null);
        new a4(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, 16908357, (String) null, (p4) null, (Class) null);
        new a4(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, (String) null, (p4) null, (Class) null);
        new a4(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, (String) null, (p4) null, (Class) null);
        new a4(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, 16908373, (String) null, (p4) null, (Class) null);
        new a4(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, 16908374, (String) null, (p4) null, (Class) null);
        new a4(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, 16908375, (String) null, (p4) null, (Class) null);
        new a4(i2 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, 16908376, (String) null, (p4) null, (Class) null);
        if (i2 >= 34) {
            accessibilityAction = d4.a();
        }
        new a4(accessibilityAction, 16908382, (String) null, (p4) null, (Class) null);
    }

    public a4(int i2, String str) {
        this((Object) null, i2, str, (p4) null, (Class) null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a4)) {
            return false;
        }
        Object obj2 = ((a4) obj).a;
        Object obj3 = this.a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d2 = g4.d(this.b);
        if (d2.equals("ACTION_UNKNOWN")) {
            Object obj = this.a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d2 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d2);
        return sb.toString();
    }

    public a4(Class cls, int i2) {
        this((Object) null, i2, (String) null, (p4) null, cls);
    }

    public a4(Object obj, int i2, String str, p4 p4Var, Class cls) {
        this.b = i2;
        this.d = p4Var;
        if (obj == null) {
            this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, str);
        } else {
            this.a = obj;
        }
        this.c = cls;
    }
}
