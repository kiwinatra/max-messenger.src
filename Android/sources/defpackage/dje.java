package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

/* renamed from: dje  reason: default package */
public final class dje extends a79 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public static final int E0 = vjc.abc_popup_menu_item_layout;
    public boolean A0;
    public int B0;
    public int C0 = 0;
    public boolean D0;
    public final ro X = new ro(4, this);
    public final el Y = new el(8, this);
    public PopupWindow.OnDismissListener Z;
    public final Context b;
    public final m69 c;
    public final j69 o;
    public final boolean v;
    public View v0;
    public final int w;
    public View w0;
    public final int x;
    public h79 x0;
    public final int y;
    public ViewTreeObserver y0;
    public final g79 z;
    public boolean z0;

    /* JADX WARNING: type inference failed for: r8v1, types: [sz7, g79] */
    public dje(int i, int i2, m69 m69, Context context, View view, boolean z2) {
        this.b = context;
        this.c = m69;
        this.v = z2;
        this.o = new j69(m69, LayoutInflater.from(context), z2, E0);
        this.x = i;
        this.y = i2;
        Resources resources = context.getResources();
        this.w = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(nec.abc_config_prefDialogWidth));
        this.v0 = view;
        this.z = new sz7(context, (AttributeSet) null, i, i2);
        m69.b(this, context);
    }

    public final boolean a() {
        return !this.z0 && this.z.I0.isShowing();
    }

    public final void b() {
        View view;
        if (!a()) {
            if (this.z0 || (view = this.v0) == null) {
                throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
            }
            this.w0 = view;
            g79 g79 = this.z;
            g79.I0.setOnDismissListener(this);
            g79.y0 = this;
            g79.H0 = true;
            g79.I0.setFocusable(true);
            View view2 = this.w0;
            boolean z2 = this.y0 == null;
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.y0 = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.X);
            }
            view2.addOnAttachStateChangeListener(this.Y);
            g79.x0 = view2;
            g79.Z = this.C0;
            boolean z3 = this.A0;
            Context context = this.b;
            j69 j69 = this.o;
            if (!z3) {
                this.B0 = a79.l(j69, context, this.w);
                this.A0 = true;
            }
            g79.r(this.B0);
            g79.I0.setInputMethodMode(2);
            Rect rect = this.a;
            g79.G0 = rect != null ? new Rect(rect) : null;
            g79.b();
            ax4 ax4 = g79.c;
            ax4.setOnKeyListener(this);
            if (this.D0) {
                m69 m69 = this.c;
                if (m69.v0 != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(vjc.abc_popup_menu_header_item_layout, ax4, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(m69.v0);
                    }
                    frameLayout.setEnabled(false);
                    ax4.addHeaderView(frameLayout, (Object) null, false);
                }
            }
            g79.p(j69);
            g79.b();
        }
    }

    public final boolean c(lye lye) {
        if (lye.hasVisibleItems()) {
            View view = this.w0;
            c79 c79 = new c79(this.x, this.y, lye, this.b, view, this.v);
            h79 h79 = this.x0;
            c79.i = h79;
            a79 a79 = c79.j;
            if (a79 != null) {
                a79.f(h79);
            }
            boolean u = a79.u(lye);
            c79.h = u;
            a79 a792 = c79.j;
            if (a792 != null) {
                a792.o(u);
            }
            c79.k = this.Z;
            this.Z = null;
            this.c.c(false);
            g79 g79 = this.z;
            int i = g79.w;
            int o2 = g79.o();
            if ((Gravity.getAbsoluteGravity(this.C0, this.v0.getLayoutDirection()) & 7) == 5) {
                i += this.v0.getWidth();
            }
            if (!c79.b()) {
                if (c79.f != null) {
                    c79.d(i, o2, true, true);
                }
            }
            h79 h792 = this.x0;
            if (h792 != null) {
                h792.a0(lye);
            }
            return true;
        }
        return false;
    }

    public final boolean d() {
        return false;
    }

    public final void dismiss() {
        if (a()) {
            this.z.dismiss();
        }
    }

    public final void f(h79 h79) {
        this.x0 = h79;
    }

    public final void h() {
        this.A0 = false;
        j69 j69 = this.o;
        if (j69 != null) {
            j69.notifyDataSetChanged();
        }
    }

    public final ax4 i() {
        return this.z.c;
    }

    public final void k(m69 m69) {
    }

    public final void m(m69 m69, boolean z2) {
        if (m69 == this.c) {
            dismiss();
            h79 h79 = this.x0;
            if (h79 != null) {
                h79.m(m69, z2);
            }
        }
    }

    public final void n(View view) {
        this.v0 = view;
    }

    public final void o(boolean z2) {
        this.o.c = z2;
    }

    public final void onDismiss() {
        this.z0 = true;
        this.c.c(true);
        ViewTreeObserver viewTreeObserver = this.y0;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.y0 = this.w0.getViewTreeObserver();
            }
            this.y0.removeGlobalOnLayoutListener(this.X);
            this.y0 = null;
        }
        this.w0.removeOnAttachStateChangeListener(this.Y);
        PopupWindow.OnDismissListener onDismissListener = this.Z;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void p(int i) {
        this.C0 = i;
    }

    public final void q(int i) {
        this.z.w = i;
    }

    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.Z = onDismissListener;
    }

    public final void s(boolean z2) {
        this.D0 = z2;
    }

    public final void t(int i) {
        this.z.k(i);
    }
}
