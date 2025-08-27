package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ox8  reason: default package */
public final class ox8 implements Parcelable {
    public static final Parcelable.Creator<ox8> CREATOR = new f27(27);
    public final Object a = new Object();
    public final Object b;
    public h67 c;
    public t2g o;

    public ox8(Object obj, h67 h67) {
        this.b = obj;
        this.c = h67;
        this.o = null;
    }

    public final h67 a() {
        h67 h67;
        synchronized (this.a) {
            h67 = this.c;
        }
        return h67;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox8)) {
            return false;
        }
        ox8 ox8 = (ox8) obj;
        Object obj2 = this.b;
        if (obj2 == null) {
            return ox8.b == null;
        }
        Object obj3 = ox8.b;
        if (obj3 == null) {
            return false;
        }
        return obj2.equals(obj3);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) this.b, i);
    }
}
