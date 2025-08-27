package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: o18  reason: default package */
public final /* synthetic */ class o18 implements zi6, qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q18 b;

    public /* synthetic */ o18(q18 q18, int i) {
        this.a = i;
        this.b = q18;
    }

    public void accept(Object obj) {
        q18 q18 = this.b;
        switch (this.a) {
            case 1:
                q18.w0 = (List) obj;
                gnf gnf = q18.a;
                if (gnf != null) {
                    gnf.j();
                    return;
                }
                return;
            case 2:
                q18.getClass();
                z68.f("q18", "Can't update panel", (Throwable) obj);
                q18.w0 = null;
                gnf gnf2 = q18.a;
                if (gnf2 != null) {
                    gnf2.j();
                    return;
                }
                return;
            default:
                Long l = (Long) obj;
                q18.f();
                return;
        }
    }

    public Object apply(Object obj) {
        jtb jtb;
        uc9 uc9;
        n18 n18;
        ArrayList arrayList;
        n18 n182;
        uc9 uc92;
        CharSequence s;
        boolean z;
        boolean z2;
        List list = (List) obj;
        q18 q18 = this.b;
        q18.getClass();
        Iterator it = list.iterator();
        uc9 uc93 = null;
        uc9 uc94 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            jtb = q18.o;
            if (!hasNext) {
                break;
            }
            uc9 uc95 = (uc9) it.next();
            if (uc95.b == ((ltb) jtb).a.s()) {
                it.remove();
                uc94 = uc95;
            } else if (uc93 == null || uc95.d > uc93.d) {
                uc93 = uc95;
            }
        }
        Context context = q18.b;
        if (uc93 == null) {
            uc9 = uc94;
            n18 = null;
        } else {
            if (list.size() == 1) {
                uc9 uc96 = (uc9) list.get(0);
                ltb ltb = (ltb) jtb;
                boolean z3 = ltb.a.m() - uc96.d >= TimeUnit.SECONDS.toMillis((long) ltb.b.q()) * 2;
                boolean N = q18.v0.N();
                long j = uc96.b;
                if (N) {
                    if (q18.A0 != j) {
                        s58 s58 = uc96.c;
                        double d = s58.a;
                        s58 s582 = q18.z0;
                        double d2 = s582.a;
                        uc92 = uc93;
                        uc9 = uc94;
                        double d3 = s58.b;
                        z2 = z3;
                        s = ((be) q18.w).c(d, d3, d2, s582.b);
                    } else {
                        uc92 = uc93;
                        uc9 = uc94;
                        z2 = z3;
                        s = null;
                    }
                    if (cvg.A(s)) {
                        q18.A0 = j;
                        s = context.getString(jad.w);
                    }
                    if (!q18.z0.a() && n54.e(context, n54.k)) {
                        q18.x.a(q18);
                    }
                } else {
                    uc92 = uc93;
                    uc9 = uc94;
                    z2 = z3;
                    s = q18.Y.k.c(context.getString(jad.v, new Object[]{q18.v.p(j, false).f()}));
                }
                z = z2;
            } else {
                uc92 = uc93;
                uc9 = uc94;
                s = ghf.s(iad.a, list.size(), context);
                z = false;
            }
            n18 = new n18(s, false, false, uc92.d, 0, 0, z);
        }
        d18 d18 = q18.c;
        if (n18 != null) {
            arrayList = new ArrayList();
            arrayList.add(n18);
            ((j18) d18).k(q18.v0.a);
        } else {
            arrayList = null;
        }
        if (uc9 == null) {
            n182 = null;
        } else {
            z68.f("q18", "background permissions is not supported yet", (Throwable) null);
            uc9 uc97 = uc9;
            boolean c = cvg.c(uc97.f, q18.y.a());
            ltb ltb2 = (ltb) jtb;
            n182 = new n18(!c ? context.getString(jad.t) : context.getString(jad.A), true, !c, uc97.d, uc97.a, uc97.g, !c && ltb2.a.m() - uc97.d >= TimeUnit.SECONDS.toMillis((long) ltb2.b.q()) * 2);
        }
        if (n182 != null) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(n182);
            if (n182.e) {
                ((j18) d18).k(q18.v0.a);
            }
        }
        return (arrayList == null || arrayList.isEmpty()) ? uh8.a : nh8.e(arrayList);
    }
}
