package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;

public class Flow extends kdg {
    public cs5 v0;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [cy6, cs5] */
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        ? cy6 = new cy6();
        cy6.s0 = 0;
        cy6.t0 = 0;
        cy6.u0 = 0;
        cy6.v0 = 0;
        cy6.w0 = 0;
        cy6.x0 = 0;
        cy6.y0 = false;
        cy6.z0 = 0;
        cy6.A0 = 0;
        cy6.B0 = new xl0(0);
        cy6.C0 = null;
        cy6.D0 = -1;
        cy6.E0 = -1;
        cy6.F0 = -1;
        cy6.G0 = -1;
        cy6.H0 = -1;
        cy6.I0 = -1;
        cy6.J0 = 0.5f;
        cy6.K0 = 0.5f;
        cy6.L0 = 0.5f;
        cy6.M0 = 0.5f;
        cy6.N0 = 0.5f;
        cy6.O0 = 0.5f;
        cy6.P0 = 0;
        cy6.Q0 = 0;
        cy6.R0 = 2;
        cy6.S0 = 2;
        cy6.T0 = 0;
        cy6.U0 = -1;
        cy6.V0 = 0;
        cy6.W0 = new ArrayList();
        cy6.X0 = null;
        cy6.Y0 = null;
        cy6.Z0 = null;
        cy6.b1 = 0;
        this.v0 = cy6;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, doc.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == doc.ConstraintLayout_Layout_android_orientation) {
                    this.v0.V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == doc.ConstraintLayout_Layout_android_padding) {
                    cs5 cs5 = this.v0;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    cs5.s0 = dimensionPixelSize;
                    cs5.t0 = dimensionPixelSize;
                    cs5.u0 = dimensionPixelSize;
                    cs5.v0 = dimensionPixelSize;
                } else if (index == doc.ConstraintLayout_Layout_android_paddingStart) {
                    cs5 cs52 = this.v0;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    cs52.u0 = dimensionPixelSize2;
                    cs52.w0 = dimensionPixelSize2;
                    cs52.x0 = dimensionPixelSize2;
                } else if (index == doc.ConstraintLayout_Layout_android_paddingEnd) {
                    this.v0.v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == doc.ConstraintLayout_Layout_android_paddingLeft) {
                    this.v0.w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == doc.ConstraintLayout_Layout_android_paddingTop) {
                    this.v0.s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == doc.ConstraintLayout_Layout_android_paddingRight) {
                    this.v0.x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == doc.ConstraintLayout_Layout_android_paddingBottom) {
                    this.v0.t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == doc.ConstraintLayout_Layout_flow_wrapMode) {
                    this.v0.T0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == doc.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.v0.D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == doc.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.v0.E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == doc.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.v0.F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == doc.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.v0.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == doc.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.v0.G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == doc.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.v0.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == doc.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.v0.J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == doc.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.v0.L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == doc.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.v0.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == doc.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.v0.M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == doc.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.v0.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == doc.ConstraintLayout_Layout_flow_verticalBias) {
                    this.v0.K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == doc.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.v0.R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == doc.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.v0.S0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == doc.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.v0.P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == doc.ConstraintLayout_Layout_flow_verticalGap) {
                    this.v0.Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == doc.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.v0.U0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.o = this.v0;
        k();
    }

    public final void i(tj3 tj3, boolean z) {
        cs5 cs5 = this.v0;
        int i = cs5.u0;
        if (i <= 0 && cs5.v0 <= 0) {
            return;
        }
        if (z) {
            cs5.w0 = cs5.v0;
            cs5.x0 = i;
            return;
        }
        cs5.w0 = i;
        cs5.x0 = cs5.v0;
    }

    public final void l(cs5 cs5, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (cs5 != null) {
            cs5.V(mode, size, mode2, size2);
            setMeasuredDimension(cs5.z0, cs5.A0);
            return;
        }
        setMeasuredDimension(0, 0);
    }

    public final void onMeasure(int i, int i2) {
        l(this.v0, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.v0.L0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.v0.F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.v0.M0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.v0.G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.v0.R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.v0.J0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.v0.P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.v0.D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.v0.N0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.v0.H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.v0.O0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.v0.I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.v0.U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.v0.V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        cs5 cs5 = this.v0;
        cs5.s0 = i;
        cs5.t0 = i;
        cs5.u0 = i;
        cs5.v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.v0.t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.v0.w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.v0.x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.v0.s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.v0.S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.v0.K0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.v0.Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.v0.E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.v0.T0 = i;
        requestLayout();
    }
}
