package defpackage;

import android.transition.Transition;
import androidx.fragment.app.a;
import java.util.HashSet;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.fragments.FrgAttachView;

/* renamed from: c5  reason: default package */
public final class c5 implements Transition.TransitionListener {
    public final /* synthetic */ a a;
    public final /* synthetic */ a89 b;
    public final /* synthetic */ ActAttachesView c;

    public c5(ActAttachesView actAttachesView, FrgAttachView frgAttachView, a89 a89) {
        this.c = actAttachesView;
        this.a = frgAttachView;
        this.b = a89;
    }

    public final void onTransitionCancel(Transition transition) {
        HashSet hashSet = ActAttachesView.e1;
        z68.a("ru.ok.messages.media.attaches.ActAttachesView", "onTransitionCancel");
    }

    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.c.K0.postDelayed(new ktg(this, (FrgAttachView) this.a, this.b, 2), 100);
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
    }
}
