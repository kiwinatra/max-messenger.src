package defpackage;

import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: v00  reason: default package */
public final /* synthetic */ class v00 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ v00(int i) {
        this.a = i;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
            case 1:
                return ((ca6) obj2).y - ((ca6) obj).y;
            case 2:
                return ((ea6) obj2).i - ((ea6) obj).i;
            case 3:
                ll0 ll0 = (ll0) obj;
                ll0 ll02 = (ll0) obj2;
                int compare = Integer.compare(ll0.c, ll02.c);
                return compare != 0 ? compare : ll0.b.compareTo(ll02.b);
            case 4:
                ml0 ml0 = (ml0) obj;
                ml0 ml02 = (ml0) obj2;
                int compare2 = Integer.compare(ml0.c, ml02.c);
                return compare2 != 0 ? compare2 : ml0.b.compareTo(ml02.b);
            case 5:
                int i = (((tp1) obj).d.c > ((tp1) obj2).d.c ? 1 : (((tp1) obj).d.c == ((tp1) obj2).d.c ? 0 : -1));
                if (i < 0) {
                    return 1;
                }
                return i == 0 ? 0 : -1;
            case 6:
                return Long.compare(((a89) obj2).h(), ((a89) obj).h());
            case 7:
                return Integer.compare(((gy1) obj2).b, ((gy1) obj).b);
            case 8:
                return Integer.compare(((hy1) obj2).b, ((hy1) obj).b);
            case 9:
                a32 a32 = (a32) obj;
                a32 a322 = (a32) obj2;
                int l = kne.l(a322.b.a().e, a32.b.a().e);
                return l != 0 ? l : kne.l(a322.p(), a32.p());
            case 10:
                a32 a323 = (a32) obj;
                a323.getClass();
                return kne.l(((a32) obj2).p(), a323.p());
            case 11:
                int i2 = (((ha9) obj).b > ((ha9) obj2).b ? 1 : (((ha9) obj).b == ((ha9) obj2).b ? 0 : -1));
                if (i2 < 0) {
                    return -1;
                }
                return i2 == 0 ? 0 : 1;
            case 12:
                long j = ((ha9) obj2).o;
                long j2 = ((ha9) obj).o;
                if (j < j2) {
                    return -1;
                }
                return j2 == j ? 0 : 1;
            case 13:
                n18 n18 = (n18) obj;
                n18 n182 = (n18) obj2;
                dnf dnf = n182.b;
                if (dnf != dnf.a) {
                    if (dnf != n18.b || dnf != dnf.o) {
                        return -1;
                    }
                    if (n182.c()) {
                        return 0;
                    }
                }
                return 1;
            case Protos.Attaches.Attach.LOCATION:
                gz6 gz6 = (gz6) obj;
                gz6 gz62 = (gz6) obj2;
                int compareValues = ComparisonsKt.compareValues(Long.valueOf(gz62.h()), Long.valueOf(gz6.h()));
                return compareValues != 0 ? compareValues : ComparisonsKt.compareValues(Long.valueOf(gz6.getId()), Long.valueOf(gz62.getId()));
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return Intrinsics.compare(((Long) obj2).longValue(), ((Long) obj).longValue());
            case 16:
                zs3 zs3 = (zs3) obj;
                zs3 zs32 = (zs3) obj2;
                return 0;
            case LangUtils.HASH_SEED:
                return Long.compare(((f72) obj).a, ((f72) obj2).a);
            case 18:
                return ((i9d) obj2).f - ((i9d) obj).f;
            case 19:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 20:
                Integer num3 = (Integer) obj;
                Integer num4 = (Integer) obj2;
                if (num3.intValue() == -1) {
                    return num4.intValue() == -1 ? 0 : -1;
                }
                if (num4.intValue() == -1) {
                    return 1;
                }
                return num3.intValue() - num4.intValue();
            case 21:
                Integer num5 = (Integer) obj;
                Integer num6 = (Integer) obj2;
                f5b f5b = rj4.f;
                return 0;
            case 22:
                return Integer.compare(((zi4) ((List) obj).get(0)).w, ((zi4) ((List) obj2).get(0)).w);
            case 23:
                List list = (List) obj;
                List list2 = (List) obj2;
                return w93.g(pj4.c((pj4) Collections.max(list, new v00(29)), (pj4) Collections.max(list2, new v00(29)))).a(list.size(), list2.size()).c((pj4) Collections.max(list, new oj4(1)), (pj4) Collections.max(list2, new oj4(1)), new oj4(1)).f();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return ((yi4) Collections.max((List) obj)).compareTo((yi4) Collections.max((List) obj2));
            case 25:
                return ((xi4) Collections.max((List) obj)).compareTo((xi4) Collections.max((List) obj2));
            case 26:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                return w93.g(qj4.c((qj4) Collections.max(list3, new oj4(0)), (qj4) Collections.max(list4, new oj4(0)))).a(list3.size(), list4.size()).c((qj4) Collections.max(list3, new oj4(2)), (qj4) Collections.max(list4, new oj4(2)), new oj4(2)).f();
            case 27:
                return ((ij4) ((List) obj).get(0)).compareTo((ij4) ((List) obj2).get(0));
            case 28:
                return ((jj4) ((List) obj).get(0)).compareTo((jj4) ((List) obj2).get(0));
            default:
                return pj4.c((pj4) obj, (pj4) obj2);
        }
    }
}
