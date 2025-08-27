package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wz6  reason: default package */
public final /* synthetic */ class wz6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ wz6(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(m58.j(((gz6) obj).h(), this.b));
            default:
                wd9 wd9 = (wd9) obj;
                Iterable iterable = this.b;
                boolean z = true;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            wd9 wd92 = (wd9) it.next();
                            if (Intrinsics.areEqual((Object) wd92.a.b, (Object) wd9.a.b) && wd92.b >= wd9.b) {
                                z = false;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
