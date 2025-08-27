package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* renamed from: ig8  reason: default package */
public final class ig8 implements OnBackAnimationCallback {
    public final /* synthetic */ gg8 a;
    public final /* synthetic */ jg8 b;

    public ig8(jg8 jg8, gg8 gg8) {
        this.b = jg8;
        this.a = gg8;
    }

    public final void onBackCancelled() {
        if (this.b.a != null) {
            this.a.d();
        }
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.b(new we0(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.c(new we0(backEvent));
        }
    }
}
