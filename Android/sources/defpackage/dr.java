package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: dr  reason: default package */
public final class dr extends kbe {
    /* renamed from: P */
    public final void M(ar arVar) {
        int i;
        int ordinal = arVar.a.ordinal();
        if (ordinal == 0) {
            i = nna.i;
        } else if (ordinal == 1) {
            i = nna.e;
        } else if (ordinal == 2) {
            i = nna.b;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        View view = this.a;
        br brVar = (br) view;
        brVar.setTitle(q8.p(i, brVar.getContext()));
        br brVar2 = (br) view;
        Boolean bool = arVar.b;
        brVar2.setSelected(bool != null ? bool.booleanValue() : false);
    }
}
