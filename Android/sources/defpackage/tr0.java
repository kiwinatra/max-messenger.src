package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: tr0  reason: default package */
public final class tr0 extends z {
    public static final Parcelable.Creator<tr0> CREATOR = new y(1);
    public final int c;
    public final int o;
    public final boolean v;
    public final boolean w;
    public final boolean x;

    public tr0(Parcel parcel) {
        this(parcel, (ClassLoader) null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o);
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeInt(this.w ? 1 : 0);
        parcel.writeInt(this.x ? 1 : 0);
    }

    public tr0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readInt();
        this.o = parcel.readInt();
        boolean z = false;
        this.v = parcel.readInt() == 1;
        this.w = parcel.readInt() == 1;
        this.x = parcel.readInt() == 1 ? true : z;
    }

    public tr0(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.c = bottomSheetBehavior.L;
        this.o = bottomSheetBehavior.e;
        this.v = bottomSheetBehavior.b;
        this.w = bottomSheetBehavior.I;
        this.x = bottomSheetBehavior.J;
    }
}
