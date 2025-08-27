package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.SystemClock;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.fragment.app.b;
import com.google.android.gms.common.api.ResolvableApiException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.apache.http.HttpStatus;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.messages.views.dialogs.FrgDlgPermissions;
import ru.ok.messages.views.fragments.base.FrgBase;

/* renamed from: eud  reason: default package */
public final class eud implements i74, wz8, iw4, i68, ojb, yn1, mcg {
    public static eud w;
    public static final /* synthetic */ int x = 0;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object o;
    public Object v;

    public /* synthetic */ eud(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
        this.v = obj4;
    }

    public static synchronized eud j() {
        eud eud;
        synchronized (eud.class) {
            try {
                if (w == null) {
                    w = new eud(0);
                }
                eud = w;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return eud;
    }

    public static boolean t(int i) {
        return i == 169 || i == 175;
    }

    public void A(int i, nz8 nz8, l28 l28, es8 es8) {
        if (w(i, nz8)) {
            ((cs) this.c).D(l28, x(es8, nz8));
        }
    }

    public void B(int i, nz8 nz8) {
        if (w(i, nz8)) {
            ((gw4) this.o).c();
        }
    }

    public void C(int i, nz8 nz8, es8 es8) {
        if (w(i, nz8)) {
            ((cs) this.c).M(x(es8, nz8));
        }
    }

    public void D(int i, nz8 nz8) {
        if (w(i, nz8)) {
            ((gw4) this.o).b();
        }
    }

    public void E(int i, nz8 nz8) {
        if (w(i, nz8)) {
            ((gw4) this.o).a();
        }
    }

    public void F(int i, nz8 nz8) {
        if (w(i, nz8)) {
            ((gw4) this.o).f();
        }
    }

    public void G(int i, nz8 nz8, es8 es8) {
        if (w(i, nz8)) {
            ((cs) this.c).m(x(es8, nz8));
        }
    }

    public void H(JSONObject jSONObject) {
        try {
            ((Function2) this.b).invoke(b51.w0, new p51(d(jSONObject)));
        } catch (JSONException e) {
            ((voc) this.c).logException("CallFeatureNotificationHandler", "features per role changed notification parsing error", e);
        }
    }

    public void I(int i, String[] strArr, int[] iArr) {
        Context O1;
        Context O12;
        FrgBase frgBase = (FrgBase) this.c;
        if (i == 169) {
            if (n54.X((FrgBase) this.c, strArr, iArr, n54.k, qad.Z6, qad.a7) && (O12 = frgBase.O1()) != null) {
                m().getClass();
                nt6.a(O12, this);
            }
        } else if (i == 175) {
            if (n54.X((FrgBase) this.c, strArr, iArr, n54.l, qad.A6, qad.a7) && (O1 = frgBase.O1()) != null) {
                m().getClass();
                nt6.a(O1, this);
            }
        }
    }

    public void J() {
        z68.e("eud", "background permissions is not supported yet");
    }

    public void K() {
        FrgBase frgBase = (FrgBase) this.c;
        Context O1 = frgBase.O1();
        String[] strArr = n54.k;
        if (n54.e(O1, strArr)) {
            Context O12 = frgBase.O1();
            if (O12 != null) {
                m().getClass();
                nt6.a(O12, this);
                return;
            }
            return;
        }
        FrgDlgPermissions b3 = FrgDlgPermissions.b3(strArr, qad.d7, qad.b7, qad.c7, false);
        b3.P2(169, frgBase);
        b3.Y2(frgBase.Q1(), "ru.ok.messages.views.dialogs.FrgDlgPermissions");
    }

    public void a(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ln1 ln1 = ((o41) it.next()).a;
            if (ln1.a == a9g.b) {
                linkedHashSet.add(ln1.b);
            }
        }
        Iterator it2 = ((LinkedHashMap) this.o).entrySet().iterator();
        while (it2.hasNext()) {
            ue1 ue1 = (ue1) ((Map.Entry) it2.next()).getKey();
            if (!linkedHashSet.contains(ue1)) {
                ((LinkedHashSet) this.v).add(ue1);
                it2.remove();
            }
        }
    }

    public void b(int i, nz8 nz8, l28 l28, es8 es8, IOException iOException, boolean z) {
        if (w(i, nz8)) {
            ((cs) this.c).B(l28, x(es8, nz8), iOException, z);
        }
    }

    public List c(long j, gz6 gz6, int i, int i2, long j2, long j3) {
        ArrayList arrayList = new ArrayList();
        fa9 fa9 = (fa9) this.c;
        ed2 ed2 = (ed2) this.b;
        a32 a32 = (a32) this.o;
        if (i > 0) {
            long j4 = a32.a;
            ed2.getClass();
            ArrayList l = ((a74) fa9.a).c.l(j4, j, (Set) this.v, Integer.valueOf(i), true);
            arrayList.addAll(!l.isEmpty() ? ed2.f.b(l) : Collections.emptyList());
        }
        if (i2 > 0) {
            long j5 = a32.a;
            ed2.getClass();
            ArrayList l2 = ((a74) fa9.a).c.l(j5, j, (Set) this.v, Integer.valueOf(i2), false);
            arrayList.addAll(!l2.isEmpty() ? ed2.f.b(l2) : Collections.emptyList());
        }
        return new ArrayList(arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a2 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map d(org.json.JSONObject r11) {
        /*
            r10 = this;
            java.lang.String r0 = "featuresPerRole"
            org.json.JSONObject r11 = r11.optJSONObject(r0)
            if (r11 != 0) goto L_0x000d
            java.util.Map r10 = kotlin.collections.MapsKt.emptyMap()
            return r10
        L_0x000d:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r1 = r11.keys()
        L_0x0016:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00ab
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r10.o
            p9a r3 = (defpackage.p9a) r3
            r3.getClass()
            l51 r3 = defpackage.p9a.i(r2)
            if (r3 != 0) goto L_0x003f
            java.lang.String r3 = "warning: unknown feature: "
            java.lang.String r2 = r3.concat(r2)
            java.lang.String r3 = "CallFeatureNotificationHandler"
            java.lang.Object r4 = r10.c
            voc r4 = (defpackage.voc) r4
            r4.log(r3, r2)
            goto L_0x0016
        L_0x003f:
            org.json.JSONArray r2 = r11.optJSONArray(r2)
            if (r2 != 0) goto L_0x004a
            java.util.Set r2 = kotlin.collections.SetsKt.emptySet()
            goto L_0x00a6
        L_0x004a:
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            int r5 = r2.length()
            r6 = 0
        L_0x0054:
            if (r6 >= r5) goto L_0x00a5
            java.lang.String r7 = r2.optString(r6)
            if (r7 != 0) goto L_0x005d
            goto L_0x00a2
        L_0x005d:
            java.lang.Object r8 = r10.v
            v9a r8 = (defpackage.v9a) r8
            r8.getClass()
            int r8 = r7.hashCode()
            r9 = -1290540065(0xffffffffb313ebdf, float:-3.4440628E-8)
            if (r8 == r9) goto L_0x0090
            r9 = 62130991(0x3b40b2f, float:1.0582017E-36)
            if (r8 == r9) goto L_0x0084
            r9 = 1746537484(0x681a0c0c, float:2.9098667E24)
            if (r8 == r9) goto L_0x0078
            goto L_0x0098
        L_0x0078:
            java.lang.String r8 = "CREATOR"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0081
            goto L_0x0098
        L_0x0081:
            xe1 r7 = defpackage.xe1.a
            goto L_0x009c
        L_0x0084:
            java.lang.String r8 = "ADMIN"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x008d
            goto L_0x0098
        L_0x008d:
            xe1 r7 = defpackage.xe1.b
            goto L_0x009c
        L_0x0090:
            java.lang.String r8 = "SPEAKER"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x009a
        L_0x0098:
            r7 = 0
            goto L_0x009c
        L_0x009a:
            xe1 r7 = defpackage.xe1.c
        L_0x009c:
            if (r7 != 0) goto L_0x009f
            goto L_0x00a2
        L_0x009f:
            r4.add(r7)
        L_0x00a2:
            int r6 = r6 + 1
            goto L_0x0054
        L_0x00a5:
            r2 = r4
        L_0x00a6:
            r0.put(r3, r2)
            goto L_0x0016
        L_0x00ab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eud.d(org.json.JSONObject):java.util.Map");
    }

    public void dispose() {
        SparseArray sparseArray = (SparseArray) ((ni0) this.v).c;
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            if (((b6a) sparseArray.valueAt(size)) == ((b6a) this.o)) {
                sparseArray.removeAt(size);
            }
        }
    }

    public y90 e() {
        String str = "";
        String str2 = ((Integer) this.b) == null ? " audioSource" : str;
        if (((Integer) this.c) == null) {
            str2 = str2.concat(" sampleRate");
        }
        if (((Integer) this.o) == null) {
            str2 = tr1.j(str2, " channelCount");
        }
        if (((Integer) this.v) == null) {
            str2 = tr1.j(str2, " audioFormat");
        }
        if (str2.isEmpty()) {
            int intValue = ((Integer) this.b).intValue();
            int intValue2 = ((Integer) this.c).intValue();
            int intValue3 = ((Integer) this.o).intValue();
            int intValue4 = ((Integer) this.v).intValue();
            y90 y90 = new y90(intValue, intValue2, intValue3, intValue4);
            if (intValue == -1) {
                str = " audioSource";
            }
            if (intValue2 <= 0) {
                str = str.concat(" sampleRate");
            }
            if (intValue3 <= 0) {
                str = tr1.j(str, " channelCount");
            }
            if (intValue4 == -1) {
                str = tr1.j(str, " audioFormat");
            }
            if (str.isEmpty()) {
                return y90;
            }
            throw new IllegalArgumentException("Required settings missing or non-positive:".concat(str));
        }
        throw new IllegalStateException("Missing required properties:".concat(str2));
    }

    public void f() {
        z68.a("eud", "onSuccessCheckSettings");
        Runnable runnable = (Runnable) this.o;
        if (runnable != null) {
            runnable.run();
        }
        this.o = null;
    }

    public void g(Exception exc) {
        z68.f("eud", "onFailureCheckSettings", exc);
        m().getClass();
        if (!(exc instanceof ResolvableApiException)) {
            this.o = null;
            return;
        }
        b M1 = ((FrgBase) this.c).M1();
        if (M1 == null) {
            this.o = null;
            return;
        }
        try {
            m().getClass();
            if (exc instanceof ResolvableApiException) {
                PendingIntent pendingIntent = ((ResolvableApiException) exc).a.c;
                if (pendingIntent != null) {
                    vzg.m(pendingIntent);
                    M1.startIntentSenderForResult(pendingIntent.getIntentSender(), HttpStatus.SC_MOVED_PERMANENTLY, (Intent) null, 0, 0, 0);
                }
            }
        } catch (IntentSender.SendIntentException unused) {
            z68.f("eud", "Can't resolve check settings error", exc);
            ((uta) ((m95) this.b)).c(new Exception("Can't resolve check settings error"), true);
            this.o = null;
        }
    }

    public void h(jtc jtc, k4d k4d) {
        dbf dbf = (dbf) this.v;
        p7d p7d = (p7d) this.c;
        ((tla) this.b).e = SystemClock.elapsedRealtime();
        ptc ptc = k4d.x;
        try {
            if (!k4d.isSuccessful()) {
                nd c2 = ((qra) ym.e()).c();
                int i = k4d.o;
                c2.getClass();
                c2.f("HTTP_ERROR", String.valueOf(i));
                IOException iOException = new IOException("Unexpected HTTP code " + k4d);
                dbf.getClass();
                if (jtc.v0) {
                    ((u6a) p7d.c).getClass();
                    lk5 lk5 = (lk5) p7d.b;
                    lk5.a().k(lk5.b, "NetworkFetchProducer");
                    lk5.a.c();
                } else {
                    p7d.g(iOException);
                }
                if (ptc != null) {
                    try {
                        ptc.close();
                    } catch (Exception e) {
                        bg5.m(e);
                    }
                }
            } else {
                long n = ptc.n();
                if (n < 0) {
                    n = 0;
                }
                p7d.B(ptc.m(), (int) n);
                try {
                    ptc.close();
                } catch (Exception e2) {
                    bg5.m(e2);
                }
            }
        } catch (Exception e3) {
            dbf.getClass();
            if (jtc.v0) {
                ((u6a) p7d.c).getClass();
                lk5 lk52 = (lk5) p7d.b;
                lk52.a().k(lk52.b, "NetworkFetchProducer");
                lk52.a.c();
            } else {
                p7d.g(e3);
            }
            if (ptc != null) {
                ptc.close();
            }
        } catch (Throwable th) {
            if (ptc != null) {
                try {
                    ptc.close();
                } catch (Exception e4) {
                    bg5.m(e4);
                }
            }
            throw th;
        }
    }

    public y33 i() {
        y33 y33;
        qx0 qx0;
        s14 s14;
        boolean z;
        do {
            synchronized (this) {
                Iterator it = ((LinkedHashSet) this.v).iterator();
                y33 = null;
                if (it.hasNext()) {
                    qx0 = (qx0) it.next();
                    it.remove();
                } else {
                    qx0 = null;
                }
            }
            if (qx0 == null) {
                return null;
            }
            ub8 ub8 = (ub8) ((t14) this.c);
            ub8.getClass();
            synchronized (ub8) {
                try {
                    s14 = (s14) ub8.b.J(qx0);
                    z = false;
                    if (s14 != null) {
                        s14 s142 = (s14) ub8.c.J(qx0);
                        s142.getClass();
                        if (s142.c == 0) {
                            z = true;
                        }
                        cvg.q(z);
                        y33 = s142.b;
                        z = true;
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (z) {
                ub8.d(s14);
                continue;
            }
        } while (y33 == null);
        return y33;
    }

    public bs5 k(long j) {
        Object obj;
        Iterator it = ((Set) ((AtomicReference) ((zc4) this.b).v).get()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((dkb) obj).a == j) {
                break;
            }
        }
        dkb dkb = (dkb) obj;
        s45 s45 = s45.a;
        if (dkb == null) {
            return s45;
        }
        int ordinal = dkb.b.ordinal();
        if (ordinal == 0) {
            return ((ojb) this.c).k(j);
        }
        if (ordinal != 1) {
            return s45;
        }
        return bs0.L(new on2(((eu3) ((Lazy) this.o).getValue()).c(((qjd) ((x23) ((Lazy) this.v).getValue())).s() ^ j), 28), new bkb(j, (Continuation) null));
    }

    public int l(int i) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.c;
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        StringBuilder o2 = wj6.o(i, "requested global type ", " does not belong to the adapter:");
        o2.append(((b6a) this.o).c);
        throw new IllegalStateException(o2.toString());
    }

    public nt6 m() {
        if (((nt6) this.v) == null) {
            this.v = (nt6) ((qra) ((id3) ((FrgBase) this.c).p1.b)).getAccessor().g(nt6.class);
        }
        return (nt6) this.v;
    }

    public int n(int i) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey > -1) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        ni0 ni0 = (ni0) this.v;
        int i2 = ni0.b;
        ni0.b = i2 + 1;
        ((SparseArray) ni0.c).put(i2, (b6a) this.o);
        sparseIntArray.put(i, i2);
        ((SparseIntArray) this.c).put(i2, i);
        return i2;
    }

    public void o(jtc jtc, IOException iOException) {
        nd c2 = ((qra) ym.e()).c();
        c2.getClass();
        c2.f("HTTP_ERROR", iOException.getClass().getSimpleName());
        if (iOException.getMessage() == null || iOException.getMessage().toLowerCase().equals("canceled")) {
            z68.h("OkHttpNetworkFetchProducer", iOException, "onFailure for request %s", (y2d) this.o);
        } else {
            LockSupport.parkNanos(TimeUnit.SECONDS.toNanos(2));
        }
        p7d p7d = (p7d) this.c;
        ((dbf) this.v).getClass();
        if (jtc.v0) {
            ((u6a) p7d.c).getClass();
            lk5 lk5 = (lk5) p7d.b;
            lk5.a().k(lk5.b, "NetworkFetchProducer");
            lk5.a.c();
            return;
        }
        p7d.g(iOException);
    }

    public boolean p(Context context) {
        if (((Boolean) this.o) == null) {
            this.o = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        ((Boolean) this.c).booleanValue();
        return ((Boolean) this.o).booleanValue();
    }

    public boolean q(Context context) {
        if (((Boolean) this.c) == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        ((Boolean) this.c).booleanValue();
        return ((Boolean) this.c).booleanValue();
    }

    public boolean r(String str) {
        String str2 = (String) this.b;
        if (str2 == null) {
            this.b = str;
            return false;
        } else if (str.equals(str2)) {
            return true;
        } else {
            String str3 = (String) this.o;
            if (str3 == null) {
                this.o = str;
                return false;
            } else if (str.equals(str3)) {
                return true;
            } else {
                if (((HashSet) this.v) == null) {
                    HashSet hashSet = new HashSet(16);
                    this.v = hashSet;
                    hashSet.add((String) this.b);
                    ((HashSet) this.v).add((String) this.o);
                }
                return !((HashSet) this.v).add(str);
            }
        }
    }

    public void s(int i, nz8 nz8, l28 l28, es8 es8) {
        if (w(i, nz8)) {
            ((cs) this.c).w(l28, x(es8, nz8));
        }
    }

    public String toString() {
        switch (this.a) {
            case 11:
                return "Pack{incomingAudio=" + ((List) this.b) + ", incomingVideo=" + ((List) this.c) + ", outgoingAudio=" + ((List) this.o) + ", outgoingVideo=" + ((List) this.v) + '}';
            default:
                return super.toString();
        }
    }

    public void u(int i, nz8 nz8, Exception exc) {
        if (w(i, nz8)) {
            ((gw4) this.o).e(exc);
        }
    }

    public void v(int i, nz8 nz8, l28 l28, es8 es8) {
        if (w(i, nz8)) {
            ((cs) this.c).y(l28, x(es8, nz8));
        }
    }

    public boolean w(int i, nz8 nz8) {
        nz8 nz82;
        Object obj = this.b;
        sc3 sc3 = (sc3) this.v;
        if (nz8 != null) {
            nz82 = sc3.u(obj, nz8);
            if (nz82 == null) {
                return false;
            }
        } else {
            nz82 = null;
        }
        int w2 = sc3.w(i, obj);
        cs csVar = (cs) this.c;
        if (csVar.b != w2 || !v0g.a((nz8) csVar.c, nz82)) {
            this.c = new cs((CopyOnWriteArrayList) sc3.c.o, w2, nz82);
        }
        gw4 gw4 = (gw4) this.o;
        if (gw4.a == w2 && v0g.a(gw4.b, nz82)) {
            return true;
        }
        this.o = new gw4(sc3.d.c, w2, nz82);
        return true;
    }

    public es8 x(es8 es8, nz8 nz8) {
        sc3 sc3 = (sc3) this.v;
        Object obj = this.b;
        long j = es8.e;
        long v2 = sc3.v(j, obj);
        long j2 = es8.f;
        long v3 = sc3.v(j2, obj);
        if (v2 == j && v3 == j2) {
            return es8;
        }
        return new es8(es8.a, es8.b, (ea6) es8.g, es8.c, es8.d, v2, v3);
    }

    public void y(int i, nz8 nz8, int i2) {
        if (w(i, nz8)) {
            ((gw4) this.o).d(i2);
        }
    }

    public void z(JSONObject jSONObject) {
        voc voc = (voc) this.c;
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("features");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                ((p9a) this.o).getClass();
                l51 i2 = p9a.i(string);
                if (i2 != null) {
                    linkedHashSet.add(i2);
                } else {
                    voc.log("CallFeatureNotificationHandler", "warning: unknown feature: ".concat(string));
                }
            }
            ((Function2) this.b).invoke(b51.v0, new o51(linkedHashSet));
        } catch (JSONException e) {
            voc.logException("CallFeatureNotificationHandler", "feature set changed notification parsing error", e);
        }
    }

    public eud(c51 c51, sjf sjf) {
        this.a = 10;
        this.b = c51;
        this.c = sjf;
        this.o = new LinkedHashMap();
        this.v = new LinkedHashSet();
    }

    public eud(m95 m95, FrgBase frgBase) {
        this.a = 8;
        this.b = m95;
        this.c = frgBase;
    }

    public eud(Object obj) {
        this.a = 6;
        this.c = obj;
    }

    public eud(kg kgVar, t14 t14) {
        this.a = 1;
        this.b = kgVar;
        this.c = t14;
        this.v = new LinkedHashSet();
        this.o = new xv1(3, (Object) this);
    }

    public eud(int i) {
        this.a = i;
        switch (i) {
            case 2:
                return;
            default:
                this.b = null;
                this.c = null;
                this.o = null;
                this.v = new ArrayDeque();
                return;
        }
    }

    public eud(dbf dbf, tla tla, p7d p7d, y2d y2d) {
        this.a = 12;
        this.v = dbf;
        this.b = tla;
        this.c = p7d;
        this.o = y2d;
    }

    public eud(ni0 ni0, b6a b6a) {
        this.a = 13;
        this.v = ni0;
        this.b = new SparseIntArray(1);
        this.c = new SparseIntArray(1);
        this.o = b6a;
    }

    public eud(sc3 sc3, Object obj) {
        this.a = 5;
        this.v = sc3;
        this.c = sc3.b((nz8) null);
        this.o = new gw4(sc3.d.c, 0, (nz8) null);
        this.b = obj;
    }
}
