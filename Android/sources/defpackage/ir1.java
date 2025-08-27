package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.TotalCaptureResult;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.view.Surface;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.LongCompanionObject;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.messages.actions.chat.ChatExtraActionsView;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ir1  reason: default package */
public final /* synthetic */ class ir1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ir1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void run() {
        ha9 ha9;
        ts1 ts1;
        switch (this.a) {
            case 0:
                jr1 jr1 = (jr1) this.b;
                jr1.getClass();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = (HashSet) jr1.b;
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    kr1 kr1 = (kr1) it.next();
                    if (kr1.a((TotalCaptureResult) this.c)) {
                        hashSet.add(kr1);
                    }
                }
                if (!hashSet.isEmpty()) {
                    hashSet2.removeAll(hashSet);
                    return;
                }
                return;
            case 1:
                ((Surface) this.b).release();
                ((SurfaceTexture) this.c).release();
                return;
            case 2:
                xr1 xr1 = (xr1) this.b;
                kq9 kq9 = xr1.F0;
                do1 do1 = (do1) this.c;
                if (kq9 == null) {
                    do1.b(Boolean.FALSE);
                    return;
                } else {
                    do1.b(Boolean.valueOf(xr1.a.I(xr1.v(kq9))));
                    return;
                }
            case 3:
                xr1 xr12 = (xr1) this.b;
                xr12.getClass();
                xr12.toString();
                LinkedHashMap linkedHashMap = (LinkedHashMap) xr12.a.b;
                String str = (String) this.c;
                if (linkedHashMap.containsKey(str)) {
                    xzf xzf = (xzf) linkedHashMap.get(str);
                    xzf.f = false;
                    if (!xzf.e) {
                        linkedHashMap.remove(str);
                    }
                }
                xr12.J();
                return;
            case 4:
                ((dwd) this.b).a((fwd) this.c);
                return;
            case 5:
                ((HashSet) ((lr1) this.b).b.b).remove((ns1) this.c);
                return;
            case 6:
                ((eu1) this.b).a = (jv1) this.c;
                return;
            case 7:
                List<n72> list = (List) this.c;
                r62 r62 = (r62) this.b;
                hs7 hs7 = r62.l;
                hs7 hs72 = r62.A;
                ((iof) hs72.get()).getClass();
                iof.a("ChatController.load().nonParticipantChats");
                try {
                    ((a74) ((s74) hs7.get())).a();
                    for (n72 n72 : list) {
                        ((a74) ((s74) hs7.get())).c.a(n72.b, LongCompanionObject.MAX_VALUE, bl4.REGULAR);
                        f6d f6d = ((a74) ((s74) hs7.get())).b;
                        long j = n72.b;
                        f6d.getClass();
                        ((OneMeRoomDatabase) f6d.a.m()).p(new e6d(0, new cy2(f6d, j, 1)));
                        ((jna) ((rl) r62.p.get())).n(n72.c.a, true);
                    }
                    ((a74) ((s74) hs7.get())).c();
                    ((a74) ((s74) hs7.get())).b();
                    ((iof) hs72.get()).getClass();
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    ((a74) ((s74) hs7.get())).b();
                    throw th;
                }
            case 8:
                r62 r622 = (r62) this.b;
                r622.getClass();
                StringBuilder sb = new StringBuilder("syncPins, pins size = ");
                Map map = (Map) this.c;
                sb.append(map.size());
                z68.c("r62", sb.toString(), new Object[0]);
                Iterator it2 = ((os) ((fa9) r622.s.get()).m(new ArrayList(map.keySet())).entrySet()).iterator();
                while (true) {
                    rs rsVar = (rs) it2;
                    if (rsVar.hasNext()) {
                        rsVar.next();
                        Long l = (Long) map.get(rsVar.getKey());
                        if (!(l == null || (ha9 = (ha9) rsVar.getValue()) == null)) {
                            ((jna) ((rl) r622.p.get())).K(l.longValue(), Collections.singletonList(Long.valueOf(ha9.c)));
                            z68.c("r62", "syncPin, chatId = " + l, new Object[0]);
                        }
                    } else {
                        return;
                    }
                }
            case 9:
                int i = ChatExtraActionsView.y0;
                yk6 yk6 = ((ChatExtraActionsView) this.b).z;
                yk6.getClass();
                Object obj = ((lf5) this.c).c;
                if (obj != null) {
                    yk6.a.invoke((pm6) obj);
                    return;
                }
                return;
            case 10:
                bc3.access$addObserverForBackInvoker((bc3) this.b, (fma) this.c);
                return;
            case 11:
                a5b a5b = (a5b) this.b;
                m9c m9c = (m9c) this.c;
                if (a5b.b == a5b.d) {
                    synchronized (a5b) {
                        ts1 = a5b.a;
                        a5b.a = null;
                        a5b.b = m9c;
                    }
                    ts1.getClass();
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            case 12:
                ms7 ms7 = (ms7) this.b;
                m9c m9c2 = (m9c) this.c;
                synchronized (ms7) {
                    try {
                        if (ms7.b == null) {
                            ms7.a.add(m9c2);
                        } else {
                            ms7.b.add(m9c2.get());
                        }
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                            break;
                        }
                    }
                }
                return;
            case 13:
                iha iha = (iha) this.c;
                xi3 xi3 = (xi3) this.b;
                xi3.getClass();
                try {
                    iha.a(xi3.a.b);
                    return;
                } catch (InterruptedException | ExecutionException e) {
                    iha.onError(e);
                    return;
                }
            case Protos.Attaches.Attach.LOCATION /*14*/:
                for (cj3 cj3 : (List) this.b) {
                    Object obj2 = ((qj3) this.c).o;
                    cj3.d = obj2;
                    cj3.d(cj3.e, obj2);
                }
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.b;
                zz7 zz7 = (zz7) this.c;
                synchronized (constraintTrackingWorker.b) {
                    try {
                        if (constraintTrackingWorker.c) {
                            cyd cyd = constraintTrackingWorker.o;
                            String str2 = sj3.a;
                            cyd.j(new Object());
                        } else {
                            constraintTrackingWorker.o.l(zz7);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            case 16:
                ek3 ek3 = (ek3) this.b;
                ArrayList arrayList = ek3.v;
                ek3.w = arrayList;
                List list2 = (List) this.c;
                if (!(arrayList == null || list2 == null || arrayList.size() == 0 || list2.size() == 0)) {
                    ArrayList arrayList2 = ek3.v;
                    if (arrayList2.size() == list2.size()) {
                        int i2 = 0;
                        while (true) {
                            if (i2 < arrayList2.size()) {
                                a89 a89 = (a89) list2.get(i2);
                                a89 a892 = ((of9) arrayList2.get(i2)).a;
                                if (cvg.c(a892.a.y, a89.a.y)) {
                                    ha9 ha92 = a892.a;
                                    int b2 = ha92.b();
                                    ha9 ha93 = a89.a;
                                    if (b2 == ha93.b() && ha92.r() == ha93.r() && ha92.t() == ha93.t()) {
                                        if ((ha92.h() == null ? 0 : ha92.h().a.size()) == (ha93.h() == null ? 0 : ha93.h().a.size())) {
                                            int i3 = 0;
                                            while (i3 < ha92.b()) {
                                                l20 F = ha92.x0.F(i3);
                                                l20 F2 = ha93.x0.F(i3);
                                                g20 g20 = F.a;
                                                if (g20 == F2.a) {
                                                    int ordinal = g20.ordinal();
                                                    if (ordinal != 2) {
                                                        if (ordinal != 3) {
                                                            if (ordinal != 4) {
                                                                if (ordinal != 5) {
                                                                    if (ordinal == 9 && F.j.a == F2.j.a) {
                                                                    }
                                                                } else if (F.f.a != F2.f.a) {
                                                                }
                                                            } else if (F.e.a != F2.e.a) {
                                                            }
                                                        } else if (F.d.a != F2.d.a) {
                                                        }
                                                    } else if (F.b.y != F2.b.y) {
                                                    }
                                                    i3++;
                                                }
                                            }
                                            i2++;
                                        }
                                    }
                                }
                            } else {
                                z68.c("ek3", "animateChanges: don't animate", new Object[0]);
                                ArrayList arrayList3 = ek3.v;
                                if (arrayList3.size() == list2.size()) {
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 < arrayList3.size()) {
                                            a89 a893 = ((of9) arrayList3.get(i4)).a;
                                            a89 a894 = (a89) list2.get(i4);
                                            if (a893.a.r() == a894.a.r()) {
                                                ha9 ha94 = a893.a;
                                                if (ha94.h() != null) {
                                                    ha9 ha95 = a894.a;
                                                    if (ha95.h() != null) {
                                                        zf7 h = ha94.h();
                                                        zf7 h2 = ha95.h();
                                                        int i5 = 0;
                                                        while (i5 < h.a.size()) {
                                                            ew0 ew0 = (ew0) h.a.get(i5);
                                                            ew0 ew02 = (ew0) h2.a.get(i5);
                                                            if (ew0.size() == ew02.size()) {
                                                                int i6 = 0;
                                                                while (i6 < ew0.size()) {
                                                                    xv0 xv0 = (xv0) ew0.get(i6);
                                                                    xv0 xv02 = (xv0) ew02.get(i6);
                                                                    if (xv0.b == xv02.b && cvg.c(xv0.o, xv02.o) && cvg.c(xv0.a, xv02.a)) {
                                                                        i6++;
                                                                    }
                                                                }
                                                                i5++;
                                                            }
                                                        }
                                                        continue;
                                                    } else {
                                                        continue;
                                                    }
                                                }
                                                i4++;
                                            }
                                        } else {
                                            ArrayList arrayList4 = ek3.v;
                                            if (arrayList4.size() == list2.size()) {
                                                int i7 = 0;
                                                while (i7 < arrayList4.size()) {
                                                    a89 a895 = ((of9) arrayList4.get(i7)).a;
                                                    a89 a896 = (a89) list2.get(i7);
                                                    if (a895.a.t() == a896.a.t()) {
                                                        w28 w28 = a895.a.x0;
                                                        if ((w28 == null ? null : (i2d) w28.o) != null) {
                                                            w28 w282 = a896.a.x0;
                                                            if ((w282 == null ? null : (i2d) w282.o) == null) {
                                                                continue;
                                                            } else {
                                                                i2d i2d = w28 == null ? null : (i2d) w28.o;
                                                                i2d i2d2 = w282 == null ? null : (i2d) w282.o;
                                                                int i8 = 0;
                                                                while (i8 < i2d.a.size()) {
                                                                    h2d h2d = (h2d) i2d.a.get(i8);
                                                                    h2d h2d2 = (h2d) i2d2.a.get(i8);
                                                                    if (h2d.size() == h2d2.size()) {
                                                                        int i9 = 0;
                                                                        while (i9 < h2d.size()) {
                                                                            f2d f2d = (f2d) h2d.get(i9);
                                                                            f2d f2d2 = (f2d) h2d2.get(i9);
                                                                            if (f2d.a == f2d2.a && cvg.c(f2d.c, f2d2.c)) {
                                                                                i9++;
                                                                            }
                                                                        }
                                                                        i8++;
                                                                    }
                                                                }
                                                                continue;
                                                            }
                                                        }
                                                        i7++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        z68.c("ek3", "animateChanges: animateMessageChanges", new Object[0]);
                    }
                    int size = ek3.v.size();
                    ek3.v = ek3.E(list2);
                    if (size > 0) {
                        ek3.q(0, size);
                    }
                    if (list2.size() > 0) {
                        ek3.o(0, list2.size());
                        return;
                    }
                    return;
                }
                ek3.v = ek3.E(list2);
                ek3.m();
                return;
            case LangUtils.HASH_SEED /*17*/:
                rx3 rx3 = (rx3) this.b;
                rx3.getClass();
                ((Runnable) this.c).run();
                ((CountDownLatch) rx3.d).countDown();
                return;
            case 18:
                ejd ejd = ((c24) this.b).f;
                List listOf = CollectionsKt.listOf((a24) this.c);
                ejd.getClass();
                ejd.e(listOf);
                return;
            case 19:
                g54 g54 = (g54) this.b;
                g54.getClass();
                try {
                    Process.setThreadPriority(g54.b);
                } catch (Throwable unused) {
                }
                ((Runnable) this.c).run();
                return;
            case 20:
                h54 h54 = (h54) this.b;
                Process.setThreadPriority(h54.c);
                StrictMode.ThreadPolicy threadPolicy = h54.o;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.c).run();
                return;
            case 21:
                p7d p7d = ((ln8) ((e4) this.b).b).P1;
                Handler handler = (Handler) p7d.b;
                if (handler != null) {
                    handler.post(new a70(p7d, (i70) this.c, 0));
                    return;
                }
                return;
            case 22:
                le4 le4 = (le4) this.b;
                oe4 oe4 = le4.o;
                if (oe4.p != 0 && !le4.c) {
                    Looper looper = oe4.t;
                    looper.getClass();
                    le4.b = oe4.e(looper, le4.a, (ca6) this.c, false);
                    oe4.n.add(le4);
                    return;
                }
                return;
            case 23:
                me4 me4 = (me4) this.b;
                pe4 pe4 = me4.o;
                if (pe4.p != 0 && !me4.c) {
                    Looper looper2 = pe4.t;
                    looper2.getClass();
                    me4.b = pe4.e(looper2, me4.a, (ea6) this.c, false);
                    pe4.n.add(me4);
                    return;
                }
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                tf4 tf4 = (tf4) this.b;
                tf4.z = false;
                tf4.b((Uri) this.c);
                return;
            case 25:
                uf4 uf4 = (uf4) this.b;
                uf4.z = false;
                uf4.d((Uri) this.c);
                return;
            case 26:
                ((pi4) this.b).a((qge) this.c);
                return;
            case 27:
                ((ti4) this.b).Y.add((na0) this.c);
                return;
            case 28:
                ti4 ti4 = (ti4) this.b;
                ew6 ew6 = ti4.c;
                s3f s3f = (s3f) this.c;
                Surface b3 = s3f.b(ew6, new pv1(1, (Object) ti4, (Object) s3f));
                ti4.a.o(b3);
                ti4.y.put(s3f, b3);
                return;
            default:
                ti4 ti42 = (ti4) this.b;
                ti42.z++;
                nr4 nr4 = ti42.a;
                ck6.d((AtomicBoolean) nr4.c, true);
                ck6.c((Thread) nr4.e);
                SurfaceTexture surfaceTexture = new SurfaceTexture(nr4.b);
                z3f z3f = (z3f) this.c;
                surfaceTexture.setDefaultBufferSize(z3f.b.getWidth(), z3f.b.getHeight());
                Surface surface = new Surface(surfaceTexture);
                ib4 ib4 = new ib4(8, ti42, z3f);
                ew6 ew62 = ti42.c;
                z3f.c(ew62, ib4);
                z3f.b(surface, ew62, new si4(ti42, z3f, surfaceTexture, surface));
                surfaceTexture.setOnFrameAvailableListener(ti42, ti42.o);
                return;
        }
    }
}
