package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: mf8  reason: default package */
public class mf8 {
    public final uxg a;

    public mf8(uxg uxg) {
        this.a = uxg;
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof mf8)) {
            return false;
        }
        try {
            uxg uxg = this.a;
            uxg uxg2 = ((mf8) obj).a;
            oxg oxg = (oxg) uxg;
            Parcel H0 = oxg.H0();
            hzg.c(H0, uxg2);
            Parcel R = oxg.R(H0, 16);
            if (R.readInt() != 0) {
                z = true;
            }
            R.recycle();
            return z;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final int hashCode() {
        try {
            oxg oxg = (oxg) this.a;
            Parcel R = oxg.R(oxg.H0(), 17);
            int readInt = R.readInt();
            R.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
