package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.sdk.lists.widgets.EndlessRecyclerView;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;

/* renamed from: w0f  reason: default package */
public final /* synthetic */ class w0f implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SuggestionsWidget b;

    public /* synthetic */ w0f(SuggestionsWidget suggestionsWidget, int i) {
        this.a = i;
        this.b = suggestionsWidget;
    }

    public final Object invoke() {
        js9 js9 = fu4.k;
        SuggestionsWidget suggestionsWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = SuggestionsWidget.z0;
                return new m0f(suggestionsWidget, ((aua) wqg.a.getAccessor().h(aua.class).getValue()).b());
            case 1:
                KProperty[] kPropertyArr2 = SuggestionsWidget.z0;
                FrameLayout frameLayout = new FrameLayout(suggestionsWidget.getContext());
                frameLayout.setId(xya.D);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(MathKt.roundToInt(((float) 36) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 5) * vo4.c().getDisplayMetrics().density));
                layoutParams.gravity = 49;
                layoutParams.topMargin = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
                frameLayout.setLayoutParams(layoutParams);
                frameLayout.setOutlineProvider(new n04(vo4.c().getDisplayMetrics().density * 40.0f));
                frameLayout.setBackgroundColor(js9.e(frameLayout.getContext()).f().getIcon().g);
                return frameLayout;
            case 2:
                KProperty[] kPropertyArr3 = SuggestionsWidget.z0;
                EndlessRecyclerView endlessRecyclerView = new EndlessRecyclerView(suggestionsWidget.getContext(), (AttributeSet) null);
                endlessRecyclerView.setId(xya.F);
                endlessRecyclerView.setClipToPadding(false);
                endlessRecyclerView.setLayoutParams(new fj3(-1, -2));
                endlessRecyclerView.getContext();
                endlessRecyclerView.setLayoutManager(new LinearLayoutManager());
                endlessRecyclerView.setPager(new k71(12, suggestionsWidget));
                endlessRecyclerView.setThreshold(3);
                return endlessRecyclerView;
            case 3:
                KProperty[] kPropertyArr4 = SuggestionsWidget.z0;
                AppCompatImageView appCompatImageView = new AppCompatImageView(suggestionsWidget.getContext(), (AttributeSet) null);
                appCompatImageView.setId(xya.z);
                float f = (float) 44;
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
                layoutParams2.gravity = 19;
                appCompatImageView.setLayoutParams(layoutParams2);
                int roundToInt = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
                appCompatImageView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
                appCompatImageView.setImageResource(lya.c);
                appCompatImageView.setImageTintList(ColorStateList.valueOf(js9.e(appCompatImageView.getContext()).f().getIcon().f));
                ct.G(appCompatImageView, 300, new dte(1, suggestionsWidget));
                int i = js9.e(appCompatImageView.getContext()).f().b().a.f;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(-1);
                appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, shapeDrawable));
                return appCompatImageView;
            case 4:
                KProperty[] kPropertyArr5 = SuggestionsWidget.z0;
                AppCompatTextView appCompatTextView = new AppCompatTextView(suggestionsWidget.getContext(), (AttributeSet) null);
                appCompatTextView.setId(xya.G);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, MathKt.roundToInt(((float) 44) * vo4.c().getDisplayMetrics().density));
                layoutParams3.gravity = 17;
                appCompatTextView.setLayoutParams(layoutParams3);
                puf.z.b(appCompatTextView, uy4.b);
                appCompatTextView.setGravity(17);
                appCompatTextView.setTextColor(js9.e(appCompatTextView.getContext()).f().getText().e);
                appCompatTextView.setText(yya.r);
                appCompatTextView.setMaxLines(1);
                appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                return appCompatTextView;
            case 5:
                KProperty[] kPropertyArr6 = SuggestionsWidget.z0;
                FrameLayout frameLayout2 = new FrameLayout(suggestionsWidget.getContext());
                frameLayout2.setId(xya.A);
                KProperty[] kPropertyArr7 = SuggestionsWidget.z0;
                KProperty kProperty = kPropertyArr7[4];
                frameLayout2.addView((AppCompatImageView) suggestionsWidget.v0.getValue());
                KProperty kProperty2 = kPropertyArr7[5];
                frameLayout2.addView((AppCompatTextView) suggestionsWidget.w0.getValue());
                frameLayout2.setVisibility(8);
                h88.g(frameLayout2);
                return frameLayout2;
            default:
                KProperty[] kPropertyArr8 = SuggestionsWidget.z0;
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(suggestionsWidget.getContext(), (AttributeSet) null);
                appCompatTextView2.setId(xya.C);
                appCompatTextView2.setLayoutParams(new fj3(-2, -2));
                puf.m.b(appCompatTextView2, uy4.b);
                appCompatTextView2.setTextColor(js9.e(appCompatTextView2.getContext()).f().getText().g);
                appCompatTextView2.setText(yya.q);
                appCompatTextView2.setMaxLines(1);
                appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                appCompatTextView2.setVisibility(8);
                float f2 = (float) 16;
                appCompatTextView2.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), 0, MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density), 0);
                h88.g(appCompatTextView2);
                return appCompatTextView2;
        }
    }
}
