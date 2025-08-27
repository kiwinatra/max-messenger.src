package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ae5  reason: default package */
public final class ae5 extends z {
    public static final Parcelable.Creator<ae5> CREATOR = new y(5);
    public final qae c;

    public ae5(Parcelable parcelable) {
        super(parcelable);
        this.c = new qae(0);
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.c + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        qae qae = this.c;
        int i2 = qae.c;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = (String) qae.f(i3);
            bundleArr[i3] = (Bundle) qae.i(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ae5(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.c = new qae(readInt);
        for (int i = 0; i < readInt; i++) {
            this.c.put(strArr[i], bundleArr[i]);
        }
    }
}
