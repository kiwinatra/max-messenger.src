package defpackage;

/* renamed from: mw7  reason: default package */
public final class mw7 extends ibf {
    public b32 c;
    public cs3 o;
    public b89 v;
    public String w;
    public gv6 x;
    public d4g y;
    public cqe z;

    public mw7(pf9 pf9) {
        super(pf9);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(defpackage.pf9 r13, java.lang.String r14) {
        /*
            r12 = this;
            r0 = 6
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            r14.getClass()
            r7 = -1
            int r8 = r14.hashCode()
            switch(r8) {
                case -1195420187: goto L_0x0056;
                case -921148724: goto L_0x004b;
                case 3052376: goto L_0x0040;
                case 3599307: goto L_0x0035;
                case 98629247: goto L_0x002a;
                case 954925063: goto L_0x001f;
                case 1958352887: goto L_0x0014;
                default: goto L_0x0012;
            }
        L_0x0012:
            r14 = r7
            goto L_0x0060
        L_0x0014:
            java.lang.String r8 = "videoConference"
            boolean r14 = r14.equals(r8)
            if (r14 != 0) goto L_0x001d
            goto L_0x0012
        L_0x001d:
            r14 = r0
            goto L_0x0060
        L_0x001f:
            java.lang.String r8 = "message"
            boolean r14 = r14.equals(r8)
            if (r14 != 0) goto L_0x0028
            goto L_0x0012
        L_0x0028:
            r14 = r1
            goto L_0x0060
        L_0x002a:
            java.lang.String r8 = "group"
            boolean r14 = r14.equals(r8)
            if (r14 != 0) goto L_0x0033
            goto L_0x0012
        L_0x0033:
            r14 = r2
            goto L_0x0060
        L_0x0035:
            java.lang.String r8 = "user"
            boolean r14 = r14.equals(r8)
            if (r14 != 0) goto L_0x003e
            goto L_0x0012
        L_0x003e:
            r14 = r3
            goto L_0x0060
        L_0x0040:
            java.lang.String r8 = "chat"
            boolean r14 = r14.equals(r8)
            if (r14 != 0) goto L_0x0049
            goto L_0x0012
        L_0x0049:
            r14 = r4
            goto L_0x0060
        L_0x004b:
            java.lang.String r8 = "startPayload"
            boolean r14 = r14.equals(r8)
            if (r14 != 0) goto L_0x0054
            goto L_0x0012
        L_0x0054:
            r14 = r5
            goto L_0x0060
        L_0x0056:
            java.lang.String r8 = "stickerSet"
            boolean r14 = r14.equals(r8)
            if (r14 != 0) goto L_0x005f
            goto L_0x0012
        L_0x005f:
            r14 = r6
        L_0x0060:
            switch(r14) {
                case 0: goto L_0x0148;
                case 1: goto L_0x0141;
                case 2: goto L_0x013a;
                case 3: goto L_0x0133;
                case 4: goto L_0x012c;
                case 5: goto L_0x0125;
                case 6: goto L_0x0068;
                default: goto L_0x0063;
            }
        L_0x0063:
            r13.A()
            goto L_0x014e
        L_0x0068:
            int r14 = defpackage.ryg.e0(r13)
            if (r14 != 0) goto L_0x0071
            r13 = 0
            goto L_0x0122
        L_0x0071:
            ccd r8 = new ccd
            r8.<init>()
            r9 = r6
        L_0x0077:
            if (r9 >= r14) goto L_0x0111
            java.lang.String r10 = r13.A0()
            r10.getClass()
            int r11 = r10.hashCode()
            switch(r11) {
                case -1897186251: goto L_0x00cb;
                case -1401988028: goto L_0x00c0;
                case -794658985: goto L_0x00b5;
                case -172815863: goto L_0x00aa;
                case 106164915: goto L_0x009f;
                case 265384045: goto L_0x0094;
                case 1867394383: goto L_0x0089;
                default: goto L_0x0087;
            }
        L_0x0087:
            r10 = r7
            goto L_0x00d5
        L_0x0089:
            java.lang.String r11 = "participantsCount"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0092
            goto L_0x0087
        L_0x0092:
            r10 = r0
            goto L_0x00d5
        L_0x0094:
            java.lang.String r11 = "previewParticipantIds"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x009d
            goto L_0x0087
        L_0x009d:
            r10 = r1
            goto L_0x00d5
        L_0x009f:
            java.lang.String r11 = "owner"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x00a8
            goto L_0x0087
        L_0x00a8:
            r10 = r2
            goto L_0x00d5
        L_0x00aa:
            java.lang.String r11 = "callName"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x00b3
            goto L_0x0087
        L_0x00b3:
            r10 = r3
            goto L_0x00d5
        L_0x00b5:
            java.lang.String r11 = "conferenceId"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x00be
            goto L_0x0087
        L_0x00be:
            r10 = r4
            goto L_0x00d5
        L_0x00c0:
            java.lang.String r11 = "joinLink"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x00c9
            goto L_0x0087
        L_0x00c9:
            r10 = r5
            goto L_0x00d5
        L_0x00cb:
            java.lang.String r11 = "startAt"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x00d4
            goto L_0x0087
        L_0x00d4:
            r10 = r6
        L_0x00d5:
            switch(r10) {
                case 0: goto L_0x0106;
                case 1: goto L_0x00ff;
                case 2: goto L_0x00f8;
                case 3: goto L_0x00f1;
                case 4: goto L_0x00ea;
                case 5: goto L_0x00e3;
                case 6: goto L_0x00dc;
                default: goto L_0x00d8;
            }
        L_0x00d8:
            r13.A()
            goto L_0x010e
        L_0x00dc:
            int r10 = defpackage.ryg.c0(r13)
            r8.b = r10
            goto L_0x010e
        L_0x00e3:
            a00 r10 = defpackage.a00.f(r13)
            r8.h = r10
            goto L_0x010e
        L_0x00ea:
            fo3 r10 = defpackage.fo3.e(r13)
            r8.d = r10
            goto L_0x010e
        L_0x00f1:
            java.lang.String r10 = defpackage.ryg.g0(r13)
            r8.f = r10
            goto L_0x010e
        L_0x00f8:
            java.lang.String r10 = defpackage.ryg.g0(r13)
            r8.g = r10
            goto L_0x010e
        L_0x00ff:
            java.lang.String r10 = defpackage.ryg.g0(r13)
            r8.e = r10
            goto L_0x010e
        L_0x0106:
            r10 = 0
            long r10 = defpackage.ryg.d0(r13, r10)
            r8.c = r10
        L_0x010e:
            int r9 = r9 + r5
            goto L_0x0077
        L_0x0111:
            java.lang.Object r13 = r8.h
            java.util.List r13 = (java.util.List) r13
            if (r13 != 0) goto L_0x011d
            java.util.List r13 = java.util.Collections.emptyList()
            r8.h = r13
        L_0x011d:
            d4g r13 = new d4g
            r13.<init>(r8)
        L_0x0122:
            r12.y = r13
            goto L_0x014e
        L_0x0125:
            b89 r13 = defpackage.z79.a(r13)
            r12.v = r13
            goto L_0x014e
        L_0x012c:
            gv6 r13 = defpackage.gv6.a(r13)
            r12.x = r13
            goto L_0x014e
        L_0x0133:
            cs3 r13 = defpackage.cs3.a(r13)
            r12.o = r13
            goto L_0x014e
        L_0x013a:
            b32 r13 = defpackage.b32.a(r13)
            r12.c = r13
            goto L_0x014e
        L_0x0141:
            java.lang.String r13 = defpackage.ryg.g0(r13)
            r12.w = r13
            goto L_0x014e
        L_0x0148:
            cqe r13 = defpackage.cqe.a(r13)
            r12.z = r13
        L_0x014e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw7.c(pf9, java.lang.String):void");
    }

    public final String toString() {
        b32 b32 = this.c;
        cs3 cs3 = this.o;
        b89 b89 = this.v;
        String str = this.w;
        gv6 gv6 = this.x;
        d4g d4g = this.y;
        cqe cqe = this.z;
        return "Response{chat=" + b32 + ", contactSearchResult=" + cs3 + ", message=" + b89 + ", startPayload='" + str + "', groupChatInfo=" + gv6 + ", videoConference=" + d4g + ", stickerSet=" + cqe + "}";
    }
}
