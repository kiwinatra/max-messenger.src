package defpackage;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.time.DurationKt;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: e4f  reason: default package */
public final class e4f extends qm implements lcf, hdb {
    public final long o;
    public final long v;
    public final boolean w;

    public e4f(long j, long j2, boolean z, long j3) {
        super(j);
        this.o = j2;
        this.v = j3;
        this.w = z;
    }

    public final int b() {
        return 1;
    }

    public final void c() {
        s().d(this.a);
        r62 l = l();
        l.getClass();
        vz0 vz0 = new vz0(false, 1);
        long j = this.o;
        l.i(j, false, vz0);
        k().c(new xy2(CollectionsKt.listOf(Long.valueOf(j)), false, false, (bl4) null, (zub) null, 124));
        k().c(new zu3((Collection) CollectionsKt.listOf(Long.valueOf(this.v))));
    }

    public final byte[] d() {
        Tasks.SuspendBot suspendBot = new Tasks.SuspendBot();
        suspendBot.requestId = this.a;
        suspendBot.chatId = this.o;
        suspendBot.botId = this.v;
        suspendBot.suspend = this.w;
        return ad9.toByteArray(suspendBot);
    }

    public final void e(ibf ibf) {
    }

    public final int f() {
        return DurationKt.NANOS_IN_MILLIS;
    }

    public final fbf g() {
        jw9 jw9 = new jw9((x3b) null, 15);
        jw9.p(this.v, "botId");
        jw9.d("value", this.w);
        return jw9;
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_SUSPEND_BOT;
    }

    public final void h(qaf qaf) {
        if (!m58.A(qaf.b)) {
            c();
        }
    }
}
