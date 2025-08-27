package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: vr7  reason: default package */
public final class vr7 extends h3 {
    public static final Parcelable.Creator<vr7> CREATOR = new ivg(10);
    public final long a;
    public final int b;
    public final boolean c;
    public final o1h o;

    public vr7(long j, int i, boolean z, o1h o1h) {
        this.a = j;
        this.b = i;
        this.c = z;
        this.o = o1h;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vr7)) {
            return false;
        }
        vr7 vr7 = (vr7) obj;
        return this.a == vr7.a && this.b == vr7.b && this.c == vr7.c && kne.o(this.o, vr7.o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str;
        StringBuilder o2 = tr1.o("LastLocationRequest[");
        long j = this.a;
        if (j != LongCompanionObject.MAX_VALUE) {
            o2.append("maxAge=");
            d2h.a(o2, j);
        }
        int i = this.b;
        if (i != 0) {
            o2.append(", ");
            if (i == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i == 1) {
                str = "GRANULARITY_COARSE";
            } else if (i == 2) {
                str = "GRANULARITY_FINE";
            } else {
                throw new IllegalArgumentException();
            }
            o2.append(str);
        }
        if (this.c) {
            o2.append(", bypass");
        }
        o1h o1h = this.o;
        if (o1h != null) {
            o2.append(", impersonation=");
            o2.append(o1h);
        }
        o2.append(']');
        return o2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.G0(parcel, 1, 8);
        parcel.writeLong(this.a);
        tf6.G0(parcel, 2, 4);
        parcel.writeInt(this.b);
        tf6.G0(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        tf6.u0(parcel, 5, this.o, i);
        tf6.E0(parcel, B0);
    }
}
