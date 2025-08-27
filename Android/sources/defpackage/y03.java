package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: y03  reason: default package */
public final class y03 {
    public final e6h a;

    public y03(e6h e6h) {
        vzg.m(e6h);
        this.a = e6h;
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof y03)) {
            return false;
        }
        try {
            e6h e6h = this.a;
            e6h e6h2 = ((y03) obj).a;
            r5h r5h = (r5h) e6h;
            Parcel H0 = r5h.H0();
            hzg.c(H0, e6h2);
            Parcel R = r5h.R(H0, 17);
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
            r5h r5h = (r5h) this.a;
            Parcel R = r5h.R(r5h.H0(), 18);
            int readInt = R.readInt();
            R.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
