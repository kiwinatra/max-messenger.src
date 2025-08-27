package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bw7  reason: default package */
public final class bw7 implements Parcelable {
    public static final Parcelable.Creator<bw7> CREATOR = new f27(10);
    public int a;
    public int b;
    public boolean c;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
