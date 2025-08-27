package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* renamed from: fpc  reason: default package */
public final class fpc extends FrameLayout implements phf {
    public static final /* synthetic */ KProperty[] o = {rae.s(fpc.class, "size", "getSize()Lone/me/calls/ui/bottomsheet/ratecall/view/RateCallButton$Size;", 0)};
    public final Lazy a;
    public final n04 b;
    public final bl c = new bl(this);

    public fpc(Context context) {
        super(context, (AttributeSet) null);
        this.a = LazyKt.lazy(LazyThreadSafetyMode.NONE, new a1b(context, 14));
        n04 n04 = new n04((float) MathKt.roundToInt(((float) 32) * vo4.c().getDisplayMetrics().density));
        this.b = n04;
        Delegates delegates = Delegates.INSTANCE;
        epc epc = epc.a;
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setClipToOutline(true);
        setOutlineProvider(n04);
        setBackgroundColor(fu4.k.e(getContext()).f().c().a.g);
        setClickable(true);
        addView(getTextView());
    }

    public static final void a(fpc fpc, epc epc) {
        float f;
        float f2;
        int i;
        TextView textView = fpc.getTextView();
        int ordinal = epc.ordinal();
        if (ordinal == 0) {
            f = 32.0f;
        } else if (ordinal == 1) {
            f = 44.0f;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        textView.setTextSize(f);
        int ordinal2 = epc.ordinal();
        if (ordinal2 == 0) {
            f2 = vo4.c().getDisplayMetrics().density * 32.0f;
        } else if (ordinal2 == 1) {
            f2 = vo4.c().getDisplayMetrics().density * 50.0f;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        fpc.b.a = f2;
        ViewGroup.LayoutParams layoutParams = fpc.getLayoutParams();
        if (layoutParams != null) {
            int ordinal3 = epc.ordinal();
            if (ordinal3 == 0) {
                i = MathKt.roundToInt(((float) 64) * vo4.c().getDisplayMetrics().density);
            } else if (ordinal3 == 1) {
                i = MathKt.roundToInt(((float) 80) * vo4.c().getDisplayMetrics().density);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            layoutParams.height = i;
            layoutParams.width = i;
            fpc.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    private final TextView getTextView() {
        return (TextView) this.a.getValue();
    }

    public final void b() {
        invalidate();
        requestLayout();
    }

    public final epc getSize() {
        return (epc) this.c.getValue(this, o[0]);
    }

    public final void onThemeChanged(k2b k2b) {
        getTextView().setTextColor(k2b.getText().e);
        setBackgroundColor(k2b.c().a.g);
    }

    public void setEnabled(boolean z) {
        setAlpha(z ? 1.0f : 0.48f);
    }

    public final void setSize(epc epc) {
        this.c.setValue(this, o[0], epc);
    }

    public final void setText(CharSequence charSequence) {
        getTextView().setText(charSequence);
        b();
    }
}
