package defpackage;

import java.text.CollationKey;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: vk3  reason: default package */
public final class vk3 implements Comparable {
    public final vm3 a;
    public CharSequence b;
    public CharSequence c;
    public String o;
    public CollationKey v;
    public final boolean w;
    public final yva x;
    public v7b y = null;

    public vk3(vm3 vm3, boolean z, yva yva) {
        this.a = vm3;
        this.w = z;
        this.x = yva;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [nm3, java.lang.Object] */
    public static vk3 a(long j, long j2, yva yva) {
        ? obj = new Object();
        obj.a = j;
        obj.f = Collections.singletonList(pm3.e);
        obj.s = j2;
        obj.k = tm3.b;
        obj.j = 2;
        return new vk3(new vm3(0, obj.a()), false, yva);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [nm3, java.lang.Object] */
    public static vk3 b(long j, long j2, yva yva) {
        ? obj = new Object();
        obj.a = j;
        obj.f = Collections.singletonList(pm3.e);
        obj.s = j2;
        obj.k = tm3.b;
        return new vk3(new vm3(0, obj.a()), false, yva);
    }

    public final boolean A() {
        return this.a.c.n.contains(rm3.c);
    }

    public final boolean B() {
        return n() == 0 && this.a.c.a();
    }

    public final boolean C() {
        return this.a.c.k == tm3.a;
    }

    public final boolean c() {
        return this.a.b != 0 && C();
    }

    public final int compareTo(Object obj) {
        return f().toLowerCase().compareTo(((vk3) obj).f().toLowerCase());
    }

    public final String d() {
        return this.a.c.c;
    }

    public final String e(String str) {
        if (!(!B())) {
            return null;
        }
        if (this.w) {
            return str;
        }
        vm3 vm3 = this.a;
        if (!cvg.A(vm3.c.b)) {
            return vm3.c.b;
        }
        return null;
    }

    public final String f() {
        String str = null;
        if (this.w) {
            pm3 k = k();
            String a2 = k != null ? k.a() : null;
            if (cvg.D(a2)) {
                return a2;
            }
        }
        vm3 vm3 = this.a;
        int i = vm3.c.j;
        yva yva = this.x;
        if (i == 2) {
            return yva.a.getString(tmc.tt_unbind_ok_deleted_user);
        }
        if (i == 1) {
            return yva.a.getString(tmc.tt_blocked_user);
        }
        if (B()) {
            r();
            return yva.a.getString(jad.p);
        }
        for (pm3 pm3 : vm3.c.f) {
            if (!pm3.equals(pm3.e)) {
                str = pm3.a();
                if (cvg.D(str)) {
                    return str;
                }
            }
        }
        if (!cvg.A(str)) {
            return str;
        }
        r();
        return yva.a.getString(jad.p);
    }

    public final String g() {
        pm3 k;
        if (this.w && (k = k()) != null) {
            String str = k.a;
            if (cvg.D(str)) {
                return str;
            }
        }
        um3 um3 = this.a.c;
        int i = um3.j;
        yva yva = this.x;
        if (i == 2) {
            return yva.a.getString(tmc.tt_unbind_ok_deleted_user);
        }
        if (i == 1) {
            return yva.a.getString(tmc.tt_blocked_user);
        }
        List list = um3.f;
        if (!list.isEmpty()) {
            return ((pm3) list.get(0)).a;
        }
        r();
        return yva.a.getString(jad.p);
    }

    public final String h(x23 x23) {
        String str = null;
        if (!(!B())) {
            return null;
        }
        if (this.w) {
            str = ((qjd) x23).p();
        }
        if (!cvg.A(str)) {
            return str;
        }
        String A = cjf.A(this.a.c.d, kl0.v, jl0.b);
        return !cvg.A(A) ? A : e(((qjd) x23).p());
    }

    public final String i() {
        pm3 k;
        if (this.w && (k = k()) != null) {
            String str = k.b;
            if (cvg.D(str)) {
                return str;
            }
        }
        um3 um3 = this.a.c;
        int i = um3.j;
        if (i == 2 || i == 1) {
            return null;
        }
        List list = um3.f;
        if (list.isEmpty()) {
            return null;
        }
        return ((pm3) list.get(0)).b;
    }

    public final String j() {
        return this.a.c.p;
    }

    public final pm3 k() {
        Object obj;
        om3 om3 = om3.c;
        List list = this.a.c.f;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                obj = it.next();
                try {
                    if (((pm3) obj).c == om3) {
                        break;
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
        }
        obj = null;
        pm3 pm3 = (pm3) obj;
        if (pm3 != null && !cvg.A(pm3.a().trim())) {
            return pm3;
        }
        return null;
    }

    public final List l() {
        return this.a.c.f;
    }

    public final String m() {
        String c2 = hhf.c(this.a.c.p);
        return !cvg.A(c2) ? c2 : "";
    }

    public final int n() {
        return this.a.c.j;
    }

    public final CharSequence o(yva yva) {
        if (this.c == null) {
            this.c = yva.k.e(this.a.c.o, 0);
        }
        return this.c;
    }

    public final CharSequence p(yva yva) {
        if (this.b == null) {
            this.b = yva.k.e(f(), 0);
        }
        return this.b;
    }

    public final CharSequence q() {
        if (this.o == null) {
            Pattern pattern = vua.a;
            this.o = vua.b(g(), i());
        }
        return this.o;
    }

    public final long r() {
        return this.a.c.a;
    }

    public final long s() {
        return this.a.c.h;
    }

    public final String t(kl0 kl0) {
        if (!(!B())) {
            return null;
        }
        String A = cjf.A(this.a.c.c, kl0, jl0.a);
        if (!cvg.A(A)) {
            return A;
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Contact{id=");
        vm3 vm3 = this.a;
        sb.append(vm3.b);
        sb.append(", data=");
        sb.append(vm3.c);
        sb.append('}');
        return sb.toString();
    }

    public final String u(String str, kl0 kl0) {
        String str2 = null;
        if (!(!B())) {
            return null;
        }
        if (this.w) {
            str2 = str;
        }
        if (!cvg.A(str2)) {
            return str2;
        }
        String A = cjf.A(this.a.c.c, kl0, jl0.a);
        return !cvg.A(A) ? A : e(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (defpackage.gsg.i(r0.a, r1.c.c) == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List v() {
        /*
            r7 = this;
            v7b r0 = r7.y
            vm3 r1 = r7.a
            if (r0 == 0) goto L_0x0012
            um3 r2 = r1.c
            java.lang.String r2 = r2.c
            java.lang.Object r0 = r0.a
            boolean r0 = defpackage.gsg.i(r0, r2)
            if (r0 != 0) goto L_0x005c
        L_0x0012:
            kl0 r0 = defpackage.kl0.b
            kl0 r2 = defpackage.kl0.o
            java.util.List r3 = kotlin.collections.CollectionsKt.createListBuilder()
            kotlin.enums.EnumEntries r4 = defpackage.nl0.a
            java.util.List r4 = kotlin.collections.CollectionsKt.asReversed(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x0024:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0046
            java.lang.Object r5 = r4.next()
            kl0 r5 = (defpackage.kl0) r5
            int r6 = r5.compareTo(r0)
            if (r6 < 0) goto L_0x0024
            int r6 = r5.compareTo(r2)
            if (r6 > 0) goto L_0x0024
            java.lang.String r5 = r7.t(r5)
            if (r5 == 0) goto L_0x0024
            r3.add(r5)
            goto L_0x0024
        L_0x0046:
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r3)
            um3 r1 = r1.c
            java.lang.String r1 = r1.c
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0055
            r0 = 0
        L_0x0055:
            v7b r2 = new v7b
            r2.<init>(r1, r0)
            r7.y = r2
        L_0x005c:
            v7b r7 = r7.y
            java.lang.Object r7 = r7.b
            java.util.List r7 = (java.util.List) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk3.v():java.util.List");
    }

    public final boolean w() {
        return this.a.c.i == sm3.a;
    }

    public final boolean x() {
        return this.a.c.n.contains(rm3.b);
    }

    public final boolean y() {
        return n() != 0 || B();
    }

    public final boolean z() {
        return this.a.c.n.contains(rm3.a);
    }
}
