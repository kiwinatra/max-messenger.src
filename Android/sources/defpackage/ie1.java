package defpackage;

import android.animation.StateListAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.sdk.uikit.common.emptyview.OneMeEmptyView;

/* renamed from: ie1  reason: default package */
public final /* synthetic */ class ie1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallOpponentsListWidget b;

    public /* synthetic */ ie1(CallOpponentsListWidget callOpponentsListWidget, int i) {
        this.a = i;
        this.b = callOpponentsListWidget;
    }

    public final Object invoke() {
        CallOpponentsListWidget callOpponentsListWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = CallOpponentsListWidget.B0;
                return te8.m(callOpponentsListWidget.getContext());
            case 1:
                KProperty[] kPropertyArr2 = CallOpponentsListWidget.B0;
                Drawable b2 = ew3.b(callOpponentsListWidget.getContext(), pec.ic_clear_16);
                b2.setTint(l2b.i.f);
                return b2;
            case 2:
                KProperty[] kPropertyArr3 = CallOpponentsListWidget.B0;
                LinearLayout linearLayout = new LinearLayout(callOpponentsListWidget.getContext());
                f53 f53 = new f53(-1, -2);
                f53.a = 2;
                linearLayout.setLayoutParams(f53);
                linearLayout.setOrientation(1);
                return linearLayout;
            case 3:
                KProperty[] kPropertyArr4 = CallOpponentsListWidget.B0;
                return new u2b((d3b) null, new b3b(pqa.k, 0, new je1(callOpponentsListWidget, 1), 14));
            case 4:
                KProperty[] kPropertyArr5 = CallOpponentsListWidget.B0;
                h3b d = o54.d(callOpponentsListWidget.getContext(), (AttributeSet) null);
                d.setForm(z2b.a);
                d.setTextShimmerEnabled(false);
                d.setLeftActions(new p2b(new je1(callOpponentsListWidget, 0)));
                float f = (float) 6;
                d.setPaddingRelative(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), d.getPaddingTop(), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), d.getPaddingBottom());
                d.setCustomTheme(l2b.a);
                return d;
            case 5:
                KProperty[] kPropertyArr6 = CallOpponentsListWidget.B0;
                iqa iqa = new iqa(callOpponentsListWidget.getContext());
                iqa.setId(qqa.a0);
                wz3 wz3 = new wz3(-1, -2);
                float f2 = (float) 12;
                wz3.setMarginStart(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
                wz3.setMarginEnd(MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
                iqa.setLayoutParams(wz3);
                iqa.setListener(new d9d(20, callOpponentsListWidget));
                return iqa;
            case 6:
                KProperty[] kPropertyArr7 = CallOpponentsListWidget.B0;
                RecyclerView recyclerView = new RecyclerView(callOpponentsListWidget.getContext(), (AttributeSet) null);
                recyclerView.setId(kgc.call_user_list_in_call_list);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setAdapter((yd1) callOpponentsListWidget.z0.getValue());
                recyclerView.setClipToPadding(true);
                recyclerView.setBackgroundColor(l2b.d.i);
                wz3 wz32 = new wz3(-1, -1);
                wz32.b(new AppBarLayout.ScrollingViewBehavior());
                recyclerView.setLayoutParams(wz32);
                return recyclerView;
            case 7:
                KProperty[] kPropertyArr8 = CallOpponentsListWidget.B0;
                TextView textView = new TextView(callOpponentsListWidget.getContext());
                puf.z.b(textView, uy4.b);
                textView.setTextColor(l2b.i.e);
                textView.setMaxLines(3);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(17);
                float f3 = (float) 20;
                textView.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                float f4 = (float) 28;
                layoutParams.setMarginStart(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4));
                layoutParams.setMarginEnd(MathKt.roundToInt(f4 * vo4.c().getDisplayMetrics().density));
                textView.setLayoutParams(layoutParams);
                return textView;
            case 8:
                KProperty[] kPropertyArr9 = CallOpponentsListWidget.B0;
                TextView textView2 = new TextView(callOpponentsListWidget.getContext());
                puf.o.b(textView2, uy4.b);
                textView2.setTextColor(l2b.i.f);
                textView2.setMaxLines(1);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setGravity(17);
                float f5 = (float) 12;
                textView2.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f5), MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f5 * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 18) * vo4.c().getDisplayMetrics().density));
                textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return textView2;
            case 9:
                KProperty[] kPropertyArr10 = CallOpponentsListWidget.B0;
                TextView textView3 = new TextView(callOpponentsListWidget.getContext());
                puf.t.b(textView3, uy4.b);
                textView3.setTextColor(l2b.i.f);
                textView3.setMaxLines(1);
                textView3.setEllipsize(TextUtils.TruncateAt.END);
                textView3.setText(sqa.k0);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
                float f6 = (float) 12;
                layoutParams2.setMarginStart(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f6));
                layoutParams2.setMarginEnd(MathKt.roundToInt(f6 * vo4.c().getDisplayMetrics().density));
                layoutParams2.topMargin = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
                layoutParams2.bottomMargin = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
                textView3.setLayoutParams(layoutParams2);
                return textView3;
            case 10:
                KProperty[] kPropertyArr11 = CallOpponentsListWidget.B0;
                EditText editText = new EditText(callOpponentsListWidget.getContext());
                editText.setId(kgc.call_user_list_in_call_bottom_search);
                puf.a.b(editText, uy4.b);
                xef xef = l2b.i;
                editText.setHintTextColor(xef.f);
                editText.setTextColor(xef.e);
                float f7 = (float) 12;
                int roundToInt = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f7);
                editText.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
                editText.setMaxLines(1);
                editText.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(250)});
                f53 f532 = new f53(-1, -2);
                f532.a = 1;
                f532.bottomMargin = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
                f532.setMarginStart(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f7));
                f532.setMarginEnd(MathKt.roundToInt(f7 * vo4.c().getDisplayMetrics().density));
                editText.setLayoutParams(f532);
                hl1 hl1 = (hl1) callOpponentsListWidget.b.getValue();
                int i = sqa.O0;
                hl1.getClass();
                Context context = hl1.a;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a81.m("  ", context.getString(i)));
                int i2 = pec.ic_search_outline_16;
                int i3 = l2b.f.i;
                Drawable b3 = ew3.b(context, i2);
                iq.a0(b3, i3);
                float f8 = (float) 16;
                b3.setBounds(0, 0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f8), MathKt.roundToInt(f8 * vo4.c().getDisplayMetrics().density));
                spannableStringBuilder.setSpan(new bq5(b3, (vp5) null, 6), 0, 1, 17);
                editText.setHint(spannableStringBuilder);
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape((float[]) callOpponentsListWidget.a.getValue(), (RectF) null, (float[]) null));
                shapeDrawable.getPaint().setColor(l2b.d.a.g);
                editText.setBackground(shapeDrawable);
                editText.addTextChangedListener(new ne1(0, editText, callOpponentsListWidget));
                editText.setOnTouchListener(new ke1(0, new epg(1), editText));
                return editText;
            case 11:
                KProperty[] kPropertyArr12 = CallOpponentsListWidget.B0;
                ViewStub viewStub = new ViewStub(callOpponentsListWidget.getContext());
                viewStub.setId(kgc.call_screen_opponent_empty_list);
                return viewStub;
            case 12:
                KProperty[] kPropertyArr13 = CallOpponentsListWidget.B0;
                OneMeEmptyView oneMeEmptyView = new OneMeEmptyView(callOpponentsListWidget.getContext(), (AttributeSet) null);
                oneMeEmptyView.setId(kgc.call_screen_opponent_empty_list);
                wz3 wz33 = new wz3(-1, -1);
                wz33.b(new AppBarLayout.ScrollingViewBehavior());
                oneMeEmptyView.setLayoutParams(wz33);
                oneMeEmptyView.setPadding(0, 0, 0, g63.b((float) 40, vo4.c().getDisplayMetrics().density, ((wgd) callOpponentsListWidget.c.getValue()).d));
                oneMeEmptyView.setIcon(pqa.N);
                oneMeEmptyView.setTitle(new igf(sqa.i0));
                oneMeEmptyView.setSubtitle(new igf(sqa.h0));
                oneMeEmptyView.setVisibility(8);
                oneMeEmptyView.setCustomTheme(l2b.a);
                return oneMeEmptyView;
            case 13:
                KProperty[] kPropertyArr14 = CallOpponentsListWidget.B0;
                return new yd1(new u6h(6, callOpponentsListWidget));
            default:
                KProperty[] kPropertyArr15 = CallOpponentsListWidget.B0;
                AppBarLayout appBarLayout = new AppBarLayout(callOpponentsListWidget.getContext(), (AttributeSet) null);
                appBarLayout.setFocusable(true);
                appBarLayout.setFocusableInTouchMode(true);
                appBarLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                appBarLayout.setBackground((Drawable) null);
                appBarLayout.setStateListAnimator((StateListAnimator) null);
                return appBarLayout;
        }
    }
}
