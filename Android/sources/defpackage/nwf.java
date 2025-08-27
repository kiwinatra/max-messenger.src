package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: nwf  reason: default package */
public final class nwf extends qm implements lcf, hdb {
    public static final /* synthetic */ int y = 0;
    public final long o;
    public final long v;
    public final long w;
    public final boolean x;

    public nwf(long j, long j2, long j3, long j4, boolean z) {
        super(j);
        this.o = j2;
        this.v = j3;
        this.w = j4;
        this.x = z;
    }

    public final int b() {
        long j;
        long j2;
        Object obj;
        eef s = s();
        idb idb = idb.TYPE_UPDATE_FIRE_TIME;
        ArrayList arrayList = new ArrayList();
        for (tdf tdf : s.h(this.a, idb)) {
            nwf nwf = (nwf) tdf.f;
            if (nwf != null) {
                arrayList.add(nwf);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            j = this.v;
            j2 = this.o;
            if (!hasNext) {
                obj = null;
                break;
            }
            obj = it.next();
            nwf nwf2 = (nwf) obj;
            if (nwf2.o == j2 && nwf2.v == j) {
                break;
            }
        }
        if (((nwf) obj) != null) {
            z68.c("nwf", "onPreExecute: found later task, REMOVE", new Object[0]);
            return 3;
        }
        ha9 r = o().r(j);
        a32 G = l().G(j2);
        if (r == null || r.Y == qe9.DELETED || G == null || (!G.E() && !G.S())) {
            z68.c("nwf", "onPreExecute: message or chat not found, REMOVE", new Object[0]);
            return 3;
        } else if (r.c == 0) {
            z68.c("nwf", "onPreExecute: message serverId == 0, REMOVE", new Object[0]);
            return 3;
        } else if (G.b.a != 0 || l().W(G)) {
            return 1;
        } else {
            z68.c("nwf", "onPreExecute: chat serverId == 0, SKIP", new Object[0]);
            return 2;
        }
    }

    public final void c() {
        s().d(this.a);
        ha9 r = o().r(this.v);
        if (r != null) {
            o().z(r, oa9.ERROR);
            k().c(new twf(0, this.o, this.v));
        }
    }

    public final byte[] d() {
        Tasks.UpdateFireTimeProtoTask updateFireTimeProtoTask = new Tasks.UpdateFireTimeProtoTask();
        updateFireTimeProtoTask.requestId = this.a;
        updateFireTimeProtoTask.chatId = this.o;
        updateFireTimeProtoTask.messageId = this.v;
        updateFireTimeProtoTask.fireTime = this.w;
        updateFireTimeProtoTask.notifySender = this.x;
        return ad9.toByteArray(updateFireTimeProtoTask);
    }

    public final void e(ibf ibf) {
        z68.c("nwf", "onSuccess: " + ((pv9) ibf), new Object[0]);
        ha9 r = o().r(this.v);
        if (r != null && r.Y != qe9.DELETED) {
            o().z(r, oa9.SENT);
            k().c(new twf(0, this.o, this.v));
        }
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.fbf g() {
        /*
            r12 = this;
            fa9 r0 = r12.o()
            long r1 = r12.v
            ha9 r0 = r0.r(r1)
            r1 = 0
            if (r0 != 0) goto L_0x000e
            goto L_0x0049
        L_0x000e:
            r62 r2 = r12.l()
            long r3 = r12.o
            a32 r2 = r2.G(r3)
            if (r2 != 0) goto L_0x001b
            goto L_0x0049
        L_0x001b:
            m72 r2 = r2.b
            long r4 = r2.a
            w28 r2 = r0.x0
            a00 r2 = defpackage.qe8.f(r2)
            if (r2 != 0) goto L_0x002c
            a00 r2 = new a00
            r2.<init>()
        L_0x002c:
            r9 = r2
            java.util.List r2 = r0.P0
            if (r2 == 0) goto L_0x0035
            java.util.ArrayList r1 = defpackage.qe8.v(r2)
        L_0x0035:
            r10 = r1
            cl4 r11 = new cl4
            long r1 = r12.w
            boolean r12 = r12.x
            r11.<init>(r1, r12)
            np2 r1 = new np2
            long r6 = r0.c
            java.lang.String r8 = r0.y
            r3 = r1
            r3.<init>(r4, r6, r8, r9, r10, r11)
        L_0x0049:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nwf.g():fbf");
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_UPDATE_FIRE_TIME;
    }

    public final void h(qaf qaf) {
        z68.c("nwf", "onFail", qaf);
        ha9 r = o().r(this.v);
        if (r != null && r.Y != qe9.DELETED && !m58.A(qaf.b)) {
            c();
            k().c(new hj0(this.a, qaf));
        }
    }
}
