package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: iqb  reason: default package */
public final class iqb {
    public final fyg a;

    public iqb(fyg fyg) {
        vzg.m(fyg);
        this.a = fyg;
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof iqb)) {
            return false;
        }
        try {
            fyg fyg = this.a;
            fyg fyg2 = ((iqb) obj).a;
            byg byg = (byg) fyg;
            Parcel H0 = byg.H0();
            hzg.c(H0, fyg2);
            Parcel R = byg.R(H0, 15);
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
            byg byg = (byg) this.a;
            Parcel R = byg.R(byg.H0(), 16);
            int readInt = R.readInt();
            R.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
