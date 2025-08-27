package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* renamed from: ki4  reason: default package */
public final class ki4 extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ qge o;
    public final /* synthetic */ li4 v;

    public ki4(ViewGroup viewGroup, View view, boolean z, qge qge, li4 li4) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.o = qge;
        this.v = li4;
    }

    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        qge qge = this.o;
        if (z) {
            rae.a(qge.a, view, viewGroup);
        }
        li4 li4 = this.v;
        ((qge) li4.c.a).c(li4);
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(qge);
        }
    }
}
