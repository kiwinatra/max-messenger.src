package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: q84  reason: default package */
public final class q84 extends jj0 {
    public final long k(int i) {
        return ((n84) E(i)).a;
    }

    public final void s(pzc pzc, int i) {
        ((p84) pzc).D0.setText(((n84) E(i)).v);
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(jjc.day_item, viewGroup, false);
        inflate.setPivotX(c44.DEFAULT_ASPECT_RATIO);
        return new p84(inflate);
    }
}
