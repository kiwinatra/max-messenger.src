package defpackage;

import android.widget.ImageView;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;

/* renamed from: lb2  reason: default package */
public final class lb2 extends p6c {
    public final void M(lz7 lz7) {
        hb2 hb2 = (hb2) this.a;
        xa2 xa2 = ((h3c) lz7).a;
        hb2.setLink(xa2.d);
        hb2.setLoading(xa2.e);
        String str = xa2.c;
        hb2.setChatTitle(str);
        gd0 gd0 = new gd0(str, xa2.b);
        int i = OneMeAvatarView.E0;
        OneMeAvatarView oneMeAvatarView = hb2.G0;
        boolean z = true;
        oneMeAvatarView.f(gd0, true);
        oneMeAvatarView.setAvatarUrl(xa2.a);
        int i2 = 0;
        if (!xa2.f || !xa2.g) {
            z = false;
        }
        ImageView imageView = hb2.J0;
        if (!z) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        hb2.L();
    }
}
