package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.text.Typography;
import scout.exception.IllegalOverridesException;
import scout.exception.ScopeInitializationException;

/* renamed from: fwf  reason: default package */
public class fwf {
    public final String a;
    public final o9a b = ld8.Z;
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet g = new HashSet();
    public final ArrayList h = new ArrayList();

    public fwf(String str) {
        this.a = str;
    }

    public cgd a() {
        o9a o9a = this.b;
        boolean z = false;
        String str = this.a;
        if (o9a != null) {
            try {
                if (tr1.b(2, 2) >= 0) {
                    o9a.e(o9a, "Start initialization of scope \"" + str + Typography.quote);
                }
            } catch (Exception e2) {
                throw new ScopeInitializationException(str, e2);
            }
        }
        ArrayList arrayList = this.h;
        if (!(!arrayList.isEmpty())) {
            cgd cgd = new cgd(this.a, this.c, this.d, this.e, this.f, this.g);
            if (o9a != null) {
                if (tr1.b(2, 2) >= 0) {
                    z = true;
                }
                if (z) {
                    o9a.e(o9a, "Finish initialization of \"" + str + Typography.quote);
                }
            }
            return cgd;
        }
        throw new IllegalOverridesException(str, arrayList);
    }

    public /* bridge */ void b(Class cls, gi7 gi7) {
        c(cls, gi7);
    }

    public void c(Class cls, gi7 gi7) {
        HashMap hashMap = this.e;
        Object obj = hashMap.get(cls);
        if (obj == null) {
            obj = new ArrayList();
            hashMap.put(cls, obj);
        }
        ((List) obj).add(gi7);
    }

    public /* bridge */ void d(Class cls, gi7 gi7) {
        e(cls, gi7);
    }

    public void e(Class cls, gi7 gi7) {
        if (this.d.put(cls, gi7) != null) {
            this.h.add(cls);
        }
    }
}
