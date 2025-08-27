package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: eu4  reason: default package */
public final class eu4 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ fu4 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ CharSequence o;
    public final /* synthetic */ Long v;
    public final /* synthetic */ Long w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eu4(fu4 fu4, long j, CharSequence charSequence, Long l, Long l2, Continuation continuation) {
        super(2, continuation);
        this.b = fu4;
        this.c = j;
        this.o = charSequence;
        this.v = l;
        this.w = l2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new eu4(this.b, this.c, this.o, this.v, this.w, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((eu4) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: android.text.SpannableString} */
    /* JADX WARNING: type inference failed for: r1v20, types: [java.lang.CharSequence] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            r35 = this;
            r0 = r35
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.a
            r3 = 1
            r4 = 3
            r5 = 2
            r6 = 4
            if (r2 == 0) goto L_0x0032
            if (r2 == r3) goto L_0x002d
            if (r2 == r5) goto L_0x0028
            if (r2 == r4) goto L_0x0023
            if (r2 != r6) goto L_0x001b
            kotlin.ResultKt.throwOnFailure(r36)
            goto L_0x03ce
        L_0x001b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0023:
            kotlin.ResultKt.throwOnFailure(r36)
            goto L_0x03ae
        L_0x0028:
            kotlin.ResultKt.throwOnFailure(r36)
            goto L_0x0386
        L_0x002d:
            kotlin.ResultKt.throwOnFailure(r36)
            goto L_0x03e0
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r36)
            fu4 r2 = r0.b
            java.lang.Object r7 = r2.g
            kotlin.Lazy r7 = (kotlin.Lazy) r7
            java.lang.Object r7 = r7.getValue()
            bud r7 = (defpackage.bud) r7
            akd r7 = (defpackage.akd) r7
            boolean r7 = r7.w()
            java.lang.CharSequence r8 = r0.o
            java.lang.String r9 = defpackage.cvg.G(r8)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "start save and upload chatId:"
            r10.<init>(r11)
            long r11 = r0.c
            r10.append(r11)
            java.lang.String r13 = ", text:"
            r10.append(r13)
            r10.append(r9)
            java.lang.String r9 = ", editId:"
            r10.append(r9)
            java.lang.Long r9 = r0.v
            r10.append(r9)
            java.lang.String r13 = ", replyId:"
            r10.append(r13)
            java.lang.Long r13 = r0.w
            r10.append(r13)
            java.lang.String r14 = ", syncEn:"
            r10.append(r14)
            r10.append(r7)
            java.lang.String r10 = r10.toString()
            java.lang.Object r14 = r2.b
            java.lang.String r14 = (java.lang.String) r14
            defpackage.z68.c(r14, r10, new java.lang.Object[0])
            java.lang.Object r10 = r2.e
            kotlin.Lazy r10 = (kotlin.Lazy) r10
            java.lang.Object r15 = r10.getValue()
            qx2 r15 = (defpackage.qx2) r15
            my2 r15 = (defpackage.my2) r15
            etc r15 = r15.o(r11)
            ome r15 = r15.a
            java.lang.Object r15 = r15.getValue()
            a32 r15 = (defpackage.a32) r15
            if (r15 != 0) goto L_0x00a5
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00a5:
            r16 = 0
            if (r8 == 0) goto L_0x00ae
            java.lang.CharSequence r8 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r8)
            goto L_0x00b0
        L_0x00ae:
            r8 = r16
        L_0x00b0:
            if (r8 == 0) goto L_0x00b8
            int r17 = r8.length()
            if (r17 != 0) goto L_0x00c2
        L_0x00b8:
            r19 = r1
            r22 = r7
            r18 = r10
            r20 = r11
            goto L_0x025e
        L_0x00c2:
            boolean r6 = r8 instanceof android.text.Spannable
            if (r6 != 0) goto L_0x00e7
            ur7 r6 = new ur7
            java.lang.String r8 = r8.toString()
            java.lang.CharSequence r8 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r8)
            java.lang.String r8 = r8.toString()
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            r6.<init>(r8, r4)
            r19 = r1
            r26 = r6
            r22 = r7
            r18 = r10
            r20 = r11
            goto L_0x0286
        L_0x00e7:
            android.text.Spannable r8 = (android.text.Spannable) r8
            java.lang.Object r4 = r2.a
            kotlin.Lazy r4 = (kotlin.Lazy) r4
            java.lang.Object r4 = r4.getValue()
            m95 r4 = (defpackage.m95) r4
            if (r4 == 0) goto L_0x00fd
            jkb r6 = new jkb
            r5 = 28
            r6.<init>((int) r5, (java.lang.Object) r4)
            goto L_0x00ff
        L_0x00fd:
            r6 = r16
        L_0x00ff:
            int r4 = r8.length()
            if (r4 != 0) goto L_0x010f
        L_0x0105:
            r19 = r1
            r22 = r7
            r18 = r10
            r20 = r11
            goto L_0x0258
        L_0x010f:
            java.lang.CharSequence r4 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r8)
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0121
            android.text.SpannableString r8 = new android.text.SpannableString
            java.lang.String r4 = ""
            r8.<init>(r4)
            goto L_0x0105
        L_0x0121:
            android.text.SpannableString r4 = new android.text.SpannableString
            r4.<init>(r8)
            int r5 = r4.length()
            char[] r8 = new char[r5]
            r3 = 0
            r4.getChars(r3, r5, r8, r3)
            char r18 = r8[r3]
            boolean r18 = java.lang.Character.isSpaceChar(r18)
            r19 = r1
            r1 = 10
            r20 = r11
            if (r18 != 0) goto L_0x0145
            char r11 = r8[r3]
            if (r11 != r1) goto L_0x0143
            goto L_0x0145
        L_0x0143:
            r11 = r3
            goto L_0x0157
        L_0x0145:
            r11 = r3
        L_0x0146:
            if (r11 >= r5) goto L_0x0157
            char r12 = r8[r11]
            boolean r12 = java.lang.Character.isSpaceChar(r12)
            if (r12 != 0) goto L_0x0154
            char r12 = r8[r11]
            if (r12 != r1) goto L_0x0157
        L_0x0154:
            int r11 = r11 + 1
            goto L_0x0146
        L_0x0157:
            int r12 = r5 + -1
            char r18 = r8[r12]
            boolean r18 = java.lang.Character.isSpaceChar(r18)
            if (r18 != 0) goto L_0x0168
            char r12 = r8[r12]
            if (r12 != r1) goto L_0x0166
            goto L_0x0168
        L_0x0166:
            r3 = r5
            goto L_0x017d
        L_0x0168:
            r3 = r5
        L_0x0169:
            r12 = 1
            if (r3 <= r12) goto L_0x017d
            int r12 = r3 + -1
            char r18 = r8[r12]
            boolean r18 = java.lang.Character.isSpaceChar(r18)
            if (r18 != 0) goto L_0x017a
            char r12 = r8[r12]
            if (r12 != r1) goto L_0x017d
        L_0x017a:
            int r3 = r3 + -1
            goto L_0x0169
        L_0x017d:
            if (r11 != 0) goto L_0x0188
            if (r3 != r5) goto L_0x0188
            r8 = r4
        L_0x0182:
            r22 = r7
            r18 = r10
            goto L_0x0258
        L_0x0188:
            java.lang.CharSequence r1 = r4.subSequence(r11, r3)
            r8 = r1
            android.text.SpannableString r8 = (android.text.SpannableString) r8
            int r1 = r8.length()
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r4 = 0
            java.lang.Object[] r1 = r8.getSpans(r4, r1, r3)
            java.util.Iterator r1 = kotlin.jvm.internal.ArrayIteratorKt.iterator(r1)
        L_0x019e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0182
            java.lang.Object r3 = r1.next()
            int r4 = r8.getSpanStart(r3)
            int r5 = r8.getSpanEnd(r3)
            int r11 = r8.length()
            java.lang.String r12 = ". \n                    |Span type = "
            r36 = r1
            java.lang.String r1 = " spanEnd "
            java.lang.String r0 = "  \n                    |spanStart = "
            if (r4 <= r11) goto L_0x0209
            r8.removeSpan(r3)
            if (r6 == 0) goto L_0x01fc
            ru.ok.tamtam.util.HandledException r11 = new ru.ok.tamtam.util.HandledException
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r18 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r22 = r7
            java.lang.String r7 = "trimSpannable(remove span): For spannable = "
            r10.<init>(r7)
            r10.append(r8)
            r10.append(r0)
            r10.append(r4)
            r10.append(r1)
            r10.append(r5)
            r10.append(r12)
            r10.append(r3)
            java.lang.String r0 = r10.toString()
            java.lang.String r0 = kotlin.text.StringsKt__IndentKt.trimMargin$default(r0, (java.lang.String) null, 1, (java.lang.Object) null)
            r11.<init>(r0)
            r6.invoke(r11)
            goto L_0x0200
        L_0x01fc:
            r22 = r7
            r18 = r10
        L_0x0200:
            r0 = r35
            r1 = r36
            r10 = r18
            r7 = r22
            goto L_0x019e
        L_0x0209:
            r22 = r7
            r18 = r10
            int r7 = r8.length()
            if (r5 <= r7) goto L_0x0200
            int r7 = r8.getSpanFlags(r3)
            r8.removeSpan(r3)
            int r10 = r8.length()
            r8.setSpan(r3, r4, r10, r7)
            if (r6 == 0) goto L_0x0200
            ru.ok.tamtam.util.HandledException r7 = new ru.ok.tamtam.util.HandledException
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "trimSpannable(change range): For spannable = "
            r10.<init>(r11)
            r10.append(r8)
            r10.append(r0)
            r10.append(r4)
            r10.append(r1)
            r10.append(r5)
            r10.append(r12)
            r10.append(r3)
            java.lang.String r0 = r10.toString()
            java.lang.String r0 = kotlin.text.StringsKt__IndentKt.trimMargin$default(r0, (java.lang.String) null, 1, (java.lang.Object) null)
            r7.<init>(r0)
            r6.invoke(r7)
            goto L_0x0200
        L_0x0258:
            int r0 = r8.length()
            if (r0 != 0) goto L_0x0261
        L_0x025e:
            r26 = r16
            goto L_0x0286
        L_0x0261:
            java.lang.Object r0 = r2.i
            kotlin.Lazy r0 = (kotlin.Lazy) r0
            java.lang.Object r0 = r0.getValue()
            ar6 r0 = (defpackage.ar6) r0
            java.util.List r0 = r0.a(r15, r8)
            java.lang.String r1 = r8.toString()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x027d
            r0 = r16
        L_0x027d:
            java.util.List r0 = (java.util.List) r0
            ur7 r6 = new ur7
            r6.<init>(r1, r0)
            r26 = r6
        L_0x0286:
            m72 r0 = r15.b
            pt4 r1 = r0.f0
            boolean r3 = r1 instanceof defpackage.mta
            if (r3 == 0) goto L_0x0291
            mta r1 = (defpackage.mta) r1
            goto L_0x0293
        L_0x0291:
            r1 = r16
        L_0x0293:
            long r3 = r0.a
            java.lang.Long r3 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r3)
            long r4 = r3.longValue()
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x02a4
            goto L_0x02a6
        L_0x02a4:
            r3 = r16
        L_0x02a6:
            if (r3 == 0) goto L_0x02af
            long r3 = r3.longValue()
        L_0x02ac:
            r24 = r3
            goto L_0x02b2
        L_0x02af:
            long r3 = r0.l
            goto L_0x02ac
        L_0x02b2:
            if (r13 != 0) goto L_0x02b5
            goto L_0x02c0
        L_0x02b5:
            long r3 = r13.longValue()
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x02c0
            r27 = r16
            goto L_0x02c2
        L_0x02c0:
            r27 = r13
        L_0x02c2:
            if (r9 != 0) goto L_0x02c5
            goto L_0x02d0
        L_0x02c5:
            long r3 = r9.longValue()
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x02d0
            r28 = r16
            goto L_0x02d2
        L_0x02d0:
            r28 = r9
        L_0x02d2:
            mta r3 = new mta
            r29 = 0
            r31 = 112(0x70, float:1.57E-43)
            r30 = 0
            r23 = r3
            r23.<init>((long) r24, (defpackage.ur7) r26, (java.lang.Long) r27, (java.lang.Long) r28, (java.lang.Long) r29, (boolean) r30, (int) r31)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r1)
            if (r1 == 0) goto L_0x02ed
            java.lang.String r0 = "Old draft equals new draft"
            defpackage.z68.c(r14, r0, new java.lang.Object[0])
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x02ed:
            boolean r1 = r3.d()
            java.lang.Object r4 = r2.c
            d23 r4 = (defpackage.d23) r4
            if (r1 != 0) goto L_0x0304
            java.lang.Long r1 = r3.c
            ur7 r5 = r3.b
            if (r1 == 0) goto L_0x030c
            boolean r1 = defpackage.ev0.t(r5)
            if (r1 != 0) goto L_0x0304
            goto L_0x030c
        L_0x0304:
            r0 = r35
            r1 = r19
            r8 = r20
            goto L_0x03d1
        L_0x030c:
            java.lang.Long r1 = r3.d
            if (r1 == 0) goto L_0x0317
            boolean r1 = defpackage.ev0.t(r5)
            if (r1 == 0) goto L_0x0317
            goto L_0x0304
        L_0x0317:
            java.lang.String r1 = "Old draft NOT equals new draft and new draft is not empty. Start saving"
            defpackage.z68.c(r14, r1, new java.lang.Object[0])
            java.lang.Object r1 = r2.f
            kotlin.Lazy r1 = (kotlin.Lazy) r1
            java.lang.Object r8 = r1.getValue()
            x23 r8 = (defpackage.x23) r8
            a33 r8 = (defpackage.a33) r8
            java.lang.String r10 = "app.draftsChanged"
            r11 = 1
            r8.i(r10, r11)
            if (r22 != 0) goto L_0x033f
            java.lang.Object r0 = r1.getValue()
            x23 r0 = (defpackage.x23) r0
            qjd r0 = (defpackage.qjd) r0
            long r0 = r0.m()
        L_0x033c:
            r32 = r0
            goto L_0x0342
        L_0x033f:
            long r0 = r0.g0
            goto L_0x033c
        L_0x0342:
            java.lang.Object r0 = r18.getValue()
            qx2 r0 = (defpackage.qx2) r0
            my2 r0 = (defpackage.my2) r0
            r62 r29 = r0.n()
            long r0 = r15.a
            r30 = r0
            r34 = r3
            r29.n(r30, r32, r34)
            if (r22 != 0) goto L_0x0361
            java.lang.String r0 = "Drafts sync NOT enabled"
            defpackage.z68.c(r14, r0, new java.lang.Object[0])
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0361:
            if (r9 == 0) goto L_0x0389
            long r0 = r9.longValue()
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0389
            java.lang.String r0 = "we don't sync edit"
            defpackage.z68.c(r14, r0, new java.lang.Object[0])
            boolean r0 = defpackage.ev0.t(r5)
            if (r0 == 0) goto L_0x0386
            r1 = 2
            r0 = r35
            r0.a = r1
            r8 = r20
            java.lang.Object r0 = r4.n(r8, r0)
            r1 = r19
            if (r0 != r1) goto L_0x0386
            return r1
        L_0x0386:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0389:
            r0 = r35
            r1 = r19
            r8 = r20
            boolean r10 = defpackage.ev0.t(r5)
            if (r10 == 0) goto L_0x03b1
            if (r13 == 0) goto L_0x03b1
            long r10 = r13.longValue()
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x03b1
            java.lang.String r2 = "we don't sync empty text for replied message"
            defpackage.z68.c(r14, r2, new java.lang.Object[0])
            r2 = 3
            r0.a = r2
            java.lang.Object r0 = r4.n(r8, r0)
            if (r0 != r1) goto L_0x03ae
            return r1
        L_0x03ae:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x03b1:
            boolean r4 = defpackage.ev0.t(r5)
            if (r4 == 0) goto L_0x03bf
            java.lang.String r0 = "Drafts sync enabled. Draft has no text and no attaches. Do NOT send to server"
            defpackage.z68.c(r14, r0, new java.lang.Object[0])
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x03bf:
            java.lang.String r4 = "Drafts sync enabled. Send to server"
            defpackage.z68.c(r14, r4, new java.lang.Object[0])
            r4 = 4
            r0.a = r4
            java.lang.Object r0 = defpackage.fu4.b(r2, r8, r3, r0)
            if (r0 != r1) goto L_0x03ce
            return r1
        L_0x03ce:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x03d1:
            java.lang.String r2 = "new draft is empty"
            defpackage.z68.c(r14, r2, new java.lang.Object[0])
            r2 = 1
            r0.a = r2
            java.lang.Object r0 = r4.n(r8, r0)
            if (r0 != r1) goto L_0x03e0
            return r1
        L_0x03e0:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eu4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
