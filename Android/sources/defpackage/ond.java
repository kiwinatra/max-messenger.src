package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* renamed from: ond  reason: default package */
public final class ond extends rsb {
    public static final Parcelable.Creator<ond> CREATOR = new g9d(5);
    public int a;
    public int b;
    public int c;

    public ond(AbsSavedState absSavedState) {
        super(absSavedState);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
