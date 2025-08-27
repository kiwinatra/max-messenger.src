package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dgf  reason: default package */
public final class dgf implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new egf(parcel.readInt(), parcel.readInt());
    }

    public final Object[] newArray(int i) {
        return new egf[i];
    }
}
