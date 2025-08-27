package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: z0g  reason: default package */
public final class z0g {
    public final a07 a;
    public final bl4 b;

    public z0g(a07 a07, bl4 bl4) {
        this.a = a07;
        this.b = bl4;
    }

    public final List a(List list, Function1 function1, Function1 function12, Function1 function13, sk3 sk3, Function1 function14) {
        a07 a07 = this.a;
        if (!a07.j()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : list) {
            boolean z = a07.z(((Number) function1.invoke(next)).longValue());
            if (!z && function13 != null && this.b.a() && function13.invoke(next) != qe9.DELAYED_FIRE_ERROR) {
                arrayList.add(function12.invoke(next));
            }
            if (function14 != null) {
                function14.invoke(next);
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            z68.c("z0g", "items for delete not empty, count = " + size, new Object[0]);
            sk3.accept(arrayList);
        }
        return arrayList2;
    }
}
