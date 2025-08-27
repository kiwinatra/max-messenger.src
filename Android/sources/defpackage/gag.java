package defpackage;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* renamed from: gag  reason: default package */
public abstract class gag {
    public static WeakHashMap a;
    public static final int[] b = {ahc.accessibility_custom_action_0, ahc.accessibility_custom_action_1, ahc.accessibility_custom_action_2, ahc.accessibility_custom_action_3, ahc.accessibility_custom_action_4, ahc.accessibility_custom_action_5, ahc.accessibility_custom_action_6, ahc.accessibility_custom_action_7, ahc.accessibility_custom_action_8, ahc.accessibility_custom_action_9, ahc.accessibility_custom_action_10, ahc.accessibility_custom_action_11, ahc.accessibility_custom_action_12, ahc.accessibility_custom_action_13, ahc.accessibility_custom_action_14, ahc.accessibility_custom_action_15, ahc.accessibility_custom_action_16, ahc.accessibility_custom_action_17, ahc.accessibility_custom_action_18, ahc.accessibility_custom_action_19, ahc.accessibility_custom_action_20, ahc.accessibility_custom_action_21, ahc.accessibility_custom_action_22, ahc.accessibility_custom_action_23, ahc.accessibility_custom_action_24, ahc.accessibility_custom_action_25, ahc.accessibility_custom_action_26, ahc.accessibility_custom_action_27, ahc.accessibility_custom_action_28, ahc.accessibility_custom_action_29, ahc.accessibility_custom_action_30, ahc.accessibility_custom_action_31};
    public static final q9g c = new Object();
    public static final s9g d = new s9g();

    public static ecg a(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        ecg ecg = (ecg) a.get(view);
        if (ecg != null) {
            return ecg;
        }
        ecg ecg2 = new ecg(view);
        a.put(view, ecg2);
        return ecg2;
    }

    public static iog b(View view, iog iog) {
        WindowInsets f = iog.f();
        if (f != null) {
            WindowInsets a2 = t9g.a(view, f);
            if (!a2.equals(f)) {
                return iog.g(view, a2);
            }
        }
        return iog;
    }

    public static ArrayList c(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(ahc.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(ahc.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] d(View view) {
        return Build.VERSION.SDK_INT >= 31 ? dag.a(view) : (String[]) view.getTag(ahc.tag_on_receive_content_mime_types);
    }

    public static void e(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = aag.b(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            int i2 = 32;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z) {
                    i2 = 2048;
                }
                obtain.setEventType(i2);
                obtain.setContentChangeTypes(i);
                if (z) {
                    obtain.getText().add(aag.b(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(aag.b(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError unused) {
                    view.getParent().getClass();
                }
            }
        }
    }

    public static iog f(View view, iog iog) {
        WindowInsets f = iog.f();
        if (f != null) {
            WindowInsets b2 = t9g.b(view, f);
            if (!b2.equals(f)) {
                return iog.g(view, b2);
            }
        }
        return iog;
    }

    public static lv3 g(View view, lv3 lv3) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(lv3);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return dag.b(view, lv3);
        }
        tma tma = (tma) view.getTag(ahc.tag_on_receive_content_listener);
        uma uma = c;
        if (tma != null) {
            lv3 a2 = tma.a(view, lv3);
            if (a2 == null) {
                return null;
            }
            if (view instanceof uma) {
                uma = (uma) view;
            }
            return uma.b(a2);
        }
        if (view instanceof uma) {
            uma = (uma) view;
        }
        return uma.b(lv3);
    }

    public static void h(View view, int i) {
        ArrayList c2 = c(view);
        for (int i2 = 0; i2 < c2.size(); i2++) {
            if (((a4) c2.get(i2)).a() == i) {
                c2.remove(i2);
                return;
            }
        }
    }

    public static void i(View view, a4 a4Var, p4 p4Var) {
        if (p4Var == null) {
            h(view, a4Var.a());
            e(view, 0);
            return;
        }
        a4 a4Var2 = new a4((Object) null, a4Var.b, (String) null, p4Var, a4Var.c);
        View.AccessibilityDelegate a2 = bag.a(view);
        v3 v3Var = a2 == null ? null : a2 instanceof u3 ? ((u3) a2).a : new v3(a2);
        if (v3Var == null) {
            v3Var = new v3();
        }
        j(view, v3Var);
        h(view, a4Var2.a());
        c(view).add(a4Var2);
        e(view, 0);
    }

    public static void j(View view, v3 v3Var) {
        if (v3Var == null && (bag.a(view) instanceof u3)) {
            v3Var = new v3();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(v3Var == null ? null : v3Var.b);
    }

    public static void k(View view, CharSequence charSequence) {
        new r9g(ahc.tag_accessibility_pane_title, CharSequence.class, 8, 28, 0).e(view, charSequence);
        s9g s9g = d;
        if (charSequence != null) {
            s9g.a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(s9g);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(s9g);
                return;
            }
            return;
        }
        s9g.a.remove(view);
        view.removeOnAttachStateChangeListener(s9g);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(s9g);
    }

    public static void l(View view, n22 n22) {
        sng sng = null;
        if (Build.VERSION.SDK_INT >= 30) {
            if (n22 != null) {
                sng = new sng(n22);
            }
            view.setWindowInsetsAnimationCallback(sng);
            return;
        }
        PathInterpolator pathInterpolator = rng.e;
        Object tag = view.getTag(ahc.tag_on_apply_window_listener);
        if (n22 == null) {
            view.setTag(ahc.tag_window_insets_animation_callback, (Object) null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
                return;
            }
            return;
        }
        qng qng = new qng(view, n22);
        view.setTag(ahc.tag_window_insets_animation_callback, qng);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(qng);
        }
    }
}
