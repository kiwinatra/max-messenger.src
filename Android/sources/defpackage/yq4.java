package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: yq4  reason: default package */
public final class yq4 extends tyc {
    public final xq4 o;
    public boolean v = true;

    public yq4(xq4 xq4) {
        this.o = xq4;
        C(true);
    }

    public final int j() {
        return this.v ? 1 : 0;
    }

    public final long k(int i) {
        return (long) this.o.a;
    }

    public final int l(int i) {
        return this.o.a;
    }

    public final void s(pzc pzc, int i) {
        ((zq4) pzc).M(this.o);
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        return new zq4(LayoutInflater.from(viewGroup.getContext()).inflate(ujc.row_divider, viewGroup, false));
    }
}
