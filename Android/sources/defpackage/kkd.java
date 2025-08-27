package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.chatscreen.search.SearchMessageBottomWidget;

/* renamed from: kkd  reason: default package */
public final /* synthetic */ class kkd implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchMessageBottomWidget b;

    public /* synthetic */ kkd(SearchMessageBottomWidget searchMessageBottomWidget, int i) {
        this.a = i;
        this.b = searchMessageBottomWidget;
    }

    public final Object invoke() {
        js9 js9 = fu4.k;
        SearchMessageBottomWidget searchMessageBottomWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = SearchMessageBottomWidget.y;
                AppCompatTextView appCompatTextView = new AppCompatTextView(searchMessageBottomWidget.getContext(), (AttributeSet) null);
                appCompatTextView.setId(lra.d);
                appCompatTextView.setMaxLines(1);
                appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                puf.m.b(appCompatTextView, uy4.b);
                appCompatTextView.setTextColor(ColorStateList.valueOf(js9.e(appCompatTextView.getContext()).f().a().f().b.b));
                appCompatTextView.setText(mra.g);
                appCompatTextView.setLayoutParams(new fj3(-2, -2));
                return appCompatTextView;
            case 1:
                KProperty[] kPropertyArr2 = SearchMessageBottomWidget.y;
                AppCompatImageView appCompatImageView = new AppCompatImageView(searchMessageBottomWidget.getContext(), (AttributeSet) null);
                appCompatImageView.setId(lra.g);
                float f = (float) 32;
                appCompatImageView.setLayoutParams(new fj3(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
                appCompatImageView.setImageResource(kra.d);
                appCompatImageView.setImageTintList(ColorStateList.valueOf(js9.e(appCompatImageView.getContext()).f().a().f().b.b));
                appCompatImageView.setContentDescription(appCompatImageView.getContext().getString(mra.i));
                int roundToInt = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
                appCompatImageView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
                ct.G(appCompatImageView, 300, new lkd(searchMessageBottomWidget, 1));
                int i = js9.e(appCompatImageView.getContext()).f().b().a.f;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(-1);
                appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, shapeDrawable));
                return appCompatImageView;
            case 2:
                KProperty[] kPropertyArr3 = SearchMessageBottomWidget.y;
                AppCompatImageView appCompatImageView2 = new AppCompatImageView(searchMessageBottomWidget.getContext(), (AttributeSet) null);
                appCompatImageView2.setId(lra.e);
                float f2 = (float) 32;
                appCompatImageView2.setLayoutParams(new fj3(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density)));
                appCompatImageView2.setImageResource(kra.c);
                appCompatImageView2.setImageTintList(ColorStateList.valueOf(js9.e(appCompatImageView2.getContext()).f().a().f().b.b));
                appCompatImageView2.setContentDescription(appCompatImageView2.getContext().getString(mra.f));
                int roundToInt2 = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
                appCompatImageView2.setPadding(roundToInt2, roundToInt2, roundToInt2, roundToInt2);
                ct.G(appCompatImageView2, 300, new lkd(searchMessageBottomWidget, 0));
                int i2 = js9.e(appCompatImageView2.getContext()).f().b().a.f;
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                shapeDrawable2.getPaint().setColor(-1);
                appCompatImageView2.setBackground(new RippleDrawable(ColorStateList.valueOf(i2), (Drawable) null, shapeDrawable2));
                return appCompatImageView2;
            default:
                KProperty[] kPropertyArr4 = SearchMessageBottomWidget.y;
                View view = new View(searchMessageBottomWidget.getContext());
                view.setId(lra.f);
                view.setLayoutParams(new fj3(MathKt.roundToInt(((float) 1) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 18) * vo4.c().getDisplayMetrics().density)));
                view.setBackgroundColor(js9.e(view.getContext()).f().a().f().b.b);
                return view;
        }
    }
}
