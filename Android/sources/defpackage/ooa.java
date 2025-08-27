package defpackage;

import android.graphics.drawable.Drawable;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;

/* renamed from: ooa  reason: default package */
public final class ooa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ OneMeAvatarView b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ Runnable o;
    public final /* synthetic */ long v;

    public /* synthetic */ ooa(OneMeAvatarView oneMeAvatarView, Drawable drawable, Runnable runnable, long j, int i) {
        this.a = i;
        this.b = oneMeAvatarView;
        this.c = drawable;
        this.o = runnable;
        this.v = j;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ooa.super.scheduleDrawable(this.c, this.o, this.v);
                return;
            default:
                ooa.super.scheduleDrawable(this.c, this.o, this.v);
                return;
        }
    }
}
