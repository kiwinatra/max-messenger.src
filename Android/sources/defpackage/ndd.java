package defpackage;

import android.os.Bundle;
import java.util.Map;

/* renamed from: ndd  reason: default package */
public final class ndd {
    public final odd a;
    public final mdd b = new mdd();
    public boolean c;

    public ndd(odd odd) {
        this.a = odd;
    }

    public final void a() {
        odd odd = this.a;
        ju7 lifecycle = odd.getLifecycle();
        if (((lv7) lifecycle).d == iu7.b) {
            lifecycle.a(new qyc(0, odd));
            mdd mdd = this.b;
            if (!mdd.b) {
                lifecycle.a(new ob3(2, mdd));
                mdd.b = true;
                this.c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void b(Bundle bundle) {
        if (!this.c) {
            a();
        }
        lv7 lv7 = (lv7) this.a.getLifecycle();
        if (!lv7.d.a(iu7.o)) {
            mdd mdd = this.b;
            if (!mdd.b) {
                throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
            } else if (!mdd.d) {
                mdd.c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
                mdd.d = true;
            } else {
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
        } else {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + lv7.d).toString());
        }
    }

    public final void c(Bundle bundle) {
        mdd mdd = this.b;
        mdd.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = mdd.c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        xbd xbd = mdd.a;
        xbd.getClass();
        vbd vbd = new vbd(xbd);
        xbd.c.put(vbd, Boolean.FALSE);
        while (vbd.hasNext()) {
            Map.Entry entry = (Map.Entry) vbd.next();
            bundle2.putBundle((String) entry.getKey(), ((ldd) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
}
