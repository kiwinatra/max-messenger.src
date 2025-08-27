package defpackage;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandlesVM;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: jdd  reason: default package */
public final class jdd implements ldd {
    public final mdd a;
    public boolean b;
    public Bundle c;
    public final Lazy d;

    public jdd(mdd mdd, hbg hbg) {
        this.a = mdd;
        this.d = LazyKt.lazy(new ve(5, (Object) hbg));
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((SavedStateHandlesVM) this.d.getValue()).c.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a2 = ((hdd) entry.getValue()).e.a();
            if (!Intrinsics.areEqual((Object) a2, (Object) Bundle.EMPTY)) {
                bundle.putBundle(str, a2);
            }
        }
        this.b = false;
        return bundle;
    }

    public final void b() {
        if (!this.b) {
            Bundle a2 = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.c;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (a2 != null) {
                bundle.putAll(a2);
            }
            this.c = bundle;
            this.b = true;
            SavedStateHandlesVM savedStateHandlesVM = (SavedStateHandlesVM) this.d.getValue();
        }
    }
}
