package ru.ok.tamtam.stickers.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

public class RecyclerAutofitGridView extends RecyclerView {
    public final GridLayoutManager T1;
    public int U1 = 5;
    public int V1;
    public View W1;
    public final t45 X1 = new t45(7, this);

    public RecyclerAutofitGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.U1);
        this.T1 = gridLayoutManager;
        setLayoutManager(gridLayoutManager);
    }

    public final void H0() {
        if (this.W1 != null) {
            tyc adapter = getAdapter();
            this.W1.setVisibility((adapter == null || adapter.j() <= 0) ? 0 : 8);
        }
    }

    public int getSpanCount() {
        return this.U1;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.V1 > 0) {
            this.T1.z1(Math.max(1, getMeasuredWidth() / this.V1));
        }
    }

    public void setAdapter(tyc tyc) {
        tyc adapter = getAdapter();
        t45 t45 = this.X1;
        if (adapter != null) {
            adapter.D(t45);
        }
        super.setAdapter(tyc);
        if (this.W1 != null) {
            if (tyc != null) {
                tyc.A(t45);
            }
            H0();
        }
    }

    public void setColumnWidth(int i) {
        this.V1 = i;
        requestLayout();
    }

    public void setDefaultColumns(int i) {
        this.U1 = i;
        this.T1.z1(i);
        setLayoutManager((a) null);
        setLayoutManager(this.T1);
    }

    public void setEmptyView(View view) {
        this.W1 = view;
        tyc adapter = getAdapter();
        if (adapter != null) {
            adapter.A(this.X1);
        }
        H0();
    }

    public void setSpanSizeLookup(xu6 xu6) {
        this.T1.K = xu6;
    }
}
