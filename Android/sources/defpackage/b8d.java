package defpackage;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.media.Rating;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.reflect.KProperty;
import org.webrtc.Loggable;
import org.webrtc.Logging;

/* renamed from: b8d  reason: default package */
public final class b8d implements k69, rv, pf1, vye, q28, nj6, v8, eo1, osd, ize, k99, Loggable {
    public static b8d b;
    public static final c8d c = new c8d(0, 0, 0, false, false);
    public Object a;

    public /* synthetic */ b8d(Object obj) {
        this.a = obj;
    }

    public static b8d i(qt1 qt1) {
        DynamicRangeProfiles h;
        int i = Build.VERSION.SDK_INT;
        b8d b8d = null;
        if (i >= 33 && (h = z3.h(qt1.a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) != null) {
            bs0.r("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.", i >= 33);
            b8d = new b8d((Object) new az4(h));
        }
        return b8d == null ? bz4.a : b8d;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, b8d] */
    public static synchronized b8d n() {
        b8d b8d;
        synchronized (b8d.class) {
            try {
                if (b == null) {
                    b = new Object();
                }
                b8d = b;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return b8d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A() {
        /*
            r3 = this;
            java.lang.Object r3 = r3.a
            y87 r3 = (defpackage.y87) r3
            java.util.concurrent.atomic.AtomicReference r0 = r3.p
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference r1 = r3.p     // Catch:{ all -> 0x0014 }
            r2 = 0
            java.lang.Object r1 = r1.getAndSet(r2)     // Catch:{ all -> 0x0014 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0014 }
            if (r1 != 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            goto L_0x0024
        L_0x0014:
            r3 = move-exception
            goto L_0x0025
        L_0x0016:
            int r1 = r1.intValue()     // Catch:{ all -> 0x0014 }
            int r2 = r3.F()     // Catch:{ all -> 0x0014 }
            if (r1 == r2) goto L_0x0023
            r3.I()     // Catch:{ all -> 0x0014 }
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
        L_0x0024:
            return
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b8d.A():void");
    }

    public void E(t28 t28, long j, long j2, boolean z) {
        ((o64) this.a).w((q8b) t28, j, j2);
    }

    public void H(t28 t28, long j, long j2) {
        q8b q8b = (q8b) t28;
        o64 o64 = (o64) this.a;
        o64.getClass();
        long j3 = q8b.a;
        tne tne = q8b.o;
        Uri uri = tne.c;
        l28 l28 = new l28(j2, tne.o);
        o64.m.getClass();
        o64.q.x(l28, q8b.c, -1, (ea6) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        o64.L = ((Long) q8b.w).longValue() - j;
        o64.y(true);
    }

    public p01 Z(t28 t28, long j, long j2, IOException iOException, int i) {
        q8b q8b = (q8b) t28;
        o64 o64 = (o64) this.a;
        o64.getClass();
        long j3 = q8b.a;
        tne tne = q8b.o;
        Uri uri = tne.c;
        o64.q.A(new l28(j2, tne.o), q8b.c, iOException, true);
        o64.m.getClass();
        o64.x(iOException);
        return l15.v;
    }

    public void a(Object obj) {
        eg7 eg7 = (eg7) obj;
        g65 g65 = (g65) this.a;
        g65.q.getClass();
        long f = ejd.f();
        if (!eg7.f.get()) {
            bs0.n(f >= 0);
            eg7.g = f;
            if (!eg7.f.get()) {
                eg7.h = true;
                eg7.b();
                hd8.a(hd8.J(eg7.d), new u6h(16, this), g65.h);
                return;
            }
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
        throw new IllegalStateException("The buffer is submitted or canceled.");
    }

    public void c(qsd qsd) {
        e27 e27 = (e27) qsd;
        r07 r07 = (r07) this.a;
        r07.B0.c(r07);
    }

    public int d(long j) {
        return j < 0 ? 0 : -1;
    }

    public PointF e() {
        return ((rf1) this.a).v;
    }

    public void g(Throwable th) {
        ((g65) this.a).b(0, "Unable to acquire InputBuffer.", th);
    }

    public boolean h(m69 m69, MenuItem menuItem) {
        boolean z;
        z7 z7Var = ((ActionMenuView) this.a).x0;
        if (z7Var == null) {
            return false;
        }
        Toolbar toolbar = (Toolbar) ((syc) z7Var).b;
        if (toolbar.S0.a(menuItem)) {
            z = true;
        } else {
            hmf hmf = toolbar.U0;
            z = hmf != null ? hmf.onMenuItemClick(menuItem) : false;
        }
        return z;
    }

    public ef j(m7f m7f, Rect rect) {
        AnimatedFactoryV2Impl animatedFactoryV2Impl = (AnimatedFactoryV2Impl) this.a;
        if (animatedFactoryV2Impl.g == null) {
            animatedFactoryV2Impl.g = new djd(7);
        }
        return new ef(animatedFactoryV2Impl.g, m7f, rect, animatedFactoryV2Impl.d);
    }

    public long k(int i) {
        n79.g(i == 0);
        return 0;
    }

    public void l(float f, float f2) {
        KProperty[] kPropertyArr = rf1.v0;
        PointF pointF = ((rf1) this.a).v;
        pointF.x = f;
        pointF.y = f2;
    }

    public void m(byte[] bArr, int i, int i2, hze hze, pk3 pk3) {
        n44 n44;
        l8b l8b = (l8b) this.a;
        l8b.E(i2 + i, bArr);
        l8b.G(i);
        ArrayList arrayList = new ArrayList();
        while (l8b.a() > 0) {
            n79.f("Incomplete Mp4Webvtt Top Level box header found.", l8b.a() >= 8);
            int g = l8b.g();
            if (l8b.g() == 1987343459) {
                int i3 = g - 8;
                CharSequence charSequence = null;
                l44 l44 = null;
                while (i3 > 0) {
                    n79.f("Incomplete vtt cue box header found.", i3 >= 8);
                    int g2 = l8b.g();
                    int g3 = l8b.g();
                    int i4 = g2 - 8;
                    byte[] bArr2 = l8b.a;
                    int i5 = l8b.b;
                    int i6 = v0g.a;
                    String str = new String(bArr2, i5, i4, x22.c);
                    l8b.H(i4);
                    i3 = (i3 - 8) - i4;
                    if (g3 == 1937011815) {
                        lmg lmg = new lmg();
                        nmg.e(str, lmg);
                        l44 = lmg.b();
                    } else if (g3 == 1885436268) {
                        charSequence = nmg.f((String) null, str.trim(), Collections.emptyList());
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (l44 != null) {
                    l44.a = charSequence;
                    n44 = l44.a();
                } else {
                    Pattern pattern = nmg.a;
                    lmg lmg2 = new lmg();
                    lmg2.c = charSequence;
                    n44 = lmg2.b().a();
                }
                arrayList.add(n44);
            } else {
                l8b.H(g - 8);
            }
        }
        pk3.accept(new q44(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public void o(m69 m69) {
        k69 k69 = ((ActionMenuView) this.a).x;
        if (k69 != null) {
            k69.o(m69);
        }
    }

    public void onActivityResult(Object obj) {
        a c2;
        Map map = (Map) obj;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
        }
        c cVar = (c) this.a;
        zc6 zc6 = (zc6) cVar.G.pollFirst();
        if (zc6 != null && (c2 = cVar.c.c(zc6.a)) != null) {
            c2.v2(zc6.b, strArr, iArr);
        }
    }

    public void onLogMessage(String str, Logging.Severity severity, String str2) {
        voc voc;
        WeakReference weakReference = (WeakReference) this.a;
        if (weakReference != null && str != null && str2 != null && (voc = (voc) weakReference.get()) != null) {
            voc.log(str2, str);
        }
    }

    public List p(long j) {
        return j >= 0 ? (List) this.a : Collections.emptyList();
    }

    public int q() {
        return 2;
    }

    public Object r(do1 do1) {
        oj6 oj6 = (oj6) this.a;
        bs0.r("The result can only set once!", oj6.b == null);
        oj6.b = do1;
        return "FutureChain[" + oj6 + "]";
    }

    public Unit s(long j, List list) {
        if (list.isEmpty()) {
            return Unit.INSTANCE;
        }
        ((gx) this.a).B();
        ((gx) this.a).o(j, list, true, false);
        return Unit.INSTANCE;
    }

    public int t() {
        return 1;
    }

    public void u() {
        r07 r07 = (r07) this.a;
        int i = r07.C0 - 1;
        r07.C0 = i;
        if (i <= 0) {
            int i2 = 0;
            for (e27 e27 : r07.E0) {
                e27.c();
                i2 += e27.R0.a;
            }
            spf[] spfArr = new spf[i2];
            int i3 = 0;
            for (e27 e272 : r07.E0) {
                e272.c();
                int i4 = e272.R0.a;
                int i5 = 0;
                while (i5 < i4) {
                    e272.c();
                    spfArr[i3] = e272.R0.a(i5);
                    i5++;
                    i3++;
                }
            }
            r07.D0 = new upf(spfArr);
            r07.B0.b(r07);
        }
    }

    public void v(String str, Bitmap bitmap) {
        Integer num = (Integer) vs8.c.get(str);
        if (num == null || num.intValue() == 2) {
            ((Bundle) this.a).putParcelable(str, bitmap);
            return;
        }
        throw new IllegalArgumentException(wj6.k("The ", str, " key cannot be used to put a Bitmap"));
    }

    public void w(long j, String str) {
        Integer num = (Integer) vs8.c.get(str);
        if (num == null || num.intValue() == 0) {
            ((Bundle) this.a).putLong(str, j);
            return;
        }
        throw new IllegalArgumentException(wj6.k("The ", str, " key cannot be used to put a long"));
    }

    public void x(String str, upc upc) {
        Object obj;
        Integer num = (Integer) vs8.c.get(str);
        if (num == null || num.intValue() == 3) {
            if (upc.c == null) {
                boolean c2 = upc.c();
                int i = upc.a;
                if (c2) {
                    boolean z = true;
                    boolean z2 = false;
                    float f = upc.b;
                    switch (i) {
                        case 1:
                            if (i == 1) {
                                if (f != 1.0f) {
                                    z = false;
                                }
                                z2 = z;
                            }
                            upc.c = Rating.newHeartRating(z2);
                            break;
                        case 2:
                            if (i == 2) {
                                if (f != 1.0f) {
                                    z = false;
                                }
                                z2 = z;
                            }
                            upc.c = Rating.newThumbRating(z2);
                            break;
                        case 3:
                        case 4:
                        case 5:
                            upc.c = Rating.newStarRating(i, upc.b());
                            break;
                        case 6:
                            if (i != 6 || !upc.c()) {
                                f = -1.0f;
                            }
                            upc.c = Rating.newPercentageRating(f);
                            break;
                        default:
                            obj = null;
                            break;
                    }
                } else {
                    upc.c = Rating.newUnratedRating(i);
                }
            }
            obj = upc.c;
            ((Bundle) this.a).putParcelable(str, (Parcelable) obj);
            return;
        }
        throw new IllegalArgumentException(wj6.k("The ", str, " key cannot be used to put a Rating"));
    }

    public void y(String str, String str2) {
        Integer num = (Integer) vs8.c.get(str);
        if (num == null || num.intValue() == 1) {
            ((Bundle) this.a).putCharSequence(str, str2);
            return;
        }
        throw new IllegalArgumentException(wj6.k("The ", str, " key cannot be used to put a String"));
    }

    public void z(CharSequence charSequence, String str) {
        Integer num = (Integer) vs8.c.get(str);
        if (num == null || num.intValue() == 1) {
            ((Bundle) this.a).putCharSequence(str, charSequence);
            return;
        }
        throw new IllegalArgumentException(wj6.k("The ", str, " key cannot be used to put a CharSequence"));
    }

    public b8d(p67 p67) {
        vzg.m(p67);
        this.a = p67;
    }

    public b8d(int i) {
        switch (i) {
            case 26:
                this.a = new l8b();
                return;
            default:
                this.a = new Bundle();
                return;
        }
    }
}
