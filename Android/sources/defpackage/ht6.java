package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.work.WorkRequest;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ht6  reason: default package */
public final class ht6 implements Handler.Callback {
    public static ht6 A0;
    public static final Status x0 = new Status(4, "Sign-out occurred while this API call was in progress.", (PendingIntent) null, (bi3) null);
    public static final Status y0 = new Status(4, "The user must be signed in to make this API call.", (PendingIntent) null, (bi3) null);
    public static final Object z0 = new Object();
    public final ConcurrentHashMap X = new ConcurrentHashMap(5, 0.75f, 1);
    public final ws Y = new ws(0);
    public final ws Z = new ws(0);
    public long a = WorkRequest.MIN_BACKOFF_MILLIS;
    public boolean b = false;
    public mef c;
    public swg o;
    public final Context v;
    public final ws9 v0;
    public final dt6 w;
    public volatile boolean w0 = true;
    public final o9g x;
    public final AtomicInteger y = new AtomicInteger(1);
    public final AtomicInteger z = new AtomicInteger(0);

    public ht6(Context context, Looper looper) {
        dt6 dt6 = dt6.d;
        this.v = context;
        ws9 ws9 = new ws9(looper, (Handler.Callback) this, 2);
        Looper.getMainLooper();
        this.v0 = ws9;
        this.w = dt6;
        this.x = new o9g();
        PackageManager packageManager = context.getPackageManager();
        if (b59.u == null) {
            b59.u = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (b59.u.booleanValue()) {
            this.w0 = false;
        }
        ws9.sendMessage(ws9.obtainMessage(6));
    }

    public static Status c(bm bmVar, bi3 bi3) {
        return new Status(17, g63.j("API: ", (String) bmVar.b.b, " is not available on this device. Connection failed with: ", String.valueOf(bi3)), bi3.c, bi3);
    }

    public static ht6 f(Context context) {
        ht6 ht6;
        HandlerThread handlerThread;
        synchronized (z0) {
            if (A0 == null) {
                synchronized (d7h.h) {
                    try {
                        handlerThread = d7h.j;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            d7h.j = handlerThread2;
                            handlerThread2.start();
                            handlerThread = d7h.j;
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = dt6.c;
                A0 = new ht6(applicationContext, looper);
            }
            ht6 = A0;
        }
        return ht6;
    }

    public final boolean a() {
        if (this.b) {
            return false;
        }
        c8d c8d = (c8d) b8d.n().a;
        if (c8d != null && !c8d.b) {
            return false;
        }
        int i = ((SparseIntArray) this.x.a).get(203400000, -1);
        return i == -1 || i == 0;
    }

    public final boolean b(bi3 bi3, int i) {
        PendingIntent pendingIntent;
        boolean z2;
        PendingIntent pendingIntent2;
        Boolean bool;
        dt6 dt6 = this.w;
        Context context = this.v;
        dt6.getClass();
        synchronized (hi7.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = hi7.a;
            pendingIntent = null;
            if (!(context2 == null || (bool = hi7.b) == null)) {
                if (context2 == applicationContext) {
                    z2 = bool.booleanValue();
                }
            }
            hi7.b = null;
            boolean isInstantApp = applicationContext.getPackageManager().isInstantApp();
            hi7.b = Boolean.valueOf(isInstantApp);
            hi7.a = applicationContext;
            z2 = isInstantApp;
        }
        if (z2) {
            return false;
        }
        int i2 = bi3.b;
        if (i2 == 0 || (pendingIntent2 = bi3.c) == null) {
            Intent a2 = dt6.a(i2, context, (String) null);
            if (a2 != null) {
                pendingIntent = PendingIntent.getActivity(context, 0, a2, 201326592);
            }
            pendingIntent2 = pendingIntent;
        }
        if (pendingIntent2 == null) {
            return false;
        }
        int i3 = bi3.b;
        int i4 = GoogleApiActivity.b;
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent2);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        dt6.f(context, i3, PendingIntent.getActivity(context, 0, intent, uwg.a | 134217728));
        return true;
    }

    public final kvg d(ct6 ct6) {
        ConcurrentHashMap concurrentHashMap = this.X;
        bm bmVar = ct6.v;
        kvg kvg = (kvg) concurrentHashMap.get(bmVar);
        if (kvg == null) {
            kvg = new kvg(this, ct6);
            concurrentHashMap.put(bmVar, kvg);
        }
        if (kvg.d.j()) {
            this.Z.add(bmVar);
        }
        kvg.j();
        return kvg;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [y62, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(defpackage.qdf r7, int r8, defpackage.ct6 r9) {
        /*
            r6 = this;
            if (r8 == 0) goto L_0x007a
            bm r9 = r9.v
            boolean r0 = r6.a()
            if (r0 != 0) goto L_0x000b
            goto L_0x0047
        L_0x000b:
            b8d r0 = defpackage.b8d.n()
            java.lang.Object r0 = r0.a
            c8d r0 = (defpackage.c8d) r0
            r1 = 1
            if (r0 == 0) goto L_0x0049
            boolean r2 = r0.b
            if (r2 == 0) goto L_0x0047
            java.util.concurrent.ConcurrentHashMap r2 = r6.X
            java.lang.Object r2 = r2.get(r9)
            kvg r2 = (defpackage.kvg) r2
            if (r2 == 0) goto L_0x0044
            ql r3 = r2.d
            boolean r4 = r3 instanceof com.google.android.gms.common.internal.a
            if (r4 == 0) goto L_0x0047
            com.google.android.gms.common.internal.a r3 = (com.google.android.gms.common.internal.a) r3
            h5h r4 = r3.D0
            if (r4 == 0) goto L_0x0044
            boolean r4 = r3.c()
            if (r4 != 0) goto L_0x0044
            ki3 r0 = defpackage.y62.b(r2, r3, r8)
            if (r0 == 0) goto L_0x0047
            int r3 = r2.n
            int r3 = r3 + r1
            r2.n = r3
            boolean r1 = r0.c
            goto L_0x0049
        L_0x0044:
            boolean r1 = r0.c
            goto L_0x0049
        L_0x0047:
            r8 = 0
            goto L_0x0069
        L_0x0049:
            y62 r0 = new y62
            r2 = 0
            if (r1 == 0) goto L_0x0054
            long r4 = java.lang.System.currentTimeMillis()
            goto L_0x0055
        L_0x0054:
            r4 = r2
        L_0x0055:
            if (r1 == 0) goto L_0x005b
            long r2 = android.os.SystemClock.elapsedRealtime()
        L_0x005b:
            r0.<init>()
            r0.o = r6
            r0.a = r8
            r0.v = r9
            r0.b = r4
            r0.c = r2
            r8 = r0
        L_0x0069:
            if (r8 == 0) goto L_0x007a
            s7h r7 = r7.a
            ws9 r6 = r6.v0
            r6.getClass()
            il7 r9 = new il7
            r9.<init>((android.os.Handler) r6)
            r7.b(r9, r8)
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht6.e(qdf, int, ct6):void");
    }

    public final void g(bi3 bi3, int i) {
        if (!b(bi3, i)) {
            ws9 ws9 = this.v0;
            ws9.sendMessage(ws9.obtainMessage(5, i, 0, bi3));
        }
    }

    /* JADX WARNING: type inference failed for: r1v22, types: [swg, ct6] */
    /* JADX WARNING: type inference failed for: r6v3, types: [swg, ct6] */
    /* JADX WARNING: type inference failed for: r1v23, types: [swg, ct6] */
    public final boolean handleMessage(Message message) {
        kvg kvg;
        tj5[] g;
        int i = message.what;
        ws9 ws9 = this.v0;
        ConcurrentHashMap concurrentHashMap = this.X;
        long j = 300000;
        switch (i) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = WorkRequest.MIN_BACKOFF_MILLIS;
                }
                this.a = j;
                ws9.removeMessages(12);
                for (bm obtainMessage : concurrentHashMap.keySet()) {
                    ws9.sendMessageDelayed(ws9.obtainMessage(12, obtainMessage), this.a);
                }
                break;
            case 2:
                rae.w(message.obj);
                throw null;
            case 3:
                for (kvg kvg2 : concurrentHashMap.values()) {
                    vzg.h(kvg2.o.v0);
                    kvg2.m = null;
                    kvg2.j();
                }
                break;
            case 4:
            case 8:
            case 13:
                vvg vvg = (vvg) message.obj;
                kvg kvg3 = (kvg) concurrentHashMap.get(vvg.c.v);
                if (kvg3 == null) {
                    kvg3 = d(vvg.c);
                }
                boolean j2 = kvg3.d.j();
                qwg qwg = vvg.a;
                if (j2 && this.z.get() != vvg.b) {
                    qwg.a(x0);
                    kvg3.o();
                    break;
                } else {
                    kvg3.k(qwg);
                    break;
                }
                break;
            case 5:
                int i2 = message.arg1;
                bi3 bi3 = (bi3) message.obj;
                Iterator it = concurrentHashMap.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        kvg = (kvg) it.next();
                        if (kvg.i == i2) {
                        }
                    } else {
                        kvg = null;
                    }
                }
                if (kvg == null) {
                    Log.wtf("GoogleApiManager", a81.j(i2, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                    break;
                } else {
                    int i3 = bi3.b;
                    if (i3 != 13) {
                        kvg.b(c(kvg.e, bi3));
                        break;
                    } else {
                        this.w.getClass();
                        int i4 = ot6.e;
                        StringBuilder p = tr1.p("Error resolution was canceled by the user, original error message: ", bi3.b(i3), ": ");
                        p.append(bi3.o);
                        kvg.b(new Status(17, p.toString(), (PendingIntent) null, (bi3) null));
                        break;
                    }
                }
            case 6:
                Context context = this.v;
                if (context.getApplicationContext() instanceof Application) {
                    hf0.a((Application) context.getApplicationContext());
                    hf0 hf0 = hf0.v;
                    jvg jvg = new jvg(this);
                    hf0.getClass();
                    synchronized (hf0) {
                        hf0.c.add(jvg);
                    }
                    AtomicBoolean atomicBoolean = hf0.b;
                    boolean z2 = atomicBoolean.get();
                    AtomicBoolean atomicBoolean2 = hf0.a;
                    if (!z2) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean2.set(true);
                        }
                    }
                    if (!atomicBoolean2.get()) {
                        this.a = 300000;
                        break;
                    }
                }
                break;
            case 7:
                d((ct6) message.obj);
                break;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    kvg kvg4 = (kvg) concurrentHashMap.get(message.obj);
                    vzg.h(kvg4.o.v0);
                    if (kvg4.k) {
                        kvg4.j();
                        break;
                    }
                }
                break;
            case 10:
                ws wsVar = this.Z;
                wsVar.getClass();
                ps psVar = new ps(wsVar);
                while (psVar.hasNext()) {
                    kvg kvg5 = (kvg) concurrentHashMap.remove((bm) psVar.next());
                    if (kvg5 != null) {
                        kvg5.o();
                    }
                }
                wsVar.clear();
                break;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    kvg kvg6 = (kvg) concurrentHashMap.get(message.obj);
                    ht6 ht6 = kvg6.o;
                    vzg.h(ht6.v0);
                    boolean z3 = kvg6.k;
                    if (z3) {
                        if (z3) {
                            ht6 ht62 = kvg6.o;
                            ws9 ws92 = ht62.v0;
                            bm bmVar = kvg6.e;
                            ws92.removeMessages(11, bmVar);
                            ht62.v0.removeMessages(9, bmVar);
                            kvg6.k = false;
                        }
                        kvg6.b(ht6.w.b(et6.a, ht6.v) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", (PendingIntent) null, (bi3) null) : new Status(22, "API failed to connect while resuming due to an unknown error.", (PendingIntent) null, (bi3) null));
                        kvg6.d.b("Timing out connection while resuming.");
                        break;
                    }
                }
                break;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    kvg kvg7 = (kvg) concurrentHashMap.get(message.obj);
                    vzg.h(kvg7.o.v0);
                    ql qlVar = kvg7.d;
                    if (qlVar.isConnected() && kvg7.h.isEmpty()) {
                        m8g m8g = kvg7.f;
                        if (((Map) m8g.a).isEmpty() && ((Map) m8g.b).isEmpty()) {
                            qlVar.b("Timing out service connection.");
                            break;
                        } else {
                            kvg7.g();
                            break;
                        }
                    }
                }
                break;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                rae.w(message.obj);
                throw null;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                lvg lvg = (lvg) message.obj;
                if (concurrentHashMap.containsKey(lvg.a)) {
                    kvg kvg8 = (kvg) concurrentHashMap.get(lvg.a);
                    if (kvg8.l.contains(lvg) && !kvg8.k) {
                        if (kvg8.d.isConnected()) {
                            kvg8.d();
                            break;
                        } else {
                            kvg8.j();
                            break;
                        }
                    }
                }
                break;
            case 16:
                lvg lvg2 = (lvg) message.obj;
                if (concurrentHashMap.containsKey(lvg2.a)) {
                    kvg kvg9 = (kvg) concurrentHashMap.get(lvg2.a);
                    if (kvg9.l.remove(lvg2)) {
                        ht6 ht63 = kvg9.o;
                        ht63.v0.removeMessages(15, lvg2);
                        ht63.v0.removeMessages(16, lvg2);
                        LinkedList linkedList = kvg9.c;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        Iterator it2 = linkedList.iterator();
                        while (true) {
                            boolean hasNext = it2.hasNext();
                            tj5 tj5 = lvg2.b;
                            if (!hasNext) {
                                int size = arrayList.size();
                                for (int i5 = 0; i5 < size; i5++) {
                                    qwg qwg2 = (qwg) arrayList.get(i5);
                                    linkedList.remove(qwg2);
                                    qwg2.b(new UnsupportedApiCallException(tj5));
                                }
                                break;
                            } else {
                                qwg qwg3 = (qwg) it2.next();
                                if ((qwg3 instanceof ovg) && (g = ((ovg) qwg3).g(kvg9)) != null) {
                                    int length = g.length;
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 < length) {
                                            if (!kne.o(g[i6], tj5)) {
                                                i6++;
                                            } else if (i6 >= 0) {
                                                arrayList.add(qwg3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case LangUtils.HASH_SEED /*17*/:
                mef mef = this.c;
                if (mef != null) {
                    if (mef.a > 0 || a()) {
                        if (this.o == null) {
                            this.o = new ct6(this.v, swg.Y, (pl) oef.b, bt6.c);
                        }
                        this.o.d(mef);
                    }
                    this.c = null;
                    break;
                }
                break;
            case 18:
                uvg uvg = (uvg) message.obj;
                int i7 = (uvg.c > 0 ? 1 : (uvg.c == 0 ? 0 : -1));
                lq9 lq9 = uvg.a;
                int i8 = uvg.b;
                if (i7 != 0) {
                    mef mef2 = this.c;
                    if (mef2 != null) {
                        List list = mef2.b;
                        if (mef2.a != i8 || (list != null && list.size() >= uvg.d)) {
                            ws9.removeMessages(17);
                            mef mef3 = this.c;
                            if (mef3 != null) {
                                if (mef3.a > 0 || a()) {
                                    if (this.o == null) {
                                        this.o = new ct6(this.v, swg.Y, (pl) oef.b, bt6.c);
                                    }
                                    this.o.d(mef3);
                                }
                                this.c = null;
                            }
                        } else {
                            mef mef4 = this.c;
                            if (mef4.b == null) {
                                mef4.b = new ArrayList();
                            }
                            mef4.b.add(lq9);
                        }
                    }
                    if (this.c == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(lq9);
                        this.c = new mef(i8, arrayList2);
                        ws9.sendMessageDelayed(ws9.obtainMessage(17), uvg.c);
                        break;
                    }
                } else {
                    mef mef5 = new mef(i8, Arrays.asList(new lq9[]{lq9}));
                    if (this.o == null) {
                        this.o = new ct6(this.v, swg.Y, (pl) oef.b, bt6.c);
                    }
                    this.o.d(mef5);
                    break;
                }
                break;
            case 19:
                this.b = false;
                break;
            default:
                return false;
        }
        return true;
    }
}
