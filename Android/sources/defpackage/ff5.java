package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: ff5  reason: default package */
public final class ff5 extends gud implements hdb {
    public static final /* synthetic */ int y = 0;
    public final long b;
    public final String c;
    public final String o;
    public final long v;
    public final long w;
    public final String x;

    public ff5(long j, String str, String str2, long j2, long j3, String str3) {
        this.b = j;
        this.c = str;
        this.o = str2;
        this.v = j2;
        this.w = j3;
        this.x = str3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        r0 = defpackage.qe9.DELETED;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b() {
        /*
            r4 = this;
            long r0 = r4.v
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 1
            if (r2 > 0) goto L_0x000a
            return r3
        L_0x000a:
            fa9 r4 = r4.o()
            ha9 r4 = r4.r(r0)
            if (r4 == 0) goto L_0x001c
            qe9 r0 = defpackage.qe9.DELETED
            qe9 r4 = r4.Y
            if (r4 != r0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            return r3
        L_0x001c:
            r4 = 3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff5.b():int");
    }

    public final void c() {
        s().d(this.b);
        a32 G = e().G(this.w);
        long j = this.v;
        if (G != null) {
            hud hud = this.a;
            if (hud == null) {
                hud = null;
            }
            long j2 = G.b.a;
            ((d6b) hud.C.getValue()).getClass();
            d6b.b(j2, j);
        }
        ha9 r = o().r(j);
        if (r == null || r.Y == qe9.DELETED) {
            z68.c("ff5", "onMaxFailCount: Message was deleted", new Object[0]);
            return;
        }
        o().z(r, oa9.ERROR);
        u().c(new twf(0, r.z, r.b));
        rvd.A(v());
    }

    public final byte[] d() {
        Tasks.ExternalVideoSend externalVideoSend = new Tasks.ExternalVideoSend();
        externalVideoSend.requestId = this.b;
        externalVideoSend.externalUrl = this.c;
        externalVideoSend.attachLocalId = this.o;
        externalVideoSend.messageId = this.v;
        externalVideoSend.chatId = this.w;
        externalVideoSend.stickerId = this.x;
        return ad9.toByteArray(externalVideoSend);
    }

    public final int f() {
        return 5;
    }

    public final long getId() {
        return this.b;
    }

    public final idb getType() {
        return idb.TYPE_EXTERNAL_GIF_SEND;
    }

    public final void z() {
        hud hud = this.a;
        if (hud == null) {
            hud = null;
        }
        gl5 gl5 = (gl5) hud.b.getValue();
        gl5.getClass();
        int ordinal = ((dl5) ev0.C(EmptyCoroutineContext.INSTANCE, new fl5(gl5, this.b, this.c, this.o, this.v, this.w, this.x, (Continuation) null))).ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2 && ordinal != 3 && ordinal != 4) {
            if (ordinal == 5) {
                c();
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
