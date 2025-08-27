package defpackage;

import android.content.res.TypedArray;
import android.view.ViewGroup;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: su6  reason: default package */
public final class su6 extends ViewGroup.MarginLayoutParams {
    public static final int c = (-2147483647 - IntCompanionObject.MIN_VALUE);
    public static final int d = ioc.GridLayout_Layout_android_layout_margin;
    public static final int e = ioc.GridLayout_Layout_android_layout_marginLeft;
    public static final int f = ioc.GridLayout_Layout_android_layout_marginTop;
    public static final int g = ioc.GridLayout_Layout_android_layout_marginRight;
    public static final int h = ioc.GridLayout_Layout_android_layout_marginBottom;
    public static final int i = ioc.GridLayout_Layout_layout_column;
    public static final int j = ioc.GridLayout_Layout_layout_columnSpan;
    public static final int k = ioc.GridLayout_Layout_layout_columnWeight;
    public static final int l = ioc.GridLayout_Layout_layout_row;
    public static final int m = ioc.GridLayout_Layout_layout_rowSpan;
    public static final int n = ioc.GridLayout_Layout_layout_rowWeight;
    public static final int o = ioc.GridLayout_Layout_layout_gravity;
    public uu6 a;
    public uu6 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public su6() {
        super(-2, -2);
        uu6 uu6 = uu6.e;
        this.a = uu6;
        this.b = uu6;
        setMargins(IntCompanionObject.MIN_VALUE, IntCompanionObject.MIN_VALUE, IntCompanionObject.MIN_VALUE, IntCompanionObject.MIN_VALUE);
        this.a = uu6;
        this.b = uu6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || su6.class != obj.getClass()) {
            return false;
        }
        su6 su6 = (su6) obj;
        return this.b.equals(su6.b) && this.a.equals(su6.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final void setBaseAttributes(TypedArray typedArray, int i2, int i3) {
        this.width = typedArray.getLayoutDimension(i2, -2);
        this.height = typedArray.getLayoutDimension(i3, -2);
    }
}
