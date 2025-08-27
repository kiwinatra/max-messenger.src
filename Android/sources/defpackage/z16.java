package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z16  reason: default package */
public final class z16 extends j3h implements r46 {
    public static final z16 b = new j3h(8);

    public final void n1() {
        W0().d();
    }

    public final void o1(az5 az5) {
        if (Intrinsics.areEqual((Object) az5, (Object) xy5.a)) {
            W0().b(":settings/folder/create", (Bundle) null);
        } else if (az5 instanceof yy5) {
            W0().b(":settings/folder/edit", o54.f(TuplesKt.to("edit.page.target", az5)));
        } else if (az5 instanceof zy5) {
            ta4 W0 = W0();
            W0.b(":settings/folder/edit?id=" + ((zy5) az5).a, (Bundle) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void p1(z26 z26) {
        String str = z26.a;
        ta4 W0 = W0();
        W0.b(":settings/folder/edit?id=" + str, (Bundle) null);
    }
}
