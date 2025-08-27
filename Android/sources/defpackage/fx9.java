package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* renamed from: fx9  reason: default package */
public final /* synthetic */ class fx9 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hx9 b;

    public /* synthetic */ fx9(hx9 hx9, int i) {
        this.a = i;
        this.b = hx9;
    }

    public final Object invoke(Object obj) {
        boolean z;
        Integer num = (Integer) obj;
        switch (this.a) {
            case 0:
                num.getClass();
                bx9 bx9 = this.b.c;
                Collection list = CollectionsKt.toList(((vw9) bx9.d.getValue()).b);
                if (list.isEmpty()) {
                    bx9.a();
                } else {
                    bx9.c.invoke((List) list, num);
                }
                return Unit.INSTANCE;
            default:
                int intValue = num.intValue();
                hx9 hx9 = this.b;
                if (hx9.b.j() < intValue || intValue < 0) {
                    z = false;
                } else {
                    z = ((vw9) hx9.c.e.a.getValue()).b.contains(Long.valueOf(((gpe) ((lz7) hx9.b.E(intValue))).a));
                }
                return Boolean.valueOf(z);
        }
    }
}
