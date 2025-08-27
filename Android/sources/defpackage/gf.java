package defpackage;

import ru.ok.messages.views.widgets.AnimatedFab;

/* renamed from: gf  reason: default package */
public final class gf extends iq {
    public final /* synthetic */ int e;
    public final /* synthetic */ AnimatedFab f;

    public /* synthetic */ gf(AnimatedFab animatedFab, int i) {
        this.e = i;
        this.f = animatedFab;
    }

    public void Q() {
        switch (this.e) {
            case 1:
                this.f.setClickable(false);
                return;
            default:
                return;
        }
    }

    public void R() {
        switch (this.e) {
            case 0:
                this.f.setClickable(true);
                return;
            default:
                return;
        }
    }
}
