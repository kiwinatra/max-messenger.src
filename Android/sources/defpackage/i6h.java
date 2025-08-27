package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: i6h  reason: default package */
public final class i6h implements ServiceConnection {
    public final HashMap a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder o;
    public final g6h v;
    public ComponentName w;
    public final /* synthetic */ d7h x;

    public i6h(d7h d7h, g6h g6h) {
        this.x = d7h;
        this.v = g6h;
    }

    public final void a(String str, Executor executor) {
        this.b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            d7h d7h = this.x;
            li3 li3 = d7h.d;
            Context context = d7h.b;
            boolean c2 = li3.c(context, str, this.v.a(context), this, 4225, executor);
            this.c = c2;
            if (c2) {
                this.x.c.sendMessageDelayed(this.x.c.obtainMessage(1, this.v), this.x.f);
            } else {
                this.b = 2;
                try {
                    d7h d7h2 = this.x;
                    d7h2.d.b(d7h2.b, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.x.a) {
            try {
                this.x.c.removeMessages(1, this.v);
                this.o = iBinder;
                this.w = componentName;
                for (ServiceConnection onServiceConnected : this.a.values()) {
                    onServiceConnected.onServiceConnected(componentName, iBinder);
                }
                this.b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.x.a) {
            try {
                this.x.c.removeMessages(1, this.v);
                this.o = null;
                this.w = componentName;
                for (ServiceConnection onServiceDisconnected : this.a.values()) {
                    onServiceDisconnected.onServiceDisconnected(componentName);
                }
                this.b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
