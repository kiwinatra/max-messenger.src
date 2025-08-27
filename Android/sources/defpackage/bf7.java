package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: bf7  reason: default package */
public final class bf7 {
    public ColorStateList A;
    public Typeface B;
    public final int a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    public final Context g;
    public final TextInputLayout h;
    public LinearLayout i;
    public int j;
    public FrameLayout k;
    public Animator l;
    public final float m;
    public int n;
    public int o;
    public CharSequence p;
    public boolean q;
    public AppCompatTextView r;
    public CharSequence s;
    public int t;
    public int u;
    public ColorStateList v;
    public CharSequence w;
    public boolean x;
    public AppCompatTextView y;
    public int z;

    public bf7(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.g = context;
        this.h = textInputLayout;
        this.m = (float) context.getResources().getDimensionPixelSize(iec.design_textinput_caption_translate_y);
        this.a = ld8.n0(edc.motionDurationShort4, 217, context);
        this.b = ld8.n0(edc.motionDurationMedium4, 167, context);
        this.c = ld8.n0(edc.motionDurationShort4, 167, context);
        this.d = ld8.o0(context, edc.motionEasingEmphasizedDecelerateInterpolator, xg.d);
        int i2 = edc.motionEasingEmphasizedDecelerateInterpolator;
        LinearInterpolator linearInterpolator = xg.a;
        this.e = ld8.o0(context, i2, linearInterpolator);
        this.f = ld8.o0(context, edc.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(TextView textView, int i2) {
        if (this.i == null && this.k == null) {
            Context context = this.g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.k = new FrameLayout(context);
            this.i.addView(this.k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i2 == 0 || i2 == 1) {
            this.k.setVisibility(0);
            this.k.addView(textView);
        } else {
            this.i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.g;
                boolean K = m5a.K(context);
                LinearLayout linearLayout = this.i;
                int i2 = iec.material_helper_text_font_1_3_padding_horizontal;
                WeakHashMap weakHashMap = gag.a;
                int paddingStart = editText.getPaddingStart();
                if (K) {
                    paddingStart = context.getResources().getDimensionPixelSize(i2);
                }
                int i3 = iec.material_helper_text_font_1_3_padding_top;
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(iec.material_helper_text_default_padding_top);
                if (K) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(i3);
                }
                int i4 = iec.material_helper_text_font_1_3_padding_horizontal;
                int paddingEnd = editText.getPaddingEnd();
                if (K) {
                    paddingEnd = context.getResources().getDimensionPixelSize(i4);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        Animator animator = this.l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z2, TextView textView, int i2, int i3, int i4) {
        if (textView != null && z2) {
            if (i2 == i4 || i2 == i3) {
                boolean z3 = i4 == i2;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z3 ? 1.0f : 0.0f});
                int i5 = this.c;
                ofFloat.setDuration(z3 ? (long) this.b : (long) i5);
                ofFloat.setInterpolator(z3 ? this.e : this.f);
                if (i2 == i4 && i3 != 0) {
                    ofFloat.setStartDelay((long) i5);
                }
                arrayList.add(ofFloat);
                if (i4 == i2 && i3 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.m, 0.0f});
                    ofFloat2.setDuration((long) this.a);
                    ofFloat2.setInterpolator(this.d);
                    ofFloat2.setStartDelay((long) i5);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final TextView e(int i2) {
        if (i2 == 1) {
            return this.r;
        }
        if (i2 != 2) {
            return null;
        }
        return this.y;
    }

    public final void f() {
        this.p = null;
        c();
        if (this.n == 1) {
            if (!this.x || TextUtils.isEmpty(this.w)) {
                this.o = 0;
            } else {
                this.o = 2;
            }
        }
        i(this.n, this.o, h(this.r, ""));
    }

    public final void g(TextView textView, int i2) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout != null) {
            if ((i2 == 0 || i2 == 1) && (frameLayout = this.k) != null) {
                frameLayout.removeView(textView);
            } else {
                linearLayout.removeView(textView);
            }
            int i3 = this.j - 1;
            this.j = i3;
            LinearLayout linearLayout2 = this.i;
            if (i3 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    public final boolean h(TextView textView, CharSequence charSequence) {
        WeakHashMap weakHashMap = gag.a;
        TextInputLayout textInputLayout = this.h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && (this.o != this.n || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    public final void i(int i2, int i3, boolean z2) {
        TextView e2;
        TextView e3;
        int i4 = i2;
        int i5 = i3;
        boolean z3 = z2;
        if (i4 != i5) {
            if (z3) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.l = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i6 = i2;
                int i7 = i3;
                d(arrayList2, this.x, this.y, 2, i6, i7);
                d(arrayList2, this.q, this.r, 1, i6, i7);
                cjf.M(animatorSet, arrayList);
                animatorSet.addListener(new ze7(this, i3, e(i2), i2, e(i5)));
                animatorSet.start();
            } else if (i4 != i5) {
                if (!(i5 == 0 || (e3 = e(i5)) == null)) {
                    e3.setVisibility(0);
                    e3.setAlpha(1.0f);
                }
                if (!(i4 == 0 || (e2 = e(i2)) == null)) {
                    e2.setVisibility(4);
                    if (i4 == 1) {
                        e2.setText((CharSequence) null);
                    }
                }
                this.n = i5;
            }
            TextInputLayout textInputLayout = this.h;
            textInputLayout.r();
            textInputLayout.u(z3, false);
            textInputLayout.x();
        }
    }
}
