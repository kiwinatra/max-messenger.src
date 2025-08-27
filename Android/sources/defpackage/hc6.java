package defpackage;

import android.view.View;
import androidx.fragment.app.a;

/* renamed from: hc6  reason: default package */
public final class hc6 extends ld8 {
    public final /* synthetic */ a v0;

    public hc6(a aVar) {
        this.v0 = aVar;
    }

    public final View h0(int i) {
        a aVar = this.v0;
        View view = aVar.S0;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException(g63.g(aVar, "Fragment ", " does not have a view"));
    }

    public final boolean i0() {
        return this.v0.S0 != null;
    }
}
