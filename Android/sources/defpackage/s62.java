package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.time.DurationKt;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: s62  reason: default package */
public final class s62 extends qm implements lcf, hdb {
    public final long o;
    public final int v;
    public final long w;
    public final long x;
    public final String y;

    public s62(long j, long j2, int i, long j3, String str, long j4) {
        super(j);
        this.o = j2;
        this.v = i;
        this.w = j3;
        this.x = j4;
        this.y = str == null ? "" : str;
    }

    public final int b() {
        return 1;
    }

    public final void c() {
        s().d(this.a);
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        e1d e1d = (e1d) rmVar.Q.getValue();
        r62 r62 = (r62) e1d.a.getValue();
        r62.getClass();
        long j = this.o;
        jbd.a(new k62(r62, j, 0), r62.z, (x6) null, new fm0(24), (lfd) null);
        ConcurrentHashMap concurrentHashMap = ((ysc) e1d.b.getValue()).i;
        jbd.c((mq4) concurrentHashMap.get(0L));
        concurrentHashMap.remove(0L);
        k().c(new xy2(CollectionsKt.listOf(Long.valueOf(j)), true, false, (bl4) null, (zub) null, 124));
    }

    public final byte[] d() {
        Tasks.ChatCreate chatCreate = new Tasks.ChatCreate();
        chatCreate.requestId = this.a;
        int i = this.v;
        if (i != 0) {
            chatCreate.chatType = a81.d(i);
        }
        chatCreate.chatId = this.o;
        chatCreate.groupId = this.w;
        chatCreate.startPayload = this.y;
        chatCreate.cid = this.x;
        return ad9.toByteArray(chatCreate);
    }

    public final void e(ibf ibf) {
        b32 b32 = ((t62) ibf).c;
        if (b32 != null) {
            l().n0(CollectionsKt.listOf(b32));
        }
    }

    public final int f() {
        return DurationKt.NANOS_IN_MILLIS;
    }

    public final fbf g() {
        yt ytVar = new yt((x3b) null, 17);
        int i = this.v;
        if (!(i == 0 || i == 1)) {
            ytVar.t("chatType", a81.d(i));
        }
        long j = this.w;
        if (j != 0) {
            ytVar.p(j, "groupId");
        }
        String str = this.y;
        if (!cvg.A(str)) {
            ytVar.t("startPayload", str);
        }
        long j2 = this.x;
        if (j2 != 0) {
            ytVar.p(j2, "cid");
        }
        return ytVar;
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_CHAT_CREATE;
    }

    public final void h(qaf qaf) {
        if (!m58.A(qaf.b)) {
            c();
        }
    }
}
