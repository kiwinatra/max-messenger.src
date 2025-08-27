package defpackage;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: nr3  reason: default package */
public final class nr3 extends ij0 {
    public final List b;
    public final int c;

    public nr3(long j, List list, List list2, int i) {
        super(j);
        ArrayList arrayList;
        if (list == null || list.isEmpty()) {
            arrayList = Collections.emptyList();
        } else {
            boolean z = list2 != null && list2.size() == list.size();
            ArrayList arrayList2 = new ArrayList(list.size());
            for (int i2 = 0; i2 < list.size(); i2++) {
                String str = (String) list.get(i2);
                long j2 = 0;
                if (z) {
                    Long l = (Long) list2.get(i2);
                    arrayList2.add(new AbstractMap.SimpleEntry(Collections.singletonList(str), Long.valueOf(l != null ? l.longValue() : j2)));
                } else {
                    arrayList2.add(new AbstractMap.SimpleEntry(Collections.singletonList(str), 0L));
                }
            }
            arrayList = arrayList2;
        }
        this.b = arrayList;
        this.c = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactPhotosEvent{avatarUrlsAndIds=");
        sb.append(this.b);
        sb.append(", total=");
        return tr1.k(sb, this.c, '}');
    }
}
