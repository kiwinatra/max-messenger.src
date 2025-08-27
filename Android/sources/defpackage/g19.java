package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* renamed from: g19  reason: default package */
public final class g19 extends LinearLayout implements phf {
    public boolean a;
    public x19 b;
    public final AppCompatImageView c;
    public final AppCompatTextView o;

    public g19(Context context) {
        super(context, (AttributeSet) null, 0);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        float f = (float) 4;
        int roundToInt = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        appCompatImageView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
        appCompatImageView.setLayoutParams(layoutParams);
        this.c = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setMaxWidth(MathKt.roundToInt(((float) 72) * vo4.c().getDisplayMetrics().density));
        puf.r.b(appCompatTextView, uy4.b);
        this.o = appCompatTextView;
        setId(lra.x);
        setOrientation(1);
        setGravity(1);
        setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        float f2 = (float) 6;
        setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density), getPaddingBottom());
        addView(appCompatImageView);
        addView(appCompatTextView);
        a();
    }

    public final void a() {
        boolean z = this.a;
        AppCompatImageView appCompatImageView = this.c;
        js9 js9 = fu4.k;
        AppCompatTextView appCompatTextView = this.o;
        if (z) {
            appCompatTextView.setTextColor(js9.e(getContext()).f().getText().e);
            appCompatImageView.setColorFilter(js9.e(getContext()).f().getIcon().f);
            return;
        }
        appCompatTextView.setTextColor(js9.e(getContext()).f().getText().f);
        appCompatImageView.setColorFilter(js9.e(getContext()).f().getIcon().i);
    }

    public final x19 getState() {
        return this.b;
    }

    public final void onThemeChanged(k2b k2b) {
        a();
    }

    public final void setIsSelected(boolean z) {
        this.a = z;
        a();
    }

    public final void setState(x19 x19) {
        int i;
        int i2;
        this.b = x19;
        AppCompatTextView appCompatTextView = this.o;
        u19 u19 = u19.a;
        boolean areEqual = Intrinsics.areEqual((Object) x19, (Object) u19);
        t19 t19 = t19.a;
        s19 s19 = s19.a;
        v19 v19 = v19.a;
        w19 w19 = w19.a;
        if (areEqual) {
            i = mra.I;
        } else if (Intrinsics.areEqual((Object) x19, (Object) w19)) {
            i = mra.K;
        } else if (Intrinsics.areEqual((Object) x19, (Object) v19)) {
            i = mra.T;
        } else if (Intrinsics.areEqual((Object) x19, (Object) s19)) {
            i = mra.C;
        } else if (Intrinsics.areEqual((Object) x19, (Object) t19)) {
            i = mra.D;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        appCompatTextView.setText(i);
        AppCompatImageView appCompatImageView = this.c;
        if (Intrinsics.areEqual((Object) x19, (Object) u19)) {
            i2 = kra.m;
        } else if (Intrinsics.areEqual((Object) x19, (Object) w19)) {
            i2 = kra.o;
        } else if (Intrinsics.areEqual((Object) x19, (Object) v19)) {
            i2 = kra.b;
        } else if (Intrinsics.areEqual((Object) x19, (Object) s19)) {
            i2 = kra.n;
        } else if (Intrinsics.areEqual((Object) x19, (Object) t19)) {
            i2 = kra.a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        appCompatImageView.setImageResource(i2);
    }
}
