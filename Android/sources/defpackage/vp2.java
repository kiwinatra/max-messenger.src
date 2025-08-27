package defpackage;

import kotlin.time.DurationKt;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: vp2  reason: default package */
public final class vp2 extends qm implements lcf, hdb {
    public final long o;
    public final boolean v;

    public vp2(long j, long j2, boolean z) {
        super(j);
        this.o = j2;
        this.v = z;
    }

    public final int b() {
        return 1;
    }

    public final void c() {
        s().d(this.a);
    }

    public final byte[] d() {
        Tasks.ChatSubscribe chatSubscribe = new Tasks.ChatSubscribe();
        chatSubscribe.requestId = this.a;
        chatSubscribe.chatServerId = this.o;
        chatSubscribe.subscribe = this.v;
        return ad9.toByteArray(chatSubscribe);
    }

    public final void e(ibf ibf) {
    }

    public final int f() {
        return DurationKt.NANOS_IN_MILLIS;
    }

    public final fbf g() {
        np2 np2 = new np2((x3b) null, 1);
        np2.p(this.o, ApiProtocol.PARAM_CHAT_ID);
        np2.d("subscribe", this.v);
        return np2;
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_CHAT_SUBSCRIBE;
    }

    public final void h(qaf qaf) {
        k().c(new hj0(this.a, qaf));
        if (!m58.A(qaf.b)) {
            c();
        }
    }
}
