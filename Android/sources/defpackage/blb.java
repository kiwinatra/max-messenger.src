package defpackage;

import kotlin.Lazy;

/* renamed from: blb  reason: default package */
public final class blb extends xag {
    public final etc X;
    public final etc Y;
    public final s85 Z;
    public final alb b;
    public final zlb c;
    public final rvf o;
    public final j50 v;
    public final etc w;
    public final ome x;
    public final dtc y;
    public final bpb z;

    public blb(gaf gaf, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7, dy9 dy9, Lazy lazy8, alb alb) {
        zlb zlb;
        ome a;
        xme a2;
        dy9 dy92 = dy9;
        alb alb2 = alb;
        this.b = alb2;
        ome ome = alb2.b;
        if (ome == null) {
            zlb = null;
        } else {
            fq2 fq2 = (fq2) lazy.getValue();
            zlb = new zlb(ome, gaf, lazy2, (ur2) lazy3.getValue(), lazy8, this.a);
        }
        this.c = zlb;
        ome ome2 = alb2.b;
        rvf rvf = ome2 != null ? new rvf(ome2, this.a, (eu3) lazy4.getValue(), gaf, lazy7, lazy5, lazy6, lazy8) : null;
        this.o = rvf;
        j50 j50 = new j50(dy92, this.a, lazy7);
        this.v = j50;
        this.w = new etc((zlb == null || (a2 = zlb.h) == null) ? f6e.a((Object) null) : a2);
        this.x = (rvf == null || (a = rvf.i) == null) ? f6e.a((Object) null) : a;
        this.y = (dtc) j50.v;
        bpb bpb = new bpb(gaf, (u50) zkb.a.getAccessor().g(u50.class), dy92, this.a);
        this.z = bpb;
        this.X = new etc(bpb.d);
        this.Y = bpb.e;
        this.Z = new s85(0);
    }
}
