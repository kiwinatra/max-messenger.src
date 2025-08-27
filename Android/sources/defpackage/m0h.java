package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: m0h  reason: default package */
public final class m0h implements x2h, IInterface {
    public final IBinder c;

    public m0h(IBinder iBinder) {
        this.c = iBinder;
    }

    public final IBinder asBinder() {
        return this.c;
    }

    public final Parcel l(Parcel parcel, int i) {
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
}
