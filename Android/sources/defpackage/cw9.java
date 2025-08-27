package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.collections.CollectionsKt;
import kotlin.time.DurationKt;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: cw9  reason: default package */
public final class cw9 extends qm implements lcf, hdb {
    public final long o;
    public final long v;
    public final long w;
    public final long x;
    public final boolean y;
    public final long z;

    public cw9(long j, long j2, long j3, long j4, long j5, boolean z2, long j6) {
        super(j);
        this.w = j4;
        this.x = j5;
        this.o = j3;
        this.v = j2;
        this.y = z2;
        this.z = j6;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [u5b, java.lang.Object] */
    public static v5b u(ha9 ha9) {
        int i;
        y5b y5b = null;
        a00 f = !ha9.q() ? qe8.f(ha9.x0) : null;
        if (ha9.A0 != null) {
            int i2 = 2;
            int i3 = ha9.y0;
            if (i3 != 1) {
                if (i3 != 2) {
                    i = 1;
                    y5b = new y5b(i, ha9.H0, ha9.I0);
                } else {
                    i2 = 3;
                }
            }
            i = i2;
            y5b = new y5b(i, ha9.H0, ha9.I0);
        }
        ArrayList v2 = qe8.v(ha9.P0);
        ? obj = new Object();
        obj.a = ha9.x;
        obj.b = ha9.y;
        obj.c = f;
        obj.d = y5b;
        obj.e = ha9.E0;
        obj.f = ha9.K0;
        obj.h = v2;
        obj.i = ha9.R0;
        return obj.a();
    }

    public static cw9 w(byte[] bArr) {
        try {
            Tasks.MsgSend msgSend = (Tasks.MsgSend) ad9.mergeFrom(new Tasks.MsgSend(), bArr);
            return new cw9(msgSend.requestId, msgSend.messageId, msgSend.chatId, msgSend.chatServerId, msgSend.userId, msgSend.notify, msgSend.lastKnownDraftTime);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        }
    }

    public final int b() {
        fa9 d = this.c.d();
        long j = this.v;
        ha9 r = d.r(j);
        long j2 = this.o;
        a32 G = r != null ? this.c.c().G(r.z) : this.c.c().G(j2);
        long j3 = this.w;
        if (j3 == 0 && G != null) {
            j3 = G.b.a;
        }
        if (r != null && r.Y == qe9.DELETED && r.c == 0) {
            fa9 d2 = this.c.d();
            d2.getClass();
            d2.d(j2, Collections.singletonList(Long.valueOf(j)));
            z(j3, j);
            return 3;
        } else if (r == null || r.Y == qe9.DELETED || r.X == oa9.ERROR) {
            z(j3, j);
            return 3;
        } else if (G == null) {
            ((uta) ((m95) this.c.y.getValue())).c(new Exception("chat is null"), true);
            z(j3, j);
            return 3;
        } else {
            z68.c("cw9", "onPreExecute: chat = %d, messageId = %d, serverMessageId = %d", Long.valueOf(G.a), Long.valueOf(r.b), Long.valueOf(r.c));
            if (!G.N() && G.b.a == 0 && (!r.z() || r.f().a != p10.b)) {
                return 2;
            }
            if (!t20.b(r)) {
                z68.c("cw9", "onPreExecute: attaches not ready, SKIP", new Object[0]);
                return 2;
            }
            if (r.B()) {
                d20 d20 = r.a(g20.v0).n;
                if (d20.d() || d20.a()) {
                    return 2;
                }
            }
            v5b u = u(r);
            a00 a00 = u.c;
            if ((a00 != null && !a00.isEmpty()) || !cvg.A(u.b) || u.d != null) {
                return 1;
            }
            z68.c("cw9", "createRequest: empty outgoing message chatId = %s, messageId = %s", Long.valueOf(j2), Long.valueOf(j));
            h(new qaf("android.empty.message.and.attach", "MsgSend with empty text and attaches", (String) null));
            return 3;
        }
    }

    public final void c() {
        ha9 r = this.c.d().r(this.v);
        if (r != null) {
            this.c.d().z(r, oa9.ERROR);
            this.c.b().c(new twf(r.z, r.b));
        }
    }

    public final byte[] d() {
        Tasks.MsgSend msgSend = new Tasks.MsgSend();
        msgSend.requestId = this.a;
        msgSend.messageId = this.v;
        msgSend.chatId = this.o;
        long j = this.w;
        if (j != 0) {
            msgSend.chatServerId = j;
        }
        long j2 = this.x;
        if (j2 != 0) {
            msgSend.userId = j2;
        }
        msgSend.notify = this.y;
        msgSend.lastKnownDraftTime = this.z;
        return ad9.toByteArray(msgSend);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0094, code lost:
        r5 = defpackage.qe9.DELETED;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(defpackage.ibf r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = 1
            r2 = r19
            fw9 r2 = (defpackage.fw9) r2
            rm r3 = r0.c
            fa9 r3 = r3.d()
            long r4 = r0.v
            ha9 r3 = r3.r(r4)
            b89 r6 = r2.o
            java.lang.String r7 = "cw9"
            if (r6 == 0) goto L_0x0084
            if (r3 == 0) goto L_0x0084
            cl4 r6 = r6.B0
            if (r6 != 0) goto L_0x0084
            boolean r6 = r3.p()
            if (r6 == 0) goto L_0x0084
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "receive message without delayed attrs but send as delayed"
            r4.<init>(r5)
            java.lang.String r5 = "look's like delayed attrs is not supported!"
            defpackage.z68.o(r7, r5, r4)
            rm r4 = r0.c
            fa9 r4 = r4.d()
            r4.getClass()
            long r5 = r3.b
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r7 = "fa9"
            java.lang.String r8 = "clearDelayedAttrs %d"
            defpackage.z68.c(r7, r8, r3)
            s74 r3 = r4.a
            a74 r3 = (defpackage.a74) r3
            z6d r3 = r3.c
            r7 = 0
            r3.q(r5, r7, r7)
            esb r3 = r4.f
            java.util.concurrent.ConcurrentHashMap r3 = r3.c
            java.lang.Long r4 = java.lang.Long.valueOf(r5)
            r3.remove(r4)
            rm r3 = r0.c
            kotlin.Lazy r3 = r3.E
            java.lang.Object r3 = r3.getValue()
            r4 = r3
            hw9 r4 = (defpackage.hw9) r4
            b89 r9 = r2.o
            long r5 = r0.o
            long r7 = r2.c
            r4.a(r5, r7, r9)
            rm r0 = r0.c
            sv0 r0 = r0.b()
            js3 r2 = new js3
            r2.<init>(r1)
            r0.c(r2)
            goto L_0x018b
        L_0x0084:
            long r8 = r2.c
            if (r3 == 0) goto L_0x0091
            boolean r6 = r3.p()
            if (r6 != 0) goto L_0x0091
            r0.z(r8, r4)
        L_0x0091:
            r4 = 0
            if (r3 == 0) goto L_0x00a4
            qe9 r5 = defpackage.qe9.DELETED
            qe9 r6 = r3.Y
            if (r6 != r5) goto L_0x00a4
            long r5 = r3.c
            r10 = 0
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x00a4
            r5 = r1
            goto L_0x00a5
        L_0x00a4:
            r5 = r4
        L_0x00a5:
            b89 r6 = r2.o
            if (r5 == 0) goto L_0x00fd
            rm r1 = r0.c
            fa9 r1 = r1.d()
            cd4 r4 = defpackage.oa9.b
            qe9 r13 = defpackage.qe9.DELETED
            s74 r1 = r1.a
            a74 r1 = (defpackage.a74) r1
            z6d r8 = r1.c
            long r10 = r0.o
            r12 = 0
            b89 r9 = r2.o
            r8.o(r9, r10, r12, r13)
            boolean r1 = r3.p()
            if (r1 == 0) goto L_0x00cc
            bl4 r1 = defpackage.bl4.DELAYED
        L_0x00c9:
            r17 = r1
            goto L_0x00cf
        L_0x00cc:
            bl4 r1 = defpackage.bl4.REGULAR
            goto L_0x00c9
        L_0x00cf:
            rm r1 = r0.c
            rl r1 = r1.a()
            long r2 = r3.b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.util.List r13 = java.util.Collections.singletonList(r2)
            long r2 = r6.a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.util.List r14 = java.util.Collections.singletonList(r2)
            r8 = r1
            jna r8 = (defpackage.jna) r8
            long r9 = r0.o
            r16 = 0
            long r11 = r0.w
            r15 = 0
            r8.I(r9, r11, r13, r14, r15, r16, r17)
            java.lang.String r0 = "onSuccess: sent api request for deletion locally deleted message"
            defpackage.z68.c(r7, r0, new java.lang.Object[0])
            goto L_0x018b
        L_0x00fd:
            if (r3 == 0) goto L_0x0177
            boolean r5 = r3.z()
            if (r5 == 0) goto L_0x0177
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r10 = "onSuccessControlMessage, messageDb.event = "
            r5.<init>(r10)
            q10 r10 = r3.f()
            p10 r10 = r10.a
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            defpackage.z68.c(r7, r5, new java.lang.Object[0])
            q10 r5 = r3.f()
            p10 r5 = r5.a
            int r5 = r5.ordinal()
            if (r5 == r1) goto L_0x0129
            goto L_0x0157
        L_0x0129:
            q10 r1 = r3.f()
            java.util.ArrayList r1 = r1.c
            a00 r5 = r6.y
            java.lang.Object r4 = r5.get(r4)
            ox3 r4 = (defpackage.ox3) r4
            java.util.List r4 = r4.w
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r1)
            r5.removeAll(r4)
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L_0x0157
            rm r1 = r0.c
            sv0 r1 = r1.b()
            zub r4 = new zub
            long r6 = r3.z
            r4.<init>(r6, r5)
            r1.c(r4)
        L_0x0157:
            rm r1 = r0.c
            kotlin.Lazy r1 = r1.E
            java.lang.Object r1 = r1.getValue()
            r10 = r1
            hw9 r10 = (defpackage.hw9) r10
            long r13 = r2.c
            long r11 = r0.o
            b89 r15 = r2.o
            r10.a(r11, r13, r15)
            rm r0 = r0.c
            rl r0 = r0.a()
            jna r0 = (defpackage.jna) r0
            r0.l(r8)
            goto L_0x018b
        L_0x0177:
            rm r1 = r0.c
            kotlin.Lazy r1 = r1.E
            java.lang.Object r1 = r1.getValue()
            r3 = r1
            hw9 r3 = (defpackage.hw9) r3
            b89 r8 = r2.o
            long r4 = r0.o
            long r6 = r2.c
            r3.a(r4, r6, r8)
        L_0x018b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cw9.e(ibf):void");
    }

    public final int f() {
        return DurationKt.NANOS_IN_MILLIS;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.fbf g() {
        /*
            r22 = this;
            r0 = r22
            rm r1 = r0.c
            fa9 r1 = r1.d()
            long r2 = r0.v
            ha9 r1 = r1.r(r2)
            java.lang.String r4 = "cw9"
            r5 = 0
            if (r1 != 0) goto L_0x001a
            java.lang.String r0 = "messageDb is null"
            defpackage.z68.c(r4, r0, new java.lang.Object[0])
            goto L_0x00a4
        L_0x001a:
            rm r6 = r0.c
            r62 r6 = r6.c()
            long r7 = r1.z
            a32 r6 = r6.G(r7)
            long r7 = r0.w
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0040
            if (r6 == 0) goto L_0x0040
            boolean r11 = r6.N()
            if (r11 != 0) goto L_0x0040
            m72 r11 = r6.b
            long r11 = r11.a
            int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r9 == 0) goto L_0x0040
            r14 = r11
            goto L_0x0041
        L_0x0040:
            r14 = r7
        L_0x0041:
            if (r6 == 0) goto L_0x0052
            boolean r6 = r6.K()
            if (r6 == 0) goto L_0x0052
            boolean r6 = r0.y
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r19 = r6
            goto L_0x0054
        L_0x0052:
            r19 = r5
        L_0x0054:
            v5b r1 = u(r1)
            a00 r6 = r1.c
            if (r6 == 0) goto L_0x0062
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0094
        L_0x0062:
            java.lang.String r6 = r1.b
            boolean r6 = defpackage.cvg.A(r6)
            if (r6 == 0) goto L_0x0094
            y5b r6 = r1.d
            if (r6 == 0) goto L_0x006f
            goto L_0x0094
        L_0x006f:
            long r6 = r0.o
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "createRequest: empty outgoing message chatId = %s, messageId = %s"
            defpackage.z68.c(r4, r2, r1)
            qaf r1 = new qaf
            java.lang.String r2 = "android.empty.message.and.attach"
            java.lang.String r3 = "MsgSend with empty text and attaches"
            r1.<init>(r2, r3, r5)
            r0.h(r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0094:
            np2 r5 = new np2
            long r2 = r0.x
            long r6 = r0.z
            r13 = r5
            r16 = r2
            r18 = r1
            r20 = r6
            r13.<init>(r14, r16, r18, r19, r20)
        L_0x00a4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cw9.g():fbf");
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_MSG_SEND;
    }

    public final void h(qaf qaf) {
        long j;
        long j2;
        vk3 m;
        long j3;
        w28 w28;
        qaf qaf2 = qaf;
        fa9 d = this.c.d();
        long j4 = this.v;
        ha9 r = d.r(j4);
        if (r != null) {
            r62 c = this.c.c();
            long j5 = this.o;
            a32 G = c.G(j5);
            long j6 = G != null ? G.b.a : 0;
            fa9 d2 = this.c.d();
            String str = qaf2.b;
            aj9 d3 = ((a74) d2.a).c.d();
            i6d i6d = d3.a;
            i6d.b();
            uf9 uf9 = d3.h;
            gf6 E = uf9.E();
            if (str == null) {
                E.X(1);
            } else {
                E.h(1, str);
            }
            E.k(2, j4);
            try {
                i6d.c();
                E.n();
                i6d.r();
                i6d.l();
                uf9.S(E);
                fa9 d4 = this.c.d();
                String str2 = qaf2.o;
                if (str2 == null) {
                    str2 = "";
                }
                aj9 d5 = ((a74) d4.a).c.d();
                i6d i6d2 = d5.a;
                i6d2.b();
                uf9 uf92 = d5.i;
                gf6 E2 = uf92.E();
                E2.h(1, str2);
                E2.k(2, j4);
                try {
                    i6d2.c();
                    E2.n();
                    i6d2.r();
                    i6d2.l();
                    uf92.S(E2);
                    String str3 = qaf2.b;
                    boolean A = m58.A(str3);
                    long j7 = this.a;
                    long j8 = r.b;
                    if (!A) {
                        boolean z2 = r.z();
                        bl4 bl4 = r.S0;
                        long j9 = j7;
                        long j10 = j4;
                        long j11 = this.w;
                        if (z2) {
                            if ("error.phone.binding.required".equals(str3)) {
                                v(r);
                            } else {
                                z68.f("cw9", "onFailControlMessage, in event = " + r.f().a, (Throwable) null);
                                r62 c2 = this.c.c();
                                c2.getClass();
                                z68.c("r62", "deleteAndUpdateLastMessage, chatId = " + j5, new Object[0]);
                                hs7 hs7 = c2.s;
                                fa9 fa9 = (fa9) hs7.get();
                                fa9.getClass();
                                fa9.d(j5, Collections.singletonList(Long.valueOf(j8)));
                                c2.m.c(new kv9(j5, Collections.singletonList(Long.valueOf(j8)), (bl4) null));
                                c2.u0(j5, ((fa9) hs7.get()).q(j5, bl4), true);
                                ((jna) this.c.a()).l(j11);
                                this.c.b().c(new xy2(Collections.singletonList(Long.valueOf(j5)), false));
                            }
                        } else if ("not.found".equals(str3) || "user.not.found".equals(str3)) {
                            long j12 = j10;
                            j = j9;
                            j2 = j8;
                            t(r);
                            a32 G2 = this.c.c().G(j5);
                            if (!(G2 == null || (m = G2.m()) == null)) {
                                ((km3) this.c.n.getValue()).w(m.r());
                                this.c.b().c(new xy2(Collections.singletonList(Long.valueOf(j5)), true));
                            }
                            z(j6, j12);
                        } else if ("privacy.restricted".equals(str3)) {
                            z68.f("cw9", "onFailPrivacyRestricted, message send to dialog, chatId = " + r.z, (Throwable) null);
                            t(r);
                            zub zub = new zub(j5, Collections.singletonList(Long.valueOf(this.x)));
                            this.c.b().c(zub);
                            ((jna) this.c.a()).l(j11);
                            this.c.b().c(new xy2(Collections.singletonList(Long.valueOf(j5)), true, false, bl4.REGULAR, zub, 96));
                            z(j6, j10);
                        } else {
                            long j13 = j10;
                            long j14 = j11;
                            if ("error.phone.binding.required".equals(str3)) {
                                v(r);
                                z(j6, j13);
                            } else {
                                if (("video.not.found".equalsIgnoreCase(str3) || "photo.not.found".equalsIgnoreCase(str3) || "file.not.found".equalsIgnoreCase(str3) || "sticker.not.found".equalsIgnoreCase(str3)) && (w28 = r.x0) != null && w28.G() > 0 && w28.G() != 0) {
                                    int i = 0;
                                    while (true) {
                                        if (i < w28.G()) {
                                            if (cvg.A(w28.F(i).r)) {
                                                break;
                                            }
                                            i++;
                                        } else if (x(r)) {
                                            for (int i2 = 0; i2 < w28.G(); i2++) {
                                                l20 F = w28.F(i2);
                                                this.c.d().x(j8, F.q, new td8(23, F));
                                            }
                                            ((jqg) this.c.g.getValue()).a(new yud(j5, j13));
                                            j3 = j9;
                                            this.c.e().d(j3);
                                            j2 = j8;
                                        } else {
                                            j3 = j9;
                                            t(r);
                                            j2 = j8;
                                            this.c.b().c(new gw9(this.a, qaf, this.o));
                                            z(j14, j13);
                                        }
                                    }
                                    j = j3;
                                }
                                j3 = j9;
                                j2 = j8;
                                if ("attachment.not.ready".equals(str3)) {
                                    y(r, j6);
                                    ((t20) this.c.F.getValue()).c(r);
                                } else if ("android.empty.message.and.attach".equals(str3)) {
                                    try {
                                        x(r);
                                    } catch (Throwable unused) {
                                    }
                                    z(j6, j13);
                                    ((a74) this.c.d().a).c.d().o(j5, CollectionsKt.listOf(Long.valueOf(j13)), qe9.DELETED);
                                    sv0 b = this.c.b();
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Long.valueOf(j2));
                                    b.c(new kv9(this.o, arrayList, bl4));
                                    this.c.e().d(j3);
                                } else {
                                    t(r);
                                    sv0 b2 = this.c.b();
                                    j = j3;
                                    gw9 gw9 = r1;
                                    gw9 gw92 = new gw9(this.a, qaf, this.o);
                                    b2.c(gw9);
                                    z(j6, j13);
                                }
                                j = j3;
                            }
                        }
                        j = j9;
                        j2 = j8;
                    } else {
                        j2 = j8;
                        j = j7;
                        y(r, j6);
                    }
                    this.c.b().c(new twf(0, j5, j2));
                    this.c.b().c(new hj0(j, qaf));
                } catch (Throwable th) {
                    uf92.S(E2);
                    throw th;
                }
            } catch (Throwable th2) {
                uf9.S(E);
                throw th2;
            }
        }
    }

    public final void t(ha9 ha9) {
        this.c.d().z(ha9, oa9.ERROR);
        this.c.c().u0(this.o, ha9, false);
        this.c.e().d(this.a);
    }

    public final void v(ha9 ha9) {
        z68.f("cw9", "onFailPhoneBindingRequired, message send to dialog, chatId = " + ha9.z, (Throwable) null);
        t(ha9);
        sv0 b = this.c.b();
        long j = this.o;
        b.c(new udb(j));
        ((jna) this.c.a()).l(this.w);
        this.c.b().c(new xy2(Collections.singletonList(Long.valueOf(j)), true));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x000b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean x(defpackage.ha9 r8) {
        /*
            r7 = this;
            w28 r8 = r8.x0
            java.lang.Object r8 = r8.b
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
            r0 = 0
        L_0x000b:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0082
            java.lang.Object r1 = r8.next()
            l20 r1 = (defpackage.l20) r1
            g20 r2 = r1.a
            int r2 = r2.ordinal()
            r3 = 2
            r4 = 0
            if (r2 == r3) goto L_0x0042
            r3 = 3
            if (r2 == r3) goto L_0x003b
            r3 = 5
            r6 = 0
            if (r2 == r3) goto L_0x0036
            r3 = 9
            if (r2 == r3) goto L_0x002f
        L_0x002d:
            r2 = r4
            goto L_0x0047
        L_0x002f:
            s10 r1 = r1.j
            long r2 = r1.a
            java.lang.String r6 = r1.e
            goto L_0x0047
        L_0x0036:
            f20 r1 = r1.f
            long r2 = r1.a
            goto L_0x0047
        L_0x003b:
            k20 r1 = r1.d
            long r2 = r1.a
            java.lang.String r6 = r1.l
            goto L_0x0047
        L_0x0042:
            x10 r1 = r1.b
            java.lang.String r6 = r1.x
            goto L_0x002d
        L_0x0047:
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0051
            boolean r4 = defpackage.cvg.A(r6)
            if (r4 != 0) goto L_0x000b
        L_0x0051:
            if (r1 == 0) goto L_0x0067
            rm r0 = r7.c     // Catch:{ all -> 0x0065 }
            kotlin.Lazy r0 = r0.D     // Catch:{ all -> 0x0065 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0065 }
            fzf r0 = (defpackage.fzf) r0     // Catch:{ all -> 0x0065 }
            ma3 r0 = r0.b(r2)     // Catch:{ all -> 0x0065 }
            r0.a()     // Catch:{ all -> 0x0065 }
            goto L_0x0080
        L_0x0065:
            r0 = move-exception
            goto L_0x0079
        L_0x0067:
            rm r0 = r7.c     // Catch:{ all -> 0x0065 }
            kotlin.Lazy r0 = r0.D     // Catch:{ all -> 0x0065 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0065 }
            fzf r0 = (defpackage.fzf) r0     // Catch:{ all -> 0x0065 }
            ma3 r0 = r0.e(r6)     // Catch:{ all -> 0x0065 }
            r0.a()     // Catch:{ all -> 0x0065 }
            goto L_0x0080
        L_0x0079:
            java.lang.String r1 = "cw9"
            java.lang.String r2 = "onAttachNotFound: failed"
            defpackage.z68.f(r1, r2, r0)
        L_0x0080:
            r0 = 1
            goto L_0x000b
        L_0x0082:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cw9.x(ha9):boolean");
    }

    public final void y(ha9 ha9, long j) {
        this.c.d().z(ha9, oa9.SENDING);
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i != 0) {
            d6b d6b = (d6b) this.c.C.getValue();
            d6b.getClass();
            if (i != 0) {
                d6b.f(j, ha9.C() ? b10.PHOTO : ha9.w() ? b10.AUDIO : ha9.n(g20.o) ? b10.VIDEO : ha9.n(g20.X) ? b10.FILE : ha9.F() ? b10.STICKER : null, ha9.b);
            }
        }
    }

    public final void z(long j, long j2) {
        if (j != 0) {
            ((d6b) this.c.C.getValue()).getClass();
            d6b.b(j, j2);
        }
    }
}
