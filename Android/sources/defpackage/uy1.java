package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.math.MathKt;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;

/* renamed from: uy1  reason: default package */
public final class uy1 extends ViewGroup implements phf {
    public final OneMeAvatarView a;
    public final TextView b;
    public final ImageView c;

    public uy1(Context context) {
        super(context);
        OneMeAvatarView oneMeAvatarView = new OneMeAvatarView(context, (AttributeSet) null);
        this.a = oneMeAvatarView;
        TextView textView = new TextView(context);
        puf.k.b(textView, uy4.b);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        this.b = textView;
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        addView(oneMeAvatarView);
        addView(textView);
        addView(imageView);
        oneMeAvatarView.setAvatarShape(goa.a);
        float f = (float) 12;
        setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), getPaddingTop(), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), getPaddingBottom());
        onThemeChanged(fu4.k.e(getContext()).f());
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int measuredHeight = getMeasuredHeight();
        OneMeAvatarView oneMeAvatarView = this.a;
        ev0.x(oneMeAvatarView, paddingLeft, (measuredHeight - oneMeAvatarView.getMeasuredHeight()) / 2, 0, 12);
        TextView textView = this.b;
        ev0.x(textView, g63.b((float) 12, vo4.c().getDisplayMetrics().density, oneMeAvatarView.getRight()), (getMeasuredHeight() - textView.getMeasuredHeight()) / 2, 0, 12);
        ImageView imageView = this.c;
        ev0.x(imageView, (getMeasuredWidth() - getPaddingRight()) - imageView.getMeasuredWidth(), (getMeasuredHeight() - imageView.getMeasuredHeight()) / 2, 0, 12);
    }

    public final void onMeasure(int i, int i2) {
        TextView textView = this.b;
        if (wgf.d(textView)) {
            setVerified(true);
        }
        float f = (float) 40;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), 1073741824);
        OneMeAvatarView oneMeAvatarView = this.a;
        oneMeAvatarView.measure(makeMeasureSpec, makeMeasureSpec2);
        int mode = View.MeasureSpec.getMode(i);
        int size = (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.getSize(i) : IntCompanionObject.MAX_VALUE;
        ImageView imageView = this.c;
        float f2 = (float) 20;
        imageView.measure(View.MeasureSpec.makeMeasureSpec(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), 1073741824), View.MeasureSpec.makeMeasureSpec(MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density), 1073741824));
        int paddingLeft = (size - getPaddingLeft()) - oneMeAvatarView.getMeasuredWidth();
        float f3 = (float) 12;
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec((a81.e(f3, vo4.c().getDisplayMetrics().density, a81.e(f3, vo4.c().getDisplayMetrics().density, paddingLeft)) - imageView.getMeasuredWidth()) - getPaddingRight(), IntCompanionObject.MIN_VALUE);
        float f4 = (float) 56;
        textView.measure(makeMeasureSpec3, View.MeasureSpec.makeMeasureSpec(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4), IntCompanionObject.MIN_VALUE));
        setMeasuredDimension(size, MathKt.roundToInt(f4 * vo4.c().getDisplayMetrics().density));
    }

    public final void onThemeChanged(k2b k2b) {
        this.b.setTextColor(k2b.getText().e);
        this.c.setImageTintList(ColorStateList.valueOf(k2b.getIcon().h));
    }

    public final void setOnTrailClick(View.OnClickListener onClickListener) {
        ct.G(this.c, 300, new pb(6, onClickListener, this));
    }

    public final void setTitle(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void setTrail(int i) {
        this.c.setImageResource(i);
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
                l2g = new l2g(getContext(), S, new gl1(1));
            }
        }
        wgf.e(textView, l2g);
    }
}
