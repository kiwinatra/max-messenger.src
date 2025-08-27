package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: ze0  reason: default package */
public final class ze0 implements Parcelable {
    public static final Parcelable.Creator<ze0> CREATOR = new s6(10);
    public final ArrayList a;
    public final ArrayList b;

    public ze0(Parcel parcel) {
        this.a = parcel.createStringArrayList();
        this.b = parcel.createTypedArrayList(ye0.CREATOR);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeTypedList(this.b);
    }
}
