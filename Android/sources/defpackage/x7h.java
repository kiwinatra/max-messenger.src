package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.play.core.appupdate.internal.zzy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: x7h  reason: default package */
public final class x7h {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final kn5 b;
    public final String c;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public boolean g;
    public final Intent h;
    public final WeakReference i;
    public final f5h j = new f5h(1, this);
    public final AtomicInteger k = new AtomicInteger(0);
    public v6h l;
    public IInterface m;

    public x7h(Context context, kn5 kn5) {
        Intent intent = a7h.f;
        this.a = context;
        this.b = kn5;
        this.c = "AppUpdateService";
        this.h = intent;
        this.i = new WeakReference((Object) null);
    }

    public static void b(x7h x7h, a6h a6h) {
        IInterface iInterface = x7h.m;
        ArrayList arrayList = x7h.d;
        kn5 kn5 = x7h.b;
        if (iInterface == null && !x7h.g) {
            kn5.d("Initiate binding to the service.", new Object[0]);
            arrayList.add(a6h);
            v6h v6h = new v6h(1, x7h);
            x7h.l = v6h;
            x7h.g = true;
            if (!x7h.a.bindService(x7h.h, v6h, 1)) {
                kn5.d("Failed to bind to the service.", new Object[0]);
                x7h.g = false;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzy zzy = new zzy();
                    qdf qdf = ((a6h) it.next()).a;
                    if (qdf != null) {
                        qdf.c(zzy);
                    }
                }
                arrayList.clear();
            }
        } else if (x7h.g) {
            kn5.d("Waiting to bind to the service.", new Object[0]);
            arrayList.add(a6h);
        } else {
            a6h.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = n;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    hashMap.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(qdf qdf) {
        synchronized (this.f) {
            this.e.remove(qdf);
        }
        a().post(new b7h(0, this));
    }

    public final void d() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((qdf) it.next()).c(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
