package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.preference.PreferenceFragmentCompat;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ysb  reason: default package */
public final class ysb extends zyc {
    public Drawable a;
    public int b;
    public boolean c = true;
    public final /* synthetic */ PreferenceFragmentCompat o;

    public ysb(PreferenceFragmentCompat preferenceFragmentCompat) {
        this.o = preferenceFragmentCompat;
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, lzc lzc) {
        if (i(view, recyclerView)) {
            rect.bottom = this.b;
        }
    }

    public final void h(Canvas canvas, RecyclerView recyclerView) {
        if (this.a != null) {
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (i(childAt, recyclerView)) {
                    int height = childAt.getHeight() + ((int) childAt.getY());
                    this.a.setBounds(0, height, width, this.b + height);
                    this.a.draw(canvas);
                }
            }
        }
    }

    public final boolean i(View view, RecyclerView recyclerView) {
        pzc U = recyclerView.U(view);
        boolean z = false;
        if (!(U instanceof ftb) || !((ftb) U).H0) {
            return false;
        }
        boolean z2 = this.c;
        int indexOfChild = recyclerView.indexOfChild(view);
        if (indexOfChild >= recyclerView.getChildCount() - 1) {
            return z2;
        }
        pzc U2 = recyclerView.U(recyclerView.getChildAt(indexOfChild + 1));
        if ((U2 instanceof ftb) && ((ftb) U2).G0) {
            z = true;
        }
        return z;
    }
}
