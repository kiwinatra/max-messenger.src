package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* renamed from: cuf  reason: default package */
public final class cuf extends rsb {
    public static final Parcelable.Creator<cuf> CREATOR = new nje(15);
    public boolean a;

    public cuf(AbsSavedState absSavedState) {
        super(absSavedState);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a ? 1 : 0);
    }
}
