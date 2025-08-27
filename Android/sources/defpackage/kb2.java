package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: kb2  reason: default package */
public final class kb2 extends ne2 {
    public final void P(m29 m29, Function1 function1, Function2 function2) {
        j29 j29 = (j29) m29;
        ke2 ke2 = (ke2) this.a;
        M(j29);
        ct.G(ke2, 300, new ib2(function1, j29, 2));
        ke2.setOnLongClickListener(new jb2(function2, j29, this, 1));
    }

    /* renamed from: Q */
    public final void M(j29 j29) {
        ke2 ke2 = (ke2) this.a;
        ke2.setId((int) j29.a);
        ke2.setTitle(j29.v);
        CharSequence charSequence = j29.x;
        if (charSequence != null) {
            ke2.setLink(charSequence);
        }
        ke2.setSubtitle(j29.w);
        ke2.setLinkPhoto(j29.o);
    }
}
