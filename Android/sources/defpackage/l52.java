package defpackage;

import kotlin.time.DurationKt;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: l52  reason: default package */
public final class l52 extends qm implements lcf, hdb {
    public final long o;
    public final z93 v;
    public final String w = l52.class.getName();

    public l52(long j, long j2, z93 z93) {
        super(j);
        this.o = j2;
        this.v = z93;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r3 = r3.b.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b() {
        /*
            r3 = this;
            r62 r0 = r3.l()
            long r1 = r3.o
            a32 r3 = r0.G(r1)
            if (r3 == 0) goto L_0x001b
            m72 r3 = r3.b
            k72 r3 = r3.c
            k72 r0 = defpackage.k72.o
            if (r3 == r0) goto L_0x001b
            k72 r0 = defpackage.k72.v
            if (r3 != r0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r3 = 1
            return r3
        L_0x001b:
            r3 = 3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l52.b():int");
    }

    public final void c() {
        s().d(this.a);
    }

    public final byte[] d() {
        Tasks.ChatComplain chatComplain = new Tasks.ChatComplain();
        chatComplain.requestId = this.a;
        chatComplain.chatId = this.o;
        z93 z93 = this.v;
        chatComplain.complaint = z93 == null ? "" : z93.a;
        return ad9.toByteArray(chatComplain);
    }

    public final void e(ibf ibf) {
        k().c(new m52(this.a, this.o));
    }

    public final int f() {
        return DurationKt.NANOS_IN_MILLIS;
    }

    public final fbf g() {
        a32 G = l().G(this.o);
        if (G == null) {
            z68.c(this.w, "chat is null", new Object[0]);
            return null;
        }
        long j = G.b.a;
        yt ytVar = new yt((x3b) null, 16);
        ytVar.p(j, ApiProtocol.PARAM_CHAT_ID);
        z93 z93 = this.v;
        if (z93 != null) {
            ytVar.t("complaint", z93.a);
        }
        return ytVar;
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_CHAT_COMPLAIN;
    }

    public final void h(qaf qaf) {
        if (!m58.A(qaf.b)) {
            c();
            k().c(new hj0(qaf));
        }
    }
}
