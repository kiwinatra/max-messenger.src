package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* renamed from: tp9  reason: default package */
public final class tp9 {
    public final npg a;
    public final v34 b;
    public final HashMap c = new HashMap();

    public tp9(Context context, v34 v34) {
        npg npg = new npg(context, 16);
        this.a = npg;
        this.b = v34;
    }

    public final synchronized nsf a(String str) {
        if (this.c.containsKey(str)) {
            return (nsf) this.c.get(str);
        }
        CctBackendFactory D = this.a.D(str);
        if (D == null) {
            return null;
        }
        v34 v34 = this.b;
        nsf create = D.create(new ma0(v34.a, v34.b, v34.c, str));
        this.c.put(str, create);
        return create;
    }
}
