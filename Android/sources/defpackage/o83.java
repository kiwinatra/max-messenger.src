package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import ru.ok.messages.chats.common.CommonChatsViewModel;
import ru.ok.messages.suggests.SuggestsViewModel;

/* renamed from: o83  reason: default package */
public final class o83 implements dbg {
    public final /* synthetic */ int a;
    public final long b;
    public final id3 c;

    public /* synthetic */ o83(long j, id3 id3, int i) {
        this.a = i;
        this.b = j;
        this.c = id3;
    }

    public final yag a(Class cls) {
        id3 id3 = this.c;
        switch (this.a) {
            case 0:
                qra qra = (qra) id3;
                r62 l = qra.l();
                yva v = qra.v();
                rl e = qra.e();
                nd c2 = qra.c();
                jbf H = qra.H();
                gaf G = qra.G();
                jd8 J = qra.J();
                qra.getClass();
                return new CommonChatsViewModel(this.b, l, v, e, c2, H, G, J, sjd.a.q());
            default:
                qra qra2 = (qra) id3;
                nd c3 = qra2.c();
                gaf G2 = qra2.G();
                q04 a2 = ((osa) qra2.G()).a();
                p04 p04 = q04.a;
                Lazy lazy = LazyKt.lazy(new x1f(this, 0));
                Lazy lazy2 = LazyKt.lazy(new x1f(this, 1));
                return new SuggestsViewModel(this.b, qra2.e(), qra2.J(), (mq0) ((sjd) tr1.h(qra2)).getAccessor().g(mq0.class), qra2.H(), (hxd) ((sjd) tr1.h(qra2)).getAccessor().g(hxd.class), c3, G2, a2.s0(1, (String) null), qra2.B(), qra2.I(), qra2.l(), qra2.m(), qra2.v(), qra2.y(), (ptb) ((sjd) tr1.h(qra2)).getAccessor().g(ptb.class), lazy, lazy2);
        }
    }
}
