package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: beb  reason: default package */
public final class beb implements Parcelable {
    public static final Parcelable.Creator<beb> CREATOR = new w0b(4);
    public final qdb a;

    public beb(qdb qdb) {
        this.a = qdb;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        qdb qdb = this.a;
        parcel.writeByte(qdb == null ? (byte) 1 : 0);
        if (qdb != null) {
            parcel.writeInt(qdb.a);
            te8.D(parcel, qdb.b);
            te8.D(parcel, qdb.c);
            te8.D(parcel, qdb.d);
            List list = qdb.e;
            if (te8.E(parcel, list)) {
                parcel.writeInt(list.size());
                parcel.writeStringList(list);
            }
            List<Long> list2 = qdb.f;
            byte b = list2 != null ? (byte) 1 : 0;
            parcel.writeByte(b);
            if (b != 0) {
                parcel.writeInt(list2.size());
                for (Long l : list2) {
                    byte b2 = l != null ? (byte) 1 : 0;
                    parcel.writeByte(b2);
                    if (b2 != 0) {
                        parcel.writeLong(l.longValue());
                    }
                }
            }
            te8.D(parcel, qdb.g);
            te8.D(parcel, qdb.h);
        }
    }

    public beb(Parcel parcel) {
        ArrayList arrayList;
        if (!te8.s(parcel)) {
            int readInt = parcel.readInt();
            String u = te8.u(parcel);
            String u2 = te8.u(parcel);
            String u3 = te8.u(parcel);
            ArrayList v = te8.v(parcel);
            if (parcel.readByte() == 1) {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                for (int i = 0; i < readInt2; i++) {
                    arrayList.add(parcel.readByte() == 1 ? Long.valueOf(parcel.readLong()) : null);
                }
            } else {
                arrayList = null;
            }
            this.a = new qdb(readInt, u, u2, u3, v, arrayList, te8.u(parcel), te8.u(parcel));
            return;
        }
        this.a = null;
    }
}
