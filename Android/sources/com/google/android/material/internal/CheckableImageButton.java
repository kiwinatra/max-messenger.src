package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    public static final int[] x = {16842912};
    public boolean o;
    public boolean v = true;
    public boolean w = true;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, hdc.imageButtonStyle);
        gag.j(this, new el0(2, this));
    }

    public final boolean isChecked() {
        return this.o;
    }

    public final int[] onCreateDrawableState(int i) {
        return this.o ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), x) : super.onCreateDrawableState(i);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ez2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ez2 ez2 = (ez2) parcelable;
        super.onRestoreInstanceState(ez2.a);
        setChecked(ez2.c);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.Parcelable, z, ez2] */
    public final Parcelable onSaveInstanceState() {
        ? zVar = new z(super.onSaveInstanceState());
        zVar.c = this.o;
        return zVar;
    }

    public void setCheckable(boolean z) {
        if (this.v != z) {
            this.v = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.v && this.o != z) {
            this.o = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.w = z;
    }

    public void setPressed(boolean z) {
        if (this.w) {
            super.setPressed(z);
        }
    }

    public final void toggle() {
        setChecked(!this.o);
    }
}
