package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: kvg  reason: default package */
public final class kvg implements ft6, gt6 {
    public final LinkedList c = new LinkedList();
    public final ql d;
    public final bm e;
    public final m8g f;
    public final HashSet g = new HashSet();
    public final HashMap h = new HashMap();
    public final int i;
    public final yvg j;
    public boolean k;
    public final ArrayList l = new ArrayList();
    public bi3 m = null;
    public int n = 0;
    public final /* synthetic */ ht6 o;

    public kvg(ht6 ht6, ct6 ct6) {
        this.o = ht6;
        Looper looper = ht6.v0.getLooper();
        qpg a = ct6.a();
        b33 b33 = new b33((Account) a.a, (Set) (ws) a.b, (String) a.c, (String) a.o);
        cvg cvg = (cvg) ct6.c.c;
        vzg.m(cvg);
        ql f2 = cvg.f(ct6.a, looper, b33, ct6.o, this, this);
        String str = ct6.b;
        if (str != null && (f2 instanceof a)) {
            ((a) f2).A0 = str;
        }
        if (str == null || !(f2 instanceof kaa)) {
            this.d = f2;
            this.e = ct6.v;
            this.f = new m8g();
            this.i = ct6.x;
            if (f2.j()) {
                Context context = ht6.v;
                ws9 ws9 = ht6.v0;
                qpg a2 = ct6.a();
                this.j = new yvg(context, ws9, new b33((Account) a2.a, (Set) (ws) a2.b, (String) a2.c, (String) a2.o));
                return;
            }
            this.j = null;
            return;
        }
        rae.w(f2);
        throw null;
    }

    public final void R(int i2) {
        Looper myLooper = Looper.myLooper();
        ht6 ht6 = this.o;
        if (myLooper == ht6.v0.getLooper()) {
            f(i2);
        } else {
            ht6.v0.post(new tk0(this, i2, 5));
        }
    }

    public final void a(bi3 bi3) {
        HashSet hashSet = this.g;
        Iterator it = hashSet.iterator();
        if (it.hasNext()) {
            rae.w(it.next());
            if (kne.o(bi3, bi3.v)) {
                this.d.d();
            }
            throw null;
        }
        hashSet.clear();
    }

    public final void b(Status status) {
        vzg.h(this.o.v0);
        c(status, (RuntimeException) null, false);
    }

    public final void c(Status status, RuntimeException runtimeException, boolean z) {
        vzg.h(this.o.v0);
        boolean z2 = true;
        boolean z3 = status == null;
        if (runtimeException != null) {
            z2 = false;
        }
        if (z3 != z2) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                qwg qwg = (qwg) it.next();
                if (!z || qwg.a == 2) {
                    if (status != null) {
                        qwg.a(status);
                    } else {
                        qwg.b(runtimeException);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    public final void d() {
        LinkedList linkedList = this.c;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            qwg qwg = (qwg) arrayList.get(i2);
            if (this.d.isConnected()) {
                if (h(qwg)) {
                    linkedList.remove(qwg);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final void e() {
        ql qlVar = this.d;
        ht6 ht6 = this.o;
        vzg.h(ht6.v0);
        this.m = null;
        a(bi3.v);
        if (this.k) {
            ws9 ws9 = ht6.v0;
            bm bmVar = this.e;
            ws9.removeMessages(11, bmVar);
            ht6.v0.removeMessages(9, bmVar);
            this.k = false;
        }
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            wvg wvg = (wvg) it.next();
            wvg.a.getClass();
            try {
                fj fjVar = wvg.a;
                ((t0d) ((m7h) fjVar.c).b).accept(qlVar, new qdf());
            } catch (DeadObjectException unused) {
                R(3);
                qlVar.b("DeadObjectException thrown while calling register listener method.");
            } catch (RemoteException unused2) {
                it.remove();
            }
        }
        d();
        g();
    }

    public final void f(int i2) {
        ht6 ht6 = this.o;
        vzg.h(ht6.v0);
        this.m = null;
        this.k = true;
        String i3 = this.d.i();
        m8g m8g = this.f;
        m8g.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i2 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i2 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (i3 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(i3);
        }
        m8g.d(true, new Status(20, sb.toString(), (PendingIntent) null, (bi3) null));
        ws9 ws9 = ht6.v0;
        bm bmVar = this.e;
        ws9.sendMessageDelayed(Message.obtain(ws9, 9, bmVar), MultiFileUploader.UPLOAD_NEXT_INTERVAL);
        ws9 ws92 = ht6.v0;
        ws92.sendMessageDelayed(Message.obtain(ws92, 11, bmVar), 120000);
        ((SparseIntArray) ht6.x.a).clear();
        for (wvg wvg : this.h.values()) {
            wvg.c.run();
        }
    }

    public final void g() {
        ht6 ht6 = this.o;
        ws9 ws9 = ht6.v0;
        bm bmVar = this.e;
        ws9.removeMessages(12, bmVar);
        ws9 ws92 = ht6.v0;
        ws92.sendMessageDelayed(ws92.obtainMessage(12, bmVar), ht6.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(defpackage.qwg r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof defpackage.ovg
            java.lang.String r1 = "DeadObjectException thrown while running ApiCallRunner."
            r2 = 1
            if (r0 != 0) goto L_0x001d
            ql r0 = r14.d
            boolean r3 = r0.j()
            m8g r4 = r14.f
            r15.d(r4, r3)
            r15.c(r14)     // Catch:{ DeadObjectException -> 0x0016 }
            goto L_0x001c
        L_0x0016:
            r14.R(r2)
            r0.b(r1)
        L_0x001c:
            return r2
        L_0x001d:
            r0 = r15
            ovg r0 = (defpackage.ovg) r0
            tj5[] r3 = r0.g(r14)
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x0072
            int r6 = r3.length
            if (r6 != 0) goto L_0x002c
            goto L_0x0072
        L_0x002c:
            ql r6 = r14.d
            tj5[] r6 = r6.h()
            if (r6 != 0) goto L_0x0036
            tj5[] r6 = new defpackage.tj5[r4]
        L_0x0036:
            ts r7 = new ts
            int r8 = r6.length
            r7.<init>(r8)
            r8 = r4
        L_0x003d:
            int r9 = r6.length
            if (r8 >= r9) goto L_0x0052
            r9 = r6[r8]
            java.lang.String r10 = r9.a
            long r11 = r9.b()
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            r7.put(r10, r9)
            int r8 = r8 + 1
            goto L_0x003d
        L_0x0052:
            int r6 = r3.length
            r8 = r4
        L_0x0054:
            if (r8 >= r6) goto L_0x0072
            r9 = r3[r8]
            java.lang.String r10 = r9.a
            java.lang.Object r10 = r7.get(r10)
            java.lang.Long r10 = (java.lang.Long) r10
            if (r10 == 0) goto L_0x0073
            long r10 = r10.longValue()
            long r12 = r9.b()
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L_0x006f
            goto L_0x0073
        L_0x006f:
            int r8 = r8 + 1
            goto L_0x0054
        L_0x0072:
            r9 = r5
        L_0x0073:
            if (r9 != 0) goto L_0x008b
            ql r0 = r14.d
            boolean r3 = r0.j()
            m8g r4 = r14.f
            r15.d(r4, r3)
            r15.c(r14)     // Catch:{ DeadObjectException -> 0x0084 }
            goto L_0x008a
        L_0x0084:
            r14.R(r2)
            r0.b(r1)
        L_0x008a:
            return r2
        L_0x008b:
            ql r15 = r14.d
            r15.getClass()
            ht6 r15 = r14.o
            boolean r15 = r15.w0
            if (r15 == 0) goto L_0x00fe
            boolean r15 = r0.f(r14)
            if (r15 == 0) goto L_0x00fe
            bm r15 = r14.e
            lvg r0 = new lvg
            r0.<init>(r15, r9)
            java.util.ArrayList r15 = r14.l
            int r15 = r15.indexOf(r0)
            r1 = 5000(0x1388, double:2.4703E-320)
            r3 = 15
            if (r15 < 0) goto L_0x00ca
            java.util.ArrayList r0 = r14.l
            java.lang.Object r15 = r0.get(r15)
            lvg r15 = (defpackage.lvg) r15
            ht6 r0 = r14.o
            ws9 r0 = r0.v0
            r0.removeMessages(r3, r15)
            ht6 r14 = r14.o
            ws9 r14 = r14.v0
            android.os.Message r15 = android.os.Message.obtain(r14, r3, r15)
            r14.sendMessageDelayed(r15, r1)
            goto L_0x00fd
        L_0x00ca:
            java.util.ArrayList r15 = r14.l
            r15.add(r0)
            ht6 r15 = r14.o
            ws9 r15 = r15.v0
            android.os.Message r3 = android.os.Message.obtain(r15, r3, r0)
            r15.sendMessageDelayed(r3, r1)
            ht6 r15 = r14.o
            ws9 r15 = r15.v0
            r1 = 16
            android.os.Message r0 = android.os.Message.obtain(r15, r1, r0)
            r1 = 120000(0x1d4c0, double:5.9288E-319)
            r15.sendMessageDelayed(r0, r1)
            bi3 r15 = new bi3
            r0 = 2
            r15.<init>(r0, r5)
            boolean r0 = r14.i(r15)
            if (r0 != 0) goto L_0x00fd
            ht6 r0 = r14.o
            int r14 = r14.i
            r0.b(r15, r14)
        L_0x00fd:
            return r4
        L_0x00fe:
            com.google.android.gms.common.api.UnsupportedApiCallException r14 = new com.google.android.gms.common.api.UnsupportedApiCallException
            r14.<init>(r9)
            r0.b(r14)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kvg.h(qwg):boolean");
    }

    public final boolean i(bi3 bi3) {
        synchronized (ht6.z0) {
            this.o.getClass();
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [ce, lj0, java.lang.Object] */
    public final void j() {
        ht6 ht6 = this.o;
        vzg.h(ht6.v0);
        ql qlVar = this.d;
        if (!qlVar.isConnected() && !qlVar.c()) {
            try {
                o9g o9g = ht6.x;
                Context context = ht6.v;
                o9g.getClass();
                vzg.m(context);
                int f2 = qlVar.f();
                SparseIntArray sparseIntArray = (SparseIntArray) o9g.a;
                int i2 = sparseIntArray.get(f2, -1);
                if (i2 == -1) {
                    i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= sparseIntArray.size()) {
                            i2 = -1;
                            break;
                        }
                        int keyAt = sparseIntArray.keyAt(i3);
                        if (keyAt > f2 && sparseIntArray.get(keyAt) == 0) {
                            break;
                        }
                        i3++;
                    }
                    if (i2 == -1) {
                        i2 = ((et6) o9g.b).b(f2, context);
                    }
                    sparseIntArray.put(f2, i2);
                }
                if (i2 != 0) {
                    bi3 bi3 = new bi3(i2, (PendingIntent) null);
                    bi3.toString();
                    m(bi3, (RuntimeException) null);
                    return;
                }
                bm bmVar = this.e;
                ? obj = new Object();
                obj.w = ht6;
                obj.o = null;
                obj.v = null;
                obj.a = false;
                obj.b = qlVar;
                obj.c = bmVar;
                if (qlVar.j()) {
                    yvg yvg = this.j;
                    vzg.m(yvg);
                    f9e f9e = yvg.i;
                    if (f9e != null) {
                        f9e.disconnect();
                    }
                    Integer valueOf = Integer.valueOf(System.identityHashCode(yvg));
                    b33 b33 = yvg.h;
                    b33.y = valueOf;
                    Handler handler = yvg.e;
                    yvg.i = (f9e) yvg.f.f(yvg.d, handler.getLooper(), b33, (g9e) b33.x, yvg, yvg);
                    yvg.j = obj;
                    Set set = yvg.g;
                    if (set == null || set.isEmpty()) {
                        handler.post(new haf(16, (Object) yvg));
                    } else {
                        yvg.i.w();
                    }
                }
                try {
                    qlVar.e(obj);
                } catch (SecurityException e2) {
                    m(new bi3(10), e2);
                }
            } catch (IllegalStateException e3) {
                m(new bi3(10), e3);
            }
        }
    }

    public final void k(qwg qwg) {
        vzg.h(this.o.v0);
        boolean isConnected = this.d.isConnected();
        LinkedList linkedList = this.c;
        if (!isConnected) {
            linkedList.add(qwg);
            bi3 bi3 = this.m;
            if (bi3 == null || bi3.b == 0 || bi3.c == null) {
                j();
            } else {
                m(bi3, (RuntimeException) null);
            }
        } else if (h(qwg)) {
            g();
        } else {
            linkedList.add(qwg);
        }
    }

    public final void l(bi3 bi3) {
        m(bi3, (RuntimeException) null);
    }

    public final void m(bi3 bi3, RuntimeException runtimeException) {
        f9e f9e;
        vzg.h(this.o.v0);
        yvg yvg = this.j;
        if (!(yvg == null || (f9e = yvg.i) == null)) {
            f9e.disconnect();
        }
        vzg.h(this.o.v0);
        this.m = null;
        ((SparseIntArray) this.o.x.a).clear();
        a(bi3);
        if ((this.d instanceof twg) && bi3.b != 24) {
            ht6 ht6 = this.o;
            ht6.b = true;
            ws9 ws9 = ht6.v0;
            ws9.sendMessageDelayed(ws9.obtainMessage(19), 300000);
        }
        if (bi3.b == 4) {
            b(ht6.y0);
        } else if (this.c.isEmpty()) {
            this.m = bi3;
        } else if (runtimeException != null) {
            vzg.h(this.o.v0);
            c((Status) null, runtimeException, false);
        } else if (this.o.w0) {
            c(ht6.c(this.e, bi3), (RuntimeException) null, true);
            if (!this.c.isEmpty() && !i(bi3) && !this.o.b(bi3, this.i)) {
                if (bi3.b == 18) {
                    this.k = true;
                }
                if (this.k) {
                    ht6 ht62 = this.o;
                    bm bmVar = this.e;
                    ws9 ws92 = ht62.v0;
                    ws92.sendMessageDelayed(Message.obtain(ws92, 9, bmVar), MultiFileUploader.UPLOAD_NEXT_INTERVAL);
                    return;
                }
                b(ht6.c(this.e, bi3));
            }
        } else {
            b(ht6.c(this.e, bi3));
        }
    }

    public final void n(bi3 bi3) {
        vzg.h(this.o.v0);
        ql qlVar = this.d;
        String name = qlVar.getClass().getName();
        String valueOf = String.valueOf(bi3);
        qlVar.b("onSignInFailed for " + name + " with " + valueOf);
        m(bi3, (RuntimeException) null);
    }

    public final void o() {
        vzg.h(this.o.v0);
        Status status = ht6.x0;
        b(status);
        this.f.d(false, status);
        for (f08 jwg : (f08[]) this.h.keySet().toArray(new f08[0])) {
            k(new jwg(jwg, new qdf()));
        }
        a(new bi3(4));
        ql qlVar = this.d;
        if (qlVar.isConnected()) {
            qlVar.g(new z3a(17, this));
        }
    }

    public final void onConnected() {
        Looper myLooper = Looper.myLooper();
        ht6 ht6 = this.o;
        if (myLooper == ht6.v0.getLooper()) {
            e();
        } else {
            ht6.v0.post(new haf(14, (Object) this));
        }
    }
}
