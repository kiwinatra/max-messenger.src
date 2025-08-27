package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: mef  reason: default package */
public final class mef extends h3 {
    public static final Parcelable.Creator<mef> CREATOR = new nje(28);
    public final int a;
    public List b;

    public mef(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.G0(parcel, 1, 4);
        parcel.writeInt(this.a);
        tf6.y0(parcel, this.b, 2);
        tf6.E0(parcel, B0);
    }
}
