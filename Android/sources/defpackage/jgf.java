package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: jgf  reason: default package */
public final class jgf implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new kgf(parcel.readInt(), parcel.readArrayList(Object.class.getClassLoader()));
    }

    public final Object[] newArray(int i) {
        return new kgf[i];
    }
}
