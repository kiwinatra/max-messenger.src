package defpackage;

/* renamed from: cfb  reason: default package */
public final class cfb {
    public final hfb a;
    public final j05 b;
    public final bfb c;
    public final zc4 d;
    public ffb e;

    public cfb(hfb hfb, j05 j05, bfb bfb, zc4 zc4, h05 h05, boolean z, boolean z2, boolean z3) {
        hfb hfb2 = hfb;
        j05 j052 = j05;
        zc4 zc42 = zc4;
        this.a = hfb2;
        this.b = j052;
        j052.b = this;
        this.c = bfb;
        hfb2.a.add(this);
        this.d = zc42;
        ffb ffb = new ffb(false, false, false, z, z2, false, z3);
        this.e = ffb;
        hfb.a(ffb);
        zc42.a(j05, h05, true);
        if (z && z2) {
            j052.a.setDrawStickerEnabled(true);
            zc42.a(j05, j05.a(), false);
        }
    }
}
