package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: rs9  reason: default package */
public final class rs9 extends ss9 {
    public static final Parcelable.Creator<rs9> CREATOR = new ia9(8);
    public final List a;
    public final boolean b;

    public rs9(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        List<ikb> list = this.a;
        parcel.writeInt(list.size());
        for (ikb writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.b ? 1 : 0);
    }
}
