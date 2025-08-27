package defpackage;

import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: na4  reason: default package */
public final class na4 {
    public final LinkedHashMap a = new LinkedHashMap();

    public na4(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oa4 oa4 = (oa4) it.next();
            for (ra4 put : oa4.a().a) {
                this.a.put(put, oa4);
            }
        }
    }

    public final Pair a(Uri uri) {
        String a2 = bb4.a(uri);
        for (Map.Entry entry : this.a.entrySet()) {
            ra4 ra4 = (ra4) entry.getKey();
            oa4 oa4 = (oa4) entry.getValue();
            if (Intrinsics.areEqual((Object) bb4.a(ra4.a), (Object) a2)) {
                return TuplesKt.to(ra4, oa4);
            }
        }
        return null;
    }
}
