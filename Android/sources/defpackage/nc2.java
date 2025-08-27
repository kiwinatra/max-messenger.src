package defpackage;

import kotlin.time.DurationKt;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: nc2  reason: default package */
public final class nc2 extends qm implements lcf, hdb {
    public final String X = nc2.class.getName();
    public final long o;
    public final long v;
    public final long w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public nc2(long j, long j2, long j3, long j4, boolean z2, boolean z3, boolean z4) {
        super(j);
        this.o = j2;
        this.v = j3;
        this.w = j4;
        this.x = z2;
        this.y = z3;
        this.z = z4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00aa, code lost:
        if ((java.lang.System.currentTimeMillis() - r8) < (r0.r(ru.ok.tamtam.android.prefs.PmsKey.f105setunreadtimeout, 31536000) * 1000)) goto L_0x00b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b() {
        /*
            r15 = this;
            r62 r0 = r15.l()
            long r1 = r15.o
            a32 r0 = r0.D(r1)
            java.lang.String r3 = r15.X
            r4 = 3
            if (r0 != 0) goto L_0x0030
            boolean r15 = r15.y
            if (r15 == 0) goto L_0x0022
            java.lang.Long r15 = java.lang.Long.valueOf(r1)
            java.lang.Object[] r15 = new java.lang.Object[]{r15}
            java.lang.String r0 = "onPreExecute: awaiting chatServerId=%d in cache"
            defpackage.z68.c(r3, r0, r15)
            r15 = 2
            return r15
        L_0x0022:
            java.lang.Long r15 = java.lang.Long.valueOf(r1)
            java.lang.Object[] r15 = new java.lang.Object[]{r15}
            java.lang.String r0 = "onPreExecute: no chat by chatServerId=%d in cache"
            defpackage.z68.g(r3, r0, r15)
            return r4
        L_0x0030:
            boolean r5 = r0.f0()
            if (r5 != 0) goto L_0x0044
            java.lang.Long r15 = java.lang.Long.valueOf(r1)
            java.lang.Object[] r15 = new java.lang.Object[]{r15}
            java.lang.String r0 = "onPreExecute: not participant of chat chatServerId=%d"
            defpackage.z68.g(r3, r0, r15)
            return r4
        L_0x0044:
            long r5 = r15.v
            boolean r7 = r15.x
            if (r7 == 0) goto L_0x00b3
            long r8 = r15.w
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x006d
            fa9 r12 = r15.o()
            long r13 = r0.a
            ha9 r0 = r12.k(r13, r8)
            if (r0 == 0) goto L_0x006d
            qe9 r8 = defpackage.qe9.DELETED
            qe9 r9 = r0.Y
            if (r9 != r8) goto L_0x006a
            java.lang.String r15 = "onPreExecute: message deleted, remove task"
            defpackage.z68.c(r3, r15, new java.lang.Object[0])
            return r4
        L_0x006a:
            long r8 = r0.o
            goto L_0x006e
        L_0x006d:
            r8 = r10
        L_0x006e:
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0073
            r8 = r5
        L_0x0073:
            rm r0 = r15.c
            if (r0 == 0) goto L_0x0078
            goto L_0x0079
        L_0x0078:
            r0 = 0
        L_0x0079:
            kotlin.Lazy r0 = r0.N
            java.lang.Object r0 = r0.getValue()
            ysc r0 = (defpackage.ysc) r0
            r0.getClass()
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x00ad
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 - r8
            kotlin.Lazy r0 = r0.d
            java.lang.Object r0 = r0.getValue()
            jtb r0 = (defpackage.jtb) r0
            ltb r0 = (defpackage.ltb) r0
            cud r0 = r0.b
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r8 = ru.ok.tamtam.android.prefs.PmsKey.f105setunreadtimeout
            r12 = 31536000(0x1e13380, double:1.5580854E-316)
            long r8 = r0.r(r8, r12)
            r12 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r12
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ad
            goto L_0x00b3
        L_0x00ad:
            java.lang.String r15 = "onPreExecute: timeout expired, remove task"
            defpackage.z68.c(r3, r15, new java.lang.Object[0])
            return r4
        L_0x00b3:
            eef r0 = r15.s()
            idb r3 = defpackage.idb.TYPE_CHAT_MARK
            long r8 = r15.a
            java.util.List r15 = r0.h(r8, r3)
            if (r7 == 0) goto L_0x00e0
            java.util.Iterator r15 = r15.iterator()
        L_0x00c5:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0105
            java.lang.Object r0 = r15.next()
            tdf r0 = (defpackage.tdf) r0
            hdb r0 = r0.f
            nc2 r0 = (defpackage.nc2) r0
            long r5 = r0.o
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x00c5
            boolean r0 = r0.x
            if (r0 == 0) goto L_0x00c5
            return r4
        L_0x00e0:
            java.util.Iterator r15 = r15.iterator()
        L_0x00e4:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0105
            java.lang.Object r0 = r15.next()
            tdf r0 = (defpackage.tdf) r0
            hdb r0 = r0.f
            nc2 r0 = (defpackage.nc2) r0
            long r7 = r0.o
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x00e4
            boolean r3 = r0.x
            if (r3 != 0) goto L_0x00e4
            long r7 = r0.v
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e4
            return r4
        L_0x0105:
            r15 = 1
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc2.b():int");
    }

    public final void c() {
        s().d(this.a);
    }

    public final byte[] d() {
        Tasks.ChatMark chatMark = new Tasks.ChatMark();
        chatMark.requestId = this.a;
        chatMark.chatId = 0;
        chatMark.chatServerId = this.o;
        chatMark.mark = this.v;
        chatMark.messageId = this.w;
        chatMark.setAsUnread = this.x;
        chatMark.awaitChatInCache = this.y;
        chatMark.isReadReaction = this.z;
        return ad9.toByteArray(chatMark);
    }

    public final void e(ibf ibf) {
        Integer num;
        a89 a89;
        oc2 oc2 = (oc2) ibf;
        a32 D = l().D(this.o);
        if (oc2.c < this.v && !this.x) {
            z68.c(this.X, "onSuccess, received read mark less than our read mark", new Object[0]);
        } else if (D != null) {
            l().z0(D.a, ((ltb) q()).a.s(), oc2.c, oc2.o, true);
        }
        if (D != null && (num = oc2.o) != null && num.intValue() > 0 && (a89 = D.c) != null) {
            ha9 ha9 = a89.a;
            if (ha9.o == oc2.c) {
                rm rmVar = this.c;
                if (rmVar == null) {
                    rmVar = null;
                }
                m72 m72 = D.b;
                qa2.a((qa2) rmVar.O.getValue(), D.a, m72.a, ha9.o, 0, bl4.REGULAR);
                ((jna) i()).l(m72.a);
            }
        }
    }

    public final int f() {
        return DurationKt.NANOS_IN_MILLIS;
    }

    public final fbf g() {
        yt ytVar = new yt((x3b) null, 24);
        ytVar.p(this.o, ApiProtocol.PARAM_CHAT_ID);
        ytVar.p(this.v, "mark");
        long j = this.w;
        if (j != -1) {
            ytVar.p(j, "messageId");
        }
        ytVar.t("type", this.x ? "SET_AS_UNREAD" : this.z ? "READ_REACTION" : "READ_MESSAGE");
        return ytVar;
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_CHAT_MARK;
    }

    public final void h(qaf qaf) {
        k().c(new hj0(this.a, qaf));
        if (!m58.A(qaf.b)) {
            c();
        }
    }
}
