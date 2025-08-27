package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.math.MathKt;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;

/* renamed from: euc  reason: default package */
public final class euc extends LinearLayout implements phf {
    public final OneMeAvatarView a;
    public final TextView b;

    public euc(Context context) {
        super(context, (AttributeSet) null);
        OneMeAvatarView oneMeAvatarView = new OneMeAvatarView(context, (AttributeSet) null);
        oneMeAvatarView.setId(View.generateViewId());
        float f = (float) 64;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, 0, 0, MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density));
        oneMeAvatarView.setLayoutParams(layoutParams);
        oneMeAvatarView.setAvatarShape(goa.a);
        this.a = oneMeAvatarView;
        TextView textView = new TextView(context);
        textView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        setHorizontalGravity(17);
        textView.setLayoutParams(layoutParams2);
        float f2 = (float) 82;
        textView.setMaxWidth(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        puf.s.b(textView, uy4.b);
        textView.setTextColor(fu4.k.e(textView.getContext()).f().getText().e);
        this.b = textView;
        setOrientation(1);
        setLayoutParams(new ViewGroup.LayoutParams(MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density), -2));
        addView(oneMeAvatarView);
        addView(textView);
    }

    public final OneMeAvatarView getAvatar() {
        return this.a;
    }

    public final TextView getName() {
        return this.b;
    }

    public final void onMeasure(int i, int i2) {
        if (wgf.d(this.b)) {
            setVerified(true);
        }
        super.onMeasure(i, i2);
    }

    public final void onThemeChanged(k2b k2b) {
        this.b.setTextColor(k2b.getText().e);
    }

    public final void setAbbreviation(gd0 gd0) {
        this.a.f(gd0, true);
    }

    public final void setAvatar(String str) {
        this.a.setAvatarUrl(str);
    }

    public final void setName(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void setOnline(boolean z) {
        this.a.setOnlineBadgeVisibility(z);
    }

    public final void setVerified(boolean z) {
        TextView textView = this.b;
        m2g S = m5a.S(wgf.f(textView));
        l2g l2g = null;
        if (z) {
            l2g b2 = wgf.b(textView);
            if ((b2 != null ? b2.a : null) == S) {
                return;
            }
        }
        if (z) {
            l2g b3 = wgf.b(textView);
            if ((b3 != null ? b3.a : null) != S) {
                l2g = new l2g(getContext(), S, new duc(0));
            }
        }
        wgf.e(textView, l2g);
    }
}
