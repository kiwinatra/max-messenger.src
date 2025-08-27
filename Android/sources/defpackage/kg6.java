package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.ranges.RangesKt;
import ru.ok.messages.channels.FrgChatMembers;

/* renamed from: kg6  reason: default package */
public final /* synthetic */ class kg6 implements oj2, nsb, u2f {
    public final /* synthetic */ FrgChatMembers a;

    public /* synthetic */ kg6(FrgChatMembers frgChatMembers) {
        this.a = frgChatMembers;
    }

    public Object get() {
        FrgChatMembers frgChatMembers = this.a;
        return ((pj2) frgChatMembers.q1.getAccessor().g(pj2.class)).a(frgChatMembers.B1.a, frgChatMembers.C1);
    }

    public void s() {
        HashSet hashSet;
        FrgChatMembers frgChatMembers = this.a;
        frgChatMembers.n3();
        if (frgChatMembers.C1 == ij2.ADMIN) {
            boolean z = !frgChatMembers.T1;
            if (z) {
                frgChatMembers.T1 = true;
            }
            a32 a32 = frgChatMembers.B1;
            km3 i = frgChatMembers.q1.i();
            if (a32.N() || (!a32.e0() && !a32.c0())) {
                hashSet = Collections.emptySet();
            } else {
                Map map = a32.b.R;
                Set<Long> keySet = map.keySet();
                HashSet hashSet2 = new HashSet();
                if (map.isEmpty()) {
                    for (Long l : keySet) {
                        if (l != null && l.longValue() > 0) {
                            if (z) {
                                if (i.l(l.longValue())) {
                                }
                            } else if (i.p(l.longValue(), false) != null) {
                            }
                            hashSet2.add(l);
                        }
                    }
                    hashSet = hashSet2;
                } else {
                    for (Map.Entry entry : map.entrySet()) {
                        Long l2 = (Long) entry.getKey();
                        v62 v62 = (v62) entry.getValue();
                        if (!(l2 == null || l2.longValue() <= 0 || v62 == null)) {
                            if (!z ? i.p(l2.longValue(), false) == null : !i.l(l2.longValue())) {
                                hashSet2.add(l2);
                            }
                            long j = v62.c;
                            if (j <= 0 || !z) {
                                if (i.p(j, false) != null) {
                                }
                            } else if (i.l(j)) {
                            }
                            hashSet2.add(Long.valueOf(j));
                        }
                    }
                    hashSet = hashSet2;
                }
            }
            HashSet hashSet3 = new HashSet(hashSet);
            Iterator it = frgChatMembers.E1.iterator();
            while (it.hasNext()) {
                long j2 = ((bj2) it.next()).a.a;
                if (j2 <= 0 || !z) {
                    if (frgChatMembers.q1.i().p(j2, false) != null) {
                    }
                } else if (frgChatMembers.q1.i().l(j2)) {
                }
                hashSet3.add(Long.valueOf(j2));
            }
            if (!hashSet3.isEmpty()) {
                rl d = frgChatMembers.q1.d();
                ArrayList arrayList = new ArrayList(hashSet3);
                jna jna = (jna) d;
                jna.getClass();
                if (arrayList.isEmpty()) {
                    MapsKt.emptyMap();
                    return;
                }
                Iterable A = CollectionsKt___CollectionsKt.windowed(arrayList, 100, 100, true);
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(A, 10)), 16));
                for (Object next : A) {
                    linkedHashMap.put(Long.valueOf(jna.z(jna, new go3(((ltb) jna.D()).a.n(), CollectionsKt.toLongArray((List) next), 0))), next);
                }
            }
        }
    }

    public boolean test(Object obj) {
        return this.a.D1 == ng6.b && ((bj2) obj).a.c();
    }
}
