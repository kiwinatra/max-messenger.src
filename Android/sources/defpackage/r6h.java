package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: r6h  reason: default package */
public final class r6h implements e7h, IInterface {
    public final IBinder c;

    public r6h(IBinder iBinder) {
        this.c = iBinder;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [d5h, android.os.IBinder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void H0(java.lang.String r3, android.os.Bundle r4, defpackage.d5h r5) {
        /*
            r2 = this;
            android.os.Parcel r0 = r2.I0()
            r1 = 18
            r0.writeInt(r1)
            r0.writeString(r3)
            int r3 = defpackage.v7h.a
            r3 = 1
            r0.writeInt(r3)
            r3 = 0
            r4.writeToParcel(r0, r3)
            r0.writeStrongBinder(r5)
            r3 = 1301(0x515, float:1.823E-42)
            r2.K0(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r6h.H0(java.lang.String, android.os.Bundle, d5h):void");
    }

    public final Parcel I0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
        return obtain;
    }

    public final Parcel J0(Parcel parcel, int i) {
        parcel = Parcel.obtain();
        try {
            this.c.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public final void K0(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.c.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final void L0(Parcel parcel, int i) {
        try {
            this.c.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final Bundle R(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel I0 = I0();
        I0.writeInt(i);
        I0.writeString(str);
        I0.writeString(str2);
        int i2 = v7h.a;
        I0.writeInt(1);
        bundle.writeToParcel(I0, 0);
        I0.writeInt(1);
        bundle2.writeToParcel(I0, 0);
        Parcel J0 = J0(I0, 901);
        Bundle bundle3 = (Bundle) v7h.a(J0, Bundle.CREATOR);
        J0.recycle();
        return bundle3;
    }

    public final IBinder asBinder() {
        return this.c;
    }

    public final int l(int i, String str, String str2, Bundle bundle) {
        Parcel I0 = I0();
        I0.writeInt(i);
        I0.writeString(str);
        I0.writeString(str2);
        int i2 = v7h.a;
        I0.writeInt(1);
        bundle.writeToParcel(I0, 0);
        Parcel J0 = J0(I0, 10);
        int readInt = J0.readInt();
        J0.recycle();
        return readInt;
    }
}
