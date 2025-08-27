package defpackage;

/* renamed from: wpb  reason: default package */
public final /* synthetic */ class wpb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ to0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int o;

    public /* synthetic */ wpb(to0 to0, int i, int i2, int i3) {
        this.a = i3;
        this.b = to0;
        this.c = i;
        this.o = i2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ypb ypb = (ypb) this.b.x;
                if (ypb.J0(25) || ypb.J0(33)) {
                    boolean J0 = ypb.J0(33);
                    int i = this.c;
                    if (J0) {
                        ypb.F(i, this.o);
                        return;
                    } else {
                        ypb.u0(i);
                        return;
                    }
                } else {
                    return;
                }
            default:
                ypb ypb2 = (ypb) this.b.x;
                if (ypb2.J0(26) || ypb2.J0(34)) {
                    int i2 = this.c;
                    int i3 = this.o;
                    if (i2 != -100) {
                        if (i2 != -1) {
                            if (i2 != 1) {
                                if (i2 != 100) {
                                    if (i2 != 101) {
                                        i2a.m(i2, "onAdjustVolume: Ignoring unknown direction: ");
                                        return;
                                    } else if (ypb2.J0(34)) {
                                        ypb2.C(i3, !ypb2.Y0());
                                        return;
                                    } else {
                                        ypb2.e0(!ypb2.Y0());
                                        return;
                                    }
                                } else if (ypb2.J0(34)) {
                                    ypb2.C(i3, false);
                                    return;
                                } else {
                                    ypb2.e0(false);
                                    return;
                                }
                            } else if (ypb2.J0(34)) {
                                ypb2.H(i3);
                                return;
                            } else {
                                ypb2.p0();
                                return;
                            }
                        } else if (ypb2.J0(34)) {
                            ypb2.V(i3);
                            return;
                        } else {
                            ypb2.E();
                            return;
                        }
                    } else if (ypb2.J0(34)) {
                        ypb2.C(i3, true);
                        return;
                    } else {
                        ypb2.e0(true);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
