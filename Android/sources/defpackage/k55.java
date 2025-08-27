package defpackage;

/* renamed from: k55  reason: default package */
public final class k55 extends hl4 {
    public final /* synthetic */ int c = 2;
    public final qx0 d;
    public final Object e;
    public final boolean f;

    public k55(zi0 zi0, io0 io0, zqd zqd, boolean z) {
        super(zi0);
        this.d = io0;
        this.e = zqd;
        this.f = z;
    }

    public final void h(int i, Object obj) {
        y33 o;
        y33 j;
        j55 j55;
        y33 y33;
        y33 y332;
        switch (this.c) {
            case 0:
                j55 j552 = (j55) obj;
                try {
                    tf6.P();
                    boolean b = zi0.b(i);
                    zi0 zi0 = this.b;
                    if (!b && j552 != null) {
                        if (!((i & 10) != 0)) {
                            j552.m0();
                            if (j552.c != h97.c) {
                                o = y33.o(j552.a);
                                if (o != null) {
                                    j = this.f ? ((z59) this.e).j(this.d, o) : null;
                                    y33.U(o);
                                    if (j != null) {
                                        j55 = new j55(j);
                                        j55.d(j552);
                                        y33.U(j);
                                        zi0.i(1.0f);
                                        zi0.g(i, j55);
                                        j55.b(j55);
                                        tf6.P();
                                        return;
                                    }
                                }
                                zi0.g(i, j552);
                                tf6.P();
                                return;
                            }
                        }
                    }
                    zi0.g(i, j552);
                    tf6.P();
                    return;
                } catch (Throwable th) {
                    tf6.P();
                    throw th;
                }
            case 1:
                y33 y333 = (y33) obj;
                y33 y334 = null;
                zi0 zi02 = this.b;
                if (y333 == null) {
                    if (zi0.a(i)) {
                        zi02.g(i, y334);
                        return;
                    }
                    return;
                } else if (!zi0.b(i)) {
                    if (this.f) {
                        y334 = ((z59) this.e).j(this.d, y333);
                    }
                    try {
                        zi02.i(1.0f);
                        if (y334 != null) {
                            y333 = y334;
                        }
                        zi02.g(i, y333);
                        return;
                    } finally {
                        y33.U(y334);
                    }
                } else {
                    return;
                }
            default:
                y33 y335 = (y33) obj;
                try {
                    if (tf6.X()) {
                        tf6.e("BitmapMemoryCacheProducer#onNewResultImpl");
                    }
                    boolean a = zi0.a(i);
                    y33 = null;
                    zi0 zi03 = this.b;
                    if (y335 == null) {
                        if (a) {
                            zi03.g(i, (Object) null);
                        }
                        if (!tf6.X()) {
                            return;
                        }
                    } else if (((v33) y335.e0()).isStateful() || zi0.l(i, 8)) {
                        zi03.g(i, y335);
                        if (!tf6.X()) {
                            return;
                        }
                    } else {
                        qx0 qx0 = this.d;
                        ko0 ko0 = (ko0) this.e;
                        if (!a) {
                            y332 = ko0.b.get(qx0);
                            if (y332 != null) {
                                tac qualityInfo = ((v33) y335.e0()).getQualityInfo();
                                tac qualityInfo2 = ((v33) y332.e0()).getQualityInfo();
                                if (((bc7) qualityInfo2).c || ((bc7) qualityInfo2).a >= ((bc7) qualityInfo).a) {
                                    zi03.g(i, y332);
                                    y33.U(y332);
                                    if (!tf6.X()) {
                                        return;
                                    }
                                } else {
                                    y33.U(y332);
                                }
                            }
                        }
                        if (this.f) {
                            y33 = ko0.b.j(qx0, y335);
                        }
                        if (a) {
                            zi03.i(1.0f);
                        }
                        if (y33 != null) {
                            y335 = y33;
                        }
                        zi03.g(i, y335);
                        y33.U(y33);
                        if (!tf6.X()) {
                            return;
                        }
                    }
                    tf6.C();
                    return;
                } catch (Throwable th2) {
                    if (tf6.X()) {
                        tf6.C();
                    }
                    throw th2;
                }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k55(ko0 ko0, zi0 zi0, io0 io0, boolean z) {
        super(zi0);
        this.e = ko0;
        this.d = io0;
        this.f = z;
    }

    public k55(zi0 zi0, zqd zqd, uae uae, boolean z) {
        super(zi0);
        this.e = zqd;
        this.d = uae;
        this.f = z;
    }
}
