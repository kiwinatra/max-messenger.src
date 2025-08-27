package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* renamed from: mld  reason: default package */
public final class mld implements pld {
    public final r62 a;
    public final km3 b;
    public final tld c;
    public final boolean d;
    public final pld e;
    public final pld f;

    public mld(r62 r62, km3 km3, tld tld, boolean z, nld nld, old old) {
        this.a = r62;
        this.b = km3;
        this.c = tld;
        this.d = z;
        this.e = nld;
        this.f = old;
    }

    public final List a(String str) {
        List a2;
        ArrayList arrayList = new ArrayList();
        pld pld = this.f;
        if (!(pld == null || (a2 = pld.a(str)) == null)) {
            arrayList.addAll(a2);
        }
        try {
            jz9 jz9 = new jz9((Object) null);
            jz9 jz92 = new jz9((Object) null);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            c(str, jz9, jz92, arrayList2, arrayList3);
            ArrayList b2 = b(str, this.d, jz9, jz92);
            arrayList.addAll(arrayList2);
            arrayList.addAll(b2);
            if (arrayList.size() > 1) {
                CollectionsKt.sortWith(arrayList, new ed7(11));
            }
            arrayList.addAll(arrayList3);
        } catch (Throwable th) {
            z68.f("Fts", "failure to search", th);
        }
        if (arrayList.isEmpty()) {
            try {
                arrayList.addAll(this.e.a(str));
            } catch (Throwable th2) {
                z68.f("Fts", "failure to search by fallback strategy", th2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: finally extract failed */
    public final ArrayList b(String str, boolean z, jz9 jz9, jz9 jz92) {
        List<Long> list;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2 = str;
        boolean z2 = z;
        ArrayList arrayList3 = new ArrayList();
        r62 r62 = this.a;
        f6d f6d = ((a74) ((s74) r62.l.get())).b;
        f6d.getClass();
        if (StringsKt.isBlank(str)) {
            list = CollectionsKt.emptyList();
        } else {
            si6 e2 = ti6.e(str);
            if (e2 == null) {
                list = CollectionsKt.emptyList();
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                ri6 ri6 = e2.a;
                ri6 ri62 = ri6.c;
                String str3 = ri6.a;
                String str4 = ri6.b;
                if (ri62 != null) {
                    hs2 c2 = f6d.c();
                    ri6 ri63 = ri6.c;
                    String str5 = ri63.a;
                    c2.getClass();
                    d7d a2 = d7d.a(4, "SELECT docid FROM chat_title WHERE originalTitle MATCH ? OR normalizedTitle MATCH ? OR normalizedTitleWithoutEmoji MATCH ? OR originalTitleWithoutEmoji MATCH ? || '*' ORDER BY sortTime DESC ");
                    if (str4 == null) {
                        a2.X(1);
                    } else {
                        a2.h(1, str4);
                    }
                    if (str3 == null) {
                        a2.X(2);
                    } else {
                        a2.h(2, str3);
                    }
                    if (str5 == null) {
                        a2.X(3);
                    } else {
                        a2.h(3, str5);
                    }
                    String str6 = ri63.b;
                    if (str6 == null) {
                        a2.X(4);
                    } else {
                        a2.h(4, str6);
                    }
                    i6d i6d = c2.a;
                    i6d.b();
                    Cursor o = i6d.o(a2, (CancellationSignal) null);
                    try {
                        arrayList = new ArrayList(o.getCount());
                        while (o.moveToNext()) {
                            arrayList.add(o.isNull(0) ? null : Long.valueOf(o.getLong(0)));
                        }
                    } finally {
                        o.close();
                        a2.o();
                    }
                } else {
                    hs2 c3 = f6d.c();
                    c3.getClass();
                    d7d a3 = d7d.a(2, "SELECT docid FROM chat_title WHERE originalTitle MATCH ? OR normalizedTitle MATCH ? || '*' ORDER BY sortTime DESC ");
                    if (str4 == null) {
                        a3.X(1);
                    } else {
                        a3.h(1, str4);
                    }
                    if (str3 == null) {
                        a3.X(2);
                    } else {
                        a3.h(2, str3);
                    }
                    i6d i6d2 = c3.a;
                    i6d2.b();
                    Cursor o2 = i6d2.o(a3, (CancellationSignal) null);
                    try {
                        ArrayList arrayList4 = new ArrayList(o2.getCount());
                        while (o2.moveToNext()) {
                            arrayList4.add(o2.isNull(0) ? null : Long.valueOf(o2.getLong(0)));
                        }
                        o2.close();
                        a3.o();
                        arrayList = arrayList4;
                    } catch (Throwable th) {
                        o2.close();
                        a3.o();
                        throw th;
                    }
                }
                linkedHashSet.addAll(arrayList);
                ri6 ri64 = e2.b;
                ri6 ri65 = ri64.c;
                String str7 = ri64.a;
                String str8 = ri64.b;
                if (ri65 != null) {
                    hs2 c4 = f6d.c();
                    ri6 ri66 = ri64.c;
                    String str9 = ri66.a;
                    c4.getClass();
                    d7d a4 = d7d.a(4, "SELECT docid FROM chat_title WHERE originalTitle LIKE ? OR normalizedTitle LIKE ? OR normalizedTitleWithoutEmoji LIKE ? OR originalTitleWithoutEmoji LIKE ? ORDER BY sortTime DESC ");
                    if (str8 == null) {
                        a4.X(1);
                    } else {
                        a4.h(1, str8);
                    }
                    if (str7 == null) {
                        a4.X(2);
                    } else {
                        a4.h(2, str7);
                    }
                    if (str9 == null) {
                        a4.X(3);
                    } else {
                        a4.h(3, str9);
                    }
                    String str10 = ri66.b;
                    if (str10 == null) {
                        a4.X(4);
                    } else {
                        a4.h(4, str10);
                    }
                    i6d i6d3 = c4.a;
                    i6d3.b();
                    Cursor o3 = i6d3.o(a4, (CancellationSignal) null);
                    try {
                        arrayList2 = new ArrayList(o3.getCount());
                        while (o3.moveToNext()) {
                            arrayList2.add(o3.isNull(0) ? null : Long.valueOf(o3.getLong(0)));
                        }
                    } finally {
                        o3.close();
                        a4.o();
                    }
                } else {
                    hs2 c5 = f6d.c();
                    c5.getClass();
                    d7d a5 = d7d.a(2, "SELECT docid FROM chat_title WHERE originalTitle LIKE ? OR normalizedTitle LIKE ? ORDER BY sortTime DESC ");
                    if (str8 == null) {
                        a5.X(1);
                    } else {
                        a5.h(1, str8);
                    }
                    if (str7 == null) {
                        a5.X(2);
                    } else {
                        a5.h(2, str7);
                    }
                    i6d i6d4 = c5.a;
                    i6d4.b();
                    Cursor o4 = i6d4.o(a5, (CancellationSignal) null);
                    try {
                        arrayList2 = new ArrayList(o4.getCount());
                        while (o4.moveToNext()) {
                            arrayList2.add(o4.isNull(0) ? null : Long.valueOf(o4.getLong(0)));
                        }
                    } finally {
                        o4.close();
                        a5.o();
                    }
                }
                linkedHashSet.addAll(arrayList2);
                list = CollectionsKt.toList(linkedHashSet);
            }
        }
        if (!cjf.B(list)) {
            EnumSet enumSet = z2 ? r62.M : r62.L;
            for (Long longValue : list) {
                a32 G = r62.G(longValue.longValue());
                if (G != null && r62.q(G, enumSet, z2, ((ltb) r62.n).e)) {
                    try {
                        if (G.E()) {
                            try {
                                if (jz92.a(G.a)) {
                                    jz9 jz93 = jz9;
                                } else {
                                    vk3 m = G.m();
                                    tld tld = this.c;
                                    if (m != null) {
                                        if (!jz9.a(m.r())) {
                                            arrayList3.add(tld.a(G, str2));
                                        }
                                    } else {
                                        jz9 jz94 = jz9;
                                    }
                                    arrayList3.add(tld.a(G, str2));
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                z68.f("r62", "iterateChatsByQuery fail", th);
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        jz9 jz95 = jz9;
                        jz9 jz96 = jz92;
                        z68.f("r62", "iterateChatsByQuery fail", th);
                    }
                }
                jz9 jz97 = jz9;
                jz9 jz98 = jz92;
            }
        }
        if (arrayList3.size() > 1) {
            CollectionsKt.sortWith(arrayList3, new ed7(10));
        }
        return arrayList3;
    }

    public final void c(String str, jz9 jz9, jz9 jz92, ArrayList arrayList, ArrayList arrayList2) {
        List<Long> list;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String str2 = str;
        km3 km3 = this.b;
        g6d g6d = ((a74) ((s74) km3.f.get())).d;
        g6d.getClass();
        if (StringsKt.isBlank(str)) {
            list = CollectionsKt.emptyList();
        } else {
            si6 e2 = ti6.e(str);
            if (e2 == null) {
                list = CollectionsKt.emptyList();
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                ri6 ri6 = e2.a;
                ri6 ri62 = ri6.c;
                String str3 = ri6.a;
                String str4 = ri6.b;
                if (ri62 != null) {
                    ht3 p = g6d.p();
                    ri6 ri63 = ri6.c;
                    String str5 = ri63.a;
                    p.getClass();
                    d7d a2 = d7d.a(5, "SELECT docid FROM contact_title WHERE (allOriginalTitles MATCH ? OR allNormalizedTitles MATCH ? OR link MATCH ? OR allNormalizedTitlesWithoutEmoji MATCH ? OR allOriginalTitlesWithoutEmoji MATCH ? || '*')");
                    if (str4 == null) {
                        a2.X(1);
                    } else {
                        a2.h(1, str4);
                    }
                    if (str3 == null) {
                        a2.X(2);
                    } else {
                        a2.h(2, str3);
                    }
                    if (str3 == null) {
                        a2.X(3);
                    } else {
                        a2.h(3, str3);
                    }
                    if (str5 == null) {
                        a2.X(4);
                    } else {
                        a2.h(4, str5);
                    }
                    String str6 = ri63.b;
                    if (str6 == null) {
                        a2.X(5);
                    } else {
                        a2.h(5, str6);
                    }
                    i6d i6d = p.a;
                    i6d.b();
                    Cursor o = i6d.o(a2, (CancellationSignal) null);
                    try {
                        arrayList3 = new ArrayList(o.getCount());
                        while (o.moveToNext()) {
                            arrayList3.add(o.isNull(0) ? null : Long.valueOf(o.getLong(0)));
                        }
                    } finally {
                        o.close();
                        a2.o();
                    }
                } else {
                    ht3 p2 = g6d.p();
                    p2.getClass();
                    d7d a3 = d7d.a(3, "SELECT docid FROM contact_title WHERE allOriginalTitles MATCH ? OR allNormalizedTitles MATCH ? OR link MATCH ?");
                    if (str4 == null) {
                        a3.X(1);
                    } else {
                        a3.h(1, str4);
                    }
                    if (str3 == null) {
                        a3.X(2);
                    } else {
                        a3.h(2, str3);
                    }
                    if (str3 == null) {
                        a3.X(3);
                    } else {
                        a3.h(3, str3);
                    }
                    i6d i6d2 = p2.a;
                    i6d2.b();
                    Cursor o2 = i6d2.o(a3, (CancellationSignal) null);
                    try {
                        arrayList3 = new ArrayList(o2.getCount());
                        while (o2.moveToNext()) {
                            arrayList3.add(o2.isNull(0) ? null : Long.valueOf(o2.getLong(0)));
                        }
                    } finally {
                        o2.close();
                        a3.o();
                    }
                }
                linkedHashSet.addAll(arrayList3);
                ri6 ri64 = e2.b;
                ri6 ri65 = ri64.c;
                String str7 = ri64.a;
                String str8 = ri64.b;
                if (ri65 != null) {
                    ht3 p3 = g6d.p();
                    ri6 ri66 = ri64.c;
                    String str9 = ri66.a;
                    p3.getClass();
                    d7d a4 = d7d.a(5, "SELECT docid FROM contact_title WHERE (allOriginalTitles LIKE ? OR allNormalizedTitles LIKE ? OR link LIKE ? OR allNormalizedTitlesWithoutEmoji LIKE ? OR allOriginalTitlesWithoutEmoji LIKE ?)");
                    if (str8 == null) {
                        a4.X(1);
                    } else {
                        a4.h(1, str8);
                    }
                    if (str7 == null) {
                        a4.X(2);
                    } else {
                        a4.h(2, str7);
                    }
                    if (str7 == null) {
                        a4.X(3);
                    } else {
                        a4.h(3, str7);
                    }
                    if (str9 == null) {
                        a4.X(4);
                    } else {
                        a4.h(4, str9);
                    }
                    String str10 = ri66.b;
                    if (str10 == null) {
                        a4.X(5);
                    } else {
                        a4.h(5, str10);
                    }
                    i6d i6d3 = p3.a;
                    i6d3.b();
                    Cursor o3 = i6d3.o(a4, (CancellationSignal) null);
                    try {
                        arrayList4 = new ArrayList(o3.getCount());
                        while (o3.moveToNext()) {
                            arrayList4.add(o3.isNull(0) ? null : Long.valueOf(o3.getLong(0)));
                        }
                    } finally {
                        o3.close();
                        a4.o();
                    }
                } else {
                    ht3 p4 = g6d.p();
                    p4.getClass();
                    d7d a5 = d7d.a(3, "SELECT docid FROM contact_title WHERE (allOriginalTitles LIKE ? OR allNormalizedTitles LIKE ? OR link LIKE ?)");
                    if (str8 == null) {
                        a5.X(1);
                    } else {
                        a5.h(1, str8);
                    }
                    if (str7 == null) {
                        a5.X(2);
                    } else {
                        a5.h(2, str7);
                    }
                    if (str7 == null) {
                        a5.X(3);
                    } else {
                        a5.h(3, str7);
                    }
                    i6d i6d4 = p4.a;
                    i6d4.b();
                    Cursor o4 = i6d4.o(a5, (CancellationSignal) null);
                    try {
                        arrayList4 = new ArrayList(o4.getCount());
                        while (o4.moveToNext()) {
                            arrayList4.add(o4.isNull(0) ? null : Long.valueOf(o4.getLong(0)));
                        }
                    } finally {
                        o4.close();
                        a5.o();
                    }
                }
                linkedHashSet.addAll(arrayList4);
                list = CollectionsKt.toList(linkedHashSet);
            }
        }
        if (!cjf.B(list)) {
            vk3 p5 = km3.p(((ltb) km3.h).a.s(), false);
            for (Long l : list) {
                vk3 vk3 = (vk3) km3.a.get(l);
                if (!(vk3 == null || p5 == null || vk3 == p5)) {
                    if (km3.t.contains(vk3.a.c.k)) {
                        try {
                            a32 K = this.a.K(vk3.r());
                            tld tld = this.c;
                            if (K == null || !K.E()) {
                                jz9 jz93 = jz9;
                                jz9 jz94 = jz92;
                                ArrayList arrayList5 = arrayList;
                                try {
                                    arrayList2.add(tld.b(vk3, str2));
                                } catch (Throwable th) {
                                    th = th;
                                }
                            } else {
                                try {
                                    arrayList.add(tld.a(K, str2));
                                } catch (Throwable th2) {
                                    th = th2;
                                    jz9 jz95 = jz9;
                                    jz9 jz96 = jz92;
                                    ArrayList arrayList6 = arrayList2;
                                    z68.f("km3", "iterateContactsByQuery fail", th);
                                }
                                try {
                                    jz92.e(K.a);
                                    jz9.e(vk3.r());
                                    ArrayList arrayList7 = arrayList2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    ArrayList arrayList62 = arrayList2;
                                    z68.f("km3", "iterateContactsByQuery fail", th);
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            jz9 jz97 = jz9;
                            jz9 jz98 = jz92;
                            ArrayList arrayList8 = arrayList;
                            ArrayList arrayList622 = arrayList2;
                            z68.f("km3", "iterateContactsByQuery fail", th);
                        }
                    }
                }
                jz9 jz99 = jz9;
                jz9 jz910 = jz92;
                ArrayList arrayList9 = arrayList;
                ArrayList arrayList72 = arrayList2;
            }
        }
    }
}
