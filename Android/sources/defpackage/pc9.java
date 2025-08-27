package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: pc9  reason: default package */
public final class pc9 implements Parcelable {
    public static final Parcelable.Creator<pc9> CREATOR = new ia9(1);
    public final mc9 a;

    public pc9(mc9 mc9) {
        this.a = mc9;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        mc9 mc9 = this.a;
        parcel.writeByte(mc9 == null ? (byte) 1 : 0);
        if (mc9 != null) {
            parcel.writeParcelable(new hd9(mc9.c), i);
            parcel.writeInt(mc9.a);
            parcel.writeLong(mc9.b);
            parcel.writeString(mc9.d);
            parcel.writeString(mc9.e);
            parcel.writeLong(mc9.f);
            parcel.writeLong(mc9.g);
        }
    }

    public pc9(Parcel parcel) {
        if (!te8.s(parcel)) {
            this.a = new mc9(parcel.readInt(), parcel.readLong(), ((hd9) parcel.readParcelable(hd9.class.getClassLoader())).a, parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong());
            return;
        }
        this.a = null;
    }
}
