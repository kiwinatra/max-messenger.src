package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;

/* renamed from: hi4  reason: default package */
public final class hi4 implements Animation.AnimationListener {
    public final /* synthetic */ qge a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ii4 d;

    public hi4(qge qge, ViewGroup viewGroup, View view, ii4 ii4) {
        this.a = qge;
        this.b = viewGroup;
        this.c = view;
        this.d = ii4;
    }

    public final void onAnimationEnd(Animation animation) {
        ViewGroup viewGroup = this.b;
        viewGroup.post(new ktg(viewGroup, this.c, this.d, 20));
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(this.a);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(this.a);
        }
    }
}
