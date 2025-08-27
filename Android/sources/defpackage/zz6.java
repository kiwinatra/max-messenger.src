package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;
import kotlin.sequences.SequencesKt;

/* renamed from: zz6  reason: default package */
public final class zz6 {
    public static final /* synthetic */ KProperty[] k = {rae.s(zz6.class, "historyBounds", "getHistoryBounds()Lru/ok/tamtam/loader/HistoryBounds;", 0)};
    public final ez6 a;
    public final i74 b;
    public final i74 c;
    public final int d;
    public final kn5 e;
    public final Integer f;
    public final boolean g;
    public final i04 h;
    public final fx i;
    public volatile vz6 j;

    public zz6(ez6 ez6, i74 i74, i74 i742, int i2, kn5 kn5, boolean z, int i3) {
        z = (i3 & 64) != 0 ? true : z;
        this.a = ez6;
        this.b = i74;
        this.c = i742;
        this.d = i2;
        this.e = kn5;
        this.f = null;
        this.g = z;
        i04 i04 = new i04();
        this.h = i04;
        Delegates delegates = Delegates.INSTANCE;
        this.i = new fx(4, LazyKt.lazy(new u75(23, this)), this);
        i04.add(new Object());
    }

    public final void a(int i2, gz6 gz6) {
        this.h.add(i2, gz6);
    }

    public final void b(gz6 gz6) {
        kn5 kn5 = this.e;
        if (kn5 != null) {
            kn5.c("addHistoryItem " + gz6);
        }
        h(CollectionsKt.listOf(gz6));
        p();
        s();
        vz6 vz6 = this.j;
        if (vz6 != null) {
            vz6.s();
        }
    }

    public final void c(Set set) {
        if (!set.isEmpty()) {
            kn5 kn5 = this.e;
            if (kn5 != null) {
                int size = set.size();
                kn5.c("deleteHistoryItem: " + size);
            }
            i04 i04 = this.h;
            ArrayList arrayList = new ArrayList();
            Iterator it = i04.iterator();
            while (true) {
                f04 f04 = (f04) it;
                if (!f04.hasNext()) {
                    break;
                }
                Object next = f04.next();
                if (set.contains(Long.valueOf(((gz6) next).getId()))) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty() && !this.h.isEmpty()) {
                this.h.removeAll(arrayList);
                m(this.h);
                q();
                i04 i042 = this.h;
                if (!(i042 instanceof Collection) || !i042.isEmpty()) {
                    Iterator it2 = i042.iterator();
                    while (true) {
                        f04 f042 = (f04) it2;
                        if (f042.hasNext()) {
                            if (!(((gz6) f042.next()) instanceof fz6)) {
                                p();
                                s();
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                vz6 vz6 = this.j;
                if (vz6 != null) {
                    vz6.s();
                }
            }
        }
    }

    public final dz6 d() {
        return (dz6) this.i.getValue(this, k[0]);
    }

    public final ArrayList e() {
        return new ArrayList(this.h);
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x00ac A[LOOP:2: B:39:0x00ac->B:96:0x00ac, LOOP_END, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x017b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List f(long r17) {
        /*
            r16 = this;
            java.util.ArrayList r0 = r16.e()
            dz6 r1 = r16.d()
            java.util.List r1 = r1.i()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0013
            return r0
        L_0x0013:
            boolean r1 = r0.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x0038
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0022
            goto L_0x0037
        L_0x0022:
            java.util.Iterator r1 = r0.iterator()
        L_0x0026:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0037
            java.lang.Object r3 = r1.next()
            gz6 r3 = (defpackage.gz6) r3
            boolean r3 = r3 instanceof defpackage.fz6
            if (r3 == 0) goto L_0x0026
            goto L_0x0038
        L_0x0037:
            return r0
        L_0x0038:
            int r1 = r0.size()
            r3 = 0
            if (r1 != r2) goto L_0x0051
            java.lang.Object r1 = r0.get(r3)
            boolean r1 = r1 instanceof defpackage.fz6
            if (r1 == 0) goto L_0x0051
            fz6 r0 = new fz6
            r0.<init>()
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            return r0
        L_0x0051:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x005c
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            return r0
        L_0x005c:
            dz6 r1 = r16.d()
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x0070
            java.util.List r1 = kotlin.jvm.internal.TypeIntrinsics.asMutableList(r0)
            r2 = r16
            r2.m(r1)
            return r0
        L_0x0070:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r4 = r0.size()
            r5 = -1
            r6 = r3
            r7 = r5
        L_0x007c:
            if (r6 >= r4) goto L_0x00a8
            java.lang.Object r8 = r0.get(r6)
            gz6 r8 = (defpackage.gz6) r8
            boolean r8 = r8 instanceof defpackage.fz6
            if (r8 != 0) goto L_0x008f
            int r8 = r0.size()
            int r8 = r8 - r2
            if (r6 != r8) goto L_0x00a5
        L_0x008f:
            if (r7 != r5) goto L_0x0095
            r7 = r3
            if (r6 != 0) goto L_0x0095
            goto L_0x00a5
        L_0x0095:
            int r8 = r6 + 1
            java.util.List r7 = r0.subList(r7, r8)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.List r7 = kotlin.collections.CollectionsKt.toList(r7)
            r1.add(r7)
            r7 = r6
        L_0x00a5:
            int r6 = r6 + 1
            goto L_0x007c
        L_0x00a8:
            java.util.Iterator r0 = r1.iterator()
        L_0x00ac:
            boolean r1 = r0.hasNext()
            r3 = 0
            if (r1 == 0) goto L_0x017c
            java.lang.Object r1 = r0.next()
            r4 = r1
            java.util.List r4 = (java.util.List) r4
            r5 = r4
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x00c6:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x00dc
            java.lang.Object r7 = r5.next()
            r8 = r7
            gz6 r8 = (defpackage.gz6) r8
            boolean r8 = r8 instanceof defpackage.fz6
            r8 = r8 ^ r2
            if (r8 == 0) goto L_0x00c6
            r6.add(r7)
            goto L_0x00c6
        L_0x00dc:
            java.lang.Object r5 = kotlin.collections.CollectionsKt.firstOrNull(r4)
            boolean r5 = r5 instanceof defpackage.fz6
            r7 = -1
            if (r5 != 0) goto L_0x00ea
            r9 = -9223372036854775808
        L_0x00e8:
            r12 = r9
            goto L_0x0129
        L_0x00ea:
            java.util.Iterator r5 = r6.iterator()
            boolean r9 = r5.hasNext()
            if (r9 != 0) goto L_0x00f6
            r9 = r3
            goto L_0x011f
        L_0x00f6:
            java.lang.Object r9 = r5.next()
            boolean r10 = r5.hasNext()
            if (r10 != 0) goto L_0x0101
            goto L_0x011f
        L_0x0101:
            r10 = r9
            gz6 r10 = (defpackage.gz6) r10
            long r10 = r10.h()
        L_0x0108:
            java.lang.Object r12 = r5.next()
            r13 = r12
            gz6 r13 = (defpackage.gz6) r13
            long r13 = r13.h()
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x0119
            r9 = r12
            r10 = r13
        L_0x0119:
            boolean r12 = r5.hasNext()
            if (r12 != 0) goto L_0x0108
        L_0x011f:
            gz6 r9 = (defpackage.gz6) r9
            if (r9 == 0) goto L_0x0128
            long r9 = r9.h()
            goto L_0x00e8
        L_0x0128:
            r12 = r7
        L_0x0129:
            java.lang.Object r4 = kotlin.collections.CollectionsKt.lastOrNull(r4)
            boolean r4 = r4 instanceof defpackage.fz6
            if (r4 != 0) goto L_0x0137
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x0173
        L_0x0137:
            java.util.Iterator r14 = r6.iterator()
            boolean r4 = r14.hasNext()
            if (r4 != 0) goto L_0x0142
            goto L_0x016b
        L_0x0142:
            java.lang.Object r3 = r14.next()
            boolean r4 = r14.hasNext()
            if (r4 != 0) goto L_0x014d
            goto L_0x016b
        L_0x014d:
            r4 = r3
            gz6 r4 = (defpackage.gz6) r4
            long r4 = r4.h()
        L_0x0154:
            java.lang.Object r6 = r14.next()
            r9 = r6
            gz6 r9 = (defpackage.gz6) r9
            long r9 = r9.h()
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x0165
            r3 = r6
            r4 = r9
        L_0x0165:
            boolean r6 = r14.hasNext()
            if (r6 != 0) goto L_0x0154
        L_0x016b:
            gz6 r3 = (defpackage.gz6) r3
            if (r3 == 0) goto L_0x0173
            long r7 = r3.h()
        L_0x0173:
            int r3 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r3 > 0) goto L_0x00ac
            int r3 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x00ac
            r3 = r1
        L_0x017c:
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L_0x0189
            fz6 r0 = new fz6
            r0.<init>()
            java.util.List r3 = kotlin.collections.CollectionsKt.listOf(r0)
        L_0x0189:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz6.f(long):java.util.List");
    }

    public final void g(long j2, List list, boolean z, boolean z2) {
        List i2 = d().i();
        List list2 = SequencesKt.toList(SequencesKt.sortedWith(SequencesKt.filter(SequencesKt___SequencesKt.distinctBy(CollectionsKt.asSequence(list), new of3(27)), new wz6(0, i2)), d().c()));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            gz6 gz6 = (gz6) list2.get(i3);
            arrayList2.add(gz6);
            if (i3 == list2.size() - 1 || !Intrinsics.areEqual((Object) m58.m(gz6.h(), i2), (Object) m58.m(((gz6) list2.get(i3 + 1)).h(), i2))) {
                arrayList.add(arrayList2);
                arrayList2 = new ArrayList();
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((List) next).size() > 0) {
                arrayList3.add(next);
            }
        }
        List<List> mutableList = CollectionsKt.toMutableList(arrayList3);
        if (!mutableList.isEmpty()) {
            for (List list3 : mutableList) {
                list3.add(0, new Object());
                list3.add(list3.size(), new Object());
            }
            for (List list4 : mutableList) {
                h(list4);
                o(kv0.r(list4), kv0.P(list4));
            }
            List list5 = (List) CollectionsKt.first(mutableList);
            long j3 = -1;
            if (z && (!this.h.isEmpty())) {
                gz6 P = kv0.P(list5);
                long h2 = P != null ? P.h() : -1;
                if (h2 >= 0) {
                    l03 m = m58.m(h2, i2);
                    l03 m2 = m58.m(j2, i2);
                    if (m != null && Intrinsics.areEqual((Object) m, (Object) m2)) {
                        n(j2, h2);
                    }
                }
            }
            List list6 = (List) CollectionsKt.last(mutableList);
            if (z2 && (!this.h.isEmpty())) {
                gz6 r = kv0.r(list6);
                if (r != null) {
                    j3 = r.h();
                }
                if (j3 >= 0) {
                    l03 m3 = m58.m(j3, i2);
                    l03 m4 = m58.m(j2, i2);
                    if (m3 != null && Intrinsics.areEqual((Object) m3, (Object) m4)) {
                        n(j3, j2);
                    }
                }
            }
            m(this.h);
            p();
            s();
            if (!d().a()) {
                i04 i04 = this.h;
                o(kv0.r(i04), kv0.P(i04));
            }
            vz6 vz6 = this.j;
            if (vz6 != null) {
                vz6.s();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [gz6, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v6, types: [gz6, java.lang.Object] */
    public final void h(List list) {
        int indexOf;
        int indexOf2;
        Collection collection = list;
        int i2 = 0;
        boolean z = (collection.isEmpty() ^ true) && (CollectionsKt.first(list) instanceof fz6);
        boolean z2 = (collection.isEmpty() ^ true) && (CollectionsKt.last(list) instanceof fz6);
        List<gz6> list2 = SequencesKt.toList(SequencesKt.filterNot(SequencesKt.filter(CollectionsKt.asSequence(list), new of3(26)), new rx2(26, this)));
        if (!list2.isEmpty()) {
            if (this.h.isEmpty()) {
                this.h.addAll(list2);
            } else {
                Comparator e2 = d().e();
                if (this.g) {
                    int lastIndex = CollectionsKt.getLastIndex(this.h);
                    for (gz6 gz6 : CollectionsKt.asReversed(list2)) {
                        while (lastIndex > 0 && ((this.h.b[lastIndex] instanceof fz6) || e2.compare(Long.valueOf(((gz6) this.h.b[lastIndex]).h()), Long.valueOf(gz6.h())) > 0)) {
                            lastIndex--;
                        }
                        int i3 = lastIndex + 1;
                        if (this.h.b.length > i3 && (this.h.b[i3] instanceof fz6)) {
                            lastIndex = i3;
                        }
                        a(lastIndex + 1, gz6);
                    }
                } else {
                    for (gz6 gz62 : list2) {
                        while (i2 < this.h.b.length && ((this.h.b[i2] instanceof fz6) || e2.compare(Long.valueOf(((gz6) this.h.b[i2]).h()), Long.valueOf(gz62.h())) <= 0)) {
                            i2++;
                        }
                        a(i2, gz62);
                    }
                }
            }
            if (z && (indexOf2 = this.h.indexOf(CollectionsKt.first(list2))) > 0) {
                int i4 = indexOf2 - 1;
                if (!(this.h.b[i4] instanceof fz6)) {
                    a(i4, new Object());
                }
            }
            if (z2 && (indexOf = this.h.indexOf(CollectionsKt.last(list2))) > 0) {
                if (!(indexOf == CollectionsKt.getLastIndex(this.h) ? CollectionsKt.last(this.h) instanceof fz6 : this.h.b[indexOf + 1] instanceof fz6)) {
                    a(indexOf + 1, new Object());
                }
            }
        }
    }

    public final boolean i(long j2, List list, boolean z) {
        int i2;
        int i3;
        int i4 = this.d;
        if (z) {
            Iterable<gz6> iterable = list;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                i3 = 0;
                for (gz6 gz6 : iterable) {
                    if (!(gz6 instanceof fz6) && d().e().compare(Long.valueOf(gz6.h()), Long.valueOf(j2)) <= 0 && (i3 = i3 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            } else {
                i3 = 0;
            }
            if (i3 < i4) {
                return true;
            }
        } else {
            Iterable<gz6> iterable2 = list;
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                i2 = 0;
                for (gz6 gz62 : iterable2) {
                    if (!(gz62 instanceof fz6) && d().e().compare(Long.valueOf(gz62.h()), Long.valueOf(j2)) >= 0 && (i2 = i2 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            } else {
                i2 = 0;
            }
            if (i2 < i4) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: gz6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0168  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(defpackage.i74 r28, long r29, boolean r31, boolean r32, boolean r33) {
        /*
            r27 = this;
            r6 = r27
            r0 = r29
            if (r31 != 0) goto L_0x0009
            if (r32 != 0) goto L_0x0009
            return
        L_0x0009:
            java.util.List r2 = r6.f(r0)
            r3 = r2
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0019:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x002e
            java.lang.Object r5 = r3.next()
            r7 = r5
            gz6 r7 = (defpackage.gz6) r7
            boolean r7 = r7 instanceof defpackage.fz6
            if (r7 != 0) goto L_0x0019
            r4.add(r5)
            goto L_0x0019
        L_0x002e:
            boolean r3 = r4.isEmpty()
            r7 = -1
            r5 = 0
            r9 = 1
            if (r3 == 0) goto L_0x0045
            int r2 = r6.d
            r10 = r0
            r3 = r2
            r18 = r7
            r15 = 0
            r22 = 0
            r0 = r3
            r1 = r10
            goto L_0x00c2
        L_0x0045:
            java.lang.Object r3 = kotlin.collections.CollectionsKt.first(r2)
            boolean r3 = r3 instanceof defpackage.fz6
            r10 = 0
            if (r3 == 0) goto L_0x007c
            if (r31 == 0) goto L_0x007c
            if (r33 == 0) goto L_0x0059
            boolean r3 = r6.i(r0, r2, r9)
            if (r3 == 0) goto L_0x007c
        L_0x0059:
            int r3 = r6.d
            java.lang.Object r12 = r2.get(r9)
            gz6 r12 = (defpackage.gz6) r12
            long r12 = r12.h()
            java.lang.Object r14 = r2.get(r9)
            gz6 r14 = (defpackage.gz6) r14
            dz6 r15 = r27.d()
            l03 r15 = r15.f(r12)
            if (r15 == 0) goto L_0x007a
            long r15 = r15.b()
            goto L_0x0080
        L_0x007a:
            r15 = r7
            goto L_0x0080
        L_0x007c:
            r3 = r5
            r15 = r7
            r12 = r10
            r14 = 0
        L_0x0080:
            java.lang.Object r4 = kotlin.collections.CollectionsKt.last(r2)
            boolean r4 = r4 instanceof defpackage.fz6
            if (r4 == 0) goto L_0x00bb
            if (r32 == 0) goto L_0x00bb
            if (r33 == 0) goto L_0x0092
            boolean r0 = r6.i(r0, r2, r5)
            if (r0 == 0) goto L_0x00bb
        L_0x0092:
            int r0 = r6.d
            r1 = 2
            java.lang.Object r4 = defpackage.a81.i(r1, r2)
            gz6 r4 = (defpackage.gz6) r4
            long r10 = r4.h()
            java.lang.Object r1 = defpackage.a81.i(r1, r2)
            r4 = r1
            gz6 r4 = (defpackage.gz6) r4
            dz6 r1 = r27.d()
            l03 r1 = r1.d(r10)
            if (r1 == 0) goto L_0x00b4
            long r7 = r1.a()
        L_0x00b4:
            r22 = r4
            r1 = r12
            r18 = r15
        L_0x00b9:
            r15 = r14
            goto L_0x00c2
        L_0x00bb:
            r0 = r5
            r1 = r12
            r18 = r15
            r22 = 0
            goto L_0x00b9
        L_0x00c2:
            if (r3 != 0) goto L_0x00c7
            if (r0 != 0) goto L_0x00c7
            return
        L_0x00c7:
            kn5 r4 = r6.e
            if (r4 == 0) goto L_0x011c
            java.lang.Class r12 = r28.getClass()
            java.lang.String r12 = r12.getSimpleName()
            java.lang.String r13 = defpackage.kn5.b(r1)
            java.lang.String r14 = defpackage.kn5.b(r10)
            java.lang.String r5 = defpackage.kn5.b(r18)
            java.lang.String r9 = defpackage.kn5.b(r7)
            r29 = r7
            java.lang.String r7 = "dataSourceRequest: "
            java.lang.String r8 = ", bTime: "
            r31 = r15
            java.lang.String r15 = ", fTime: "
            java.lang.StringBuilder r7 = defpackage.rae.r(r7, r12, r8, r13, r15)
            r7.append(r14)
            java.lang.String r8 = ", bCount: "
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = ", fCount: "
            r7.append(r8)
            r7.append(r0)
            java.lang.String r8 = ", bLimit: "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = ", fLimit: "
            r7.append(r5)
            r7.append(r9)
            java.lang.String r5 = r7.toString()
            r4.c(r5)
            goto L_0x0120
        L_0x011c:
            r29 = r7
            r31 = r15
        L_0x0120:
            java.lang.Integer r4 = r6.f
            if (r4 == 0) goto L_0x013a
            i04 r4 = r6.h
            java.lang.Object[] r4 = r4.b
            int r4 = r4.length
            r5 = 1
            if (r4 > r5) goto L_0x013b
            java.lang.Integer r0 = r6.f
            int r0 = r0.intValue()
            java.lang.Integer r3 = r6.f
            int r3 = r3.intValue()
            r7 = r3
            goto L_0x013d
        L_0x013a:
            r5 = 1
        L_0x013b:
            r7 = r0
            r0 = r3
        L_0x013d:
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x0168
            r12 = r28
            r13 = r1
            r15 = r31
            r16 = r0
            r17 = r7
            r20 = r29
            java.util.List r3 = r12.c(r13, r15, r16, r17, r18, r20)
            r27.q()
            if (r7 <= 0) goto L_0x0157
            r4 = r5
            goto L_0x0158
        L_0x0157:
            r4 = 0
        L_0x0158:
            if (r0 <= 0) goto L_0x015b
            goto L_0x015c
        L_0x015b:
            r5 = 0
        L_0x015c:
            r28 = r1
            r30 = r3
            r31 = r4
            r32 = r5
            r27.g(r28, r30, r31, r32)
            return
        L_0x0168:
            if (r0 <= 0) goto L_0x0183
            r17 = 0
            r20 = -1
            r12 = r28
            r13 = r1
            r15 = r31
            r16 = r0
            java.util.List r3 = r12.c(r13, r15, r16, r17, r18, r20)
            r27.q()
            r4 = 0
            r5 = 1
            r0 = r27
            r0.g(r1, r3, r4, r5)
        L_0x0183:
            if (r7 <= 0) goto L_0x01a7
            r21 = 0
            r23 = -1
            r17 = r28
            r18 = r10
            r20 = r22
            r22 = r7
            r25 = r29
            java.util.List r0 = r17.c(r18, r20, r21, r22, r23, r25)
            r27.q()
            r1 = 1
            r2 = 0
            r28 = r10
            r30 = r0
            r31 = r1
            r32 = r2
            r27.g(r28, r30, r31, r32)
        L_0x01a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz6.j(i74, long, boolean, boolean, boolean):void");
    }

    public final void k(i74 i74, long j2, boolean z, boolean z2) {
        j(i74, j2, z, z2, true);
        if (this.h.isEmpty() || (this.h.b.length == 1 && (CollectionsKt.firstOrNull(this.h) instanceof fz6))) {
            this.h.clear();
            vz6 vz6 = this.j;
            if (vz6 != null) {
                vz6.s();
            }
        }
    }

    public final void l(long j2) {
        int lastIndex;
        int i2 = 0;
        kn5 kn5 = this.e;
        if (kn5 != null) {
            kn5.c("loadEmptyChunksData: " + kn5.b(j2));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object next : this.b.c(j2, (gz6) null, IntCompanionObject.MAX_VALUE, IntCompanionObject.MAX_VALUE, Long.MIN_VALUE, LongCompanionObject.MAX_VALUE)) {
            if (hashSet.add(Long.valueOf(((gz6) next).getId()))) {
                arrayList.add(next);
            }
        }
        h(CollectionsKt.sortedWith(arrayList, ComparisonsKt.compareBy((Function1<? super T, ? extends Comparable<?>>[]) new Function1[]{xz6.a, yz6.a})));
        ArrayList arrayList2 = new ArrayList();
        int lastIndex2 = CollectionsKt.getLastIndex(this.h);
        if (lastIndex2 >= 0) {
            int i3 = 0;
            while (true) {
                gz6 gz6 = (gz6) this.h.b[i2];
                if (!(gz6 instanceof fz6)) {
                    if (i3 != i2) {
                        this.h.set(i3, gz6);
                    }
                    i3++;
                }
                if (i2 == lastIndex2) {
                    break;
                }
                i2++;
            }
            i2 = i3;
        }
        if (i2 < this.h.b.length && i2 <= (lastIndex = CollectionsKt.getLastIndex(this.h))) {
            while (true) {
                arrayList2.add(this.h.remove(lastIndex));
                if (lastIndex == i2) {
                    break;
                }
                lastIndex--;
            }
        }
        arrayList2.isEmpty();
        vz6 vz6 = this.j;
        if (vz6 != null) {
            vz6.s();
        }
    }

    public final void m(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (size > 0 && (list.get(size) instanceof fz6) && (list.get(size - 1) instanceof fz6)) {
                gz6 gz6 = (gz6) this.h.remove(size);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: gz6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: gz6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: gz6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: gz6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(long r7, long r9) {
        /*
            r6 = this;
            i04 r0 = r6.h
            int r1 = r0.size()
            java.util.ListIterator r1 = r0.listIterator(r1)
        L_0x000a:
            boolean r2 = r1.hasPrevious()
            r3 = 0
            if (r2 == 0) goto L_0x0025
            java.lang.Object r2 = r1.previous()
            r4 = r2
            gz6 r4 = (defpackage.gz6) r4
            boolean r5 = r4 instanceof defpackage.fz6
            if (r5 != 0) goto L_0x000a
            long r4 = r4.h()
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x000a
            goto L_0x0026
        L_0x0025:
            r2 = r3
        L_0x0026:
            gz6 r2 = (defpackage.gz6) r2
            java.util.Iterator r7 = r0.iterator()
        L_0x002c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0046
            java.lang.Object r8 = r7.next()
            r0 = r8
            gz6 r0 = (defpackage.gz6) r0
            boolean r1 = r0 instanceof defpackage.fz6
            if (r1 != 0) goto L_0x002c
            long r0 = r0.h()
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x002c
            r3 = r8
        L_0x0046:
            gz6 r3 = (defpackage.gz6) r3
            r6.o(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz6.n(long, long):void");
    }

    public final void o(gz6 gz6, gz6 gz62) {
        int i2;
        if (gz6 != null && gz62 != null) {
            Iterator it = this.h.iterator();
            int i3 = 0;
            while (true) {
                f04 f04 = (f04) it;
                i2 = -1;
                if (!f04.hasNext()) {
                    i3 = -1;
                    break;
                }
                gz6 gz63 = (gz6) f04.next();
                if (!(gz63 instanceof fz6) && gz63.getId() == gz6.getId()) {
                    break;
                }
                i3++;
            }
            i04 i04 = this.h;
            ListIterator listIterator = i04.listIterator(i04.b.length);
            while (true) {
                f04 f042 = (f04) listIterator;
                if (!f042.hasPrevious()) {
                    break;
                }
                gz6 gz64 = (gz6) f042.previous();
                if (!(gz64 instanceof fz6) && gz64.getId() == gz62.getId()) {
                    i2 = f042.b;
                    break;
                }
            }
            if (i3 >= 0 && i2 >= 0 && i3 <= i2) {
                while (true) {
                    if (this.h.b[i2] instanceof fz6) {
                        gz6 gz65 = (gz6) this.h.remove(i2);
                    }
                    if (i2 != i3) {
                        i2--;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [gz6, java.lang.Object] */
    public final void p() {
        boolean z;
        long g2 = d().g();
        d().getClass();
        int i2 = (g2 > -1 ? 1 : (g2 == -1 ? 0 : -1));
        i04 i04 = this.h;
        if (i2 != 0 && (!(i04 instanceof Collection) || !i04.isEmpty())) {
            Iterator it = i04.iterator();
            while (true) {
                f04 f04 = (f04) it;
                if (!f04.hasNext()) {
                    break;
                }
                gz6 gz6 = (gz6) f04.next();
                if (!(gz6 instanceof fz6) && gz6.getId() == g2) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        gz6 gz62 = (gz6) CollectionsKt.first(i04);
        kn5 kn5 = this.e;
        if (kn5 != null) {
            kn5.c("UpdateFirstGap: firstItemId=" + g2 + ", isLastGap=" + (gz62 instanceof fz6) + ", hasFirstBound=" + z);
        }
        if (z && (gz62 instanceof fz6)) {
            gz6 gz63 = (gz6) i04.remove(0);
        } else if (!z && !(gz62 instanceof fz6)) {
            a(0, new Object());
        }
    }

    public final void q() {
        dz6 d2 = d();
        dz6 k2 = this.a.k();
        this.i.setValue(this, k[0], k2);
        i04 i04 = this.h;
        if (!(i04 instanceof Collection) || !i04.isEmpty()) {
            Iterator it = i04.iterator();
            while (true) {
                f04 f04 = (f04) it;
                if (f04.hasNext()) {
                    if (!(((gz6) f04.next()) instanceof fz6)) {
                        p();
                        s();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        kn5 kn5 = this.e;
        if (kn5 != null && !ev0.l(d2, d())) {
            n54.z(kn5, d());
        }
    }

    public final void r(gz6 gz6) {
        int lastIndex = CollectionsKt.getLastIndex(this.h);
        while (true) {
            if (-1 >= lastIndex) {
                lastIndex = -1;
                break;
            } else if (((gz6) this.h.b[lastIndex]).getId() == gz6.getId()) {
                break;
            } else {
                lastIndex--;
            }
        }
        vz6 vz6 = this.j;
        if (lastIndex >= 0) {
            gz6 gz62 = (gz6) this.h.set(lastIndex, gz6);
            gz6 gz63 = (gz6) CollectionsKt.getOrNull(this.h, lastIndex - 1);
            boolean z = true;
            gz6 gz64 = (gz6) CollectionsKt.getOrNull(this.h, lastIndex + 1);
            if ((gz63 == null || d().c().compare(gz63, gz6) <= 0) && (gz64 == null || d().c().compare(gz6, gz64) >= 0)) {
                z = false;
            }
            if (z) {
                this.h.e(d().c());
            }
            if ((z || vz6 == null) && vz6 != null) {
                vz6.s();
                return;
            }
            return;
        }
        kn5 kn5 = this.e;
        if (kn5 != null) {
            kn5.c("WARN: updateHistoryItem: could not find history item by id!");
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [gz6, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s() {
        /*
            r8 = this;
            dz6 r0 = r8.d()
            long r0 = r0.h()
            dz6 r2 = r8.d()
            r2.getClass()
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0043
            i04 r2 = r8.h
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0022
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0022
            goto L_0x0043
        L_0x0022:
            java.util.Iterator r2 = r2.iterator()
        L_0x0026:
            r3 = r2
            f04 r3 = (defpackage.f04) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0043
            java.lang.Object r3 = r3.next()
            gz6 r3 = (defpackage.gz6) r3
            boolean r4 = r3 instanceof defpackage.fz6
            if (r4 != 0) goto L_0x0026
            long r3 = r3.getId()
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x0026
            r2 = 1
            goto L_0x0044
        L_0x0043:
            r2 = 0
        L_0x0044:
            i04 r3 = r8.h
            java.lang.Object r3 = kotlin.collections.CollectionsKt.last(r3)
            gz6 r3 = (defpackage.gz6) r3
            kn5 r4 = r8.e
            if (r4 == 0) goto L_0x0073
            boolean r5 = r3 instanceof defpackage.fz6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "UpdateLastGap: lastItemId="
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r0 = ", isLastGap="
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = ", hasLastBound="
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = r6.toString()
            r4.c(r0)
        L_0x0073:
            if (r2 == 0) goto L_0x007f
            boolean r0 = r3 instanceof defpackage.fz6
            if (r0 == 0) goto L_0x007f
            i04 r8 = r8.h
            r8.remove((java.lang.Object) r3)
            return
        L_0x007f:
            if (r2 != 0) goto L_0x0092
            boolean r0 = r3 instanceof defpackage.fz6
            if (r0 != 0) goto L_0x0092
            i04 r0 = r8.h
            java.lang.Object[] r0 = r0.b
            int r0 = r0.length
            fz6 r1 = new fz6
            r1.<init>()
            r8.a(r0, r1)
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz6.s():void");
    }
}
