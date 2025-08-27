package defpackage;

import android.os.Bundle;

/* renamed from: i3  reason: default package */
public abstract class i3 extends fbg implements dbg {
    public final mdd a;
    public final ju7 b;
    public final Bundle c;

    public i3(odd odd, Bundle bundle) {
        this.a = odd.getSavedStateRegistry();
        this.b = odd.getLifecycle();
        this.c = bundle;
    }

    public final yag a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            ju7 ju7 = this.b;
            if (ju7 != null) {
                Bundle bundle = this.c;
                mdd mdd = this.a;
                Bundle a2 = mdd.a(canonicalName);
                Class[] clsArr = hdd.f;
                hdd i = hi7.i(a2, bundle);
                idd idd = new idd(canonicalName, i);
                idd.a(mdd, ju7);
                b59.f0(mdd, ju7);
                yag e = e(i);
                e.f("androidx.lifecycle.savedstate.vm.tag", idd);
                return e;
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final yag b(Class cls, zy9 zy9) {
        String str = (String) zy9.a.get(u9a.y);
        if (str != null) {
            mdd mdd = this.a;
            if (mdd == null) {
                return e(b59.q(zy9));
            }
            idd m = b59.m(mdd, this.b, str, this.c);
            yag e = e(m.b);
            e.f("androidx.lifecycle.savedstate.vm.tag", m);
            return e;
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    public final void d(yag yag) {
        mdd mdd = this.a;
        if (mdd != null) {
            b59.f(yag, mdd, this.b);
        }
    }

    public abstract yag e(hdd hdd);
}
