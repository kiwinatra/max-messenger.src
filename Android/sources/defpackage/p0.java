package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.fresco.ui.common.ControllerListener2;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: p0  reason: default package */
public abstract class p0 {
    public static final n0 m = new Object();
    public static final NullPointerException n = new NullPointerException("No image request was specified!");
    public static final AtomicLong o = new AtomicLong();
    public final Context a;
    public final Set b;
    public final Set c;
    public Object d = null;
    public Object e = null;
    public Object f = null;
    public r2f g;
    public jy3 h = null;
    public boolean i = false;
    public boolean j = false;
    public boolean k;
    public gv4 l = null;

    public p0(Context context, Set set, Set set2) {
        this.a = context;
        this.b = set;
        this.c = set2;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [q77, java.lang.Object] */
    public final jnb a() {
        jnb jnb;
        Object obj;
        if (this.g == null || (this.e == null && this.f == null)) {
            if (this.e == null && (obj = this.f) != null) {
                this.e = obj;
                this.f = null;
            }
            tf6.P();
            knb knb = (knb) this;
            tf6.P();
            try {
                gv4 gv4 = knb.l;
                String valueOf = String.valueOf(o.getAndIncrement());
                if (gv4 instanceof jnb) {
                    jnb = (jnb) gv4;
                } else {
                    ay2 ay2 = knb.q;
                    jnb jnb2 = new jnb((Resources) ay2.b, (pk4) ay2.c, (xc4) ((tu4) ay2.o), (ExecutorService) ((Executor) ay2.v), (zqd) ((z59) ay2.w), (a00) ay2.x);
                    r2f r2f = (r2f) ay2.y;
                    if (r2f != null) {
                        jnb2.D = ((Boolean) r2f.get()).booleanValue();
                    }
                    jnb = jnb2;
                }
                r2f b2 = knb.b(jnb, valueOf);
                qa7 qa7 = (qa7) knb.e;
                cd4 cd4 = knb.p.h;
                io0 j2 = (cd4 == null || qa7 == null) ? null : qa7.q != null ? cd4.j(qa7, knb.d) : cd4.e(qa7, knb.d);
                Object obj2 = knb.d;
                jnb.getClass();
                tf6.P();
                jnb.g(obj2, valueOf);
                jnb.s = false;
                jnb.t = false;
                jnb.C = b2;
                jnb.v((v33) null);
                jnb.B = j2;
                jnb.E = null;
                jnb.v((v33) null);
                tf6.P();
                jnb.t(knb.r, knb);
                tf6.P();
                jnb.t = false;
                jnb.o = this.k;
                jnb.p = null;
                boolean z = this.i;
                if (z) {
                    if (jnb.d == null) {
                        ? obj3 = new Object();
                        obj3.b = false;
                        obj3.a = 4;
                        obj3.c = 0;
                        jnb.d = obj3;
                    }
                    jnb.d.b = z;
                    if (jnb.e == null) {
                        bq6 bq6 = new bq6(this.a);
                        jnb.e = bq6;
                        bq6.a = jnb;
                    }
                }
                Set<jy3> set = this.b;
                if (set != null) {
                    for (jy3 a2 : set) {
                        jnb.a(a2);
                    }
                }
                Set<ControllerListener2> set2 = this.c;
                if (set2 != null) {
                    for (ControllerListener2 addListener : set2) {
                        jnb.g.addListener(addListener);
                    }
                }
                jy3 jy3 = this.h;
                if (jy3 != null) {
                    jnb.a(jy3);
                }
                if (this.j) {
                    jnb.a(m);
                }
                tf6.P();
                return jnb;
            } catch (Throwable th) {
                tf6.P();
                throw th;
            }
        } else {
            throw new IllegalStateException("Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
        }
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.r2f b(defpackage.jnb r14, java.lang.String r15) {
        /*
            r13 = this;
            r2f r0 = r13.g
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            java.lang.Object r5 = r13.e
            r12 = 1
            if (r5 == 0) goto L_0x0017
            java.lang.Object r6 = r13.d
            o0 r0 = new o0
            r1 = r0
            r2 = r13
            r3 = r14
            r4 = r15
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 == 0) goto L_0x003d
            java.lang.Object r1 = r13.f
            if (r1 == 0) goto L_0x003d
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 2
            r1.<init>(r2)
            r1.add(r0)
            java.lang.Object r10 = r13.f
            java.lang.Object r11 = r13.d
            o0 r0 = new o0
            r6 = r0
            r7 = r13
            r8 = r14
            r9 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r1.add(r0)
            se7 r0 = new se7
            r13 = 0
            r0.<init>(r1, r13)
        L_0x003d:
            if (r0 != 0) goto L_0x0044
            m74 r0 = new m74
            r0.<init>()
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p0.b(jnb, java.lang.String):r2f");
    }
}
