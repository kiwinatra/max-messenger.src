package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.time.DurationKt;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: k52  reason: default package */
public final class k52 extends qm implements lcf, hdb {
    public final long o;
    public final long v;

    public k52(long j, long j2, long j3) {
        super(j);
        this.o = j2;
        this.v = j3;
    }

    public final int b() {
        a32 G = l().G(this.o);
        if (G == null) {
            return 1;
        }
        k72 k72 = G.b.c;
        return (k72 == k72.o || k72 == k72.v) ? 3 : 1;
    }

    public final void c() {
        k72 k72;
        s().d(this.a);
        r62 l = l();
        long j = this.o;
        a32 G = l.G(j);
        if (G != null && ((k72 = G.b.c) == k72.o || k72 == k72.v)) {
            l().k(j, k72.a);
        }
        k().c(new xy2(CollectionsKt.listOf(Long.valueOf(j)), true, false, (bl4) null, (zub) null, 124));
    }

    public final byte[] d() {
        Tasks.ChatClose chatClose = new Tasks.ChatClose();
        chatClose.requestId = this.a;
        chatClose.chatId = this.o;
        chatClose.chatServerId = this.v;
        return ad9.toByteArray(chatClose);
    }

    public final void e(ibf ibf) {
        k().c(new xy2(CollectionsKt.listOf(Long.valueOf(this.o)), true, false, (bl4) null, (zub) null, 124));
    }

    public final int f() {
        return DurationKt.NANOS_IN_MILLIS;
    }

    public final fbf g() {
        yt ytVar = new yt((x3b) null, 15);
        ytVar.p(this.v, ApiProtocol.PARAM_CHAT_ID);
        return ytVar;
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_CHAT_CLOSE;
    }

    public final void h(qaf qaf) {
        if (!m58.A(qaf.b)) {
            c();
        }
    }
}
