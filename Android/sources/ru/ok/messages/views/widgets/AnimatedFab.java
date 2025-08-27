package ru.ok.messages.views.widgets;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;

public class AnimatedFab extends jr5 {
    public boolean D0 = true;

    public AnimatedFab(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle;
        super.onRestoreInstanceState(parcelable);
        if ((parcelable instanceof ae5) && (bundle = (Bundle) ((ae5) parcelable).c.get("animated-fab:enabled")) != null) {
            boolean z = bundle.getBoolean("animated-fab:enabled");
            this.D0 = z;
            if (!z) {
                d(new gf(this, 1), true);
            } else {
                f(new gf(this, 0), true);
            }
        }
    }

    public final Parcelable onSaveInstanceState() {
        ae5 ae5 = (ae5) super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putBoolean("animated-fab:enabled", this.D0);
        ae5.c.put("animated-fab:enabled", bundle);
        return ae5;
    }

    public void setReversed(boolean z) {
    }
}
