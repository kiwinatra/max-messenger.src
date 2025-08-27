package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: fq5  reason: default package */
public final class fq5 implements Parcelable {
    public static final Parcelable.Creator<fq5> CREATOR = new uv4(6);
    public final String a;
    public final mc6 b;

    public fq5(String str, mc6 mc6) {
        this.a = str;
        this.b = mc6;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }

    public fq5(Parcel parcel) {
        this.a = parcel.readString();
        this.b = (mc6) parcel.readParcelable(mc6.class.getClassLoader());
    }
}
