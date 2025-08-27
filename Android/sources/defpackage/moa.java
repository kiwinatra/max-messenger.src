package defpackage;

import android.graphics.drawable.Drawable;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;

/* renamed from: moa  reason: default package */
public final class moa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ OneMeAvatarView b;
    public final /* synthetic */ Drawable c;

    public /* synthetic */ moa(OneMeAvatarView oneMeAvatarView, Drawable drawable, int i) {
        this.a = i;
        this.b = oneMeAvatarView;
        this.c = drawable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                moa.super.invalidateDrawable(this.c);
                return;
            default:
                moa.super.unscheduleDrawable(this.c);
                return;
        }
    }
}
