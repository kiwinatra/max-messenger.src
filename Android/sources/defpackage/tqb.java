package defpackage;

import android.view.View;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* renamed from: tqb  reason: default package */
public abstract class tqb {
    public static final int a = lhc.pooling_container_listener_holder_tag;
    public static final int b = lhc.is_pooling_container_tag;

    public static final void a(View view) {
        for (View view2 : cjf.x(view)) {
            int i = a;
            uqb uqb = (uqb) view2.getTag(i);
            if (uqb == null) {
                uqb = new uqb();
                view2.setTag(i, uqb);
            }
            ArrayList arrayList = uqb.a;
            int lastIndex = CollectionsKt.getLastIndex(arrayList);
            if (-1 < lastIndex) {
                rae.w(arrayList.get(lastIndex));
                throw null;
            }
        }
    }
}
