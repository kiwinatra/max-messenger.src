package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: b67  reason: default package */
public final class b67 implements c67 {
    public IBinder c;

    public final void A(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            hi7.b(obtain, bundle);
            this.c.transact(3009, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void D(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            hi7.b(obtain, bundle);
            this.c.transact(3008, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void G0(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            hi7.b(obtain, bundle);
            this.c.transact(3002, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void H(int i, Bundle bundle, Bundle bundle2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            hi7.b(obtain, bundle);
            hi7.b(obtain, bundle2);
            this.c.transact(3013, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void M(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            hi7.b(obtain, bundle);
            this.c.transact(3003, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.c;
    }

    public final void b(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            this.c.transact(3011, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void d(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            this.c.transact(3006, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void r(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            hi7.b(obtain, bundle);
            this.c.transact(3001, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void r0(int i, Bundle bundle, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            hi7.b(obtain, bundle);
            obtain.writeInt(z ? 1 : 0);
            this.c.transact(3007, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
