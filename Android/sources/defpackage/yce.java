package defpackage;

import android.os.Bundle;

/* renamed from: yce  reason: default package */
public abstract class yce implements oa4 {
    public final xce a;

    /* JADX WARNING: type inference failed for: r0v0, types: [wa4, xce] */
    public yce() {
        ? wa4 = new wa4();
        e(wa4);
        this.a = wa4;
    }

    public final wa4 a() {
        return this.a;
    }

    public final ab4 b(String str, ra4 ra4, Bundle bundle) {
        if (!this.a.a.contains(ra4)) {
            return null;
        }
        return new ab4(str, ra4, bundle, (za4) null, c(), d(bundle), 8);
    }

    public abstract xa4 c();

    public abstract ya4 d(Bundle bundle);

    public abstract void e(xce xce);
}
