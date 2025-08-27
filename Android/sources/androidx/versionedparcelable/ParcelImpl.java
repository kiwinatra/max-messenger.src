package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new w0b(1);
    public final t2g a;

    public ParcelImpl(t2g t2g) {
        this.a = t2g;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        new s2g(parcel).l(this.a);
    }

    public ParcelImpl(Parcel parcel) {
        this.a = new s2g(parcel).h();
    }
}
