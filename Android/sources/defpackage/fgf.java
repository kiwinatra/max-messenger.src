package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: fgf  reason: default package */
public final class fgf implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new ggf(parcel.readArrayList(Object.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }

    public final Object[] newArray(int i) {
        return new ggf[i];
    }
}
