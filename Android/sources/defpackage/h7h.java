package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.play.core.review.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: h7h  reason: default package */
public final class h7h {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final e35 b;
    public final String c;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public boolean g;
    public final Intent h;
    public final WeakReference i;
    public final f5h j = new f5h(0, this);
    public final AtomicInteger k = new AtomicInteger(0);
    public v6h l;
    public IInterface m;

    public h7h(Context context, e35 e35, Intent intent) {
        this.a = context;
        this.b = e35;
        this.c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
        this.h = intent;
        this.i = new WeakReference((Object) null);
    }

    public static void b(h7h h7h, z4h z4h) {
        IInterface iInterface = h7h.m;
        ArrayList arrayList = h7h.d;
        e35 e35 = h7h.b;
        if (iInterface == null && !h7h.g) {
            e35.a("Initiate binding to the service.", new Object[0]);
            arrayList.add(z4h);
            v6h v6h = new v6h(0, h7h);
            h7h.l = v6h;
            h7h.g = true;
            if (!h7h.a.bindService(h7h.h, v6h, 1)) {
                e35.a("Failed to bind to the service.", new Object[0]);
                h7h.g = false;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzu zzu = new zzu();
                    qdf qdf = ((z4h) it.next()).a;
                    if (qdf != null) {
                        qdf.c(zzu);
                    }
                }
                arrayList.clear();
            }
        } else if (h7h.g) {
            e35.a("Waiting to bind to the service.", new Object[0]);
            arrayList.add(z4h);
        } else {
            z4h.run();
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

    public final void c() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((qdf) it.next()).c(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
