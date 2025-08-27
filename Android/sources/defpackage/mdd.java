package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: mdd  reason: default package */
public final class mdd {
    public final xbd a = new xbd();
    public boolean b;
    public Bundle c;
    public boolean d;
    public fn e;
    public boolean f = true;

    public final Bundle a(String str) {
        if (this.d) {
            Bundle bundle = this.c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = this.c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.c;
            if (bundle4 == null || bundle4.isEmpty()) {
                this.c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final ldd b() {
        Map.Entry entry;
        ldd ldd;
        Iterator it = this.a.iterator();
        do {
            tbd tbd = (tbd) it;
            if (!tbd.hasNext()) {
                return null;
            }
            entry = (Map.Entry) tbd.next();
            ldd = (ldd) entry.getValue();
        } while (!Intrinsics.areEqual((Object) (String) entry.getKey(), (Object) "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return ldd;
    }

    public final void c(String str, ldd ldd) {
        if (((ldd) this.a.d(str, ldd)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void d() {
        Class<qt7> cls = qt7.class;
        if (this.f) {
            fn fnVar = this.e;
            if (fnVar == null) {
                fnVar = new fn(this);
            }
            this.e = fnVar;
            try {
                cls.getDeclaredConstructor((Class[]) null);
                fn fnVar2 = this.e;
                if (fnVar2 != null) {
                    ((LinkedHashSet) fnVar2.b).add(cls.getName());
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
    }
}
