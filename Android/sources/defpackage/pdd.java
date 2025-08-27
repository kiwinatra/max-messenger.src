package defpackage;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.AndroidViewModel;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* renamed from: pdd  reason: default package */
public final class pdd extends fbg implements dbg {
    public final Application a;
    public final cbg b;
    public final Bundle c;
    public final ju7 d;
    public final mdd e;

    public pdd(Application application, odd odd, Bundle bundle) {
        cbg cbg;
        this.e = odd.getSavedStateRegistry();
        this.d = odd.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (cbg.c == null) {
                cbg.c = new cbg(application);
            }
            cbg = cbg.c;
        } else {
            cbg = new cbg((Application) null);
        }
        this.b = cbg;
    }

    public final yag a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return e(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final yag b(Class cls, zy9 zy9) {
        u9a u9a = u9a.y;
        LinkedHashMap linkedHashMap = zy9.a;
        String str = (String) linkedHashMap.get(u9a);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (linkedHashMap.get(b59.o) != null && linkedHashMap.get(b59.p) != null) {
            Application application = (Application) linkedHashMap.get(cbg.d);
            boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
            Constructor a2 = (!isAssignableFrom || application == null) ? qdd.a(cls, qdd.b) : qdd.a(cls, qdd.a);
            return a2 == null ? this.b.b(cls, zy9) : (!isAssignableFrom || application == null) ? qdd.b(cls, a2, b59.q(zy9)) : qdd.b(cls, a2, application, b59.q(zy9));
        } else if (this.d != null) {
            return e(cls, str);
        } else {
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
    }

    public final void d(yag yag) {
        ju7 ju7 = this.d;
        if (ju7 != null) {
            b59.f(yag, this.e, ju7);
        }
    }

    /* JADX WARNING: type inference failed for: r7v12, types: [java.lang.Object, ebg] */
    public final yag e(Class cls, String str) {
        ju7 ju7 = this.d;
        if (ju7 != null) {
            boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
            Application application = this.a;
            Constructor a2 = (!isAssignableFrom || application == null) ? qdd.a(cls, qdd.b) : qdd.a(cls, qdd.a);
            if (a2 != null) {
                mdd mdd = this.e;
                Bundle bundle = this.c;
                Bundle a3 = mdd.a(str);
                Class[] clsArr = hdd.f;
                hdd i = hi7.i(a3, bundle);
                idd idd = new idd(str, i);
                idd.a(mdd, ju7);
                b59.f0(mdd, ju7);
                yag b2 = (!isAssignableFrom || application == null) ? qdd.b(cls, a2, i) : qdd.b(cls, a2, application, i);
                b2.f("androidx.lifecycle.savedstate.vm.tag", idd);
                return b2;
            } else if (application != null) {
                return this.b.a(cls);
            } else {
                if (ebg.a == null) {
                    ebg.a = new Object();
                }
                return ebg.a.a(cls);
            }
        } else {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }
}
