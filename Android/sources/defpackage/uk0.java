package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.io.ConstantsKt;

/* renamed from: uk0  reason: default package */
public final class uk0 extends ud5 {
    public final wk0 q;
    public final Rect r = new Rect();

    public uk0(wde wde) {
        super(wde);
        this.q = wde;
    }

    public final int n(float f, float f2) {
        int i = 0;
        while (true) {
            wk0 wk0 = this.q;
            if (i >= wk0.getValues().size()) {
                return -1;
            }
            Rect rect = this.r;
            wk0.u(i, rect);
            if (rect.contains((int) f, (int) f2)) {
                return i;
            }
            i++;
        }
    }

    public final void o(ArrayList arrayList) {
        for (int i = 0; i < this.q.getValues().size(); i++) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    public final boolean s(int i, int i2, Bundle bundle) {
        wk0 wk0 = this.q;
        if (!wk0.isEnabled()) {
            return false;
        }
        if (i2 == 4096 || i2 == 8192) {
            float f = wk0.h1;
            if (f == c44.DEFAULT_ASPECT_RATIO) {
                f = 1.0f;
            }
            float f2 = (wk0.d1 - wk0.c1) / f;
            float f3 = (float) 20;
            if (f2 > f3) {
                f *= (float) Math.round(f2 / f3);
            }
            if (i2 == 8192) {
                f = -f;
            }
            if (wk0.k()) {
                f = -f;
            }
            if (!wk0.s(h88.k(wk0.getValues().get(i).floatValue() + f, wk0.getValueFrom(), wk0.getValueTo()), i)) {
                return false;
            }
            wk0.v();
            wk0.postInvalidate();
            p(i);
            return true;
        } else if (i2 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") || !wk0.s(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"), i)) {
            return false;
        } else {
            wk0.v();
            wk0.postInvalidate();
            p(i);
            return true;
        }
    }

    public final void u(int i, g4 g4Var) {
        g4Var.b(a4.m);
        wk0 wk0 = this.q;
        List<Float> values = wk0.getValues();
        Float f = values.get(i);
        float floatValue = f.floatValue();
        float valueFrom = wk0.getValueFrom();
        float valueTo = wk0.getValueTo();
        if (wk0.isEnabled()) {
            if (floatValue > valueFrom) {
                g4Var.a(ConstantsKt.DEFAULT_BUFFER_SIZE);
            }
            if (floatValue < valueTo) {
                g4Var.a(ConstantsKt.DEFAULT_BLOCK_SIZE);
            }
        }
        AccessibilityNodeInfo.RangeInfo obtain = AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, floatValue);
        AccessibilityNodeInfo accessibilityNodeInfo = g4Var.a;
        accessibilityNodeInfo.setRangeInfo(obtain);
        g4Var.h(SeekBar.class.getName());
        StringBuilder sb = new StringBuilder();
        if (wk0.getContentDescription() != null) {
            sb.append(wk0.getContentDescription());
            sb.append(",");
        }
        String format = String.format(((float) ((int) floatValue)) == floatValue ? "%.0f" : "%.2f", new Object[]{f});
        String string = wk0.getContext().getString(ymc.material_slider_value);
        if (values.size() > 1) {
            string = i == wk0.getValues().size() - 1 ? wk0.getContext().getString(ymc.material_slider_range_end) : i == 0 ? wk0.getContext().getString(ymc.material_slider_range_start) : "";
        }
        Locale locale = Locale.US;
        sb.append(string + ", " + format);
        g4Var.j(sb.toString());
        Rect rect = this.r;
        wk0.u(i, rect);
        accessibilityNodeInfo.setBoundsInParent(rect);
    }
}
