package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: qy8  reason: default package */
public final class qy8 extends Binder implements k67 {
    public final WeakReference c;
    public final Handler d;
    public final ny8 e;
    public final Set f = Collections.synchronizedSet(new HashSet());

    public qy8(ry8 ry8) {
        attachInterface(this, "androidx.media3.session.IMediaSessionService");
        this.c = new WeakReference(ry8);
        Context applicationContext = ry8.getApplicationContext();
        this.d = new Handler(applicationContext.getMainLooper());
        this.e = ny8.a(applicationContext);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, j67, k67] */
    public static k67 l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSessionService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof k67)) {
            return (k67) queryLocalInterface;
        }
        ? obj = new Object();
        obj.c = iBinder;
        return obj;
    }

    public final IBinder asBinder() {
        return this;
    }

    public final void e0(c67 c67, Bundle bundle) {
        if (c67 != null && bundle != null) {
            try {
                ai3 a = ai3.a(bundle);
                if (this.c.get() == null) {
                    try {
                        c67.d(0);
                    } catch (RemoteException unused) {
                    }
                } else {
                    int callingPid = Binder.getCallingPid();
                    int callingUid = Binder.getCallingUid();
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    if (callingPid == 0) {
                        callingPid = a.d;
                    }
                    ly8 ly8 = new ly8(a.c, callingPid, callingUid);
                    boolean b = this.e.b(ly8);
                    this.f.add(c67);
                    try {
                        this.d.post(new bt8(this, c67, ly8, a, b, 1));
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            } catch (RuntimeException e2) {
                i8b.W("Ignoring malformed Bundle for ConnectionRequest", e2);
            }
        }
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSessionService");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSessionService");
            return true;
        } else if (i != 3001) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            e0(wp8.l(parcel.readStrongBinder()), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            return true;
        }
    }
}
