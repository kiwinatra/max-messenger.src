package defpackage;

import kotlin.collections.CollectionsKt;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: sl2  reason: default package */
public final class sl2 extends qm implements lcf, hdb {
    public final long o;
    public final boolean v;

    public sl2(long j, long j2, boolean z) {
        super(j);
        this.o = j2;
        this.v = z;
    }

    public final int b() {
        eef s = s();
        idb idb = idb.TYPE_CHAT_PIN_SET_VISIBILITY;
        long j = this.a;
        for (tdf tdf : s.h(j, idb)) {
            sl2 sl2 = (sl2) tdf.f;
            if (sl2.o == this.o && sl2.a > j) {
                return 3;
            }
        }
        return 1;
    }

    public final void c() {
        l().g0(this.o, x62.o);
        s().d(this.a);
    }

    public final byte[] d() {
        Tasks.ChatPinSetVisibility chatPinSetVisibility = new Tasks.ChatPinSetVisibility();
        chatPinSetVisibility.requestId = this.a;
        chatPinSetVisibility.chatServerId = this.o;
        chatPinSetVisibility.show = this.v;
        return ad9.toByteArray(chatPinSetVisibility);
    }

    public final void e(ibf ibf) {
        tl2 tl2 = (tl2) ibf;
        if (tl2.c != null) {
            l().g0(this.o, x62.o);
            l().n0(CollectionsKt.listOf(tl2.c));
        }
    }

    public final fbf g() {
        yt ytVar = new yt((x3b) null, 28);
        ytVar.p(this.o, ApiProtocol.PARAM_CHAT_ID);
        ytVar.d("show", this.v);
        return ytVar;
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_CHAT_PIN_SET_VISIBILITY;
    }

    public final void h(qaf qaf) {
        if (!m58.A(qaf.b)) {
            c();
        }
        k().c(new hj0(this.a, qaf));
    }
}
