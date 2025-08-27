package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import ru.ok.messages.calls.views.IncomingCallControlsView;

/* renamed from: ge7  reason: default package */
public final class ge7 extends AnimatorListenerAdapter {
    public boolean a = false;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ IncomingCallControlsView o;

    public ge7(IncomingCallControlsView incomingCallControlsView, int i, View view) {
        this.o = incomingCallControlsView;
        this.b = i;
        this.c = view;
    }

    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.a) {
            IncomingCallControlsView incomingCallControlsView = this.o;
            int i = this.b;
            View view = i <= 0 ? incomingCallControlsView.o : this.c;
            int i2 = IncomingCallControlsView.D0;
            incomingCallControlsView.j(view, i - 1, 825);
        }
    }
}
