package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;
import org.apache.http.cookie.ClientCookie;

/* renamed from: jna  reason: default package */
public final class jna implements rl {
    public static final long[] g = new long[0];
    public final String a = jna.class.getName();
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;

    public jna(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5) {
        this.b = lazy;
        this.c = lazy2;
        this.d = lazy3;
        this.e = lazy4;
        this.f = lazy5;
    }

    public static long A(jna jna, qm qmVar) {
        return ocf.d(jna.E(), qmVar, false, 0, 12);
    }

    public static long z(jna jna, qm qmVar) {
        ocf E = jna.E();
        E.getClass();
        return ocf.a(E.a, new mcf(qmVar, false, false, 0, 0));
    }

    public final long B(String str, String str2, long j, long j2) {
        return ocf.d(E(), new yl5(str, str2, ((ltb) D()).a.n(), j, j2), false, 0, 12);
    }

    public final ina C() {
        return (ina) this.f.getValue();
    }

    public final jtb D() {
        return (jtb) this.c.getValue();
    }

    public final ocf E() {
        return (ocf) this.b.getValue();
    }

    public final long F(String str, boolean z) {
        if (true ^ (str == null || StringsKt.isBlank(str))) {
            return ocf.b(E(), new kw7(((ltb) D()).a.n(), str, z));
        }
        throw new IllegalArgumentException("link is empty".toString());
    }

    public final long G(long j, long j2) {
        if (!t(j2)) {
            return 0;
        }
        return ocf.d(E(), new m68(((ltb) D()).a.n(), j, j2), false, 0, 12);
    }

    public final long H() {
        long j;
        ltb ltb = (ltb) D();
        a33 a33 = ltb.a;
        long o = a33.o();
        long j2 = a33.g.getLong("user.contactsLastSync", 0);
        long e2 = a33.e("user.presenceLastSync", 0);
        String name = jna.class.getName();
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            String U = iq.U(Long.valueOf(o));
            String U2 = iq.U(Long.valueOf(j2));
            String U3 = iq.U(Long.valueOf(e2));
            StringBuilder r = rae.r("LoginTamTask: chatsLastSync = ", U, ", contactLastSync = ", U2, ", presenceLastSync = ");
            r.append(U3);
            a67.d(w78, name, r.toString(), (Throwable) null);
        }
        cud cud = ltb.b;
        cud.getClass();
        zjd zjd = zjd.a;
        String string = cud.g.getString("hash", (String) null);
        if (ltb.b.g.getInt(ClientCookie.VERSION_ATTR, 1) < 6) {
            ltb.b.j(6, ClientCookie.VERSION_ATTR);
            string = null;
            j = 0;
        } else {
            j = o;
        }
        long n = ((ltb) D()).a.n();
        String g2 = ((doa) this.d.getValue()).g();
        if (g2 != null) {
            return z(this, new j88(n, g2, j, j2, e2, string, a33.g.getLong("user.callsLastSync", 0), a33.g.getLong("app.last.login.time", 0), a33.g.getLong("user.draftsLastSync", -1)));
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final long[] I(long j, long j2, List list, List list2, z93 z93, boolean z, bl4 bl4) {
        int ordinal;
        boolean r = r(j);
        long[] jArr = pf6.c;
        if (!r) {
            return jArr;
        }
        if (list.size() == list2.size() || (ordinal = C().ordinal()) == 0) {
            if (list2.isEmpty()) {
                return jArr;
            }
            List A = CollectionsKt___CollectionsKt.windowed(list2, 100, 100, true);
            Iterable A2 = CollectionsKt___CollectionsKt.windowed(list, 100, 100, true);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(A2, 10));
            int i = 0;
            for (Object next : A2) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(Long.valueOf(ocf.d(E(), new iv9(((ltb) D()).a.n(), j, j2, (List) next, (List) A.get(i), z93, z, bl4, false), false, 0, 12)));
                i = i2;
            }
            return CollectionsKt.toLongArray(arrayList);
        } else if (ordinal == 1) {
            z68.f(this.a, "messageIds.size() != messageServerIds.size()", new IllegalArgumentException("messageIds.size() != messageServerIds.size()"));
            return jArr;
        } else if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            throw new IllegalArgumentException("messageIds.size() != messageServerIds.size()");
        }
    }

    public final long J(long j, long j2, long j3, long j4, String str, String str2, qe9 qe9, List list, boolean z, List list2) {
        if (!r(j) || !s(j2) || !t(j4)) {
            return 0;
        }
        return ocf.d(E(), new ov9(((ltb) D()).a.n(), j, j2, j3, j4, str, str2, qe9, list, list2, z), false, 0, 12);
    }

    public final long K(long j, List list) {
        return z(this, new or3(1, ((ltb) D()).a.n(), j, list));
    }

    public final long L(long j, long j2, long j3, long j4, String str, vd9 vd9) {
        int ordinal;
        if (!r(j) || !s(j2) || !t(j4)) {
            return 0;
        }
        if (str.length() > 0 || (ordinal = C().ordinal()) == 0) {
            long j5 = j;
            long j6 = j2;
            long j7 = j3;
            long j8 = j4;
            return ocf.d(E(), new yv9(((ltb) D()).a.n(), j5, j6, j7, j8, new nd9(vd9, str)), false, 0, 12);
        } else if (ordinal == 1) {
            z68.f(this.a, "reaction can't be empty", new IllegalArgumentException("reaction can't be empty"));
            return 0;
        } else if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            throw new IllegalArgumentException("reaction can't be empty");
        }
    }

    public final long M(long j, a20 a20, String str) {
        if (!r(j)) {
            return 0;
        }
        return ((jqg) this.e.getValue()).b(new u02(((ltb) D()).a.n(), str, j, a20));
    }

    public final long N(String str, a20 a20) {
        return ((jqg) this.e.getValue()).b(new u02(((ltb) D()).a.n(), str, 0, a20));
    }

    public final long O(boolean z) {
        String U = iq.U(Long.valueOf(System.currentTimeMillis()));
        z68.c(this.a, "ping, active = " + z + ", current time = " + U, new Object[0]);
        return z(this, new ulb(((ltb) D()).a.n(), z));
    }

    public final long P(String str, String str2, String str3, a20 a20, String str4, String str5, long j, he0 he0) {
        return ocf.d(E(), new nwb(((ltb) D()).a.n(), str, str2, str3, j, a20, str4, str5, he0), false, 0, 12);
    }

    public final long Q(long j, long j2, List list, boolean z, int i) {
        bk2 bk2 = new bk2(((ltb) D()).a.n(), j, j2, 2, list, ij2.ADMIN, true, 0, i);
        if (z) {
            return ocf.d(E(), bk2, false, 0, 12);
        }
        return z(this, bk2);
    }

    public final long R(int i, long j, long j2, List list) {
        if (!r(j)) {
            return 0;
        }
        bk2 bk2 = new bk2(((ltb) D()).a.n(), j, j2, 2, list, ij2.MEMBER, true, i, 0);
        return i == 0 ? ocf.d(E(), bk2, false, 0, 12) : z(this, bk2);
    }

    public final long S(long j) {
        return ocf.d(E(), new g1d(((ltb) D()).a.n(), j), false, 0, 12);
    }

    public final Object T(fbf fbf, Continuation continuation) {
        return E().e(fbf, continuation);
    }

    public final fce U(fbf fbf, lfd lfd) {
        wbf wbf = (wbf) E().a;
        wbf.getClass();
        return new mka(1, new pbb(20, wbf, fbf)).j(lfd);
    }

    public final long V() {
        return z(this, new lwd(((ltb) D()).a.n(), 1));
    }

    public final long W(boolean z, long j, long j2, long j3, long j4, String str, boolean z2, String str2) {
        j7g j7g = new j7g(((ltb) D()).a.n(), j, j2, j3, j4, str, z2, str2, false);
        return z ? ocf.d(E(), j7g, false, 0, 12) : z(this, j7g);
    }

    public final long d(int i, long j, long j2, List list) {
        bk2 bk2 = new bk2(((ltb) D()).a.n(), j, j2, 1, list, ij2.BLOCKED_MEMBER, true, i, 0);
        if (i == 0) {
            return ocf.d(E(), bk2, false, 0, 12);
        }
        return z(this, bk2);
    }

    public final long e(long j, long j2, List list, boolean z) {
        if (!r(j)) {
            return 0;
        }
        return ocf.d(E(), new bk2(((ltb) D()).a.n(), j, j2, 1, list, ij2.MEMBER, z, 0, 0), false, 0, 12);
    }

    public final long f(int i, long j) {
        return ocf.d(E(), new xt(i, ((ltb) D()).a.n(), j), false, 0, 12);
    }

    public final long g(long[] jArr, int i) {
        return ocf.d(E(), new mu(jArr, i, ((ltb) D()).a.n()), false, 0, 12);
    }

    public final long h(int i, long j) {
        return z(this, new pu(i, ((ltb) D()).a.n(), j, 0));
    }

    public final long i(long j, long j2, long j3) {
        if (!r(j)) {
            return 0;
        }
        return z(this, new wr2(((ltb) D()).a.n(), j, j2, 0, (String) null, false, (String) null, (HashMap) null, (String) null, (String) null, (a20) null, (Long) null, false, j3));
    }

    public final long j(long j, z93 z93) {
        if (!r(j)) {
            return 0;
        }
        return ocf.d(E(), new l52(((ltb) D()).a.n(), j, z93), false, 0, 12);
    }

    public final long k(long j, long j2, boolean z, long j3) {
        if (!r(j)) {
            return 0;
        }
        return ocf.d(E(), new s72(((ltb) D()).a.n(), j, j2, j3, z), false, 0, 12);
    }

    public final long l(long j) {
        return z(this, new ua2(0, ((ltb) D()).a.n(), CollectionsKt.listOf(Long.valueOf(j))));
    }

    public final long m(String str, String str2) {
        if ((str == null || StringsKt.isBlank(str)) && (str2 == null || StringsKt.isBlank(str2))) {
            return 0;
        }
        return z(this, new ya2(((ltb) D()).a.n(), str, str2));
    }

    public final long n(long j, boolean z) {
        vp2 vp2 = new vp2(((ltb) D()).a.n(), j, false);
        return z ? ocf.d(E(), vp2, false, 0, 12) : z(this, vp2);
    }

    public final long o(long j, long j2, int i, String str, boolean z, HashMap hashMap) {
        if (!r(j)) {
            return 0;
        }
        return z(this, new wr2(((ltb) D()).a.n(), j, j2, i, str, z, (String) null, hashMap, (String) null, (String) null, (a20) null, (Long) null, false, 0));
    }

    public final long p(long j, long j2, String str, String str2, a20 a20) {
        if (!r(j)) {
            return 0;
        }
        return ocf.d(E(), new wr2(((ltb) D()).a.n(), j, j2, 0, (String) null, false, (String) null, (HashMap) null, str, str2, a20, (Long) null, false, 0), false, 0, 12);
    }

    public final long q(long j, String str, long j2) {
        if (!r(j)) {
            return 0;
        }
        return ocf.d(E(), new wr2(((ltb) D()).a.n(), j, j2, 0, (String) null, false, str, (HashMap) null, (String) null, (String) null, (a20) null, (Long) null, false, 0), false, 0, 12);
    }

    public final boolean r(long j) {
        int ordinal;
        if ((j != 0) || (ordinal = C().ordinal()) == 0) {
            return true;
        }
        if (ordinal == 1) {
            z68.f(this.a, "invalid chat local id", new IllegalArgumentException("invalid chat local id"));
            return false;
        } else if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            throw new IllegalArgumentException("invalid chat local id");
        }
    }

    public final boolean s(long j) {
        int ordinal;
        if ((j != 0) || (ordinal = C().ordinal()) == 0) {
            return true;
        }
        if (ordinal == 1) {
            z68.f(this.a, "invalid message local id", new IllegalArgumentException("invalid message local id"));
            return false;
        } else if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            throw new IllegalArgumentException("invalid message local id");
        }
    }

    public final boolean t(long j) {
        int ordinal;
        if ((j != 0) || (ordinal = C().ordinal()) == 0) {
            return true;
        }
        if (ordinal == 1) {
            z68.f(this.a, "invalid message server id", new IllegalArgumentException("invalid message server id"));
            return false;
        } else if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            throw new IllegalArgumentException("invalid message server id");
        }
    }

    public final long u(long j) {
        if (!r(j)) {
            return 0;
        }
        return ocf.d(E(), new ke3(((ltb) D()).a.n(), j, false, (n0g) null, false, g, false, (ArrayList) null, (ArrayList) null), false, 0, 12);
    }

    public final long v() {
        return ocf.d(E(), new ke3(((ltb) D()).a.n(), 0, true, (n0g) null, false, g, false, (ArrayList) null, (ArrayList) null), false, 0, 12);
    }

    public final long w(n0g n0g, boolean z) {
        return ocf.d(E(), new ke3(((ltb) D()).a.n(), 0, false, n0g, z, g, false, (ArrayList) null, (ArrayList) null), false, 0, 12);
    }

    public final long x(long j) {
        return z(this, new go3(((ltb) D()).a.n(), new long[]{j}, 0));
    }

    public final long[] y(List list) {
        if (list.isEmpty()) {
            return pf6.c;
        }
        List A = CollectionsKt___CollectionsKt.windowed(list, 100, 100, true);
        int size = A.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = Long.valueOf(z(this, new or3(((ltb) D()).a.n(), CollectionsKt.toLongArray((List) A.get(i)), -1))).longValue();
        }
        return jArr;
    }
}
