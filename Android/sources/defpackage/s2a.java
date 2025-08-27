package defpackage;

import android.content.Context;
import android.view.View;
import ru.ok.messages.video.widgets.doubleTap.DoubleTapVideoViewWrapper;

/* renamed from: s2a  reason: default package */
public final class s2a extends q2 implements or4 {
    public final ch o;
    public jr4 v;
    public jr4 w;

    public s2a(Context context, DoubleTapVideoViewWrapper doubleTapVideoViewWrapper, ch chVar) {
        super(context);
        this.o = chVar;
        J(doubleTapVideoViewWrapper);
        doubleTapVideoViewWrapper.setTouchEventListener(this);
    }

    public final void M() {
        this.v = (jr4) ((View) this.c).findViewById(lic.double_tap_video_view_wrapper__arrows_view_left);
        this.w = (jr4) ((View) this.c).findViewById(lic.double_tap_video_view_wrapper__arrows_view_right);
        jr4 jr4 = this.v;
        ch chVar = this.o;
        jr4.setAnimations(chVar);
        this.w.setAnimations(chVar);
    }

    public final void Z(r2a r2a) {
        if (!r2a.c) {
            this.v.a();
            this.w.a();
            return;
        }
        boolean z = r2a.b;
        int i = r2a.a;
        if (z) {
            this.v.a();
            this.w.b();
            this.w.c(i);
            return;
        }
        this.v.b();
        this.v.c(i);
        this.w.a();
    }
}
