package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: k5h  reason: default package */
public abstract class k5h extends q7h implements s5h {
    public final boolean zzb(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        v7h.b(parcel);
        zza((Bundle) v7h.a(parcel, Bundle.CREATOR));
        return true;
    }
}
