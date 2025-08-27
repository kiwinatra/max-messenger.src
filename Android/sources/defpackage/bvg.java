package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bvg  reason: default package */
public abstract class bvg implements IInterface {
    public final /* synthetic */ int c;
    public final IBinder d;
    public final String e;

    public /* synthetic */ bvg(IBinder iBinder, String str, int i) {
        this.c = i;
        this.d = iBinder;
        this.e = str;
    }

    public Parcel H0() {
        switch (this.c) {
            case 1:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(this.e);
                return obtain;
            case 2:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(this.e);
                return obtain2;
            default:
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken(this.e);
                return obtain3;
        }
    }

    public void I0(Parcel parcel, int i) {
        switch (this.c) {
            case 2:
                Parcel obtain = Parcel.obtain();
                try {
                    this.d.transact(i, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                    parcel.recycle();
                    obtain.recycle();
                }
            case 3:
                Parcel obtain2 = Parcel.obtain();
                try {
                    this.d.transact(i, parcel, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    parcel.recycle();
                    obtain2.recycle();
                }
            default:
                Parcel obtain3 = Parcel.obtain();
                try {
                    this.d.transact(i, parcel, obtain3, 0);
                    obtain3.readException();
                    return;
                } finally {
                    parcel.recycle();
                    obtain3.recycle();
                }
        }
    }

    public Parcel R(Parcel parcel, int i) {
        parcel = Parcel.obtain();
        try {
            this.d.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        switch (this.c) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            case 2:
                return this.d;
            case 3:
                return this.d;
            default:
                return this.d;
        }
    }

    public Parcel l(Parcel parcel, int i) {
        parcel = Parcel.obtain();
        try {
            this.d.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }
}
