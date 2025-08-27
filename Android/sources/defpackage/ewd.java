package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: ewd  reason: default package */
public final class ewd extends awd {
    public final bv1 j = new bv1(7);
    public boolean k = true;
    public boolean l = false;
    public final ArrayList m = new ArrayList();

    public final void a(fwd fwd) {
        Map map;
        Object obj;
        bx1 bx1 = fwd.g;
        int i = bx1.c;
        u40 u40 = this.b;
        if (i != -1) {
            this.l = true;
            int i2 = u40.c;
            Integer valueOf = Integer.valueOf(i);
            List list = fwd.j;
            if (list.indexOf(valueOf) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
            u40.c = i;
        }
        la0 la0 = bx1.k;
        Range range = hc0.f;
        je3 je3 = bx1.b;
        Range range2 = (Range) je3.k(la0, range);
        Objects.requireNonNull(range2);
        if (!range2.equals(range)) {
            pz9 pz9 = (pz9) u40.f;
            pz9.getClass();
            try {
                obj = pz9.n(la0);
            } catch (IllegalArgumentException unused) {
                obj = range;
            }
            if (((Range) obj).equals(range)) {
                ((pz9) u40.f).f(bx1.k, range2);
            } else {
                pz9 pz92 = (pz9) u40.f;
                la0 la02 = bx1.k;
                Object obj2 = hc0.f;
                pz92.getClass();
                try {
                    obj2 = pz92.n(la02);
                } catch (IllegalArgumentException unused2) {
                }
                if (!((Range) obj2).equals(range2)) {
                    this.k = false;
                }
            }
        }
        int b = bx1.b();
        if (b != 0) {
            u40.getClass();
            if (b != 0) {
                ((pz9) u40.f).f(zzf.s0, Integer.valueOf(b));
            }
        }
        int c = bx1.c();
        if (c != 0) {
            u40.getClass();
            if (c != 0) {
                ((pz9) u40.f).f(zzf.t0, Integer.valueOf(c));
            }
        }
        bx1 bx12 = fwd.g;
        a9f a9f = bx12.g;
        Map map2 = ((uz9) u40.g).a;
        if (!(map2 == null || (map = a9f.a) == null)) {
            map2.putAll(map);
        }
        this.c.addAll(fwd.c);
        this.d.addAll(fwd.d);
        u40.a(bx12.e);
        this.e.addAll(fwd.e);
        dwd dwd = fwd.f;
        if (dwd != null) {
            this.m.add(dwd);
        }
        InputConfiguration inputConfiguration = fwd.i;
        if (inputConfiguration != null) {
            this.g = inputConfiguration;
        }
        LinkedHashSet<dc0> linkedHashSet = this.a;
        linkedHashSet.addAll(fwd.a);
        HashSet hashSet = (HashSet) u40.e;
        hashSet.addAll(Collections.unmodifiableList(bx1.a));
        ArrayList arrayList = new ArrayList();
        for (dc0 dc0 : linkedHashSet) {
            arrayList.add(dc0.a);
            for (lk4 add : dc0.b) {
                arrayList.add(add);
            }
        }
        if (!arrayList.containsAll(hashSet)) {
            this.k = false;
        }
        int i3 = this.h;
        int i4 = fwd.h;
        if (i4 != i3 && i4 != 0 && i3 != 0) {
            this.k = false;
        } else if (i4 != 0) {
            this.h = i4;
        }
        dc0 dc02 = fwd.b;
        if (dc02 != null) {
            dc0 dc03 = this.i;
            if (dc03 == dc02 || dc03 == null) {
                this.i = dc02;
            } else {
                this.k = false;
            }
        }
        u40.c(je3);
    }

    public final fwd b() {
        if (this.k) {
            ArrayList arrayList = new ArrayList(this.a);
            bv1 bv1 = this.j;
            if (bv1.b) {
                Collections.sort(arrayList, new ks3(4, bv1));
            }
            return new fwd(arrayList, new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), this.b.d(), !this.m.isEmpty() ? new b87(4, this) : null, this.g, this.h, this.i);
        }
        throw new IllegalArgumentException("Unsupported session configuration combination");
    }
}
