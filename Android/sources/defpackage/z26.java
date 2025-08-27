package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: z26  reason: default package */
public final class z26 implements Parcelable {
    public static final Parcelable.Creator<z26> CREATOR = new uv4(12);
    public final String a;
    public final boolean b;

    public z26(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
