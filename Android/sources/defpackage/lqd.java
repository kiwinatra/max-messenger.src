package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.jvm.functions.Function1;

/* renamed from: lqd  reason: default package */
public final class lqd extends jj0 {
    public final x15 v;
    public final Function1 w;

    public lqd(x15 x15, f fVar) {
        super((j4b) new w63(18));
        this.v = x15;
        this.w = fVar;
    }

    public final void s(pzc pzc, int i) {
        kqd kqd = (kqd) pzc;
        iqd iqd = (iqd) E(i);
        n79.d(kqd.F0, iqd.b, kqd.D0);
        int i2 = iqd.c ? 0 : 8;
        ImageView imageView = kqd.G0;
        imageView.setVisibility(i2);
        ct.G(imageView, 300, new jqd(iqd, kqd, 0));
        ct.G(kqd.a, 300, new jqd(iqd, kqd, 1));
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        return new kqd(LayoutInflater.from(viewGroup.getContext()).inflate(ujc.row_selected_contact, viewGroup, false), this.v, (f) this.w);
    }
}
