package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Unit;

/* renamed from: zaf  reason: default package */
public final class zaf extends AppCompatImageView implements wcf {
    public final ag a;
    public boolean b;
    public final ug8 c;

    public zaf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ag a2 = ag.a(lfc.ic_activity_indicator, context);
        this.a = a2;
        ug8 ug8 = new ug8(this, 1);
        this.c = ug8;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, boc.TamLoadingView);
        this.b = obtainStyledAttributes.getBoolean(boc.TamLoadingView_tlv_auto_repeat, true);
        Unit unit = Unit.INSTANCE;
        obtainStyledAttributes.recycle();
        setImageDrawable(a2);
        a2.start();
        a2.b(ug8);
        d1(this);
    }

    private final void setColorToAnimatedVectorDrawable(int i) {
        iq.a0(this.a, i);
    }

    public final void L0(scf scf) {
        setBackgroundColor(scf.n);
        setColorToAnimatedVectorDrawable(scf.x);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.b(this.c);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.c(this.c);
    }

    public final void setAutoRepeat(boolean z) {
        this.b = z;
        if (z) {
            this.a.start();
        }
    }
}
