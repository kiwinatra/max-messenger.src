package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: ze7  reason: default package */
public final class ze7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TextView o;
    public final /* synthetic */ bf7 v;

    public ze7(bf7 bf7, int i, TextView textView, int i2, TextView textView2) {
        this.v = bf7;
        this.a = i;
        this.b = textView;
        this.c = i2;
        this.o = textView2;
    }

    public final void onAnimationEnd(Animator animator) {
        AppCompatTextView appCompatTextView;
        int i = this.a;
        bf7 bf7 = this.v;
        bf7.n = i;
        bf7.l = null;
        TextView textView = this.b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.c == 1 && (appCompatTextView = bf7.r) != null) {
                appCompatTextView.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.o;
        if (textView2 != null) {
            textView2.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
            textView2.setAlpha(1.0f);
        }
    }

    public final void onAnimationStart(Animator animator) {
        TextView textView = this.o;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(c44.DEFAULT_ASPECT_RATIO);
        }
    }
}
