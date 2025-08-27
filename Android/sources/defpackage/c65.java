package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: c65  reason: default package */
public final class c65 implements n55, kha {
    public final LinkedHashMap a = new LinkedHashMap();
    public du0 b = du0.b;
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ g65 o;

    public c65(g65 g65) {
        this.o = g65;
    }

    public final void a(boolean z) {
        du0 du0 = du0.b;
        du0 du02 = z ? du0.a : du0;
        if (this.b != du02) {
            this.b = du02;
            if (du02 == du0) {
                ArrayList arrayList = this.c;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((zz7) it.next()).cancel(true);
                }
                arrayList.clear();
            }
            for (Map.Entry entry : this.a.entrySet()) {
                try {
                    ((Executor) entry.getValue()).execute(new bk4(14, entry, du02));
                } catch (RejectedExecutionException unused) {
                    String str = this.o.a;
                }
            }
        }
    }

    public final void d(Executor executor, iha iha) {
        this.o.h.execute(new x55((Object) this, (Object) iha, (Object) executor, 2));
    }

    public final zz7 e() {
        return m5a.F(new z55(this, 0));
    }

    public final void i(iha iha) {
        this.o.h.execute(new bk4(16, this, iha));
    }
}
