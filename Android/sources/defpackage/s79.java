package defpackage;

import java.util.List;

/* renamed from: s79  reason: default package */
public final class s79 implements md5 {
    public final md5 a;
    public final spf b;

    public s79(md5 md5, spf spf) {
        this.a = md5;
        this.b = spf;
    }

    public final spf a() {
        return this.b;
    }

    public final int b() {
        return this.a.b();
    }

    public final void c(boolean z) {
        this.a.c(z);
    }

    public final ea6 d(int i) {
        return this.b.d[this.a.f(i)];
    }

    public final void e() {
        this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s79)) {
            return false;
        }
        s79 s79 = (s79) obj;
        return this.a.equals(s79.a) && this.b.equals(s79.b);
    }

    public final int f(int i) {
        return this.a.f(i);
    }

    public final int g(long j, List list) {
        return this.a.g(j, list);
    }

    public final void h() {
        this.a.h();
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + 527) * 31);
    }

    public final int i() {
        return this.a.i();
    }

    public final ea6 j() {
        return this.b.d[this.a.i()];
    }

    public final int k() {
        return this.a.k();
    }

    public final void l(float f) {
        this.a.l(f);
    }

    public final int length() {
        return this.a.length();
    }

    public final Object m() {
        return this.a.m();
    }

    public final void n() {
        this.a.n();
    }

    public final void o() {
        this.a.o();
    }

    public final int p(int i) {
        return this.a.p(i);
    }

    public final boolean q(int i, long j) {
        return this.a.q(i, j);
    }

    public final void r(long j, long j2, long j3, List list, an8[] an8Arr) {
        this.a.r(j, j2, j3, list, an8Arr);
    }

    public final int s(ea6 ea6) {
        return this.a.p(this.b.d(ea6));
    }

    public final boolean t(long j, m03 m03, List list) {
        return this.a.t(j, m03, list);
    }

    public final boolean u(int i, long j) {
        return this.a.u(i, j);
    }
}
