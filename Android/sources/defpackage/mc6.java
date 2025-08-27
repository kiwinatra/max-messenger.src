package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: mc6  reason: default package */
public final class mc6 implements Parcelable {
    public static final Parcelable.Creator<mc6> CREATOR = new y(6);
    public final Bundle a;

    public mc6(Bundle bundle) {
        this.a = bundle;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public mc6(Parcel parcel, ClassLoader classLoader) {
        Bundle readBundle = parcel.readBundle();
        this.a = readBundle;
        if (classLoader != null && readBundle != null) {
            readBundle.setClassLoader(classLoader);
        }
    }
}
