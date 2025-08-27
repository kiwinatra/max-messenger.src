package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.math.MathKt;

/* renamed from: zuc  reason: default package */
public final class zuc extends FrameLayout implements phf {
    public final TextView a;
    public final TextView b;

    public zuc(rh9 rh9, Context context) {
        super(context);
        TextView textView = new TextView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388627;
        float f = (float) 12;
        layoutParams.setMarginStart(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        textView.setLayoutParams(layoutParams);
        textView.setText(context.getString(clc.chats_list_search_recent_header));
        puf.q.b(textView, uy4.b);
        js9 js9 = fu4.k;
        textView.setTextColor(js9.e(textView.getContext()).f().getText().h);
        this.a = textView;
        TextView textView2 = new TextView(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388629;
        layoutParams2.setMarginEnd(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        textView2.setLayoutParams(layoutParams2);
        textView2.setText(context.getString(clc.chats_list_search_recent_header_clear));
        puf.m.b(textView2, uy4.b);
        textView2.setTextColor(js9.e(textView2.getContext()).f().getText().h);
        ct.G(textView2, 300, new e7(20, rh9));
        this.b = textView2;
        setLayoutParams(new ViewGroup.LayoutParams(-1, MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density)));
        addView(textView);
        addView(textView2);
    }

    public final void onThemeChanged(k2b k2b) {
        this.a.setTextColor(k2b.getText().h);
        this.b.setTextColor(k2b.getText().h);
    }
}
