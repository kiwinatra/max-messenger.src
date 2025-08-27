package defpackage;

import java.util.HashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.time.DurationKt;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: wr2  reason: default package */
public final class wr2 extends qm implements lcf, hdb {
    public final Map X;
    public final String Y;
    public final String Z;
    public final long o;
    public final long v;
    public final a20 v0;
    public final int w;
    public final Long w0;
    public final String x;
    public final boolean x0;
    public final boolean y;
    public final long y0;
    public final String z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wr2(long j, long j2, long j3, int i, String str, boolean z2, String str2, HashMap hashMap, String str3, String str4, a20 a20, Long l, boolean z3, long j4) {
        super(j);
        this.o = j2;
        this.v = j3;
        this.w = i;
        this.x = str;
        this.y = z2;
        this.z = str2;
        this.X = hashMap;
        this.Y = str3;
        this.Z = str4;
        this.v0 = a20;
        this.w0 = l;
        this.x0 = z3;
        this.y0 = j4;
    }

    public final int b() {
        a32 G = l().G(this.o);
        if (G == null) {
            return 3;
        }
        m72 m72 = G.b;
        if (m72.a == 0) {
            rm rmVar = this.c;
            if (rmVar == null) {
                rmVar = null;
            }
            if (!m72.h(((qjd) ((x23) rmVar.e.getValue())).s())) {
                return 2;
            }
        }
        return 1;
    }

    public final void c() {
        s().d(this.a);
    }

    public final byte[] d() {
        Tasks.ChatUpdate chatUpdate = new Tasks.ChatUpdate();
        chatUpdate.requestId = this.a;
        chatUpdate.chatId = this.o;
        chatUpdate.chatServerId = this.v;
        String str = this.Y;
        if (str != null) {
            chatUpdate.theme = str;
        } else {
            chatUpdate.themeIsNull = true;
        }
        String str2 = this.Z;
        if (str2 != null) {
            chatUpdate.photoToken = str2;
        } else {
            chatUpdate.photoTokenIsNull = true;
        }
        a20 a20 = this.v0;
        if (a20 != null) {
            Tasks.Rect rect = new Tasks.Rect();
            rect.left = a20.b;
            rect.top = a20.c;
            rect.right = a20.d;
            rect.bottom = a20.e;
            chatUpdate.crop = rect;
        }
        Long l = this.w0;
        if (l != null) {
            chatUpdate.pinMessageId = l.longValue();
        } else {
            chatUpdate.pinMessageIdIsNull = true;
        }
        chatUpdate.notifyPin = this.x0;
        String str3 = this.z;
        if (str3 != null) {
            chatUpdate.description = str3;
        } else {
            chatUpdate.descriptionIsNull = true;
        }
        return ad9.toByteArray(chatUpdate);
    }

    public final void e(ibf ibf) {
        xr2 xr2 = (xr2) ibf;
        if (xr2.c != null) {
            t();
            l().n0(CollectionsKt.listOf(xr2.c));
        }
        k().c(new ij0(this.a));
    }

    public final int f() {
        return DurationKt.NANOS_IN_MILLIS;
    }

    public final fbf g() {
        Long l = this.w0;
        if (l != null && l.longValue() == -1) {
            l = 0L;
        }
        Long l2 = l;
        int i = this.w;
        return new np2(this.v, i != 0 ? tr1.y(i) != 0 ? 3 : 2 : 0, this.x, this.y, this.z, (HashMap) this.X, this.Y, this.Z, this.v0, l2, this.x0, this.y0);
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_CHAT_UPDATE;
    }

    public final void h(qaf qaf) {
        if (!m58.A(qaf.b)) {
            t();
            if (!(this.Y == null && this.Z == null && this.w0 == null)) {
                c();
            }
            ((jna) i()).l(this.v);
        }
        k().c(new hj0(this.a, qaf));
    }

    public final void t() {
        String str = this.Z;
        long j = this.o;
        if (str != null) {
            l().g0(j, x62.b);
        }
        if (this.Y != null) {
            l().g0(j, x62.a);
        }
        if (this.w0 != null) {
            l().g0(j, x62.o);
        }
    }
}
