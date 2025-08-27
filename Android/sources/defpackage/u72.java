package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.math.MathKt;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;

/* renamed from: u72  reason: default package */
public final class u72 extends gj0 {
    public final OneMeAvatarView a;
    public final TextView b;
    public final TextView c;
    public final t72 o;

    public u72(Context context) {
        super(context, (AttributeSet) null, 0);
        OneMeAvatarView oneMeAvatarView = new OneMeAvatarView(context, (AttributeSet) null);
        float f = (float) 71;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
        oneMeAvatarView.setLayoutParams(layoutParams);
        this.a = oneMeAvatarView;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.bottomMargin = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams2);
        textView.setTextAlignment(4);
        textView.setSingleLine(true);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        puf.j.b(textView, uy4.b);
        b0h.H(textView, new ra(3, (Continuation) null, 3));
        this.b = textView;
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView2.setLayoutParams(layoutParams3);
        textView2.setGravity(17);
        puf.r.b(textView2, uy4.b);
        b0h.H(textView2, new ra(3, (Continuation) null, 2));
        this.c = textView2;
        t72 t72 = new t72(context);
        t72.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.o = t72;
        addView(oneMeAvatarView);
        addView(textView);
        addView(textView2);
        addView(t72);
        setGravity(1);
        setMinimumWidth(MathKt.roundToInt(((float) 296) * vo4.c().getDisplayMetrics().density));
        float f2 = (float) 24;
        setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(((float) 20) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
    }

    public final void onThemeChanged(k2b k2b) {
        super.onThemeChanged(k2b);
        fu4.e(fu4.k.e(getContext()), this);
    }

    public final void setDescriptions(List<? extends ngf> list) {
        t72 t72 = this.o;
        t72.getClass();
        Iterable<ngf> iterable = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (ngf ngf : iterable) {
            ngf.getClass();
            arrayList.add(ngf.b(t72.getContext().getResources()));
        }
        t72.w = arrayList;
        t72.requestLayout();
        t72.invalidate();
        this.c.setGravity(list.isEmpty() ? 17 : 8388611);
    }

    public final void setSubtitle(ngf ngf) {
        TextView textView = this.c;
        ngf.getClass();
        textView.setText(ngf.b(getContext().getResources()));
    }

    public final void setTitle(ngf ngf) {
        TextView textView = this.b;
        textView.setText(ngf.a(textView.getContext()));
    }
}
