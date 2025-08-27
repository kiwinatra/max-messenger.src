package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: izg  reason: default package */
public abstract class izg extends q7h implements e0h {
    public final boolean zzb(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        v7h.b(parcel);
        zza((Bundle) v7h.a(parcel, Bundle.CREATOR));
        return true;
    }
}
