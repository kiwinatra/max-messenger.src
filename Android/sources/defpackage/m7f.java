package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.facebook.animated.gif.GifImage;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Provider;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: m7f  reason: default package */
public final class m7f implements vz8, hw4, Provider {
    public Object a;
    public Object b;
    public Object c;
    public Object o;

    public /* synthetic */ m7f(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
    }

    public static void b(ue1 ue1, ye1 ye1, HashMap hashMap) {
        hashMap.put("participant_id", ue1.c());
        if (ye1 != null) {
            if (ye1.b()) {
                Pair pair = ye1.j;
                hashMap.put("participant_accept_peer_id", pair.getFirst());
                hashMap.put("participant_accept_peer_type", pair.getSecond());
            }
            hashMap.put("participant_connected", Boolean.toString(ye1.g));
            kz9 kz9 = ye1.b;
            int ordinal = kz9.a.ordinal();
            if (ordinal == 0) {
                hashMap.put("participant_audio_option_state", "UNMUTE");
            } else if (ordinal == 1) {
                hashMap.put("participant_audio_option_state", "MUTE");
            } else if (ordinal == 2 || ordinal == 3) {
                hashMap.put("participant_audio_option_state", "MUTE_PERMANENT");
            }
            int ordinal2 = kz9.b.ordinal();
            if (ordinal2 == 0) {
                hashMap.put("participant_video_option_state", "UNMUTE");
            } else if (ordinal2 == 1) {
                hashMap.put("participant_video_option_state", "MUTE");
            } else if (ordinal2 == 2 || ordinal2 == 3) {
                hashMap.put("participant_video_option_state", "MUTE_PERMANENT");
            }
            int ordinal3 = kz9.c.ordinal();
            if (ordinal3 == 0) {
                hashMap.put("participant_screenshare_option_state", "UNMUTE");
            } else if (ordinal3 == 1) {
                hashMap.put("participant_screenshare_option_state", "MUTE");
            } else if (ordinal3 == 2 || ordinal3 == 3) {
                hashMap.put("participant_screenshare_option_state", "MUTE_PERMANENT");
            }
            mz9 mz9 = ye1.c;
            hashMap.put("participant_audio_enabled", String.valueOf(mz9.e));
            hashMap.put("participant_video_enabled", String.valueOf(mz9.f));
            hashMap.put("participant_screen_cast_enabled", String.valueOf(mz9.b));
        }
    }

    public static void e(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            StringBuilder m = g63.m(str, ": EGL error: 0x");
            m.append(Integer.toHexString(eglGetError));
            throw new RuntimeException(m.toString());
        }
    }

    public void A(int i, mz8 mz8) {
        if (t(i, mz8)) {
            ((fw4) this.c).f();
        }
    }

    public void C(int i, mz8 mz8, es8 es8) {
        if (t(i, mz8)) {
            ((uz8) this.b).c(es8);
        }
    }

    public void D(int i, mz8 mz8, es8 es8) {
        if (t(i, mz8)) {
            ((uz8) this.b).m(es8);
        }
    }

    public void F(int i, mz8 mz8) {
        if (t(i, mz8)) {
            ((fw4) this.c).c();
        }
    }

    public void H(int i, mz8 mz8) {
        if (t(i, mz8)) {
            ((fw4) this.c).b();
        }
    }

    public void K(int i, mz8 mz8, k28 k28, es8 es8) {
        if (t(i, mz8)) {
            ((uz8) this.b).g(k28, es8);
        }
    }

    public void L(int i, mz8 mz8, k28 k28, es8 es8) {
        if (t(i, mz8)) {
            ((uz8) this.b).l(k28, es8);
        }
    }

    public void a(int i, mz8 mz8, k28 k28, es8 es8) {
        if (t(i, mz8)) {
            ((uz8) this.b).e(k28, es8);
        }
    }

    public void c(Object obj, cx8 cx8, zvd zvd, pob pob) {
        synchronized (this.a) {
            try {
                cx8 k = k(obj);
                if (k == null) {
                    ((ts) this.b).put(obj, cx8);
                    ((ts) this.c).put(cx8, new lh3(obj, new bs6(), zvd, pob));
                } else {
                    lh3 lh3 = (lh3) ((ts) this.c).get(k);
                    n79.o(lh3);
                    lh3.d = zvd;
                    lh3.e = pob;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(cx8 cx8, int i, kh3 kh3) {
        synchronized (this.a) {
            try {
                lh3 lh3 = (lh3) ((ts) this.c).get(cx8);
                if (lh3 != null) {
                    pob pob = lh3.g;
                    pob.getClass();
                    vq5 vq5 = new vq5(1);
                    vq5.b(pob.a);
                    vq5.a(i);
                    lh3.g = new pob(vq5.e());
                    lh3.c.add(kh3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(lh3 lh3) {
        yx8 yx8 = (yx8) ((WeakReference) this.o).get();
        if (yx8 != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            while (atomicBoolean.get()) {
                atomicBoolean.set(false);
                kh3 kh3 = (kh3) lh3.c.poll();
                if (kh3 == null) {
                    lh3.f = false;
                    return;
                }
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
                v0g.W(yx8.l, new uo5(yx8, k(lh3.a), new po1(this, kh3, atomicBoolean2, lh3, atomicBoolean, 2), 29));
                atomicBoolean2.set(false);
            }
        }
    }

    public void g(int i, mz8 mz8, Exception exc) {
        if (t(i, mz8)) {
            ((fw4) this.c).e(exc);
        }
    }

    public Object get() {
        return new zog((Executor) ((Provider) this.a).get(), (g95) ((Provider) this.b).get(), (rm7) ((Provider) this.c).get(), (q6f) ((Provider) this.o).get());
    }

    public void h(cx8 cx8) {
        synchronized (this.a) {
            try {
                lh3 lh3 = (lh3) ((ts) this.c).get(cx8);
                if (lh3 != null) {
                    pob pob = lh3.g;
                    lh3.g = pob.b;
                    lh3.c.add(new ih3(this, cx8, pob));
                    if (!lh3.f) {
                        lh3.f = true;
                        f(lh3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public pob i(cx8 cx8) {
        synchronized (this.a) {
            try {
                lh3 lh3 = (lh3) ((ts) this.c).get(cx8);
                if (lh3 == null) {
                    return null;
                }
                pob pob = lh3.e;
                return pob;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public tb7 j() {
        tb7 p;
        synchronized (this.a) {
            p = tb7.p(((ts) this.b).values());
        }
        return p;
    }

    public cx8 k(Object obj) {
        cx8 cx8;
        synchronized (this.a) {
            cx8 = (cx8) ((ts) this.b).get(obj);
        }
        return cx8;
    }

    public bs6 l(cx8 cx8) {
        lh3 lh3;
        synchronized (this.a) {
            lh3 = (lh3) ((ts) this.c).get(cx8);
        }
        if (lh3 != null) {
            return lh3.b;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: l7f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.l7f m(defpackage.wog r6) {
        /*
            r5 = this;
            java.lang.String r0 = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?"
            r1 = 2
            d7d r0 = defpackage.d7d.a(r1, r0)
            java.lang.String r2 = r6.a
            r3 = 1
            if (r2 != 0) goto L_0x0010
            r0.X(r3)
            goto L_0x0013
        L_0x0010:
            r0.h(r3, r2)
        L_0x0013:
            int r6 = r6.b
            long r2 = (long) r6
            r0.k(r1, r2)
            java.lang.Object r5 = r5.a
            i6d r5 = (defpackage.i6d) r5
            r5.b()
            r6 = 0
            android.database.Cursor r5 = r5.o(r0, r6)
            java.lang.String r1 = "work_spec_id"
            int r1 = defpackage.kne.u(r5, r1)     // Catch:{ all -> 0x0057 }
            java.lang.String r2 = "generation"
            int r2 = defpackage.kne.u(r5, r2)     // Catch:{ all -> 0x0057 }
            java.lang.String r3 = "system_id"
            int r3 = defpackage.kne.u(r5, r3)     // Catch:{ all -> 0x0057 }
            boolean r4 = r5.moveToFirst()     // Catch:{ all -> 0x0057 }
            if (r4 == 0) goto L_0x0059
            boolean r4 = r5.isNull(r1)     // Catch:{ all -> 0x0057 }
            if (r4 == 0) goto L_0x0044
            goto L_0x0048
        L_0x0044:
            java.lang.String r6 = r5.getString(r1)     // Catch:{ all -> 0x0057 }
        L_0x0048:
            int r1 = r5.getInt(r2)     // Catch:{ all -> 0x0057 }
            int r2 = r5.getInt(r3)     // Catch:{ all -> 0x0057 }
            l7f r3 = new l7f     // Catch:{ all -> 0x0057 }
            r3.<init>(r6, r1, r2)     // Catch:{ all -> 0x0057 }
            r6 = r3
            goto L_0x0059
        L_0x0057:
            r6 = move-exception
            goto L_0x0060
        L_0x0059:
            r5.close()
            r0.o()
            return r6
        L_0x0060:
            r5.close()
            r0.o()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m7f.m(wog):l7f");
    }

    public void n(JSONObject jSONObject) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("feedback");
            if (optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    if (jSONObject2 != null) {
                        ((v02) this.b).getClass();
                        arrayList.add(v02.k(jSONObject2));
                    }
                }
                ((nfd) this.c).getClass();
                ((zj5) this.o).onFeedback(new r51(nfd.s(jSONObject), arrayList));
            }
        } catch (JSONException e) {
            ((voc) this.a).logException("FeedbackNotificationHandler", "Can't parse feedback", e);
        }
    }

    public void o(l7f l7f) {
        i6d i6d = (i6d) this.a;
        i6d.b();
        i6d.c();
        try {
            ((li) this.b).c0(l7f);
            i6d.r();
        } finally {
            i6d.l();
        }
    }

    public boolean p(cx8 cx8) {
        boolean z;
        synchronized (this.a) {
            z = ((ts) this.c).get(cx8) != null;
        }
        return z;
    }

    public boolean q(cx8 cx8, int i) {
        lh3 lh3;
        synchronized (this.a) {
            lh3 = (lh3) ((ts) this.c).get(cx8);
        }
        yx8 yx8 = (yx8) ((WeakReference) this.o).get();
        return lh3 != null && lh3.e.a(i) && yx8 != null && yx8.s.o().a(i);
    }

    public boolean r(cx8 cx8, int i) {
        lh3 lh3;
        synchronized (this.a) {
            lh3 = (lh3) ((ts) this.c).get(cx8);
        }
        return lh3 != null && lh3.d.a(i);
    }

    public boolean s(cx8 cx8, yvd yvd) {
        lh3 lh3;
        synchronized (this.a) {
            lh3 = (lh3) ((ts) this.c).get(cx8);
        }
        if (lh3 != null) {
            zvd zvd = lh3.d;
            zvd.getClass();
            yvd.getClass();
            if (zvd.a.contains(yvd)) {
                return true;
            }
        }
        return false;
    }

    public boolean t(int i, mz8 mz8) {
        g09 g09 = (g09) this.a;
        mz8 mz82 = null;
        if (mz8 != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= g09.c.size()) {
                    break;
                } else if (((mz8) g09.c.get(i2)).d == mz8.d) {
                    mz82 = mz8.b(android.util.Pair.create(g09.b, mz8.a));
                    break;
                } else {
                    i2++;
                }
            }
            if (mz82 == null) {
                return false;
            }
        }
        int i3 = i + g09.d;
        uz8 uz8 = (uz8) this.b;
        int i4 = uz8.a;
        j09 j09 = (j09) this.o;
        if (i4 != i3 || !t0g.a(uz8.b, mz82)) {
            this.b = new uz8(((uz8) j09.j).c, i3, mz82, 0);
        }
        fw4 fw4 = (fw4) this.c;
        if (fw4.a == i3 && t0g.a(fw4.b, mz82)) {
            return true;
        }
        this.c = new fw4(((fw4) j09.k).c, i3, mz82);
        return true;
    }

    public void u(int i, mz8 mz8, k28 k28, es8 es8, IOException iOException, boolean z) {
        if (t(i, mz8)) {
            ((uz8) this.b).j(k28, es8, iOException, z);
        }
    }

    public void v(int i, mz8 mz8) {
        if (t(i, mz8)) {
            ((fw4) this.c).a();
        }
    }

    public void w(int i, mz8 mz8, int i2) {
        if (t(i, mz8)) {
            ((fw4) this.c).d(i2);
        }
    }

    public void x() {
        EGLDisplay eGLDisplay = (EGLDisplay) this.a;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGL14.eglDestroySurface(eGLDisplay, (EGLSurface) this.c);
            EGL14.eglDestroyContext((EGLDisplay) this.a, (EGLContext) this.b);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.a);
        }
        ((Surface) this.o).release();
        this.a = EGL14.EGL_NO_DISPLAY;
        this.b = EGL14.EGL_NO_CONTEXT;
        this.c = EGL14.EGL_NO_SURFACE;
        this.o = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        r1.b.h();
        r4 = (defpackage.yx8) ((java.lang.ref.WeakReference) r4.o).get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (r4.i() == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        defpackage.v0g.W(r4.l, new defpackage.hh3(r4, r5, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void y(defpackage.cx8 r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.a
            monitor-enter(r0)
            java.lang.Object r1 = r4.c     // Catch:{ all -> 0x0011 }
            ts r1 = (defpackage.ts) r1     // Catch:{ all -> 0x0011 }
            java.lang.Object r1 = r1.remove(r5)     // Catch:{ all -> 0x0011 }
            lh3 r1 = (defpackage.lh3) r1     // Catch:{ all -> 0x0011 }
            if (r1 != 0) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x0011:
            r4 = move-exception
            goto L_0x0041
        L_0x0013:
            java.lang.Object r2 = r4.b     // Catch:{ all -> 0x0011 }
            ts r2 = (defpackage.ts) r2     // Catch:{ all -> 0x0011 }
            java.lang.Object r3 = r1.a     // Catch:{ all -> 0x0011 }
            r2.remove(r3)     // Catch:{ all -> 0x0011 }
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            bs6 r0 = r1.b
            r0.h()
            java.lang.Object r4 = r4.o
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            java.lang.Object r4 = r4.get()
            yx8 r4 = (defpackage.yx8) r4
            if (r4 == 0) goto L_0x0040
            boolean r0 = r4.i()
            if (r0 == 0) goto L_0x0035
            goto L_0x0040
        L_0x0035:
            android.os.Handler r0 = r4.l
            hh3 r1 = new hh3
            r2 = 0
            r1.<init>(r4, r5, r2)
            defpackage.v0g.W(r0, r1)
        L_0x0040:
            return
        L_0x0041:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m7f.y(cx8):void");
    }

    public m7f() {
        r52 r52 = new r52(12);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = LazyKt.lazy(lazyThreadSafetyMode, r52);
        this.b = LazyKt.lazy(lazyThreadSafetyMode, new r52(13));
        this.c = LazyKt.lazy(lazyThreadSafetyMode, new r52(14));
        this.o = LazyKt.lazy(lazyThreadSafetyMode, new r52(15));
    }

    public m7f(tgg tgg) {
        ArrayList arrayList;
        GifImage gifImage = (GifImage) tgg.b;
        gifImage.getClass();
        this.a = gifImage;
        this.c = y33.o((y33) tgg.c);
        ArrayList<y33> arrayList2 = (ArrayList) tgg.o;
        if (arrayList2 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            for (y33 o2 : arrayList2) {
                arrayList3.add(y33.o(o2));
            }
            arrayList = arrayList3;
        }
        this.o = arrayList;
        this.b = (String) tgg.a;
    }

    public m7f(yx8 yx8) {
        this.b = new qae();
        this.c = new qae();
        this.a = new Object();
        this.o = new WeakReference(yx8);
    }
}
