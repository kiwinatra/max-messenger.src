package defpackage;

import android.widget.FrameLayout;

/* renamed from: ud1  reason: default package */
public final class ud1 extends kbe {
    public final dn1 D0;
    public final gn1 E0;

    public ud1(FrameLayout frameLayout, dn1 dn1) {
        super(frameLayout);
        this.D0 = dn1;
        this.E0 = (gn1) frameLayout.findViewById(kgc.call_opponent);
    }

    public final void M(lz7 lz7) {
        la1 la1 = (la1) lz7;
        CharSequence charSequence = la1.c;
        String str = la1.o;
        gn1 gn1 = this.E0;
        gn1.T(charSequence, str);
        gn1.Q(la1.x);
        gn1.R(la1.w);
        gn1.setAvatar(la1.v);
        gn1.setOpponentVideo(la1.v0);
        gn1.setButtonAction(la1.w0);
        gn1.e1 = la1.a;
        gn1.Z0 = this.D0;
        gn1.setNetworkState(la1.x0);
    }
}
