package defpackage;

import android.view.View;
import java.util.Set;

/* renamed from: c4a  reason: default package */
public final /* synthetic */ class c4a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4a b;

    public /* synthetic */ c4a(e4a e4a, int i) {
        this.a = i;
        this.b = e4a;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                for (f3a N : (Set) this.b.a) {
                    N.N(new zj0(4));
                }
                return;
            default:
                for (f3a N2 : (Set) this.b.a) {
                    N2.N(new zj0(3));
                }
                return;
        }
    }
}
