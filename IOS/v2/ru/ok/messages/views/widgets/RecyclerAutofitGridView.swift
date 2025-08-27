package ru.ok.messages.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.a;
import one.me.sdk.lists.widgets.EndlessRecyclerView;

public class RecyclerAutofitGridView extends EndlessRecyclerView {
    public int i2;
    public int j2;
    public int k2;

    public RecyclerAutofitGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        T0();
    }

    public final void T0() {
        if (hn4.i(getContext())) {
            this.k2 = 8;
        } else {
            this.k2 = 4;
        }
        getContext();
        setLayoutManager(new GridLayoutManager(this.k2));
    }

    public final void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        a layoutManager = getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && this.i2 > 0) {
            int max = Math.max(2, getMeasuredWidth() / this.i2);
            int i4 = this.k2;
            if (max > i4) {
                max = i4;
            }
            ((GridLayoutManager) layoutManager).z1(max);
        }
        if ((layoutManager instanceof StaggeredGridLayoutManager) && this.j2 > 0) {
            int max2 = Math.max(2, getMeasuredWidth() / this.j2);
            int i5 = this.k2;
            if (max2 > i5) {
                max2 = i5;
            }
            ((StaggeredGridLayoutManager) layoutManager).l1(max2);
        }
    }

    public void setColumnWidth(int i) {
        this.i2 = i;
        requestLayout();
    }

    public void setMaxColumns(int i) {
        this.k2 = i;
    }

    public void setStaggeredColumnWidth(int i) {
        this.j2 = i;
        requestLayout();
    }
}
