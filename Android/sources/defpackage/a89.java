package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: a89  reason: default package */
public class a89 implements gz6 {
    public static final /* synthetic */ int z = 0;
    public final ha9 a;
    public final vk3 b;
    public final mc9 c;
    public final a89 o;
    public final gsb v;
    public final cd9 w;
    public final ff9 x;
    public final fq2 y;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a89(ha9 ha9, vk3 vk3, mc9 mc9, a89 a89, gsb gsb, cd9 cd9, ff9 ff9, fq2 fq2) {
        this(ha9, vk3, mc9, a89, gsb, cd9, ff9, fq2, 0);
        Collections.emptySet();
    }

    public final List a() {
        this.v.getClass();
        return Collections.emptyList();
    }

    public final a89 b() {
        mc9 mc9 = this.c;
        if (mc9 == null || mc9.a != 2) {
            return null;
        }
        return mc9.c;
    }

    public final CharSequence c(a32 a32) {
        gsb gsb = this.v;
        gsb.f = a32;
        yva yva = gsb.a;
        gsb.j(a32, yva.h(), yva.e());
        gsb.h(a32);
        return gsb.g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003b, code lost:
        if (r1 != ((defpackage.ltb) ((defpackage.jtb) r0.a.get())).a.s()) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String d(defpackage.a32 r6) {
        /*
            r5 = this;
            ff9 r0 = r5.x
            r0.getClass()
            if (r6 == 0) goto L_0x0042
            boolean r1 = r6.K()
            if (r1 == 0) goto L_0x0014
            boolean r1 = r5.e()
            if (r1 == 0) goto L_0x0014
            goto L_0x003d
        L_0x0014:
            boolean r1 = r6.R()
            if (r1 == 0) goto L_0x0042
            ha9 r1 = r5.a
            long r1 = r1.w
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x003d
            kotlin.reflect.KProperty[] r3 = defpackage.ff9.b
            r4 = 0
            r3 = r3[r4]
            hs7 r0 = r0.a
            java.lang.Object r0 = r0.get()
            jtb r0 = (defpackage.jtb) r0
            ltb r0 = (defpackage.ltb) r0
            a33 r0 = r0.a
            long r3 = r0.s()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0042
        L_0x003d:
            java.lang.String r5 = r6.r()
            goto L_0x004a
        L_0x0042:
            vk3 r5 = r5.b
            java.lang.String r5 = r5.f()
            if (r5 == 0) goto L_0x004b
        L_0x004a:
            return r5
        L_0x004b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Required value was null."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a89.d(a32):java.lang.String");
    }

    public final boolean e() {
        return this.a.T0 == 4;
    }

    public final boolean f() {
        return !this.b.w;
    }

    public final long getId() {
        return this.a.b;
    }

    public final long h() {
        ha9 ha9 = this.a;
        cl4 cl4 = ha9.R0;
        return cl4 != null ? cl4.a : ha9.o;
    }

    public final String toString() {
        return "Message{data=" + this.a + '}';
    }

    public a89(ha9 ha9, vk3 vk3, mc9 mc9, a89 a89, gsb gsb, cd9 cd9, ff9 ff9, fq2 fq2, int i) {
        this.a = ha9;
        this.b = vk3;
        this.c = mc9;
        this.o = a89;
        this.v = gsb;
        this.w = cd9;
        this.x = ff9;
        this.y = fq2;
    }
}
