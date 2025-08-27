package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: krb  reason: default package */
public final class krb extends View.BaseSavedState {
    public static final jrb CREATOR = new Object();
    public final int a;
    public final boolean b;

    public krb(Parcelable parcelable, int i, boolean z) {
        super(parcelable);
        this.a = i;
        this.b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeByte(this.b ? (byte) 1 : 0);
    }

    public krb(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
        this.b = parcel.readByte() > 0;
    }
}
