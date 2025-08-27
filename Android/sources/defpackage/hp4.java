package defpackage;

import kotlin.Lazy;

/* renamed from: hp4  reason: default package */
public final class hp4 {
    public final Lazy a;

    public hp4(Lazy lazy) {
        this.a = lazy;
    }

    public final void a(long j, Long l, Long l2) {
        z68.c("hp4", "execute: chatId=" + l + ", contactId=" + l2 + ", serverTime=" + j, new Object[0]);
        Lazy lazy = this.a;
        long j2 = 0;
        a32 K = (l == null || l.longValue() == 0) ? (l2 == null || l2.longValue() == 0) ? null : ((r62) lazy.getValue()).K(l2.longValue()) : ((r62) lazy.getValue()).D(l.longValue());
        if (K == null) {
            z68.p("hp4", "Chat is null. Ignore");
            return;
        }
        pt4 pt4 = K.b.f0;
        if (pt4 == null) {
            z68.i("hp4", "draft is null, ignore", (Throwable) null);
            return;
        }
        Long a2 = pt4.a();
        if (a2 != null) {
            j2 = a2.longValue();
        }
        if (j2 > j) {
            z68.p("hp4", "try to rewrite draft by old, ignore it!");
            return;
        }
        z68.c("hp4", "Discard server draft", new Object[0]);
        ((r62) lazy.getValue()).t(K.a);
    }
}
