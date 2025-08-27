package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import kotlin.Lazy;
import kotlin.io.ConstantsKt;
import one.me.common.drawable.SavedMessagesIconDrawable;

/* renamed from: tld  reason: default package */
public final class tld {
    public static final d9a b = new Object();
    public final Lazy a;

    public tld(Lazy lazy) {
        this.a = lazy;
    }

    public static List c(ArrayList arrayList, List list) {
        return (List) list.stream().filter(new rld(arrayList, (Set) arrayList.stream().filter(new lm3(4)).map(new mm3(4)).collect(Collectors.toCollection(new vk(2))), (Set) arrayList.stream().filter(new lm3(1)).map(new mm3(5)).collect(Collectors.toCollection(new vk(2))), 0)).collect(Collectors.toList());
    }

    public static boolean i(char c) {
        if (!(Character.isWhitespace(c) || c == '[' || c == '{' || c == 160 || c == 8239 || c == 8287 || c == 8470 || c == 12288 || c == ']' || c == '^' || c == '}' || c == '~' || c == 8232 || c == 8233)) {
            switch (c) {
                case '!':
                case '\"':
                case '#':
                    break;
                default:
                    switch (c) {
                        case SavedMessagesIconDrawable.SMALL_SIZE:
                        case ')':
                        case '*':
                            break;
                        default:
                            switch (c) {
                                case ',':
                                case '-':
                                case '.':
                                case '/':
                                    break;
                                default:
                                    switch (c) {
                                        case ':':
                                        case ';':
                                        case '<':
                                            break;
                                        default:
                                            switch (c) {
                                                case '>':
                                                case '?':
                                                case '@':
                                                    break;
                                                default:
                                                    switch (c) {
                                                        case ConstantsKt.DEFAULT_BUFFER_SIZE:
                                                        case 8193:
                                                        case 8194:
                                                        case 8195:
                                                        case 8196:
                                                        case 8197:
                                                        case 8198:
                                                        case 8199:
                                                        case 8200:
                                                        case 8201:
                                                        case 8202:
                                                        case 8203:
                                                        case 8204:
                                                        case 8205:
                                                            break;
                                                        default:
                                                            return false;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
        return true;
    }

    public static int j(String str, int i, String str2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length() && i3 < i) {
            if (Character.isLetter(str.charAt(i2))) {
                boolean z2 = false;
                int i4 = i3;
                int i5 = i2;
                while (i2 < Math.min(i5 + 3, str.length()) && !z2) {
                    int i6 = i2 + 1;
                    String k = k(str.substring(i5, i6));
                    int i7 = i4;
                    while (true) {
                        if (i7 >= Math.min(i4 + 3, str2.length())) {
                            break;
                        }
                        int i8 = i7 + 1;
                        if (!k.equals(str2.substring(i4, i8))) {
                            i7 = i8;
                        } else if (z && i4 + 1 >= i) {
                            return i5;
                        } else {
                            z2 = true;
                            i5 = i2;
                            i4 = i7;
                        }
                    }
                    i2 = i6;
                }
                if (!z2) {
                    StringBuilder r = rae.r("cannot correctly find composed index: original ", str, ", query = ", str2, ", index = ");
                    r.append(str2);
                    z68.f("tld", r.toString(), (Throwable) null);
                    return -1;
                }
                i2 = i5;
                i3 = i4;
            }
            i2++;
            i3++;
        }
        return i2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01d6, code lost:
        r3.append('V');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01dc, code lost:
        r3.append('U');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0235, code lost:
        r3.append('R');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x025b, code lost:
        r3.append('N');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0260, code lost:
        r3.append('M');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0267, code lost:
        r3.append('L');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0279, code lost:
        r3.append('K');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x02e7, code lost:
        r3.append('F');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x02ec, code lost:
        r3.append('D');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0313, code lost:
        r3.append('B');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x031a, code lost:
        r3.append('A');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0355, code lost:
        if (r5 <= '9') goto L_0x0357;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String k(java.lang.String r16) {
        /*
            boolean r0 = defpackage.cvg.A(r16)
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            boolean r0 = defpackage.cvg.A(r16)
            r2 = 0
            if (r0 == 0) goto L_0x0013
            r4 = r16
            goto L_0x002c
        L_0x0013:
            int r0 = r16.length()
            int r0 = r0 * 4
            char[] r0 = new char[r0]
            char[] r3 = r16.toCharArray()
            int r4 = r16.length()
            int r3 = defpackage.tf6.I(r3, r0, r4)
            java.lang.String r4 = new java.lang.String
            r4.<init>(r0, r2, r3)
        L_0x002c:
            java.lang.String r0 = r4.toUpperCase()
            d9a r3 = b
            r3.getClass()
            if (r0 == 0) goto L_0x037b
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x003f
            goto L_0x037b
        L_0x003f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r4 = r0.length()
            r3.<init>(r4)
            r4 = 1
            r5 = r2
            r7 = r5
            r8 = r7
            r6 = r4
        L_0x004d:
            int r9 = r0.length()
            r10 = 57
            r11 = 48
            if (r5 >= r9) goto L_0x0085
            char r9 = r0.charAt(r5)
            char r9 = java.lang.Character.toUpperCase(r9)
            if (r11 > r9) goto L_0x0068
            if (r9 > r10) goto L_0x0068
            r3.append(r9)
        L_0x0066:
            r8 = r9
            goto L_0x0082
        L_0x0068:
            boolean r10 = java.lang.Character.isLetter(r9)
            if (r10 == 0) goto L_0x0082
            if (r9 == r8) goto L_0x0082
            r3.append(r9)
            if (r7 != 0) goto L_0x007e
            r8 = 1024(0x400, float:1.435E-42)
            if (r8 > r9) goto L_0x007e
            r8 = 1536(0x600, float:2.152E-42)
            if (r9 >= r8) goto L_0x007e
            r7 = r4
        L_0x007e:
            if (r6 == 0) goto L_0x0066
            r6 = r2
            goto L_0x0066
        L_0x0082:
            int r5 = r5 + 1
            goto L_0x004d
        L_0x0085:
            r5 = 2
            if (r6 == 0) goto L_0x008a
            r6 = r4
            goto L_0x008f
        L_0x008a:
            if (r7 == 0) goto L_0x008e
            r6 = r5
            goto L_0x008f
        L_0x008e:
            r6 = 3
        L_0x008f:
            int r7 = r3.length()
            if (r7 != 0) goto L_0x0097
            goto L_0x037c
        L_0x0097:
            if (r6 != r4) goto L_0x009f
            java.lang.String r1 = r3.toString()
            goto L_0x037c
        L_0x009f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            if (r6 != r5) goto L_0x00a8
            r0 = r4
            goto L_0x00a9
        L_0x00a8:
            r0 = r2
        L_0x00a9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r5 = r1.length()
            r3.<init>(r5)
        L_0x00b2:
            int r5 = r1.length()
            if (r2 >= r5) goto L_0x0376
            char r5 = r1.charAt(r2)
            r6 = 79
            if (r5 == r11) goto L_0x036c
            java.lang.String r7 = "CH"
            r8 = 52
            if (r5 == r8) goto L_0x0341
            r9 = 54
            if (r5 == r9) goto L_0x0138
            r9 = 1025(0x401, float:1.436E-42)
            java.lang.String r13 = "E"
            if (r5 == r9) goto L_0x0337
            r9 = 1028(0x404, float:1.44E-42)
            if (r5 == r9) goto L_0x0105
            r9 = 1168(0x490, float:1.637E-42)
            if (r5 == r9) goto L_0x032b
            r9 = 1030(0x406, float:1.443E-42)
            if (r5 == r9) goto L_0x0324
            r9 = 1031(0x407, float:1.445E-42)
            r15 = 89
            if (r5 == r9) goto L_0x031f
            r11 = 80
            r10 = 84
            java.lang.String r14 = "YA"
            java.lang.String r9 = "SH"
            r8 = 67
            r12 = 72
            switch(r5) {
                case 65: goto L_0x0194;
                case 66: goto L_0x0313;
                case 67: goto L_0x02f3;
                case 68: goto L_0x02ec;
                case 69: goto L_0x0105;
                case 70: goto L_0x012c;
                case 71: goto L_0x032b;
                case 72: goto L_0x02c1;
                case 73: goto L_0x0324;
                case 74: goto L_0x0280;
                case 75: goto L_0x026e;
                case 76: goto L_0x0267;
                case 77: goto L_0x0260;
                case 78: goto L_0x0155;
                case 79: goto L_0x0255;
                case 80: goto L_0x0243;
                case 81: goto L_0x023c;
                case 82: goto L_0x0235;
                case 83: goto L_0x0201;
                case 84: goto L_0x01e0;
                case 85: goto L_0x0130;
                case 86: goto L_0x01d6;
                case 87: goto L_0x01d6;
                case 88: goto L_0x01d0;
                case 89: goto L_0x01aa;
                case 90: goto L_0x0198;
                default: goto L_0x00f1;
            }
        L_0x00f1:
            switch(r5) {
                case 1040: goto L_0x0194;
                case 1041: goto L_0x0313;
                case 1042: goto L_0x01d6;
                case 1043: goto L_0x032b;
                case 1044: goto L_0x02ec;
                case 1045: goto L_0x0337;
                case 1046: goto L_0x018e;
                case 1047: goto L_0x0188;
                case 1048: goto L_0x0324;
                case 1049: goto L_0x0159;
                case 1050: goto L_0x0279;
                case 1051: goto L_0x0267;
                case 1052: goto L_0x0260;
                case 1053: goto L_0x0155;
                case 1054: goto L_0x0140;
                case 1055: goto L_0x013c;
                case 1056: goto L_0x0235;
                case 1057: goto L_0x0138;
                case 1058: goto L_0x0134;
                case 1059: goto L_0x0130;
                case 1060: goto L_0x012c;
                case 1061: goto L_0x0128;
                case 1062: goto L_0x0124;
                case 1063: goto L_0x0341;
                case 1064: goto L_0x0120;
                case 1065: goto L_0x011c;
                case 1066: goto L_0x0109;
                case 1067: goto L_0x031f;
                case 1068: goto L_0x0109;
                case 1069: goto L_0x0105;
                case 1070: goto L_0x00fe;
                case 1071: goto L_0x00f9;
                default: goto L_0x00f4;
            }
        L_0x00f4:
            r3.append(r5)
            goto L_0x0166
        L_0x00f9:
            r3.append(r14)
            goto L_0x0166
        L_0x00fe:
            java.lang.String r5 = "YU"
            r3.append(r5)
            goto L_0x0166
        L_0x0105:
            r5 = 69
            goto L_0x0332
        L_0x0109:
            int r6 = r2 + 1
            int r7 = r1.length()
            if (r6 >= r7) goto L_0x0118
            int r6 = r1.length()
            if (r6 <= r4) goto L_0x0118
            goto L_0x0166
        L_0x0118:
            r3.append(r5)
            goto L_0x0166
        L_0x011c:
            r3.append(r9)
            goto L_0x0166
        L_0x0120:
            r3.append(r9)
            goto L_0x0166
        L_0x0124:
            r3.append(r8)
            goto L_0x0166
        L_0x0128:
            r3.append(r12)
            goto L_0x0166
        L_0x012c:
            r5 = 70
            goto L_0x02e7
        L_0x0130:
            r5 = 85
            goto L_0x01dc
        L_0x0134:
            r3.append(r10)
            goto L_0x0166
        L_0x0138:
            r5 = 83
            goto L_0x033c
        L_0x013c:
            r3.append(r11)
            goto L_0x0166
        L_0x0140:
            if (r2 == 0) goto L_0x0151
            int r5 = r2 + -1
            char r5 = r1.charAt(r5)
            r7 = 1068(0x42c, float:1.497E-42)
            if (r5 == r7) goto L_0x014d
            goto L_0x0151
        L_0x014d:
            r3.append(r13)
            goto L_0x0166
        L_0x0151:
            r3.append(r6)
            goto L_0x0166
        L_0x0155:
            r5 = 78
            goto L_0x025b
        L_0x0159:
            r5 = 1040(0x410, float:1.457E-42)
            boolean r5 = defpackage.d9a.a(r1, r2, r5)
            if (r5 == 0) goto L_0x016c
            r3.append(r14)
        L_0x0164:
            int r2 = r2 + 1
        L_0x0166:
            r8 = 48
            r9 = 57
            goto L_0x0371
        L_0x016c:
            r5 = 1045(0x415, float:1.464E-42)
            boolean r5 = defpackage.d9a.a(r1, r2, r5)
            if (r5 == 0) goto L_0x0178
            r3.append(r13)
            goto L_0x0164
        L_0x0178:
            r5 = 1054(0x41e, float:1.477E-42)
            boolean r5 = defpackage.d9a.a(r1, r2, r5)
            if (r5 == 0) goto L_0x0184
            r3.append(r13)
            goto L_0x0164
        L_0x0184:
            r3.append(r15)
            goto L_0x0166
        L_0x0188:
            r5 = 90
            r3.append(r5)
            goto L_0x0166
        L_0x018e:
            r5 = 74
            r3.append(r5)
            goto L_0x0166
        L_0x0194:
            r5 = 65
            goto L_0x031a
        L_0x0198:
            r5 = 74
            boolean r6 = defpackage.d9a.a(r1, r2, r12)
            if (r6 == 0) goto L_0x01a4
            r3.append(r5)
            goto L_0x0164
        L_0x01a4:
            r5 = 90
            r3.append(r5)
            goto L_0x0166
        L_0x01aa:
            r5 = 65
            boolean r5 = defpackage.d9a.a(r1, r2, r5)
            if (r5 == 0) goto L_0x01b6
            r3.append(r14)
            goto L_0x0164
        L_0x01b6:
            r5 = 69
            boolean r5 = defpackage.d9a.a(r1, r2, r5)
            if (r5 == 0) goto L_0x01c2
            r3.append(r13)
            goto L_0x0164
        L_0x01c2:
            boolean r5 = defpackage.d9a.a(r1, r2, r6)
            if (r5 == 0) goto L_0x01cc
            r3.append(r13)
            goto L_0x0164
        L_0x01cc:
            r3.append(r15)
            goto L_0x0166
        L_0x01d0:
            java.lang.String r5 = "KS"
            r3.append(r5)
            goto L_0x0166
        L_0x01d6:
            r5 = 86
            r3.append(r5)
            goto L_0x0166
        L_0x01dc:
            r3.append(r5)
            goto L_0x0166
        L_0x01e0:
            boolean r5 = defpackage.d9a.a(r1, r2, r12)
            if (r5 == 0) goto L_0x01ed
            int r2 = r2 + 1
            r3.append(r10)
            goto L_0x0166
        L_0x01ed:
            r5 = 83
            boolean r5 = defpackage.d9a.a(r1, r2, r5)
            if (r5 == 0) goto L_0x01fc
            int r2 = r2 + 1
            r3.append(r8)
            goto L_0x0166
        L_0x01fc:
            r3.append(r10)
            goto L_0x0166
        L_0x0201:
            boolean r5 = defpackage.d9a.a(r1, r2, r8)
            if (r5 == 0) goto L_0x0216
            int r5 = r2 + 1
            boolean r5 = defpackage.d9a.a(r1, r5, r12)
            if (r5 == 0) goto L_0x0216
            r3.append(r9)
            int r2 = r2 + 2
            goto L_0x0166
        L_0x0216:
            boolean r5 = defpackage.d9a.a(r1, r2, r8)
            if (r5 == 0) goto L_0x0223
            java.lang.String r5 = "SC"
            r3.append(r5)
            goto L_0x0164
        L_0x0223:
            boolean r5 = defpackage.d9a.a(r1, r2, r12)
            if (r5 == 0) goto L_0x022e
            r3.append(r9)
            goto L_0x0164
        L_0x022e:
            r5 = 83
            r3.append(r5)
            goto L_0x0166
        L_0x0235:
            r5 = 82
            r3.append(r5)
            goto L_0x0166
        L_0x023c:
            java.lang.String r5 = "KU"
            r3.append(r5)
            goto L_0x0166
        L_0x0243:
            boolean r5 = defpackage.d9a.a(r1, r2, r12)
            if (r5 == 0) goto L_0x0250
            r5 = 70
            r3.append(r5)
            goto L_0x0164
        L_0x0250:
            r3.append(r11)
            goto L_0x0166
        L_0x0255:
            r8 = 48
            r9 = 57
            goto L_0x036e
        L_0x025b:
            r3.append(r5)
            goto L_0x0166
        L_0x0260:
            r5 = 77
            r3.append(r5)
            goto L_0x0166
        L_0x0267:
            r5 = 76
            r3.append(r5)
            goto L_0x0166
        L_0x026e:
            boolean r5 = defpackage.d9a.a(r1, r2, r12)
            if (r5 == 0) goto L_0x0279
            r3.append(r12)
            goto L_0x0164
        L_0x0279:
            r5 = 75
            r3.append(r5)
            goto L_0x0166
        L_0x0280:
            r5 = 69
            boolean r5 = defpackage.d9a.a(r1, r2, r5)
            if (r5 == 0) goto L_0x028f
            java.lang.String r5 = "JE"
            r3.append(r5)
            goto L_0x0164
        L_0x028f:
            r5 = 65
            boolean r5 = defpackage.d9a.a(r1, r2, r5)
            if (r5 == 0) goto L_0x029e
            java.lang.String r5 = "JA"
            r3.append(r5)
            goto L_0x0164
        L_0x029e:
            r5 = 85
            boolean r5 = defpackage.d9a.a(r1, r2, r5)
            if (r5 == 0) goto L_0x02ad
            java.lang.String r5 = "JU"
            r3.append(r5)
            goto L_0x0164
        L_0x02ad:
            boolean r5 = defpackage.d9a.a(r1, r2, r6)
            if (r5 == 0) goto L_0x02ba
            java.lang.String r5 = "JO"
            r3.append(r5)
            goto L_0x0164
        L_0x02ba:
            r5 = 74
            r3.append(r5)
            goto L_0x0166
        L_0x02c1:
            if (r0 == 0) goto L_0x02ca
            r5 = 78
            r3.append(r5)
            goto L_0x0166
        L_0x02ca:
            if (r2 == 0) goto L_0x02d6
            int r5 = r2 + -1
            char r5 = r1.charAt(r5)
            r6 = 83
            if (r5 == r6) goto L_0x0166
        L_0x02d6:
            if (r2 == 0) goto L_0x02e2
            int r5 = r2 + -1
            char r5 = r1.charAt(r5)
            r6 = 90
            if (r5 == r6) goto L_0x0166
        L_0x02e2:
            r3.append(r12)
            goto L_0x0166
        L_0x02e7:
            r3.append(r5)
            goto L_0x0166
        L_0x02ec:
            r5 = 68
            r3.append(r5)
            goto L_0x0166
        L_0x02f3:
            if (r0 != 0) goto L_0x02fb
            int r5 = r1.length()
            if (r5 != r4) goto L_0x02fe
        L_0x02fb:
            r5 = 83
            goto L_0x030e
        L_0x02fe:
            boolean r5 = defpackage.d9a.a(r1, r2, r12)
            if (r5 == 0) goto L_0x0309
            r3.append(r7)
            goto L_0x0164
        L_0x0309:
            r3.append(r8)
            goto L_0x0166
        L_0x030e:
            r3.append(r5)
            goto L_0x0166
        L_0x0313:
            r5 = 66
            r3.append(r5)
            goto L_0x0166
        L_0x031a:
            r3.append(r5)
            goto L_0x0166
        L_0x031f:
            r3.append(r15)
            goto L_0x0166
        L_0x0324:
            r5 = 73
            r3.append(r5)
            goto L_0x0166
        L_0x032b:
            r5 = 71
            r3.append(r5)
            goto L_0x0166
        L_0x0332:
            r3.append(r5)
            goto L_0x0166
        L_0x0337:
            r3.append(r13)
            goto L_0x0166
        L_0x033c:
            r3.append(r5)
            goto L_0x0166
        L_0x0341:
            if (r0 == 0) goto L_0x035f
            int r5 = r2 + 1
            int r6 = r1.length()
            if (r5 >= r6) goto L_0x035a
            char r5 = r1.charAt(r5)
            r8 = 48
            r9 = 57
            if (r8 > r5) goto L_0x0368
            if (r5 > r9) goto L_0x0368
        L_0x0357:
            r5 = 52
            goto L_0x0364
        L_0x035a:
            r8 = 48
            r9 = 57
            goto L_0x0368
        L_0x035f:
            r8 = 48
            r9 = 57
            goto L_0x0357
        L_0x0364:
            java.lang.Character r7 = java.lang.Character.valueOf(r5)
        L_0x0368:
            r3.append(r7)
            goto L_0x0371
        L_0x036c:
            r9 = r10
            r8 = r11
        L_0x036e:
            r3.append(r6)
        L_0x0371:
            int r2 = r2 + r4
            r11 = r8
            r10 = r9
            goto L_0x00b2
        L_0x0376:
            java.lang.String r1 = r3.toString()
            goto L_0x037c
        L_0x037b:
            r1 = r0
        L_0x037c:
            boolean r0 = defpackage.cvg.A(r1)
            if (r0 == 0) goto L_0x0384
            r1 = r16
        L_0x0384:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tld.k(java.lang.String):java.lang.String");
    }

    public final ald a(a32 a32, String str) {
        List e = e(a32.r(), str);
        if (e.isEmpty()) {
            String c = hhf.c(a32.b.I);
            if (!cvg.A(c)) {
                e = e(c, str);
            }
            vk3 m = a32.m();
            if (e.isEmpty() && m != null) {
                e = b(m, str).c;
            }
        }
        return new ald(1, (String) null, e, a32, (vk3) null, (b89) null, 0, (bac) null);
    }

    public final ald b(vk3 vk3, String str) {
        ArrayList arrayList = new ArrayList();
        for (String e : (List) new mha(jha.r(new yia(jha.n(vk3.l()), new qbb(28), 3), jha.q(vk3.m())), new qbb(29), 1).B().f()) {
            arrayList.addAll(e(e, str));
        }
        return new ald(4, (String) null, arrayList, (a32) null, vk3, (b89) null, 0, (bac) null);
    }

    public final List d(String str, List list) {
        if (cvg.A(str)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!cvg.A(str2)) {
                int indexOf = str.toLowerCase().indexOf(str2.toLowerCase(), 0);
                while (indexOf >= 0 && indexOf < str.length()) {
                    if (indexOf != 0) {
                        int i = indexOf - 1;
                        if (!i(str.charAt(i)) && !i(str.charAt(indexOf))) {
                            if (indexOf >= 0 && indexOf < str.length()) {
                                Lazy lazy = this.a;
                                if (!((yva) lazy.getValue()).k.g(str, i)) {
                                    if (!((yva) lazy.getValue()).k.g(str, indexOf - 2)) {
                                    }
                                }
                            }
                            indexOf = str.toLowerCase().indexOf(str2.toLowerCase(), indexOf + 1);
                        }
                    }
                    arrayList.add(new sld(indexOf, str2.length() + indexOf));
                    indexOf = str.toLowerCase().indexOf(str2.toLowerCase(), indexOf + 1);
                }
            }
        }
        return arrayList;
    }

    public final List e(String str, String str2) {
        int j;
        if (cvg.A(str) || cvg.A(str2)) {
            return Collections.emptyList();
        }
        HashSet hashSet = new HashSet();
        String[] l = l(str);
        String[] l2 = l(str2);
        for (String str3 : l) {
            String k = k(str3);
            for (String str4 : l2) {
                String str5 = str4;
                if (str3.regionMatches(true, 0, str4, 0, str4.length())) {
                    hashSet.add(str5);
                } else {
                    String k2 = k(str5);
                    if (k.startsWith(k2)) {
                        int j2 = j(str3, 0, k, true);
                        if (j2 >= 0 && (j = j(str3, k2.length(), k, false)) > j2) {
                            hashSet.add(str3.substring(j2, j));
                        }
                    }
                }
            }
        }
        return new ArrayList(hashSet);
    }

    public final boolean f(a32 a32, String str) {
        return h(a32.r(), str) || h(hhf.b(a32.b.I), str) || (a32.m() != null && g(a32.m(), str));
    }

    public final boolean g(vk3 vk3, String str) {
        if (cvg.A(str)) {
            return true;
        }
        List l = vk3.l();
        String m = vk3.m();
        if (cvg.A(str)) {
            return true;
        }
        qld qld = new qld(this, str);
        if (qld.test(hhf.b(m))) {
            return true;
        }
        return l.stream().map(new mm3(6)).anyMatch(qld);
    }

    public final boolean h(String str, String str2) {
        if (cvg.A(str2)) {
            return true;
        }
        String trim = str.trim();
        String[] l = l(str2.trim());
        if (l.length != 0) {
            String[] strArr = new String[l.length];
            for (int i = 0; i < l.length; i++) {
                strArr[i] = k(l[i]);
            }
            String[] l2 = l(trim);
            int i2 = 0;
            while (i2 < l.length) {
                String str3 = l[i2];
                String str4 = strArr[i2];
                boolean z = false;
                for (String str5 : l2) {
                    if (str5.regionMatches(true, 0, str3, 0, str3.length()) || k(str5).startsWith(str4)) {
                        z = true;
                    }
                }
                if (z) {
                    i2++;
                }
            }
            return true;
        }
        return false;
    }

    public final String[] l(String str) {
        return hhf.e(str, (yva) this.a.getValue());
    }

    public final String m(String str, List list) {
        String[] l = l(str);
        if (cvg.A(str) || cjf.B(list) || l == null || l.length == 0) {
            return str;
        }
        for (int i = 0; i < l.length; i++) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!cvg.A(str2) && l[i].regionMatches(true, 0, str2, 0, str2.length())) {
                    int indexOf = str.indexOf(l[i]);
                    if (i == 0 || indexOf <= 10) {
                        return str;
                    }
                    return "…" + str.substring(Math.max(0, indexOf - 10));
                }
            }
        }
        return str;
    }
}
