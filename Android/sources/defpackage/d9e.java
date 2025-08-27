package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: d9e  reason: default package */
public final class d9e extends z {
    public static final Parcelable.Creator<d9e> CREATOR = new y(10);
    public final int c;

    public d9e(Parcel parcel) {
        this(parcel, (ClassLoader) null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
    }

    public d9e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readInt();
    }

    public d9e(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.c = sideSheetBehavior.h;
    }
}
