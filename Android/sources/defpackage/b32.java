package defpackage;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* renamed from: b32  reason: default package */
public final class b32 implements Serializable {
    public final ll2 A0;
    public final String B0;
    public final syc C0;
    public final int D0;
    public final gv6 E0;
    public final b89 F0;
    public final boolean G0;
    public final boolean H0;
    public final boolean I0;
    public final long J0;
    public final Map K0;
    public final af0 L0;
    public final ar0 M0;
    public final long N0;
    public final Map O0;
    public final long P0;
    public final boolean Q0;
    public final long R0;
    public final String S0;
    public final long T0;
    public final long U0;
    public final int V0;
    public final int W0;
    public final long X;
    public final long Y;
    public final int Z;
    public final long a;
    public final String b;
    public final long c;
    public final Map o;
    public final long v;
    public final long v0;
    public final String w;
    public final int w0;
    public final String x;
    public final String x0;
    public final String y;
    public final List y0;
    public final b89 z;
    public final int z0;

    public b32(z22 z22) {
        this.a = z22.a;
        this.V0 = z22.N;
        this.b = z22.b;
        this.c = z22.c;
        this.o = z22.d;
        this.v = z22.e;
        this.w = z22.f;
        this.x = z22.g;
        this.y = z22.h;
        this.z = z22.i;
        this.X = z22.j;
        this.Y = z22.k;
        this.Z = z22.l;
        this.v0 = z22.m;
        this.w0 = z22.r;
        this.x0 = z22.s;
        this.y0 = z22.t;
        this.z0 = z22.u;
        this.A0 = z22.v;
        this.W0 = z22.O;
        this.B0 = z22.n;
        this.C0 = z22.o;
        this.D0 = z22.p;
        this.E0 = z22.q;
        this.F0 = z22.w;
        this.G0 = z22.x;
        this.H0 = z22.y;
        this.I0 = z22.z;
        this.J0 = z22.A;
        this.K0 = z22.B;
        this.L0 = z22.C;
        this.M0 = new ar0(z22.D, z22.E);
        this.N0 = z22.F;
        this.O0 = z22.G;
        this.P0 = z22.H;
        this.Q0 = z22.I;
        this.R0 = z22.J;
        this.S0 = z22.K;
        this.T0 = z22.L;
        this.U0 = z22.M;
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [java.lang.Object, z22] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.b32 a(defpackage.pf9 r37) {
        /*
            r1 = r37
            r2 = 19
            r3 = 6
            r6 = 8
            r11 = 1
            z22 r12 = new z22
            r12.<init>()
            int r13 = r37.y0()
            r14 = 0
        L_0x0012:
            if (r14 >= r13) goto L_0x0a29
            java.lang.String r0 = r37.A0()
            r0.getClass()
            java.lang.String r4 = "ServerPayload/PayloadCatching"
            java.lang.String r5 = "payloadCatching catch error"
            r7 = 0
            int r16 = r0.hashCode()
            switch(r16) {
                case -2053454177: goto L_0x0242;
                case -1979713632: goto L_0x0236;
                case -1978702690: goto L_0x022a;
                case -1867885268: goto L_0x021e;
                case -1762954607: goto L_0x0212;
                case -1724546052: goto L_0x0206;
                case -1546399601: goto L_0x01fa;
                case -1502776474: goto L_0x01ee;
                case -1455877999: goto L_0x01e1;
                case -1423461020: goto L_0x01d3;
                case -1422235900: goto L_0x01c5;
                case -1401749737: goto L_0x01b7;
                case -1249474914: goto L_0x01a9;
                case -1148295641: goto L_0x019b;
                case -1113254034: goto L_0x018d;
                case -1057446789: goto L_0x017f;
                case -951297470: goto L_0x0171;
                case -892481550: goto L_0x0163;
                case -816024198: goto L_0x0155;
                case -805278779: goto L_0x0148;
                case -775459091: goto L_0x013a;
                case -615513399: goto L_0x012c;
                case -483209263: goto L_0x011e;
                case -354744795: goto L_0x0110;
                case -26075201: goto L_0x0102;
                case -15797038: goto L_0x00f4;
                case 3355: goto L_0x00e6;
                case 98494: goto L_0x00d8;
                case 3321850: goto L_0x00ca;
                case 3575610: goto L_0x00bc;
                case 106164915: goto L_0x00ae;
                case 110371416: goto L_0x00a0;
                case 278143171: goto L_0x0093;
                case 572260623: goto L_0x0086;
                case 696411462: goto L_0x0079;
                case 794652428: goto L_0x006c;
                case 979634893: goto L_0x005f;
                case 1028554472: goto L_0x0052;
                case 1075866255: goto L_0x0045;
                case 1707006687: goto L_0x0038;
                case 1867394383: goto L_0x002b;
                default: goto L_0x0028;
            }
        L_0x0028:
            r0 = -1
            goto L_0x024d
        L_0x002b:
            java.lang.String r9 = "participantsCount"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0034
            goto L_0x0028
        L_0x0034:
            r0 = 40
            goto L_0x024d
        L_0x0038:
            java.lang.String r9 = "lastReaction"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0041
            goto L_0x0028
        L_0x0041:
            r0 = 39
            goto L_0x024d
        L_0x0045:
            java.lang.String r9 = "prevMessageId"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x004e
            goto L_0x0028
        L_0x004e:
            r0 = 38
            goto L_0x024d
        L_0x0052:
            java.lang.String r9 = "created"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x005b
            goto L_0x0028
        L_0x005b:
            r0 = 37
            goto L_0x024d
        L_0x005f:
            java.lang.String r9 = "markedAsUnread"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0068
            goto L_0x0028
        L_0x0068:
            r0 = 36
            goto L_0x024d
        L_0x006c:
            java.lang.String r9 = "newMessages"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0075
            goto L_0x0028
        L_0x0075:
            r0 = 35
            goto L_0x024d
        L_0x0079:
            java.lang.String r9 = "hasBots"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0082
            goto L_0x0028
        L_0x0082:
            r0 = 34
            goto L_0x024d
        L_0x0086:
            java.lang.String r9 = "pinnedMessage"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x008f
            goto L_0x0028
        L_0x008f:
            r0 = 33
            goto L_0x024d
        L_0x0093:
            java.lang.String r9 = "blockedParticipantsCount"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x009c
            goto L_0x0028
        L_0x009c:
            r0 = 32
            goto L_0x024d
        L_0x00a0:
            java.lang.String r9 = "title"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x00aa
            goto L_0x0028
        L_0x00aa:
            r0 = 31
            goto L_0x024d
        L_0x00ae:
            java.lang.String r9 = "owner"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x00b8
            goto L_0x0028
        L_0x00b8:
            r0 = 30
            goto L_0x024d
        L_0x00bc:
            java.lang.String r9 = "type"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x00c6
            goto L_0x0028
        L_0x00c6:
            r0 = 29
            goto L_0x024d
        L_0x00ca:
            java.lang.String r9 = "link"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x00d4
            goto L_0x0028
        L_0x00d4:
            r0 = 28
            goto L_0x024d
        L_0x00d8:
            java.lang.String r9 = "cid"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x00e2
            goto L_0x0028
        L_0x00e2:
            r0 = 27
            goto L_0x024d
        L_0x00e6:
            java.lang.String r9 = "id"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x00f0
            goto L_0x0028
        L_0x00f0:
            r0 = 26
            goto L_0x024d
        L_0x00f4:
            java.lang.String r9 = "liveLocationMessageIds"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x00fe
            goto L_0x0028
        L_0x00fe:
            r0 = 25
            goto L_0x024d
        L_0x0102:
            java.lang.String r9 = "lastFireDelayedErrorTime"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x010c
            goto L_0x0028
        L_0x010c:
            r0 = 24
            goto L_0x024d
        L_0x0110:
            java.lang.String r9 = "baseIconUrl"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x011a
            goto L_0x0028
        L_0x011a:
            r0 = 23
            goto L_0x024d
        L_0x011e:
            java.lang.String r9 = "isSuspended"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0128
            goto L_0x0028
        L_0x0128:
            r0 = 22
            goto L_0x024d
        L_0x012c:
            java.lang.String r9 = "modified"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0136
            goto L_0x0028
        L_0x0136:
            r0 = 21
            goto L_0x024d
        L_0x013a:
            java.lang.String r9 = "hidePinnedMessage"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0144
            goto L_0x0028
        L_0x0144:
            r0 = 20
            goto L_0x024d
        L_0x0148:
            java.lang.String r9 = "groupChatInfo"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0152
            goto L_0x0028
        L_0x0152:
            r0 = r2
            goto L_0x024d
        L_0x0155:
            java.lang.String r9 = "lastReactedMessageId"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x015f
            goto L_0x0028
        L_0x015f:
            r0 = 18
            goto L_0x024d
        L_0x0163:
            java.lang.String r9 = "status"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x016d
            goto L_0x0028
        L_0x016d:
            r0 = 17
            goto L_0x024d
        L_0x0171:
            java.lang.String r9 = "lastDelayedUpdateTime"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x017b
            goto L_0x0028
        L_0x017b:
            r0 = 16
            goto L_0x024d
        L_0x017f:
            java.lang.String r9 = "unreadReply"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0189
            goto L_0x0028
        L_0x0189:
            r0 = 15
            goto L_0x024d
        L_0x018d:
            java.lang.String r9 = "lastMentionMessageId"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0197
            goto L_0x0028
        L_0x0197:
            r0 = 14
            goto L_0x024d
        L_0x019b:
            java.lang.String r9 = "restrictions"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x01a5
            goto L_0x0028
        L_0x01a5:
            r0 = 13
            goto L_0x024d
        L_0x01a9:
            java.lang.String r9 = "options"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x01b3
            goto L_0x0028
        L_0x01b3:
            r0 = 12
            goto L_0x024d
        L_0x01b7:
            java.lang.String r9 = "joinTime"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x01c1
            goto L_0x0028
        L_0x01c1:
            r0 = 11
            goto L_0x024d
        L_0x01c5:
            java.lang.String r9 = "admins"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x01cf
            goto L_0x0028
        L_0x01cf:
            r0 = 10
            goto L_0x024d
        L_0x01d3:
            java.lang.String r9 = "access"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x01dd
            goto L_0x0028
        L_0x01dd:
            r0 = 9
            goto L_0x024d
        L_0x01e1:
            java.lang.String r9 = "lastMessage"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x01eb
            goto L_0x0028
        L_0x01eb:
            r0 = r6
            goto L_0x024d
        L_0x01ee:
            java.lang.String r9 = "unreadPin"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x01f8
            goto L_0x0028
        L_0x01f8:
            r0 = 7
            goto L_0x024d
        L_0x01fa:
            java.lang.String r9 = "adminParticipants"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0204
            goto L_0x0028
        L_0x0204:
            r0 = r3
            goto L_0x024d
        L_0x0206:
            java.lang.String r9 = "description"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0210
            goto L_0x0028
        L_0x0210:
            r0 = 5
            goto L_0x024d
        L_0x0212:
            java.lang.String r9 = "lastEventTime"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x021c
            goto L_0x0028
        L_0x021c:
            r0 = 4
            goto L_0x024d
        L_0x021e:
            java.lang.String r9 = "subject"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0228
            goto L_0x0028
        L_0x0228:
            r0 = 3
            goto L_0x024d
        L_0x022a:
            java.lang.String r9 = "videoConversation"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0234
            goto L_0x0028
        L_0x0234:
            r0 = 2
            goto L_0x024d
        L_0x0236:
            java.lang.String r9 = "participants"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0240
            goto L_0x0028
        L_0x0240:
            r0 = r11
            goto L_0x024d
        L_0x0242:
            java.lang.String r9 = "baseRawIconUrl"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x024c
            goto L_0x0028
        L_0x024c:
            r0 = 0
        L_0x024d:
            switch(r0) {
                case 0: goto L_0x0a1d;
                case 1: goto L_0x09eb;
                case 2: goto L_0x0986;
                case 3: goto L_0x0852;
                case 4: goto L_0x084a;
                case 5: goto L_0x0842;
                case 6: goto L_0x080e;
                case 7: goto L_0x0806;
                case 8: goto L_0x07fe;
                case 9: goto L_0x07de;
                case 10: goto L_0x07d6;
                case 11: goto L_0x07ce;
                case 12: goto L_0x03aa;
                case 13: goto L_0x03a2;
                case 14: goto L_0x039a;
                case 15: goto L_0x0392;
                case 16: goto L_0x038a;
                case 17: goto L_0x0382;
                case 18: goto L_0x037a;
                case 19: goto L_0x0372;
                case 20: goto L_0x036a;
                case 21: goto L_0x0362;
                case 22: goto L_0x035a;
                case 23: goto L_0x0352;
                case 24: goto L_0x034a;
                case 25: goto L_0x0317;
                case 26: goto L_0x030f;
                case 27: goto L_0x0307;
                case 28: goto L_0x02ff;
                case 29: goto L_0x02ad;
                case 30: goto L_0x02a5;
                case 31: goto L_0x029d;
                case 32: goto L_0x0295;
                case 33: goto L_0x028d;
                case 34: goto L_0x0285;
                case 35: goto L_0x027d;
                case 36: goto L_0x0275;
                case 37: goto L_0x026d;
                case 38: goto L_0x0265;
                case 39: goto L_0x025d;
                case 40: goto L_0x0255;
                default: goto L_0x0250;
            }
        L_0x0250:
            r37.A()
            goto L_0x0a23
        L_0x0255:
            int r0 = defpackage.ryg.c0(r37)
            r12.r = r0
            goto L_0x0a23
        L_0x025d:
            java.lang.String r0 = defpackage.ryg.g0(r37)
            r12.K = r0
            goto L_0x0a23
        L_0x0265:
            long r4 = defpackage.ryg.d0(r1, r7)
            r12.m = r4
            goto L_0x0a23
        L_0x026d:
            long r4 = r37.x0()
            r12.e = r4
            goto L_0x0a23
        L_0x0275:
            boolean r0 = defpackage.ryg.Y(r37)
            r12.I = r0
            goto L_0x0a23
        L_0x027d:
            int r0 = r37.w0()
            r12.l = r0
            goto L_0x0a23
        L_0x0285:
            boolean r0 = defpackage.ryg.Y(r37)
            r12.D = r0
            goto L_0x0a23
        L_0x028d:
            b89 r0 = defpackage.z79.a(r37)
            r12.w = r0
            goto L_0x0a23
        L_0x0295:
            int r0 = defpackage.ryg.c0(r37)
            r12.u = r0
            goto L_0x0a23
        L_0x029d:
            java.lang.String r0 = defpackage.ryg.g0(r37)
            r12.f = r0
            goto L_0x0a23
        L_0x02a5:
            long r4 = r37.x0()
            r12.c = r4
            goto L_0x0a23
        L_0x02ad:
            java.lang.String r0 = r37.A0()
            boolean r4 = defpackage.cvg.A(r0)
            if (r4 == 0) goto L_0x02b9
        L_0x02b7:
            r0 = r11
            goto L_0x02fb
        L_0x02b9:
            r0.getClass()
            int r4 = r0.hashCode()
            switch(r4) {
                case 2067288: goto L_0x02e6;
                case 1456933091: goto L_0x02db;
                case 1796630840: goto L_0x02d0;
                case 2016211272: goto L_0x02c5;
                default: goto L_0x02c3;
            }
        L_0x02c3:
            r0 = -1
            goto L_0x02f0
        L_0x02c5:
            java.lang.String r4 = "DIALOG"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x02ce
            goto L_0x02c3
        L_0x02ce:
            r0 = 3
            goto L_0x02f0
        L_0x02d0:
            java.lang.String r4 = "GROUP_CHAT"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x02d9
            goto L_0x02c3
        L_0x02d9:
            r0 = 2
            goto L_0x02f0
        L_0x02db:
            java.lang.String r4 = "CHANNEL"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x02e4
            goto L_0x02c3
        L_0x02e4:
            r0 = r11
            goto L_0x02f0
        L_0x02e6:
            java.lang.String r4 = "CHAT"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x02ef
            goto L_0x02c3
        L_0x02ef:
            r0 = 0
        L_0x02f0:
            switch(r0) {
                case 0: goto L_0x02fa;
                case 1: goto L_0x02f8;
                case 2: goto L_0x02f6;
                case 3: goto L_0x02f4;
                default: goto L_0x02f3;
            }
        L_0x02f3:
            goto L_0x02b7
        L_0x02f4:
            r0 = 2
            goto L_0x02fb
        L_0x02f6:
            r0 = 5
            goto L_0x02fb
        L_0x02f8:
            r0 = 4
            goto L_0x02fb
        L_0x02fa:
            r0 = 3
        L_0x02fb:
            r12.N = r0
            goto L_0x0a23
        L_0x02ff:
            java.lang.String r0 = r37.A0()
            r12.n = r0
            goto L_0x0a23
        L_0x0307:
            long r4 = r37.x0()
            r12.j = r4
            goto L_0x0a23
        L_0x030f:
            long r4 = r37.x0()
            r12.a = r4
            goto L_0x0a23
        L_0x0317:
            hb9 r0 = r37.n()
            int r0 = r0.a()
            if (r0 != r6) goto L_0x0342
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r15.<init>()
            int r0 = r37.y0()
            r4 = 0
        L_0x032b:
            if (r4 >= r0) goto L_0x0346
            long r17 = defpackage.ryg.d0(r1, r7)
            java.lang.Long r5 = java.lang.Long.valueOf(r17)
            long r17 = defpackage.ryg.d0(r1, r7)
            java.lang.Long r9 = java.lang.Long.valueOf(r17)
            r15.put(r5, r9)
            int r4 = r4 + r11
            goto L_0x032b
        L_0x0342:
            r37.A()
            r15 = 0
        L_0x0346:
            r12.G = r15
            goto L_0x0a23
        L_0x034a:
            long r4 = defpackage.ryg.d0(r1, r7)
            r12.M = r4
            goto L_0x0a23
        L_0x0352:
            java.lang.String r0 = defpackage.ryg.g0(r37)
            r12.g = r0
            goto L_0x0a23
        L_0x035a:
            boolean r0 = defpackage.ryg.Y(r37)
            r12.E = r0
            goto L_0x0a23
        L_0x0362:
            long r4 = defpackage.ryg.d0(r1, r7)
            r12.F = r4
            goto L_0x0a23
        L_0x036a:
            boolean r0 = defpackage.ryg.Y(r37)
            r12.x = r0
            goto L_0x0a23
        L_0x0372:
            gv6 r0 = defpackage.gv6.a(r37)
            r12.q = r0
            goto L_0x0a23
        L_0x037a:
            long r4 = defpackage.ryg.d0(r1, r7)
            r12.J = r4
            goto L_0x0a23
        L_0x0382:
            java.lang.String r0 = r37.A0()
            r12.b = r0
            goto L_0x0a23
        L_0x038a:
            long r4 = defpackage.ryg.d0(r1, r7)
            r12.L = r4
            goto L_0x0a23
        L_0x0392:
            boolean r0 = defpackage.ryg.Y(r37)
            r12.y = r0
            goto L_0x0a23
        L_0x039a:
            long r4 = defpackage.ryg.d0(r1, r7)
            r12.H = r4
            goto L_0x0a23
        L_0x03a2:
            int r0 = defpackage.ryg.c0(r37)
            r12.p = r0
            goto L_0x0a23
        L_0x03aa:
            int r0 = defpackage.ryg.e0(r37)     // Catch:{ all -> 0x03b0 }
            r7 = r0
            goto L_0x03e2
        L_0x03b0:
            r0 = move-exception
            r7 = r0
            defpackage.z68.o(r4, r5, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x03bb:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x03cb
            java.lang.Object r8 = r0.next()
            xm r8 = (defpackage.xm) r8
            r8.a(r7)
            goto L_0x03bb
        L_0x03cb:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x03e1
            if (r0 == r11) goto L_0x03e0
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x03e0:
            throw r7
        L_0x03e1:
            r7 = 0
        L_0x03e2:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r8 = 0
            r9 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
        L_0x03f8:
            if (r8 >= r7) goto L_0x077d
            java.lang.String r0 = defpackage.ryg.g0(r37)     // Catch:{ all -> 0x03ff }
            goto L_0x0436
        L_0x03ff:
            r0 = move-exception
            r10 = r0
            defpackage.z68.o(r4, r5, r10)     // Catch:{ all -> 0x041c }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x041c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x041c }
        L_0x040a:
            boolean r26 = r0.hasNext()     // Catch:{ all -> 0x041c }
            if (r26 == 0) goto L_0x041f
            java.lang.Object r26 = r0.next()     // Catch:{ all -> 0x041c }
            r15 = r26
            xm r15 = (defpackage.xm) r15     // Catch:{ all -> 0x041c }
            r15.a(r10)     // Catch:{ all -> 0x041c }
            goto L_0x040a
        L_0x041c:
            r0 = move-exception
            goto L_0x0794
        L_0x041f:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x041c }
            r0.getClass()     // Catch:{ all -> 0x041c }
            xtd r0 = defpackage.xtd.b     // Catch:{ all -> 0x041c }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x041c }
            if (r0 == 0) goto L_0x0435
            if (r0 == r11) goto L_0x0434
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x041c }
            r0.<init>()     // Catch:{ all -> 0x041c }
            throw r0     // Catch:{ all -> 0x041c }
        L_0x0434:
            throw r10     // Catch:{ all -> 0x041c }
        L_0x0435:
            r0 = 0
        L_0x0436:
            if (r0 == 0) goto L_0x077a
            kotlin.Unit r10 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x041c }
            int r10 = r0.hashCode()     // Catch:{ all -> 0x046f }
            switch(r10) {
                case -1588574526: goto L_0x06cb;
                case -1351652841: goto L_0x0684;
                case -985184211: goto L_0x063c;
                case -314593712: goto L_0x05f4;
                case 2524: goto L_0x05ac;
                case 17337067: goto L_0x0564;
                case 247284269: goto L_0x051e;
                case 513557962: goto L_0x04d6;
                case 687393168: goto L_0x048e;
                case 861231443: goto L_0x0443;
                default: goto L_0x0441;
            }     // Catch:{ all -> 0x046f }
        L_0x0441:
            goto L_0x06d3
        L_0x0443:
            java.lang.String r10 = "ONLY_OWNER_CAN_CHANGE_ICON_TITLE"
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x046f }
            if (r0 != 0) goto L_0x044d
            goto L_0x06d3
        L_0x044d:
            boolean r0 = defpackage.ryg.Y(r37)     // Catch:{ all -> 0x0454 }
            r17 = r0
            goto L_0x048a
        L_0x0454:
            r0 = move-exception
            r10 = r0
            defpackage.z68.o(r4, r5, r10)     // Catch:{ all -> 0x046f }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x046f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x046f }
        L_0x045f:
            boolean r15 = r0.hasNext()     // Catch:{ all -> 0x046f }
            if (r15 == 0) goto L_0x0472
            java.lang.Object r15 = r0.next()     // Catch:{ all -> 0x046f }
            xm r15 = (defpackage.xm) r15     // Catch:{ all -> 0x046f }
            r15.a(r10)     // Catch:{ all -> 0x046f }
            goto L_0x045f
        L_0x046f:
            r0 = move-exception
            goto L_0x0749
        L_0x0472:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x046f }
            r0.getClass()     // Catch:{ all -> 0x046f }
            xtd r0 = defpackage.xtd.b     // Catch:{ all -> 0x046f }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x046f }
            if (r0 == 0) goto L_0x0488
            if (r0 == r11) goto L_0x0487
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x046f }
            r0.<init>()     // Catch:{ all -> 0x046f }
            throw r0     // Catch:{ all -> 0x046f }
        L_0x0487:
            throw r10     // Catch:{ all -> 0x046f }
        L_0x0488:
            r17 = 0
        L_0x048a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x046f }
            goto L_0x0778
        L_0x048e:
            java.lang.String r10 = "ONLY_ADMIN_CAN_CALL"
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x046f }
            if (r0 != 0) goto L_0x0498
            goto L_0x06d3
        L_0x0498:
            boolean r0 = defpackage.ryg.Y(r37)     // Catch:{ all -> 0x049f }
            r22 = r0
            goto L_0x04d2
        L_0x049f:
            r0 = move-exception
            r10 = r0
            defpackage.z68.o(r4, r5, r10)     // Catch:{ all -> 0x046f }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x046f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x046f }
        L_0x04aa:
            boolean r15 = r0.hasNext()     // Catch:{ all -> 0x046f }
            if (r15 == 0) goto L_0x04ba
            java.lang.Object r15 = r0.next()     // Catch:{ all -> 0x046f }
            xm r15 = (defpackage.xm) r15     // Catch:{ all -> 0x046f }
            r15.a(r10)     // Catch:{ all -> 0x046f }
            goto L_0x04aa
        L_0x04ba:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x046f }
            r0.getClass()     // Catch:{ all -> 0x046f }
            xtd r0 = defpackage.xtd.b     // Catch:{ all -> 0x046f }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x046f }
            if (r0 == 0) goto L_0x04d0
            if (r0 == r11) goto L_0x04cf
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x046f }
            r0.<init>()     // Catch:{ all -> 0x046f }
            throw r0     // Catch:{ all -> 0x046f }
        L_0x04cf:
            throw r10     // Catch:{ all -> 0x046f }
        L_0x04d0:
            r22 = 0
        L_0x04d2:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x046f }
            goto L_0x0778
        L_0x04d6:
            java.lang.String r10 = "ONLY_ADMIN_CAN_ADD_MEMBER"
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x046f }
            if (r0 != 0) goto L_0x04e0
            goto L_0x06d3
        L_0x04e0:
            boolean r0 = defpackage.ryg.Y(r37)     // Catch:{ all -> 0x04e7 }
            r19 = r0
            goto L_0x051a
        L_0x04e7:
            r0 = move-exception
            r10 = r0
            defpackage.z68.o(r4, r5, r10)     // Catch:{ all -> 0x046f }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x046f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x046f }
        L_0x04f2:
            boolean r15 = r0.hasNext()     // Catch:{ all -> 0x046f }
            if (r15 == 0) goto L_0x0502
            java.lang.Object r15 = r0.next()     // Catch:{ all -> 0x046f }
            xm r15 = (defpackage.xm) r15     // Catch:{ all -> 0x046f }
            r15.a(r10)     // Catch:{ all -> 0x046f }
            goto L_0x04f2
        L_0x0502:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x046f }
            r0.getClass()     // Catch:{ all -> 0x046f }
            xtd r0 = defpackage.xtd.b     // Catch:{ all -> 0x046f }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x046f }
            if (r0 == 0) goto L_0x0518
            if (r0 == r11) goto L_0x0517
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x046f }
            r0.<init>()     // Catch:{ all -> 0x046f }
            throw r0     // Catch:{ all -> 0x046f }
        L_0x0517:
            throw r10     // Catch:{ all -> 0x046f }
        L_0x0518:
            r19 = 0
        L_0x051a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x046f }
            goto L_0x0778
        L_0x051e:
            java.lang.String r10 = "SIGN_ADMIN"
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x046f }
            if (r0 != 0) goto L_0x0528
            goto L_0x06d3
        L_0x0528:
            boolean r0 = defpackage.ryg.Y(r37)     // Catch:{ all -> 0x052e }
            r9 = r0
            goto L_0x0560
        L_0x052e:
            r0 = move-exception
            r10 = r0
            defpackage.z68.o(r4, r5, r10)     // Catch:{ all -> 0x046f }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x046f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x046f }
        L_0x0539:
            boolean r15 = r0.hasNext()     // Catch:{ all -> 0x046f }
            if (r15 == 0) goto L_0x0549
            java.lang.Object r15 = r0.next()     // Catch:{ all -> 0x046f }
            xm r15 = (defpackage.xm) r15     // Catch:{ all -> 0x046f }
            r15.a(r10)     // Catch:{ all -> 0x046f }
            goto L_0x0539
        L_0x0549:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x046f }
            r0.getClass()     // Catch:{ all -> 0x046f }
            xtd r0 = defpackage.xtd.b     // Catch:{ all -> 0x046f }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x046f }
            if (r0 == 0) goto L_0x055f
            if (r0 == r11) goto L_0x055e
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x046f }
            r0.<init>()     // Catch:{ all -> 0x046f }
            throw r0     // Catch:{ all -> 0x046f }
        L_0x055e:
            throw r10     // Catch:{ all -> 0x046f }
        L_0x055f:
            r9 = 0
        L_0x0560:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x046f }
            goto L_0x0778
        L_0x0564:
            java.lang.String r10 = "OFFICIAL"
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x046f }
            if (r0 != 0) goto L_0x056e
            goto L_0x06d3
        L_0x056e:
            boolean r0 = defpackage.ryg.Y(r37)     // Catch:{ all -> 0x0575 }
            r18 = r0
            goto L_0x05a8
        L_0x0575:
            r0 = move-exception
            r10 = r0
            defpackage.z68.o(r4, r5, r10)     // Catch:{ all -> 0x046f }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x046f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x046f }
        L_0x0580:
            boolean r15 = r0.hasNext()     // Catch:{ all -> 0x046f }
            if (r15 == 0) goto L_0x0590
            java.lang.Object r15 = r0.next()     // Catch:{ all -> 0x046f }
            xm r15 = (defpackage.xm) r15     // Catch:{ all -> 0x046f }
            r15.a(r10)     // Catch:{ all -> 0x046f }
            goto L_0x0580
        L_0x0590:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x046f }
            r0.getClass()     // Catch:{ all -> 0x046f }
            xtd r0 = defpackage.xtd.b     // Catch:{ all -> 0x046f }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x046f }
            if (r0 == 0) goto L_0x05a6
            if (r0 == r11) goto L_0x05a5
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x046f }
            r0.<init>()     // Catch:{ all -> 0x046f }
            throw r0     // Catch:{ all -> 0x046f }
        L_0x05a5:
            throw r10     // Catch:{ all -> 0x046f }
        L_0x05a6:
            r18 = 0
        L_0x05a8:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x046f }
            goto L_0x0778
        L_0x05ac:
            java.lang.String r10 = "OK"
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x046f }
            if (r0 != 0) goto L_0x05b6
            goto L_0x06d3
        L_0x05b6:
            boolean r0 = defpackage.ryg.Y(r37)     // Catch:{ all -> 0x05bd }
            r21 = r0
            goto L_0x05f0
        L_0x05bd:
            r0 = move-exception
            r10 = r0
            defpackage.z68.o(r4, r5, r10)     // Catch:{ all -> 0x046f }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x046f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x046f }
        L_0x05c8:
            boolean r15 = r0.hasNext()     // Catch:{ all -> 0x046f }
            if (r15 == 0) goto L_0x05d8
            java.lang.Object r15 = r0.next()     // Catch:{ all -> 0x046f }
            xm r15 = (defpackage.xm) r15     // Catch:{ all -> 0x046f }
            r15.a(r10)     // Catch:{ all -> 0x046f }
            goto L_0x05c8
        L_0x05d8:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x046f }
            r0.getClass()     // Catch:{ all -> 0x046f }
            xtd r0 = defpackage.xtd.b     // Catch:{ all -> 0x046f }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x046f }
            if (r0 == 0) goto L_0x05ee
            if (r0 == r11) goto L_0x05ed
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x046f }
            r0.<init>()     // Catch:{ all -> 0x046f }
            throw r0     // Catch:{ all -> 0x046f }
        L_0x05ed:
            throw r10     // Catch:{ all -> 0x046f }
        L_0x05ee:
            r21 = 0
        L_0x05f0:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x046f }
            goto L_0x0778
        L_0x05f4:
            java.lang.String r10 = "ALL_CAN_PIN_MESSAGE"
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x046f }
            if (r0 != 0) goto L_0x05fe
            goto L_0x06d3
        L_0x05fe:
            boolean r0 = defpackage.ryg.Y(r37)     // Catch:{ all -> 0x0605 }
            r20 = r0
            goto L_0x0638
        L_0x0605:
            r0 = move-exception
            r10 = r0
            defpackage.z68.o(r4, r5, r10)     // Catch:{ all -> 0x046f }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x046f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x046f }
        L_0x0610:
            boolean r15 = r0.hasNext()     // Catch:{ all -> 0x046f }
            if (r15 == 0) goto L_0x0620
            java.lang.Object r15 = r0.next()     // Catch:{ all -> 0x046f }
            xm r15 = (defpackage.xm) r15     // Catch:{ all -> 0x046f }
            r15.a(r10)     // Catch:{ all -> 0x046f }
            goto L_0x0610
        L_0x0620:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x046f }
            r0.getClass()     // Catch:{ all -> 0x046f }
            xtd r0 = defpackage.xtd.b     // Catch:{ all -> 0x046f }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x046f }
            if (r0 == 0) goto L_0x0636
            if (r0 == r11) goto L_0x0635
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x046f }
            r0.<init>()     // Catch:{ all -> 0x046f }
            throw r0     // Catch:{ all -> 0x046f }
        L_0x0635:
            throw r10     // Catch:{ all -> 0x046f }
        L_0x0636:
            r20 = 0
        L_0x0638:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x046f }
            goto L_0x0778
        L_0x063c:
            java.lang.String r10 = "SENT_BY_PHONE"
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x046f }
            if (r0 != 0) goto L_0x0646
            goto L_0x06d3
        L_0x0646:
            boolean r0 = defpackage.ryg.Y(r37)     // Catch:{ all -> 0x064d }
            r23 = r0
            goto L_0x0680
        L_0x064d:
            r0 = move-exception
            r10 = r0
            defpackage.z68.o(r4, r5, r10)     // Catch:{ all -> 0x046f }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x046f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x046f }
        L_0x0658:
            boolean r15 = r0.hasNext()     // Catch:{ all -> 0x046f }
            if (r15 == 0) goto L_0x0668
            java.lang.Object r15 = r0.next()     // Catch:{ all -> 0x046f }
            xm r15 = (defpackage.xm) r15     // Catch:{ all -> 0x046f }
            r15.a(r10)     // Catch:{ all -> 0x046f }
            goto L_0x0658
        L_0x0668:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x046f }
            r0.getClass()     // Catch:{ all -> 0x046f }
            xtd r0 = defpackage.xtd.b     // Catch:{ all -> 0x046f }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x046f }
            if (r0 == 0) goto L_0x067e
            if (r0 == r11) goto L_0x067d
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x046f }
            r0.<init>()     // Catch:{ all -> 0x046f }
            throw r0     // Catch:{ all -> 0x046f }
        L_0x067d:
            throw r10     // Catch:{ all -> 0x046f }
        L_0x067e:
            r23 = 0
        L_0x0680:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x046f }
            goto L_0x0778
        L_0x0684:
            java.lang.String r10 = "MEMBERS_CAN_SEE_PRIVATE_LINK"
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x046f }
            if (r0 != 0) goto L_0x068d
            goto L_0x06d3
        L_0x068d:
            boolean r0 = defpackage.ryg.Y(r37)     // Catch:{ all -> 0x0694 }
            r25 = r0
            goto L_0x06c7
        L_0x0694:
            r0 = move-exception
            r10 = r0
            defpackage.z68.o(r4, r5, r10)     // Catch:{ all -> 0x046f }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x046f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x046f }
        L_0x069f:
            boolean r15 = r0.hasNext()     // Catch:{ all -> 0x046f }
            if (r15 == 0) goto L_0x06af
            java.lang.Object r15 = r0.next()     // Catch:{ all -> 0x046f }
            xm r15 = (defpackage.xm) r15     // Catch:{ all -> 0x046f }
            r15.a(r10)     // Catch:{ all -> 0x046f }
            goto L_0x069f
        L_0x06af:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x046f }
            r0.getClass()     // Catch:{ all -> 0x046f }
            xtd r0 = defpackage.xtd.b     // Catch:{ all -> 0x046f }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x046f }
            if (r0 == 0) goto L_0x06c5
            if (r0 == r11) goto L_0x06c4
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x046f }
            r0.<init>()     // Catch:{ all -> 0x046f }
            throw r0     // Catch:{ all -> 0x046f }
        L_0x06c4:
            throw r10     // Catch:{ all -> 0x046f }
        L_0x06c5:
            r25 = 0
        L_0x06c7:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x046f }
            goto L_0x0778
        L_0x06cb:
            java.lang.String r10 = "SERVICE_CHAT"
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x046f }
            if (r0 != 0) goto L_0x070c
        L_0x06d3:
            r37.A()     // Catch:{ all -> 0x06d7 }
            goto L_0x0708
        L_0x06d7:
            r0 = move-exception
            r10 = r0
            defpackage.z68.o(r4, r5, r10)     // Catch:{ all -> 0x046f }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x046f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x046f }
        L_0x06e2:
            boolean r15 = r0.hasNext()     // Catch:{ all -> 0x046f }
            if (r15 == 0) goto L_0x06f2
            java.lang.Object r15 = r0.next()     // Catch:{ all -> 0x046f }
            xm r15 = (defpackage.xm) r15     // Catch:{ all -> 0x046f }
            r15.a(r10)     // Catch:{ all -> 0x046f }
            goto L_0x06e2
        L_0x06f2:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x046f }
            r0.getClass()     // Catch:{ all -> 0x046f }
            xtd r0 = defpackage.xtd.b     // Catch:{ all -> 0x046f }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x046f }
            if (r0 == 0) goto L_0x0708
            if (r0 == r11) goto L_0x0707
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x046f }
            r0.<init>()     // Catch:{ all -> 0x046f }
            throw r0     // Catch:{ all -> 0x046f }
        L_0x0707:
            throw r10     // Catch:{ all -> 0x046f }
        L_0x0708:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x046f }
            goto L_0x0778
        L_0x070c:
            boolean r0 = defpackage.ryg.Y(r37)     // Catch:{ all -> 0x0713 }
            r24 = r0
            goto L_0x0746
        L_0x0713:
            r0 = move-exception
            r10 = r0
            defpackage.z68.o(r4, r5, r10)     // Catch:{ all -> 0x046f }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x046f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x046f }
        L_0x071e:
            boolean r15 = r0.hasNext()     // Catch:{ all -> 0x046f }
            if (r15 == 0) goto L_0x072e
            java.lang.Object r15 = r0.next()     // Catch:{ all -> 0x046f }
            xm r15 = (defpackage.xm) r15     // Catch:{ all -> 0x046f }
            r15.a(r10)     // Catch:{ all -> 0x046f }
            goto L_0x071e
        L_0x072e:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x046f }
            r0.getClass()     // Catch:{ all -> 0x046f }
            xtd r0 = defpackage.xtd.b     // Catch:{ all -> 0x046f }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x046f }
            if (r0 == 0) goto L_0x0744
            if (r0 == r11) goto L_0x0743
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x046f }
            r0.<init>()     // Catch:{ all -> 0x046f }
            throw r0     // Catch:{ all -> 0x046f }
        L_0x0743:
            throw r10     // Catch:{ all -> 0x046f }
        L_0x0744:
            r24 = 0
        L_0x0746:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x046f }
            goto L_0x0778
        L_0x0749:
            defpackage.z68.o(r4, r5, r0)     // Catch:{ all -> 0x041c }
            java.util.concurrent.CopyOnWriteArraySet r10 = defpackage.ytd.a     // Catch:{ all -> 0x041c }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x041c }
        L_0x0752:
            boolean r15 = r10.hasNext()     // Catch:{ all -> 0x041c }
            if (r15 == 0) goto L_0x0762
            java.lang.Object r15 = r10.next()     // Catch:{ all -> 0x041c }
            xm r15 = (defpackage.xm) r15     // Catch:{ all -> 0x041c }
            r15.a(r0)     // Catch:{ all -> 0x041c }
            goto L_0x0752
        L_0x0762:
            gga r10 = defpackage.xtd.a     // Catch:{ all -> 0x041c }
            r10.getClass()     // Catch:{ all -> 0x041c }
            xtd r10 = defpackage.xtd.b     // Catch:{ all -> 0x041c }
            int r10 = r10.ordinal()     // Catch:{ all -> 0x041c }
            if (r10 == 0) goto L_0x0778
            if (r10 == r11) goto L_0x0777
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x041c }
            r0.<init>()     // Catch:{ all -> 0x041c }
            throw r0     // Catch:{ all -> 0x041c }
        L_0x0777:
            throw r0     // Catch:{ all -> 0x041c }
        L_0x0778:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x041c }
        L_0x077a:
            int r8 = r8 + r11
            goto L_0x03f8
        L_0x077d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x041c }
        L_0x077f:
            r27 = r9
            r28 = r17
            r29 = r18
            r30 = r19
            r31 = r20
            r32 = r21
            r33 = r22
            r34 = r23
            r35 = r24
            r36 = r25
            goto L_0x07c3
        L_0x0794:
            defpackage.z68.o(r4, r5, r0)
            java.util.concurrent.CopyOnWriteArraySet r4 = defpackage.ytd.a
            java.util.Iterator r4 = r4.iterator()
        L_0x079d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x07ad
            java.lang.Object r5 = r4.next()
            xm r5 = (defpackage.xm) r5
            r5.a(r0)
            goto L_0x079d
        L_0x07ad:
            gga r4 = defpackage.xtd.a
            r4.getClass()
            xtd r4 = defpackage.xtd.b
            int r4 = r4.ordinal()
            if (r4 == 0) goto L_0x077f
            if (r4 == r11) goto L_0x07c2
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x07c2:
            throw r0
        L_0x07c3:
            ll2 r0 = new ll2
            r26 = r0
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r12.v = r0
            goto L_0x0a23
        L_0x07ce:
            long r4 = defpackage.ryg.d0(r1, r7)
            r12.A = r4
            goto L_0x0a23
        L_0x07d6:
            a00 r0 = defpackage.a00.f(r37)
            r12.t = r0
            goto L_0x0a23
        L_0x07de:
            java.lang.String r0 = r37.A0()
            r0.getClass()
            java.lang.String r4 = "PUBLIC"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x07f9
            java.lang.String r4 = "PRIVATE"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x07f7
            r0 = r11
            goto L_0x07fa
        L_0x07f7:
            r0 = 3
            goto L_0x07fa
        L_0x07f9:
            r0 = 2
        L_0x07fa:
            r12.O = r0
            goto L_0x0a23
        L_0x07fe:
            b89 r0 = defpackage.z79.a(r37)
            r12.i = r0
            goto L_0x0a23
        L_0x0806:
            boolean r0 = defpackage.ryg.Y(r37)
            r12.z = r0
            goto L_0x0a23
        L_0x080e:
            fm0 r0 = new fm0
            r0.<init>(r2)
            hb9 r4 = r37.n()
            int r4 = r4.a()
            if (r4 != r6) goto L_0x083a
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r15.<init>()
            int r4 = r37.y0()
            r5 = 0
        L_0x0827:
            if (r5 >= r4) goto L_0x083e
            long r9 = defpackage.ryg.d0(r1, r7)
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.lang.Object r10 = r0.m(r1)
            r15.put(r9, r10)
            int r5 = r5 + r11
            goto L_0x0827
        L_0x083a:
            r37.A()
            r15 = 0
        L_0x083e:
            r12.B = r15
            goto L_0x0a23
        L_0x0842:
            java.lang.String r0 = defpackage.ryg.g0(r37)
            r12.s = r0
            goto L_0x0a23
        L_0x084a:
            long r4 = r37.x0()
            r12.k = r4
            goto L_0x0a23
        L_0x0852:
            int r0 = defpackage.ryg.e0(r37)     // Catch:{ all -> 0x0858 }
            r7 = r0
            goto L_0x088a
        L_0x0858:
            r0 = move-exception
            r7 = r0
            defpackage.z68.o(r4, r5, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0863:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0873
            java.lang.Object r8 = r0.next()
            xm r8 = (defpackage.xm) r8
            r8.a(r7)
            goto L_0x0863
        L_0x0873:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0889
            if (r0 == r11) goto L_0x0888
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0888:
            throw r7
        L_0x0889:
            r7 = 0
        L_0x088a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r8 = 0
            r9 = 0
        L_0x088e:
            if (r8 >= r7) goto L_0x0947
            java.lang.String r0 = defpackage.ryg.g0(r37)     // Catch:{ all -> 0x0895 }
            goto L_0x08ca
        L_0x0895:
            r0 = move-exception
            r10 = r0
            defpackage.z68.o(r4, r5, r10)     // Catch:{ all -> 0x08b0 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x08b0 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x08b0 }
        L_0x08a0:
            boolean r15 = r0.hasNext()     // Catch:{ all -> 0x08b0 }
            if (r15 == 0) goto L_0x08b3
            java.lang.Object r15 = r0.next()     // Catch:{ all -> 0x08b0 }
            xm r15 = (defpackage.xm) r15     // Catch:{ all -> 0x08b0 }
            r15.a(r10)     // Catch:{ all -> 0x08b0 }
            goto L_0x08a0
        L_0x08b0:
            r0 = move-exception
            goto L_0x094a
        L_0x08b3:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x08b0 }
            r0.getClass()     // Catch:{ all -> 0x08b0 }
            xtd r0 = defpackage.xtd.b     // Catch:{ all -> 0x08b0 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x08b0 }
            if (r0 == 0) goto L_0x08c9
            if (r0 == r11) goto L_0x08c8
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x08b0 }
            r0.<init>()     // Catch:{ all -> 0x08b0 }
            throw r0     // Catch:{ all -> 0x08b0 }
        L_0x08c8:
            throw r10     // Catch:{ all -> 0x08b0 }
        L_0x08c9:
            r0 = 0
        L_0x08ca:
            if (r0 == 0) goto L_0x0944
            kotlin.Unit r10 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x08b0 }
            java.lang.String r10 = "organizationIds"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r10)     // Catch:{ all -> 0x08db }
            if (r0 == 0) goto L_0x08dd
            long[] r9 = defpackage.ytd.b(r37)     // Catch:{ all -> 0x08db }
            goto L_0x0912
        L_0x08db:
            r0 = move-exception
            goto L_0x0915
        L_0x08dd:
            r37.A()     // Catch:{ all -> 0x08e1 }
            goto L_0x0912
        L_0x08e1:
            r0 = move-exception
            r10 = r0
            defpackage.z68.o(r4, r5, r10)     // Catch:{ all -> 0x08db }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a     // Catch:{ all -> 0x08db }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x08db }
        L_0x08ec:
            boolean r15 = r0.hasNext()     // Catch:{ all -> 0x08db }
            if (r15 == 0) goto L_0x08fc
            java.lang.Object r15 = r0.next()     // Catch:{ all -> 0x08db }
            xm r15 = (defpackage.xm) r15     // Catch:{ all -> 0x08db }
            r15.a(r10)     // Catch:{ all -> 0x08db }
            goto L_0x08ec
        L_0x08fc:
            gga r0 = defpackage.xtd.a     // Catch:{ all -> 0x08db }
            r0.getClass()     // Catch:{ all -> 0x08db }
            xtd r0 = defpackage.xtd.b     // Catch:{ all -> 0x08db }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x08db }
            if (r0 == 0) goto L_0x0912
            if (r0 == r11) goto L_0x0911
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x08db }
            r0.<init>()     // Catch:{ all -> 0x08db }
            throw r0     // Catch:{ all -> 0x08db }
        L_0x0911:
            throw r10     // Catch:{ all -> 0x08db }
        L_0x0912:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x08db }
            goto L_0x0944
        L_0x0915:
            defpackage.z68.o(r4, r5, r0)     // Catch:{ all -> 0x08b0 }
            java.util.concurrent.CopyOnWriteArraySet r10 = defpackage.ytd.a     // Catch:{ all -> 0x08b0 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x08b0 }
        L_0x091e:
            boolean r15 = r10.hasNext()     // Catch:{ all -> 0x08b0 }
            if (r15 == 0) goto L_0x092e
            java.lang.Object r15 = r10.next()     // Catch:{ all -> 0x08b0 }
            xm r15 = (defpackage.xm) r15     // Catch:{ all -> 0x08b0 }
            r15.a(r0)     // Catch:{ all -> 0x08b0 }
            goto L_0x091e
        L_0x092e:
            gga r10 = defpackage.xtd.a     // Catch:{ all -> 0x08b0 }
            r10.getClass()     // Catch:{ all -> 0x08b0 }
            xtd r10 = defpackage.xtd.b     // Catch:{ all -> 0x08b0 }
            int r10 = r10.ordinal()     // Catch:{ all -> 0x08b0 }
            if (r10 == 0) goto L_0x0944
            if (r10 == r11) goto L_0x0943
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x08b0 }
            r0.<init>()     // Catch:{ all -> 0x08b0 }
            throw r0     // Catch:{ all -> 0x08b0 }
        L_0x0943:
            throw r0     // Catch:{ all -> 0x08b0 }
        L_0x0944:
            int r8 = r8 + r11
            goto L_0x088e
        L_0x0947:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x08b0 }
            goto L_0x0979
        L_0x094a:
            defpackage.z68.o(r4, r5, r0)
            java.util.concurrent.CopyOnWriteArraySet r4 = defpackage.ytd.a
            java.util.Iterator r4 = r4.iterator()
        L_0x0953:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0963
            java.lang.Object r5 = r4.next()
            xm r5 = (defpackage.xm) r5
            r5.a(r0)
            goto L_0x0953
        L_0x0963:
            gga r4 = defpackage.xtd.a
            r4.getClass()
            xtd r4 = defpackage.xtd.b
            int r4 = r4.ordinal()
            if (r4 == 0) goto L_0x0979
            if (r4 == r11) goto L_0x0978
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0978:
            throw r0
        L_0x0979:
            if (r9 == 0) goto L_0x0981
            syc r15 = new syc
            r15.<init>(r3, r9)
            goto L_0x0982
        L_0x0981:
            r15 = 0
        L_0x0982:
            r12.o = r15
            goto L_0x0a23
        L_0x0986:
            int r0 = defpackage.ryg.e0(r37)
            java.lang.String r4 = ""
            r9 = r7
            r5 = 0
            r15 = 0
        L_0x098f:
            if (r5 >= r0) goto L_0x09dd
            java.lang.String r2 = defpackage.ryg.g0(r37)
            r2.getClass()
            int r18 = r2.hashCode()
            switch(r18) {
                case -2128794476: goto L_0x09b7;
                case -1676095234: goto L_0x09ac;
                case -1401988028: goto L_0x09a1;
                default: goto L_0x099f;
            }
        L_0x099f:
            r2 = -1
            goto L_0x09c1
        L_0x09a1:
            java.lang.String r3 = "joinLink"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x09aa
            goto L_0x099f
        L_0x09aa:
            r2 = 2
            goto L_0x09c1
        L_0x09ac:
            java.lang.String r3 = "conversationId"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x09b5
            goto L_0x099f
        L_0x09b5:
            r2 = r11
            goto L_0x09c1
        L_0x09b7:
            java.lang.String r3 = "startedAt"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x09c0
            goto L_0x099f
        L_0x09c0:
            r2 = 0
        L_0x09c1:
            switch(r2) {
                case 0: goto L_0x09d4;
                case 1: goto L_0x09ce;
                case 2: goto L_0x09c8;
                default: goto L_0x09c4;
            }
        L_0x09c4:
            r37.A()
            goto L_0x09d8
        L_0x09c8:
            java.lang.String r2 = defpackage.ryg.g0(r37)
            r4 = r2
            goto L_0x09d8
        L_0x09ce:
            java.lang.String r2 = defpackage.ryg.g0(r37)
            r15 = r2
            goto L_0x09d8
        L_0x09d4:
            long r9 = defpackage.ryg.d0(r1, r7)
        L_0x09d8:
            int r5 = r5 + r11
            r2 = 19
            r3 = 6
            goto L_0x098f
        L_0x09dd:
            af0 r0 = new af0
            r0.<init>()
            r0.b = r15
            r0.c = r9
            r0.o = r4
            r12.C = r0
            goto L_0x0a23
        L_0x09eb:
            hb9 r0 = r37.n()
            int r0 = r0.a()
            if (r0 != r6) goto L_0x0a16
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r15.<init>()
            int r0 = r37.y0()
            r2 = 0
        L_0x09ff:
            if (r2 >= r0) goto L_0x0a1a
            long r3 = defpackage.ryg.d0(r1, r7)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            long r4 = defpackage.ryg.d0(r1, r7)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r15.put(r3, r4)
            int r2 = r2 + r11
            goto L_0x09ff
        L_0x0a16:
            r37.A()
            r15 = 0
        L_0x0a1a:
            r12.d = r15
            goto L_0x0a23
        L_0x0a1d:
            java.lang.String r0 = defpackage.ryg.g0(r37)
            r12.h = r0
        L_0x0a23:
            int r14 = r14 + r11
            r2 = 19
            r3 = 6
            goto L_0x0012
        L_0x0a29:
            b32 r0 = new b32
            r0.<init>(r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b32.a(pf9):b32");
    }

    public final String toString() {
        int Q = kv0.Q(this.o);
        int o2 = kv0.o(this.y0);
        StringBuilder sb = new StringBuilder("{id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(a81.B(this.V0));
        sb.append(", status='");
        sb.append(this.b);
        sb.append("', owner=");
        sb.append(this.c);
        sb.append(", participants=");
        sb.append(Q);
        sb.append(", created=");
        sb.append(this.v);
        sb.append(", lastMessage=");
        sb.append(this.z);
        sb.append(", cid=");
        sb.append(this.X);
        sb.append(", lastEventTime=");
        sb.append(this.Y);
        sb.append(", newMessages=");
        sb.append(this.Z);
        sb.append(", participantsCount=");
        g63.o(sb, this.w0, ", admins=", o2, ", chatOptions=");
        sb.append(this.A0);
        sb.append(", botsInfo=");
        sb.append(this.M0);
        sb.append(", getLastMentionMessageId=");
        sb.append(this.P0);
        sb.append(", lastReactedMessageId=");
        sb.append(this.R0);
        sb.append(", lastReaction=");
        sb.append(this.S0);
        sb.append(", markedAsUnread=");
        sb.append(this.Q0);
        sb.append(", lastFireDelayedErrorTime=");
        sb.append(this.U0);
        sb.append(", lastDelayedUpdateTime=");
        return wj6.m(sb, this.T0, "}");
    }
}
