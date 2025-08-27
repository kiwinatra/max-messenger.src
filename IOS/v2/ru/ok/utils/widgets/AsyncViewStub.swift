package ru.ok.utils.widgets;

import ios.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;

public class AsyncViewStub extends View implements lv {
    public View a;

    public AsyncViewStub(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, boc.AsyncViewStub);
        obtainStyledAttributes.getResourceId(boc.AsyncViewStub_layout, 0);
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
        new o5h(getContext(), 1);
    }

    public final void b(View view) {
        this.a = view;
        throw null;
    }

    public final void dispatchDraw(Canvas canvas) {
    }

    public final void draw(Canvas canvas) {
    }

    public View getInflatedView() {
        return this.a;
    }

    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setLayoutResource(int i) {
    }

    public void setShouldInflateOnBackgroundThread(boolean z) {
    }
}
