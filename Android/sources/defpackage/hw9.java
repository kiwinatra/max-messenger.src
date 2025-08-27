package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: hw9  reason: default package */
public final class hw9 {
    public final fa9 a;
    public final s74 b;
    public final bjd c;
    public final esb d;
    public final r62 e;
    public final fn4 f;
    public final sv0 g;
    public final rl h;
    public final uk5 i;
    public final ysc j;

    public hw9(fa9 fa9, s74 s74, bjd bjd, esb esb, r62 r62, fn4 fn4, sv0 sv0, rl rlVar, uk5 uk5, ysc ysc) {
        this.a = fa9;
        this.b = s74;
        this.c = bjd;
        this.d = esb;
        this.e = r62;
        this.f = fn4;
        this.g = sv0;
        this.h = rlVar;
        this.i = uk5;
        this.j = ysc;
    }

    /* JADX WARNING: type inference failed for: r15v4, types: [odf, java.lang.Object] */
    public final void a(long j2, long j3, b89 b89) {
        long j4 = b89.w;
        fa9 fa9 = this.a;
        z6d z6d = ((a74) fa9.a).c;
        ya9 h2 = z6d.d().h(j2, j4);
        ha9 ha9 = null;
        ha9 b2 = h2 != null ? z6d.b(h2) : null;
        if (b2 != null) {
            if (b2.c == 0) {
                z6d z6d2 = ((a74) this.b).c;
                cd4 cd4 = oa9.b;
                z6d2.o(b89, j2, false, (qe9) null);
                fa9.y(b2, qe8.g(b89.y, this.c));
                z6d z6d3 = ((a74) fa9.a).c;
                ya9 h3 = z6d3.d().h(j2, b89.w);
                if (h3 != null) {
                    ha9 = z6d3.b(h3);
                }
                b2 = ha9;
            }
            if (b2 != null) {
                a32 a0 = this.e.a0(b2.z, j3, b2);
                this.d.b(a0, b2);
                long j5 = b2.b;
                if (a0 != null) {
                    if (a0.b.m == 0) {
                        this.j.b(a0);
                    }
                    if (this.f.d()) {
                        ArrayList k = a0.k();
                        ArrayList arrayList = new ArrayList(k.size());
                        Iterator it = k.iterator();
                        while (it.hasNext()) {
                            try {
                                arrayList.add(Long.valueOf(((vk3) it.next()).r()));
                            } catch (Throwable th) {
                                throw new RuntimeException(th);
                            }
                        }
                        ((jna) this.h).y(arrayList);
                    }
                    long j6 = a0.a;
                    twf twf = new twf(0, j6, j5);
                    sv0 sv0 = this.g;
                    sv0.c(twf);
                    a89 a89 = a0.c;
                    if (a89 != null && a89.a.b == j5) {
                        sv0.c(new xy2(Collections.singletonList(Long.valueOf(j6)), false));
                    }
                }
                if (b2.o()) {
                    for (l20 l20 : (List) b2.x0.b) {
                        x10 x10 = l20.b;
                        if (x10 != null && x10.v) {
                            String str = l20.r;
                            if (!cvg.A(str)) {
                                int i2 = cjf.g;
                                if (str.endsWith(".mp4")) {
                                }
                            }
                            ? obj = new Object();
                            obj.a = j5;
                            obj.b = l20.q;
                            x10 x102 = l20.b;
                            obj.e = x102.y;
                            obj.g = x102.z;
                            this.i.a(new pdf(obj));
                        }
                    }
                }
            }
        }
    }
}
