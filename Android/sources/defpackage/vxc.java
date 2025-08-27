package defpackage;

import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: vxc  reason: default package */
public final class vxc extends xag {
    public final pxc b;
    public final ph1 c;
    public final Lazy o;
    public final Lazy v;
    public final etc w;
    public final zjb x;

    public vxc(pxc pxc, ph1 ph1, Lazy lazy, Lazy lazy2) {
        Object value;
        txc txc;
        this.b = pxc;
        this.c = ph1;
        this.o = lazy;
        this.v = lazy2;
        xme a = f6e.a((Object) null);
        this.w = new etc(a);
        this.x = new zjb(((chd) ((ahd) lazy2.getValue())).z, this, 4);
        do {
            value = a.getValue();
            txc txc2 = (txc) value;
            int ordinal = this.b.ordinal();
            if (ordinal != 0) {
                CharSequence charSequence = "";
                if (ordinal == 1) {
                    igf igf = new igf(sqa.s0);
                    igf igf2 = new igf(sqa.r0);
                    sxc sxc = new sxc((long) qqa.E0, new igf(sqa.p0), zpa.a);
                    sxc sxc2 = new sxc((long) qqa.F0, new igf(sqa.q0), zpa.b);
                    l21 l21 = ((k91) ((jj1) this.c).C0.a.getValue()).f;
                    CharSequence charSequence2 = l21 != null ? l21.b : null;
                    txc = new txc(igf, igf2, sxc, sxc2, new mgf(charSequence2 != null ? charSequence2 : charSequence), false);
                } else if (ordinal == 2) {
                    igf igf3 = new igf(sqa.o0);
                    long j = (long) qqa.x0;
                    igf igf4 = new igf(sqa.m0);
                    zpa zpa = zpa.b;
                    sxc sxc3 = new sxc(j, igf4, zpa);
                    sxc sxc4 = new sxc((long) qqa.w0, new igf(sqa.n0), zpa);
                    l21 l212 = ((k91) ((jj1) this.c).C0.a.getValue()).f;
                    CharSequence charSequence3 = l212 != null ? l212.b : null;
                    txc = new txc(igf3, (igf) null, sxc3, sxc4, new mgf(charSequence3 != null ? charSequence3 : charSequence), true);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                txc = null;
            }
        } while (!a.b(value, txc));
    }
}
