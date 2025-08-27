package defpackage;

import android.graphics.drawable.Drawable;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;

/* renamed from: poa  reason: default package */
public final class poa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ OneMeAvatarView b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ Runnable o;

    public /* synthetic */ poa(OneMeAvatarView oneMeAvatarView, Drawable drawable, Runnable runnable, int i) {
        this.a = i;
        this.b = oneMeAvatarView;
        this.c = drawable;
        this.o = runnable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                poa.super.unscheduleDrawable(this.c, this.o);
                return;
            default:
                poa.super.unscheduleDrawable(this.c, this.o);
                return;
        }
    }
}
