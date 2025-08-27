package defpackage;

import android.net.Uri;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.math.MathKt;
import kotlin.uuid.Uuid;

/* renamed from: a32  reason: default package */
public final class a32 implements Comparable {
    public v7b A0 = null;
    public volatile CharSequence X;
    public volatile CharSequence Y;
    public final AtomicReference Z = new AtomicReference((Object) null);
    public final long a;
    public final m72 b;
    public final a89 c;
    public final a89 o;
    public final a89 v;
    public volatile CharSequence v0;
    public final long w;
    public volatile hqc w0;
    public final ArrayList x = new ArrayList();
    public volatile String x0;
    public volatile String y;
    public final uqa y0;
    public volatile CharSequence z;
    public final eq2 z0;

    public a32(uqa uqa, eq2 eq2, long j, long j2, m72 m72, a89 a89, a89 a892, a89 a893) {
        this.y0 = uqa;
        this.z0 = eq2;
        this.a = j;
        this.w = j2;
        this.b = m72;
        this.c = a89;
        this.o = a892;
        this.v = a893;
    }

    public final boolean A() {
        if (!F()) {
            return false;
        }
        if (e0()) {
            return true;
        }
        return ld9.F(f(this.w), 2);
    }

    public final boolean B() {
        if (!F() || K()) {
            return false;
        }
        b72 b72 = this.b.H;
        if (b72 == null || !b72.i) {
            return ld9.F(f(this.w), Uuid.SIZE_BITS);
        }
        return true;
    }

    public final boolean C() {
        return w() && this.o.a.s(this.w);
    }

    public final boolean D() {
        mc9 mc9;
        a89 a89;
        vk3 vk3;
        if (!C()) {
            if (w()) {
                a89 a892 = this.o;
                long j = a892.a.w;
                long j2 = this.w;
                if (j == j2 || (mc9 = a892.c) == null || (a89 = mc9.c) == null || (vk3 = a89.b) == null || vk3.r() != j2) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean E() {
        m72 m72 = this.b;
        return m72 != null && m72.c == k72.a;
    }

    public final boolean F() {
        return E() && f0();
    }

    public final boolean G(long j) {
        return this.b.R.containsKey(Long.valueOf(j));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.K;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean H() {
        /*
            r0 = this;
            m72 r0 = r0.b
            if (r0 == 0) goto L_0x000e
            h72 r0 = r0.K
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.c
            if (r0 == 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a32.H():boolean");
    }

    public final boolean I() {
        boolean z2;
        synchronized (this.x) {
            try {
                z2 = false;
                if (N() && !this.x.isEmpty() && ((vk3) this.x.get(0)).w()) {
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public final boolean J() {
        vk3 m = m();
        return N() && m != null && m.x();
    }

    public final boolean K() {
        return this.b.b == l72.c;
    }

    public final boolean L() {
        return this.b.b == l72.b;
    }

    public final boolean M() {
        return this.b.c == k72.w;
    }

    public final boolean N() {
        return this.b.b == l72.a;
    }

    public final boolean O() {
        return this.b.a().e != 0;
    }

    public final boolean P(x23 x23, fq fqVar) {
        if (X(x23)) {
            return true;
        }
        pid pid = (pid) fqVar;
        return (N() ? pid.o() : pid.n()) == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r0 = r1.H;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Q() {
        /*
            r6 = this;
            boolean r0 = r6.F()
            m72 r1 = r6.b
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x000c
        L_0x000a:
            r6 = r3
            goto L_0x0030
        L_0x000c:
            boolean r0 = r6.K()
            if (r0 == 0) goto L_0x0013
            goto L_0x000a
        L_0x0013:
            boolean r0 = r6.e0()
            if (r0 == 0) goto L_0x001b
        L_0x0019:
            r6 = r2
            goto L_0x0030
        L_0x001b:
            b72 r0 = r1.H
            if (r0 == 0) goto L_0x0024
            boolean r0 = r0.f
            if (r0 != 0) goto L_0x0024
            goto L_0x0019
        L_0x0024:
            long r4 = r6.w
            int r6 = r6.f(r4)
            r0 = 64
            boolean r6 = defpackage.ld9.F(r6, r0)
        L_0x0030:
            if (r6 == 0) goto L_0x0039
            int r6 = r1.c()
            if (r6 <= 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r2 = r3
        L_0x003a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a32.Q():boolean");
    }

    public final boolean R() {
        return this.b.b == l72.o;
    }

    public final boolean S() {
        m72 m72 = this.b;
        return m72 != null && m72.c == k72.x;
    }

    public final boolean T() {
        return L() && b0() && E() && !f0();
    }

    public final boolean U() {
        return !N() && this.b.c == k72.b;
    }

    public final boolean V(uj5 uj5) {
        if (!N()) {
            return K() ? ((vj5) uj5).p() ? z() : y() : E() && f0();
        }
        if (J()) {
            return !h0();
        }
        vk3 m = m();
        if (m == null) {
            return false;
        }
        return !m.w();
    }

    public final boolean W() {
        if (!N()) {
            return K() ? y() : E() && f0();
        }
        vk3 m = m();
        if (m == null) {
            return false;
        }
        return !m.w();
    }

    public final boolean X(x23 x23) {
        m72 m72 = this.b;
        return m72.a().a == -1 || m72.a().a > ((qjd) x23).m();
    }

    public final boolean Y() {
        return this.b.H.c;
    }

    public final boolean Z(long j) {
        return j == this.b.d && E();
    }

    public final boolean a() {
        b72 b72;
        if (N() || !F()) {
            return false;
        }
        m72 m72 = this.b;
        if (m72.J.b(2)) {
            return false;
        }
        if (e0()) {
            return true;
        }
        boolean v2 = v();
        if (!K() && (b72 = m72.H) != null && !b72.b) {
            return true;
        }
        return v2;
    }

    public final boolean a0() {
        return this.b.r0 == 2;
    }

    public final boolean b() {
        b72 b72;
        if (N() || !F()) {
            return false;
        }
        m72 m72 = this.b;
        if (m72.J.b(4)) {
            return false;
        }
        if (e0()) {
            return true;
        }
        boolean v2 = v();
        if (!K() && (b72 = m72.H) != null && !b72.b) {
            return true;
        }
        return v2;
    }

    public final boolean b0() {
        return this.b.r0 == 1;
    }

    public final boolean c(long j) {
        if (!F()) {
            return false;
        }
        long j2 = this.w;
        if (j == j2 || j == this.b.d) {
            return false;
        }
        if (!e0()) {
            if (c0()) {
                return !G(j) || t(j2);
            }
            return false;
        }
    }

    public final boolean c0() {
        return E() && G(this.w);
    }

    public final int compareTo(Object obj) {
        return kne.l(((a32) obj).p(), p());
    }

    public final boolean d() {
        if (e0()) {
            if (K()) {
                return true;
            }
            m72 m72 = this.b;
            if (m72.e() || m72.c() > 1) {
                return true;
            }
        }
        return false;
    }

    public final boolean d0() {
        return c0() || this.b.e.containsKey(Long.valueOf(this.w));
    }

    public final Long e(long j) {
        if (E() && G(j)) {
            return Long.valueOf(((v62) this.b.R.get(Long.valueOf(j))).c);
        }
        return null;
    }

    public final boolean e0() {
        return this.w == this.b.d && E();
    }

    public final int f(long j) {
        if (!E()) {
            return 0;
        }
        m72 m72 = this.b;
        if (j == m72.d) {
            return 2047;
        }
        if (m72.R.containsKey(Long.valueOf(j))) {
            return ((v62) m72.R.get(Long.valueOf(j))).b;
        }
        return 0;
    }

    public final boolean f0() {
        return this.b.e.containsKey(Long.valueOf(this.w)) || H();
    }

    public final long g() {
        m72 m72 = this.b;
        if (m72.h(this.w)) {
            return 0;
        }
        vk3 m = m();
        return m != null ? m.r() : m72.a;
    }

    public final boolean g0() {
        boolean z2 = this.b.H.h;
        if (z2) {
            return true;
        }
        vk3 m = m();
        return m != null ? m.A() : z2;
    }

    public final String h(kl0 kl0, jl0 jl0) {
        m72 m72 = this.b;
        uqa uqa = this.y0;
        if (uqa != null) {
            String str = m72.h(((cjd) uqa.a.getValue()).a()) ? (String) uqa.b.getValue() : null;
            if (str != null) {
                return str;
            }
        }
        vk3 m = m();
        if (m == null) {
            return m72.b(kl0, jl0);
        }
        Uri x2 = o5a.x(cjf.A(m.d(), kl0, jl0));
        if (x2 == null) {
            return null;
        }
        return x2.toString();
    }

    public final boolean h0() {
        return this.b.e0.b;
    }

    public final List i() {
        String b2;
        List list = null;
        m72 m72 = this.b;
        uqa uqa = this.y0;
        if (uqa != null) {
            List list2 = m72.h(((cjd) uqa.a.getValue()).a()) ? (List) uqa.c.getValue() : null;
            if (list2 != null) {
                return list2;
            }
        }
        vk3 m = m();
        if (m != null) {
            return m.v();
        }
        String str = m72.h;
        v7b v7b = this.A0;
        if (v7b == null || !gsg.i(v7b.a, str)) {
            kl0 kl0 = kl0.b;
            kl0 kl02 = kl0.o;
            List createListBuilder = CollectionsKt.createListBuilder();
            for (kl0 kl03 : CollectionsKt.asReversed(nl0.a)) {
                if (kl03.compareTo(kl0) >= 0 && kl03.compareTo(kl02) <= 0 && (b2 = m72.b(kl03, jl0.a)) != null) {
                    createListBuilder.add(b2);
                }
            }
            List build = CollectionsKt.build(createListBuilder);
            if (!build.isEmpty()) {
                list = build;
            }
            this.A0 = new v7b(str, list);
        }
        return (List) this.A0.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r1.R.containsKey(java.lang.Long.valueOf(r3)) != false) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i0() {
        /*
            r10 = this;
            r0 = 0
            m72 r1 = r10.b
            if (r1 == 0) goto L_0x0089
            l72 r2 = defpackage.l72.c
            long r3 = r10.w
            k72 r10 = defpackage.k72.w
            k72 r5 = r1.c
            l72 r6 = r1.b
            r7 = 1
            java.util.Map r8 = r1.e
            if (r6 != r2) goto L_0x003a
            boolean r2 = r1.f()
            if (r2 != 0) goto L_0x0088
            if (r5 != r10) goto L_0x0089
            boolean r10 = r1.f()
            if (r10 == 0) goto L_0x002f
            java.lang.Long r10 = java.lang.Long.valueOf(r3)
            java.util.Map r1 = r1.R
            boolean r10 = r1.containsKey(r10)
            if (r10 == 0) goto L_0x002f
            goto L_0x0088
        L_0x002f:
            java.lang.Long r10 = java.lang.Long.valueOf(r3)
            boolean r10 = r8.containsKey(r10)
            if (r10 == 0) goto L_0x0089
            goto L_0x0088
        L_0x003a:
            boolean r2 = r1.g()
            if (r2 == 0) goto L_0x0048
            boolean r2 = r1.f()
            if (r2 == 0) goto L_0x0048
            r2 = r7
            goto L_0x0049
        L_0x0048:
            r2 = r0
        L_0x0049:
            boolean r6 = r1.g()
            if (r6 != 0) goto L_0x0072
            if (r5 != r10) goto L_0x0072
            java.lang.Long r10 = java.lang.Long.valueOf(r3)
            boolean r10 = r8.containsKey(r10)
            if (r10 != 0) goto L_0x0063
            h72 r10 = r1.K
            if (r10 == 0) goto L_0x0072
            boolean r10 = r10.c
            if (r10 == 0) goto L_0x0072
        L_0x0063:
            long r8 = r1.d
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0070
            boolean r10 = r1.f()
            if (r10 == 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r10 = r7
            goto L_0x0073
        L_0x0072:
            r10 = r0
        L_0x0073:
            if (r2 != 0) goto L_0x0088
            boolean r2 = r1.f()
            if (r2 != 0) goto L_0x0088
            boolean r1 = r1.g()
            if (r1 != 0) goto L_0x0086
            k72 r1 = defpackage.k72.b
            if (r5 != r1) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            if (r10 == 0) goto L_0x0089
        L_0x0088:
            r0 = r7
        L_0x0089:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a32.i0():boolean");
    }

    public final long j(long j, bl4 bl4) {
        f72 s = hd8.s(j, this.b.n.d(bl4));
        if (s != null) {
            long j2 = s.a;
            long j3 = s.b;
            if (j2 == j3) {
                return 0;
            }
            return j3;
        }
        return 0;
    }

    public final boolean j0() {
        a89 a89 = this.c;
        return a89 != null && a89.a.z() && a89.a.f().a == p10.o && a89.a.f().b == this.w;
    }

    public final ArrayList k() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.x) {
            arrayList.addAll(this.x);
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k0() {
        /*
            r15 = this;
            java.lang.CharSequence r0 = r15.Y
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            eq2 r0 = r15.z0
            r0.getClass()
            a89 r1 = r15.c
            r2 = 0
            if (r1 == 0) goto L_0x01c0
            hs7 r0 = r0.b
            java.lang.Object r0 = r0.get()
            r6 = r0
            yva r6 = (defpackage.yva) r6
            ha9 r0 = r1.a
            boolean r3 = r0.z()
            vk3 r5 = r1.b
            r8 = 1
            r4 = 0
            if (r3 == 0) goto L_0x0036
            q10 r3 = r0.f()
            p10 r3 = r3.a
            p10 r7 = defpackage.p10.y
            if (r3 != r7) goto L_0x0036
            q10 r1 = r0.f()
            java.lang.String r1 = r1.j
            goto L_0x00cb
        L_0x0036:
            boolean r3 = r0.z()
            if (r3 == 0) goto L_0x005f
            q10 r3 = r0.f()
            p10 r3 = r3.a
            p10 r7 = defpackage.p10.X
            if (r3 != r7) goto L_0x005f
            a89 r3 = r1.o
            if (r3 == 0) goto L_0x005f
            fq2 r0 = r3.y
            vb2 r0 = (defpackage.vb2) r0
            r0.getClass()
            a89 r1 = r15.v
            if (r1 != 0) goto L_0x0057
            goto L_0x01c0
        L_0x0057:
            qb2 r2 = defpackage.qb2.a
            android.text.SpannableString r2 = r0.d(r15, r1, r2, false)
            goto L_0x01c0
        L_0x005f:
            boolean r3 = r0.v()
            if (r3 == 0) goto L_0x007d
            boolean r0 = r5.w
            if (r0 == 0) goto L_0x0074
            android.content.Context r0 = r6.a
            int r1 = defpackage.tmc.tt_you_send_message
            java.lang.String r0 = r0.getString(r1)
        L_0x0071:
            r2 = r0
            goto L_0x01c0
        L_0x0074:
            android.content.Context r0 = r6.a
            int r1 = defpackage.tmc.tt_new_message
            java.lang.String r0 = r0.getString(r1)
            goto L_0x0071
        L_0x007d:
            gsb r1 = r1.v
            r1.f = r15
            yva r3 = r1.a
            int r7 = r3.h()
            int r3 = r3.e()
            r1.j(r15, r7, r3)
            java.lang.CharSequence r1 = r1.g
            if (r1 != 0) goto L_0x0094
            goto L_0x01c0
        L_0x0094:
            java.lang.String r1 = r1.toString()
            java.util.regex.Pattern r2 = defpackage.hhf.a
            int r2 = r1.length()
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 > r3) goto L_0x00a3
            goto L_0x00cb
        L_0x00a3:
            java.lang.String r1 = r1.substring(r4, r3)
            int r2 = r1.length()
            int r2 = r2 - r8
            char r2 = r1.charAt(r2)
            boolean r2 = java.lang.Character.isHighSurrogate(r2)
            if (r2 == 0) goto L_0x00c5
            int r2 = r1.length()
            if (r2 <= r8) goto L_0x00c5
            int r2 = r1.length()
            int r2 = r2 - r8
            java.lang.String r1 = r1.substring(r4, r2)
        L_0x00c5:
            java.lang.String r2 = "…"
            java.lang.String r1 = defpackage.tr1.j(r1, r2)
        L_0x00cb:
            r6.getClass()
            r2 = 18
            int r3 = defpackage.vo4.b(r2)
            u25 r7 = r6.k
            java.lang.CharSequence r1 = r7.e(r1, r3)
            java.lang.CharSequence r1 = defpackage.ld8.q0(r1)
            java.util.List r3 = r0.P0
            int r2 = defpackage.vo4.b(r2)
            java.lang.CharSequence r1 = r6.l(r2, r1, r3)
            kotlin.text.Regex r2 = defpackage.se.a
            if (r1 == 0) goto L_0x013a
            int r2 = r1.length()
            if (r2 != 0) goto L_0x00f3
            goto L_0x013a
        L_0x00f3:
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>()
            r3 = r4
            r7 = r3
        L_0x00fa:
            int r9 = r1.length()
            if (r3 >= r9) goto L_0x0132
            char r9 = r1.charAt(r3)
            r10 = 10
            if (r9 == r10) goto L_0x010f
            r10 = 13
            if (r9 != r10) goto L_0x010d
            goto L_0x010f
        L_0x010d:
            r10 = r4
            goto L_0x0110
        L_0x010f:
            r10 = r8
        L_0x0110:
            boolean r11 = kotlin.text.CharsKt.isWhitespace(r9)
            if (r10 != 0) goto L_0x011e
            if (r11 == 0) goto L_0x0119
            goto L_0x011e
        L_0x0119:
            r2.append(r9)
            r7 = r4
            goto L_0x012f
        L_0x011e:
            if (r7 != 0) goto L_0x012e
            if (r3 <= 0) goto L_0x012e
            int r7 = r1.length()
            int r7 = r7 - r8
            if (r3 >= r7) goto L_0x012e
            r7 = 32
            r2.append(r7)
        L_0x012e:
            r7 = r8
        L_0x012f:
            int r3 = r3 + 1
            goto L_0x00fa
        L_0x0132:
            boolean r3 = r1 instanceof android.text.Spanned
            if (r3 != 0) goto L_0x013c
            android.text.SpannableString r1 = android.text.SpannableString.valueOf(r2)
        L_0x013a:
            r2 = r1
            goto L_0x0187
        L_0x013c:
            android.text.Spanned r1 = (android.text.Spanned) r1
            int r3 = r1.length()
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            java.lang.Object[] r3 = r1.getSpans(r4, r3, r7)
            int r7 = r3.length
            r9 = r4
        L_0x014a:
            if (r4 >= r7) goto L_0x0182
            r10 = r3[r4]
            int r11 = r1.getSpanStart(r10)
            int r12 = r1.getSpanEnd(r10)
            int r13 = r1.getSpanFlags(r10)
            java.lang.CharSequence r11 = r1.subSequence(r11, r12)
            java.lang.String r11 = r11.toString()
            kotlin.text.Regex r12 = defpackage.se.a
            java.lang.String r14 = " "
            java.lang.String r11 = r12.replace((java.lang.CharSequence) r11, (java.lang.String) r14)
            kotlin.text.Regex r12 = defpackage.se.b
            java.lang.String r11 = r12.replace((java.lang.CharSequence) r11, (java.lang.String) r14)
            r12 = 4
            int r12 = kotlin.text.StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) r2, (java.lang.String) r11, (int) r9, false, (int) r12, (java.lang.Object) null)
            if (r12 < 0) goto L_0x017f
            int r9 = r11.length()
            int r9 = r9 + r12
            r2.setSpan(r10, r12, r9, r13)
        L_0x017f:
            int r4 = r4 + 1
            goto L_0x014a
        L_0x0182:
            android.text.SpannableString r1 = android.text.SpannableString.valueOf(r2)
            goto L_0x013a
        L_0x0187:
            boolean r1 = r0.z()
            if (r1 == 0) goto L_0x01c0
            boolean r1 = defpackage.cvg.A(r2)
            if (r1 != 0) goto L_0x01c0
            if (r5 == 0) goto L_0x01c0
            java.lang.String r3 = r2.toString()
            q10 r4 = r0.f()
            r6.getClass()
            p10 r0 = r4.a
            int r0 = r0.ordinal()
            switch(r0) {
                case 1: goto L_0x01ba;
                case 2: goto L_0x01ab;
                case 3: goto L_0x01ab;
                case 4: goto L_0x01ba;
                case 5: goto L_0x01ba;
                case 6: goto L_0x01ba;
                case 7: goto L_0x01a9;
                case 8: goto L_0x01ba;
                default: goto L_0x01a9;
            }
        L_0x01a9:
            r2 = r3
            goto L_0x01c0
        L_0x01ab:
            kotlin.Lazy r0 = r6.d
            java.lang.Object r0 = r0.getValue()
            r7 = r0
            km3 r7 = (defpackage.km3) r7
            android.text.SpannableStringBuilder r0 = defpackage.ghf.b(r3, r4, r5, r6, r7, r8)
            goto L_0x0071
        L_0x01ba:
            java.lang.CharSequence r0 = defpackage.ghf.a(r3, r5, r6, r8)
            goto L_0x0071
        L_0x01c0:
            r15.Y = r2
            m72 r0 = r15.b
            pt4 r0 = r0.f0
            if (r0 == 0) goto L_0x0242
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = defpackage.cvg.D(r0)
            if (r0 == 0) goto L_0x0242
            eq2 r0 = r15.z0
            m72 r15 = r15.b
            pt4 r15 = r15.f0
            java.lang.CharSequence r15 = r15.getText()
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            fk r2 = defpackage.ii.c
            if (r2 != 0) goto L_0x01e9
            goto L_0x0242
        L_0x01e9:
            hs7 r3 = r0.e
            java.lang.Object r3 = r3.get()
            bud r3 = (defpackage.bud) r3
            r3.getClass()
            java.util.Set r3 = java.util.Collections.emptySet()
            hj r4 = defpackage.hj.b
            boolean r3 = defpackage.ryg.h(r3, r4)
            if (r3 != 0) goto L_0x0201
            goto L_0x0242
        L_0x0201:
            hs7 r0 = r0.b
            java.lang.Object r0 = r0.get()
            yva r0 = (defpackage.yva) r0
            u25 r0 = r0.k
            java.lang.CharSequence r15 = r0.c(r15)
            java.util.List r15 = r2.b(r15)
            java.util.Iterator r15 = r15.iterator()
        L_0x0217:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0242
            java.lang.Object r0 = r15.next()
            qi r0 = (defpackage.qi) r0
            java.lang.String r3 = r0.a
            k15 r4 = r0.b
            l25 r4 = r4.a
            java.net.URL r4 = r4.a
            java.lang.String r4 = r4.toString()
            one.me.rlottie.RLottieDrawable r3 = r2.a(r3, r4)
            fsb r4 = new fsb
            java.lang.String r5 = r0.a
            int r6 = r0.c
            int r0 = r0.d
            r4.<init>(r5, r3, r6, r0)
            r1.add(r4)
            goto L_0x0217
        L_0x0242:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a32.k0():void");
    }

    public final String l() {
        if (N() && m() != null) {
            return m().a.c.o;
        }
        if (L() || K()) {
            return this.b.E;
        }
        return null;
    }

    public final void l0() {
        if (this.X == null) {
            if (this.b.h(this.w)) {
                this.X = r();
                return;
            }
            eq2 eq2 = this.z0;
            String r = r();
            hs7 hs7 = eq2.b;
            yva yva = (yva) hs7.get();
            yva.getClass();
            float d = vo4.d(((ltb) yva.j).c.g.getFloat("app.extra.text.size.sp", c44.DEFAULT_ASPECT_RATIO));
            this.X = ((yva) hs7.get()).k.e(r, (int) (d + ((float) MathKt.roundToInt(TypedValue.applyDimension(2, (float) 16, vo4.c().getDisplayMetrics())))));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.vk3 m() {
        /*
            r2 = this;
            java.util.ArrayList r0 = r2.x
            monitor-enter(r0)
            boolean r1 = r2.N()     // Catch:{ all -> 0x001c }
            if (r1 == 0) goto L_0x001e
            java.util.ArrayList r1 = r2.x     // Catch:{ all -> 0x001c }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x001e
            java.util.ArrayList r2 = r2.x     // Catch:{ all -> 0x001c }
            r1 = 0
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x001c }
            vk3 r2 = (defpackage.vk3) r2     // Catch:{ all -> 0x001c }
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            return r2
        L_0x001c:
            r2 = move-exception
            goto L_0x0021
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            r2 = 0
            return r2
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a32.m():vk3");
    }

    public final void m0() {
        if (this.v0 == null) {
            uqa uqa = this.y0;
            if (uqa != null) {
                if (this.b.h(((cjd) uqa.a.getValue()).a())) {
                    this.v0 = "";
                    return;
                }
            }
            vk3 m = m();
            if (m != null) {
                this.v0 = m.q();
                return;
            }
            eq2 eq2 = this.z0;
            String r = r();
            hs7 hs7 = eq2.b;
            Pattern pattern = vua.a;
            this.v0 = ((yva) hs7.get()).k.c(vua.a(r, (yva) hs7.get()));
        }
    }

    public final long n() {
        a89 a89 = this.c;
        if (a89 != null) {
            return a89.a.m();
        }
        return 0;
    }

    public final void n0() {
        String str;
        eq2 eq2 = this.z0;
        long j = this.w;
        boolean h = this.b.h(((cjd) eq2.g.get()).a());
        hs7 hs7 = eq2.b;
        if (h) {
            str = ((yva) hs7.get()).a.getString(tmc.saved_messages);
        } else {
            String str2 = null;
            if (N()) {
                vk3 m = m();
                if (m != null) {
                    str2 = m.f();
                }
            } else {
                m72 m72 = this.b;
                if (!cvg.A(m72.g)) {
                    str2 = m72.g;
                } else {
                    ArrayList k = k();
                    if (!K() && !k.isEmpty()) {
                        StringBuilder sb = new StringBuilder();
                        Iterator it = k.iterator();
                        while (it.hasNext()) {
                            vk3 vk3 = (vk3) it.next();
                            if (!vk3.B() && j != vk3.r()) {
                                sb.append(vk3.f().trim());
                                sb.append(", ");
                            }
                        }
                        if (sb.length() > 0) {
                            sb.delete(sb.length() - 2, sb.length());
                        }
                        str2 = sb.toString().trim();
                    } else if (K()) {
                        str2 = "";
                    }
                }
            }
            str = str2 == null ? ((yva) hs7.get()).a.getString(tmc.tt_chat_participants_empty__title) : str2;
        }
        this.y = str;
    }

    public final long o() {
        boolean K = K();
        a89 a89 = this.c;
        if (!K || !M()) {
            m72 m72 = this.b;
            Map map = m72.e;
            long j = this.w;
            Long l = (Long) map.get(Long.valueOf(j));
            if (l != null && l.longValue() != 0) {
                return l.longValue();
            }
            if (a89 == null) {
                return 0;
            }
            if (!f0() || a89.a.w == j || ((K() && !d0()) || H())) {
                return a89.a.o;
            }
            long j2 = a89.a.o;
            long j3 = m72.P;
            return j2 <= j3 ? j2 - 1 : j3;
        } else if (a89 != null) {
            return a89.a.o;
        } else {
            return 0;
        }
    }

    public final boolean o0() {
        return this.b.e0.a || J();
    }

    public final long p() {
        return hi7.o(n(), this.b);
    }

    public final void p0(km3 km3) {
        km3.d();
        synchronized (this.x) {
            try {
                this.x.clear();
                for (Long longValue : this.b.e.keySet()) {
                    vk3 p = km3.p(longValue.longValue(), true);
                    long r = p.r();
                    long j = this.w;
                    if (r != j || this.b.h(j)) {
                        this.x.add(p);
                    }
                }
                n0();
            } finally {
                while (true) {
                }
            }
        }
        this.X = null;
        this.Y = null;
        this.v0 = null;
        this.Z.set((Object) null);
    }

    public final CharSequence q(boolean z2) {
        if (this.z == null || z2) {
            this.z = this.z0.a(this);
        }
        return this.z;
    }

    public final String r() {
        if (this.y == null) {
            n0();
        }
        return this.y;
    }

    public final boolean s() {
        if (!F()) {
            return false;
        }
        return e0() || t(this.w);
    }

    public final boolean t(long j) {
        return ld9.F(f(j), 4);
    }

    public final String toString() {
        return "Chat{id=" + this.a + ",data=" + this.b + '}';
    }

    public final boolean u() {
        b72 b72;
        m72 m72 = this.b;
        if (m72.J.b(1) || !F()) {
            return false;
        }
        if (e0()) {
            return true;
        }
        boolean F = ld9.F(f(this.w), 2);
        if (!K() && (b72 = m72.H) != null && !b72.d) {
            return true;
        }
        return F;
    }

    public final boolean v() {
        if (!F()) {
            return false;
        }
        return e0() || ld9.F(f(this.w), 8);
    }

    public final boolean w() {
        a89 a89 = this.o;
        return (a89 == null || a89.a.Y == qe9.DELETED || o() >= a89.a.o) ? false : true;
    }

    public final boolean x() {
        b72 b72;
        if (N() || R()) {
            return false;
        }
        m72 m72 = this.b;
        if (m72.J.b(16) || !F() || m72.J.b(16)) {
            return false;
        }
        if (e0()) {
            return true;
        }
        boolean F = ld9.F(f(this.w), 16);
        if (!K() && (b72 = m72.H) != null && b72.e) {
            return true;
        }
        return F;
    }

    public final boolean y() {
        return e0() || ld9.F(f(this.w), 1);
    }

    public final boolean z() {
        return e0() || ld9.F(f(this.w), 256);
    }
}
