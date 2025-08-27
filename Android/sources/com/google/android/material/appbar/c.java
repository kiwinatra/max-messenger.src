package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;

public final class c implements Parcelable.ClassLoaderCreator {
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new d(parcel, classLoader);
    }

    public final Object[] newArray(int i) {
        return new d[i];
    }

    public final Object createFromParcel(Parcel parcel) {
        return new d(parcel, (ClassLoader) null);
    }
}
