package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.time.DurationKt;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: ja2  reason: default package */
public final class ja2 extends qm implements lcf, hdb {
    public final long o;
    public final long v;
    public final String w = ja2.class.getName();

    public ja2(long j, long j2, long j3) {
        super(j);
        this.o = j2;
        this.v = j3;
    }

    public final int b() {
        return l().G(this.o) != null ? 1 : 3;
    }

    public final void c() {
        long j = this.a;
        z68.g(this.w, "onMaxFailCount: remove task, requestId = %d", Long.valueOf(j));
        s().d(j);
    }

    public final byte[] d() {
        Tasks.ChatHide chatHide = new Tasks.ChatHide();
        chatHide.requestId = this.a;
        chatHide.chatId = this.o;
        chatHide.chatServerId = this.v;
        return ad9.toByteArray(chatHide);
    }

    public final void e(ibf ibf) {
        k().c(new xy2(CollectionsKt.listOf(Long.valueOf(this.o)), true, false, (bl4) null, (zub) null, 124));
    }

    public final int f() {
        return DurationKt.NANOS_IN_MILLIS;
    }

    public final fbf g() {
        yt ytVar = new yt((x3b) null, 19);
        ytVar.p(this.v, ApiProtocol.PARAM_CHAT_ID);
        return ytVar;
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_CHAT_HIDE;
    }

    public final void h(qaf qaf) {
        if (!m58.A(qaf.b)) {
            c();
        }
    }
}
