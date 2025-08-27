package defpackage;

import android.content.Context;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.jvm.internal.StringCompanionObject;

/* renamed from: oo3  reason: default package */
public final class oo3 {
    public final Lazy a;

    public oo3(Lazy lazy) {
        this.a = lazy;
    }

    public final void a(Context context) {
        String str = hsg.n;
        akd akd = (akd) ((bud) this.a.getValue());
        String string = akd.g.getString("invite-long", (String) null);
        if (string == null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            string = String.format(context.getString(jad.F), Arrays.copyOf(new Object[]{akd.p()}, 1));
        }
        hsg.G(context, string);
    }
}
