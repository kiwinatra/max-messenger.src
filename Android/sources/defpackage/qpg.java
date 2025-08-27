package defpackage;

import android.content.Context;
import android.media.MediaMuxer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.camera.video.internal.encoder.EncodeException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: qpg  reason: default package */
public final class qpg implements r55, a8 {
    public static qpg v;
    public Object a;
    public Object b;
    public Object c;
    public Object o;

    public /* synthetic */ qpg(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
    }

    public static qpg l() {
        if (v == null) {
            v = new qpg(10);
        }
        return v;
    }

    public static void t(long j, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    public ArrayList a(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.a;
        t(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.b;
        t(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            ml0 ml0 = (ml0) list.get(i);
            if (!hashMap.containsKey(ml0.b) && !hashMap2.containsKey(Integer.valueOf(ml0.c))) {
                arrayList.add(ml0);
            }
        }
        return arrayList;
    }

    public boolean b(b8 b8Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.a).onActionItemClicked(j(b8Var), new y69((Context) this.b, (d3f) menuItem));
    }

    public boolean c(ffe ffe, int i) {
        fl0 fl0 = (fl0) ffe.a.get();
        if (fl0 == null) {
            return false;
        }
        ((Handler) this.b).removeCallbacksAndMessages(ffe);
        Handler handler = il0.y;
        handler.sendMessage(handler.obtainMessage(1, i, 0, fl0.a));
        return true;
    }

    public void d(EncodeException encodeException) {
        if (((lyc) this.o).W == null) {
            ((tk3) this.b).accept(encodeException);
        }
    }

    public v8b e(ue1 ue1, JSONObject jSONObject, zwd zwd) {
        zwd zwd2 = zwd;
        mc1 mc1 = (mc1) this.b;
        kz9 f = mc1.f(jSONObject, ue1, "createAddOrUpdateParamsForAcceptedParticipant", mc1.h(zwd2).a(), true);
        mz9 q = tf6.q(jSONObject);
        ArrayList A = tf6.A(jSONObject);
        Pair s = tf6.s(jSONObject);
        if (s == null) {
            s = ye1.r;
        }
        e51 m = tf6.m(jSONObject);
        g8b v9a = new v9a(16);
        g8b v9a2 = new v9a(16);
        xga xga = new xga(1, s);
        xga xga2 = new xga(1, f);
        if (q != null) {
            v9a = new xga(1, q);
        }
        g8b g8b = v9a;
        xga xga3 = new xga(1, A);
        if (m != null) {
            v9a2 = new xga(1, m);
        }
        return new v8b(ue1, xga, xga2, g8b, xga3, v9a2, new xga(1, ((u6h) this.c).p(jSONObject, zwd2)));
    }

    public v8b f(ue1 ue1, JSONObject jSONObject, zwd zwd) {
        mc1 mc1 = (mc1) this.b;
        kz9 f = mc1.f(jSONObject, ue1, "createAddOrUpdateParamsForCalledParticipant", mc1.h(zwd).a(), true);
        mz9 q = tf6.q(jSONObject);
        ArrayList A = tf6.A(jSONObject);
        e51 m = tf6.m(jSONObject);
        return new v8b(ue1, new v9a(16), new xga(1, f), q != null ? new xga(1, q) : new v9a(16), new xga(1, A), m != null ? new xga(1, m) : new v9a(16), new xga(1, ((u6h) this.c).p(jSONObject, zwd)));
    }

    public void g(String str) {
        i6d i6d = (i6d) this.a;
        i6d.b();
        ppg ppg = (ppg) this.c;
        gf6 E = ppg.E();
        if (str == null) {
            E.X(1);
        } else {
            E.h(1, str);
        }
        i6d.c();
        try {
            E.n();
            i6d.r();
        } finally {
            i6d.l();
            ppg.S(E);
        }
    }

    public void h(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (!hashSet.contains(obj)) {
                hashSet.add(obj);
                ArrayList arrayList2 = (ArrayList) ((qae) this.b).get(obj);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        h(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(obj);
                arrayList.add(obj);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    public void i(b8 b8Var) {
        ((ActionMode.Callback) this.a).onDestroyActionMode(j(b8Var));
    }

    public z2f j(b8 b8Var) {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            z2f z2f = (z2f) arrayList.get(i);
            if (z2f != null && z2f.b == b8Var) {
                return z2f;
            }
        }
        z2f z2f2 = new z2f((Context) this.b, b8Var);
        arrayList.add(z2f2);
        return z2f2;
    }

    public boolean k(b8 b8Var, m69 m69) {
        z2f j = j(b8Var);
        qae qae = (qae) this.o;
        Menu menu = (Menu) qae.get(m69);
        if (menu == null) {
            menu = new m79((Context) this.b, m69);
            qae.put(m69, menu);
        }
        return ((ActionMode.Callback) this.a).onCreateActionMode(j, menu);
    }

    public boolean m(fl0 fl0) {
        ffe ffe = (ffe) this.c;
        return (ffe == null || fl0 == null || ffe.a.get() != fl0) ? false : true;
    }

    public void n() {
        ((do1) this.a).b((Object) null);
    }

    public void o(g55 g55) {
        lyc lyc = (lyc) this.o;
        if (lyc.f0 != 3) {
            MediaMuxer mediaMuxer = lyc.C;
            zb0 zb0 = (zb0) this.c;
            if (mediaMuxer == null) {
                if (!lyc.r) {
                    lyc.V.d(new vt0(g55));
                    if (lyc.U != null) {
                        lyc.C(zb0);
                    }
                }
                g55.close();
                return;
            }
            try {
                lyc.J(g55, zb0);
                g55.close();
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            g55.close();
            throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
        }
        throw th;
    }

    public boolean p(b8 b8Var, Menu menu) {
        z2f j = j(b8Var);
        qae qae = (qae) this.o;
        Menu menu2 = (Menu) qae.get(menu);
        if (menu2 == null) {
            menu2 = new m79((Context) this.b, (m69) menu);
            qae.put(menu, menu2);
        }
        return ((ActionMode.Callback) this.a).onPrepareActionMode(j, menu2);
    }

    public w8b q(JSONArray jSONArray, zwd zwd) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("state");
            ue1 F = tf6.F(jSONObject);
            ye1 ye1 = (ye1) this.a;
            if (Intrinsics.areEqual((Object) F, (Object) ye1.a)) {
                ye1.q = ((u6h) this.c).p(jSONObject, zwd);
                ArrayList A = tf6.A(jSONObject);
                ArrayList arrayList3 = ye1.d;
                arrayList3.clear();
                arrayList3.addAll(A);
                kc1 kc1 = kc1.a;
                mc1 mc1 = (mc1) this.b;
                mc1.n(jSONObject, "handleConversationParticipants", mc1.g(zwd, kc1), true, zwd, zwd);
            } else if (Intrinsics.areEqual((Object) "ACCEPTED", (Object) string)) {
                arrayList.add(e(F, jSONObject, zwd));
            } else if (Intrinsics.areEqual((Object) "CALLED", (Object) string)) {
                arrayList.add(f(F, jSONObject, zwd));
            } else {
                hashSet.add(F);
            }
            we1 d = ((dd4) this.o).d(jSONObject);
            if (d != null) {
                arrayList2.add(d);
            }
        }
        return new w8b(arrayList, arrayList2);
    }

    public void r(fl0 fl0) {
        synchronized (this.a) {
            try {
                if (m(fl0)) {
                    ffe ffe = (ffe) this.c;
                    if (!ffe.c) {
                        ffe.c = true;
                        ((Handler) this.b).removeCallbacksAndMessages(ffe);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s(rt3 rt3) {
        ((lyc) this.o).I = rt3;
    }

    public void u(fl0 fl0) {
        synchronized (this.a) {
            try {
                if (m(fl0)) {
                    ffe ffe = (ffe) this.c;
                    if (ffe.c) {
                        ffe.c = false;
                        v(ffe);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void v(ffe ffe) {
        int i = ffe.b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? 1500 : 2750;
            }
            Handler handler = (Handler) this.b;
            handler.removeCallbacksAndMessages(ffe);
            handler.sendMessageDelayed(Message.obtain(handler, 0, ffe), (long) i);
        }
    }

    public ml0 w(List list) {
        ArrayList a2 = a(list);
        if (a2.size() < 2) {
            return (ml0) b0h.v(a2, (Object) null);
        }
        Collections.sort(a2, new v00(4));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = ((ml0) a2.get(0)).c;
        int i3 = 0;
        while (true) {
            if (i3 >= a2.size()) {
                break;
            }
            ml0 ml0 = (ml0) a2.get(i3);
            if (i2 == ml0.c) {
                arrayList.add(new android.util.Pair(ml0.b, Integer.valueOf(ml0.d)));
                i3++;
            } else if (arrayList.size() == 1) {
                return (ml0) a2.get(0);
            }
        }
        HashMap hashMap = (HashMap) this.c;
        ml0 ml02 = (ml0) hashMap.get(arrayList);
        if (ml02 == null) {
            List subList = a2.subList(0, arrayList.size());
            int i4 = 0;
            for (int i5 = 0; i5 < subList.size(); i5++) {
                i4 += ((ml0) subList.get(i5)).d;
            }
            int nextInt = ((Random) this.o).nextInt(i4);
            int i6 = 0;
            while (true) {
                if (i >= subList.size()) {
                    ml02 = (ml0) b0h.w(subList);
                    break;
                }
                ml0 ml03 = (ml0) subList.get(i);
                i6 += ml03.d;
                if (nextInt < i6) {
                    ml02 = ml03;
                    break;
                }
                i++;
            }
            hashMap.put(arrayList, ml02);
        }
        return ml02;
    }

    public void x() {
        ffe ffe = (ffe) this.o;
        if (ffe != null) {
            this.c = ffe;
            this.o = null;
            fl0 fl0 = (fl0) ffe.a.get();
            if (fl0 != null) {
                Handler handler = il0.y;
                handler.sendMessage(handler.obtainMessage(0, fl0.a));
                return;
            }
            this.c = null;
        }
    }

    public qpg(Lazy lazy) {
        Lazy lazy2 = rjd.Z;
        Lazy lazy3 = rjd.e;
        Lazy lazy4 = rjd.k;
        this.a = lazy2;
        this.b = lazy3;
        this.c = lazy;
        this.o = lazy4;
    }

    public qpg(int i) {
        switch (i) {
            case 4:
                return;
            case 5:
                this.a = new wqb(10);
                this.b = new qae(0);
                this.c = new ArrayList();
                this.o = new HashSet();
                return;
            case 10:
                this.a = new Object();
                this.b = new Handler(Looper.getMainLooper(), new hv(1, this));
                return;
            case 12:
                this.a = new qae();
                this.b = new SparseArray();
                this.c = new ya8();
                this.o = new qae();
                return;
            default:
                Random random = new Random();
                this.c = new HashMap();
                this.o = random;
                this.a = new HashMap();
                this.b = new HashMap();
                return;
        }
    }
}
