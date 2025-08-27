package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.transformation.ExpandableBehavior;

/* renamed from: qd5  reason: default package */
public final class qd5 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ sd5 c;
    public final /* synthetic */ ExpandableBehavior o;

    public qd5(ExpandableBehavior expandableBehavior, View view, int i, sd5 sd5) {
        this.o = expandableBehavior;
        this.a = view;
        this.b = i;
        this.c = sd5;
    }

    public final boolean onPreDraw() {
        View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.o;
        if (expandableBehavior.a == this.b) {
            sd5 sd5 = this.c;
            expandableBehavior.w((View) sd5, view, ((jr5) sd5).A0.b, false);
        }
        return false;
    }
}
