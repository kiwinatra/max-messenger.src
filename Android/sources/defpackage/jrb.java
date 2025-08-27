package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: jrb  reason: default package */
public final class jrb implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new krb(parcel);
    }

    public final Object[] newArray(int i) {
        return new krb[i];
    }
}
