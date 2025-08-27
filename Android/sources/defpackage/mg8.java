package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: mg8  reason: default package */
public final class mg8 extends z {
    public static final Parcelable.Creator<mg8> CREATOR = new y(7);
    public boolean c;

    public mg8(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            mg8.class.getClassLoader();
        }
        this.c = parcel.readInt() != 1 ? false : true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
