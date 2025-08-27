package defpackage;

import java.util.List;
import kotlin.time.DurationKt;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: ts2  reason: default package */
public final class ts2 extends qm implements lcf, hdb {
    public final long o;
    public final int v;
    public final long w;

    public ts2(int i, long j, long j2, long j3) {
        super(j);
        this.o = j2;
        this.v = i;
        this.w = j3;
    }

    public final int b() {
        return 1;
    }

    public final void c() {
        s().d(this.a);
    }

    public final byte[] d() {
        Tasks.ChatsList chatsList = new Tasks.ChatsList();
        chatsList.requestId = this.a;
        chatsList.marker = this.o;
        chatsList.count = this.v;
        chatsList.chatsSync = this.w;
        return ad9.toByteArray(chatsList);
    }

    public final void e(ibf ibf) {
        ys2 ys2 = (ys2) ibf;
        a67 a67 = z68.b;
        rm rmVar = null;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, "ChatsListApiTask", "onSuccess " + ys2, (Throwable) null);
        }
        try {
            p().p(ys2.c);
        } catch (TamErrorException unused) {
        }
        a67 a672 = z68.b;
        if (a672 != null && a672.c()) {
            a672.d(w78.o, "ChatsListApiTask", "chats.storeChatsFromServer", (Throwable) null);
        }
        r62 l = l();
        List list = ys2.c;
        l.getClass();
        List list2 = (List) l.o0("storeChatsFromServer", new vd0((Object) l, (Object) list, (Object) null, 0, 2));
        rm rmVar2 = this.c;
        if (rmVar2 != null) {
            rmVar = rmVar2;
        }
        ((qjd) ((x23) rmVar.e.getValue())).k("app.last.chat.marker", Long.valueOf(ys2.o));
        if (ys2.o > 0) {
            rl i = i();
            long j = ys2.o;
            long j2 = this.w;
            cud cud = ((ltb) q()).b;
            cud.getClass();
            jna jna = (jna) i;
            ocf.d(jna.E(), new ts2((int) cud.r(PmsKey.f23chatspagesize, (long) 50), ((ltb) jna.D()).a.n(), j, j2), false, 0, 12);
        }
    }

    public final int f() {
        return DurationKt.NANOS_IN_MILLIS;
    }

    public final fbf g() {
        np2 np2 = new np2((x3b) null, 3);
        np2.p(this.o, "marker");
        np2.h(this.v, NewHtcHomeBadger.COUNT);
        return np2;
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_CHATS_LIST;
    }

    public final void h(qaf qaf) {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatsListApiTask(id = ");
        sb.append(this.a);
        sb.append(", marker=");
        sb.append(this.o);
        sb.append(", count=");
        sb.append(this.v);
        sb.append(", chatsSync=");
        return wj6.m(sb, this.w, ")");
    }
}
