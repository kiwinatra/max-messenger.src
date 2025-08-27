package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* renamed from: ss8  reason: default package */
public final class ss8 {
    public CharSequence A;
    public Integer B;
    public Integer C;
    public CharSequence D;
    public CharSequence E;
    public CharSequence F;
    public Integer G;
    public Bundle H;
    public CharSequence a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public Long h;
    public rpc i;
    public rpc j;
    public byte[] k;
    public Integer l;
    public Uri m;
    public Integer n;
    public Integer o;
    public Integer p;
    public Boolean q;
    public Boolean r;
    public Integer s;
    public Integer t;
    public Integer u;
    public Integer v;
    public Integer w;
    public Integer x;
    public CharSequence y;
    public CharSequence z;

    public final us8 a() {
        return new us8(this);
    }

    public final void b(int i2, byte[] bArr) {
        if (this.k != null) {
            Integer valueOf = Integer.valueOf(i2);
            int i3 = v0g.a;
            if (!valueOf.equals(3) && v0g.a(this.l, 3)) {
                return;
            }
        }
        this.k = (byte[]) bArr.clone();
        this.l = Integer.valueOf(i2);
    }

    public final void c(CharSequence charSequence) {
        this.d = charSequence;
    }

    public final void d(CharSequence charSequence) {
        this.c = charSequence;
    }

    public final void e(CharSequence charSequence) {
        this.b = charSequence;
    }

    public final void f(byte[] bArr, Integer num) {
        this.k = bArr == null ? null : (byte[]) bArr.clone();
        this.l = num;
    }

    public final void g(CharSequence charSequence) {
        this.z = charSequence;
    }

    public final void h(CharSequence charSequence) {
        this.A = charSequence;
    }

    public final void i(Long l2) {
        n79.g(l2 == null || l2.longValue() >= 0);
        this.h = l2;
    }

    public final void j(CharSequence charSequence) {
        this.D = charSequence;
    }

    public final void k(Integer num) {
        this.u = num;
    }

    public final void l(Integer num) {
        this.t = num;
    }

    public final void m(Integer num) {
        this.s = num;
    }

    public final void n(Integer num) {
        this.x = num;
    }

    public final void o(Integer num) {
        this.w = num;
    }

    public final void p(Integer num) {
        this.v = num;
    }

    public final void q(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final void r(Integer num) {
        this.o = num;
    }

    public final void s(Integer num) {
        this.n = num;
    }

    public final void t(CharSequence charSequence) {
        this.y = charSequence;
    }
}
