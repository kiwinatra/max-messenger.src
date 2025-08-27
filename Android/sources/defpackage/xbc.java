package defpackage;

import android.os.SystemClock;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: xbc  reason: default package */
public final /* synthetic */ class xbc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ecc b;

    public /* synthetic */ xbc(ecc ecc, int i) {
        this.a = i;
        this.b = ecc;
    }

    public final void onClick(View view) {
        Object value;
        zs1 zs1;
        Object value2;
        Object obj;
        rbc rbc = rbc.a;
        hcc hcc = null;
        ecc ecc = this.b;
        switch (this.a) {
            case 0:
                wie wie = ecc.w;
                if (wie != null) {
                    int i = xt1.y0;
                    xt1 xt1 = (xt1) wie.b;
                    xt1.a(false, true);
                    wt1 listener = xt1.getListener();
                    if (listener != null) {
                        z5a.g(((MediaBarWidget) listener).o, jgd.CHAT_ATTACH_PICKER);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                hcc hcc2 = ecc.o;
                if (hcc2 != null) {
                    hcc = hcc2;
                }
                xme xme = hcc.X;
                do {
                    value = xme.getValue();
                    int ordinal = ((zs1) value).ordinal();
                    if (ordinal == 0) {
                        zs1 = zs1.b;
                    } else if (ordinal != 1) {
                        zs1 = zs1.a;
                        if (!(ordinal == 2 || ordinal == 3)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        zs1 = zs1.c;
                    }
                } while (!xme.b(value, zs1));
                return;
            case 2:
                hcc hcc3 = ecc.o;
                if (hcc3 == null) {
                    hcc3 = null;
                }
                hcc3.getClass();
                z68.c("QuickCameraViewModel", "onClickTake()", new Object[0]);
                xme xme2 = hcc3.z;
                sbc sbc = (sbc) xme2.getValue();
                boolean z = sbc instanceof obc;
                s85 s85 = hcc3.Y;
                if (z) {
                    xme2.m((Object) null, pbc.a);
                    xag.h(s85, hbc.a);
                    return;
                } else if (sbc instanceof pbc) {
                    return;
                } else {
                    if (sbc instanceof rbc) {
                        if (hcc3.v0.i()) {
                            xme2.m((Object) null, new qbc(SystemClock.elapsedRealtime()));
                            xag.h(s85, new fbc(((po5) hcc3.v).n(hcc3.w.a())));
                            return;
                        }
                        xag.h(hcc3.Z, ubc.a);
                        return;
                    } else if (sbc instanceof qbc) {
                        xme2.m((Object) null, rbc);
                        xag.h(s85, gbc.a);
                        return;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            case 3:
                ecc.getCameraApi().f(!ecc.getCameraApi().o());
                return;
            default:
                hcc hcc4 = ecc.o;
                if (hcc4 != null) {
                    hcc = hcc4;
                }
                xme xme3 = hcc.z;
                do {
                    value2 = xme3.getValue();
                    obj = (sbc) value2;
                    if (obj instanceof obc) {
                        obj = rbc;
                    } else if (obj instanceof rbc) {
                        obj = obc.a;
                    } else if (!(obj instanceof qbc) && !(obj instanceof pbc)) {
                        throw new NoWhenBranchMatchedException();
                    }
                } while (!xme3.b(value2, obj));
                return;
        }
    }
}
