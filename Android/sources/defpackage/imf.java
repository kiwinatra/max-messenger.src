package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: imf  reason: default package */
public final class imf extends z {
    public static final Parcelable.Creator<imf> CREATOR = new y(12);
    public int c;
    public boolean o;

    public imf(Parcel parcel) {
        this(parcel, (ClassLoader) null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o ? 1 : 0);
    }

    public imf(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readInt();
        this.o = parcel.readInt() != 0;
    }
}
