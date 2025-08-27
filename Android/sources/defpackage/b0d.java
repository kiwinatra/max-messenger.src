package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b0d  reason: default package */
public final class b0d extends gw8 implements zzc {
    public final String f;
    public String g;
    public String h;
    public boolean i;
    public int j = -1;
    public int k;
    public yzc l;
    public int m = -1;
    public final /* synthetic */ d0d n;

    public b0d(d0d d0d, String str) {
        this.n = d0d;
        this.f = str;
    }

    public final int a() {
        return this.m;
    }

    public final void b(yzc yzc) {
        a0d a0d = new a0d(this);
        this.l = yzc;
        int i2 = yzc.e;
        yzc.e = i2 + 1;
        int i3 = yzc.d;
        yzc.d = i3 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f);
        yzc.b(11, i3, i2, (Bundle) null, bundle);
        yzc.h.put(i3, a0d);
        this.m = i2;
        if (this.i) {
            yzc.a(i2);
            int i4 = this.j;
            if (i4 >= 0) {
                yzc.c(this.m, i4);
                this.j = -1;
            }
            int i5 = this.k;
            if (i5 != 0) {
                yzc.d(this.m, i5);
                this.k = 0;
            }
        }
    }

    public final void c() {
        yzc yzc = this.l;
        if (yzc != null) {
            int i2 = this.m;
            int i3 = yzc.d;
            yzc.d = i3 + 1;
            yzc.b(4, i3, i2, (Bundle) null, (Bundle) null);
            this.l = null;
            this.m = 0;
        }
    }

    public final void d() {
        d0d d0d = this.n;
        d0d.Y.remove(this);
        c();
        d0d.m();
    }

    public final void e() {
        this.i = true;
        yzc yzc = this.l;
        if (yzc != null) {
            yzc.a(this.m);
        }
    }

    public final void f(int i2) {
        yzc yzc = this.l;
        if (yzc != null) {
            yzc.c(this.m, i2);
            return;
        }
        this.j = i2;
        this.k = 0;
    }

    public final void g() {
        h(0);
    }

    public final void h(int i2) {
        this.i = false;
        yzc yzc = this.l;
        if (yzc != null) {
            int i3 = this.m;
            Bundle g2 = wj6.g(i2, "unselectReason");
            int i4 = yzc.d;
            yzc.d = i4 + 1;
            yzc.b(6, i4, i3, (Bundle) null, g2);
        }
    }

    public final void i(int i2) {
        yzc yzc = this.l;
        if (yzc != null) {
            yzc.d(this.m, i2);
        } else {
            this.k += i2;
        }
    }

    public final String j() {
        return this.g;
    }

    public final String k() {
        return this.h;
    }

    public final void m(String str) {
        yzc yzc = this.l;
        if (yzc != null) {
            int i2 = this.m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i3 = yzc.d;
            yzc.d = i3 + 1;
            yzc.b(12, i3, i2, (Bundle) null, bundle);
        }
    }

    public final void n(String str) {
        yzc yzc = this.l;
        if (yzc != null) {
            int i2 = this.m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i3 = yzc.d;
            yzc.d = i3 + 1;
            yzc.b(13, i3, i2, (Bundle) null, bundle);
        }
    }

    public final void o(List list) {
        yzc yzc = this.l;
        if (yzc != null) {
            int i2 = this.m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList(list));
            int i3 = yzc.d;
            yzc.d = i3 + 1;
            yzc.b(14, i3, i2, (Bundle) null, bundle);
        }
    }
}
