package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: z  reason: default package */
public abstract class z implements Parcelable {
    public static final Parcelable.Creator<z> CREATOR = new y(0);
    public static final x b = new z();
    public final Parcelable a;

    public z() {
        this.a = null;
    }

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }

    public z(Parcelable parcelable) {
        if (parcelable != null) {
            this.a = parcelable == b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public z(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.a = readParcelable == null ? b : readParcelable;
    }
}
