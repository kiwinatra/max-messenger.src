package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* renamed from: zsb  reason: default package */
public final class zsb extends rsb {
    public static final Parcelable.Creator<zsb> CREATOR = new w0b(13);
    public final int a;

    public zsb(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }

    public zsb(AbsSavedState absSavedState, int i) {
        super(absSavedState);
        this.a = i;
    }
}
