package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: kx4  reason: default package */
public final class kx4 extends p65 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final xu3 i = new xu3(5, (Object) this);
    public final i23 j = new i23(1, this);
    public final rt3 k = new rt3(19, (Object) this);
    public boolean l;
    public boolean m;
    public boolean n;
    public long o = LongCompanionObject.MAX_VALUE;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    public kx4(o65 o65) {
        super(o65);
        this.f = ld8.n0(edc.motionDurationShort3, 67, o65.getContext());
        this.e = ld8.n0(edc.motionDurationShort3, 50, o65.getContext());
        this.g = ld8.o0(o65.getContext(), edc.motionEasingLinearInterpolator, xg.a);
    }

    public final void a() {
        if (this.p.isTouchExplorationEnabled() && q8.t(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new ne4(9, this));
    }

    public final int c() {
        return ymc.exposed_dropdown_menu_content_description;
    }

    public final int d() {
        return qfc.mtrl_dropdown_arrow;
    }

    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    public final View.OnClickListener f() {
        return this.i;
    }

    public final rt3 h() {
        return this.k;
    }

    public final boolean i(int i2) {
        return i2 != 0;
    }

    public final boolean j() {
        return this.l;
    }

    public final boolean l() {
        return this.n;
    }

    public final void m(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.h = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new ng1(3, this));
            this.h.setOnDismissListener(new jx4(this));
            this.h.setThreshold(0);
            TextInputLayout textInputLayout = this.a;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!q8.t(editText) && this.p.isTouchExplorationEnabled()) {
                WeakHashMap weakHashMap = gag.a;
                this.d.setImportantForAccessibility(2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public final void n(g4 g4Var) {
        if (!q8.t(this.h)) {
            g4Var.h(Spinner.class.getName());
        }
        AccessibilityNodeInfo accessibilityNodeInfo = g4Var.a;
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText((CharSequence) null);
        }
    }

    public final void o(AccessibilityEvent accessibilityEvent) {
        if (this.p.isEnabled() && !q8.t(this.h)) {
            boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z) {
                u();
                this.m = true;
                this.o = System.currentTimeMillis();
            }
        }
    }

    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
        TimeInterpolator timeInterpolator = this.g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration((long) this.f);
        ofFloat.addUpdateListener(new z00(9, (Object) this));
        this.r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, c44.DEFAULT_ASPECT_RATIO});
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration((long) this.e);
        ofFloat2.addUpdateListener(new z00(9, (Object) this));
        this.q = ofFloat2;
        ofFloat2.addListener(new z6(4, (Object) this));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
            this.h.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
        }
    }

    public final void t(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void u() {
        if (this.h != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.o;
            if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                this.m = false;
            }
            if (!this.m) {
                t(!this.n);
                if (this.n) {
                    this.h.requestFocus();
                    this.h.showDropDown();
                    return;
                }
                this.h.dismissDropDown();
                return;
            }
            this.m = false;
        }
    }
}
