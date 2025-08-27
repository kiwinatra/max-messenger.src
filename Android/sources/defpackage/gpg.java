package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: gpg  reason: default package */
public final class gpg extends ContextWrapper implements te3 {
    public final /* synthetic */ ipg a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gpg(ipg ipg, Context context) {
        super(context);
        this.a = ipg;
    }

    public final ve3 c() {
        return ((te3) this.a.a.getApplicationContext()).c();
    }

    public final boolean isDeviceProtectedStorage() {
        return false;
    }
}
