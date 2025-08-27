package defpackage;

import kotlin.time.DurationKt;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: vt4  reason: default package */
public final class vt4 extends qm implements hdb, lcf {
    public final long o;
    public final pt4 v;
    public final String w = vt4.class.getName();

    public vt4(long j, long j2, pt4 pt4) {
        super(j);
        this.o = j2;
        this.v = pt4;
    }

    public final int b() {
        a32 G = l().G(this.o);
        String str = this.w;
        if (G == null) {
            z68.c(str, "onPreExecute: No chat. remove task", new Object[0]);
            return 3;
        }
        pt4 pt4 = this.v;
        if (pt4 == null) {
            z68.c(str, "onPreExecute: could not deserialize draft, remove task", new Object[0]);
            return 3;
        } else if (t20.a(pt4.c())) {
            return 1;
        } else {
            z68.c(str, "onPreExecute: Attaches not ready. skip task", new Object[0]);
            return 2;
        }
    }

    public final void c() {
        z68.f(this.w, "onMaxFailCount", (Throwable) null);
        s().d(this.a);
    }

    public final byte[] d() {
        Tasks.DraftSave draftSave = new Tasks.DraftSave();
        draftSave.requestId = this.a;
        draftSave.chatId = this.o;
        draftSave.draft = ut4.b(this.v);
        return ad9.toByteArray(draftSave);
    }

    public final void e(ibf ibf) {
        wt4 wt4 = (wt4) ibf;
        String str = this.w;
        z68.c(str, "onSuccess: " + wt4, new Object[0]);
        r62 l = l();
        long j = this.o;
        a32 G = l.G(j);
        if (G == null) {
            z68.c(str, "onSuccess: No chat. return", new Object[0]);
            return;
        }
        m72 m72 = G.b;
        pt4 pt4 = m72.f0;
        long j2 = m72.g0;
        if (pt4 == null && j2 > wt4.c) {
            z68.p(str, "onSuccess: draft was discarded");
        } else if (j2 > wt4.c) {
            z68.p(str, "local draft time more than response, ignore!");
        } else {
            pt4 pt42 = this.v;
            if (pt42 == null) {
                z68.p(str, "could not deserialize draft");
                l().t(j);
                return;
            }
            r62 l2 = l();
            rm rmVar = this.c;
            if (rmVar == null) {
                rmVar = null;
            }
            l2.n(this.o, wt4.c, ((xt4) rmVar.Y.getValue()).c(pt42, Long.valueOf(wt4.c)));
        }
    }

    public final int f() {
        return DurationKt.NANOS_IN_MILLIS;
    }

    public final fbf g() {
        long j;
        a32 G = l().G(this.o);
        String str = this.w;
        if (G == null) {
            z68.c(str, "createRequest: No chat. return null", new Object[0]);
            return null;
        }
        pt4 pt4 = this.v;
        if (pt4 == null) {
            z68.p(str, "could not deserialize draft");
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
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        qtd e = ((xt4) rmVar.Y.getValue()).e(pt4);
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        long j2 = i == 0 ? G.b.a : 0;
        np2 np2 = new np2((x3b) null, 13);
        if (i != 0) {
            np2.p(j, "userId");
        }
        if (j2 != 0) {
            np2.p(j2, ApiProtocol.PARAM_CHAT_ID);
        }
        np2.s("draft", e.a());
        return np2;
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_DRAFT_SAVE;
    }

    public final void h(qaf qaf) {
        if (!m58.A(qaf.b)) {
            c();
        }
    }
}
