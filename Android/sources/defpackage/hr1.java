package defpackage;

import android.util.ArrayMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: hr1  reason: default package */
public final class hr1 extends bt1 {
    public final /* synthetic */ int a = 0;
    public Object b;
    public Object c;

    public /* synthetic */ hr1() {
    }

    public void a(int i) {
        switch (this.a) {
            case 0:
                Iterator it = ((HashSet) this.b).iterator();
                while (it.hasNext()) {
                    bt1 bt1 = (bt1) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.c).get(bt1)).execute(new l40(bt1, i, 4));
                    } catch (RejectedExecutionException unused) {
                    }
                }
                return;
            default:
                return;
        }
    }

    public final void b(int i, it1 it1) {
        switch (this.a) {
            case 0:
                Iterator it = ((HashSet) this.b).iterator();
                while (it.hasNext()) {
                    bt1 bt1 = (bt1) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.c).get(bt1)).execute(new kh1((Object) bt1, i, (Object) it1, 2));
                    } catch (RejectedExecutionException unused) {
                    }
                }
                return;
            default:
                ((do1) this.b).b((Object) null);
                ((qu1) this.c).t(this);
                return;
        }
    }

    public void c(int i, dbe dbe) {
        switch (this.a) {
            case 0:
                Iterator it = ((HashSet) this.b).iterator();
                while (it.hasNext()) {
                    bt1 bt1 = (bt1) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.c).get(bt1)).execute(new kh1((Object) bt1, i, (Object) dbe, 1));
                    } catch (RejectedExecutionException unused) {
                    }
                }
                return;
            default:
                return;
        }
    }

    public hr1(do1 do1, qu1 qu1) {
        this.b = do1;
        this.c = qu1;
    }
}
