package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: yn  reason: default package */
public final class yn implements Window.Callback {
    public final Window.Callback a;
    public z3a b;
    public boolean c;
    public boolean o;
    public boolean v;
    public final /* synthetic */ eo w;

    public yn(eo eoVar, Window.Callback callback) {
        this.w = eoVar;
        if (callback != null) {
            this.a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    /* JADX INFO: finally extract failed */
    public final void a(Window.Callback callback) {
        try {
            this.c = true;
            callback.onContentChanged();
            this.c = false;
        } catch (Throwable th) {
            this.c = false;
            throw th;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        jng.a(this.a, list, menu, i);
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.a.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.o;
        Window.Callback callback = this.a;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.w.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (this.a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        eo eoVar = this.w;
        eoVar.z();
        b59 b59 = eoVar.x0;
        if (b59 != null && b59.O(keyCode, keyEvent)) {
            return true;
        }
        co coVar = eoVar.V0;
        if (coVar == null || !eoVar.E(coVar, keyEvent.getKeyCode(), keyEvent)) {
            if (eoVar.V0 == null) {
                co y = eoVar.y(0);
                eoVar.F(y, keyEvent);
                boolean E = eoVar.E(y, keyEvent.getKeyCode(), keyEvent);
                y.k = false;
                if (E) {
                    return true;
                }
            }
            return false;
        }
        co coVar2 = eoVar.V0;
        if (coVar2 == null) {
            return true;
        }
        coVar2.l = true;
        return true;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.a.dispatchTouchEvent(motionEvent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.a.dispatchTrackballEvent(motionEvent);
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        this.a.onActionModeFinished(actionMode);
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        this.a.onActionModeStarted(actionMode);
    }

    public final void onAttachedToWindow() {
        this.a.onAttachedToWindow();
    }

    public final void onContentChanged() {
        if (this.c) {
            this.a.onContentChanged();
        }
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof m69)) {
            return this.a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    public final View onCreatePanelView(int i) {
        z3a z3a = this.b;
        if (z3a != null) {
            View view = i == 0 ? new View(((jmf) z3a.b).w.a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.a.onCreatePanelView(i);
    }

    public final void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.a.onMenuItemSelected(i, menuItem);
    }

    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        eo eoVar = this.w;
        if (i == 108) {
            eoVar.z();
            b59 b59 = eoVar.x0;
            if (b59 != null) {
                b59.t(true);
            }
        } else {
            eoVar.getClass();
        }
        return true;
    }

    public final void onPanelClosed(int i, Menu menu) {
        if (this.v) {
            this.a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        eo eoVar = this.w;
        if (i == 108) {
            eoVar.z();
            b59 b59 = eoVar.x0;
            if (b59 != null) {
                b59.t(false);
            }
        } else if (i == 0) {
            co y = eoVar.y(i);
            if (y.m) {
                eoVar.r(y, false);
            }
        } else {
            eoVar.getClass();
        }
    }

    public final void onPointerCaptureChanged(boolean z) {
        kng.a(this.a, z);
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        m69 m69 = menu instanceof m69 ? (m69) menu : null;
        if (i == 0 && m69 == null) {
            return false;
        }
        if (m69 != null) {
            m69.G0 = true;
        }
        z3a z3a = this.b;
        if (z3a != null && i == 0) {
            jmf jmf = (jmf) z3a.b;
            if (!jmf.z) {
                jmf.w.l = true;
                jmf.z = true;
            }
        }
        boolean onPreparePanel = this.a.onPreparePanel(i, view, menu);
        if (m69 != null) {
            m69.G0 = false;
        }
        return onPreparePanel;
    }

    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        m69 m69 = this.w.y(0).h;
        if (m69 != null) {
            d(list, m69, i);
        } else {
            d(list, menu, i);
        }
    }

    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return ing.a(this.a, searchEvent);
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.a.onWindowAttributesChanged(layoutParams);
    }

    public final void onWindowFocusChanged(boolean z) {
        this.a.onWindowFocusChanged(z);
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [qpg, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v11, types: [b8, zie, java.lang.Object, k69] */
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        eo eoVar = this.w;
        eoVar.getClass();
        if (i != 0) {
            return ing.b(this.a, callback, i);
        }
        Context context = eoVar.Y;
        ? obj = new Object();
        obj.b = context;
        obj.a = callback;
        obj.c = new ArrayList();
        obj.o = new qae();
        b8 b8Var = eoVar.D0;
        if (b8Var != null) {
            b8Var.a();
        }
        p7d p7d = new p7d(eoVar, obj, false, 2);
        eoVar.z();
        b59 b59 = eoVar.x0;
        if (b59 != null) {
            eoVar.D0 = b59.b0(p7d);
        }
        if (eoVar.D0 == null) {
            ecg ecg = eoVar.H0;
            if (ecg != null) {
                ecg.b();
            }
            b8 b8Var2 = eoVar.D0;
            if (b8Var2 != null) {
                b8Var2.a();
            }
            if (eoVar.w0 != null) {
                boolean z = eoVar.Z0;
            }
            if (eoVar.E0 == null) {
                boolean z2 = eoVar.R0;
                Context context2 = eoVar.Y;
                if (z2) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(hdc.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context2.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        kx3 kx3 = new kx3(context2, 0);
                        kx3.getTheme().setTo(newTheme);
                        context2 = kx3;
                    }
                    eoVar.E0 = new ActionBarContextView(context2, (AttributeSet) null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, hdc.actionModePopupWindowStyle);
                    eoVar.F0 = popupWindow;
                    trb.d(popupWindow, 2);
                    eoVar.F0.setContentView(eoVar.E0);
                    eoVar.F0.setWidth(-1);
                    context2.getTheme().resolveAttribute(hdc.actionBarSize, typedValue, true);
                    eoVar.E0.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    eoVar.F0.setHeight(-2);
                    eoVar.G0 = new sn(eoVar, 1);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) eoVar.J0.findViewById(egc.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        eoVar.z();
                        b59 b592 = eoVar.x0;
                        Context G = b592 != null ? b592.G() : null;
                        if (G != null) {
                            context2 = G;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        eoVar.E0 = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (eoVar.E0 != null) {
                ecg ecg2 = eoVar.H0;
                if (ecg2 != null) {
                    ecg2.b();
                }
                eoVar.E0.e();
                Context context3 = eoVar.E0.getContext();
                ActionBarContextView actionBarContextView = eoVar.E0;
                ? obj2 = new Object();
                obj2.c = context3;
                obj2.o = actionBarContextView;
                obj2.v = p7d;
                m69 m69 = new m69(actionBarContextView.getContext());
                m69.Z = 1;
                obj2.y = m69;
                m69.v = obj2;
                if (((a8) p7d.b).k(obj2, m69)) {
                    obj2.g();
                    eoVar.E0.c(obj2);
                    eoVar.D0 = obj2;
                    if (eoVar.I0 && (viewGroup = eoVar.J0) != null && viewGroup.isLaidOut()) {
                        eoVar.E0.setAlpha(c44.DEFAULT_ASPECT_RATIO);
                        ecg a2 = gag.a(eoVar.E0);
                        a2.a(1.0f);
                        eoVar.H0 = a2;
                        a2.d(new tn(1, eoVar));
                    } else {
                        eoVar.E0.setAlpha(1.0f);
                        eoVar.E0.setVisibility(0);
                        if (eoVar.E0.getParent() instanceof View) {
                            WeakHashMap weakHashMap = gag.a;
                            t9g.c((View) eoVar.E0.getParent());
                        }
                    }
                    if (eoVar.F0 != null) {
                        eoVar.Z.getDecorView().post(eoVar.G0);
                    }
                } else {
                    eoVar.D0 = null;
                }
            }
            eoVar.H();
            eoVar.D0 = eoVar.D0;
        }
        eoVar.H();
        b8 b8Var3 = eoVar.D0;
        if (b8Var3 != null) {
            return obj.j(b8Var3);
        }
        return null;
    }

    public final boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
