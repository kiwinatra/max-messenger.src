package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: gv0  reason: default package */
public final class gv0 extends Binder {
    public static final int d = (v0g.a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536);
    public final tb7 c;

    public gv0(List list) {
        this.c = tb7.p(list);
    }

    public static tb7 a(IBinder iBinder) {
        int readInt;
        if (iBinder instanceof gv0) {
            return ((gv0) iBinder).c;
        }
        qb7 o = tb7.o();
        int i = 1;
        int i2 = 0;
        while (i != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i2);
                iBinder.transact(1, obtain, obtain2, 0);
                while (true) {
                    readInt = obtain2.readInt();
                    if (readInt != 1) {
                        break;
                    }
                    Bundle readBundle = obtain2.readBundle();
                    readBundle.getClass();
                    o.a(readBundle);
                    i2++;
                }
                obtain2.recycle();
                obtain.recycle();
                i = readInt;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        return o.j();
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i3 = 0;
        if (parcel2 == null) {
            return false;
        }
        tb7 tb7 = this.c;
        int size = tb7.size();
        int readInt = parcel.readInt();
        while (readInt < size && parcel2.dataSize() < d) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) tb7.get(readInt));
            readInt++;
        }
        if (readInt < size) {
            i3 = 2;
        }
        parcel2.writeInt(i3);
        return true;
    }
}
