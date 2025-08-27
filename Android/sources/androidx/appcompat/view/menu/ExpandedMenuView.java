package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView implements l69, l79, AdapterView.OnItemClickListener {
    public static final int[] b = {16842964, 16843049};
    public m69 a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        g6d w = g6d.w(context, attributeSet, b, 16842868, 0);
        TypedArray typedArray = (TypedArray) w.c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(w.q(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(w.q(1));
        }
        w.x();
    }

    public final boolean a(u69 u69) {
        return this.a.q(u69, (i79) null, 0);
    }

    public final void b(m69 m69) {
        this.a = m69;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((u69) getAdapter().getItem(i));
    }
}
