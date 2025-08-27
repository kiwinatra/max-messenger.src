package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.WeakHashMap;

/* renamed from: apc  reason: default package */
public abstract class apc extends ConstraintLayout {
    public final o99 E0 = new o99(23, this);
    public int F0;
    public final bh8 G0;

    public apc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(qjc.material_radial_view_group, this);
        bh8 bh8 = new bh8();
        this.G0 = bh8;
        s0d s0d = new s0d(0.5f);
        ypg e = bh8.a.a.e();
        e.e = s0d;
        e.f = s0d;
        e.g = s0d;
        e.h = s0d;
        bh8.setShapeAppearanceModel(e.c());
        this.G0.l(ColorStateList.valueOf(-1));
        bh8 bh82 = this.G0;
        WeakHashMap weakHashMap = gag.a;
        setBackground(bh82);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tnc.RadialViewGroup, i, 0);
        this.F0 = obtainStyledAttributes.getDimensionPixelSize(tnc.RadialViewGroup_materialCircleRadius, 0);
        obtainStyledAttributes.recycle();
    }

    public abstract void L();

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = gag.a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            o99 o99 = this.E0;
            handler.removeCallbacks(o99);
            handler.post(o99);
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        L();
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            o99 o99 = this.E0;
            handler.removeCallbacks(o99);
            handler.post(o99);
        }
    }

    public final void setBackgroundColor(int i) {
        this.G0.l(ColorStateList.valueOf(i));
    }
}
