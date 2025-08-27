package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.LazyKt;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: f7a  reason: default package */
public class f7a implements vt {
    public static f7a e;
    public int a;
    public Object b;
    public final Object c;
    public final Object d;

    public f7a(Context context, String str) {
        this.c = context;
        this.d = str;
        this.a = -1;
        this.b = LazyKt.lazy(new ve(11, (Object) this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000e, code lost:
        r0 = ((java.util.concurrent.CopyOnWriteArrayList) r3.d).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        if (r0.hasNext() == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        r1 = (java.lang.ref.WeakReference) r0.next();
        r2 = (defpackage.tc4) r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r2 == null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        r2.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        ((java.util.concurrent.CopyOnWriteArrayList) r3.d).remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(defpackage.f7a r3, int r4) {
        /*
            java.lang.Object r0 = r3.b
            monitor-enter(r0)
            int r1 = r3.a     // Catch:{ all -> 0x0009 }
            if (r1 != r4) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            goto L_0x0036
        L_0x0009:
            r3 = move-exception
            goto L_0x0037
        L_0x000b:
            r3.a = r4     // Catch:{ all -> 0x0009 }
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            java.lang.Object r0 = r3.d
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            tc4 r2 = (defpackage.tc4) r2
            if (r2 == 0) goto L_0x002e
            r2.a(r4)
            goto L_0x0016
        L_0x002e:
            java.lang.Object r2 = r3.d
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            r2.remove(r1)
            goto L_0x0016
        L_0x0036:
            return
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f7a.b(f7a, int):void");
    }

    public int a(jq5 jq5) {
        if (this.a == 2) {
            tc5 tc5 = (tc5) this.b;
            jq5.b = Math.min((int) ((tc5.h() * 100) / tc5.e()), 99);
        }
        return this.a;
    }

    public Object c() {
        Object removeLast;
        synchronized (this.b) {
            removeLast = ((ArrayDeque) this.c).removeLast();
        }
        return removeLast;
    }

    public void d(Object obj) {
        Object c2;
        synchronized (this.b) {
            try {
                c2 = ((ArrayDeque) this.c).size() >= this.a ? c() : null;
                ((ArrayDeque) this.c).addFirst(obj);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (((ts1) this.d) != null && c2 != null) {
            ((ha7) c2).close();
        }
    }

    public wb7 e() {
        cs csVar = new cs(4);
        o5h o5h = (o5h) this.d;
        String str = (String) o5h.b;
        if (str != null) {
            csVar.F(1, str);
        }
        String str2 = (String) o5h.c;
        if (str2 != null) {
            csVar.F(2, str2);
        }
        return csVar.h();
    }

    public boolean f() {
        boolean isEmpty;
        synchronized (this.b) {
            isEmpty = ((ArrayDeque) this.c).isEmpty();
        }
        return isEmpty;
    }

    public void release() {
        ((tc5) this.b).release();
        this.a = 0;
    }

    public void start() {
        ir8 ir8 = ((e05) this.c).a;
        tc5 tc5 = (tc5) this.b;
        tc5.getClass();
        tc5.z0(tb7.t(ir8));
        tc5.prepare();
        this.a = 1;
    }

    public f7a(Context context, scf scf, ro4 ro4) {
        this.c = context;
        this.d = scf;
        ro4.getClass();
        this.a = vo4.b((int) 170.0f);
    }

    public f7a(cs csVar) {
        csVar.getClass();
        this.a = csVar.b;
        this.c = new Object();
        this.d = (m74) csVar.c;
        this.b = (zq0) csVar.o;
    }

    public f7a(int i, ts1 ts1) {
        this.b = new Object();
        this.a = i;
        this.c = new ArrayDeque(i);
        this.d = ts1;
    }

    public f7a(Context context) {
        this.c = new Handler(Looper.getMainLooper());
        this.d = new CopyOnWriteArrayList();
        this.b = new Object();
        this.a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new ao(10, this), intentFilter);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [o5h, java.lang.Object] */
    public f7a(Context context, e05 e05, lz8 lz8, m7h m7h, int i, Looper looper, ut utVar, c7f c7f) {
        Context context2 = context;
        e05 e052 = e05;
        c7f c7f2 = c7f;
        this.c = e052;
        ? obj = new Object();
        obj.a = m7h;
        this.d = obj;
        sj4 sj4 = new sj4(context2);
        cj4 cj4 = new cj4(context2);
        cj4.z = true;
        cj4.M = false;
        sj4.b(new ej4(cj4));
        tg4.a("bufferForPlaybackMs", 250, 0, "0");
        tg4.a("bufferForPlaybackAfterRebufferMs", 500, 0, "0");
        tg4.a("minBufferMs", 50000, 250, "bufferForPlaybackMs");
        tg4.a("minBufferMs", 50000, 500, "bufferForPlaybackAfterRebufferMs");
        tg4.a("maxBufferMs", 50000, 50000, "minBufferMs");
        tg4 tg4 = new tg4(new cb4(1), 250, 500);
        yb5 yb5 = r4;
        yb5 yb52 = new yb5(e052.b, e052.c, e052.d, obj, i, utVar);
        vb5 vb5 = new vb5(context2, new ch4(6, yb5), new tb5(context2, 4));
        n79.n(!vb5.v);
        vb5.d = new ch4(2, lz8);
        n79.n(!vb5.v);
        vb5.e = new ch4(3, sj4);
        n79.n(!vb5.v);
        vb5.f = new ch4(7, tg4);
        n79.n(!vb5.v);
        looper.getClass();
        vb5.i = looper;
        n79.n(!vb5.v);
        vb5.u = false;
        long j = v0g.O() ? MultiFileUploader.UPLOAD_NEXT_INTERVAL : 500;
        n79.n(!vb5.v);
        vb5.s = j;
        if (c7f2 != c7f.a) {
            n79.n(!vb5.v);
            vb5.b = c7f2;
        }
        tc5 a2 = vb5.a();
        this.b = a2;
        a2.Z.c(new xb5(this, utVar));
        this.a = 0;
    }
}
