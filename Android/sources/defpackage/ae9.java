package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;

/* renamed from: ae9  reason: default package */
public final class ae9 {
    public static final oj4 f = new oj4(14);
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;

    public ae9(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5) {
        this.a = lazy4;
        this.b = lazy3;
        this.c = lazy;
        this.d = lazy5;
        this.e = lazy2;
    }

    public static Set a(xd9 xd9, xd9 xd92) {
        if (xd92 == null) {
            return SetsKt.emptySet();
        }
        List list = xd92.a;
        if (xd9 != null) {
            List list2 = xd9.a;
            if (!list2.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Object next : list2) {
                    if (((wd9) next).a.a == rqc.EMOJI) {
                        arrayList.add(next);
                    }
                }
                return SequencesKt.toSet(SequencesKt.map(SequencesKt.filter(SequencesKt.filter(CollectionsKt.asSequence(list), new wg7(21)), new wz6(1, arrayList)), new wg7(22)));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : list) {
            if (((wd9) next2).a.a == rqc.EMOJI) {
                arrayList2.add(next2);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((wd9) it.next()).a.b);
        }
        return CollectionsKt.toSet(arrayList3);
    }

    public static void c(List list, qqc qqc) {
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual((Object) ((wd9) it.next()).a, (Object) qqc)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            wd9 wd9 = (wd9) list.get(i);
            int i2 = wd9.b;
            if (i2 == 1) {
                list.remove(i);
                return;
            }
            list.set(i, new wd9(wd9.a, i2 - 1));
        }
    }

    public final fa9 b() {
        return (fa9) this.a.getValue();
    }

    public final void d(Long l, ha9 ha9, Set set, boolean z) {
        if (l != null) {
            z68.c("ae9", i2a.i("reactions, offline, messageServerId = %d,  reactionsDiff = %s, reactionsChanged = ", z), Long.valueOf(ha9.b), set);
            ((sv0) this.c.getValue()).c(new twf(l.longValue(), ha9.b, set, z));
        }
    }

    public final Unit e(long j, long j2, qqc qqc) {
        List list;
        int i;
        List list2;
        a32 a32 = (a32) ((my2) ((qx2) this.b.getValue())).o(j).a.getValue();
        if (a32 == null) {
            return Unit.INSTANCE;
        }
        ha9 r = b().r(j2);
        if (r == null) {
            return Unit.INSTANCE;
        }
        if (r.Y == qe9.DELETED) {
            return Unit.INSTANCE;
        }
        int i2 = 0;
        xd9 xd9 = r.Q0;
        int i3 = xd9 != null ? xd9.b : 0;
        qqc qqc2 = xd9 != null ? xd9.c : null;
        if (xd9 == null || (list2 = xd9.a) == null || (list = CollectionsKt.toMutableList(list2)) == null) {
            list = new ArrayList();
        }
        z68.c("ae9", "reactions, offline, updateMessageYourReaction, current: totalCount = %d, yourReaction = %s, reactions = %s", Boxing.boxInt(i3), qqc2, list);
        if (Intrinsics.areEqual((Object) qqc2, (Object) qqc)) {
            z68.c("ae9", "reactions, offline, cancel case", new Object[0]);
            c(list, qqc2);
            i = RangesKt.coerceAtLeast(i3 - 1, 0);
            qqc = null;
        } else {
            z68.c("ae9", "reactions, offline, add case", new Object[0]);
            if (qqc2 != null) {
                c(list, qqc2);
                i3--;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (Intrinsics.areEqual((Object) ((wd9) it.next()).a, (Object) qqc)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                list.add(new wd9(qqc, 1));
            } else {
                wd9 wd9 = (wd9) list.get(i2);
                list.set(i2, new wd9(wd9.a, wd9.b + 1));
            }
            i = i3 + 1;
        }
        CollectionsKt.sortWith(list, f);
        xd9 xd92 = new xd9(list, i, qqc);
        z68.c("ae9", "reactions, offline, newReactionsData = " + xd92, new Object[0]);
        b().i(MapsKt.mapOf(TuplesKt.to(Boxing.boxLong(r.c), xd92)));
        d(Boxing.boxLong(a32.a), r, a(xd9, xd92), Intrinsics.areEqual((Object) xd92, (Object) xd9) ^ true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: xd9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: qqc} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(long r13, java.util.Map r15) {
        /*
            r12 = this;
            fa9 r0 = r12.b()
            java.util.Set r1 = r15.keySet()
            java.util.ArrayList r0 = r0.l(r13, r1)
            java.util.List r0 = kotlin.collections.CollectionsKt.filterNotNull(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0032
            java.lang.Object r2 = r0.next()
            r3 = r2
            ha9 r3 = (defpackage.ha9) r3
            qe9 r3 = r3.Y
            qe9 r4 = defpackage.qe9.DELETED
            if (r3 == r4) goto L_0x001b
            r1.add(r2)
            goto L_0x001b
        L_0x0032:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r2 = r1.iterator()
        L_0x003b:
            boolean r3 = r2.hasNext()
            kotlin.Lazy r4 = r12.d
            if (r3 == 0) goto L_0x00b5
            java.lang.Object r3 = r2.next()
            ha9 r3 = (defpackage.ha9) r3
            java.lang.Object r4 = r4.getValue()
            yd9 r4 = (defpackage.yd9) r4
            long r5 = r3.c
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r5 = r15.get(r5)
            ud9 r5 = (defpackage.ud9) r5
            r4.getClass()
            r6 = 0
            if (r5 == 0) goto L_0x009f
            java.util.List r7 = r5.a
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r7, 10)
            r8.<init>(r9)
            java.util.Iterator r7 = r7.iterator()
        L_0x0072:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x008f
            java.lang.Object r9 = r7.next()
            pd9 r9 = (defpackage.pd9) r9
            wd9 r10 = new wd9
            nd9 r11 = r9.a
            qqc r11 = r4.d(r11)
            int r9 = r9.b
            r10.<init>(r11, r9)
            r8.add(r10)
            goto L_0x0072
        L_0x008f:
            nd9 r7 = r5.c
            if (r7 == 0) goto L_0x0097
            qqc r6 = r4.d(r7)
        L_0x0097:
            xd9 r4 = new xd9
            int r5 = r5.b
            r4.<init>(r8, r5, r6)
            r6 = r4
        L_0x009f:
            xd9 r4 = r3.Q0
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r6)
            if (r5 != 0) goto L_0x003b
            java.util.Set r4 = a(r4, r6)
            long r5 = r3.b
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r0.put(r3, r4)
            goto L_0x003b
        L_0x00b5:
            java.lang.Object r2 = r4.getValue()
            yd9 r2 = (defpackage.yd9) r2
            java.util.LinkedHashMap r15 = r2.c(r15)
            fa9 r2 = r12.b()
            r2.i(r15)
            java.util.Iterator r15 = r1.iterator()
        L_0x00ca:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x00f4
            java.lang.Object r1 = r15.next()
            ha9 r1 = (defpackage.ha9) r1
            long r2 = r1.b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == 0) goto L_0x00ca
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            r4 = 0
            r12.d(r3, r1, r2, r4)
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            r12.g(r3, r1, r2, r4)
            goto L_0x00ca
        L_0x00f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ae9.f(long, java.util.Map):void");
    }

    public final void g(Long l, ha9 ha9, Set set, boolean z) {
        z68.c("ae9", "reactions, offline, messageServerId = %d,  reactionsDiff = %s", Long.valueOf(ha9.b), set);
        ((sv0) this.c.getValue()).c(new a9a(l.longValue(), z, ha9.b, ha9.o, set));
    }
}
