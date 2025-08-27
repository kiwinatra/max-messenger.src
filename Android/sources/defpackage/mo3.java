package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mo3  reason: default package */
public final class mo3 implements Parcelable {
    public static final Parcelable.Creator<mo3> CREATOR = new j22(14);
    public final fo3 a;

    public mo3(fo3 fo3) {
        this.a = fo3;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        fo3 fo3 = this.a;
        parcel.writeByte(fo3 == null ? (byte) 1 : 0);
        if (fo3 != null) {
            parcel.writeLong(fo3.a);
            parcel.writeLong(fo3.b);
            te8.D(parcel, fo3.c);
            te8.D(parcel, fo3.o);
            parcel.writeSerializable((Serializable) fo3.v);
            parcel.writeLong(fo3.w);
            parcel.writeLong(fo3.x);
            parcel.writeSerializable(fo3.y);
            parcel.writeInt(tr1.y(fo3.z));
            parcel.writeSerializable((Serializable) fo3.X);
        }
    }

    public mo3(Parcel parcel) {
        if (!te8.s(parcel)) {
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            String u = te8.u(parcel);
            String u2 = te8.u(parcel);
            List list = (List) parcel.readSerializable();
            long readLong3 = parcel.readLong();
            long readLong4 = parcel.readLong();
            os3 os3 = (os3) parcel.readSerializable();
            int readInt = parcel.readInt();
            int i = 1;
            if (readInt == 1) {
                i = 2;
            } else if (readInt == 2) {
                i = 3;
            }
            List list2 = (List) parcel.readSerializable();
            this.a = new fo3(readLong, readLong2, u, u2, list, readLong3, readLong4, os3, i, list2 == null ? new ArrayList() : list2, (String) null, (String) null, (String) null, (ak3) null, (int[]) null);
            return;
        }
        this.a = null;
    }
}
