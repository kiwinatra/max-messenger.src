package defpackage;

/* renamed from: glb  reason: default package */
public final class glb implements ds5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ds5 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ glb(ds5 ds5, Object obj, int i) {
        this.a = i;
        this.b = ds5;
        this.c = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: mmd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v43, types: [uyf, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x042b  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0437  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x04b8  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0548  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x054a  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x0580  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x058c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:325:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:331:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x018d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r20, kotlin.coroutines.Continuation r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = 3
            r5 = 2
            r6 = 0
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r8 = 1
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            int r10 = r0.a
            switch(r10) {
                case 0: goto L_0x0560;
                case 1: goto L_0x046a;
                case 2: goto L_0x040b;
                case 3: goto L_0x0370;
                case 4: goto L_0x02f0;
                case 5: goto L_0x029c;
                case 6: goto L_0x020e;
                case 7: goto L_0x0195;
                case 8: goto L_0x00b6;
                case 9: goto L_0x006f;
                default: goto L_0x0013;
            }
        L_0x0013:
            boolean r3 = r2 instanceof defpackage.ahf
            if (r3 == 0) goto L_0x0024
            r3 = r2
            ahf r3 = (defpackage.ahf) r3
            int r4 = r3.b
            r6 = r4 & r9
            if (r6 == 0) goto L_0x0024
            int r4 = r4 - r9
            r3.b = r4
            goto L_0x0029
        L_0x0024:
            ahf r3 = new ahf
            r3.<init>(r0, r2)
        L_0x0029:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r3.b
            if (r6 == 0) goto L_0x003f
            if (r6 != r8) goto L_0x0039
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x006c
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Object r2 = r0.c
            bhf r2 = (defpackage.bhf) r2
            android.widget.TextView r2 = r2.b
            r2.getContext()
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r1 = android.util.TypedValue.applyDimension(r5, r1, r2)
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r1)
            r3.b = r8
            ds5 r0 = r0.b
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x006e:
            return r4
        L_0x006f:
            boolean r3 = r2 instanceof defpackage.i5f
            if (r3 == 0) goto L_0x0080
            r3 = r2
            i5f r3 = (defpackage.i5f) r3
            int r4 = r3.b
            r5 = r4 & r9
            if (r5 == 0) goto L_0x0080
            int r4 = r4 - r9
            r3.b = r4
            goto L_0x0085
        L_0x0080:
            i5f r3 = new i5f
            r3.<init>(r0, r2)
        L_0x0085:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            if (r5 == 0) goto L_0x009b
            if (r5 != r8) goto L_0x0095
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x00b3
        L_0x0095:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x009b:
            kotlin.ResultKt.throwOnFailure(r2)
            qf9 r1 = (defpackage.qf9) r1
            java.lang.Object r2 = r0.c
            l5f r2 = (defpackage.l5f) r2
            kxf r1 = defpackage.l5f.a(r2, r1)
            r3.b = r8
            ds5 r0 = r0.b
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x00b3
            goto L_0x00b5
        L_0x00b3:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x00b5:
            return r4
        L_0x00b6:
            boolean r3 = r2 instanceof defpackage.x4f
            if (r3 == 0) goto L_0x00c7
            r3 = r2
            x4f r3 = (defpackage.x4f) r3
            int r5 = r3.b
            r10 = r5 & r9
            if (r10 == 0) goto L_0x00c7
            int r5 = r5 - r9
            r3.b = r5
            goto L_0x00cc
        L_0x00c7:
            x4f r3 = new x4f
            r3.<init>(r0, r2)
        L_0x00cc:
            java.lang.Object r2 = r3.a
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r9 = r3.b
            if (r9 == 0) goto L_0x00e3
            if (r9 != r8) goto L_0x00dd
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x018a
        L_0x00dd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x00e3:
            kotlin.ResultKt.throwOnFailure(r2)
            nyf r1 = (defpackage.nyf) r1
            float r2 = r1.a
            r7 = 1120403456(0x42c80000, float:100.0)
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x00f2
            r2 = r8
            goto L_0x00f3
        L_0x00f2:
            r2 = 0
        L_0x00f3:
            java.lang.Object r7 = r0.c
            bxf r7 = (defpackage.bxf) r7
            kxf r9 = r7.a
            xyf r9 = r9.c
            if (r2 == 0) goto L_0x013a
            r9.getClass()
            xyf r10 = defpackage.xyf.PHOTO
            if (r9 != r10) goto L_0x0105
            goto L_0x0116
        L_0x0105:
            boolean r10 = r9.a()
            if (r10 != 0) goto L_0x0116
            xyf r10 = defpackage.xyf.EXTERNAL_GIF
            if (r9 != r10) goto L_0x0110
            goto L_0x0116
        L_0x0110:
            boolean r9 = r9.b()
            if (r9 == 0) goto L_0x013a
        L_0x0116:
            java.lang.String r9 = r1.c
            if (r9 == 0) goto L_0x0123
            int r10 = r9.length()
            if (r10 != 0) goto L_0x0121
            goto L_0x0123
        L_0x0121:
            r4 = 0
            goto L_0x0124
        L_0x0123:
            r4 = r8
        L_0x0124:
            r4 = r4 ^ r8
            if (r4 == 0) goto L_0x0128
            goto L_0x0129
        L_0x0128:
            r9 = r6
        L_0x0129:
            if (r9 == 0) goto L_0x0138
            uyf r4 = new uyf
            r4.<init>()
            r4.a = r9
            vyf r9 = new vyf
            r9.<init>(r4)
            goto L_0x013c
        L_0x0138:
            r9 = r6
            goto L_0x013c
        L_0x013a:
            vyf r9 = r7.h
        L_0x013c:
            r10 = 0
            if (r2 == 0) goto L_0x015f
            if (r9 == 0) goto L_0x0144
            java.lang.String r6 = r9.a
        L_0x0144:
            if (r6 == 0) goto L_0x014c
            int r4 = r6.length()
            if (r4 != 0) goto L_0x015f
        L_0x014c:
            if (r9 == 0) goto L_0x0151
            long r12 = r9.b
            goto L_0x0152
        L_0x0151:
            r12 = r10
        L_0x0152:
            int r4 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r4 <= 0) goto L_0x0157
            goto L_0x015f
        L_0x0157:
            one.me.sdk.transfer.domain.UploadException r0 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r1 = "upload failed. token and attachId are empty"
            r0.<init>(r1)
            throw r0
        L_0x015f:
            long r12 = r1.b
            int r4 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x018d
            axf r4 = r7.b()
            r4.h = r9
            if (r2 == 0) goto L_0x0170
            wyf r2 = defpackage.wyf.UPLOADED
            goto L_0x0172
        L_0x0170:
            wyf r2 = defpackage.wyf.UPLOADING
        L_0x0172:
            r4.g = r2
            float r1 = r1.a
            r4.e = r1
            r4.f = r12
            bxf r1 = new bxf
            r1.<init>(r4)
            r3.b = r8
            ds5 r0 = r0.b
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r5) goto L_0x018a
            goto L_0x018c
        L_0x018a:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
        L_0x018c:
            return r5
        L_0x018d:
            one.me.sdk.transfer.domain.UploadException r0 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r1 = "upload failed. file has zero size"
            r0.<init>(r1)
            throw r0
        L_0x0195:
            boolean r3 = r2 instanceof defpackage.yve
            if (r3 == 0) goto L_0x01a6
            r3 = r2
            yve r3 = (defpackage.yve) r3
            int r5 = r3.b
            r6 = r5 & r9
            if (r6 == 0) goto L_0x01a6
            int r5 = r5 - r9
            r3.b = r5
            goto L_0x01ab
        L_0x01a6:
            yve r3 = new yve
            r3.<init>(r0, r2)
        L_0x01ab:
            java.lang.Object r2 = r3.a
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r3.b
            if (r6 == 0) goto L_0x01c1
            if (r6 != r8) goto L_0x01bb
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x020b
        L_0x01bb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x01c1:
            kotlin.ResultKt.throwOnFailure(r2)
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r2 = r1.component1()
            bqe r2 = (defpackage.bqe) r2
            java.lang.Object r1 = r1.component2()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            sve r6 = new sve
            java.lang.String r7 = r2.b
            if (r7 != 0) goto L_0x01da
            java.lang.String r7 = ""
        L_0x01da:
            mgf r9 = new mgf
            r9.<init>(r7)
            java.util.List r7 = r2.h
            if (r7 == 0) goto L_0x01e8
            int r4 = r7.size()
            goto L_0x01e9
        L_0x01e8:
            r4 = 0
        L_0x01e9:
            kotlin.reflect.KProperty[] r7 = defpackage.gwe.B0
            java.lang.Object r7 = r0.c
            gwe r7 = (defpackage.gwe) r7
            java.lang.String r4 = r7.l(r4)
            boolean r1 = r1.booleanValue()
            java.util.List r1 = r7.j(r1)
            java.lang.String r2 = r2.g
            r6.<init>(r9, r4, r2, r1)
            r3.b = r8
            ds5 r0 = r0.b
            java.lang.Object r0 = r0.a(r6, r3)
            if (r0 != r5) goto L_0x020b
            goto L_0x020d
        L_0x020b:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
        L_0x020d:
            return r5
        L_0x020e:
            boolean r4 = r2 instanceof defpackage.cue
            if (r4 == 0) goto L_0x021f
            r4 = r2
            cue r4 = (defpackage.cue) r4
            int r5 = r4.b
            r10 = r5 & r9
            if (r10 == 0) goto L_0x021f
            int r5 = r5 - r9
            r4.b = r5
            goto L_0x0224
        L_0x021f:
            cue r4 = new cue
            r4.<init>(r0, r2)
        L_0x0224:
            java.lang.Object r2 = r4.a
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r9 = r4.b
            if (r9 == 0) goto L_0x023a
            if (r9 != r8) goto L_0x0234
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0299
        L_0x0234:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x023a:
            kotlin.ResultKt.throwOnFailure(r2)
            ds5 r2 = r0.b
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r7 = r0.c
            due r7 = (defpackage.due) r7
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            a67 r9 = defpackage.z68.b
            if (r9 != 0) goto L_0x0252
            goto L_0x0267
        L_0x0252:
            boolean r10 = r9.c()
            if (r10 == 0) goto L_0x0267
            w78 r10 = defpackage.w78.o
            int r11 = r1.size()
            java.lang.String r12 = "Sets loader. Sections, size:"
            java.lang.String r11 = defpackage.wj6.h(r11, r12)
            r9.d(r10, r7, r11, r6)
        L_0x0267:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x026d:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x0290
            java.lang.Object r7 = r1.next()
            r9 = r7
            mmd r9 = (defpackage.mmd) r9
            java.lang.Object r10 = r0.c
            due r10 = (defpackage.due) r10
            r10.getClass()
            int r10 = r9.a
            if (r10 != r3) goto L_0x026d
            java.lang.String r9 = r9.b
            java.lang.String r10 = "NEW_STICKER_SETS"
            boolean r9 = kotlin.text.StringsKt__StringsJVMKt.equals(r9, r10, true)
            if (r9 == 0) goto L_0x026d
            r6 = r7
        L_0x0290:
            r4.b = r8
            java.lang.Object r0 = r2.a(r6, r4)
            if (r0 != r5) goto L_0x0299
            goto L_0x029b
        L_0x0299:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
        L_0x029b:
            return r5
        L_0x029c:
            boolean r3 = r2 instanceof defpackage.ike
            if (r3 == 0) goto L_0x02ad
            r3 = r2
            ike r3 = (defpackage.ike) r3
            int r4 = r3.b
            r5 = r4 & r9
            if (r5 == 0) goto L_0x02ad
            int r4 = r4 - r9
            r3.b = r4
            goto L_0x02b2
        L_0x02ad:
            ike r3 = new ike
            r3.<init>(r0, r2)
        L_0x02b2:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            if (r5 == 0) goto L_0x02c8
            if (r5 != r8) goto L_0x02c2
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x02ed
        L_0x02c2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x02c8:
            kotlin.ResultKt.throwOnFailure(r2)
            r2 = r1
            xy2 r2 = (defpackage.xy2) r2
            java.util.Collection r2 = r2.b
            java.lang.Object r5 = r0.c
            pje r5 = (defpackage.pje) r5
            lje r5 = (defpackage.lje) r5
            long r5 = r5.a
            java.lang.Long r5 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r5)
            boolean r2 = r2.contains(r5)
            if (r2 == 0) goto L_0x02ed
            r3.b = r8
            ds5 r0 = r0.b
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x02ed
            goto L_0x02ef
        L_0x02ed:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x02ef:
            return r4
        L_0x02f0:
            boolean r3 = r2 instanceof defpackage.jee
            if (r3 == 0) goto L_0x0301
            r3 = r2
            jee r3 = (defpackage.jee) r3
            int r4 = r3.b
            r5 = r4 & r9
            if (r5 == 0) goto L_0x0301
            int r4 = r4 - r9
            r3.b = r4
            goto L_0x0306
        L_0x0301:
            jee r3 = new jee
            r3.<init>(r0, r2)
        L_0x0306:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            if (r5 == 0) goto L_0x031c
            if (r5 != r8) goto L_0x0316
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x036d
        L_0x0316:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x031c:
            kotlin.ResultKt.throwOnFailure(r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0362
            int r2 = r1.length()
            if (r2 != 0) goto L_0x032a
            goto L_0x0362
        L_0x032a:
            java.lang.Object r2 = r0.c
            kee r2 = (defpackage.kee) r2
            etc r5 = r2.l
            ome r5 = r5.a
            java.lang.Object r5 = r5.getValue()
            java.util.List r5 = (java.util.List) r5
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0343:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0362
            java.lang.Object r7 = r5.next()
            r9 = r7
            vk3 r9 = (defpackage.vk3) r9
            kotlin.Lazy r10 = r2.g
            java.lang.Object r10 = r10.getValue()
            tld r10 = (defpackage.tld) r10
            boolean r9 = r10.g(r9, r1)
            if (r9 == 0) goto L_0x0343
            r6.add(r7)
            goto L_0x0343
        L_0x0362:
            r3.b = r8
            ds5 r0 = r0.b
            java.lang.Object r0 = r0.a(r6, r3)
            if (r0 != r4) goto L_0x036d
            goto L_0x036f
        L_0x036d:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x036f:
            return r4
        L_0x0370:
            boolean r3 = r2 instanceof defpackage.x8e
            if (r3 == 0) goto L_0x0381
            r3 = r2
            x8e r3 = (defpackage.x8e) r3
            int r4 = r3.b
            r10 = r4 & r9
            if (r10 == 0) goto L_0x0381
            int r4 = r4 - r9
            r3.b = r4
            goto L_0x0386
        L_0x0381:
            x8e r3 = new x8e
            r3.<init>(r0, r2)
        L_0x0386:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r9 = r3.b
            if (r9 == 0) goto L_0x03a5
            if (r9 == r8) goto L_0x039f
            if (r9 != r5) goto L_0x0399
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0408
        L_0x0399:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x039f:
            ds5 r0 = r3.c
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x03fd
        L_0x03a5:
            kotlin.ResultKt.throwOnFailure(r2)
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x03b0:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x03cc
            java.lang.Object r2 = r1.next()
            r7 = r2
            mmd r7 = (defpackage.mmd) r7
            int r9 = r7.a
            if (r9 != r5) goto L_0x03b0
            java.lang.String r7 = r7.b
            java.lang.String r9 = "TOP"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r9)
            if (r7 == 0) goto L_0x03b0
            goto L_0x03cd
        L_0x03cc:
            r2 = r6
        L_0x03cd:
            boolean r1 = r2 instanceof defpackage.vte
            if (r1 == 0) goto L_0x03d4
            vte r2 = (defpackage.vte) r2
            goto L_0x03d5
        L_0x03d4:
            r2 = r6
        L_0x03d5:
            if (r2 == 0) goto L_0x03dc
            java.util.ArrayList r1 = r2.o
            if (r1 == 0) goto L_0x03dc
            goto L_0x03e0
        L_0x03dc:
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        L_0x03e0:
            java.lang.Object r2 = r0.c
            z8e r2 = (defpackage.z8e) r2
            kotlin.Lazy r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            moe r2 = (defpackage.moe) r2
            wbe r1 = r2.e(r1)
            ds5 r0 = r0.b
            r3.c = r0
            r3.b = r8
            java.lang.Object r2 = defpackage.bs0.f(r1, r3)
            if (r2 != r4) goto L_0x03fd
            goto L_0x040a
        L_0x03fd:
            r3.c = r6
            r3.b = r5
            java.lang.Object r0 = r0.a(r2, r3)
            if (r0 != r4) goto L_0x0408
            goto L_0x040a
        L_0x0408:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x040a:
            return r4
        L_0x040b:
            boolean r3 = r2 instanceof defpackage.uxc
            if (r3 == 0) goto L_0x041c
            r3 = r2
            uxc r3 = (defpackage.uxc) r3
            int r4 = r3.b
            r5 = r4 & r9
            if (r5 == 0) goto L_0x041c
            int r4 = r4 - r9
            r3.b = r4
            goto L_0x0421
        L_0x041c:
            uxc r3 = new uxc
            r3.<init>(r0, r2)
        L_0x0421:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            if (r5 == 0) goto L_0x0437
            if (r5 != r8) goto L_0x0431
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0467
        L_0x0431:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0437:
            kotlin.ResultKt.throwOnFailure(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            java.lang.Object r2 = r0.c
            vxc r2 = (defpackage.vxc) r2
            kotlin.Lazy r5 = r2.o
            java.lang.Object r5 = r5.getValue()
            hl1 r5 = (defpackage.hl1) r5
            ph1 r2 = r2.c
            jj1 r2 = (defpackage.jj1) r2
            etc r2 = r2.C0
            ome r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            k91 r2 = (defpackage.k91) r2
            li1 r2 = r2.j
            java.lang.String r1 = r5.g(r1, r2)
            r3.b = r8
            ds5 r0 = r0.b
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x0467
            goto L_0x0469
        L_0x0467:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x0469:
            return r4
        L_0x046a:
            boolean r10 = r2 instanceof defpackage.lyb
            if (r10 == 0) goto L_0x047b
            r10 = r2
            lyb r10 = (defpackage.lyb) r10
            int r11 = r10.b
            r12 = r11 & r9
            if (r12 == 0) goto L_0x047b
            int r11 = r11 - r9
            r10.b = r11
            goto L_0x0480
        L_0x047b:
            lyb r10 = new lyb
            r10.<init>(r0, r2)
        L_0x0480:
            java.lang.Object r2 = r10.a
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r11 = r10.b
            if (r11 == 0) goto L_0x04b8
            if (r11 == r8) goto L_0x04aa
            if (r11 == r5) goto L_0x049b
            if (r11 != r3) goto L_0x0495
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x055d
        L_0x0495:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x049b:
            ds5 r0 = r10.v
            glb r1 = r10.c
            kotlin.ResultKt.throwOnFailure(r2)
            r18 = r2
            r2 = r0
            r0 = r1
            r1 = r18
            goto L_0x0523
        L_0x04aa:
            ds5 r0 = r10.v
            glb r1 = r10.c
            kotlin.ResultKt.throwOnFailure(r2)
            r18 = r2
            r2 = r0
            r0 = r1
            r1 = r18
            goto L_0x0508
        L_0x04b8:
            kotlin.ResultKt.throwOnFailure(r2)
            r14 = r1
            cyb r14 = (defpackage.cyb) r14
            kotlin.reflect.KProperty[] r1 = defpackage.syb.C0
            java.lang.Object r1 = r0.c
            syb r1 = (defpackage.syb) r1
            vk3 r12 = r1.m()
            ds5 r2 = r0.b
            if (r12 != 0) goto L_0x04d3
            iyb r0 = new iyb
            r0.<init>()
            goto L_0x054f
        L_0x04d3:
            a32 r13 = r1.l()
            if (r13 != 0) goto L_0x04e0
            iyb r0 = new iyb
            r0.<init>()
            goto L_0x054f
        L_0x04e0:
            long r3 = r12.r()
            java.lang.Long r16 = r13.e(r3)
            boolean r3 = r13.K()
            kotlin.Lazy r4 = r1.y
            if (r3 == 0) goto L_0x050b
            java.lang.Object r3 = r4.getValue()
            r11 = r3
            lwb r11 = (defpackage.lwb) r11
            r10.c = r0
            r10.v = r2
            r10.b = r8
            eyb r15 = r1.o
            r17 = r10
            java.lang.Object r1 = r11.a(r12, r13, r14, r15, r16, r17)
            if (r1 != r9) goto L_0x0508
            goto L_0x055f
        L_0x0508:
            java.util.List r1 = (java.util.List) r1
            goto L_0x0525
        L_0x050b:
            java.lang.Object r3 = r4.getValue()
            r11 = r3
            lwb r11 = (defpackage.lwb) r11
            r10.c = r0
            r10.v = r2
            r10.b = r5
            eyb r15 = r1.o
            r17 = r10
            java.lang.Object r1 = r11.b(r12, r13, r14, r15, r16, r17)
            if (r1 != r9) goto L_0x0523
            goto L_0x055f
        L_0x0523:
            java.util.List r1 = (java.util.List) r1
        L_0x0525:
            iyb r3 = new iyb
            java.lang.Object r4 = r0.c
            syb r4 = (defpackage.syb) r4
            eyb r5 = r4.o
            eyb r7 = defpackage.eyb.SETUP_NEW_ADMIN
            if (r5 == r7) goto L_0x054a
            xme r4 = r4.v0
            java.lang.Object r4 = r4.getValue()
            java.lang.Object r0 = r0.c
            syb r0 = (defpackage.syb) r0
            xme r0 = r0.Z
            java.lang.Object r0 = r0.getValue()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r0)
            if (r0 != 0) goto L_0x0548
            goto L_0x054a
        L_0x0548:
            r4 = 0
            goto L_0x054b
        L_0x054a:
            r4 = r8
        L_0x054b:
            r3.<init>(r1, r4)
            r0 = r3
        L_0x054f:
            r10.c = r6
            r10.v = r6
            r1 = 3
            r10.b = r1
            java.lang.Object r0 = r2.a(r0, r10)
            if (r0 != r9) goto L_0x055d
            goto L_0x055f
        L_0x055d:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
        L_0x055f:
            return r9
        L_0x0560:
            boolean r3 = r2 instanceof defpackage.flb
            if (r3 == 0) goto L_0x0571
            r3 = r2
            flb r3 = (defpackage.flb) r3
            int r4 = r3.b
            r5 = r4 & r9
            if (r5 == 0) goto L_0x0571
            int r4 = r4 - r9
            r3.b = r4
            goto L_0x0576
        L_0x0571:
            flb r3 = new flb
            r3.<init>(r0, r2)
        L_0x0576:
            java.lang.Object r2 = r3.a
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.b
            if (r5 == 0) goto L_0x058c
            if (r5 != r8) goto L_0x0586
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x05b6
        L_0x0586:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x058c:
            kotlin.ResultKt.throwOnFailure(r2)
            r2 = r1
            java.lang.Number r2 = (java.lang.Number) r2
            r2.floatValue()
            int r2 = one.me.pinbars.PinBarsWidget.x
            java.lang.Object r2 = r0.c
            one.me.pinbars.PinBarsWidget r2 = (one.me.pinbars.PinBarsWidget) r2
            blb r2 = r2.c0()
            etc r2 = r2.X
            ome r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            boolean r2 = r2 instanceof defpackage.mr9
            if (r2 == 0) goto L_0x05b6
            r3.b = r8
            ds5 r0 = r0.b
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x05b6
            goto L_0x05b8
        L_0x05b6:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x05b8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.glb.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
