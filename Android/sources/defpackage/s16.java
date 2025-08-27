package defpackage;

import android.view.View;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;

/* renamed from: s16  reason: default package */
public final class s16 extends kbe {
    public final void O() {
        ((uy1) this.a).setOnTrailClick((View.OnClickListener) null);
    }

    /* renamed from: P */
    public final void M(m16 m16) {
        uy1 uy1 = (uy1) this.a;
        uy1.setTitle(m16.c);
        String str = m16.b;
        OneMeAvatarView oneMeAvatarView = uy1.a;
        oneMeAvatarView.setAvatarUrl(str);
        CharSequence charSequence = m16.v;
        if (charSequence == null) {
            charSequence = "";
        }
        oneMeAvatarView.f(new gd0(charSequence, m16.o), true);
        uy1.requestLayout();
        uy1.invalidate();
        uy1.setVerified(m16.w);
    }
}
