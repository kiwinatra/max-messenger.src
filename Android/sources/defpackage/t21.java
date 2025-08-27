package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.math.MathKt;

/* renamed from: t21  reason: default package */
public final class t21 {
    public hx3 a;

    public final hx3 a(Context context, List list, s21 s21) {
        hx3 hx3 = this.a;
        if (hx3 != null) {
            hx3.dismiss();
        }
        hx3 hx32 = new hx3(context);
        hx32.setWidth(MathKt.roundToInt(((float) 250) * vo4.c().getDisplayMetrics().density));
        hx32.d = false;
        l9a l9a = l9a.f0;
        hx32.f.setValue(hx32, hx3.g[0], l9a);
        Iterable<d8> iterable = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (d8 d8Var : iterable) {
            arrayList.add(new nw3(d8Var.getName(), Integer.valueOf(d8Var.getIcon()), rcf.X, rcf.B0, new s2(5, (Object) s21, (Object) d8Var)));
        }
        hx32.a.a(arrayList, new r6(9, hx32));
        this.a = hx32;
        return hx32;
    }
}
