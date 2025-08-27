package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.math.MathKt;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;

/* renamed from: oq0  reason: default package */
public final class oq0 extends gj0 {
    public final OneMeAvatarView a;
    public final TextView b;
    public final TextView c;

    public oq0(Context context) {
        super(context, (AttributeSet) null, 0);
        float f = (float) 24;
        setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(((float) 20) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        OneMeAvatarView oneMeAvatarView = new OneMeAvatarView(context, (AttributeSet) null);
        float f2 = (float) 71;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        layoutParams.gravity = 1;
        oneMeAvatarView.setLayoutParams(layoutParams);
        this.a = oneMeAvatarView;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        textView.setPadding(0, MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density), 0, MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density));
        textView.setLayoutParams(layoutParams2);
        textView.setTextAlignment(4);
        puf.j.b(textView, uy4.b);
        this.b = textView;
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView2.setLayoutParams(layoutParams3);
        textView2.setTextAlignment(4);
        puf.s.b(textView2, uy4.b);
        this.c = textView2;
        addView(oneMeAvatarView);
        addView(textView);
        addView(textView2);
        onThemeChanged(fu4.k.e(context).f());
    }

    public final void onThemeChanged(k2b k2b) {
        super.onThemeChanged(k2b);
        this.b.setTextColor(k2b.getText().e);
        this.c.setTextColor(k2b.getText().g);
    }

    public final void setState(z45 z45) {
        String str = z45.a;
        OneMeAvatarView oneMeAvatarView = this.a;
        oneMeAvatarView.setAvatarUrl(str);
        CharSequence charSequence = z45.b;
        if (charSequence == null) {
            charSequence = "";
        }
        oneMeAvatarView.f(new gd0(charSequence, z45.c), true);
        TextView textView = this.b;
        ngf ngf = z45.d;
        ngf.getClass();
        textView.setText(ngf.b(getContext().getResources()));
        TextView textView2 = this.c;
        ngf ngf2 = z45.e;
        ngf2.getClass();
        textView2.setText(ngf2.b(getContext().getResources()));
    }
}
