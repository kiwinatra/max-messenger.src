package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: km3  reason: default package */
public final class km3 implements ceb {
    public static final EnumSet s;
    public static final Set t;
    public static final ws u;
    public static final Set v;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final CopyOnWriteArraySet c = new CopyOnWriteArraySet();
    public final Object d = new Object();
    public volatile boolean e = false;
    public final hs7 f;
    public final sv0 g;
    public final jtb h;
    public final hs7 i;
    public final hs7 j;
    public final hs7 k;
    public final hs7 l;
    public final hs7 m;
    public final lfd n;
    public final iof o;
    public final hs7 p;
    public final CopyOnWriteArraySet q = new CopyOnWriteArraySet();
    public eu3 r = null;

    static {
        tm3 tm3 = tm3.b;
        tm3 tm32 = tm3.a;
        s = EnumSet.of(tm3, tm32);
        t = Collections.singleton(tm32);
        sm3 sm3 = sm3.b;
        sm3 sm32 = sm3.a;
        u = n54.b(null, sm3, sm32);
        v = Collections.singleton(sm32);
    }

    public km3(hs7 hs7, sv0 sv0, jtb jtb, hs7 hs72, hs7 hs73, hs7 hs74, hs7 hs75, hs7 hs76, lfd lfd, iof iof, hs7 hs77) {
        this.f = hs7;
        this.g = sv0;
        this.h = jtb;
        this.i = hs72;
        this.j = hs73;
        this.k = hs74;
        this.l = hs75;
        this.m = hs76;
        this.n = lfd;
        this.o = iof;
        this.p = hs77;
    }

    public final void A(long j2, boolean z) {
        z68.c("km3", "setShowBlockPanel, id = " + j2 + ", show = " + z, new Object[0]);
        e(j2, new hm3(z ^ true));
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e5 A[Catch:{ all -> 0x009b }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x006a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B(java.util.List r17, long[] r18) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            hs7 r8 = r0.k
            hs7 r9 = r0.f
            r10 = 0
            if (r7 == 0) goto L_0x0046
            int r1 = r7.length
            if (r1 != 0) goto L_0x000f
            goto L_0x0046
        L_0x000f:
            ws r1 = new ws
            int r2 = r7.length
            r1.<init>((int) r2)
            int r2 = r7.length
            r3 = r10
        L_0x0017:
            if (r3 >= r2) goto L_0x0025
            r4 = r7[r3]
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.add(r4)
            int r3 = r3 + 1
            goto L_0x0017
        L_0x0025:
            java.util.Iterator r2 = r17.iterator()
        L_0x0029:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x003f
            java.lang.Object r3 = r2.next()
            fo3 r3 = (defpackage.fo3) r3
            long r3 = r3.a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.remove(r3)
            goto L_0x0029
        L_0x003f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
        L_0x0044:
            r11 = r2
            goto L_0x004b
        L_0x0046:
            java.util.List r2 = java.util.Collections.emptyList()
            goto L_0x0044
        L_0x004b:
            boolean r1 = r11.isEmpty()
            if (r1 != 0) goto L_0x0126
            jtb r1 = r0.h
            ltb r1 = (defpackage.ltb) r1
            a33 r1 = r1.a
            long r12 = r1.m()
            java.lang.Object r1 = r9.get()     // Catch:{ all -> 0x009b }
            s74 r1 = (defpackage.s74) r1     // Catch:{ all -> 0x009b }
            a74 r1 = (defpackage.a74) r1     // Catch:{ all -> 0x009b }
            r1.a()     // Catch:{ all -> 0x009b }
            java.util.Iterator r14 = r11.iterator()     // Catch:{ all -> 0x009b }
        L_0x006a:
            boolean r1 = r14.hasNext()     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x00ee
            java.lang.Object r1 = r14.next()     // Catch:{ all -> 0x009b }
            r15 = r1
            java.lang.Long r15 = (java.lang.Long) r15     // Catch:{ all -> 0x009b }
            long r1 = r15.longValue()     // Catch:{ all -> 0x009b }
            vk3 r1 = r0.p(r1, r10)     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x009e
            vm3 r1 = r1.a     // Catch:{ all -> 0x009b }
            long r1 = r1.b     // Catch:{ all -> 0x009b }
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x008c
            goto L_0x009e
        L_0x008c:
            long r1 = r15.longValue()     // Catch:{ all -> 0x009b }
            c10 r3 = new c10     // Catch:{ all -> 0x009b }
            r4 = 17
            r3.<init>(r12, r4)     // Catch:{ all -> 0x009b }
            r0.e(r1, r3)     // Catch:{ all -> 0x009b }
            goto L_0x00db
        L_0x009b:
            r0 = move-exception
            goto L_0x011a
        L_0x009e:
            long r1 = r15.longValue()     // Catch:{ all -> 0x009b }
            java.lang.Object r3 = r8.get()     // Catch:{ all -> 0x009b }
            yva r3 = (defpackage.yva) r3     // Catch:{ all -> 0x009b }
            vk3 r1 = defpackage.vk3.a(r1, r12, r3)     // Catch:{ all -> 0x009b }
            vm3 r1 = r1.a
            java.lang.Object r2 = r9.get()     // Catch:{ all -> 0x009b }
            s74 r2 = (defpackage.s74) r2     // Catch:{ all -> 0x009b }
            a74 r2 = (defpackage.a74) r2     // Catch:{ all -> 0x009b }
            g6d r2 = r2.d     // Catch:{ all -> 0x009b }
            um3 r3 = r1.c     // Catch:{ all -> 0x009b }
            long r2 = r2.v(r3)     // Catch:{ all -> 0x009b }
            vk3 r4 = new vk3     // Catch:{ all -> 0x009b }
            vm3 r5 = new vm3     // Catch:{ all -> 0x009b }
            um3 r1 = r1.c     // Catch:{ all -> 0x009b }
            r5.<init>(r2, r1)     // Catch:{ all -> 0x009b }
            java.lang.Object r1 = r8.get()     // Catch:{ all -> 0x009b }
            yva r1 = (defpackage.yva) r1     // Catch:{ all -> 0x009b }
            r4.<init>(r5, r10, r1)     // Catch:{ all -> 0x009b }
            long r2 = r15.longValue()     // Catch:{ all -> 0x009b }
            r5 = 1
            r6 = 1
            r1 = r16
            r1.x(r2, r4, r5, r6)     // Catch:{ all -> 0x009b }
        L_0x00db:
            long r1 = r15.longValue()     // Catch:{ all -> 0x009b }
            vk3 r1 = r0.p(r1, r10)     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x006a
            r2 = 0
            r1.b = r2     // Catch:{ all -> 0x009b }
            r1.c = r2     // Catch:{ all -> 0x009b }
            r1.o = r2     // Catch:{ all -> 0x009b }
            goto L_0x006a
        L_0x00ee:
            java.lang.Object r1 = r9.get()     // Catch:{ all -> 0x009b }
            s74 r1 = (defpackage.s74) r1     // Catch:{ all -> 0x009b }
            a74 r1 = (defpackage.a74) r1     // Catch:{ all -> 0x009b }
            r1.c()     // Catch:{ all -> 0x009b }
            java.lang.Object r1 = r9.get()
            s74 r1 = (defpackage.s74) r1
            a74 r1 = (defpackage.a74) r1
            r1.b()
            hr3 r1 = new hr3
            r2 = r11
            java.util.List r2 = (java.util.List) r2
            r1.<init>(r2)
            sv0 r2 = r0.g
            r2.c(r1)
            zu3 r1 = new zu3
            r1.<init>((java.util.Collection) r11)
            r2.c(r1)
            goto L_0x0126
        L_0x011a:
            java.lang.Object r1 = r9.get()
            s74 r1 = (defpackage.s74) r1
            a74 r1 = (defpackage.a74) r1
            r1.b()
            throw r0
        L_0x0126:
            if (r7 == 0) goto L_0x0163
            boolean r1 = r17.isEmpty()
            if (r1 == 0) goto L_0x012f
            goto L_0x0163
        L_0x012f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r17.iterator()
        L_0x013d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0159
            java.lang.Object r4 = r3.next()
            fo3 r4 = (defpackage.fo3) r4
            long r5 = r4.a
            boolean r5 = r0.m(r5)
            if (r5 == 0) goto L_0x0155
            r1.add(r4)
            goto L_0x013d
        L_0x0155:
            r2.add(r4)
            goto L_0x013d
        L_0x0159:
            tm3 r3 = defpackage.tm3.a
            r0.C(r1, r3)
            tm3 r1 = defpackage.tm3.b
            r0.C(r2, r1)
        L_0x0163:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.km3.B(java.util.List, long[]):void");
    }

    public final List C(List list, tm3 tm3) {
        vk3 vk3;
        tm3 tm32 = tm3;
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        d();
        z68.c("km3", "storeContactsFromServer, size = " + list.size() + ", type = " + tm32, new Object[0]);
        hs7 hs7 = this.f;
        ((a74) ((s74) hs7.get())).a();
        jtb jtb = this.h;
        long m2 = ((ltb) jtb).a.m();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            cud cud = ((ltb) jtb).b;
            cud.getClass();
            List list2 = list;
            List<um3> R = o54.R(list2, new ms1(24, this), new ms1(24, this), tm3, timeUnit.toMillis(cud.r(PmsKey.f91noncontactsynctime, TimeUnit.HOURS.toSeconds(24))), m2);
            ya8 ya8 = new ya8(R.size());
            ArrayList arrayList = new ArrayList(R.size());
            for (um3 um3 : R) {
                boolean z = false;
                vk3 p2 = p(um3.a, false);
                long s2 = ((ltb) jtb).a.s();
                long j2 = um3.a;
                if (j2 == s2) {
                    z = true;
                }
                hs7 hs72 = this.k;
                if (p2 != null) {
                    long j3 = p2.a.b;
                    if (j3 != 0) {
                        vk3 = new vk3(new vm3(j3, um3), z, (yva) hs72.get());
                        vk3 vk32 = vk3;
                        x(vk32.r(), vk32, true, true);
                        ya8.i(vk32.r(), vk32);
                        arrayList.add(Long.valueOf(j2));
                    }
                }
                vk3 = new vk3(new vm3(((a74) ((s74) hs7.get())).d.v(um3), um3), z, (yva) hs72.get());
                vk3 vk322 = vk3;
                x(vk322.r(), vk322, true, true);
                ya8.i(vk322.r(), vk322);
                arrayList.add(Long.valueOf(j2));
            }
            if (tm32 == tm3.a) {
                F(list);
            }
            ((a74) ((s74) hs7.get())).c();
            k(ya8);
            ((a74) ((s74) hs7.get())).b();
            return arrayList;
        } catch (Throwable th) {
            ((a74) ((s74) hs7.get())).b();
            throw th;
        }
    }

    public final void D(List list) {
        if (!list.isEmpty()) {
            List C = C(list, tm3.a);
            hs7 hs7 = this.p;
            if (hs7.get() != null) {
                ia2 ia2 = (ia2) ((u82) hs7.get());
                aje aje = ia2.H0;
                if (aje != null) {
                    aje.b((CancellationException) null);
                }
                fa2 fa2 = new fa2(ia2, (Continuation) null);
                ia2.H0 = ev0.v(ia2.y, ia2.x, (f14) null, fa2, 2);
            }
            this.g.c(new zu3((Collection) C));
        }
    }

    public final void E(long j2) {
        z68.c("km3", "unblock, id = " + j2, new Object[0]);
        g(j2, (sm3) null);
        jna jna = (jna) ((rl) this.i.get());
        ocf.d(jna.E(), new ts3(2, ((ltb) jna.D()).a.n(), j2, (String) null, (String) null, (String) null, (String) null), false, 0, 12);
        ((uu3) this.m.get()).b(Collections.singletonList(Long.valueOf(j2)));
        this.g.c(new zu3(j2));
    }

    public final void F(List list) {
        ltb ltb = (ltb) this.h;
        long j2 = ltb.a.g.getLong("user.contactsLastSync", 0);
        int i2 = o54.l;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j2 = Math.max(j2, ((fo3) it.next()).b);
        }
        ltb.a.k("user.contactsLastSync", Long.valueOf(j2));
    }

    public final void G(long j2, vk3 vk3) {
        g6d g6d = ((a74) ((s74) this.f.get())).d;
        um3 um3 = vk3.a.c;
        ht3 p2 = g6d.p();
        long j3 = um3.a;
        ConcurrentHashMap concurrentHashMap = ((qi6) ((Lazy) g6d.o).getValue()).a;
        p2.getClass();
        if (!um3.a() || um3.j != 0) {
            i6d i6d = p2.a;
            i6d.b();
            mi miVar = p2.c;
            gf6 E = miVar.E();
            E.k(1, j3);
            byte[] d2 = um3.d();
            if (d2 == null) {
                E.X(2);
            } else {
                E.l(2, d2);
            }
            E.k(3, j2);
            try {
                i6d.c();
                E.n();
                i6d.r();
                i6d.l();
                miVar.S(E);
                p2.c(um3, concurrentHashMap);
            } catch (Throwable th) {
                miVar.S(E);
                throw th;
            }
        }
    }

    public final Set H(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return Collections.emptySet();
        }
        z68.c("km3", "updateWithPhoneBookData = " + arrayList.size(), new Object[0]);
        List q2 = q(s, u);
        int i2 = o54.l;
        HashMap hashMap = new HashMap();
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                xdb xdb = (xdb) it.next();
                Iterator it2 = q2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    vk3 vk3 = (vk3) it2.next();
                    if (vk3.s() > 0 && xdb.w > 0 && vk3.s() == xdb.w) {
                        hashMap.put(Long.valueOf(vk3.r()), xdb);
                        break;
                    }
                }
            }
        }
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                e(((Long) entry.getKey()).longValue(), new ms1(23, (xdb) entry.getValue()));
            }
            this.g.c(new zu3((Collection) hashMap.keySet()));
        }
        return hashMap.keySet();
    }

    public final void a(ArrayList arrayList) {
        z68.c("km3", "onPhonebookUpdated", new Object[0]);
        H(arrayList);
    }

    public final void c(long j2) {
        z68.c("km3", "add, id = " + j2, new Object[0]);
        h(j2, tm3.a, (sm3) null);
        jna jna = (jna) ((rl) this.i.get());
        ocf.d(jna.E(), new ts3(4, ((ltb) jna.D()).a.n(), j2, (String) null, (String) null, (String) null, (String) null), false, 0, 12);
        ((uu3) this.m.get()).b(Collections.singletonList(Long.valueOf(j2)));
        this.g.c(new zu3(j2));
    }

    public final void d() {
        if (!this.e) {
            synchronized (this.d) {
                try {
                    if (!this.e) {
                        v();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final vk3 e(long j2, qk3 qk3) {
        d();
        boolean z = false;
        vk3 p2 = p(j2, false);
        if (p2 == null) {
            ((uta) ((m95) this.j.get())).c(new Exception("contact is null"), true);
            return null;
        }
        vm3 vm3 = p2.a;
        nm3 c2 = vm3.c.c();
        try {
            qk3.accept(c2);
            um3 a2 = c2.a();
            if (a2.a == ((ltb) this.h).a.s()) {
                z = true;
            }
            vk3 vk3 = new vk3(new vm3(vm3.b, a2), z, (yva) this.k.get());
            x(j2, vk3, false, true);
            ya8 ya8 = new ya8(1);
            ya8.i(j2, vk3);
            k(ya8);
            return vk3;
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public final vk3 f(String str, long j2, String str2, String str3) {
        ltb ltb = (ltb) this.h;
        ltb.a.l("user.deviceAvatarPath", str);
        long s2 = ltb.a.s();
        vk3 e2 = e(s2, new u52((Object) str2, (Object) str3, j2, 3));
        this.g.c(new zu3(s2));
        return e2;
    }

    public final void g(long j2, sm3 sm3) {
        e(j2, new ms1(25, sm3));
    }

    public final void h(long j2, tm3 tm3, sm3 sm3) {
        e(j2, new ba(23, tm3, sm3));
    }

    public final void i() {
        if (this.e && !this.a.isEmpty()) {
            for (vk3 vk3 : this.a.values()) {
                vk3.b = null;
                vk3.c = null;
                vk3.o = null;
            }
            this.g.c(new zu3((Collection) this.a.keySet()));
        }
    }

    public final String j(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Long l2 = (Long) it.next();
            vk3 p2 = l2.longValue() != 0 ? p(l2.longValue(), false) : null;
            if (p2 != null) {
                sb.append(p2.f().trim());
                sb.append(", ");
            }
        }
        if (sb.length() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }
        return sb.toString().trim();
    }

    public final void k(ya8 ya8) {
        eu3 eu3 = this.r;
        if (eu3 != null && ya8.k() != 0) {
            int k2 = ya8.k();
            for (int i2 = 0; i2 < k2; i2++) {
                long h2 = ya8.h(i2);
                vk3 vk3 = (vk3) ya8.l(i2);
                if (h2 > 0) {
                    ((tz9) eu3.e.computeIfAbsent(Long.valueOf(h2), new yi(8, new cu3(eu3, h2, 0)))).setValue(vk3);
                }
            }
        }
    }

    public final boolean l(long j2) {
        vk3 vk3 = (vk3) this.a.get(Long.valueOf(j2));
        if (vk3 == null) {
            vk3 = p(j2, false);
        }
        return !kv0.M(vk3);
    }

    public final boolean m(long j2) {
        vk3 p2 = p(j2, false);
        return p2 != null && p2.c();
    }

    public final vk3 n(long j2, boolean z) {
        vk3 vk3 = (vk3) this.a.get(Long.valueOf(j2));
        if (vk3 != null || !z) {
            return vk3;
        }
        vk3 b2 = vk3.b(j2, ((ltb) this.h).a.m(), (yva) this.k.get());
        x(j2, b2, true, true);
        return b2;
    }

    public final vk3 o(long j2) {
        return p(j2, false);
    }

    public final vk3 p(long j2, boolean z) {
        vk3 vk3;
        if (j2 > 0 && ((vk3 = (vk3) this.a.get(Long.valueOf(j2))) == null || vk3.a.b == 0 || vk3.B())) {
            d();
        }
        return n(j2, z);
    }

    public final List q(Set set, Set set2) {
        vk3 p2 = p(((ltb) this.h).a.s(), false);
        ArrayList arrayList = null;
        for (vk3 vk3 : this.a.values()) {
            if (!(p2 == null || vk3 == p2 || !set.contains(vk3.a.c.k))) {
                if (set2 == null || set2.contains(vk3.a.c.i)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(vk3);
                }
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public final vk3 r() {
        return p(((ltb) this.h).a.s(), false);
    }

    public final List s() {
        return q(t, (Set) null);
    }

    public final void t() {
        d();
        ConcurrentHashMap concurrentHashMap = this.a;
        if (!concurrentHashMap.isEmpty()) {
            for (vk3 vk3 : concurrentHashMap.values()) {
                yva yva = (yva) this.k.get();
                boolean z = false;
                boolean z2 = vk3.b != null;
                boolean z3 = vk3.c != null;
                if (vk3.o != null) {
                    z = true;
                }
                vk3.b = null;
                vk3.c = null;
                vk3.o = null;
                if (z2) {
                    vk3.p(yva);
                }
                if (z3) {
                    vk3.o(yva);
                }
                if (z) {
                    vk3.q();
                }
            }
            this.g.c(new zu3((Collection) concurrentHashMap.keySet()));
        }
    }

    public final boolean u(long j2) {
        d();
        if (j2 <= 0 || j2 == -1 || j2 == ((ltb) this.h).a.s()) {
            return false;
        }
        vk3 n2 = n(j2, false);
        if (kv0.M(n2)) {
            return true;
        }
        if (n2.c()) {
            return false;
        }
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.v;
            a67.d(w78, "km3", n2 + " #" + j2 + " is exists /" + n2.a.c.i, (Throwable) null);
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        cud cud = ((ltb) this.h).b;
        cud.getClass();
        return ((ltb) this.h).a.m() - timeUnit.toMillis(cud.r(PmsKey.f91noncontactsynctime, TimeUnit.HOURS.toSeconds(24))) >= n2.a.c.s;
    }

    /* JADX INFO: finally extract failed */
    public final void v() {
        if (!this.e) {
            this.o.getClass();
            iof.a("ContactController.load()");
            z68.c("km3", "contacts loading started", new Object[0]);
            long currentTimeMillis = System.currentTimeMillis();
            this.o.getClass();
            iof.a("ContactController.selectContacts()");
            ya8 ya8 = new ya8(32);
            g6d g6d = ((a74) ((s74) this.f.get())).d;
            ht3 p2 = g6d.p();
            p2.getClass();
            d7d a2 = d7d.a(0, "SELECT * FROM contacts ORDER BY presence ASC");
            i6d i6d = p2.a;
            i6d.b();
            Cursor o2 = i6d.o(a2, (CancellationSignal) null);
            try {
                int u2 = kne.u(o2, "id");
                int u3 = kne.u(o2, "server_id");
                int u4 = kne.u(o2, "presence");
                int u5 = kne.u(o2, "presence_type");
                int u6 = kne.u(o2, "data");
                ArrayList arrayList = new ArrayList(o2.getCount());
                while (o2.moveToNext()) {
                    arrayList.add(new qn3(o2.getLong(u2), o2.getLong(u3), o2.getInt(u4), o2.getInt(u5), um3.b(o2.isNull(u6) ? null : o2.getBlob(u6))));
                }
                o2.close();
                a2.o();
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    qn3 qn3 = (qn3) it.next();
                    ConcurrentHashMap concurrentHashMap = ((qi6) ((Lazy) g6d.o).getValue()).a;
                    long j2 = qn3.a;
                    um3 um3 = qn3.e;
                    concurrentHashMap.put(Long.valueOf(j2), Integer.valueOf(um3.f.hashCode()));
                    arrayList2.add(new vm3(qn3.a, um3, new mtb(qn3.d, qn3.c)));
                }
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean z = true;
                    if (it2.hasNext()) {
                        vm3 vm3 = (vm3) it2.next();
                        long j3 = vm3.c.a;
                        if (j3 != ((ltb) this.h).a.s()) {
                            z = false;
                        }
                        vk3 vk3 = new vk3(vm3, z, (yva) this.k.get());
                        ya8.i(j3, vk3);
                        x(vk3.r(), vk3, false, false);
                        rtb rtb = (rtb) this.l.get();
                        rtb.getClass();
                        rtb.e().h(vk3.r(), vm3.o);
                    } else {
                        Trace.endSection();
                        this.e = true;
                        z68.c("km3", "contacts loaded in %d millis", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        this.o.getClass();
                        Trace.endSection();
                        k(ya8);
                        return;
                    }
                }
            } catch (Throwable th) {
                o2.close();
                a2.o();
                throw th;
            }
        }
    }

    public final void w(long j2) {
        z68.c("km3", "markAsNotFoundContact, id = " + j2, new Object[0]);
        e(j2, new zb2(10));
        hr3 hr3 = new hr3(Collections.singletonList(Long.valueOf(j2)));
        sv0 sv0 = this.g;
        sv0.c(hr3);
        sv0.c(new zu3(j2));
    }

    public final void x(long j2, vk3 vk3, boolean z, boolean z2) {
        hs7 hs7 = this.f;
        if (z && j2 != 0) {
            d();
        }
        this.a.put(Long.valueOf(j2), vk3);
        boolean A = cvg.A(vk3.a.c.p);
        ConcurrentHashMap concurrentHashMap = this.b;
        if (!A) {
            concurrentHashMap.put(Long.valueOf(j2), vk3);
        } else {
            concurrentHashMap.remove(Long.valueOf(j2));
        }
        if (z2 && !vk3.B()) {
            try {
                ((a74) ((s74) hs7.get())).a();
                G(vk3.a.b, vk3);
                ((a74) ((s74) hs7.get())).c();
            } finally {
                ((a74) ((s74) hs7.get())).b();
            }
        }
        Iterator it = this.q.iterator();
        if (it.hasNext()) {
            rae.w(it.next());
            throw null;
        }
    }

    public final void y(long j2) {
        long j3 = j2;
        z68.c("km3", "remove, id = " + j3, new Object[0]);
        h(j3, tm3.b, sm3.b);
        A(j3, true);
        rtb rtb = (rtb) this.l.get();
        mtb mtb = new mtb(0, (int) (((ltb) this.h).a.m() / 1000));
        rtb.getClass();
        rtb.l(Collections.singletonMap(Long.valueOf(j2), mtb));
        jna jna = (jna) ((rl) this.i.get());
        ocf.d(jna.E(), new ts3(3, ((ltb) jna.D()).a.n(), j2, (String) null, (String) null, (String) null, (String) null), false, 0, 12);
        ((uu3) this.m.get()).b(Collections.singletonList(Long.valueOf(j2)));
        this.g.c(new zu3(j3));
    }

    public final xa3 z(fo3 fo3, ntb ntb, tm3 tm3) {
        return new qa3(0, new fm3(this, fo3, ntb, tm3)).l(xfd.a());
    }
}
