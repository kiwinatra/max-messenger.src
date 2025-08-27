package defpackage;

import java.util.HashMap;
import kotlin.time.DurationKt;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: dw9  reason: default package */
public final class dw9 extends qm implements lcf, hdb {
    public final String o;
    public final String v;
    public final long w;
    public final long x;
    public final dw0 y;
    public final fw0 z;

    public dw9(long j, String str, String str2, long j2, long j3, dw0 dw0, fw0 fw0) {
        super(j);
        this.o = str;
        this.v = str2;
        this.w = j2;
        this.x = j3;
        this.y = dw0;
        this.z = fw0;
    }

    public final int b() {
        return 1;
    }

    public final void c() {
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        rmVar.e().d(this.a);
    }

    public final byte[] d() {
        Tasks.MsgSendCallback msgSendCallback = new Tasks.MsgSendCallback();
        msgSendCallback.requestId = this.a;
        msgSendCallback.callbackId = this.o;
        msgSendCallback.payload = this.v;
        msgSendCallback.timestamp = this.w;
        msgSendCallback.messageId = this.x;
        msgSendCallback.buttonType = this.z.a;
        Tasks.MsgSendCallback.ButtonPosition buttonPosition = new Tasks.MsgSendCallback.ButtonPosition();
        dw0 dw0 = this.y;
        buttonPosition.row = dw0.a;
        buttonPosition.column = dw0.b;
        msgSendCallback.buttonPosition = buttonPosition;
        return ad9.toByteArray(msgSendCallback);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(defpackage.ibf r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            ew9 r1 = (defpackage.ew9) r1
            rm r2 = r0.c
            if (r2 == 0) goto L_0x000b
            goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            fa9 r2 = r2.d()
            long r4 = r0.x
            ha9 r2 = r2.r(r4)
            if (r2 == 0) goto L_0x001e
            qe9 r4 = defpackage.qe9.DELETED
            qe9 r5 = r2.Y
            if (r5 != r4) goto L_0x0021
        L_0x001e:
            r1 = r0
            goto L_0x0183
        L_0x0021:
            b89 r4 = r1.c
            r5 = 1
            if (r4 == 0) goto L_0x010a
            rm r6 = r0.c
            if (r6 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            r62 r6 = r6.c()
            long r7 = r2.z
            a32 r2 = r6.G(r7)
            rm r6 = r0.c
            if (r6 == 0) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r6 = 0
        L_0x003c:
            kotlin.Lazy r6 = r6.G
            java.lang.Object r6 = r6.getValue()
            r14 = r6
            ocd r14 = (defpackage.ocd) r14
            a89 r6 = r2.c
            ha9 r6 = r6.a
            long r9 = r6.c
            r14.getClass()
            java.lang.String r15 = "ocd"
            java.lang.String r6 = "onSaveMessage: insert new message"
            defpackage.z68.c(r15, r6, new java.lang.Object[0])
            boolean r6 = r2.H()
            if (r6 != 0) goto L_0x0068
            jtb r6 = r14.e
            ltb r6 = (defpackage.ltb) r6
            a33 r6 = r6.a
            long r6 = r6.s()
            r16 = r6
            goto L_0x006a
        L_0x0068:
            r16 = 0
        L_0x006a:
            fa9 r6 = r14.a
            long r7 = r2.a
            r21 = r9
            r9 = r16
            r11 = r4
            long r6 = r6.g(r7, r9, r11)
            fa9 r8 = r14.a
            ha9 r6 = r8.r(r6)
            if (r6 != 0) goto L_0x0081
            goto L_0x010a
        L_0x0081:
            esb r7 = r14.b
            r7.b(r2, r6)
            m72 r7 = r2.b
            g72 r7 = r7.n
            bl4 r8 = r6.S0
            int r7 = r7.c(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r9 = "onSaveMessage: chunks count = %d"
            defpackage.z68.c(r15, r9, r7)
            r18 = 1
            r20 = 0
            r62 r7 = r14.c
            long r10 = r2.a
            r2 = r15
            r15 = r7
            r16 = r10
            r19 = r6
            a32 r7 = r15.b0(r16, r18, r19, r20, r21)
            if (r7 == 0) goto L_0x010a
            m72 r10 = r7.b
            g72 r10 = r10.n
            java.util.ArrayList r8 = r10.d(r8)
            int r8 = r8.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            defpackage.z68.c(r2, r9, r8)
            xy2 r2 = new xy2
            long r8 = r7.a
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.util.List r8 = java.util.Collections.singletonList(r8)
            java.util.List r8 = (java.util.List) r8
            r2.<init>(r8, r5)
            sv0 r8 = r14.d
            r8.c(r2)
            w5b r2 = new w5b
            long r9 = r6.b
            r22 = 0
            long r12 = r7.a
            long r3 = r4.w
            r7 = r1
            long r0 = r6.w
            bl4 r11 = r6.S0
            r15 = r2
            r16 = r12
            r18 = r3
            r20 = r9
            r23 = r0
            r25 = r11
            r15.<init>(r16, r18, r20, r22, r23, r25)
            r8.c(r2)
            boolean r0 = r6.o()
            if (r0 == 0) goto L_0x010b
            hz r0 = r14.f
            r0.a(r6)
            goto L_0x010b
        L_0x010a:
            r7 = r1
        L_0x010b:
            r0 = 0
            r1 = r26
            r1.t(r0)
            b32 r2 = r7.o
            java.lang.String r3 = r7.v
            if (r2 == 0) goto L_0x0186
            boolean r3 = defpackage.cvg.A(r3)
            if (r3 != 0) goto L_0x0186
            rm r3 = r1.c
            if (r3 == 0) goto L_0x0122
            goto L_0x0123
        L_0x0122:
            r3 = 0
        L_0x0123:
            r62 r3 = r3.c()
            java.util.List r4 = kotlin.collections.CollectionsKt.listOf(r2)
            java.util.List r3 = r3.n0(r4)
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x0144
            java.lang.Object r0 = r3.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            goto L_0x015b
        L_0x0144:
            rm r0 = r1.c
            if (r0 == 0) goto L_0x0149
            goto L_0x014a
        L_0x0149:
            r0 = 0
        L_0x014a:
            r62 r0 = r0.c()
            long r2 = r2.a
            a32 r0 = r0.D(r2)
            if (r0 == 0) goto L_0x0159
            long r2 = r0.a
            goto L_0x015b
        L_0x0159:
            r2 = 0
        L_0x015b:
            rm r0 = r1.c
            if (r0 == 0) goto L_0x0160
            goto L_0x0161
        L_0x0160:
            r0 = 0
        L_0x0161:
            r62 r0 = r0.c()
            r0.j0(r2, r5)
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0186
            rm r0 = r1.c
            if (r0 == 0) goto L_0x0174
            r3 = r0
            goto L_0x0175
        L_0x0174:
            r3 = 0
        L_0x0175:
            sv0 r0 = r3.b()
            js3 r1 = new js3
            r2 = 5
            r1.<init>(r2)
            r0.c(r1)
            goto L_0x0186
        L_0x0183:
            r26.c()
        L_0x0186:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dw9.e(ibf):void");
    }

    public final int f() {
        return DurationKt.NANOS_IN_MILLIS;
    }

    public final fbf g() {
        Long valueOf = Long.valueOf(this.w);
        String str = this.z.a;
        np2 np2 = new np2((x3b) null, 28);
        np2.t("callbackId", this.o);
        np2.t(ApiProtocol.PARAM_PAYLOAD, this.v);
        ((HashMap) np2.b).put("timestamp", valueOf);
        if (str != null) {
            np2.t("type", str);
        }
        return np2;
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_MSG_SEND_CALLBACK;
    }

    public final void h(qaf qaf) {
        if (!m58.A(qaf.b)) {
            c();
            t(false);
            rm rmVar = this.c;
            rm rmVar2 = null;
            if (rmVar == null) {
                rmVar = null;
            }
            ha9 r = rmVar.d().r(this.x);
            if (r == null || r.Y == qe9.DELETED) {
                c();
                return;
            }
            rm rmVar3 = this.c;
            if (rmVar3 != null) {
                rmVar2 = rmVar3;
            }
            rmVar2.b().c(new hj0(qaf));
            return;
        }
        t(true);
    }

    public final void t(boolean z2) {
        rm rmVar = this.c;
        rm rmVar2 = null;
        if (rmVar == null) {
            rmVar = null;
        }
        ha9 r = rmVar.d().r(this.x);
        if (r == null || r.Y == qe9.DELETED) {
            c();
            return;
        }
        rm rmVar3 = this.c;
        if (rmVar3 == null) {
            rmVar3 = null;
        }
        fa9 d = rmVar3.d();
        dw0 dw0 = this.y;
        int i = dw0.a;
        d.getClass();
        ((a74) d.a).c.n(r.b, new c62(new da9(this.o, i, dw0.b, z2), 1));
        rm rmVar4 = this.c;
        if (rmVar4 != null) {
            rmVar2 = rmVar4;
        }
        rmVar2.b().c(new twf(0, r.z, r.b));
    }
}
