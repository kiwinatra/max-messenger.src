package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* renamed from: gq5  reason: default package */
public abstract class gq5 extends q7b {
    public final c c;
    public xe0 d = null;
    public final tb8 e = new tb8(10);
    public final boolean f;
    public final HashMap g;
    public a h;

    public gq5(ed6 ed6) {
        new rt6(25);
        this.g = new HashMap();
        this.h = null;
        this.c = ed6;
        this.f = false;
    }

    public void a(ViewGroup viewGroup, int i, Object obj) {
        String str;
        a aVar = (a) obj;
        xe0 xe0 = this.d;
        c cVar = this.c;
        if (xe0 == null) {
            cVar.getClass();
            this.d = new xe0(cVar);
        }
        HashMap hashMap = this.g;
        Iterator it = hashMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            str = (String) it.next();
            if (aVar.equals((a) hashMap.get(str))) {
                break;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            boolean a2 = aVar.a2();
            tb8 tb8 = this.e;
            if (!a2) {
                tb8.e(str);
            } else {
                tb8.d(str, new fq5(str, cVar.c0(aVar)));
            }
            hashMap.remove(str);
        }
        this.d.j(aVar);
    }

    public final void b() {
        xe0 xe0 = this.d;
        if (xe0 != null) {
            xe0.g();
            this.d = null;
        }
    }

    public final a f(ViewGroup viewGroup, int i) {
        Bundle bundle;
        String n = n(i);
        HashMap hashMap = this.g;
        a aVar = (a) hashMap.get(n);
        if (aVar != null) {
            z68.c("gq5", "CHECK instantiateItem use from cache f %s", aVar);
            return aVar;
        }
        if (this.d == null) {
            c cVar = this.c;
            cVar.getClass();
            this.d = new xe0(cVar);
        }
        String n2 = n(i);
        a m = m(i);
        fq5 fq5 = (fq5) this.e.c(n2);
        if (fq5 != null) {
            z68.c("gq5", "CHECK instantiateItem use ImplSavedState for %d fe %s", Integer.valueOf(i), m);
            if (m.D0 == null) {
                mc6 mc6 = fq5.b;
                if (mc6 == null || (bundle = mc6.a) == null) {
                    bundle = null;
                }
                m.b = bundle;
            } else {
                throw new IllegalStateException("Fragment already added");
            }
        } else {
            z68.c("gq5", "CHECK instantiateItem fr %s", m);
        }
        m.N2(false);
        m.Q2(false);
        hashMap.put(n2, m);
        this.d.h(viewGroup.getId(), m, (String) null, 1);
        return m;
    }

    public final boolean g(View view, Object obj) {
        return ((a) obj).W1() == view;
    }

    public final void i(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.g.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    fq5 fq5 = (fq5) parcelable2;
                    this.e.d(fq5.a, fq5);
                }
            }
            o(bundle);
        }
    }

    public final Parcelable j() {
        Bundle bundle;
        if (this.f || this.e.g() <= 0) {
            bundle = null;
        } else {
            tb8 tb8 = this.e;
            tb8.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            synchronized (tb8.c) {
                try {
                    for (Map.Entry entry : ((LinkedHashMap) tb8.b.b).entrySet()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (String remove : this.g.keySet()) {
                linkedHashMap.remove(remove);
            }
            fq5[] fq5Arr = new fq5[linkedHashMap.size()];
            linkedHashMap.values().toArray(fq5Arr);
            bundle = new Bundle();
            bundle.putParcelableArray("states", fq5Arr);
        }
        for (String str : this.g.keySet()) {
            a aVar = (a) this.g.get(str);
            if (aVar != null && aVar.a2()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                c cVar = this.c;
                cVar.X(bundle, "f" + str, aVar);
            }
        }
        return bundle;
    }

    public final void k(Object obj) {
        a aVar = (a) obj;
        a aVar2 = this.h;
        if (aVar != aVar2) {
            if (aVar2 != null) {
                aVar2.N2(false);
                this.h.Q2(false);
            }
            if (aVar != null) {
                aVar.N2(true);
                aVar.Q2(true);
            }
            this.h = aVar;
        }
    }

    public final void l(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    public abstract a m(int i);

    public abstract String n(int i);

    public void o(Bundle bundle) {
        for (String str : bundle.keySet()) {
            if (str.startsWith("f")) {
                try {
                    a H = this.c.H(str, bundle);
                    if (H != null) {
                        H.N2(false);
                        this.g.put(str.substring(1), H);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
