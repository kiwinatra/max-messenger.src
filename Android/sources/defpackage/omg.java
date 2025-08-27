package defpackage;

/* renamed from: omg  reason: default package */
public final class omg extends ibe {
    public final g1g v0 = new g1g(3, false);
    public final zlg w0 = new zlg();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r0v4, types: [uye, jk3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v19, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r10v3, types: [java.lang.Object, bmg] */
    /* JADX WARNING: type inference failed for: r1v21 */
    /* JADX WARNING: type inference failed for: r1v53 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0101, code lost:
        if (")".equals(defpackage.zlg.b(r8, r11)) == false) goto L_0x009b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.uye a(int r20, byte[] r21, boolean r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = 0
            r2 = -1
            r3 = 2
            r4 = 1
            g1g r5 = r0.v0
            r6 = r20
            r7 = r21
            r5.F(r6, r7)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            defpackage.rmg.d(r5)     // Catch:{ ParserException -> 0x041d }
        L_0x0017:
            java.lang.String r7 = r5.i()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x0022
            goto L_0x0017
        L_0x0022:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x0027:
            r9 = r1
            r8 = r2
        L_0x0029:
            if (r8 != r2) goto L_0x004b
            int r9 = r5.b
            java.lang.String r8 = r5.i()
            if (r8 != 0) goto L_0x0035
            r8 = r1
            goto L_0x0029
        L_0x0035:
            java.lang.String r11 = "STYLE"
            boolean r11 = r11.equals(r8)
            if (r11 == 0) goto L_0x003f
            r8 = r3
            goto L_0x0029
        L_0x003f:
            java.lang.String r11 = "NOTE"
            boolean r8 = r8.startsWith(r11)
            if (r8 == 0) goto L_0x0049
            r8 = r4
            goto L_0x0029
        L_0x0049:
            r8 = 3
            goto L_0x0029
        L_0x004b:
            r5.H(r9)
            if (r8 == 0) goto L_0x03d5
            if (r8 != r4) goto L_0x005d
        L_0x0052:
            java.lang.String r8 = r5.i()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x0027
            goto L_0x0052
        L_0x005d:
            r9 = 0
            if (r8 != r3) goto L_0x0395
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x038d
            r5.i()
            zlg r8 = r0.w0
            java.lang.StringBuilder r11 = r8.b
            r11.setLength(r1)
            int r12 = r5.b
        L_0x0072:
            java.lang.String r13 = r5.i()
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 == 0) goto L_0x0389
            byte[] r13 = r5.a
            int r14 = r5.b
            g1g r8 = r8.a
            r8.F(r14, r13)
            r8.H(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L_0x008d:
            defpackage.zlg.c(r8)
            int r13 = r8.c()
            java.lang.String r14 = "{"
            java.lang.String r15 = ""
            r10 = 5
            if (r13 >= r10) goto L_0x009e
        L_0x009b:
            r3 = r9
            goto L_0x0104
        L_0x009e:
            java.nio.charset.Charset r13 = defpackage.x22.c
            java.lang.String r10 = r8.t(r10, r13)
            java.lang.String r13 = "::cue"
            boolean r10 = r13.equals(r10)
            if (r10 != 0) goto L_0x00ad
            goto L_0x009b
        L_0x00ad:
            int r10 = r8.b
            java.lang.String r13 = defpackage.zlg.b(r8, r11)
            if (r13 != 0) goto L_0x00b6
            goto L_0x009b
        L_0x00b6:
            boolean r16 = r14.equals(r13)
            if (r16 == 0) goto L_0x00c1
            r8.H(r10)
            r3 = r15
            goto L_0x0104
        L_0x00c1:
            java.lang.String r10 = "("
            boolean r10 = r10.equals(r13)
            if (r10 == 0) goto L_0x00f6
            int r10 = r8.b
            int r13 = r8.c
            r16 = r1
        L_0x00cf:
            if (r10 >= r13) goto L_0x00e7
            if (r16 != 0) goto L_0x00e7
            byte[] r3 = r8.a
            int r16 = r10 + 1
            byte r3 = r3[r10]
            char r3 = (char) r3
            r10 = 41
            if (r3 != r10) goto L_0x00e0
            r3 = r4
            goto L_0x00e1
        L_0x00e0:
            r3 = r1
        L_0x00e1:
            r10 = r16
            r16 = r3
            r3 = 2
            goto L_0x00cf
        L_0x00e7:
            int r10 = r10 + r2
            int r3 = r8.b
            int r10 = r10 - r3
            java.nio.charset.Charset r3 = defpackage.x22.c
            java.lang.String r3 = r8.t(r10, r3)
            java.lang.String r3 = r3.trim()
            goto L_0x00f7
        L_0x00f6:
            r3 = r9
        L_0x00f7:
            java.lang.String r10 = defpackage.zlg.b(r8, r11)
            java.lang.String r13 = ")"
            boolean r10 = r13.equals(r10)
            if (r10 != 0) goto L_0x0104
            goto L_0x009b
        L_0x0104:
            if (r3 == 0) goto L_0x037e
            java.lang.String r10 = defpackage.zlg.b(r8, r11)
            boolean r10 = r14.equals(r10)
            if (r10 != 0) goto L_0x0112
            goto L_0x037e
        L_0x0112:
            bmg r10 = new bmg
            r10.<init>()
            r10.a = r15
            r10.b = r15
            java.util.Set r13 = java.util.Collections.emptySet()
            r10.c = r13
            r10.d = r15
            r10.e = r9
            r10.g = r1
            r10.i = r1
            r10.j = r2
            r10.k = r2
            r10.l = r2
            r10.m = r2
            r10.n = r2
            r10.p = r2
            r10.q = r1
            boolean r13 = r15.equals(r3)
            if (r13 == 0) goto L_0x013e
            goto L_0x01a3
        L_0x013e:
            r13 = 91
            int r13 = r3.indexOf(r13)
            if (r13 == r2) goto L_0x0163
            java.util.regex.Pattern r14 = defpackage.zlg.c
            java.lang.String r9 = r3.substring(r13)
            java.util.regex.Matcher r9 = r14.matcher(r9)
            boolean r14 = r9.matches()
            if (r14 == 0) goto L_0x015f
            java.lang.String r9 = r9.group(r4)
            r9.getClass()
            r10.d = r9
        L_0x015f:
            java.lang.String r3 = r3.substring(r1, r13)
        L_0x0163:
            int r9 = defpackage.t0g.a
            java.lang.String r9 = "\\."
            java.lang.String[] r3 = r3.split(r9, r2)
            r9 = r3[r1]
            r13 = 35
            int r13 = r9.indexOf(r13)
            if (r13 == r2) goto L_0x0183
            java.lang.String r14 = r9.substring(r1, r13)
            r10.b = r14
            int r13 = r13 + r4
            java.lang.String r9 = r9.substring(r13)
            r10.a = r9
            goto L_0x0185
        L_0x0183:
            r10.b = r9
        L_0x0185:
            int r9 = r3.length
            if (r9 <= r4) goto L_0x01a3
            int r9 = r3.length
            int r13 = r3.length
            if (r9 > r13) goto L_0x018e
            r13 = r4
            goto L_0x018f
        L_0x018e:
            r13 = r1
        L_0x018f:
            defpackage.y64.g(r13)
            java.lang.Object[] r3 = java.util.Arrays.copyOfRange(r3, r4, r9)
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.util.HashSet r9 = new java.util.HashSet
            java.util.List r3 = java.util.Arrays.asList(r3)
            r9.<init>(r3)
            r10.c = r9
        L_0x01a3:
            r3 = r1
            r9 = 0
        L_0x01a5:
            java.lang.String r13 = "}"
            if (r3 != 0) goto L_0x036c
            int r3 = r8.b
            java.lang.String r9 = defpackage.zlg.b(r8, r11)
            if (r9 == 0) goto L_0x01ba
            boolean r14 = r13.equals(r9)
            if (r14 == 0) goto L_0x01b8
            goto L_0x01ba
        L_0x01b8:
            r14 = r1
            goto L_0x01bb
        L_0x01ba:
            r14 = r4
        L_0x01bb:
            if (r14 != 0) goto L_0x0364
            r8.H(r3)
            defpackage.zlg.c(r8)
            java.lang.String r3 = defpackage.zlg.a(r8, r11)
            boolean r16 = r15.equals(r3)
            if (r16 == 0) goto L_0x01cf
            goto L_0x0364
        L_0x01cf:
            java.lang.String r1 = ":"
            java.lang.String r2 = defpackage.zlg.b(r8, r11)
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x01dd
            goto L_0x0364
        L_0x01dd:
            defpackage.zlg.c(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
        L_0x01e6:
            java.lang.String r4 = ";"
            if (r2 != 0) goto L_0x0212
            int r0 = r8.b
            r17 = r2
            java.lang.String r2 = defpackage.zlg.b(r8, r11)
            if (r2 != 0) goto L_0x01f6
            r0 = 0
            goto L_0x0216
        L_0x01f6:
            boolean r18 = r13.equals(r2)
            if (r18 != 0) goto L_0x020b
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0203
            goto L_0x020b
        L_0x0203:
            r1.append(r2)
            r0 = r19
            r2 = r17
            goto L_0x01e6
        L_0x020b:
            r8.H(r0)
            r2 = 1
            r0 = r19
            goto L_0x01e6
        L_0x0212:
            java.lang.String r0 = r1.toString()
        L_0x0216:
            if (r0 == 0) goto L_0x0364
            boolean r1 = r15.equals(r0)
            if (r1 == 0) goto L_0x0220
            goto L_0x0364
        L_0x0220:
            int r1 = r8.b
            java.lang.String r2 = defpackage.zlg.b(r8, r11)
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x022d
            goto L_0x0236
        L_0x022d:
            boolean r2 = r13.equals(r2)
            if (r2 == 0) goto L_0x0364
            r8.H(r1)
        L_0x0236:
            java.lang.String r1 = "color"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0249
            r1 = 1
            int r0 = defpackage.n53.a(r0, r1)
            r10.f = r0
            r10.g = r1
            goto L_0x0364
        L_0x0249:
            r1 = 1
            java.lang.String r2 = "background-color"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x025c
            int r0 = defpackage.n53.a(r0, r1)
            r10.h = r0
            r10.i = r1
            goto L_0x0364
        L_0x025c:
            java.lang.String r2 = "ruby-position"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x027d
            java.lang.String r2 = "over"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0270
            r10.p = r1
            goto L_0x0364
        L_0x0270:
            java.lang.String r1 = "under"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0364
            r0 = 2
            r10.p = r0
            goto L_0x0364
        L_0x027d:
            java.lang.String r1 = "text-combine-upright"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x029d
            java.lang.String r1 = "all"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0298
            java.lang.String r1 = "digits"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x0296
            goto L_0x0298
        L_0x0296:
            r0 = 0
            goto L_0x0299
        L_0x0298:
            r0 = 1
        L_0x0299:
            r10.q = r0
            goto L_0x0364
        L_0x029d:
            java.lang.String r1 = "text-decoration"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02b2
            java.lang.String r1 = "underline"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0364
            r0 = 1
            r10.k = r0
            goto L_0x0364
        L_0x02b2:
            java.lang.String r1 = "font-family"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02c2
            java.lang.String r0 = defpackage.o54.P(r0)
            r10.e = r0
            goto L_0x0364
        L_0x02c2:
            java.lang.String r1 = "font-weight"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02d7
            java.lang.String r1 = "bold"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0364
            r1 = 1
            r10.l = r1
            goto L_0x0364
        L_0x02d7:
            r1 = 1
            java.lang.String r2 = "font-style"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02ec
            java.lang.String r2 = "italic"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0364
            r10.m = r1
            goto L_0x0364
        L_0x02ec:
            java.lang.String r1 = "font-size"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0364
            java.lang.String r1 = defpackage.o54.P(r0)
            java.util.regex.Pattern r2 = defpackage.zlg.d
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r2 = r1.matches()
            if (r2 != 0) goto L_0x0310
            int r0 = r0.length()
            int r0 = r0 + 22
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            goto L_0x0364
        L_0x0310:
            r0 = 2
            java.lang.String r2 = r1.group(r0)
            r2.getClass()
            int r0 = r2.hashCode()
            switch(r0) {
                case 37: goto L_0x0337;
                case 3240: goto L_0x032c;
                case 3592: goto L_0x0321;
                default: goto L_0x031f;
            }
        L_0x031f:
            r0 = -1
            goto L_0x0341
        L_0x0321:
            java.lang.String r0 = "px"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x032a
            goto L_0x031f
        L_0x032a:
            r0 = 2
            goto L_0x0341
        L_0x032c:
            java.lang.String r0 = "em"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0335
            goto L_0x031f
        L_0x0335:
            r0 = 1
            goto L_0x0341
        L_0x0337:
            java.lang.String r0 = "%"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0340
            goto L_0x031f
        L_0x0340:
            r0 = 0
        L_0x0341:
            switch(r0) {
                case 0: goto L_0x0353;
                case 1: goto L_0x034e;
                case 2: goto L_0x034a;
                default: goto L_0x0344;
            }
        L_0x0344:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x034a:
            r0 = 1
            r10.n = r0
            goto L_0x0357
        L_0x034e:
            r0 = 1
            r2 = 2
            r10.n = r2
            goto L_0x0357
        L_0x0353:
            r0 = 1
            r2 = 3
            r10.n = r2
        L_0x0357:
            java.lang.String r1 = r1.group(r0)
            r1.getClass()
            float r0 = java.lang.Float.parseFloat(r1)
            r10.o = r0
        L_0x0364:
            r0 = r19
            r3 = r14
            r1 = 0
            r2 = -1
            r4 = 1
            goto L_0x01a5
        L_0x036c:
            boolean r0 = r13.equals(r9)
            if (r0 == 0) goto L_0x0375
            r12.add(r10)
        L_0x0375:
            r0 = r19
            r1 = 0
            r2 = -1
            r3 = 2
            r4 = 1
            r9 = 0
            goto L_0x008d
        L_0x037e:
            r6.addAll(r12)
        L_0x0381:
            r0 = r19
            r1 = 0
            r2 = -1
            r3 = 2
            r4 = 1
            goto L_0x0027
        L_0x0389:
            r0 = r19
            goto L_0x0072
        L_0x038d:
            com.google.android.exoplayer2.text.SubtitleDecoderException r0 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r1 = "A style block was found after the first cue."
            r0.<init>(r1)
            throw r0
        L_0x0395:
            r0 = 3
            if (r8 != r0) goto L_0x0381
            java.util.regex.Pattern r0 = defpackage.mmg.a
            java.lang.String r0 = r5.i()
            if (r0 != 0) goto L_0x03a2
            r9 = 0
            goto L_0x03cf
        L_0x03a2:
            java.util.regex.Pattern r1 = defpackage.mmg.a
            java.util.regex.Matcher r2 = r1.matcher(r0)
            boolean r3 = r2.matches()
            if (r3 == 0) goto L_0x03b4
            r3 = 0
            dmg r9 = defpackage.mmg.d(r3, r2, r5, r6)
            goto L_0x03cf
        L_0x03b4:
            r3 = 0
            java.lang.String r2 = r5.i()
            if (r2 != 0) goto L_0x03bd
        L_0x03bb:
            r9 = r3
            goto L_0x03cf
        L_0x03bd:
            java.util.regex.Matcher r1 = r1.matcher(r2)
            boolean r2 = r1.matches()
            if (r2 == 0) goto L_0x03bb
            java.lang.String r0 = r0.trim()
            dmg r9 = defpackage.mmg.d(r0, r1, r5, r6)
        L_0x03cf:
            if (r9 == 0) goto L_0x0381
            r7.add(r9)
            goto L_0x0381
        L_0x03d5:
            jk3 r0 = new jk3
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r7)
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.a = r1
            int r1 = r7.size()
            r2 = 2
            int r1 = r1 * r2
            long[] r1 = new long[r1]
            r0.b = r1
            r1 = 0
        L_0x03f0:
            int r3 = r7.size()
            if (r1 >= r3) goto L_0x040e
            java.lang.Object r3 = r7.get(r1)
            dmg r3 = (defpackage.dmg) r3
            int r4 = r1 * 2
            java.lang.Object r5 = r0.b
            long[] r5 = (long[]) r5
            long r8 = r3.b
            r5[r4] = r8
            r6 = 1
            int r4 = r4 + r6
            long r8 = r3.c
            r5[r4] = r8
            int r1 = r1 + r6
            goto L_0x03f0
        L_0x040e:
            java.lang.Object r1 = r0.b
            long[] r1 = (long[]) r1
            int r2 = r1.length
            long[] r1 = java.util.Arrays.copyOf(r1, r2)
            r0.c = r1
            java.util.Arrays.sort(r1)
            return r0
        L_0x041d:
            r0 = move-exception
            r1 = r0
            com.google.android.exoplayer2.text.SubtitleDecoderException r0 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.omg.a(int, byte[], boolean):uye");
    }
}
