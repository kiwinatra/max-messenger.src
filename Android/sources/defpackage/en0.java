package defpackage;

import android.content.Context;
import android.net.Uri;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.jvm.functions.Function1;

/* renamed from: en0  reason: default package */
public final class en0 extends kbe {
    public final /* synthetic */ int D0 = 1;
    public final Function1 E0;

    public en0(Context context, s56 s56) {
        super(new dn0(context));
        this.E0 = s56;
    }

    public final void M(lz7 lz7) {
        qa7 qa7;
        qa7 qa72;
        switch (this.D0) {
            case 0:
                y56 y56 = (y56) lz7;
                dn0 dn0 = (dn0) this.a;
                dn0.c.setText(y56.b);
                dn0.o.setText(y56.o);
                dn0.setBackgroundColor(y56.c);
                String str = y56.v;
                if (str != null) {
                    ra7 d = ra7.d(Uri.parse(str));
                    d.d = dn0.b;
                    qa7 = d.a();
                } else {
                    qa7 = null;
                }
                SimpleDraweeView simpleDraweeView = dn0.v;
                if (qa7 != null) {
                    ba7 B = ld9.B();
                    B.getClass();
                    aa7 aa7 = new aa7(B, qa7, dn0);
                    w4d w4d = dn0.a;
                    w4d.a(aa7);
                    if (simpleDraweeView.getController() == null) {
                        knb a = ld9.p.get();
                        a.g = w4d;
                        a.k = true;
                        simpleDraweeView.setController(a.a());
                    }
                    simpleDraweeView.setVisibility(0);
                } else {
                    simpleDraweeView.setController((gv4) null);
                    simpleDraweeView.setVisibility(8);
                }
                ct.G(dn0, 300, new pb(2, this, y56));
                return;
            default:
                y56 y562 = (y56) lz7;
                z56 z56 = (z56) this.a;
                z56.c.setText(y562.b);
                z56.o.setText(y562.o);
                z56.setBackgroundColor(y562.c);
                String str2 = y562.v;
                if (str2 != null) {
                    ra7 d2 = ra7.d(Uri.parse(str2));
                    d2.d = z56.b;
                    qa72 = d2.a();
                } else {
                    qa72 = null;
                }
                SimpleDraweeView simpleDraweeView2 = z56.v;
                if (qa72 != null) {
                    ba7 B2 = ld9.B();
                    B2.getClass();
                    aa7 aa72 = new aa7(B2, qa72, z56);
                    w4d w4d2 = z56.a;
                    w4d2.a(aa72);
                    if (simpleDraweeView2.getController() == null) {
                        knb a2 = ld9.p.get();
                        a2.g = w4d2;
                        a2.k = true;
                        simpleDraweeView2.setController(a2.a());
                    }
                    simpleDraweeView2.setVisibility(0);
                } else {
                    simpleDraweeView2.setController((gv4) null);
                    simpleDraweeView2.setVisibility(8);
                }
                ct.G(z56, 300, new h24(7, (Object) this, (Object) y562));
                return;
        }
    }

    public en0(Context context, Function1 function1) {
        super(new z56(context));
        this.E0 = function1;
    }
}
