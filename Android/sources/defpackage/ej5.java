package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: ej5  reason: default package */
public final class ej5 implements zi6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ ej5(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final Object apply(Object obj) {
        List list = this.b;
        switch (this.a) {
            case 0:
                bj5 bj5 = (bj5) obj;
                List list2 = CollectionsKt.toList(list);
                bj5.getClass();
                Iterable<lga> iterable = list2;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                for (lga lga : iterable) {
                    arrayList.add(lga.a + "_" + lga.b);
                }
                djd djd = hj5.b;
                StringBuilder o = tr1.o("SELECT * FROM fcm_notifications_analytics WHERE chat_id||'_'||msg_id IN (");
                int size = arrayList.size();
                n79.c(o, size);
                o.append(") AND analytics_status = (");
                o.append("?");
                o.append(")");
                int i = size + 1;
                d7d a2 = d7d.a(i, o.toString());
                Iterator it = arrayList.iterator();
                int i2 = 1;
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str == null) {
                        a2.X(i2);
                    } else {
                        a2.h(i2, str);
                    }
                    i2++;
                }
                a2.k(i, (long) 1);
                return new mka(1, new fbd(new ni(12, bj5, a2), 0));
            case 1:
                nj5 nj5 = (nj5) obj;
                List<Long> list3 = CollectionsKt.toList(list);
                nj5.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT * FROM fcm_notifications_history WHERE chat_id IN (");
                int size2 = list3.size();
                n79.c(sb, size2);
                sb.append(")");
                d7d a3 = d7d.a(size2, sb.toString());
                int i3 = 1;
                for (Long l : list3) {
                    if (l == null) {
                        a3.X(i3);
                    } else {
                        a3.k(i3, l.longValue());
                    }
                    i3++;
                }
                return new mka(1, new fbd(new ni(14, nj5, a3), 0));
            case 2:
                lfa lfa = (lfa) obj;
                List<Long> list4 = CollectionsKt.toList(list);
                lfa.getClass();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SELECT * FROM notifications_read_marks WHERE chat_id IN (");
                int size3 = list4.size();
                n79.c(sb2, size3);
                sb2.append(")");
                d7d a4 = d7d.a(size3, sb2.toString());
                int i4 = 1;
                for (Long l2 : list4) {
                    if (l2 == null) {
                        a4.X(i4);
                    } else {
                        a4.k(i4, l2.longValue());
                    }
                    i4++;
                }
                return new mka(1, new fbd(new ni(19, lfa, a4), 0));
            case 3:
                oga oga = (oga) obj;
                oga.getClass();
                return new qa3(2, new nga(oga, (ArrayList) list, 0));
            default:
                oga oga2 = (oga) obj;
                oga2.getClass();
                Iterable<dj5> iterable2 = list;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
                for (dj5 dj5 : iterable2) {
                    arrayList2.add(dj5.a + "_" + dj5.b);
                }
                return new mka(2, new nga(oga2, arrayList2, 1));
        }
    }
}
