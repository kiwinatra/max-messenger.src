package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.transformer.ExportException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: u40  reason: default package */
public final class u40 {
    public boolean a;
    public boolean b;
    public int c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;

    public u40(wc8 wc8, tb7 tb7) {
        this.d = new ArrayList();
        wc8.getClass();
        this.e = new yb4(false, true);
        this.g = j60.e;
        this.h = m60.a;
        this.f = new h60(tb7);
    }

    public static boolean f(TotalCaptureResult totalCaptureResult, boolean z) {
        if (totalCaptureResult == null) {
            return false;
        }
        npg npg = new npg(5, (Object) a9f.b, (Object) totalCaptureResult);
        Set set = az3.a;
        boolean z2 = npg.F() == 2 || npg.F() == 1 || az3.a.contains(npg.C());
        boolean z3 = npg.E() == 2;
        boolean z4 = !z ? z3 || az3.c.contains(npg.x()) : z3 || az3.d.contains(npg.x());
        boolean z5 = npg.H() == 2 || az3.b.contains(npg.l());
        Objects.toString(npg.x());
        Objects.toString(npg.C());
        Objects.toString(npg.l());
        return z2 && z4 && z5;
    }

    public static boolean g(int i, TotalCaptureResult totalCaptureResult) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return false;
                }
                if (i != 3) {
                    throw new AssertionError(i);
                }
            }
            return true;
        }
        Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
        return num != null && num.intValue() == 4;
    }

    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b((bt1) it.next());
        }
    }

    public void b(bt1 bt1) {
        ArrayList arrayList = (ArrayList) this.d;
        if (!arrayList.contains(bt1)) {
            arrayList.add(bt1);
        }
    }

    public void c(je3 je3) {
        for (la0 la0 : je3.l()) {
            pz9 pz9 = (pz9) this.f;
            pz9.getClass();
            try {
                pz9.n(la0);
            } catch (IllegalArgumentException unused) {
            }
            ((pz9) this.f).e(la0, je3.v(la0), je3.n(la0));
        }
    }

    public bx1 d() {
        ArrayList arrayList = new ArrayList((HashSet) this.e);
        c5b a2 = c5b.a((pz9) this.f);
        int i = this.c;
        boolean z = this.a;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.d);
        boolean z2 = this.b;
        a9f a9f = a9f.b;
        ArrayMap arrayMap = new ArrayMap();
        uz9 uz9 = (uz9) this.g;
        for (String str : uz9.a.keySet()) {
            arrayMap.put(str, uz9.a.get(str));
        }
        return new bx1(arrayList, a2, i, z, arrayList2, z2, new a9f(arrayMap), (it1) this.h);
    }

    public ks1 e(int i, int i2, int i3) {
        ykb ykb = (ykb) this.f;
        zq0 zq0 = new zq0(ykb, 4);
        ks1 ks1 = new ks1(this.c, (Executor) this.g, (ScheduledExecutorService) this.h, (lr1) this.d, this.b, zq0);
        ArrayList arrayList = ks1.h;
        lr1 lr1 = (lr1) this.d;
        if (i == 0) {
            arrayList.add(new gs1(lr1));
        }
        if (i2 == 3) {
            arrayList.add(new qs1(lr1, (Executor) this.g, (ScheduledExecutorService) this.h, new p1e(ykb)));
        } else if (this.a) {
            boolean z = ((bv1) this.e).b;
            if (z || this.c == 3 || i3 == 1) {
                arrayList.add(new ss1((lr1) this.d, i2, (Executor) this.g, (ScheduledExecutorService) this.h, !z && ((AtomicInteger) lr1.o.c).get() <= 0));
            } else {
                arrayList.add(new fs1(lr1, i2, zq0));
            }
        }
        Objects.toString(arrayList);
        return ks1;
    }

    public boolean h() {
        return !((ByteBuffer) this.h).hasRemaining() && this.c >= ((ArrayList) this.d).size() && ((yb4) this.e).e();
    }

    public w40 i(e05 e05, ea6 ea6) {
        n79.g(ea6.D != -1);
        try {
            w40 w40 = new w40((j60) this.g, e05, ea6);
            if (Objects.equals((j60) this.g, j60.e)) {
                j60 j60 = w40.a;
                this.g = j60;
                ((h60) this.f).a(j60);
                ((h60) this.f).b();
            }
            ((ArrayList) this.d).add(new t40(w40));
            LinkedHashMap linkedHashMap = p94.a;
            synchronized (p94.class) {
            }
            return w40;
        } catch (AudioProcessor$UnhandledAudioFormatException e2) {
            throw ExportException.b(e2, "Error while registering input " + ((ArrayList) this.d).size());
        }
    }

    public u40(lr1 lr1, qt1 qt1, ykb ykb, tsd tsd, ew6 ew6) {
        boolean z = true;
        this.c = 1;
        this.d = lr1;
        Integer num = (Integer) qt1.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.b = (num == null || num.intValue() != 2) ? false : z;
        this.g = tsd;
        this.h = ew6;
        this.f = ykb;
        this.e = new bv1(ykb, 9);
        this.a = b0h.E(new d9d(26, qt1));
    }

    public u40() {
        this.e = new HashSet();
        this.f = pz9.c();
        this.c = -1;
        this.a = false;
        this.d = new ArrayList();
        this.b = false;
        this.g = uz9.a();
    }

    public u40(bx1 bx1) {
        HashSet hashSet = new HashSet();
        this.e = hashSet;
        this.f = pz9.c();
        this.c = -1;
        this.a = false;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.b = false;
        this.g = uz9.a();
        hashSet.addAll(bx1.a);
        this.f = pz9.d(bx1.b);
        this.c = bx1.c;
        arrayList.addAll(bx1.e);
        this.b = bx1.f;
        ArrayMap arrayMap = new ArrayMap();
        a9f a9f = bx1.g;
        for (String str : a9f.a.keySet()) {
            arrayMap.put(str, a9f.a.get(str));
        }
        this.g = new a9f(arrayMap);
        this.a = bx1.d;
    }
}
