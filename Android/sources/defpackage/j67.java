package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: j67  reason: default package */
public final class j67 implements k67 {
    public IBinder c;

    public final IBinder asBinder() {
        return this.c;
    }

    public final void e0(c67 c67, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSessionService");
            obtain.writeStrongInterface(c67);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.c.transact(3001, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
