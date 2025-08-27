package ru.ok.tamtam.stickers.panel;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

public class RelativePanelLayout extends RelativeLayout implements c8b {
    public int a;
    public View b;
    public e8b c;

    public RelativePanelLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setClipToPadding(false);
        setClipChildren(false);
    }

    public final void onMeasure(int i, int i2) {
        int size;
        b8b b8b;
        if (!(this.c == null || (size = View.MeasureSpec.getSize(i2)) == this.a)) {
            d8b d8b = (d8b) this.c;
            d8b.getClass();
            View rootView = getRootView();
            Context context = d8b.b;
            if (ld9.I(context) == (rootView.getHeight() > rootView.getWidth())) {
                Rect rect = d8b.j;
                getWindowVisibleDisplayFrame(rect);
                int E = ld9.E(context);
                int height = rootView.getHeight() - (rect.top != 0 ? E : 0);
                Rect H = iq.H(rootView);
                int height2 = (height - (H == null ? 0 : H.bottom)) - rect.height();
                d8b.i = height2;
                if (((float) height2) < Math.max(ld9.r(context, 10.0f), (float) E)) {
                    d8b.i = 0;
                }
                boolean z = d8b.g;
                boolean z2 = d8b.i > 0;
                d8b.g = z2;
                if (z2) {
                    if (d8b.f == null) {
                        if (d8b.e == null) {
                            d8b.e = context.getSharedPreferences("emoji_prefs", 0);
                        }
                        d8b.f = d8b.e.edit();
                    }
                    d8b.f.putInt(ld9.I(context) ? "key_keyboard_height_portrait" : "key_keyboard_height_landscape", d8b.i).apply();
                }
                boolean z3 = d8b.g;
                if (z3 && (d8b.a == 1 || !z)) {
                    d8b.d();
                    d8b.a = 0;
                } else if (!z3 && d8b.a == 2) {
                    d8b.a(d8b.c());
                    d8b.a = 0;
                }
                boolean z4 = d8b.g;
                if (!(z == z4 || (b8b = d8b.d) == null)) {
                    b8b.w0(z4);
                }
            }
            this.a = size;
        }
        super.onMeasure(i, i2);
    }

    public void setSizeListener(e8b e8b) {
        this.c = e8b;
    }
}
