package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import kotlin.text.Typography;
import ru.ok.tamtam.nano.Protos;

/* renamed from: bpa  reason: default package */
public final class bpa implements by9, p44, q64, pie, yzf, vma, lma, hma, kxg {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ bpa(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static kbe t(bpa bpa, Context context, int i) {
        bpa.getClass();
        int i2 = fza.h;
        uoe uoe = (uoe) bpa.b;
        return i == i2 ? new qb8(context, uoe, 81, 0) : new qb8(context, uoe, 81, 1);
    }

    public boolean A() {
        return true;
    }

    public ewd B() {
        ewd ewd = new ewd();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.b).entrySet()) {
            xzf xzf = (xzf) entry.getValue();
            if (xzf.e) {
                ewd.a(xzf.a);
                arrayList.add((String) entry.getKey());
            }
        }
        arrayList.toString();
        return ewd;
    }

    public long C() {
        return 0;
    }

    public long D(long j) {
        return 1;
    }

    public long E(long j, long j2) {
        return 1;
    }

    public Collection F() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.b).entrySet()) {
            if (((xzf) entry.getValue()).e) {
                arrayList.add(((xzf) entry.getValue()).a);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public Collection G() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.b).entrySet()) {
            if (((xzf) entry.getValue()).e) {
                arrayList.add(((xzf) entry.getValue()).b);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public int H(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.b;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((q44) arrayList.get(i)).b) {
                return i;
            }
            i++;
        }
    }

    public boolean I(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        if (!linkedHashMap.containsKey(str)) {
            return false;
        }
        return ((xzf) linkedHashMap.get(str)).e;
    }

    public void J(long j, long j2) {
        lrf lrf = (lrf) this.b;
        wd5 wd5 = lrf.q;
        wd5.getClass();
        boolean z = true;
        n79.g(j >= 0 || j == -9223372036854775807L);
        wd5.b = j;
        if (j2 <= 0 && j2 != -1) {
            z = false;
        }
        n79.f("Invalid file size = " + j2, z);
        wd5.c = j2;
        prf prf = lrf.r;
        prf.getClass();
        prf.g();
        prf.j.b((Object) null, 4, 0, 0).b();
    }

    public void K(String str, fwd fwd, zzf zzf, hc0 hc0, List list) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        if (linkedHashMap.containsKey(str)) {
            xzf xzf = new xzf(fwd, zzf, hc0, list);
            xzf xzf2 = (xzf) linkedHashMap.get(str);
            xzf.e = xzf2.e;
            xzf.f = xzf2.f;
            linkedHashMap.put(str, xzf);
        }
    }

    public void a(Object obj) {
        ((CountDownLatch) this.b).countDown();
    }

    public long b(long j) {
        return 0;
    }

    public long c(long j) {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((q44) arrayList.get(0)).b) {
            return ((q44) arrayList.get(0)).b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            q44 q44 = (q44) arrayList.get(i);
            if (j < q44.b) {
                long j2 = ((q44) arrayList.get(i - 1)).d;
                int i2 = (j2 > -9223372036854775807L ? 1 : (j2 == -9223372036854775807L ? 0 : -1));
                long j3 = q44.b;
                return (i2 == 0 || j2 <= j || j2 >= j3) ? j3 : j2;
            }
        }
        long j4 = ((q44) b0h.w(arrayList)).d;
        if (j4 == -9223372036854775807L || j >= j4) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    public void clear() {
        ((ArrayList) this.b).clear();
    }

    public void d() {
        ((cpb) this.b).c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(defpackage.q44 r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x000f
            r4 = r6
            goto L_0x0010
        L_0x000f:
            r4 = r5
        L_0x0010:
            defpackage.n79.g(r4)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 > 0) goto L_0x0023
            long r7 = r10.d
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0021
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x0023
        L_0x0021:
            r2 = r6
            goto L_0x0024
        L_0x0023:
            r2 = r5
        L_0x0024:
            java.lang.Object r9 = r9.b
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            int r3 = r9.size()
            int r3 = r3 - r6
        L_0x002d:
            if (r3 < 0) goto L_0x0050
            java.lang.Object r4 = r9.get(r3)
            q44 r4 = (defpackage.q44) r4
            long r7 = r4.b
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 < 0) goto L_0x0040
            int r3 = r3 + r6
            r9.add(r3, r10)
            return r2
        L_0x0040:
            java.lang.Object r4 = r9.get(r3)
            q44 r4 = (defpackage.q44) r4
            long r7 = r4.b
            int r4 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r4 > 0) goto L_0x004d
            r2 = r5
        L_0x004d:
            int r3 = r3 + -1
            goto L_0x002d
        L_0x0050:
            r9.add(r5, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpa.e(q44, long):boolean");
    }

    public void f() {
        ((cpb) this.b).c();
    }

    public tb7 g(long j) {
        int H = H(j);
        if (H == 0) {
            lx5 lx5 = tb7.b;
            return k0d.v;
        }
        q44 q44 = (q44) ((ArrayList) this.b).get(H - 1);
        long j2 = q44.d;
        if (j2 == -9223372036854775807L || j < j2) {
            return q44.a;
        }
        lx5 lx52 = tb7.b;
        return k0d.v;
    }

    public oie h() {
        return (wc8) this.b;
    }

    public long i(long j, long j2) {
        return j2;
    }

    public void j() {
        ((cpb) this.b).c();
    }

    public long k(long j) {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty() || j < ((q44) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((q44) arrayList.get(i)).b;
            int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
            if (i2 == 0) {
                return j2;
            }
            if (i2 < 0) {
                q44 q44 = (q44) arrayList.get(i - 1);
                long j3 = q44.d;
                return (j3 == -9223372036854775807L || j3 > j) ? q44.b : j3;
            }
        }
        q44 q442 = (q44) b0h.w(arrayList);
        long j4 = q442.d;
        return (j4 == -9223372036854775807L || j < j4) ? q442.b : j4;
    }

    public long l(long j, long j2) {
        return 0;
    }

    public void m(long j) {
        int H = H(j);
        if (H > 0) {
            ((ArrayList) this.b).subList(0, H).clear();
        }
    }

    public long n(long j, long j2) {
        return -9223372036854775807L;
    }

    public dpc o(long j) {
        return (dpc) this.b;
    }

    public void onFailure(Exception exc) {
        ((CountDownLatch) this.b).countDown();
    }

    public void p() {
        ((cpb) this.b).c();
    }

    public yy9 q() {
        return (pz9) this.b;
    }

    public void r() {
        ((CountDownLatch) this.b).countDown();
    }

    public zzf s() {
        return new lxe(c5b.a((pz9) this.b));
    }

    public String toString() {
        switch (this.a) {
            case 10:
                return g63.l(new StringBuilder("<"), (String) this.b, Typography.greater);
            default:
                return super.toString();
        }
    }

    public long u(long j, long j2) {
        return 0;
    }

    public void v() {
        ((cpb) this.b).c();
    }

    public void w() {
        ((cpb) this.b).c();
    }

    public void x() {
        ((cpb) this.b).c();
    }

    public Object y() {
        p3h p3h = (p3h) ((kxg) this.b).y();
        if (p3h != null) {
            return p3h;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public void z(k97 k97, long j) {
        Bitmap underlyingBitmap;
        CloseableStaticBitmap closeableStaticBitmap = k97 instanceof CloseableStaticBitmap ? (CloseableStaticBitmap) k97 : null;
        if (closeableStaticBitmap != null && (underlyingBitmap = closeableStaticBitmap.getUnderlyingBitmap()) != null) {
            to0 to0 = new to0(underlyingBitmap);
            ((me) ((ggd) this.b)).d(to0, j + ".jpg");
        }
    }

    public bpa(int i) {
        this.a = i;
        switch (i) {
            case 7:
                this.b = new Object();
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return;
            case 16:
                this.b = new CountDownLatch(1);
                return;
            default:
                this.b = new ArrayList();
                return;
        }
    }

    public bpa(String str) {
        this.a = 12;
        this.b = new LinkedHashMap();
    }

    public bpa(pz9 pz9) {
        Object obj;
        this.a = 9;
        this.b = pz9;
        Object obj2 = null;
        try {
            obj = pz9.n(cdf.h0);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        Class cls = (Class) obj;
        Class<kxe> cls2 = kxe.class;
        if (cls == null || cls.equals(cls2)) {
            ((pz9) this.b).f(zzf.r0, b0g.v);
            la0 la0 = cdf.h0;
            pz9 pz92 = (pz9) this.b;
            pz92.f(la0, cls2);
            try {
                obj2 = pz92.n(cdf.g0);
            } catch (IllegalArgumentException unused2) {
            }
            if (obj2 == null) {
                pz92.f(cdf.g0, cls2.getCanonicalName() + "-" + UUID.randomUUID());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
    }

    public bpa(q4 q4Var) {
        this.a = 0;
        this.b = q4Var.h(e24.class);
    }
}
