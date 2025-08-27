package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: hpg  reason: default package */
public final class hpg extends ContextWrapper implements te3 {
    public final gpg a;
    public final /* synthetic */ ipg b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hpg(ipg ipg, Context context) {
        super(context);
        this.b = ipg;
        this.a = new gpg(ipg, ipg.a.getApplicationContext());
    }

    public final ve3 c() {
        return ((te3) this.b.a.getApplicationContext()).c();
    }

    public final Context getApplicationContext() {
        return this.a;
    }
}
