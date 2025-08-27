package defpackage;

import java.io.IOException;
import java.util.Arrays;
import kotlin.time.DurationKt;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: qt4  reason: default package */
public final class qt4 extends qm implements hdb, lcf {
    public final long o;
    public final long v;
    public final String w = qt4.class.getName();

    public qt4(long j, long j2, long j3) {
        super(j);
        this.o = j2;
        this.v = j3;
    }

    public final int b() {
        return 1;
    }

    public final void c() {
        z68.f(this.w, "onMaxFailCount", (Throwable) null);
        s().d(this.a);
    }

    public final byte[] d() {
        Tasks.DraftDiscard draftDiscard = new Tasks.DraftDiscard();
        draftDiscard.requestId = this.a;
        draftDiscard.chatId = this.o;
        draftDiscard.serverTime = this.v;
        return ad9.toByteArray(draftDiscard);
    }

    public final void e(ibf ibf) {
        String str = this.w;
        z68.c(str, "onSuccess: " + ibf, new Object[0]);
        a32 G = l().G(this.o);
        if (G == null) {
            z68.i(str, "no chat, ignore!", (Throwable) null);
            return;
        }
        m72 m72 = G.b;
        if (m72.f0 != null) {
            long j = m72.g0;
            if (j == 0) {
                z68.i(str, "local draft not yet sync, ignore!", (Throwable) null);
                return;
            }
            long j2 = this.v;
            if (j < j2) {
                l().n(this.o, this.v, (pt4) null);
                z68.n(str, (IOException) null, "chat has server draft older than current DRAFT_DISCARD server time, diff = %d, clear it", Arrays.copyOf(new Object[]{Long.valueOf(j2 - j)}, 1));
                return;
            }
            return;
        }
        z68.i(str, "draft already is null, ignore!", (Throwable) null);
        l().n(this.o, this.v, (pt4) null);
    }

    public final int f() {
        return DurationKt.NANOS_IN_MILLIS;
    }

    public final fbf g() {
        long j;
        a32 G = l().G(this.o);
        if (G == null) {
            z68.c(this.w, "createRequest: No chat. return null", new Object[0]);
            return null;
        }
        if (G.N()) {
            vk3 m = G.m();
            Long valueOf = m != null ? Long.valueOf(m.r()) : null;
            if (valueOf != null) {
                j = valueOf.longValue();
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            j = 0;
        }
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        long j2 = i == 0 ? G.b.a : 0;
        np2 np2 = new np2((x3b) null, 12);
        if (i != 0) {
            np2.p(j, "userId");
        }
        if (j2 != 0) {
            np2.p(j2, ApiProtocol.PARAM_CHAT_ID);
        }
        long j3 = this.v;
        if (j3 != 0) {
            np2.p(j3, "time");
        }
        return np2;
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_DRAFT_DISCARD;
    }

    public final void h(qaf qaf) {
        if (!m58.A(qaf.b)) {
            c();
        }
    }
}
