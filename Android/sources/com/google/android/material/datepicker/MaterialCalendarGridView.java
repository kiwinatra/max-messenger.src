package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
import kotlin.jvm.internal.IntCompanionObject;

final class MaterialCalendarGridView extends GridView {
    public final boolean a;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        q0g.d((Calendar) null);
        if (MaterialDatePicker.b3(16843277, getContext())) {
            setNextFocusLeftId(agc.cancel_button);
            setNextFocusRightId(agc.confirm_button);
        }
        this.a = MaterialDatePicker.b3(edc.nestedScrollable, getContext());
        gag.j(this, new rg8(2));
    }

    public final bt9 a() {
        return (bt9) super.getAdapter();
    }

    public final Adapter getAdapter() {
        return (bt9) super.getAdapter();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((bt9) super.getAdapter()).notifyDataSetChanged();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        bt9 bt9 = (bt9) super.getAdapter();
        bt9.getClass();
        int max = Math.max(bt9.a(), getFirstVisiblePosition());
        int min = Math.min(bt9.c(), getLastVisiblePosition());
        bt9.getItem(max);
        bt9.getItem(min);
        throw null;
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
        } else if (i == 33) {
            setSelection(((bt9) super.getAdapter()).c());
        } else if (i == 130) {
            setSelection(((bt9) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((bt9) super.getAdapter()).a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((bt9) super.getAdapter()).a());
        return true;
    }

    public final void onMeasure(int i, int i2) {
        if (this.a) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, IntCompanionObject.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    public final void setSelection(int i) {
        if (i < ((bt9) super.getAdapter()).a()) {
            super.setSelection(((bt9) super.getAdapter()).a());
        } else {
            super.setSelection(i);
        }
    }

    /* renamed from: getAdapter  reason: collision with other method in class */
    public final ListAdapter m2getAdapter() {
        return (bt9) super.getAdapter();
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof bt9) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), bt9.class.getCanonicalName()}));
    }
}
