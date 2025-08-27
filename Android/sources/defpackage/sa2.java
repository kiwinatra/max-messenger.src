package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* renamed from: sa2  reason: default package */
public final class sa2 {
    public final r62 a;
    public final fa9 b;
    public final jtb c;
    public final jqg d;
    public final qwa e;
    public final sv0 f;
    public final eef g;
    public final lfd h;

    public sa2(r62 r62, fa9 fa9, jtb jtb, jqg jqg, qwa qwa, sv0 sv0, eef eef, lfd lfd) {
        this.a = r62;
        this.b = fa9;
        this.c = jtb;
        this.d = jqg;
        this.e = qwa;
        this.f = sv0;
        this.g = eef;
        this.h = lfd;
    }

    public final void a(long j, long j2, long j3, int i, long j4, int i2, long j5, ma2 ma2, bl4 bl4) {
        List list;
        r62 r62;
        List list2;
        List list3;
        List list4;
        List list5;
        long j6 = j2;
        ma2 ma22 = ma2;
        bl4 bl42 = bl4;
        z68.c("sa2", "onChatHistory: chatId=%d, messages from=%s, forward=%d, forwardTime=%d, backward=%d, backwardTime=%d, totalCount=%d, itemType=%s", Long.valueOf(j2), iq.U(Long.valueOf(j3)), Integer.valueOf(i), Long.valueOf(j4), Integer.valueOf(i2), Long.valueOf(j5), Integer.valueOf(ma22.c.size()), bl4.name());
        r62 r622 = this.a;
        a32 G = r622.G(j6);
        if (G != null) {
            m72 m72 = G.b;
            z68.c("sa2", "onChatHistory, chat create time = %s", iq.U(Long.valueOf(m72.f)));
            int ordinal = bl4.ordinal();
            jtb jtb = this.c;
            List<b89> list6 = ma22.c;
            long j7 = G.a;
            if (ordinal == 0) {
                if (list6.isEmpty()) {
                    list3 = Collections.emptyList();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (b89 b89 : list6) {
                        List list7 = list6;
                        r62 r623 = r622;
                        if (b89.b >= m72.f) {
                            arrayList.add(b89);
                        }
                        list6 = list7;
                        r622 = r623;
                    }
                    list3 = arrayList;
                }
                list = list6;
                r62 = r622;
                if (list3.isEmpty()) {
                    list4 = Collections.emptyList();
                } else {
                    list4 = cjf.q(list3, new x52(3, this.g.h(0, idb.TYPE_MSG_EDIT)));
                }
                if (list4.size() > 0) {
                    if (!list4.isEmpty()) {
                        this.b.h(j7, ((ltb) jtb).a.s(), list4);
                    }
                    svd svd = new svd(j7);
                    jqg jqg = this.d;
                    jqg.a(svd);
                    jqg.a(new svd(j7, bl42));
                    ltb ltb = (ltb) jtb;
                    boolean P = G.P(ltb.a, ltb.c);
                    long j8 = m72.a;
                    if (!P) {
                        this.e.d(Collections.singleton(Long.valueOf(j8)));
                    } else {
                        z68.c("sa2", "onChatHistory: %d is globally muted", Long.valueOf(j8));
                    }
                }
                list2 = list4;
            } else if (ordinal == 1) {
                z0g z0g = new z0g(dbe.o, bl4.DELAYED);
                ra2 ra2 = new ra2(this, j6, 0);
                if (list6.isEmpty()) {
                    list5 = list6;
                } else {
                    list5 = z0g.a(list6, new jkb(29, (Object) z0g), new duc(26), (Function1) null, ra2, (Function1) null);
                }
                if (!list5.isEmpty()) {
                    this.b.h(j7, ((ltb) jtb).a.s(), list5);
                }
                list2 = list5;
                list = list6;
                r62 = r622;
            } else {
                throw new IllegalStateException("Unexpected value: " + bl42);
            }
            List list8 = list;
            long j9 = G.a;
            a32 a32 = G;
            List list9 = list2;
            o62 o62 = r1;
            o62 o622 = new o62(r62, list2, j3, i2, j5, i, j4, bl4, j9);
            r62.i(j9, false, o62);
            int size = list9.size();
            sv0 sv0 = this.f;
            if (size > 0) {
                List list10 = list9;
                long j10 = ((b89) list10.get(0)).b;
                long j11 = ((b89) a81.i(1, list10)).b;
                int size2 = list10.size();
                List r = CollectionsKt___CollectionsKt.map(list10, new gl1(5));
                sv0.c(new na2(j, a32.a, j10, j11, size2, bl4, r));
                return;
            }
            long j12 = j;
            sv0.c(new na2(j12, a32.a, j3, j3, list8.size(), bl4, CollectionsKt.emptyList()));
        }
    }
}
