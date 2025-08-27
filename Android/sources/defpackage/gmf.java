package defpackage;

import android.view.ViewGroup;

/* renamed from: gmf  reason: default package */
public final class gmf extends ViewGroup.MarginLayoutParams {
    public int a;
    public int b;

    public gmf(int i, int i2) {
        super(i, i2);
        this.b = 0;
        this.a = 8388627;
    }

    public gmf(gmf gmf) {
        super(gmf);
        this.a = 0;
        this.a = gmf.a;
    }

    public gmf(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
