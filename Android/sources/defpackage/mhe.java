package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: mhe  reason: default package */
public final class mhe extends yge {
    public static final Parcelable.Creator<mhe> CREATOR = new g9d(24);
    public final List a;

    public mhe(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new khe(parcel));
        }
        this.a = Collections.unmodifiableList(arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            khe khe = (khe) list.get(i2);
            parcel.writeLong(khe.a);
            parcel.writeByte(khe.b ? (byte) 1 : 0);
            parcel.writeByte(khe.c ? (byte) 1 : 0);
            parcel.writeByte(khe.d ? (byte) 1 : 0);
            List list2 = khe.f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                ihe ihe = (ihe) list2.get(i3);
                parcel.writeInt(ihe.a);
                parcel.writeLong(ihe.b);
            }
            parcel.writeLong(khe.e);
            parcel.writeByte(khe.g ? (byte) 1 : 0);
            parcel.writeLong(khe.h);
            parcel.writeInt(khe.i);
            parcel.writeInt(khe.j);
            parcel.writeInt(khe.k);
        }
    }

    public mhe(ArrayList arrayList) {
        this.a = Collections.unmodifiableList(arrayList);
    }
}
