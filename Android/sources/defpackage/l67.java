package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: l67  reason: default package */
public final class l67 implements m67 {
    public IBinder c;

    public final IBinder asBinder() {
        return this.c;
    }

    public final void m(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(m67.a);
            obtain.writeStringArray(strArr);
            this.c.transact(1, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
