package ru.ok.tamtam.photoeditor.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

public class EditorSurfaceViewContainer extends FrameLayout implements l05 {
    public final View a;
    public final View b;
    public final n05 c;
    public boolean o;
    public final Rect v = new Rect();
    public final Rect w = new Rect();

    /* JADX WARNING: type inference failed for: r2v3, types: [n05, android.view.ScaleGestureDetector$OnScaleGestureListener, android.view.View] */
    public EditorSurfaceViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ? view = new View(getContext());
        view.a = new ArrayList();
        view.o = new Matrix();
        view.v = new Matrix();
        view.y = new float[9];
        view.z = 3.0f;
        view.w0 = false;
        view.b = new ScaleGestureDetector(view.getContext(), view);
        this.c = view;
        this.c.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.c.setBoundingListener(this);
        addView(this.c);
        this.a = new View(getContext());
        this.b = new View(getContext());
        this.a.setBackgroundColor(-872415232);
        this.b.setBackgroundColor(-872415232);
        this.a.setVisibility(8);
        this.b.setVisibility(8);
        addView(this.a);
        addView(this.b);
    }

    public n05 getEditorSurfaceView() {
        return this.c;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.c.layout(i, i2, i3, i4);
        if (this.o) {
            int i5 = i3 - i;
            int i6 = i4 - i2;
            int min = Math.min(i5, i6);
            int i7 = min / 2;
            int i8 = i5 / 2;
            int i9 = i6 / 2;
            if (min == i5) {
                int i10 = i9 - i7;
                this.a.layout(i, i10 - this.a.getMeasuredHeight(), i3, i10);
                this.b.layout(i, i9 + i7, i3, i4);
                return;
            }
            int measuredWidth = this.a.getMeasuredWidth();
            int i11 = i8 - i7;
            this.a.layout(i11 - measuredWidth, i2, i11, i4);
            int i12 = i8 + i7;
            this.b.layout(i12, i2, measuredWidth + i12, i4);
        }
    }

    public final void onMeasure(int i, int i2) {
        this.c.measure(i, i2);
        if (this.o) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int min = Math.min(size, size2);
            if (min == size) {
                int i3 = (size2 - min) / 2;
                this.a.measure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
                this.b.measure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            } else {
                int i4 = (size - min) / 2;
                this.a.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i2);
                this.b.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i2);
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    public void setDrawStickerEnabled(boolean z) {
        if (this.o != z) {
            this.o = z;
            int i = 8;
            this.a.setVisibility(z ? 0 : 8);
            View view = this.b;
            if (this.o) {
                i = 0;
            }
            view.setVisibility(i);
        }
    }
}
