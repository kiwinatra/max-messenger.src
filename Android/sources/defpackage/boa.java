package defpackage;

import java.util.Collections;
import java.util.Set;
import one.me.android.OneMeApplication;

/* renamed from: boa  reason: default package */
public final class boa implements xi {
    public final /* synthetic */ OneMeApplication b;

    public boa(OneMeApplication oneMeApplication) {
        this.b = oneMeApplication;
    }

    public final int a() {
        return this.b.getApplicationContext().getResources().getDimensionPixelSize(mad.d);
    }

    public final int b() {
        fn4 fn4 = (fn4) h2g.a.getAccessor().g(fn4.class);
        ej ejVar = (ej) fn4.e.getValue();
        int ordinal = fn4.b().ordinal();
        if (ordinal == 0) {
            ejVar.getClass();
            return 5;
        } else if (ordinal == 1) {
            ejVar.getClass();
            return 10;
        } else if (ordinal == 2) {
            ejVar.getClass();
            return 15;
        } else {
            throw new IncompatibleClassChangeError();
        }
    }

    public final Set c() {
        ktb.a.c().getClass();
        return Collections.emptySet();
    }
}
