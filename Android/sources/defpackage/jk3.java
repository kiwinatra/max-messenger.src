package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: jk3  reason: default package */
public final class jk3 implements ola, vc8, xf5, s9f, uye, kxg {
    public static final yl4 o = new yl4(15, false);
    public static jk3 v;
    public Object a;
    public Object b;
    public Object c;

    public /* synthetic */ jk3(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public static pe4 g(tq8 tq8) {
        xf4 xf4 = new xf4();
        byte[] bArr = null;
        xf4.b = null;
        Uri uri = tq8.b;
        lf6 lf6 = new lf6(uri == null ? null : uri.toString(), tq8.f, xf4);
        wvf m = tq8.c.entrySet().iterator();
        while (m.hasNext()) {
            Map.Entry entry = (Map.Entry) m.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) lf6.v)) {
                ((HashMap) lf6.v).put(str, str2);
            }
        }
        HashMap hashMap = new HashMap();
        UUID uuid = zw0.a;
        nfd nfd = new nfd(10);
        UUID uuid2 = tq8.a;
        uuid2.getClass();
        boolean z = tq8.d;
        boolean z2 = tq8.e;
        int[] L = cvg.L(tq8.g);
        int length = L.length;
        for (int i = 0; i < length; i++) {
            int i2 = L[i];
            n79.g(i2 == 2 || i2 == 1);
        }
        pe4 pe4 = new pe4(uuid2, lf6, hashMap, z, (int[]) L.clone(), z2, nfd, 300000);
        byte[] bArr2 = tq8.h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        }
        n79.n(pe4.m.isEmpty());
        pe4.v = 0;
        pe4.w = bArr;
        return pe4;
    }

    public zpf B(int i, int i2) {
        xf5 xf5 = (xf5) this.a;
        if (i2 != 3) {
            return xf5.B(i, i2);
        }
        SparseArray sparseArray = (SparseArray) this.c;
        kze kze = (kze) sparseArray.get(i);
        if (kze != null) {
            return kze;
        }
        kze kze2 = new kze(xf5.B(i, i2), (gze) this.b);
        sparseArray.put(i, kze2);
        return kze2;
    }

    public void M(snd snd) {
        ((xf5) this.a).M(snd);
    }

    public void a(String str, List list) {
        ((whb) this.a).j().h = null;
        boolean areEqual = Intrinsics.areEqual((Object) str, (Object) (String) this.b);
        kw1 kw1 = (kw1) this.c;
        if (areEqual) {
            kw1.resumeWith(Result.m23constructorimpl(list));
            return;
        }
        Result.Companion companion = Result.Companion;
        CancellationException cancellationException = new CancellationException("Nothing found");
        cancellationException.initCause((Throwable) null);
        kw1.resumeWith(Result.m23constructorimpl(ResultKt.createFailure(cancellationException)));
    }

    public void b() {
        ((ee5) this.a).b();
        ((hm4) this.b).e = true;
    }

    public void c() {
        ObjectAnimator objectAnimator = (ObjectAnimator) this.b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.a;
        if (view.getAlpha() < 1.0f) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{view.getAlpha(), 1.0f});
            ofFloat.setDuration(500);
            ofFloat.setInterpolator((AccelerateDecelerateInterpolator) this.c);
            ofFloat.start();
            this.b = ofFloat;
        }
    }

    public int d(long j) {
        long[] jArr = (long[]) this.c;
        int b2 = t0g.b(jArr, j, false);
        if (b2 < jArr.length) {
            return b2;
        }
        return -1;
    }

    public void e(ibf ibf) {
        wbf wbf = (wbf) this.c;
        long j = ((qm) this.a).a;
        CopyOnWriteArraySet copyOnWriteArraySet = wbf.d;
        boolean contains = copyOnWriteArraySet.contains(Long.valueOf(j));
        if (contains) {
            copyOnWriteArraySet.remove(Long.valueOf(j));
            ((eef) wbf.e.getValue()).d(j);
        }
        if (contains) {
            String str = wbf.q;
            z68.c(str, "executeTask: cancelling task after processing with requestId=" + ((qm) this.a).a, new Object[0]);
        } else if (((ExecutorService) ((wbf) this.c).n.getValue()).isShutdown()) {
            qm qmVar = (qm) this.a;
            if (qmVar instanceof l98) {
                wbf wbf2 = (wbf) this.c;
                wbf2.getClass();
                if ((qmVar instanceof l98) && wbf2.b != null) {
                    z68.a(wbf.q, "countDownSyncLogoutLatch");
                    wbf2.b.countDown();
                }
            }
        } else if (!((lcf) this.b).a().a.get()) {
            ((ExecutorService) ((wbf) this.c).n.getValue()).execute(new tbf(this, (qm) this.a, (lcf) this.b, ibf));
        }
    }

    public void h(qaf qaf) {
        if (!((ExecutorService) ((wbf) this.c).n.getValue()).isShutdown() && !((lcf) this.b).a().a.get()) {
            ((ExecutorService) ((wbf) this.c).n.getValue()).execute(new sbf(this, (lcf) this.b, (qm) this.a, qaf));
        }
    }

    public void i(jm jmVar) {
        ((k47) this.c).e = jmVar;
    }

    public pw4 j(ir8 ir8) {
        pe4 pe4;
        ir8.b.getClass();
        tq8 tq8 = ir8.b.c;
        if (tq8 == null) {
            return pw4.a;
        }
        synchronized (this.a) {
            try {
                if (!tq8.equals((tq8) this.b)) {
                    this.b = tq8;
                    this.c = g(tq8);
                }
                pe4 = (pe4) this.c;
                pe4.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return pe4;
    }

    public long k(int i) {
        boolean z = false;
        y64.g(i >= 0);
        long[] jArr = (long[]) this.c;
        if (i < jArr.length) {
            z = true;
        }
        y64.g(z);
        return jArr[i];
    }

    public boolean l() {
        String trim;
        if (((String) this.c) != null) {
            return true;
        }
        Queue queue = (Queue) this.b;
        if (!queue.isEmpty()) {
            String str = (String) queue.poll();
            str.getClass();
            this.c = str;
            return true;
        }
        do {
            String readLine = ((BufferedReader) this.a).readLine();
            this.c = readLine;
            if (readLine == null) {
                return false;
            }
            trim = readLine.trim();
            this.c = trim;
        } while (trim.isEmpty());
        return true;
    }

    public long m() {
        return ((qm) this.a).a;
    }

    public String n() {
        if (l()) {
            String str = (String) this.c;
            this.c = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public fae o(JSONObject jSONObject) {
        List list;
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("rooms");
            if (optJSONArray == null) {
                list = CollectionsKt.emptyList();
            } else {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    eae p = optJSONObject != null ? ((d23) this.c).p(optJSONObject) : null;
                    if (p != null) {
                        arrayList.add(p);
                    }
                }
                list = arrayList;
            }
            ((nfd) this.b).getClass();
            return new fae(nfd.s(jSONObject), list);
        } catch (JSONException e) {
            ((voc) this.a).logException("SessionRoomsParser", "Can't parse rooms state", e);
            return null;
        }
    }

    public List p(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = (List) this.a;
            if (i >= list.size()) {
                break;
            }
            int i2 = i * 2;
            long[] jArr = (long[]) this.b;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                dmg dmg = (dmg) list.get(i);
                m44 m44 = dmg.a;
                if (m44.v == -3.4028235E38f) {
                    arrayList2.add(dmg);
                } else {
                    arrayList.add(m44);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new baf(5));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            k44 a2 = ((dmg) arrayList2.get(i3)).a.a();
            a2.e = (float) (-1 - i3);
            a2.f = 1;
            arrayList.add(a2.a());
        }
        return arrayList;
    }

    public synchronized void q(gt0 gt0) {
        try {
            gt0 gt02 = gt0.a;
            gt0 gt03 = gt0.d;
            if (gt02 != null) {
                gt02.d = gt03;
            }
            if (gt03 != null) {
                gt03.a = gt02;
            }
            gt0.a = null;
            gt0.d = null;
            if (gt0 == ((gt0) this.b)) {
                this.b = gt03;
            }
            if (gt0 == ((gt0) this.c)) {
                this.c = gt02;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public int t() {
        return ((long[]) this.c).length;
    }

    public void v() {
        ((xf5) this.a).v();
    }

    public Object y() {
        Object y = ((kxg) this.a).y();
        kzg kzg = (kzg) ((kxg) this.b).y();
        Context context = ((m5h) ((kxg) this.c)).a.a;
        if (context != null) {
            return new p3h((a7h) y, context);
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public jk3(h9g h9g) {
        this.a = h9g;
        this.c = new AccelerateDecelerateInterpolator();
    }

    public jk3(int i) {
        switch (i) {
            case 5:
                this.a = new tvb();
                this.b = LazyKt.lazy(new ve(13, (Object) this));
                return;
            case 6:
                this.a = new Object();
                return;
            default:
                this.a = new SparseArray();
                return;
        }
    }

    public jk3(xf5 xf5, gze gze) {
        this.a = xf5;
        this.b = gze;
        this.c = new SparseArray();
    }

    public jk3(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.b = arrayDeque;
        this.a = bufferedReader;
    }
}
