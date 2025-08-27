package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: lhe  reason: default package */
public final class lhe extends xge {
    public static final Parcelable.Creator<lhe> CREATOR = new g9d(23);
    public final List a;

    public lhe(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new jhe(parcel));
        }
        this.a = Collections.unmodifiableList(arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            jhe jhe = (jhe) list.get(i2);
            parcel.writeLong(jhe.a);
            parcel.writeByte(jhe.b ? (byte) 1 : 0);
            parcel.writeByte(jhe.c ? (byte) 1 : 0);
            parcel.writeByte(jhe.d ? (byte) 1 : 0);
            List list2 = jhe.f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                hhe hhe = (hhe) list2.get(i3);
                parcel.writeInt(hhe.a);
                parcel.writeLong(hhe.b);
            }
            parcel.writeLong(jhe.e);
            parcel.writeByte(jhe.g ? (byte) 1 : 0);
            parcel.writeLong(jhe.h);
            parcel.writeInt(jhe.i);
            parcel.writeInt(jhe.j);
            parcel.writeInt(jhe.k);
        }
    }

    public lhe(ArrayList arrayList) {
        this.a = Collections.unmodifiableList(arrayList);
    }
}
