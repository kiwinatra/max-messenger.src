package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: d0d  reason: default package */
public final class d0d extends iw8 implements ServiceConnection {
    public static final boolean z0 = Log.isLoggable("MediaRouteProviderProxy", 3);
    public final ws9 X;
    public final ArrayList Y = new ArrayList();
    public boolean Z;
    public boolean v0;
    public yzc w0;
    public boolean x0;
    public y3a y0;
    public final ComponentName z;

    public d0d(Context context, ComponentName componentName) {
        super(context, new vs6(28, (Object) componentName));
        this.z = componentName;
        this.X = new ws9();
    }

    public final gw8 c(String str) {
        if (str != null) {
            jw8 jw8 = this.x;
            if (jw8 != null) {
                List list = jw8.c;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (((nv8) list.get(i)).c().equals(str)) {
                        b0d b0d = new b0d(this, str);
                        this.Y.add(b0d);
                        if (this.x0) {
                            b0d.b(this.w0);
                        }
                        m();
                        return b0d;
                    }
                }
            }
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public final hw8 d(String str) {
        if (str != null) {
            return j(str, (String) null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public final hw8 e(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        } else if (str2 != null) {
            return j(str, str2);
        } else {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
    }

    public final void f(pv8 pv8) {
        if (this.x0) {
            yzc yzc = this.w0;
            int i = yzc.d;
            yzc.d = i + 1;
            yzc.b(10, i, 0, pv8 != null ? pv8.a : null, (Bundle) null);
        }
        m();
    }

    public final void i() {
        if (!this.v0) {
            boolean z2 = z0;
            if (z2) {
                toString();
            }
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.z);
            try {
                boolean bindService = this.a.bindService(intent, this, 4097);
                this.v0 = bindService;
                if (!bindService && z2) {
                    toString();
                }
            } catch (SecurityException unused) {
                if (z2) {
                    toString();
                }
            }
        }
    }

    public final c0d j(String str, String str2) {
        jw8 jw8 = this.x;
        if (jw8 == null) {
            return null;
        }
        List list = jw8.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((nv8) list.get(i)).c().equals(str)) {
                c0d c0d = new c0d(this, str, str2);
                this.Y.add(c0d);
                if (this.x0) {
                    c0d.b(this.w0);
                }
                m();
                return c0d;
            }
        }
        return null;
    }

    public final void k() {
        if (this.w0 != null) {
            g((jw8) null);
            this.x0 = false;
            ArrayList arrayList = this.Y;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((zzc) arrayList.get(i)).c();
            }
            yzc yzc = this.w0;
            yzc.b(2, 0, 0, (Bundle) null, (Bundle) null);
            yzc.b.b.clear();
            yzc.a.getBinder().unlinkToDeath(yzc, 0);
            yzc.i.X.post(new xzc(yzc, 0));
            this.w0 = null;
        }
    }

    public final void l() {
        if (this.v0) {
            if (z0) {
                toString();
            }
            this.v0 = false;
            k();
            try {
                this.a.unbindService(this);
            } catch (IllegalArgumentException unused) {
                toString();
            }
        }
    }

    public final void m() {
        if (!this.Z || (this.v == null && this.Y.isEmpty())) {
            l();
        } else {
            i();
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z2 = z0;
        if (z2) {
            toString();
        }
        if (this.v0) {
            k();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        yzc yzc = new yzc(this, messenger);
                        int i = yzc.d;
                        yzc.d = i + 1;
                        yzc.g = i;
                        if (yzc.b(1, i, 4, (Bundle) null, (Bundle) null)) {
                            try {
                                yzc.a.getBinder().linkToDeath(yzc, 0);
                                this.w0 = yzc;
                                return;
                            } catch (RemoteException unused) {
                                yzc.binderDied();
                            }
                        }
                        if (z2) {
                            toString();
                            return;
                        }
                        return;
                    }
                } catch (NullPointerException unused2) {
                }
            }
            toString();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (z0) {
            toString();
        }
        k();
    }

    public final String toString() {
        return "Service connection " + this.z.flattenToShortString();
    }
}
