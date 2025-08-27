package defpackage;

import android.content.Context;

/* renamed from: ud4  reason: default package */
public final class ud4 implements g74 {
    public final Context a;
    public final g74 b;

    public ud4(Context context) {
        this(context, new xf4());
    }

    public final j74 a() {
        return new wd4(this.a, this.b.a());
    }

    public ud4(Context context, g74 g74) {
        this.a = context.getApplicationContext();
        this.b = g74;
    }
}
