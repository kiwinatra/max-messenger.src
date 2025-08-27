package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: bcg  reason: default package */
public final class bcg extends View.BaseSavedState {
    public static final Parcelable.Creator<bcg> CREATOR = new y(14);
    public int a;
    public int b;
    public Parcelable c;

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
