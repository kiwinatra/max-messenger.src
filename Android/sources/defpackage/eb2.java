package defpackage;

import kotlin.time.DurationKt;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: eb2  reason: default package */
public final class eb2 extends qm implements lcf, hdb {
    public final long o;
    public final long v;

    public eb2(long j, long j2, long j3) {
        super(j);
        this.o = j2;
        this.v = j3;
    }

    public final int b() {
        return l().G(this.o) != null ? 1 : 3;
    }

    public final void c() {
        s().d(this.a);
    }

    public final byte[] d() {
        Tasks.ChannelLeave channelLeave = new Tasks.ChannelLeave();
        channelLeave.requestId = this.a;
        channelLeave.chatId = this.o;
        channelLeave.chatServerId = this.v;
        return ad9.toByteArray(channelLeave);
    }

    public final void e(ibf ibf) {
        k().c(new fb2(this.a, this.o));
    }

    public final int f() {
        return DurationKt.NANOS_IN_MILLIS;
    }

    public final fbf g() {
        yt ytVar = new yt((x3b) null, 23);
        ytVar.p(this.v, ApiProtocol.PARAM_CHAT_ID);
        return ytVar;
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_CHAT_LEAVE;
    }

    public final void h(qaf qaf) {
        if (!m58.A(qaf.b)) {
            c();
        }
    }
}
