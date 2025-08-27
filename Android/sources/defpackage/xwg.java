package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: xwg  reason: default package */
public final class xwg extends h3 {
    public static final Parcelable.Creator<xwg> CREATOR = new ivg(6);
    public final int a;
    public final IBinder b;
    public final bi3 c;
    public final boolean o;
    public final boolean v;

    public xwg(int i, IBinder iBinder, bi3 bi3, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = bi3;
        this.o = z;
        this.v = z2;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwg)) {
            return false;
        }
        xwg xwg = (xwg) obj;
        if (this.c.equals(xwg.c)) {
            Object obj3 = null;
            IBinder iBinder = this.b;
            if (iBinder == null) {
                obj2 = null;
            } else {
                int i = r4.d;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                obj2 = queryLocalInterface instanceof u57 ? (u57) queryLocalInterface : new bvg(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            IBinder iBinder2 = xwg.b;
            if (iBinder2 != null) {
                int i2 = r4.d;
                IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                obj3 = queryLocalInterface2 instanceof u57 ? (u57) queryLocalInterface2 : new bvg(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            if (kne.o(obj2, obj3)) {
                return true;
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int B0 = tf6.B0(parcel, 20293);
        tf6.G0(parcel, 1, 4);
        parcel.writeInt(this.a);
        tf6.t0(parcel, 2, this.b);
        tf6.u0(parcel, 3, this.c, i);
        tf6.G0(parcel, 4, 4);
        parcel.writeInt(this.o ? 1 : 0);
        tf6.G0(parcel, 5, 4);
        parcel.writeInt(this.v ? 1 : 0);
        tf6.E0(parcel, B0);
    }
}
