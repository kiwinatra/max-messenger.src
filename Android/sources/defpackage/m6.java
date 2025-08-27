package defpackage;

import android.transition.Transition;
import one.me.chats.forward.ForwardPickerScreen;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.settings.folders.edit.presentation.FolderEditFragment;

/* renamed from: m6  reason: default package */
public final class m6 implements Transition.TransitionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(Transition transition) {
    }

    private final void b(Transition transition) {
    }

    private final void c(Transition transition) {
    }

    private final void d(Transition transition) {
    }

    private final void e(Transition transition) {
    }

    private final void f(Transition transition) {
    }

    private final void g(Transition transition) {
    }

    private final void h(Transition transition) {
    }

    private final void i(Transition transition) {
    }

    private final void j(Transition transition) {
    }

    private final void k(Transition transition) {
    }

    private final void l(Transition transition) {
    }

    private final void m(Transition transition) {
    }

    private final void n(Transition transition) {
    }

    private final void o(Transition transition) {
    }

    private final void p(Transition transition) {
    }

    public final void onTransitionCancel(Transition transition) {
        int i = this.a;
    }

    public final void onTransitionEnd(Transition transition) {
        switch (this.a) {
            case 0:
                transition.removeListener(this);
                ((ActLocalMedias) this.b).G0.postDelayed(new b(6, (Object) this), 100);
                return;
            case 1:
                FolderEditFragment folderEditFragment = (FolderEditFragment) this.b;
                folderEditFragment.E1.j(folderEditFragment.L1);
                folderEditFragment.M1.h(folderEditFragment.L1);
                return;
            case 2:
                ((ForwardPickerScreen) this.b).x0.invoke();
                return;
            default:
                ((pqc) this.b).w.invoke();
                return;
        }
    }

    public final void onTransitionPause(Transition transition) {
        int i = this.a;
    }

    public final void onTransitionResume(Transition transition) {
        int i = this.a;
    }

    public final void onTransitionStart(Transition transition) {
        int i = this.a;
    }
}
