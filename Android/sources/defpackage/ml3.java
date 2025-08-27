package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: ml3  reason: default package */
public final /* synthetic */ class ml3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ol3 c;

    public /* synthetic */ ml3(Context context, ol3 ol3, int i) {
        this.a = i;
        this.b = context;
        this.c = ol3;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.b, (AttributeSet) null);
                appCompatTextView.setId(dad.C);
                appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                appCompatTextView.setSingleLine();
                appCompatTextView.setTextColor(fu4.k.e(appCompatTextView.getContext()).f().getText().f);
                puf.l.b(appCompatTextView, uy4.b);
                this.c.addView(appCompatTextView, new fj3(0, MathKt.roundToInt(((float) 20) * vo4.c().getDisplayMetrics().density)));
                return appCompatTextView;
            case 1:
                TextView textView = new TextView(this.b);
                textView.setId(dad.x);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setSingleLine();
                textView.setTextColor(fu4.k.e(textView.getContext()).f().getText().f);
                puf.p.b(textView, uy4.b);
                this.c.addView(textView, new fj3(0, MathKt.roundToInt(((float) 20) * vo4.c().getDisplayMetrics().density)));
                return textView;
            case 2:
                OneMeButton oneMeButton = new OneMeButton(this.b, (AttributeSet) null);
                oneMeButton.setId(dad.A);
                oneMeButton.setSize(aqa.b);
                oneMeButton.setMode(zpa.o);
                oneMeButton.setAppearance(xpa.a);
                this.c.addView(oneMeButton, new fj3(-2, -2));
                return oneMeButton;
            case 3:
                AppCompatImageView appCompatImageView = new AppCompatImageView(this.b, (AttributeSet) null);
                appCompatImageView.setId(dad.K);
                appCompatImageView.setImageResource(ffc.videocam_outline_24);
                js9 js9 = fu4.k;
                appCompatImageView.setImageTintList(ColorStateList.valueOf(js9.e(appCompatImageView.getContext()).f().getIcon().f));
                int roundToInt = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
                appCompatImageView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
                int i = js9.e(appCompatImageView.getContext()).f().b().a.b;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(-1);
                appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, shapeDrawable));
                float f = (float) 40;
                this.c.addView(appCompatImageView, new fj3(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
                return appCompatImageView;
            case 4:
                AppCompatImageView appCompatImageView2 = new AppCompatImageView(this.b, (AttributeSet) null);
                appCompatImageView2.setId(dad.y);
                appCompatImageView2.setImageResource(ffc.ic_audio_call_type_24);
                js9 js92 = fu4.k;
                appCompatImageView2.setImageTintList(ColorStateList.valueOf(js92.e(appCompatImageView2.getContext()).f().getIcon().f));
                int roundToInt2 = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
                appCompatImageView2.setPadding(roundToInt2, roundToInt2, roundToInt2, roundToInt2);
                int i2 = js92.e(appCompatImageView2.getContext()).f().b().a.b;
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                shapeDrawable2.getPaint().setColor(-1);
                appCompatImageView2.setBackground(new RippleDrawable(ColorStateList.valueOf(i2), (Drawable) null, shapeDrawable2));
                float f2 = (float) 40;
                this.c.addView(appCompatImageView2, new fj3(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density)));
                return appCompatImageView2;
            default:
                return ol3.L(this.b, this.c);
        }
    }
}
