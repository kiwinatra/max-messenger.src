package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: yo  reason: default package */
public final class yo extends View.BaseSavedState {
    public static final Parcelable.Creator<yo> CREATOR = new s6(5);
    public boolean a;

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.a ? (byte) 1 : 0);
    }
}
