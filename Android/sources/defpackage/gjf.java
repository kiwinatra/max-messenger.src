package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: gjf  reason: default package */
public final class gjf extends jj0 {
    public gjf() {
        super((j4b) w63.M);
        C(true);
    }

    public final long k(int i) {
        return (long) ((ejf) E(i)).a;
    }

    public final void s(pzc pzc, int i) {
        ((fjf) pzc).D0.setText(((ejf) E(i)).b);
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        return new fjf(LayoutInflater.from(viewGroup.getContext()).inflate(jjc.number_item, viewGroup, false));
    }
}
