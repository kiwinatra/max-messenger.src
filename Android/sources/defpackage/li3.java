package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: li3  reason: default package */
public final class li3 {
    public static final Object b = new Object();
    public static volatile li3 c;
    public final ConcurrentHashMap a;

    public li3(int i) {
        switch (i) {
            case 1:
                this.a = new ConcurrentHashMap(16);
                return;
            default:
                this.a = new ConcurrentHashMap();
                return;
        }
    }

    public static li3 a() {
        if (c == null) {
            synchronized (b) {
                try {
                    if (c == null) {
                        c = new li3(0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        li3 li3 = c;
        vzg.m(li3);
        return li3;
    }

    public void b(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof i6h)) {
            ConcurrentHashMap concurrentHashMap = this.a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public boolean c(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        boolean z;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((rqg.a(context).a.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!(serviceConnection instanceof i6h)) {
            ConcurrentHashMap concurrentHashMap = this.a;
            ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
            if (!(serviceConnection2 == null || serviceConnection == serviceConnection2)) {
                String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()});
            }
            if (executor == null) {
                executor = null;
            }
            if (executor != null) {
                try {
                    z = context.bindService(intent, i, executor, serviceConnection);
                } catch (Throwable th) {
                    concurrentHashMap.remove(serviceConnection, serviceConnection);
                    throw th;
                }
            } else {
                z = context.bindService(intent, serviceConnection, i);
            }
            if (z) {
                return z;
            }
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            return false;
        }
        if (executor == null) {
            executor = null;
        }
        return executor != null ? context.bindService(intent, i, executor, serviceConnection) : context.bindService(intent, serviceConnection, i);
    }
}
