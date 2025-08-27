package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: sp9  reason: default package */
public final class sp9 implements Parcelable {
    public static final Parcelable.Creator<sp9> CREATOR = new ia9(4);
    public final qp9[] a;
    public final long b;

    public sp9(qp9... qp9Arr) {
        this(-9223372036854775807L, qp9Arr);
    }

    public final sp9 a(qp9... qp9Arr) {
        if (qp9Arr.length == 0) {
            return this;
        }
        int i = v0g.a;
        qp9[] qp9Arr2 = this.a;
        Object[] copyOf = Arrays.copyOf(qp9Arr2, qp9Arr2.length + qp9Arr.length);
        System.arraycopy(qp9Arr, 0, copyOf, qp9Arr2.length, qp9Arr.length);
        return new sp9(this.b, (qp9[]) copyOf);
    }

    public final sp9 b(sp9 sp9) {
        return sp9 == null ? this : a(sp9.a);
    }

    public final qp9 c(int i) {
        return this.a[i];
    }

    public final int d() {
        return this.a.length;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sp9.class != obj.getClass()) {
            return false;
        }
        sp9 sp9 = (sp9) obj;
        return Arrays.equals(this.a, sp9.a) && this.b == sp9.b;
    }

    public final int hashCode() {
        return kr7.y(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        long j = this.b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        qp9[] qp9Arr = this.a;
        parcel.writeInt(qp9Arr.length);
        for (qp9 writeParcelable : qp9Arr) {
            parcel.writeParcelable(writeParcelable, 0);
        }
        parcel.writeLong(this.b);
    }

    public sp9(long j, qp9... qp9Arr) {
        this.b = j;
        this.a = qp9Arr;
    }

    public sp9(List list) {
        this((qp9[]) list.toArray(new qp9[0]));
    }

    public sp9(Parcel parcel) {
        this.a = new qp9[parcel.readInt()];
        int i = 0;
        while (true) {
            qp9[] qp9Arr = this.a;
            if (i < qp9Arr.length) {
                qp9Arr[i] = (qp9) parcel.readParcelable(qp9.class.getClassLoader());
                i++;
            } else {
                this.b = parcel.readLong();
                return;
            }
        }
    }
}
