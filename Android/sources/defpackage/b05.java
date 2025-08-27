package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* renamed from: b05  reason: default package */
public final class b05 extends rsb {
    public static final Parcelable.Creator<b05> CREATOR = new uv4(1);
    public String a;

    public b05(AbsSavedState absSavedState) {
        super(absSavedState);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
    }
}
