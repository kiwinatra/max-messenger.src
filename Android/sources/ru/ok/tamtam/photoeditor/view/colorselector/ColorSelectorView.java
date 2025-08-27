package ru.ok.tamtam.photoeditor.view.colorselector;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ColorSelectorView extends RecyclerView {
    public final q53 T1;
    public final int U1 = 0;

    public ColorSelectorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, aoc.ColorSelectorView);
        this.U1 = obtainStyledAttributes.getInt(aoc.ColorSelectorView_color_selector_orientation, 0);
        obtainStyledAttributes.recycle();
        getContext();
        int i = this.U1;
        setLayoutManager(new LinearLayoutManager(i == 0 ? 0 : 1, i == 0 ? true : z));
        q53 q53 = new q53(getContext(), this.U1);
        this.T1 = q53;
        setAdapter(q53);
    }

    public void setColors(int[] iArr) {
        q53 q53 = this.T1;
        q53.v = iArr;
        q53.m();
    }

    public void setListener(s53 s53) {
        this.T1.X = s53;
    }
}
