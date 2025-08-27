package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: j68  reason: default package */
public final class j68 extends h3 {
    public static final Parcelable.Creator<j68> CREATOR = new ivg(17);
    public final List a;
    public final boolean b;
    public final boolean c;

    public j68(ArrayList arrayList, boolean z, boolean z2) {
        this.a = arrayList;
        this.b = z;
        this.c = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.y0(parcel, Collections.unmodifiableList(this.a), 1);
        tf6.G0(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        tf6.G0(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        tf6.E0(parcel, B0);
    }
}
