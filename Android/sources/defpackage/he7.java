package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import ru.ok.messages.calls.views.IncomingCallControlsView;

/* renamed from: he7  reason: default package */
public final class he7 extends AnimatorListenerAdapter {
    public boolean a = false;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ IncomingCallControlsView o;

    public he7(IncomingCallControlsView incomingCallControlsView, View view, View view2) {
        this.o = incomingCallControlsView;
        this.b = view;
        this.c = view2;
    }

    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.a) {
            int i = IncomingCallControlsView.D0;
            IncomingCallControlsView incomingCallControlsView = this.o;
            incomingCallControlsView.getClass();
            IncomingCallControlsView.d(this.c, 1800, (yy3) null);
            IncomingCallControlsView.d(this.b, 1900, (yy3) null);
            IncomingCallControlsView.d(incomingCallControlsView.w0, 2400, new yy3(2, incomingCallControlsView));
        }
    }
}
