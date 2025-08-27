package defpackage;

import java.util.Map;
import kotlin.collections.MapsKt;

/* renamed from: af3  reason: default package */
public abstract class af3 {
    /* JADX WARNING: type inference failed for: r4v0, types: [l0g, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03f8, code lost:
        defpackage.z68.c("ConfigurationUserSettingsParsing", r7, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e8, code lost:
        r7 = r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.n0g a(defpackage.pf9 r12) {
        /*
            r0 = 0
            r1 = 1
            java.lang.String r2 = "payloadCatching catch error"
            java.lang.String r3 = "ServerPayload/PayloadCatching"
            l0g r4 = new l0g
            r4.<init>()
            int r5 = defpackage.ryg.e0(r12)     // Catch:{ all -> 0x0010 }
            goto L_0x0041
        L_0x0010:
            r5 = move-exception
            defpackage.z68.o(r3, r2, r5)
            java.util.concurrent.CopyOnWriteArraySet r6 = defpackage.ytd.a
            java.util.Iterator r6 = r6.iterator()
        L_0x001a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x002a
            java.lang.Object r7 = r6.next()
            xm r7 = (defpackage.xm) r7
            r7.a(r5)
            goto L_0x001a
        L_0x002a:
            gga r6 = defpackage.xtd.a
            r6.getClass()
            xtd r6 = defpackage.xtd.b
            int r6 = r6.ordinal()
            if (r6 == 0) goto L_0x0040
            if (r6 == r1) goto L_0x003f
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        L_0x003f:
            throw r5
        L_0x0040:
            r5 = r0
        L_0x0041:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            r6 = r0
        L_0x0044:
            if (r6 >= r5) goto L_0x0430
            java.lang.String r7 = defpackage.ryg.g0(r12)     // Catch:{ all -> 0x004b }
            goto L_0x007f
        L_0x004b:
            r7 = move-exception
            defpackage.z68.o(r3, r2, r7)     // Catch:{ all -> 0x0065 }
            java.util.concurrent.CopyOnWriteArraySet r8 = defpackage.ytd.a     // Catch:{ all -> 0x0065 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0065 }
        L_0x0055:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0065 }
            if (r9 == 0) goto L_0x0068
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0065 }
            xm r9 = (defpackage.xm) r9     // Catch:{ all -> 0x0065 }
            r9.a(r7)     // Catch:{ all -> 0x0065 }
            goto L_0x0055
        L_0x0065:
            r12 = move-exception
            goto L_0x0433
        L_0x0068:
            gga r8 = defpackage.xtd.a     // Catch:{ all -> 0x0065 }
            r8.getClass()     // Catch:{ all -> 0x0065 }
            xtd r8 = defpackage.xtd.b     // Catch:{ all -> 0x0065 }
            int r8 = r8.ordinal()     // Catch:{ all -> 0x0065 }
            if (r8 == 0) goto L_0x007e
            if (r8 == r1) goto L_0x007d
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0065 }
            r12.<init>()     // Catch:{ all -> 0x0065 }
            throw r12     // Catch:{ all -> 0x0065 }
        L_0x007d:
            throw r7     // Catch:{ all -> 0x0065 }
        L_0x007e:
            r7 = 0
        L_0x007f:
            if (r7 == 0) goto L_0x042d
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0065 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r8.<init>()     // Catch:{ all -> 0x00c2 }
            r8.append(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.String r9 = "="
            r8.append(r9)     // Catch:{ all -> 0x00c2 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00c2 }
            int r9 = r7.hashCode()     // Catch:{ all -> 0x00c2 }
            switch(r9) {
                case -2099474505: goto L_0x03c2;
                case -1972016425: goto L_0x039e;
                case -1965172674: goto L_0x037e;
                case -1917056995: goto L_0x035a;
                case -952000630: goto L_0x0339;
                case -747186863: goto L_0x0314;
                case -694542025: goto L_0x02ef;
                case -658898441: goto L_0x02ca;
                case -389923664: goto L_0x02a5;
                case -248197113: goto L_0x0280;
                case 75243: goto L_0x025b;
                case 2634307: goto L_0x0236;
                case 130531239: goto L_0x0211;
                case 136965804: goto L_0x01f0;
                case 640193528: goto L_0x0199;
                case 836229259: goto L_0x0174;
                case 1633771469: goto L_0x014f;
                case 1684923157: goto L_0x012b;
                case 1911151182: goto L_0x010b;
                case 1950966460: goto L_0x00eb;
                case 1958389377: goto L_0x00c5;
                case 2130809258: goto L_0x009d;
                default: goto L_0x009b;
            }     // Catch:{ all -> 0x00c2 }
        L_0x009b:
            goto L_0x03ca
        L_0x009d:
            java.lang.String r9 = "HIDDEN"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00c2 }
            if (r7 != 0) goto L_0x00a7
            goto L_0x03ca
        L_0x00a7:
            boolean r7 = r12.v0()     // Catch:{ all -> 0x00c2 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r10.<init>()     // Catch:{ all -> 0x00c2 }
            r10.append(r8)     // Catch:{ all -> 0x00c2 }
            r10.append(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x00c2 }
            r4.h = r9     // Catch:{ all -> 0x00c2 }
            goto L_0x03f8
        L_0x00c2:
            r7 = move-exception
            goto L_0x03fe
        L_0x00c5:
            java.lang.String r9 = "M_CALL_PUSH_NOTIFICATION"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00c2 }
            if (r7 != 0) goto L_0x00cf
            goto L_0x03ca
        L_0x00cf:
            java.lang.String r7 = defpackage.ryg.g0(r12)     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r9.<init>()     // Catch:{ all -> 0x00c2 }
            r9.append(r8)     // Catch:{ all -> 0x00c2 }
            r9.append(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00c2 }
            int r7 = defpackage.wzf.a(r7)     // Catch:{ all -> 0x00c2 }
            r4.r = r7     // Catch:{ all -> 0x00c2 }
        L_0x00e8:
            r7 = r8
            goto L_0x03f8
        L_0x00eb:
            java.lang.String r9 = "DIALOGS_PUSH_NOTIFICATION"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00c2 }
            if (r7 != 0) goto L_0x00f5
            goto L_0x03ca
        L_0x00f5:
            java.lang.String r7 = r12.A0()     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r9.<init>()     // Catch:{ all -> 0x00c2 }
            r9.append(r8)     // Catch:{ all -> 0x00c2 }
            r9.append(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00c2 }
            r4.c = r7     // Catch:{ all -> 0x00c2 }
            goto L_0x00e8
        L_0x010b:
            java.lang.String r9 = "CHATS_PUSH_SOUND"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00c2 }
            if (r7 != 0) goto L_0x0115
            goto L_0x03ca
        L_0x0115:
            java.lang.String r7 = r12.A0()     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r9.<init>()     // Catch:{ all -> 0x00c2 }
            r9.append(r8)     // Catch:{ all -> 0x00c2 }
            r9.append(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00c2 }
            r4.g = r7     // Catch:{ all -> 0x00c2 }
            goto L_0x00e8
        L_0x012b:
            java.lang.String r9 = "SAFE_MODE"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00c2 }
            if (r7 != 0) goto L_0x0135
            goto L_0x03ca
        L_0x0135:
            boolean r7 = defpackage.ryg.Y(r12)     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r9.<init>()     // Catch:{ all -> 0x00c2 }
            r9.append(r8)     // Catch:{ all -> 0x00c2 }
            r9.append(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00c2 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x00c2 }
            r4.u = r7     // Catch:{ all -> 0x00c2 }
            goto L_0x00e8
        L_0x014f:
            java.lang.String r9 = "CHATS_INVITE"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00c2 }
            if (r7 != 0) goto L_0x0159
            goto L_0x03ca
        L_0x0159:
            java.lang.String r7 = r12.A0()     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r9.<init>()     // Catch:{ all -> 0x00c2 }
            r9.append(r8)     // Catch:{ all -> 0x00c2 }
            r9.append(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00c2 }
            int r7 = defpackage.wzf.b(r7)     // Catch:{ all -> 0x00c2 }
            r4.o = r7     // Catch:{ all -> 0x00c2 }
            goto L_0x00e8
        L_0x0174:
            java.lang.String r9 = "AUDIO_TRANSCRIPTION_ENABLED"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00c2 }
            if (r7 != 0) goto L_0x017e
            goto L_0x03ca
        L_0x017e:
            boolean r7 = defpackage.ryg.Y(r12)     // Catch:{ all -> 0x00c2 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r10.<init>()     // Catch:{ all -> 0x00c2 }
            r10.append(r8)     // Catch:{ all -> 0x00c2 }
            r10.append(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x00c2 }
            r4.t = r9     // Catch:{ all -> 0x00c2 }
            goto L_0x03f8
        L_0x0199:
            java.lang.String r9 = "INACTIVE_TTL"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00c2 }
            if (r7 != 0) goto L_0x01a3
            goto L_0x03ca
        L_0x01a3:
            java.lang.String r7 = defpackage.ryg.g0(r12)     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r9.<init>()     // Catch:{ all -> 0x00c2 }
            r9.append(r8)     // Catch:{ all -> 0x00c2 }
            r9.append(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00c2 }
            m0g r9 = defpackage.m0g.TTL_6M     // Catch:{ all -> 0x00c2 }
            if (r7 == 0) goto L_0x01ec
            r10 = -1
            int r11 = r7.hashCode()
            switch(r11) {
                case 1596: goto L_0x01d9;
                case 1658: goto L_0x01ce;
                case 1751: goto L_0x01c3;
                default: goto L_0x01c2;
            }
        L_0x01c2:
            goto L_0x01e3
        L_0x01c3:
            java.lang.String r11 = "6M"
            boolean r7 = r7.equals(r11)
            if (r7 != 0) goto L_0x01cc
            goto L_0x01e3
        L_0x01cc:
            r10 = 2
            goto L_0x01e3
        L_0x01ce:
            java.lang.String r11 = "3M"
            boolean r7 = r7.equals(r11)
            if (r7 != 0) goto L_0x01d7
            goto L_0x01e3
        L_0x01d7:
            r10 = r1
            goto L_0x01e3
        L_0x01d9:
            java.lang.String r11 = "1M"
            boolean r7 = r7.equals(r11)
            if (r7 != 0) goto L_0x01e2
            goto L_0x01e3
        L_0x01e2:
            r10 = r0
        L_0x01e3:
            switch(r10) {
                case 0: goto L_0x01ea;
                case 1: goto L_0x01e7;
                case 2: goto L_0x01ec;
                default: goto L_0x01e6;
            }
        L_0x01e6:
            goto L_0x01ec
        L_0x01e7:
            m0g r9 = defpackage.m0g.TTL_3M     // Catch:{ all -> 0x00c2 }
            goto L_0x01ec
        L_0x01ea:
            m0g r9 = defpackage.m0g.TTL_1M     // Catch:{ all -> 0x00c2 }
        L_0x01ec:
            r4.q = r9     // Catch:{ all -> 0x00c2 }
            goto L_0x00e8
        L_0x01f0:
            java.lang.String r9 = "CHATS_PUSH_NOTIFICATION"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00c2 }
            if (r7 != 0) goto L_0x01fa
            goto L_0x03ca
        L_0x01fa:
            java.lang.String r7 = r12.A0()     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r9.<init>()     // Catch:{ all -> 0x00c2 }
            r9.append(r8)     // Catch:{ all -> 0x00c2 }
            r9.append(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00c2 }
            r4.d = r7     // Catch:{ all -> 0x00c2 }
            goto L_0x00e8
        L_0x0211:
            java.lang.String r9 = "CHATS_LED"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00c2 }
            if (r7 != 0) goto L_0x021b
            goto L_0x03ca
        L_0x021b:
            int r7 = r12.w0()     // Catch:{ all -> 0x00c2 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r10.<init>()     // Catch:{ all -> 0x00c2 }
            r10.append(r8)     // Catch:{ all -> 0x00c2 }
            r10.append(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x00c2 }
            r4.k = r9     // Catch:{ all -> 0x00c2 }
            goto L_0x03f8
        L_0x0236:
            java.lang.String r9 = "VIBR"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00c2 }
            if (r7 != 0) goto L_0x0240
            goto L_0x03ca
        L_0x0240:
            boolean r7 = r12.v0()     // Catch:{ all -> 0x00c2 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r10.<init>()     // Catch:{ all -> 0x00c2 }
            r10.append(r8)     // Catch:{ all -> 0x00c2 }
            r10.append(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x00c2 }
            r4.l = r9     // Catch:{ all -> 0x00c2 }
            goto L_0x03f8
        L_0x025b:
            java.lang.String r9 = "LED"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00c2 }
            if (r7 != 0) goto L_0x0265
            goto L_0x03ca
        L_0x0265:
            int r7 = r12.w0()     // Catch:{ all -> 0x00c2 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r10.<init>()     // Catch:{ all -> 0x00c2 }
            r10.append(r8)     // Catch:{ all -> 0x00c2 }
            r10.append(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x00c2 }
            r4.i = r9     // Catch:{ all -> 0x00c2 }
            goto L_0x03f8
        L_0x0280:
            java.lang.String r9 = "CHATS_VIBR"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00c2 }
            if (r7 != 0) goto L_0x028a
            goto L_0x03ca
        L_0x028a:
            boolean r7 = r12.v0()     // Catch:{ all -> 0x00c2 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r10.<init>()     // Catch:{ all -> 0x00c2 }
            r10.append(r8)     // Catch:{ all -> 0x00c2 }
            r10.append(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x00c2 }
            r4.n = r9     // Catch:{ all -> 0x00c2 }
            goto L_0x03f8
        L_0x02a5:
            java.lang.String r9 = "DONT_DISTURB_UNTIL"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00c2 }
            if (r7 != 0) goto L_0x02af
            goto L_0x03ca
        L_0x02af:
            long r9 = r12.x0()     // Catch:{ all -> 0x00c2 }
            java.lang.Long r7 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r11.<init>()     // Catch:{ all -> 0x00c2 }
            r11.append(r8)     // Catch:{ all -> 0x00c2 }
            r11.append(r9)     // Catch:{ all -> 0x00c2 }
            java.lang.String r8 = r11.toString()     // Catch:{ all -> 0x00c2 }
            r4.b = r7     // Catch:{ all -> 0x00c2 }
            goto L_0x00e8
        L_0x02ca:
            java.lang.String r9 = "DIALOGS_VIBR"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00c2 }
            if (r7 != 0) goto L_0x02d4
            goto L_0x03ca
        L_0x02d4:
            boolean r7 = r12.v0()     // Catch:{ all -> 0x00c2 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r10.<init>()     // Catch:{ all -> 0x00c2 }
            r10.append(r8)     // Catch:{ all -> 0x00c2 }
            r10.append(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x00c2 }
            r4.m = r9     // Catch:{ all -> 0x00c2 }
            goto L_0x03f8
        L_0x02ef:
            java.lang.String r9 = "PUSH_NEW_CONTACTS"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00c2 }
            if (r7 != 0) goto L_0x02f9
            goto L_0x03ca
        L_0x02f9:
            boolean r7 = r12.v0()     // Catch:{ all -> 0x00c2 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r10.<init>()     // Catch:{ all -> 0x00c2 }
            r10.append(r8)     // Catch:{ all -> 0x00c2 }
            r10.append(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x00c2 }
            r4.a = r9     // Catch:{ all -> 0x00c2 }
            goto L_0x03f8
        L_0x0314:
            java.lang.String r9 = "SUGGEST_STICKERS"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00c2 }
            if (r7 != 0) goto L_0x031e
            goto L_0x03ca
        L_0x031e:
            java.lang.String r7 = defpackage.ryg.g0(r12)     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r9.<init>()     // Catch:{ all -> 0x00c2 }
            r9.append(r8)     // Catch:{ all -> 0x00c2 }
            r9.append(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00c2 }
            int r7 = defpackage.wzf.c(r7)     // Catch:{ all -> 0x00c2 }
            r4.s = r7     // Catch:{ all -> 0x00c2 }
            goto L_0x00e8
        L_0x0339:
            java.lang.String r9 = "PUSH_SOUND"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00c2 }
            if (r7 != 0) goto L_0x0343
            goto L_0x03ca
        L_0x0343:
            java.lang.String r7 = r12.A0()     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r9.<init>()     // Catch:{ all -> 0x00c2 }
            r9.append(r8)     // Catch:{ all -> 0x00c2 }
            r9.append(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00c2 }
            r4.e = r7     // Catch:{ all -> 0x00c2 }
            goto L_0x00e8
        L_0x035a:
            java.lang.String r9 = "SEARCH_BY_PHONE"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00c2 }
            if (r7 != 0) goto L_0x0363
            goto L_0x03ca
        L_0x0363:
            java.lang.String r7 = defpackage.ryg.g0(r12)     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r9.<init>()     // Catch:{ all -> 0x00c2 }
            r9.append(r8)     // Catch:{ all -> 0x00c2 }
            r9.append(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00c2 }
            int r7 = defpackage.wzf.b(r7)     // Catch:{ all -> 0x00c2 }
            r4.v = r7     // Catch:{ all -> 0x00c2 }
            goto L_0x00e8
        L_0x037e:
            java.lang.String r9 = "DIALOGS_PUSH_SOUND"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00c2 }
            if (r7 != 0) goto L_0x0387
            goto L_0x03ca
        L_0x0387:
            java.lang.String r7 = r12.A0()     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r9.<init>()     // Catch:{ all -> 0x00c2 }
            r9.append(r8)     // Catch:{ all -> 0x00c2 }
            r9.append(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00c2 }
            r4.f = r7     // Catch:{ all -> 0x00c2 }
            goto L_0x00e8
        L_0x039e:
            java.lang.String r9 = "INCOMING_CALL"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00c2 }
            if (r7 != 0) goto L_0x03a7
            goto L_0x03ca
        L_0x03a7:
            java.lang.String r7 = r12.A0()     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r9.<init>()     // Catch:{ all -> 0x00c2 }
            r9.append(r8)     // Catch:{ all -> 0x00c2 }
            r9.append(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00c2 }
            int r7 = defpackage.wzf.b(r7)     // Catch:{ all -> 0x00c2 }
            r4.p = r7     // Catch:{ all -> 0x00c2 }
            goto L_0x00e8
        L_0x03c2:
            java.lang.String r9 = "DIALOGS_LED"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00c2 }
            if (r7 != 0) goto L_0x03df
        L_0x03ca:
            r12.A()     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r7.<init>()     // Catch:{ all -> 0x00c2 }
            r7.append(r8)     // Catch:{ all -> 0x00c2 }
            java.lang.String r8 = "skip!"
            r7.append(r8)     // Catch:{ all -> 0x00c2 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00c2 }
            goto L_0x03f8
        L_0x03df:
            int r7 = r12.w0()     // Catch:{ all -> 0x00c2 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r10.<init>()     // Catch:{ all -> 0x00c2 }
            r10.append(r8)     // Catch:{ all -> 0x00c2 }
            r10.append(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x00c2 }
            r4.j = r9     // Catch:{ all -> 0x00c2 }
        L_0x03f8:
            java.lang.String r8 = "ConfigurationUserSettingsParsing"
            defpackage.z68.c(r8, r7, new java.lang.Object[0])     // Catch:{ all -> 0x00c2 }
            goto L_0x042d
        L_0x03fe:
            defpackage.z68.o(r3, r2, r7)     // Catch:{ all -> 0x0065 }
            java.util.concurrent.CopyOnWriteArraySet r8 = defpackage.ytd.a     // Catch:{ all -> 0x0065 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0065 }
        L_0x0407:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0065 }
            if (r9 == 0) goto L_0x0417
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0065 }
            xm r9 = (defpackage.xm) r9     // Catch:{ all -> 0x0065 }
            r9.a(r7)     // Catch:{ all -> 0x0065 }
            goto L_0x0407
        L_0x0417:
            gga r8 = defpackage.xtd.a     // Catch:{ all -> 0x0065 }
            r8.getClass()     // Catch:{ all -> 0x0065 }
            xtd r8 = defpackage.xtd.b     // Catch:{ all -> 0x0065 }
            int r8 = r8.ordinal()     // Catch:{ all -> 0x0065 }
            if (r8 == 0) goto L_0x042d
            if (r8 == r1) goto L_0x042c
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0065 }
            r12.<init>()     // Catch:{ all -> 0x0065 }
            throw r12     // Catch:{ all -> 0x0065 }
        L_0x042c:
            throw r7     // Catch:{ all -> 0x0065 }
        L_0x042d:
            int r6 = r6 + r1
            goto L_0x0044
        L_0x0430:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0065 }
            goto L_0x0462
        L_0x0433:
            defpackage.z68.o(r3, r2, r12)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x043c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x044c
            java.lang.Object r2 = r0.next()
            xm r2 = (defpackage.xm) r2
            r2.a(r12)
            goto L_0x043c
        L_0x044c:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0462
            if (r0 == r1) goto L_0x0461
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        L_0x0461:
            throw r12
        L_0x0462:
            n0g r12 = new n0g
            r12.<init>(r4)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.af3.a(pf9):n0g");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [qae, java.util.Map] */
    public static final Map b(pf9 pf9) {
        if (pf9.n().a() != 8) {
            pf9.A();
            return MapsKt.emptyMap();
        }
        int e0 = ryg.e0(pf9);
        if (e0 == 0) {
            return MapsKt.emptyMap();
        }
        ? qae = new qae(e0);
        for (int i = 0; i < e0; i++) {
            String g0 = ryg.g0(pf9);
            if (g0 != null) {
                qae.put(g0, c(pf9));
            } else {
                pf9.A();
            }
        }
        return qae;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Long} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(defpackage.pf9 r4) {
        /*
            hb9 r0 = r4.n()
            int r0 = r0.a()
            if (r0 != 0) goto L_0x000c
            r0 = -1
            goto L_0x0014
        L_0x000c:
            int[] r1 = defpackage.ze3.$EnumSwitchMapping$0
            int r0 = defpackage.tr1.y(r0)
            r0 = r1[r0]
        L_0x0014:
            r1 = 0
            switch(r0) {
                case 1: goto L_0x0072;
                case 2: goto L_0x0069;
                case 3: goto L_0x0051;
                case 4: goto L_0x004c;
                case 5: goto L_0x0047;
                case 6: goto L_0x0021;
                case 7: goto L_0x001c;
                default: goto L_0x0018;
            }
        L_0x0018:
            r4.A()
            return r1
        L_0x001c:
            java.util.Map r4 = b(r4)
            goto L_0x007c
        L_0x0021:
            hb9 r0 = r4.n()
            int r0 = r0.a()
            r2 = 7
            if (r0 != r2) goto L_0x0042
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r0 = r4.t0()
            r2 = 0
        L_0x0036:
            if (r2 >= r0) goto L_0x0045
            java.lang.Object r3 = c(r4)
            r1.add(r3)
            int r2 = r2 + 1
            goto L_0x0036
        L_0x0042:
            r4.A()
        L_0x0045:
            r4 = r1
            goto L_0x007c
        L_0x0047:
            java.lang.String r4 = defpackage.ryg.h0(r4, r1)
            goto L_0x007c
        L_0x004c:
            java.lang.Float r4 = defpackage.ryg.b0(r4, r1)
            goto L_0x007c
        L_0x0051:
            hb9 r0 = r4.n()
            int r0 = r0.a()
            r2 = 3
            if (r0 != r2) goto L_0x0065
            long r0 = r4.x0()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            goto L_0x0045
        L_0x0065:
            r4.A()
            goto L_0x0045
        L_0x0069:
            boolean r4 = defpackage.ryg.Y(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L_0x007c
        L_0x0072:
            byte r4 = r4.readByte()
            r0 = -64
            if (r4 != r0) goto L_0x007d
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x007c:
            return r4
        L_0x007d:
            java.lang.String r0 = "Nil"
            org.msgpack.core.MessagePackException r4 = defpackage.pf9.s0(r0, r4)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.af3.c(pf9):java.lang.Object");
    }
}
