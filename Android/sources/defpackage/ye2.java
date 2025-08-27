package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.chat.FrgChatMediaLoader;

/* renamed from: ye2  reason: default package */
public final class ye2 {
    public final long a;
    public final long b;
    public final boolean c;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Set f;
    public final Set g;
    public final lfd h;
    public final lfd i;
    public final lfd j;
    public boolean k;
    public boolean l;
    public long m;
    public long n;
    public final Set o = Collections.newSetFromMap(new WeakHashMap());
    public final sv0 p;
    public final r62 q;
    public final fa9 r;
    public final ed2 s;
    public final esb t;
    public final gb9 u;

    public ye2(long j2, Long l2, boolean z, HashSet hashSet, sv0 sv0, r62 r62, fa9 fa9, ed2 ed2, esb esb, gb9 gb9, lfd lfd, lfd lfd2, lfd lfd3) {
        this.p = sv0;
        this.q = r62;
        this.r = fa9;
        this.s = ed2;
        this.t = esb;
        this.u = gb9;
        this.a = j2;
        this.c = z;
        this.b = l2.longValue();
        this.f = hashSet;
        this.g = d(hashSet);
        this.h = lfd;
        this.i = lfd2;
        this.j = lfd3;
        z68.c("ye2", "newInstance: chatId = " + j2 + ", initialMessageId = " + l2, new Object[0]);
    }

    public static Set d(Set set) {
        return e19.a.equals(set) ? b10.z0 : e19.b.equals(set) ? b10.C0 : e19.c.equals(set) ? b10.D0 : e19.d.equals(set) ? b10.A0 : e19.f.equals(set) ? b10.E0 : e19.e.equals(set) ? b10.B0 : e19.g.equals(set) ? b10.F0 : Collections.emptySet();
    }

    public final ArrayList a(List list, boolean z) {
        HashSet hashSet;
        z68.c("ye2", "addMessages count = " + list.size(), new Object[0]);
        if (!this.c) {
            Collections.reverse(list);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashSet = this.e;
            if (!hasNext) {
                break;
            }
            a89 a89 = (a89) it.next();
            if (!a89.a.v() && !hashSet.contains(Long.valueOf(a89.a.b))) {
                arrayList.add(a89);
            }
        }
        z68.c("ye2", "addMessages count after checkExists = " + arrayList.size(), new Object[0]);
        if (arrayList.size() > 0) {
            ArrayList arrayList2 = this.d;
            if (z) {
                arrayList2.addAll(arrayList);
            } else {
                arrayList2.addAll(0, arrayList);
            }
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                try {
                    arrayList3.add(Long.valueOf(((a89) it2.next()).a.b));
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            hashSet.addAll(arrayList3);
        }
        return arrayList;
    }

    public final void b(boolean z) {
        new mka(1, new ue2(this, z)).n(this.j).j(this.h).l(new ao1(3, new ue2(this, z), m58.g));
    }

    public final void c() {
        Set<xe2> set = this.o;
        if (set != null) {
            for (xe2 xe2 : set) {
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final ve2 e(boolean z) {
        f72 f72;
        d7d d7d;
        String str;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        String str2;
        int i5;
        String str3;
        int i6;
        int i7;
        int i8;
        byte[] bArr;
        Long l2;
        int i9;
        Boolean bool;
        long j2 = this.a;
        r62 r62 = this.q;
        a32 G = r62.G(j2);
        if (G == null) {
            return new ve2(Collections.emptyList(), false, false, 0, 100, 0);
        }
        m72 m72 = G.b;
        Set set = this.g;
        z62 N = r62.N(m72, set);
        boolean R = r62.R(m72, set);
        ed2 ed2 = this.s;
        if (R && N.a != null) {
            ed2.getClass();
            f72 f722 = N.a;
            long j3 = f722.a;
            aj9 d2 = ((a74) ed2.c.a).c.d();
            sq6 sq6 = qe9.b;
            d2.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND media_type in (");
            Set<Integer> set2 = this.f;
            int size = set2.size();
            n79.c(sb, size);
            sb.append(") AND inserted_from_msg_link = 0 AND status <> ");
            sb.append("?");
            int i10 = size + 4;
            d7d a2 = d7d.a(i10, sb.toString());
            a2.k(1, j2);
            a2.k(2, j3);
            a2.k(3, f722.b);
            int i11 = 4;
            for (Integer num : set2) {
                if (num == null) {
                    a2.X(i11);
                } else {
                    a2.k(i11, (long) num.intValue());
                }
                i11++;
            }
            d2.a().getClass();
            a2.k(i10, (long) 10);
            i6d i6d = d2.a;
            i6d.b();
            Cursor o2 = i6d.o(a2, (CancellationSignal) null);
            try {
                long j4 = o2.moveToFirst() ? o2.getLong(0) : 0;
                o2.close();
                a2.o();
                if (j4 == 0) {
                    z68.c("ed2", "clearMediaChunkIfEmpty: empty chunk removed", new Object[0]);
                    r62 r622 = ed2.b;
                    r622.getClass();
                    r622.i(j2, false, new u00((Object) r622, (Object) set, (Object) null, 3));
                    a32 G2 = r62.G(j2);
                    if (G2 == null) {
                        return null;
                    }
                    N = r62.N(G2.b, set);
                    G = G2;
                }
            } catch (Throwable th) {
                o2.close();
                a2.o();
                throw th;
            }
        }
        if (!r62.R(G.b, set) || (f72 = N.a) == null) {
            z68.c("ye2", "obsLoadNetwork: requestMediaBackward from last", new Object[0]);
            this.n = ed2.a(G, (ha9) null, false, set);
            return new ve2(Collections.emptyList(), false, true, 0, 100, 0);
        }
        fa9 fa9 = this.r;
        if (z) {
            long j5 = N.c;
            if (j5 > 0) {
                ha9 r2 = fa9.r(j5);
                if (r2 != null && hd8.G(r2.o, f72)) {
                    return new ve2(Collections.emptyList(), false, false, 0, 100, 0);
                }
                ha9 s2 = fa9.s(j2, f72.a);
                z68.c("ye2", "obsLoadNetwork: requestMediaBackward from after chunk start %s, message=%s", hd8.L(f72), s2);
                this.n = ed2.a(G, s2, false, set);
                return new ve2(Collections.emptyList(), false, true, 0, 100, 0);
            }
            ha9 s3 = fa9.s(j2, f72.a);
            z68.c("ye2", "obsLoadNetwork: requestMediaBackward from after chunk start %s, message=%s", hd8.L(f72), s3);
            this.n = ed2.a(G, s3, false, set);
            return new ve2(Collections.emptyList(), false, true, 0, 100, 0);
        }
        ha9 p2 = fa9.p(j2);
        if (p2 != null && hd8.G(p2.o, f72)) {
            return new ve2(Collections.emptyList(), true, false, 100, 0, 0);
        }
        long j6 = f72.b;
        z6d z6d = ((a74) fa9.a).c;
        aj9 d3 = z6d.d();
        sq6 sq62 = qe9.b;
        d3.getClass();
        d7d a3 = d7d.a(4, "SELECT * FROM messages WHERE chat_id = ? AND time <= ? AND inserted_from_msg_link = 0 AND status <> ? ORDER BY time DESC LIMIT ?");
        a3.k(1, j2);
        i2a.o(a3, 2, j6, d3);
        a3.k(3, (long) 10);
        a3.k(4, (long) 1);
        i6d i6d2 = d3.a;
        i6d2.b();
        Cursor o3 = i6d2.o(a3, (CancellationSignal) null);
        try {
            int u2 = kne.u(o3, "id");
            int u3 = kne.u(o3, "server_id");
            int u4 = kne.u(o3, "time");
            int u5 = kne.u(o3, "update_time");
            int u6 = kne.u(o3, "sender");
            int u7 = kne.u(o3, "cid");
            int u8 = kne.u(o3, "text");
            a32 a32 = G;
            int u9 = kne.u(o3, "delivery_status");
            Set set3 = set;
            int u10 = kne.u(o3, "status");
            ed2 ed22 = ed2;
            int u11 = kne.u(o3, "time_local");
            String str4 = "ye2";
            int u12 = kne.u(o3, "error");
            f72 f723 = f72;
            int u13 = kne.u(o3, "localized_error");
            z6d z6d2 = z6d;
            int u14 = kne.u(o3, "attaches");
            d7d = a3;
            try {
                int u15 = kne.u(o3, "media_type");
                int u16 = kne.u(o3, "detect_share");
                int u17 = kne.u(o3, "msg_link_type");
                int u18 = kne.u(o3, "msg_link_id");
                int u19 = kne.u(o3, "inserted_from_msg_link");
                int u20 = kne.u(o3, "msg_link_chat_id");
                int u21 = kne.u(o3, "msg_link_chat_name");
                int u22 = kne.u(o3, "msg_link_chat_link");
                int u23 = kne.u(o3, "msg_link_out_chat_id");
                int u24 = kne.u(o3, "msg_link_out_msg_id");
                int u25 = kne.u(o3, "type");
                int u26 = kne.u(o3, "chat_id");
                int u27 = kne.u(o3, "ttl");
                int u28 = kne.u(o3, "channel_views");
                int u29 = kne.u(o3, "channel_forwards");
                int u30 = kne.u(o3, "view_time");
                int u31 = kne.u(o3, "zoom");
                int u32 = kne.u(o3, "options");
                int u33 = kne.u(o3, "live_until");
                int u34 = kne.u(o3, "elements");
                int u35 = kne.u(o3, "reactions");
                int u36 = kne.u(o3, "delayed_attrs_time_to_fire");
                int u37 = kne.u(o3, "delayed_attrs_notify_sender");
                int i12 = u14;
                ArrayList arrayList = new ArrayList(o3.getCount());
                while (o3.moveToNext()) {
                    long j7 = o3.getLong(u2);
                    long j8 = o3.getLong(u3);
                    long j9 = o3.getLong(u4);
                    long j10 = o3.getLong(u5);
                    long j11 = o3.getLong(u6);
                    long j12 = o3.getLong(u7);
                    String string = o3.isNull(u8) ? null : o3.getString(u8);
                    int i13 = o3.getInt(u9);
                    d3.a().getClass();
                    oa9.b.getClass();
                    oa9 n2 = cd4.n(i13);
                    int i14 = o3.getInt(u10);
                    d3.a().getClass();
                    qe9.b.getClass();
                    qe9 D = sq6.D(i14);
                    long j13 = o3.getLong(u11);
                    String string2 = o3.isNull(u12) ? null : o3.getString(u12);
                    if (o3.isNull(u13)) {
                        i2 = i12;
                        str = null;
                    } else {
                        str = o3.getString(u13);
                        i2 = i12;
                    }
                    byte[] blob = o3.isNull(i2) ? null : o3.getBlob(i2);
                    d3.a().getClass();
                    w28 b2 = qe8.b(blob);
                    int i15 = u8;
                    int i16 = u15;
                    int i17 = o3.getInt(i16);
                    u15 = i16;
                    int i18 = u16;
                    if (o3.getInt(i18) != 0) {
                        u16 = i18;
                        i3 = u17;
                        z2 = true;
                    } else {
                        u16 = i18;
                        i3 = u17;
                        z2 = false;
                    }
                    int i19 = o3.getInt(i3);
                    u17 = i3;
                    int i20 = u18;
                    long j14 = o3.getLong(i20);
                    u18 = i20;
                    int i21 = u19;
                    if (o3.getInt(i21) != 0) {
                        u19 = i21;
                        i4 = u20;
                        z3 = true;
                    } else {
                        u19 = i21;
                        i4 = u20;
                        z3 = false;
                    }
                    long j15 = o3.getLong(i4);
                    u20 = i4;
                    int i22 = u21;
                    if (o3.isNull(i22)) {
                        u21 = i22;
                        i5 = u22;
                        str2 = null;
                    } else {
                        str2 = o3.getString(i22);
                        u21 = i22;
                        i5 = u22;
                    }
                    if (o3.isNull(i5)) {
                        u22 = i5;
                        i6 = u23;
                        str3 = null;
                    } else {
                        str3 = o3.getString(i5);
                        u22 = i5;
                        i6 = u23;
                    }
                    long j16 = o3.getLong(i6);
                    u23 = i6;
                    int i23 = u24;
                    long j17 = o3.getLong(i23);
                    u24 = i23;
                    int i24 = u25;
                    int i25 = o3.getInt(i24);
                    d3.a().getClass();
                    int c2 = wj6.c(i25);
                    u25 = i24;
                    int i26 = u26;
                    long j18 = o3.getLong(i26);
                    u26 = i26;
                    int i27 = u27;
                    int i28 = o3.getInt(i27);
                    u27 = i27;
                    int i29 = u28;
                    int i30 = o3.getInt(i29);
                    u28 = i29;
                    int i31 = u29;
                    int i32 = o3.getInt(i31);
                    u29 = i31;
                    int i33 = u30;
                    long j19 = o3.getLong(i33);
                    u30 = i33;
                    int i34 = u31;
                    int i35 = o3.getInt(i34);
                    u31 = i34;
                    int i36 = u32;
                    int i37 = o3.getInt(i36);
                    u32 = i36;
                    int i38 = u33;
                    long j20 = o3.getLong(i38);
                    u33 = i38;
                    int i39 = u34;
                    byte[] blob2 = o3.isNull(i39) ? null : o3.getBlob(i39);
                    d3.a().getClass();
                    List a4 = hp9.a(blob2);
                    u34 = i39;
                    int i40 = u35;
                    if (o3.isNull(i40)) {
                        i7 = i40;
                        i8 = u13;
                        bArr = null;
                    } else {
                        i7 = i40;
                        bArr = o3.getBlob(i40);
                        i8 = u13;
                    }
                    xd9 b3 = d3.a().b(bArr);
                    int i41 = u36;
                    if (o3.isNull(i41)) {
                        i9 = u37;
                        l2 = null;
                    } else {
                        l2 = Long.valueOf(o3.getLong(i41));
                        i9 = u37;
                    }
                    Integer valueOf = o3.isNull(i9) ? null : Integer.valueOf(o3.getInt(i9));
                    if (valueOf == null) {
                        u36 = i41;
                        bool = null;
                    } else {
                        bool = Boolean.valueOf(valueOf.intValue() != 0);
                        u36 = i41;
                    }
                    arrayList.add(new ya9(j7, j8, j9, j10, j11, j12, string, n2, D, j13, string2, str, b2, i17, z2, i19, j14, z3, j15, str2, str3, j16, j17, c2, j18, i28, i30, i32, j19, i35, i37, j20, a4, b3, l2, bool));
                    u37 = i9;
                    u13 = i8;
                    u8 = i15;
                    u35 = i7;
                    i12 = i2;
                }
                o3.close();
                d7d.o();
                ya9 ya9 = (ya9) CollectionsKt.firstOrNull(arrayList);
                ha9 b4 = ya9 != null ? z6d2.b(ya9) : null;
                z68.c(str4, "obsLoadNetwork: requestMediaForward from before chunk end %s, message=%s", hd8.L(f723), b4);
                this.m = ed22.a(a32, b4, true, set3);
                return new ve2(Collections.emptyList(), true, true, 100, 0, 0);
            } catch (Throwable th2) {
                th = th2;
                o3.close();
                d7d.o();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            d7d = a3;
            o3.close();
            d7d.o();
            throw th;
        }
    }

    public final void f(ve2 ve2) {
        z68.c("ye2", "onLoadNetwork, result = %s", ve2);
        boolean isEmpty = ve2.a.isEmpty();
        boolean z = ve2.b;
        if (!isEmpty) {
            boolean z2 = this.c;
            boolean z3 = (z && !z2) || (!z && z2);
            ArrayList a2 = a(ve2.a, z3);
            Set<xe2> set = this.o;
            if (set != null) {
                if (z3) {
                    for (xe2 xe2 : set) {
                        if (xe2 != null) {
                            ActAttachesView actAttachesView = (ActAttachesView) xe2;
                            z68.c("ru.ok.messages.media.attaches.ActAttachesView", "onLoadNextPage, count = " + a2.size(), new Object[0]);
                            if (actAttachesView.K0.getVisibility() == 0 && actAttachesView.A0 != null) {
                                actAttachesView.A0.p(FrgChatMediaLoader.h3(a2, ActAttachesView.e1), true);
                                actAttachesView.A0.h();
                                actAttachesView.e0();
                            }
                        }
                    }
                } else {
                    for (xe2 xe22 : set) {
                        if (xe22 != null) {
                            ActAttachesView actAttachesView2 = (ActAttachesView) xe22;
                            z68.c("ru.ok.messages.media.attaches.ActAttachesView", "onLoadPrevPage, count = " + a2.size(), new Object[0]);
                            if (actAttachesView2.K0.getVisibility() == 0 && actAttachesView2.A0 != null) {
                                actAttachesView2.A0.p(FrgChatMediaLoader.h3(a2, ActAttachesView.e1), false);
                                actAttachesView2.A0.h();
                                actAttachesView2.e0();
                            }
                        }
                    }
                }
            }
        }
        this.l = ve2.c;
        c();
        if (!this.l) {
            int i2 = ve2.d;
            if (z) {
                if (i2 >= ve2.e) {
                    f(e(false));
                    return;
                }
                c();
                f(e(true));
            } else if (i2 >= ve2.f) {
                c();
                f(e(true));
            } else {
                c();
            }
        }
    }

    @oye
    public void onEvent(twf twf) {
        if (twf.b == this.a) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                long j2 = ((a89) it.next()).a.b;
                long j3 = twf.c;
                if (j2 == j3) {
                    z68.c("ye2", "onEvent: UpdateMessageEvent id = " + j3, new Object[0]);
                    new mka(1, new dr1((Object) this, j3, 2)).n(this.i).j(this.h).l(new ao1(3, new ms1(11, this), m58.g));
                    return;
                }
            }
        }
    }

    @oye
    public void onEvent(ee2 ee2) {
        ee2 ee22 = ee2;
        int i2 = (ee22.a > this.m ? 1 : (ee22.a == this.m ? 0 : -1));
        ekd ekd = m58.g;
        lfd lfd = this.h;
        lfd lfd2 = this.i;
        long j2 = ee22.b;
        if (i2 == 0) {
            z68.c("ye2", "onEvent, loadNextPageRequestId", new Object[0]);
            this.m = 0;
            new mka(1, new rj0(this, j2, false)).n(lfd2).j(lfd).l(new ao1(3, new te2(this, ee22, 0), ekd));
        }
        if (ee22.a == this.n) {
            z68.c("ye2", "onEvent, loadPrevPageRequestId", new Object[0]);
            this.n = 0;
            new mka(1, new rj0(this, j2, true)).n(lfd2).j(lfd).l(new ao1(3, new te2(this, ee22, 1), ekd));
        }
    }

    @oye
    public void onEvent(hj0 hj0) {
        if (hj0.a == this.m) {
            z68.a("ye2", "onEvent: chat media error in loading next page");
            this.m = 0;
            b(true);
        }
        if (hj0.a == this.n) {
            z68.a("ye2", "onEvent: chat media error in loading prev page");
            this.n = 0;
            b(true);
        }
    }

    @oye
    public void onEvent(w88 w88) {
        z68.a("ye2", "onEvent: LoginEvent");
        b(true);
    }

    @oye
    public void onEvent(ft4 ft4) {
        for (xe2 xe2 : this.o) {
            if (xe2 != null) {
                ActAttachesView actAttachesView = (ActAttachesView) xe2;
                z68.g("ru.ok.messages.media.attaches.ActAttachesView", "onDownloadError: messageId=$d", Long.valueOf(ft4.c));
                int i2 = qad.t1;
                Handler handler = hi7.j;
                hi7.b0(0, actAttachesView, actAttachesView.getString(i2));
            }
        }
    }
}
