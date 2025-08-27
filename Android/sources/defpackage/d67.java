package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.IMediaControllerCallback;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: d67  reason: default package */
public final class d67 implements e67 {
    public IBinder c;

    public final IBinder asBinder() {
        return this.c;
    }

    public final void g(mob mob) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            if (mob != null) {
                obtain.writeInt(1);
                mob.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.c.transact(3, obtain, (Parcel) null, 1)) {
                int i = to8.d;
            }
            obtain.recycle();
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public final void onQueueTitleChanged(CharSequence charSequence) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            if (charSequence != null) {
                obtain.writeInt(1);
                TextUtils.writeToParcel(charSequence, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.c.transact(6, obtain, (Parcel) null, 1)) {
                int i = to8.d;
            }
            obtain.recycle();
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public final void onRepeatModeChanged(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            obtain.writeInt(i);
            if (!this.c.transact(9, obtain, (Parcel) null, 1)) {
                int i2 = to8.d;
            }
        } finally {
            obtain.recycle();
        }
    }

    public final void onSessionDestroyed() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            if (!this.c.transact(2, obtain, (Parcel) null, 1)) {
                int i = to8.d;
            }
        } finally {
            obtain.recycle();
        }
    }

    public final void onShuffleModeChanged(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            obtain.writeInt(i);
            if (!this.c.transact(12, obtain, (Parcel) null, 1)) {
                int i2 = to8.d;
            }
        } finally {
            obtain.recycle();
        }
    }

    public final void q(ArrayList arrayList) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            obtain.writeTypedList(arrayList);
            if (!this.c.transact(5, obtain, (Parcel) null, 1)) {
                int i = to8.d;
            }
        } finally {
            obtain.recycle();
        }
    }

    public final void t(j8b j8b) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            if (j8b != null) {
                obtain.writeInt(1);
                j8b.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.c.transact(8, obtain, (Parcel) null, 1)) {
                int i = to8.d;
            }
            obtain.recycle();
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public final void z0(vs8 vs8) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMediaControllerCallback.DESCRIPTOR);
            if (vs8 != null) {
                obtain.writeInt(1);
                obtain.writeBundle(vs8.a);
            } else {
                obtain.writeInt(0);
            }
            if (!this.c.transact(4, obtain, (Parcel) null, 1)) {
                int i = to8.d;
            }
            obtain.recycle();
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}
