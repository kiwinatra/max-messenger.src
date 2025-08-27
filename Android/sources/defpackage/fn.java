package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: fn  reason: default package */
public final class fn implements ldd {
    public final /* synthetic */ int a;
    public final Object b;

    public fn(mdd mdd) {
        this.a = 1;
        this.b = new LinkedHashSet();
        mdd.c("androidx.savedstate.Restarter", this);
    }

    public final Bundle a() {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                ((hn) this.b).A().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList((LinkedHashSet) this.b));
                return bundle2;
        }
    }

    public fn(hn hnVar) {
        this.a = 0;
        this.b = hnVar;
    }
}
