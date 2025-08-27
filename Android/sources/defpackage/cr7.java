package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* renamed from: cr7  reason: default package */
public final class cr7 extends FrameLayout implements phf {
    public static final /* synthetic */ KProperty[] c = {rae.s(cr7.class, "tabItem", "getTabItem()Lone/me/common/tablayout/model/OneMeBaseTabItemModel;", 0)};
    public final TextView a;
    public final bl b = new bl(11, (woa) woa.g.getValue(), this);

    public cr7(Context context) {
        super(context, (AttributeSet) null);
        TextView textView = new TextView(context);
        textView.setId(dad.x0);
        puf.p.b(textView, uy4.b);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLetterSpacing(c44.DEFAULT_ASPECT_RATIO);
        textView.setSingleLine(true);
        this.a = textView;
        Delegates delegates = Delegates.INSTANCE;
        b(getTabItem().c, fu4.k.e(getContext()).f());
        setLayoutParams(new ViewGroup.LayoutParams(MathKt.roundToInt(((float) 72) * vo4.c().getDisplayMetrics().density), -2));
        setClipToPadding(false);
        addView(textView);
    }

    public static final void a(cr7 cr7) {
        cr7.setText(cr7.getTabItem().b);
        br7 b2 = b(cr7.getTabItem().c, fu4.k.e(cr7.getContext()).f());
        cr7.getClass();
        cr7.a.setTextColor(b2.a);
        cr7.requestLayout();
        cr7.invalidate();
    }

    public static br7 b(voa voa, k2b k2b) {
        int ordinal = voa.ordinal();
        if (ordinal == 0) {
            return new br7(k2b.getText().e);
        }
        if (ordinal == 1) {
            return new br7(k2b.getText().f);
        }
        if (ordinal == 2) {
            return new br7(k2b.b().c.h);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final woa getTabItem() {
        return (woa) this.b.getValue(this, c[0]);
    }

    public final void onThemeChanged(k2b k2b) {
        this.a.setTextColor(b(getTabItem().c, k2b).a);
        fu4.e(fu4.k.e(getContext()), this);
    }

    public void setSelected(boolean z) {
        if (z != isSelected()) {
            setTabItem(woa.a(getTabItem(), z ? voa.a : voa.b));
        }
        super.setSelected(z);
    }

    public final void setTabItem(woa woa) {
        this.b.setValue(this, c[0], woa);
    }
}
