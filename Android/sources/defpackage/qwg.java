package defpackage;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: qwg  reason: default package */
public abstract class qwg {
    public final int a;

    public qwg(int i) {
        this.a = i;
    }

    public static Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), (PendingIntent) null, (bi3) null);
    }

    public abstract void a(Status status);

    public abstract void b(RuntimeException runtimeException);

    public abstract void c(kvg kvg);

    public abstract void d(m8g m8g, boolean z);
}
