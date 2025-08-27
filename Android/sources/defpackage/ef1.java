package defpackage;

import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ef1  reason: default package */
public final class ef1 {
    public final ye1 a;
    public final jc1 b;
    public final ata c;
    public final voc d;
    public final yu9 e;
    public final HashMap f = new HashMap();
    public final HashMap g = new HashMap();
    public final LongSparseArray h = new LongSparseArray();
    public ue1 i;
    public zwd j;
    public zwd k;

    public ef1(ye1 ye1, jc1 jc1, ata ata, voc voc) {
        this.a = ye1;
        this.b = jc1;
        this.c = ata;
        this.d = voc;
        yu9 yu9 = new yu9(10, false);
        yu9.b = SetsKt.emptySet();
        this.e = yu9;
        xwd xwd = xwd.a;
        this.j = xwd;
        this.k = xwd;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0095, code lost:
        r5 = (defpackage.mz9) r5.d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.he a(defpackage.v8b r12, defpackage.zwd r13) {
        /*
            r11 = this;
            ue1 r0 = r12.a
            ye1 r0 = r11.j(r0)
            java.util.HashMap r1 = r11.f
            java.util.HashMap r2 = r11.g
            android.util.LongSparseArray r3 = r11.h
            r4 = 1
            g8b r5 = r12.d
            g8b r6 = r12.c
            g8b r7 = r12.b
            ue1 r8 = r12.a
            if (r0 != 0) goto L_0x0062
            ye1 r0 = new ye1
            java.lang.Object r7 = r7.k()
            kotlin.Pair r7 = (kotlin.Pair) r7
            java.lang.Object r6 = r6.k()
            kz9 r6 = (defpackage.kz9) r6
            java.lang.Object r5 = r5.k()
            mz9 r5 = (defpackage.mz9) r5
            r0.<init>(r8, r7, r6, r5)
            ue1 r5 = r0.a
            if (r5 != 0) goto L_0x0033
            goto L_0x005e
        L_0x0033:
            java.lang.Object r6 = r1.get(r13)
            if (r6 != 0) goto L_0x0041
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            r1.put(r13, r6)
        L_0x0041:
            java.util.Map r6 = (java.util.Map) r6
            r6.put(r5, r0)
            r2.put(r5, r13)
            long r1 = r5.a
            java.lang.Object r13 = r3.get(r1)
            java.util.Set r13 = (java.util.Set) r13
            if (r13 != 0) goto L_0x005b
            java.util.LinkedHashSet r13 = new java.util.LinkedHashSet
            r13.<init>()
            r3.put(r1, r13)
        L_0x005b:
            r13.add(r5)
        L_0x005e:
            r13 = 0
            r6 = r4
            goto L_0x0123
        L_0x0062:
            boolean r9 = r7.h()
            if (r9 == 0) goto L_0x0071
            java.lang.Object r7 = r7.d()
            kotlin.Pair r7 = (kotlin.Pair) r7
            r0.e(r7)
        L_0x0071:
            boolean r7 = r6.h()
            if (r7 == 0) goto L_0x008f
            java.lang.Object r6 = r6.d()
            kz9 r6 = (defpackage.kz9) r6
            ft8 r7 = r6.a
            kz9 r9 = r0.b
            r9.a = r7
            ft8 r7 = r6.b
            r9.b = r7
            ft8 r7 = r6.c
            r9.c = r7
            ft8 r6 = r6.d
            r9.d = r6
        L_0x008f:
            boolean r6 = r5.h()
            if (r6 == 0) goto L_0x00da
            java.lang.Object r5 = r5.d()
            mz9 r5 = (defpackage.mz9) r5
            mz9 r6 = r0.c
            boolean r7 = r6.e
            boolean r9 = r5.e
            if (r7 != r9) goto L_0x00c1
            boolean r7 = r6.f
            boolean r10 = r5.f
            if (r7 != r10) goto L_0x00c1
            boolean r7 = r6.b
            boolean r10 = r5.b
            if (r7 != r10) goto L_0x00c1
            boolean r7 = r6.g
            boolean r10 = r5.g
            if (r7 != r10) goto L_0x00c1
            boolean r7 = r6.c
            boolean r10 = r5.c
            if (r7 != r10) goto L_0x00c1
            boolean r7 = r6.d
            boolean r10 = r5.d
            if (r7 == r10) goto L_0x00da
        L_0x00c1:
            r6.e = r9
            boolean r7 = r5.f
            r6.f = r7
            boolean r7 = r5.b
            r6.b = r7
            boolean r7 = r5.g
            r6.g = r7
            boolean r7 = r5.c
            r6.c = r7
            boolean r5 = r5.d
            r6.d = r5
            r6.a()
        L_0x00da:
            java.lang.Object r5 = r2.get(r8)
            zwd r5 = (defpackage.zwd) r5
            if (r5 != 0) goto L_0x00e4
            zwd r5 = r11.k
        L_0x00e4:
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r13)
            r6 = r6 ^ r4
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r13)
            if (r7 != 0) goto L_0x0122
            r11.b(r8, r5)
            ue1 r7 = r0.a
            if (r7 != 0) goto L_0x00f7
            goto L_0x0122
        L_0x00f7:
            java.lang.Object r9 = r1.get(r13)
            if (r9 != 0) goto L_0x0105
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            r1.put(r13, r9)
        L_0x0105:
            java.util.Map r9 = (java.util.Map) r9
            r9.put(r7, r0)
            r2.put(r7, r13)
            long r1 = r7.a
            java.lang.Object r13 = r3.get(r1)
            java.util.Set r13 = (java.util.Set) r13
            if (r13 != 0) goto L_0x011f
            java.util.LinkedHashSet r13 = new java.util.LinkedHashSet
            r13.<init>()
            r3.put(r1, r13)
        L_0x011f:
            r13.add(r7)
        L_0x0122:
            r13 = r5
        L_0x0123:
            ue1 r11 = r11.i
            if (r8 != r11) goto L_0x0129
            r0.o = r4
        L_0x0129:
            g8b r11 = r12.e
            boolean r1 = r11.h()
            if (r1 == 0) goto L_0x013f
            java.lang.Object r11 = r11.d()
            java.util.List r11 = (java.util.List) r11
            java.util.ArrayList r1 = r0.d
            r1.clear()
            r1.addAll(r11)
        L_0x013f:
            g8b r11 = r12.f
            boolean r1 = r11.h()
            if (r1 == 0) goto L_0x014f
            java.lang.Object r11 = r11.d()
            e51 r11 = (defpackage.e51) r11
            r0.p = r11
        L_0x014f:
            g8b r11 = r12.g
            boolean r12 = r11.h()
            if (r12 == 0) goto L_0x015f
            java.lang.Object r11 = r11.d()
            java.util.List r11 = (java.util.List) r11
            r0.q = r11
        L_0x015f:
            he r11 = new he
            r11.<init>((defpackage.ye1) r0, (boolean) r6, (defpackage.zwd) r13)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ef1.a(v8b, zwd):he");
    }

    public final ye1 b(ue1 ue1, zwd zwd) {
        HashMap hashMap = this.g;
        zwd zwd2 = (zwd) hashMap.get(ue1);
        if (zwd2 == null) {
            return null;
        }
        if (Intrinsics.areEqual((Object) zwd2, (Object) zwd)) {
            long j2 = ue1.a;
            LongSparseArray longSparseArray = this.h;
            Set set = (Set) longSparseArray.get(j2);
            if (set != null) {
                set.remove(ue1);
                if (set.isEmpty()) {
                    longSparseArray.remove(j2);
                }
            }
            hashMap.remove(ue1);
            HashMap hashMap2 = this.f;
            Object obj = hashMap2.get(zwd);
            if (obj == null) {
                obj = new LinkedHashMap();
                hashMap2.put(zwd, obj);
            }
            return (ye1) ((Map) obj).remove(ue1);
        }
        this.d.log("CallParticipants", "Tried to remove " + ue1 + " from " + zwd + " but participant is in " + zwd2);
        return null;
    }

    public final zwd c(ue1 ue1) {
        zwd zwd = (zwd) this.g.get(ue1);
        return zwd == null ? Intrinsics.areEqual((Object) ue1, (Object) this.a.a) ? this.k : xwd.a : zwd;
    }

    public final Map d(zwd zwd) {
        HashMap hashMap = this.f;
        Object obj = hashMap.get(zwd);
        if (obj == null) {
            obj = new LinkedHashMap();
            hashMap.put(zwd, obj);
        }
        return (Map) obj;
    }

    public final void e(zwd zwd, List list) {
        boolean areEqual = Intrinsics.areEqual((Object) zwd, (Object) this.k);
        jc1 jc1 = this.b;
        if (areEqual) {
            jc1.a.onActiveParticipantsChanged(new nz0(list, d(this.k).values()));
        }
        jc1.c.onCallParticipantsChanged(new gf1(list));
    }

    public final ye1 f(v8b v8b, zwd zwd) {
        return (ye1) CollectionsKt.first(g(zwd, CollectionsKt.listOf(v8b)));
    }

    public final ArrayList g(zwd zwd, List list) {
        jc1 jc1;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v8b v8b = (v8b) it.next();
            zwd c2 = zwd == null ? c(v8b.a) : zwd;
            he a2 = a(v8b, c2);
            ye1 ye1 = (ye1) a2.c;
            arrayList.add(ye1);
            if (a2.b) {
                Object obj = linkedHashMap.get(c2);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(c2, obj);
                }
                ((List) obj).add(ye1);
            } else {
                Object obj2 = linkedHashMap2.get(c2);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap2.put(c2, obj2);
                }
                ((List) obj2).add(ye1);
            }
            zwd zwd2 = (zwd) a2.o;
            if (zwd2 != null && !Intrinsics.areEqual((Object) zwd2, (Object) c2)) {
                Object obj3 = linkedHashMap3.get(zwd2);
                if (obj3 == null) {
                    obj3 = new ArrayList();
                    linkedHashMap3.put(zwd2, obj3);
                }
                ((List) obj3).add(ye1);
            }
        }
        Iterator it2 = linkedHashMap3.keySet().iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            jc1 = this.b;
            if (!hasNext) {
                break;
            }
            zwd zwd3 = (zwd) it2.next();
            List list2 = (List) linkedHashMap3.get(zwd3);
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            if (Intrinsics.areEqual((Object) zwd3, (Object) this.k)) {
                jc1.a.onActiveParticipantsRemoved(new pz0(list2, d(this.k).values()));
            }
            jc1.c.onCallParticipantsRemoved(new if1(list2));
        }
        for (zwd zwd4 : linkedHashMap.keySet()) {
            List list3 = (List) linkedHashMap.get(zwd4);
            if (list3 == null) {
                list3 = CollectionsKt.emptyList();
            }
            if (Intrinsics.areEqual((Object) zwd4, (Object) this.k)) {
                jc1.a.onActiveParticipantsAdded(new mz0(list3, d(this.k).values()));
            }
            jc1.c.onCallParticipantsAdded(new ff1(zwd4, list3));
        }
        for (zwd zwd5 : linkedHashMap2.keySet()) {
            List list4 = (List) linkedHashMap2.get(zwd5);
            if (list4 == null) {
                list4 = CollectionsKt.emptyList();
            }
            e(zwd5, list4);
        }
        return arrayList;
    }

    public final void h() {
        ArrayList arrayList = new ArrayList(d(this.k).values());
        yu9 yu9 = this.e;
        yu9.getClass();
        yu9.b = SetsKt.emptySet();
        this.i = null;
        this.f.clear();
        this.g.clear();
        this.h.clear();
        this.b.a.onActiveParticipantsRemoved(new pz0(arrayList, CollectionsKt.emptyList()));
        this.c.clear();
    }

    public final Collection i() {
        return d(this.k).values();
    }

    public final ye1 j(ue1 ue1) {
        ye1 ye1 = this.a;
        ue1 ue12 = ye1.a;
        if (ue12 != null && ue12.equals(ue1)) {
            return ye1;
        }
        zwd zwd = (zwd) this.g.get(ue1);
        if (zwd != null) {
            return (ye1) d(zwd).get(ue1);
        }
        return null;
    }

    public final boolean k(ye1 ye1) {
        if (ye1 != null) {
            ue1 ue1 = ye1.a;
            if ((ue1 != null ? j(ue1) : null) != null) {
                return true;
            }
        }
        return false;
    }

    public final void l(ue1 ue1, Pair pair, String str, String str2) {
        ye1 j2 = j(ue1);
        if (j2 != null && pair != null) {
            HashMap hashMap = j2.f;
            boolean isEmpty = hashMap.isEmpty();
            hashMap.put(pair, new Pair(str, str2));
            if (Objects.equals(j2.j, pair)) {
                j2.l = str;
                j2.k = str2;
            }
            if (isEmpty && j2.j == null) {
                zwd zwd = (zwd) this.g.get(ue1);
                if (zwd == null) {
                    zwd = this.k;
                }
                e(zwd, CollectionsKt.listOf(j2));
            }
        }
    }

    public final List m(zwd zwd, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ue1 ue1 = (ue1) it.next();
            zwd c2 = zwd == null ? c(ue1) : zwd;
            ye1 b2 = b(ue1, c2);
            if (b2 != null) {
                Object obj = linkedHashMap.get(c2);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(c2, obj);
                }
                ((List) obj).add(b2);
            }
        }
        for (zwd zwd2 : linkedHashMap.keySet()) {
            List list2 = (List) linkedHashMap.get(zwd2);
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            boolean areEqual = Intrinsics.areEqual((Object) zwd2, (Object) this.k);
            jc1 jc1 = this.b;
            if (areEqual) {
                jc1.a.onActiveParticipantsRemoved(new pz0(list2, d(this.k).values()));
            }
            jc1.c.onCallParticipantsRemoved(new if1(list2));
        }
        return CollectionsKt.flatten(linkedHashMap.values());
    }

    public final void n(zwd zwd) {
        zwd zwd2 = this.k;
        this.k = zwd;
        if (!Intrinsics.areEqual((Object) zwd2, (Object) zwd)) {
            this.b.a.onActiveParticipantUpdated(new qz0(d(zwd2).values(), d(zwd).values(), zwd, zwd instanceof ywd ? this.c.v((ywd) zwd) : null, this.a));
        }
    }

    public final void o(ue1 ue1) {
        if (ue1 != this.i) {
            ArrayList arrayList = new ArrayList();
            ue1 ue12 = this.i;
            ye1 ye1 = null;
            ye1 j2 = ue12 != null ? j(ue12) : null;
            if (j2 != null) {
                boolean c2 = j2.c();
                j2.o = false;
                if (c2 != j2.c()) {
                    arrayList.add(j2);
                }
            }
            if (ue1 != null) {
                ye1 = j(ue1);
            }
            if (ye1 != null) {
                boolean c3 = ye1.c();
                ye1.o = true;
                if (c3 != ye1.c()) {
                    arrayList.add(ye1);
                }
            }
            e(this.k, arrayList);
            this.i = ue1;
        }
    }

    public final void p(zwd zwd) {
        zwd zwd2 = this.j;
        this.j = zwd;
        if (!Intrinsics.areEqual((Object) zwd2, (Object) zwd)) {
            this.b.f.onCurrentParticipantInvitedToRoom(new uj1(this.a, zwd, zwd instanceof ywd ? this.c.v((ywd) zwd) : null));
        }
    }

    public final void q(ArrayList arrayList) {
        Map d2 = d(this.k);
        yu9 yu9 = this.e;
        yu9.getClass();
        HashSet hashSet = new HashSet(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ye1 ye1 = (ye1) d2.get((ue1) it.next());
            if (ye1 != null) {
                boolean d3 = ye1.d();
                ye1.n = true;
                if (d3 != ye1.d()) {
                    arrayList2.add(ye1);
                }
            }
        }
        for (ue1 ue1 : (Set) yu9.b) {
            ye1 ye12 = (ye1) d2.get(ue1);
            if (ye12 != null && !hashSet.contains(ue1)) {
                boolean d4 = ye12.d();
                ye12.n = false;
                if (d4 != ye12.d()) {
                    arrayList2.add(ye12);
                }
            }
        }
        yu9.b = hashSet;
        e(this.k, arrayList2);
    }

    public final int r() {
        Map map = (Map) this.f.get(this.k);
        if (map != null) {
            return map.size();
        }
        return 0;
    }
}
