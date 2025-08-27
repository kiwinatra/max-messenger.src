package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: rg3  reason: default package */
public final class rg3 extends LinearLayout implements phf {
    public final AppCompatTextView a;
    public final AppCompatTextView b;
    public final LinkedHashMap c;

    public rg3(ConfirmationBottomSheet confirmationBottomSheet, CharSequence charSequence, CharSequence charSequence2, ArrayList arrayList, Context context) {
        super(context);
        AppCompatTextView appCompatTextView;
        KProperty[] kPropertyArr = ConfirmationBottomSheet.D0;
        confirmationBottomSheet.getClass();
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(getContext(), (AttributeSet) null);
        puf.c.b(appCompatTextView2, uy4.b);
        appCompatTextView2.setText(charSequence);
        appCompatTextView2.setGravity(17);
        float f = (float) 12;
        appCompatTextView2.setPaddingRelative(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), appCompatTextView2.getPaddingTop(), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), appCompatTextView2.getPaddingBottom());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        float f2 = (float) 16;
        layoutParams.topMargin = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2);
        KProperty kProperty = ConfirmationBottomSheet.D0[1];
        layoutParams.bottomMargin = MathKt.roundToInt(((ngf) confirmationBottomSheet.x0.a(confirmationBottomSheet)) == null ? vo4.c().getDisplayMetrics().density * f2 : vo4.c().getDisplayMetrics().density * f);
        Unit unit = Unit.INSTANCE;
        addView(appCompatTextView2, layoutParams);
        this.a = appCompatTextView2;
        if (charSequence2 != null) {
            appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
            puf.m.b(appCompatTextView, uy4.b);
            appCompatTextView.setText(charSequence2);
            appCompatTextView.setGravity(17);
            appCompatTextView.setPaddingRelative(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), appCompatTextView.getPaddingTop(), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), appCompatTextView.getPaddingBottom());
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            layoutParams2.bottomMargin = MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density);
            addView(appCompatTextView, layoutParams2);
        } else {
            appCompatTextView = null;
        }
        this.b = appCompatTextView;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (Object next : arrayList) {
            pg3 pg3 = (pg3) next;
            int i = pg3.a;
            CharSequence a2 = pg3.b.a(getContext());
            AppCompatTextView appCompatTextView3 = new AppCompatTextView(getContext(), (AttributeSet) null);
            puf.A.b(appCompatTextView3, uy4.b);
            appCompatTextView3.setText(a2);
            appCompatTextView3.setGravity(17);
            ct.G(appCompatTextView3, 300, new mg3(confirmationBottomSheet, i, 0));
            float f3 = (float) 15;
            appCompatTextView3.setPadding(appCompatTextView3.getPaddingLeft(), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), appCompatTextView3.getPaddingRight(), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.gravity = 17;
            Unit unit2 = Unit.INSTANCE;
            addView(appCompatTextView3, layoutParams3);
            linkedHashMap.put(appCompatTextView3, next);
        }
        this.c = linkedHashMap;
        setOrientation(1);
        setGravity(17);
        onThemeChanged(fu4.k.e(getContext()).f());
    }

    public final Map<TextView, pg3> getButtonViews() {
        return this.c;
    }

    public final TextView getDescriptionView() {
        return this.b;
    }

    public final TextView getTitleView() {
        return this.a;
    }

    public final void onThemeChanged(k2b k2b) {
        int i;
        this.a.setTextColor(k2b.getText().e);
        AppCompatTextView appCompatTextView = this.b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(k2b.getText().f);
        }
        for (Map.Entry entry : this.c.entrySet()) {
            TextView textView = (TextView) entry.getKey();
            int ordinal = ((pg3) entry.getValue()).c.ordinal();
            if (ordinal == 0) {
                i = k2b.getText().b;
            } else if (ordinal == 1) {
                i = k2b.getText().g;
            } else if (ordinal == 2) {
                i = k2b.getText().e;
            } else if (ordinal == 3) {
                k2b.getText().getClass();
                i = -16745729;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            textView.setTextColor(i);
        }
    }
}
