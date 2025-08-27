package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;

/* renamed from: iza  reason: default package */
public final /* synthetic */ class iza implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ AttributeSet c;
    public final /* synthetic */ pza o;

    public /* synthetic */ iza(Context context, AttributeSet attributeSet, pza pza, int i) {
        this.a = i;
        this.b = context;
        this.c = attributeSet;
        this.o = pza;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                AppCompatImageView appCompatImageView = new AppCompatImageView(this.b, this.c);
                appCompatImageView.setId(dad.q0);
                int roundToInt = MathKt.roundToInt(((float) 30) * vo4.c().getDisplayMetrics().density);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(roundToInt, roundToInt);
                layoutParams.gravity = 8388627;
                pza pza = this.o;
                layoutParams.leftMargin = pza.c;
                appCompatImageView.setLayoutParams(layoutParams);
                int roundToInt2 = MathKt.roundToInt(((float) 1) * vo4.c().getDisplayMetrics().density);
                appCompatImageView.setPadding(roundToInt2, roundToInt2, roundToInt2, roundToInt2);
                appCompatImageView.setImageResource(cad.d0);
                appCompatImageView.setImageTintList(ColorStateList.valueOf(fu4.k.e(appCompatImageView.getContext()).f().getIcon().f));
                ct.G(appCompatImageView, 300, new jza(pza, 1));
                pza.addView(appCompatImageView);
                return appCompatImageView;
            case 1:
                AppCompatEditText appCompatEditText = new AppCompatEditText(this.b, this.c);
                appCompatEditText.setId(dad.r0);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(0, -2);
                layoutParams2.gravity = 8388629;
                pza pza2 = this.o;
                int b2 = g63.b((float) 30, vo4.c().getDisplayMetrics().density, pza2.c);
                int i = pza2.c;
                layoutParams2.leftMargin = b2 + i;
                int i2 = pza2.a;
                layoutParams2.topMargin = i2;
                layoutParams2.bottomMargin = i2;
                appCompatEditText.setLayoutParams(layoutParams2);
                appCompatEditText.setClipToOutline(true);
                appCompatEditText.setOutlineProvider(new n04((float) MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density)));
                appCompatEditText.setImeOptions(3);
                appCompatEditText.setText(pza2.o);
                int roundToInt3 = MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density);
                int i3 = pza2.b;
                appCompatEditText.setPadding(i, i3, roundToInt3, i3);
                js9 js9 = fu4.k;
                appCompatEditText.setBackgroundColor(js9.e(appCompatEditText.getContext()).f().c().a.g);
                puf.k.b(appCompatEditText, uy4.b);
                Drawable textCursorDrawable = appCompatEditText.getTextCursorDrawable();
                if (textCursorDrawable != null) {
                    js9.e(appCompatEditText.getContext()).f().getText().getClass();
                    iq.a0(textCursorDrawable, -16745729);
                }
                appCompatEditText.setHintTextColor(js9.e(appCompatEditText.getContext()).f().getText().f);
                appCompatEditText.setTextColor(js9.e(appCompatEditText.getContext()).f().getText().e);
                appCompatEditText.setSingleLine();
                appCompatEditText.setOnEditorActionListener(new n3a(1, appCompatEditText));
                u3b.a(appCompatEditText, new u24(appCompatEditText, appCompatEditText, 1));
                appCompatEditText.addTextChangedListener(new u2(11, pza2));
                pza2.addView(appCompatEditText);
                return appCompatEditText;
            case 2:
                AppCompatImageView appCompatImageView2 = new AppCompatImageView(this.b, this.c);
                appCompatImageView2.setId(dad.t0);
                int roundToInt4 = MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(roundToInt4, roundToInt4);
                layoutParams3.gravity = 8388629;
                appCompatImageView2.setLayoutParams(layoutParams3);
                int roundToInt5 = MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density);
                appCompatImageView2.setPadding(roundToInt5, roundToInt5, roundToInt5, roundToInt5);
                appCompatImageView2.setImageResource(cad.R0);
                appCompatImageView2.setImageTintList(ColorStateList.valueOf(fu4.k.e(appCompatImageView2.getContext()).f().getIcon().f));
                pza pza3 = this.o;
                ct.G(appCompatImageView2, 300, new jza(pza3, 0));
                pza3.addView(appCompatImageView2);
                return appCompatImageView2;
            case 3:
                ImageView imageView = new ImageView(this.b, this.c);
                imageView.setId(dad.u0);
                float f = (float) 32;
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
                layoutParams4.gravity = 8388629;
                imageView.setLayoutParams(layoutParams4);
                int roundToInt6 = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
                imageView.setPadding(roundToInt6, roundToInt6, roundToInt6, roundToInt6);
                imageView.setOutlineProvider(new n04(vo4.c().getDisplayMetrics().density * 12.0f));
                imageView.setImageResource(cad.R0);
                pza pza4 = this.o;
                ct.G(imageView, 300, new jza(pza4, 2));
                b0h.H(imageView, new mh0(3, (Continuation) null, 10));
                pza4.addView(imageView);
                return imageView;
            default:
                AppCompatImageView appCompatImageView3 = new AppCompatImageView(this.b, this.c);
                appCompatImageView3.setId(dad.s0);
                int roundToInt7 = MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density);
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(roundToInt7, roundToInt7);
                layoutParams5.gravity = 8388629;
                appCompatImageView3.setLayoutParams(layoutParams5);
                pza pza5 = this.o;
                Editable text = ((AppCompatEditText) pza5.A0.getValue()).getText();
                int i4 = 0;
                if (!(!(text == null || text.length() == 0))) {
                    i4 = 8;
                }
                appCompatImageView3.setVisibility(i4);
                int roundToInt8 = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
                appCompatImageView3.setPadding(roundToInt8, roundToInt8, roundToInt8, roundToInt8);
                appCompatImageView3.setImageResource(cad.o0);
                appCompatImageView3.setImageTintList(ColorStateList.valueOf(fu4.k.e(appCompatImageView3.getContext()).f().getIcon().i));
                ct.G(appCompatImageView3, 300, new jza(pza5, 3));
                pza5.addView(appCompatImageView3);
                return appCompatImageView3;
        }
    }
}
