package defpackage;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: p65  reason: default package */
public abstract class p65 {
    public final TextInputLayout a;
    public final o65 b;
    public final Context c;
    public final CheckableImageButton d;

    public p65(o65 o65) {
        this.a = o65.a;
        this.b = o65;
        this.c = o65.getContext();
        this.d = o65.x;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public rt3 h() {
        return null;
    }

    public boolean i(int i) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof kx4;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void n(g4 g4Var) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z) {
    }

    public final void q() {
        this.b.f(false);
    }

    public void r() {
    }

    public void s() {
    }
}
