package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: m6h  reason: default package */
public final class m6h implements ServiceConnection {
    public int a = 0;
    public final Messenger b;
    public n6h c;
    public final ArrayDeque o;
    public final SparseArray v;
    public final /* synthetic */ m7h w;

    public m6h(m7h m7h) {
        this.w = m7h;
        ws9 ws9 = new ws9(Looper.getMainLooper(), (Handler.Callback) new hv(2, this), 4);
        Looper.getMainLooper();
        this.b = new Messenger(ws9);
        this.o = new ArrayDeque();
        this.v = new SparseArray();
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 112 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(int r1, java.lang.String r2) {
        /*
            r0 = this;
            monitor-enter(r0)
            r1 = 0
            r0.b(r2, r1)     // Catch:{ all -> 0x0009 }
            monitor-exit(r0)
            return
        L_0x0007:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r1
        L_0x0009:
            r1 = move-exception
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m6h.a(int, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [com.google.android.gms.cloudmessaging.zzt, java.lang.Exception] */
    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i = this.a;
            if (i == 0) {
                throw new IllegalStateException();
            } else if (i == 1 || i == 2) {
                this.a = 4;
                li3.a().b((Context) this.w.b, this);
                ? exc = new Exception(str, securityException);
                Iterator it = this.o.iterator();
                while (it.hasNext()) {
                    ((w6h) it.next()).c(exc);
                }
                this.o.clear();
                for (int i2 = 0; i2 < this.v.size(); i2++) {
                    ((w6h) this.v.valueAt(i2)).c(exc);
                }
                this.v.clear();
            } else if (i == 3) {
                this.a = 4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void c() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.a     // Catch:{ all -> 0x0028 }
            r1 = 2
            if (r0 != r1) goto L_0x002a
            java.util.ArrayDeque r0 = r2.o     // Catch:{ all -> 0x0028 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x002a
            android.util.SparseArray r0 = r2.v     // Catch:{ all -> 0x0028 }
            int r0 = r0.size()     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x002a
            r0 = 3
            r2.a = r0     // Catch:{ all -> 0x0028 }
            m7h r0 = r2.w     // Catch:{ all -> 0x0028 }
            li3 r1 = defpackage.li3.a()     // Catch:{ all -> 0x0028 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x0028 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x0028 }
            r1.b(r0, r2)     // Catch:{ all -> 0x0028 }
            monitor-exit(r2)
            return
        L_0x0028:
            r0 = move-exception
            goto L_0x002c
        L_0x002a:
            monitor-exit(r2)
            return
        L_0x002c:
            monitor-exit(r2)     // Catch:{ all -> 0x0028 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m6h.c():void");
    }

    public final synchronized boolean d(w6h w6h) {
        int i = this.a;
        if (i == 0) {
            this.o.add(w6h);
            if (this.a == 0) {
                this.a = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                try {
                    li3 a2 = li3.a();
                    Context context = (Context) this.w.b;
                    if (!a2.c(context, context.getClass().getName(), intent, this, 1, (Executor) null)) {
                        a(0, "Unable to bind to service");
                    } else {
                        ((ScheduledExecutorService) this.w.o).schedule(new a5h(this, 1), 30, TimeUnit.SECONDS);
                    }
                } catch (SecurityException e) {
                    b("Unable to bind to service", e);
                }
            } else {
                throw new IllegalStateException();
            }
        } else if (i == 1) {
            this.o.add(w6h);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.o.add(w6h);
            ((ScheduledExecutorService) this.w.o).execute(new a5h(this, 0));
            return true;
        }
        return true;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ((ScheduledExecutorService) this.w.o).execute(new r1h(1, (Object) this, (Object) iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        ((ScheduledExecutorService) this.w.o).execute(new a5h(this, 2));
    }
}
