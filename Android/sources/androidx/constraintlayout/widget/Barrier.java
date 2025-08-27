package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashMap;

public class Barrier extends dj3 {
    public ii0 v0;
    public int y;
    public int z;

    public Barrier(Context context) {
        super(context);
        this.a = new int[32];
        this.x = new HashMap();
        this.c = context;
        h((AttributeSet) null);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.v0.t0;
    }

    public int getMargin() {
        return this.v0.u0;
    }

    public int getType() {
        return this.y;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [cy6, ii0] */
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        ? cy6 = new cy6();
        cy6.s0 = 0;
        cy6.t0 = true;
        cy6.u0 = 0;
        cy6.v0 = false;
        this.v0 = cy6;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, doc.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == doc.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == doc.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.v0.t0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == doc.ConstraintLayout_Layout_barrierMargin) {
                    this.v0.u0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.o = this.v0;
        k();
    }

    public final void i(tj3 tj3, boolean z2) {
        int i = this.y;
        this.z = i;
        if (z2) {
            if (i == 5) {
                this.z = 1;
            } else if (i == 6) {
                this.z = 0;
            }
        } else if (i == 5) {
            this.z = 0;
        } else if (i == 6) {
            this.z = 1;
        }
        if (tj3 instanceof ii0) {
            ((ii0) tj3).s0 = this.z;
        }
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.v0.t0 = z2;
    }

    public void setDpMargin(int i) {
        this.v0.u0 = (int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.v0.u0 = i;
    }

    public void setType(int i) {
        this.y = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
