package com.google.android.material.timepicker;

import android.content.res.ColorStateList;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ClockFaceView extends apc implements o33 {
    public final ClockHandView H0;
    public final Rect I0 = new Rect();
    public final RectF J0 = new RectF();
    public final Rect K0 = new Rect();
    public final SparseArray L0 = new SparseArray();
    public final c M0;
    public final int[] N0;
    public final float[] O0 = {c44.DEFAULT_ASPECT_RATIO, 0.9f, 1.0f};
    public final int P0;
    public final int Q0;
    public final int R0;
    public final int S0;
    public String[] T0;
    public float U0;
    public final ColorStateList V0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ClockFaceView(android.content.Context r7, android.util.AttributeSet r8) {
        /*
            r6 = this;
            int r0 = defpackage.edc.materialClockStyle
            r6.<init>(r7, r8, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r6.I0 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r6.J0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r6.K0 = r1
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r6.L0 = r1
            r1 = 3
            float[] r1 = new float[r1]
            r1 = {0, 1063675494, 1065353216} // fill-array
            r6.O0 = r1
            int[] r1 = defpackage.tnc.ClockFaceView
            int r2 = defpackage.hnc.Widget_MaterialComponents_TimePicker_Clock
            android.content.res.TypedArray r8 = r7.obtainStyledAttributes(r8, r1, r0, r2)
            android.content.res.Resources r0 = r6.getResources()
            int r1 = defpackage.tnc.ClockFaceView_clockNumberTextColor
            android.content.res.ColorStateList r1 = defpackage.m5a.C(r7, r8, r1)
            r6.V0 = r1
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r7)
            int r3 = defpackage.qjc.material_clockface_view
            r4 = 1
            r2.inflate(r3, r6, r4)
            int r2 = defpackage.agc.material_clock_hand
            android.view.View r2 = r6.findViewById(r2)
            com.google.android.material.timepicker.ClockHandView r2 = (com.google.android.material.timepicker.ClockHandView) r2
            r6.H0 = r2
            int r3 = defpackage.iec.material_clock_hand_padding
            int r3 = r0.getDimensionPixelSize(r3)
            r6.P0 = r3
            r3 = 16842913(0x10100a1, float:2.369401E-38)
            int[] r3 = new int[]{r3}
            int r5 = r1.getDefaultColor()
            int r3 = r1.getColorForState(r3, r5)
            int r1 = r1.getDefaultColor()
            int[] r1 = new int[]{r3, r3, r1}
            r6.N0 = r1
            java.util.ArrayList r1 = r2.v0
            r1.add(r6)
            int r1 = defpackage.rdc.material_timepicker_clockface
            android.content.res.ColorStateList r1 = defpackage.q8.j(r1, r7)
            int r1 = r1.getDefaultColor()
            int r2 = defpackage.tnc.ClockFaceView_clockFaceBackgroundColor
            android.content.res.ColorStateList r7 = defpackage.m5a.C(r7, r8, r2)
            if (r7 != 0) goto L_0x008a
            goto L_0x008e
        L_0x008a:
            int r1 = r7.getDefaultColor()
        L_0x008e:
            r6.setBackgroundColor(r1)
            android.view.ViewTreeObserver r7 = r6.getViewTreeObserver()
            com.google.android.material.timepicker.b r1 = new com.google.android.material.timepicker.b
            r1.<init>(r6)
            r7.addOnPreDrawListener(r1)
            r6.setFocusable(r4)
            r8.recycle()
            com.google.android.material.timepicker.c r7 = new com.google.android.material.timepicker.c
            r7.<init>(r6)
            r6.M0 = r7
            r7 = 12
            java.lang.String[] r7 = new java.lang.String[r7]
            java.lang.String r8 = ""
            java.util.Arrays.fill(r7, r8)
            r8 = 0
            r6.N(r8, r7)
            int r7 = defpackage.iec.material_time_picker_minimum_screen_height
            int r7 = r0.getDimensionPixelSize(r7)
            r6.Q0 = r7
            int r7 = defpackage.iec.material_time_picker_minimum_screen_width
            int r7 = r0.getDimensionPixelSize(r7)
            r6.R0 = r7
            int r7 = defpackage.iec.material_clock_size
            int r7 = r0.getDimensionPixelSize(r7)
            r6.S0 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.timepicker.ClockFaceView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void L() {
        pj3 pj3 = new pj3();
        pj3.d(this);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != agc.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(agc.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!hashMap.containsKey(i2)) {
                    hashMap.put(i2, new ArrayList());
                }
                ((List) hashMap.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List<View> list = (List) entry.getValue();
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(((float) this.F0) * 0.66f) : this.F0;
            float f = c44.DEFAULT_ASPECT_RATIO;
            for (View id : list) {
                int id2 = id.getId();
                int i3 = agc.circle_center;
                lj3 lj3 = pj3.j(id2).d;
                lj3.z = i3;
                lj3.A = round;
                lj3.B = f;
                f += 360.0f / ((float) list.size());
            }
        }
        pj3.a(this);
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.L0;
            if (i4 < sparseArray.size()) {
                ((TextView) sparseArray.get(i4)).setVisibility(0);
                i4++;
            } else {
                return;
            }
        }
    }

    public final void M() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.H0.z0;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.L0;
            int size = sparseArray.size();
            rectF = this.J0;
            rect = this.I0;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f) {
                    textView = textView2;
                    f = height;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                Rect rect2 = this.K0;
                textView3.getLineBounds(0, rect2);
                rectF.inset((float) rect2.left, (float) rect2.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.N0, this.O0, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    public final void N(int i, String[] strArr) {
        this.T0 = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        SparseArray sparseArray = this.L0;
        int size = sparseArray.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.T0.length, size); i2++) {
            TextView textView = (TextView) sparseArray.get(i2);
            if (i2 >= this.T0.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(qjc.material_clockface_textview, this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.T0[i2]);
                textView.setTag(agc.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(agc.material_clock_level, Integer.valueOf(i3));
                if (i3 > 1) {
                    z = true;
                }
                gag.j(textView, this.M0);
                textView.setTextColor(this.V0);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, new Object[]{this.T0[i2]}));
                }
            }
        }
        ClockHandView clockHandView = this.H0;
        if (clockHandView.z && !z) {
            clockHandView.G0 = 1;
        }
        clockHandView.z = z;
        clockHandView.invalidate();
    }

    public final void j(float f, boolean z) {
        if (Math.abs(this.U0 - f) > 0.001f) {
            this.U0 = f;
            M();
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) e4.q(1, this.T0.length, 1).b);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        M();
    }

    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (((float) this.S0) / Math.max(Math.max(((float) this.Q0) / ((float) displayMetrics.heightPixels), ((float) this.R0) / ((float) displayMetrics.widthPixels)), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
