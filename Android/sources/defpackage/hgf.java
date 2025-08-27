package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: hgf  reason: default package */
public final class hgf implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new igf(parcel.readInt());
    }

    public final Object[] newArray(int i) {
        return new igf[i];
    }
}
