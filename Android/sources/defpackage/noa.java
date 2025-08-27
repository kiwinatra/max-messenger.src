package defpackage;

import android.graphics.drawable.Drawable;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;

/* renamed from: noa  reason: default package */
public final class noa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ OneMeAvatarView b;
    public final /* synthetic */ Drawable c;

    public /* synthetic */ noa(OneMeAvatarView oneMeAvatarView, Drawable drawable, int i) {
        this.a = i;
        this.b = oneMeAvatarView;
        this.c = drawable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                noa.super.invalidateDrawable(this.c);
                return;
            default:
                noa.super.unscheduleDrawable(this.c);
                return;
        }
    }
}
