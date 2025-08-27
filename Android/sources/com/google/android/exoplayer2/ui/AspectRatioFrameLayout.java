package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public final class AspectRatioFrameLayout extends FrameLayout {
    public static final /* synthetic */ int o = 0;
    public final et a;
    public float b;
    public int c = 0;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, rnc.AspectRatioFrameLayout, 0, 0);
            try {
                this.c = obtainStyledAttributes.getInt(rnc.AspectRatioFrameLayout_resize_mode, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.a = new et(this);
    }

    public int getResizeMode() {
        return this.c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            super.onMeasure(r9, r10)
            float r9 = r8.b
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto L_0x000b
            return
        L_0x000b:
            int r9 = r8.getMeasuredWidth()
            int r0 = r8.getMeasuredHeight()
            float r1 = (float) r9
            float r2 = (float) r0
            float r3 = r1 / r2
            float r4 = r8.b
            float r4 = r4 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r3
            float r3 = java.lang.Math.abs(r4)
            r5 = 1008981770(0x3c23d70a, float:0.01)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r5 = 1
            et r6 = r8.a
            if (r3 > 0) goto L_0x0037
            boolean r8 = r6.a
            if (r8 != 0) goto L_0x0036
            r6.a = r5
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r8 = r6.b
            r8.post(r6)
        L_0x0036:
            return
        L_0x0037:
            int r3 = r8.c
            if (r3 == 0) goto L_0x0058
            if (r3 == r5) goto L_0x0055
            r7 = 2
            if (r3 == r7) goto L_0x0052
            r7 = 4
            if (r3 == r7) goto L_0x0044
            goto L_0x0062
        L_0x0044:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x004d
            float r9 = r8.b
        L_0x004a:
            float r2 = r2 * r9
            int r9 = (int) r2
            goto L_0x0062
        L_0x004d:
            float r10 = r8.b
        L_0x004f:
            float r1 = r1 / r10
            int r0 = (int) r1
            goto L_0x0062
        L_0x0052:
            float r9 = r8.b
            goto L_0x004a
        L_0x0055:
            float r10 = r8.b
            goto L_0x004f
        L_0x0058:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x005f
            float r10 = r8.b
            goto L_0x004f
        L_0x005f:
            float r9 = r8.b
            goto L_0x004a
        L_0x0062:
            boolean r10 = r6.a
            if (r10 != 0) goto L_0x006d
            r6.a = r5
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r10 = r6.b
            r10.post(r6)
        L_0x006d:
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10)
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }

    public void setAspectRatio(float f) {
        if (this.b != f) {
            this.b = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(dt dtVar) {
    }

    public void setResizeMode(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
        }
    }
}
