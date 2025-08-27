package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: nld  reason: default package */
public final class nld implements pld {
    public final r62 a;
    public final km3 b;
    public final ns3 c;
    public final tld d;
    public final boolean e;

    public nld(r62 r62, km3 km3, ns3 ns3, tld tld, boolean z) {
        this.a = r62;
        this.b = km3;
        this.c = ns3;
        this.d = tld;
        this.e = z;
    }

    public final List a(String str) {
        List list;
        tld tld;
        jz9 jz9 = new jz9((Object) null);
        boolean z = this.e;
        r62 r62 = this.a;
        if (z) {
            v00 v00 = r62.I;
            ArrayList H = r62.H(r62.M, true, (osb) null);
            Collections.sort(H, v00);
            list = Collections.unmodifiableList(H);
        } else {
            list = r62.I(r62.I);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            tld = this.d;
            if (!hasNext) {
                break;
            }
            Object next = it.next();
            if (tld.f((a32) next, str)) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new ed7(12));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            a32 a32 = (a32) it2.next();
            vk3 m = a32.m();
            if (m != null) {
                jz9.e(m.r());
            }
            arrayList2.add(tld.a(a32, str));
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        ArrayList arrayList4 = new ArrayList();
        for (Object next2 : this.b.s()) {
            vk3 vk3 = (vk3) next2;
            if (!jz9.a(vk3.r()) && tld.g(vk3, str)) {
                arrayList4.add(next2);
            }
        }
        ns3 ns3 = this.c;
        ns3.getClass();
        CollectionsKt.sortWith(arrayList4, new ls3(ns3, 0));
        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            arrayList5.add(tld.b((vk3) it3.next(), str));
        }
        arrayList3.addAll(arrayList5);
        return arrayList3;
    }
}
