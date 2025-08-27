package defpackage;

import one.me.sdk.uikit.common.avatar.OneMeAvatarView;

/* renamed from: w72  reason: default package */
public final class w72 extends kbe {
    /* renamed from: P */
    public final void M(x72 x72) {
        u72 u72 = (u72) this.a;
        u72.setTitle(x72.a);
        u72.setSubtitle(x72.b);
        OneMeAvatarView oneMeAvatarView = u72.a;
        oneMeAvatarView.setAvatarUrl(x72.c);
        CharSequence charSequence = x72.o;
        if (charSequence == null) {
            charSequence = "";
        }
        oneMeAvatarView.f(new gd0(charSequence, x72.v), true);
        u72.setDescriptions(x72.w);
    }
}
