package defpackage;

import android.content.Context;
import me.leolin.shortcutbadger.ShortcutBadger;

/* renamed from: ng0  reason: default package */
public final class ng0 implements s98 {
    public final Context a;
    public final qx2 b;
    public final ns2 c;
    public final jx3 o;

    public ng0(Context context, qx2 qx2, ns2 ns2, gaf gaf) {
        this.a = context;
        this.b = qx2;
        this.c = ns2;
        this.o = e14.a(((osa) gaf).a());
    }

    public final void a() {
        ShortcutBadger.removeCount(this.a);
    }
}
