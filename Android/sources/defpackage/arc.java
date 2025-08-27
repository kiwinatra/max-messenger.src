package defpackage;

import android.transition.Transition;
import android.view.View;

/* renamed from: arc  reason: default package */
public final class arc implements Transition.TransitionListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ ry4 b;
    public final /* synthetic */ float c;

    public arc(View view, ry4 ry4, float f) {
        this.a = view;
        this.b = ry4;
        this.c = f;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
        View view = this.a;
        ry4 ry4 = this.b;
        float f = this.c;
        ohe ohe = new ohe((Object) view, (q8) ry4, f);
        ohe.a = c44.DEFAULT_ASPECT_RATIO;
        phe phe = new phe(f);
        phe.b(400.0f);
        phe.a(0.68f);
        ohe.m = phe;
        ohe.g();
    }
}
