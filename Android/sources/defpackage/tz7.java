package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* renamed from: tz7  reason: default package */
public final class tz7 extends rsb {
    public static final Parcelable.Creator<tz7> CREATOR = new f27(12);
    public String a;

    public tz7(AbsSavedState absSavedState) {
        super(absSavedState);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
    }
}
