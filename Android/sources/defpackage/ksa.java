package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ksa  reason: default package */
public final class ksa extends SuspendLambda implements Function2 {
    public int X;
    public int Y;
    public final /* synthetic */ ie8 Z;
    public Object a;
    public Object b;
    public yc9 c;
    public oa9 o;
    public CharSequence v;
    public final /* synthetic */ msa v0;
    public String w;
    public String x;
    public int y;
    public int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ksa(ge8 ge8, msa msa, Continuation continuation) {
        super(2, continuation);
        this.Z = ge8;
        this.v0 = msa;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ksa((ge8) this.Z, this.v0, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ksa) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: bl5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: bl5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: o43} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: ede} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v41, resolved type: ybe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v52, resolved type: ede} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v8, resolved type: bl5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v9, resolved type: bl5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v13, resolved type: bl5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v90, resolved type: l50} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v14, resolved type: w4e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v15, resolved type: dl3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v16, resolved type: bl5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v17, resolved type: bl5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v112, resolved type: ede} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v17, resolved type: ede} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v21, resolved type: l50} */
    /* JADX WARNING: type inference failed for: r2v36 */
    /* JADX WARNING: type inference failed for: r0v16, types: [odf, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v89 */
    /* JADX WARNING: type inference failed for: r0v79 */
    /* JADX WARNING: type inference failed for: r0v90 */
    /* JADX WARNING: type inference failed for: r0v102 */
    /* JADX WARNING: type inference failed for: r32v24, types: [vp6] */
    /* JADX WARNING: type inference failed for: r32v25, types: [i01] */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0b09, code lost:
        if (r0.exists() == true) goto L_0x0a17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0c70, code lost:
        if (r6.a().b() == 0) goto L_0x0c9a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0c7f, code lost:
        if (r4.length() == 0) goto L_0x0c81;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0c98, code lost:
        if (r6.a().C() != false) goto L_0x0c9a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x0d9a, code lost:
        r5 = true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0490  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0497  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x04ac  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x04db  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x04e6  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x06fd  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0700  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x077c  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x079c  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x07a6  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x07ab  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x07cf  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x07d1  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x07de  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x093d  */
    /* JADX WARNING: Removed duplicated region for block: B:548:0x0cbc  */
    /* JADX WARNING: Removed duplicated region for block: B:549:0x0cc0  */
    /* JADX WARNING: Removed duplicated region for block: B:552:0x0ce6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:553:0x0ce7  */
    /* JADX WARNING: Removed duplicated region for block: B:560:0x0d24  */
    /* JADX WARNING: Removed duplicated region for block: B:561:0x0d27  */
    /* JADX WARNING: Removed duplicated region for block: B:564:0x0d4d  */
    /* JADX WARNING: Removed duplicated region for block: B:565:0x0d50  */
    /* JADX WARNING: Removed duplicated region for block: B:585:0x0db8  */
    /* JADX WARNING: Removed duplicated region for block: B:586:0x0dba  */
    /* JADX WARNING: Removed duplicated region for block: B:589:0x0dc5  */
    /* JADX WARNING: Removed duplicated region for block: B:591:0x0dca  */
    /* JADX WARNING: Removed duplicated region for block: B:607:0x0dff  */
    /* JADX WARNING: Removed duplicated region for block: B:632:0x0e50  */
    /* JADX WARNING: Removed duplicated region for block: B:638:0x095a A[EDGE_INSN: B:638:0x095a->B:400:0x095a ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r68) {
        /*
            r67 = this;
            r0 = r67
            r1 = 0
            r2 = 1
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r0.Y
            xz r18 = defpackage.xz.f
            java.lang.String r7 = "Required value was null."
            r10 = 2
            msa r11 = r0.v0
            ie8 r12 = r0.Z
            if (r4 == 0) goto L_0x0066
            if (r4 == r2) goto L_0x0055
            if (r4 != r10) goto L_0x004d
            int r3 = r0.X
            int r4 = r0.z
            int r6 = r0.y
            java.lang.String r8 = r0.x
            java.lang.String r9 = r0.w
            java.lang.CharSequence r11 = r0.v
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            oa9 r13 = r0.o
            yc9 r14 = r0.c
            java.lang.Object r15 = r0.b
            jf9 r15 = (defpackage.jf9) r15
            java.lang.Object r0 = r0.a
            xz r0 = (defpackage.xz) r0
            kotlin.ResultKt.throwOnFailure(r68)
            r2 = r68
            r46 = r0
            r5 = r1
            r32 = r7
            r42 = r8
            r41 = r9
            r40 = r11
            r29 = r12
            r56 = r13
            r57 = r14
            r48 = r15
            goto L_0x0cf8
        L_0x004d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0055:
            java.lang.Object r4 = r0.b
            ie8 r4 = (defpackage.ie8) r4
            java.lang.Object r13 = r0.a
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            kotlin.ResultKt.throwOnFailure(r68)
            r6 = r4
            r14 = r13
            r4 = r68
            goto L_0x0132
        L_0x0066:
            kotlin.ResultKt.throwOnFailure(r68)
            r4 = r12
            ge8 r4 = (defpackage.ge8) r4
            gsb r13 = r4.b
            a32 r14 = r4.a
            r13.f = r14
            yva r15 = r13.a
            int r6 = r15.h()
            int r15 = r15.e()
            r13.j(r14, r6, r15)
            r13.h(r14)
            java.lang.CharSequence r14 = r13.g
            ha9 r6 = r4.a()
            boolean r6 = r6.z()
            if (r6 == 0) goto L_0x011a
            r11.getClass()
            ha9 r0 = r4.a()
            oa9 r0 = r0.X
            gsb r3 = r4.b
            r3.f()
            java.lang.String r3 = r3.l
            int r5 = r3.length()
            if (r5 <= 0) goto L_0x00c0
            char r1 = r3.charAt(r1)
            char r1 = java.lang.Character.toUpperCase(r1)
            java.lang.String r2 = r3.substring(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            goto L_0x00c1
        L_0x00c0:
            r1 = r3
        L_0x00c1:
            ha9 r2 = r4.a()
            q10 r2 = r2.f()
            if (r2 == 0) goto L_0x00e0
            zc9 r2 = new zc9
            ha9 r3 = r4.a()
            ha9 r3 = r3.J0
            if (r3 == 0) goto L_0x00d8
            long r8 = r3.c
            goto L_0x00da
        L_0x00d8:
            r8 = 0
        L_0x00da:
            r2.<init>(r8)
            r22 = r2
            goto L_0x00e2
        L_0x00e0:
            r22 = 0
        L_0x00e2:
            ha9 r2 = r4.a()
            long r6 = r2.b
            ha9 r2 = r4.a()
            long r8 = r2.c
            ha9 r2 = r4.a()
            long r10 = r2.o
            hcg r15 = defpackage.hcg.None
            rr2 r23 = defpackage.rr2.b
            one.me.messages.list.loader.MessageModel r2 = new one.me.messages.list.loader.MessageModel
            r5 = r2
            r27 = 1
            r29 = 0
            java.lang.String r13 = ""
            r16 = 1
            r17 = 1
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 0
            r25 = 0
            r30 = 3152896(0x301c00, float:4.418148E-39)
            r12 = r14
            r14 = r1
            r28 = r0
            r5.<init>(r6, r8, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r28, r29, r30)
            return r2
        L_0x011a:
            eu3 r6 = r11.e()
            ha9 r4 = r4.a()
            long r8 = r4.w
            r0.a = r14
            r0.b = r12
            r0.Y = r2
            java.lang.Object r4 = r6.b(r8, r0)
            if (r4 != r3) goto L_0x0131
            return r3
        L_0x0131:
            r6 = r12
        L_0x0132:
            vk3 r4 = (defpackage.vk3) r4
            if (r4 != 0) goto L_0x0147
            eu3 r4 = r11.e()
            r8 = r12
            ge8 r8 = (defpackage.ge8) r8
            ha9 r8 = r8.a()
            long r8 = r8.w
            vk3 r4 = r4.a(r8)
        L_0x0147:
            ge8 r6 = (defpackage.ge8) r6
            r6.getClass()
            kotlin.reflect.KProperty[] r8 = defpackage.ge8.h
            r8 = r8[r10]
            kotlin.properties.ReadWriteProperty r9 = r6.f
            r9.setValue(r6, r8, r4)
            zz r4 = r11.b
            r4.getClass()
            r6 = r12
            ge8 r6 = (defpackage.ge8) r6
            ha9 r8 = r6.a()
            w28 r8 = r8.x0
            kl0 r9 = defpackage.kl0.b
            java.lang.String r13 = ""
            if (r8 != 0) goto L_0x017b
            r30 = r3
            r32 = r7
            r47 = r9
            r48 = r11
            r29 = r12
            r68 = r13
            r31 = r14
            r0 = r18
            goto L_0x0bbd
        L_0x017b:
            ha9 r15 = r6.a()
            g20 r1 = defpackage.g20.c
            boolean r22 = r15.n(r1)
            ha9 r15 = r6.a()
            g20 r5 = defpackage.g20.o
            boolean r15 = r15.n(r5)
            ha9 r21 = r6.a()
            boolean r21 = r21.w()
            java.lang.Object r10 = r8.c
            zf7 r10 = (defpackage.zf7) r10
            if (r10 == 0) goto L_0x01a0
            r23 = r2
            goto L_0x01a2
        L_0x01a0:
            r23 = 0
        L_0x01a2:
            java.lang.Object r10 = r8.o
            i2d r10 = (defpackage.i2d) r10
            if (r10 == 0) goto L_0x01ab
            r24 = r2
            goto L_0x01ad
        L_0x01ab:
            r24 = 0
        L_0x01ad:
            kotlin.Lazy r10 = r4.g
            kotlin.Lazy r2 = r4.j
            r68 = r13
            kotlin.Lazy r13 = r4.k
            r29 = r12
            c3g r12 = r4.n
            r30 = r3
            xeb r3 = r4.m
            r31 = r14
            a32 r14 = r6.a
            if (r22 != 0) goto L_0x01c5
            if (r15 == 0) goto L_0x01d2
        L_0x01c5:
            r32 = r7
            r21 = r8
            r47 = r9
            r48 = r11
            r7 = r13
            r8 = r4
            r4 = r12
            goto L_0x090e
        L_0x01d2:
            ha9 r15 = r6.a()
            boolean r15 = r15.x()
            android.content.Context r0 = r4.a
            if (r15 == 0) goto L_0x02fe
            ha9 r1 = r6.a()
            l10 r1 = r1.d()
            if (r1 == 0) goto L_0x02f4
            vk3 r2 = r14.m()
            vk3 r3 = r6.d()
            boolean r3 = r3.w
            r4 = 1
            r38 = r3 ^ 1
            if (r38 == 0) goto L_0x0206
            boolean r3 = r1.c()
            if (r3 != 0) goto L_0x0203
            boolean r3 = r1.a()
            if (r3 == 0) goto L_0x0206
        L_0x0203:
            r35 = 1
            goto L_0x0208
        L_0x0206:
            r35 = 0
        L_0x0208:
            boolean r3 = r1.d()
            if (r3 != 0) goto L_0x0232
            if (r38 != 0) goto L_0x0217
            boolean r3 = r1.a()
            if (r3 == 0) goto L_0x0217
            goto L_0x0232
        L_0x0217:
            if (r35 == 0) goto L_0x0222
            int r3 = defpackage.ewa.U
            java.lang.String r3 = r0.getString(r3)
        L_0x021f:
            r33 = r3
            goto L_0x0239
        L_0x0222:
            if (r38 == 0) goto L_0x022b
            int r3 = defpackage.ewa.T
            java.lang.String r3 = r0.getString(r3)
            goto L_0x021f
        L_0x022b:
            int r3 = defpackage.ewa.V
            java.lang.String r3 = r0.getString(r3)
            goto L_0x021f
        L_0x0232:
            int r3 = defpackage.ewa.W
            java.lang.String r3 = r0.getString(r3)
            goto L_0x021f
        L_0x0239:
            if (r35 == 0) goto L_0x0253
            int r3 = defpackage.bwa.e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r4 = r1.e()
            if (r4 == 0) goto L_0x0248
            goto L_0x0249
        L_0x0248:
            r3 = 0
        L_0x0249:
            if (r3 == 0) goto L_0x0250
            int r3 = r3.intValue()
            goto L_0x0284
        L_0x0250:
            int r3 = defpackage.bwa.d
            goto L_0x0284
        L_0x0253:
            if (r38 == 0) goto L_0x026d
            int r3 = defpackage.bwa.f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r4 = r1.e()
            if (r4 == 0) goto L_0x0262
            goto L_0x0263
        L_0x0262:
            r3 = 0
        L_0x0263:
            if (r3 == 0) goto L_0x026a
            int r3 = r3.intValue()
            goto L_0x0284
        L_0x026a:
            int r3 = defpackage.bwa.c
            goto L_0x0284
        L_0x026d:
            int r3 = defpackage.bwa.h
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r4 = r1.e()
            if (r4 == 0) goto L_0x027a
            goto L_0x027b
        L_0x027a:
            r3 = 0
        L_0x027b:
            if (r3 == 0) goto L_0x0282
            int r3 = r3.intValue()
            goto L_0x0284
        L_0x0282:
            int r3 = defpackage.bwa.g
        L_0x0284:
            boolean r4 = r1.e()
            if (r4 == 0) goto L_0x028d
            int r4 = defpackage.ewa.S
            goto L_0x028f
        L_0x028d:
            int r4 = defpackage.ewa.R
        L_0x028f:
            long r12 = r1.e
            java.lang.Long r5 = java.lang.Long.valueOf(r12)
            r19 = 0
            int r10 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r10 == 0) goto L_0x029c
            goto L_0x029d
        L_0x029c:
            r5 = 0
        L_0x029d:
            if (r5 == 0) goto L_0x02a6
            java.lang.String[] r5 = defpackage.ghf.c
            java.lang.String r5 = defpackage.b0h.c(r12)
            goto L_0x02a7
        L_0x02a6:
            r5 = 0
        L_0x02a7:
            if (r5 != 0) goto L_0x02ab
            r5 = r68
        L_0x02ab:
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r4 = r0.getString(r4, r5)
            java.lang.CharSequence r4 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r4)
            java.lang.String r34 = r4.toString()
            android.graphics.drawable.Drawable r36 = defpackage.ew3.b(r0, r3)
            if (r2 == 0) goto L_0x02d1
            f01 r0 = new f01
            long r2 = r2.r()
            boolean r1 = r1.e()
            r0.<init>(r2, r1)
        L_0x02ce:
            r37 = r0
            goto L_0x02e1
        L_0x02d1:
            e01 r0 = new e01
            m72 r2 = r14.b
            long r2 = r2.a
            boolean r4 = r1.e()
            java.lang.String r1 = r1.b
            r0.<init>(r2, r1, r4)
            goto L_0x02ce
        L_0x02e1:
            i01 r0 = new i01
            r32 = r0
            r32.<init>(r33, r34, r35, r36, r37, r38)
        L_0x02e8:
            r25 = r0
        L_0x02ea:
            r32 = r7
            r21 = r8
            r47 = r9
            r48 = r11
            goto L_0x0bae
        L_0x02f4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r7.toString()
            r0.<init>(r1)
            throw r0
        L_0x02fe:
            ha9 r15 = r6.a()
            boolean r15 = r15.B()
            if (r15 == 0) goto L_0x039c
            ha9 r1 = r6.a()
            u10 r1 = r1.j()
            if (r1 != 0) goto L_0x0314
        L_0x0312:
            r0 = 0
            goto L_0x02e8
        L_0x0314:
            int r2 = defpackage.ewa.c0
            java.lang.String r35 = r0.getString(r2)
            s58 r2 = r1.a
            boolean r3 = r2.a()
            if (r3 == 0) goto L_0x0378
            v10 r0 = r1.i
            if (r0 == 0) goto L_0x0329
            s58 r0 = r0.a
            goto L_0x032a
        L_0x0329:
            r0 = 0
        L_0x032a:
            kotlin.Lazy r3 = r4.d
            java.lang.Object r3 = r3.getValue()
            taf r3 = (defpackage.taf) r3
            r4 = 0
            if (r0 == 0) goto L_0x033b
            double r12 = r0.a
            r41 = r12
            goto L_0x033d
        L_0x033b:
            r41 = r4
        L_0x033d:
            if (r0 == 0) goto L_0x0341
            double r4 = r0.b
        L_0x0341:
            r43 = r4
            r36 = r3
            be r36 = (defpackage.be) r36
            double r3 = r2.a
            double r12 = r2.b
            r37 = r3
            r39 = r12
            java.lang.String r0 = r36.c(r37, r39, r41, r43)
            if (r0 == 0) goto L_0x035f
            int r3 = r0.length()
            if (r3 != 0) goto L_0x035c
            goto L_0x035f
        L_0x035c:
            r36 = r0
            goto L_0x037f
        L_0x035f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            double r3 = r2.a
            r0.append(r3)
            java.lang.String r3 = ","
            r0.append(r3)
            double r3 = r2.b
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            goto L_0x035c
        L_0x0378:
            int r3 = defpackage.ewa.b0
            java.lang.String r0 = r0.getString(r3)
            goto L_0x035c
        L_0x037f:
            vp6 r0 = new vp6
            ha9 r3 = r6.a()
            long r3 = r3.b
            double r12 = r2.a
            double r14 = r2.b
            float r1 = r1.g
            r32 = r0
            r33 = r3
            r37 = r12
            r39 = r14
            r41 = r1
            r32.<init>(r33, r35, r36, r37, r39, r41)
            goto L_0x02e8
        L_0x039c:
            ha9 r15 = r6.a()
            boolean r15 = r15.F()
            if (r15 == 0) goto L_0x03ea
            ha9 r0 = r6.a()
            f20 r0 = r0.l()
            if (r0 != 0) goto L_0x03b2
            goto L_0x0312
        L_0x03b2:
            gpe r1 = new gpe
            java.lang.String r2 = r0.h
            boolean r3 = defpackage.cvg.A(r2)
            if (r3 == 0) goto L_0x03be
            java.lang.String r2 = r0.b
        L_0x03be:
            r39 = r2
            long r2 = r0.k
            java.lang.String r4 = r0.l
            r44 = 0
            r45 = 0
            long r12 = r0.a
            int r5 = r0.c
            int r0 = r0.d
            r43 = 0
            r47 = 3872(0xf20, float:5.426E-42)
            r32 = r1
            r33 = r12
            r35 = r2
            r37 = r2
            r40 = r4
            r41 = r5
            r42 = r0
            r32.<init>(r33, r35, r37, r39, r40, r41, r42, r43, r44, r45, r47)
            toe r0 = new toe
            r0.<init>(r1)
            goto L_0x02e8
        L_0x03ea:
            ha9 r15 = r6.a()
            boolean r15 = r15.y()
            if (r15 == 0) goto L_0x04fb
            ha9 r1 = r6.a()
            n10 r1 = r1.e()
            if (r1 != 0) goto L_0x0401
            r2 = 0
            goto L_0x04f7
        L_0x0401:
            kotlin.Lazy r2 = r4.e
            java.lang.Object r3 = r2.getValue()
            bl3 r3 = (defpackage.bl3) r3
            vk3 r3 = r3.b(r1)
            vk3 r4 = r6.d()
            boolean r4 = r4.w
            r5 = 1
            r40 = r4 ^ 1
            if (r3 == 0) goto L_0x0421
            boolean r4 = r3.w
            if (r4 != r5) goto L_0x0421
            cl3 r4 = defpackage.cl3.a
        L_0x041e:
            r39 = r4
            goto L_0x0434
        L_0x0421:
            if (r3 == 0) goto L_0x042c
            boolean r4 = r3.c()
            if (r4 != r5) goto L_0x042c
            cl3 r4 = defpackage.cl3.b
            goto L_0x041e
        L_0x042c:
            if (r3 == 0) goto L_0x0431
            cl3 r4 = defpackage.cl3.c
            goto L_0x041e
        L_0x0431:
            cl3 r4 = defpackage.cl3.o
            goto L_0x041e
        L_0x0434:
            int r4 = r39.ordinal()
            if (r4 == 0) goto L_0x0452
            r5 = 1
            if (r4 == r5) goto L_0x044f
            r5 = 2
            if (r4 == r5) goto L_0x044c
            r5 = 3
            if (r4 != r5) goto L_0x0446
            int r4 = defpackage.ewa.Z
            goto L_0x0454
        L_0x0446:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x044c:
            int r4 = defpackage.ewa.Y
            goto L_0x0454
        L_0x044f:
            int r4 = defpackage.ewa.X
            goto L_0x0454
        L_0x0452:
            int r4 = defpackage.ewa.a0
        L_0x0454:
            int r5 = r39.ordinal()
            if (r5 == 0) goto L_0x048c
            r10 = 1
            if (r5 == r10) goto L_0x0483
            r10 = 2
            if (r5 == r10) goto L_0x0471
            r10 = 3
            if (r5 != r10) goto L_0x046b
            int r5 = defpackage.bwa.j
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L_0x0469:
            r10 = 0
            goto L_0x048e
        L_0x046b:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0471:
            int r5 = defpackage.bwa.i
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r10 = defpackage.bwa.j
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r66 = r10
            r10 = r5
            r5 = r66
            goto L_0x048e
        L_0x0483:
            int r5 = defpackage.bwa.i
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r10 = r5
            r5 = 0
            goto L_0x048e
        L_0x048c:
            r5 = 0
            goto L_0x0469
        L_0x048e:
            if (r3 == 0) goto L_0x0497
            long r12 = r3.r()
        L_0x0494:
            r33 = r12
            goto L_0x049a
        L_0x0497:
            long r12 = r1.b
            goto L_0x0494
        L_0x049a:
            java.lang.Object r12 = r2.getValue()
            bl3 r12 = (defpackage.bl3) r12
            vk3 r12 = r12.b(r1)
            java.lang.String r35 = defpackage.bs0.H(r12, r1)
            java.lang.String r12 = r1.f
            if (r12 != 0) goto L_0x04ae
            r12 = r68
        L_0x04ae:
            java.lang.String r36 = r12.toString()
            java.lang.Object r12 = r2.getValue()
            bl3 r12 = (defpackage.bl3) r12
            java.lang.String r37 = r12.a(r3, r1)
            java.lang.Object r2 = r2.getValue()
            bl3 r2 = (defpackage.bl3) r2
            java.lang.CharSequence r38 = r2.c(r1)
            java.lang.String r41 = r0.getString(r4)
            if (r5 == 0) goto L_0x04d7
            int r1 = r5.intValue()
            android.graphics.drawable.Drawable r1 = defpackage.ew3.b(r0, r1)
            r42 = r1
            goto L_0x04d9
        L_0x04d7:
            r42 = 0
        L_0x04d9:
            if (r10 == 0) goto L_0x04e6
            int r1 = r10.intValue()
            android.graphics.drawable.Drawable r0 = defpackage.ew3.b(r0, r1)
            r43 = r0
            goto L_0x04e8
        L_0x04e6:
            r43 = 0
        L_0x04e8:
            ha9 r0 = r6.a()
            long r0 = r0.b
            dl3 r2 = new dl3
            r32 = r2
            r44 = r0
            r32.<init>(r33, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
        L_0x04f7:
            r25 = r2
            goto L_0x02ea
        L_0x04fb:
            ha9 r15 = r6.a()
            boolean r15 = r15.E()
            if (r15 == 0) goto L_0x0599
            ha9 r0 = r6.a()
            c20 r0 = r0.k()
            if (r0 != 0) goto L_0x0512
            r3 = 0
            goto L_0x0595
        L_0x0512:
            x10 r1 = r0.f
            if (r1 == 0) goto L_0x052b
            ha9 r2 = r6.a()
            g20 r4 = defpackage.g20.x
            l20 r2 = r2.a(r4)
            if (r2 != 0) goto L_0x0524
            r1 = 0
            goto L_0x0528
        L_0x0524:
            p87 r1 = r3.a(r1, r2)
        L_0x0528:
            r39 = r1
            goto L_0x052d
        L_0x052b:
            r39 = 0
        L_0x052d:
            java.lang.String r1 = r0.e
            if (r1 == 0) goto L_0x053c
            int r2 = r1.length()
            if (r2 != 0) goto L_0x0538
            goto L_0x053c
        L_0x0538:
            r2 = 1
            r28 = 0
            goto L_0x053f
        L_0x053c:
            r2 = 1
            r28 = 1
        L_0x053f:
            r3 = r28 ^ 1
            if (r3 == 0) goto L_0x0546
            r36 = r1
            goto L_0x0548
        L_0x0546:
            r36 = 0
        L_0x0548:
            java.lang.String r1 = r0.c
            if (r1 == 0) goto L_0x0557
            int r2 = r1.length()
            if (r2 != 0) goto L_0x0553
            goto L_0x0557
        L_0x0553:
            r2 = 1
            r28 = 0
            goto L_0x055a
        L_0x0557:
            r2 = 1
            r28 = 1
        L_0x055a:
            r3 = r28 ^ 1
            if (r3 == 0) goto L_0x0561
            r37 = r1
            goto L_0x0563
        L_0x0561:
            r37 = 0
        L_0x0563:
            java.lang.String r1 = r0.d
            if (r1 == 0) goto L_0x0572
            int r2 = r1.length()
            if (r2 != 0) goto L_0x056e
            goto L_0x0572
        L_0x056e:
            r2 = 1
            r28 = 0
            goto L_0x0575
        L_0x0572:
            r2 = 1
            r28 = 1
        L_0x0575:
            r3 = r28 ^ 1
            if (r3 == 0) goto L_0x057c
            r38 = r1
            goto L_0x057e
        L_0x057c:
            r38 = 0
        L_0x057e:
            ha9 r1 = r6.a()
            long r1 = r1.b
            w4e r3 = new w4e
            long r4 = r0.a
            java.lang.String r0 = r0.b
            r32 = r3
            r33 = r4
            r35 = r0
            r40 = r1
            r32.<init>(r33, r35, r36, r37, r38, r39, r40)
        L_0x0595:
            r25 = r3
            goto L_0x02ea
        L_0x0599:
            if (r21 == 0) goto L_0x062a
            ha9 r1 = r6.a()
            w28 r1 = r1.x0
            if (r1 == 0) goto L_0x05af
            r2 = 0
            l20 r1 = r1.F(r2)
            if (r1 != 0) goto L_0x05ab
            goto L_0x05af
        L_0x05ab:
            i10 r2 = r1.e
            if (r2 != 0) goto L_0x05b3
        L_0x05af:
            r48 = r11
            r4 = 0
            goto L_0x0620
        L_0x05b3:
            int r3 = defpackage.ewa.Q
            java.lang.String r40 = r0.getString(r3)
            vk3 r3 = r6.d()
            boolean r3 = r3.w
            if (r3 == 0) goto L_0x05c8
            int r3 = defpackage.ewa.P
            java.lang.String r0 = r0.getString(r3)
            goto L_0x05d4
        L_0x05c8:
            vk3 r0 = r6.d()
            java.lang.String r0 = r0.f()
            if (r0 != 0) goto L_0x05d4
            r0 = r68
        L_0x05d4:
            long r12 = r14.a
            ha9 r3 = r6.a()
            long r14 = r3.b
            vk3 r3 = r6.d()
            boolean r3 = r3.w
            r5 = 1
            r37 = r3 ^ 1
            java.lang.String r41 = r0.toString()
            r48 = r11
            long r10 = r2.c
            java.lang.String r43 = defpackage.b0h.c(r10)
            kotlin.Lazy r0 = r4.f
            java.lang.Object r3 = r0.getValue()
            cpb r3 = (defpackage.cpb) r3
            etc r3 = r3.f
            java.lang.Object r0 = r0.getValue()
            cpb r0 = (defpackage.cpb) r0
            xme r0 = r0.e
            l50 r4 = new l50
            java.lang.String r5 = r2.b
            java.lang.String r1 = r1.q
            byte[] r2 = r2.d
            r32 = r4
            r33 = r12
            r35 = r14
            r38 = r5
            r39 = r1
            r42 = r2
            r44 = r10
            r46 = r0
            r47 = r3
            r32.<init>(r33, r35, r37, r38, r39, r40, r41, r42, r43, r44, r46, r47)
        L_0x0620:
            r25 = r4
            r32 = r7
            r21 = r8
            r47 = r9
            goto L_0x0bae
        L_0x062a:
            r48 = r11
            ha9 r11 = r6.a()
            boolean r11 = r11.A()
            if (r11 == 0) goto L_0x0904
            ha9 r11 = r6.a()
            g20 r15 = defpackage.g20.X
            l20 r11 = r11.a(r15)
            if (r11 != 0) goto L_0x064b
        L_0x0642:
            r32 = r7
            r21 = r8
            r47 = r9
            r0 = 0
            goto L_0x0900
        L_0x064b:
            ha9 r15 = r6.a()
            s10 r15 = r15.g()
            if (r15 != 0) goto L_0x0656
            goto L_0x0642
        L_0x0656:
            java.lang.Object r2 = r2.getValue()
            iz r2 = (defpackage.iz) r2
            r21 = r8
            ha9 r8 = r6.a()
            r2.a(r8)
            ha9 r2 = r6.a()
            java.lang.String r2 = r2.y
            if (r2 == 0) goto L_0x0678
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0674
            goto L_0x0678
        L_0x0674:
            r2 = 1
            r28 = 0
            goto L_0x067b
        L_0x0678:
            r2 = 1
            r28 = 1
        L_0x067b:
            r64 = r28 ^ 1
            d20 r2 = r11.n
            l20 r8 = r15.d
            if (r8 == 0) goto L_0x076f
            r32 = r7
            g20 r7 = r8.a
            if (r7 != r1) goto L_0x0767
            x10 r1 = r8.b
            boolean r7 = r1.v
            if (r7 != 0) goto L_0x0767
            r3.getClass()
            r25 = r12
            r7 = r13
            long r12 = r1.y
            r19 = 0
            int r12 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r12 <= 0) goto L_0x06b1
            boolean r12 = r2.b()
            if (r12 == 0) goto L_0x06b1
            boolean r12 = r3.b(r1, r11)
            if (r12 != 0) goto L_0x06b1
            p87 r1 = defpackage.p87.m
        L_0x06ab:
            r26 = r4
            r47 = r9
            goto L_0x0764
        L_0x06b1:
            java.lang.String r12 = r11.r
            if (r12 == 0) goto L_0x06d3
            int r13 = r12.length()
            if (r13 != 0) goto L_0x06bc
            goto L_0x06d3
        L_0x06bc:
            java.io.File r13 = new java.io.File
            r13.<init>(r12)
            boolean r13 = r13.exists()
            if (r13 == 0) goto L_0x06d3
            java.io.File r13 = new java.io.File
            r13.<init>(r12)
            android.net.Uri r12 = android.net.Uri.fromFile(r13)
        L_0x06d0:
            r36 = r12
            goto L_0x06fb
        L_0x06d3:
            java.lang.String r12 = r1.b
            if (r12 == 0) goto L_0x06e3
            int r13 = r12.length()
            if (r13 != 0) goto L_0x06de
            goto L_0x06e3
        L_0x06de:
            android.net.Uri r12 = defpackage.po5.s(r12)
            goto L_0x06d0
        L_0x06e3:
            java.lang.String r12 = r1.a
            if (r12 == 0) goto L_0x06f9
            int r13 = r12.length()
            if (r13 != 0) goto L_0x06ee
            goto L_0x06f9
        L_0x06ee:
            jl0 r13 = defpackage.jl0.b
            java.lang.String r12 = defpackage.cjf.A(r12, r9, r13)
            android.net.Uri r12 = defpackage.po5.s(r12)
            goto L_0x06d0
        L_0x06f9:
            r36 = 0
        L_0x06fb:
            if (r36 != 0) goto L_0x0700
            p87 r1 = defpackage.p87.m
            goto L_0x06ab
        L_0x0700:
            p87 r12 = new p87
            w28 r13 = r3.a
            r47 = r9
            java.lang.Object r9 = r13.o
            kotlin.Lazy r9 = (kotlin.Lazy) r9
            java.lang.Object r9 = r9.getValue()
            java.lang.Number r9 = (java.lang.Number) r9
            int r40 = r9.intValue()
            kotlin.Lazy r9 = r3.e
            java.lang.Object r9 = r9.getValue()
            t00 r9 = (defpackage.t00) r9
            o20 r9 = (defpackage.o20) r9
            r26 = r4
            r4 = 0
            android.net.Uri r41 = r9.c(r11, r4)
            kotlin.Lazy r3 = r3.d
            java.lang.Object r3 = r3.getValue()
            hn4 r3 = (defpackage.hn4) r3
            kn4 r3 = r3.b()
            r3.getClass()
            kn4 r4 = defpackage.kn4.o
            if (r3 != r4) goto L_0x0744
            int r3 = r1.o
            int r4 = r1.c
            r9 = 1
            v3d r3 = r13.K(r4, r3, r9)
            r42 = r3
            goto L_0x0746
        L_0x0744:
            r42 = 0
        L_0x0746:
            r43 = 0
            r46 = 3328(0xd00, float:4.664E-42)
            long r3 = r1.y
            int r9 = r1.c
            int r13 = r1.o
            boolean r1 = r1.v
            r44 = 0
            r45 = 0
            r33 = r12
            r34 = r3
            r37 = r9
            r38 = r13
            r39 = r1
            r33.<init>(r34, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            r1 = r12
        L_0x0764:
            r62 = r1
            goto L_0x0776
        L_0x0767:
            r26 = r4
        L_0x0769:
            r47 = r9
            r25 = r12
            r7 = r13
            goto L_0x0774
        L_0x076f:
            r26 = r4
            r32 = r7
            goto L_0x0769
        L_0x0774:
            r62 = 0
        L_0x0776:
            if (r8 == 0) goto L_0x079c
            g20 r1 = r8.a
            if (r1 != r5) goto L_0x079c
            java.lang.Object r1 = r10.getValue()
            s7g r1 = (defpackage.s7g) r1
            m72 r3 = r14.b
            long r3 = r3.a
            ha9 r3 = r6.a()
            long r3 = r3.c
            r1.getClass()
            java.lang.String r1 = r11.q
            k20 r3 = r8.d
            r4 = r25
            b3g r1 = r4.a(r3, r11, r1)
            r63 = r1
            goto L_0x079e
        L_0x079c:
            r63 = 0
        L_0x079e:
            if (r8 == 0) goto L_0x07ab
            boolean r1 = r8.i()
            if (r1 == 0) goto L_0x07ab
            al5 r1 = defpackage.al5.b
        L_0x07a8:
            r61 = r1
            goto L_0x07cd
        L_0x07ab:
            if (r8 == 0) goto L_0x07bc
            boolean r1 = r8.f()
            if (r1 == 0) goto L_0x07bc
            x10 r1 = r8.b
            boolean r1 = r1.v
            if (r1 != 0) goto L_0x07bc
            al5 r1 = defpackage.al5.a
            goto L_0x07a8
        L_0x07bc:
            if (r8 == 0) goto L_0x07ca
            x10 r1 = r8.b
            if (r1 == 0) goto L_0x07ca
            boolean r1 = r1.v
            r3 = 1
            if (r1 != r3) goto L_0x07ca
            al5 r1 = defpackage.al5.c
            goto L_0x07a8
        L_0x07ca:
            al5 r1 = defpackage.al5.o
            goto L_0x07a8
        L_0x07cd:
            if (r2 != 0) goto L_0x07d1
            r1 = -1
            goto L_0x07d9
        L_0x07d1:
            int[] r1 = defpackage.yz.$EnumSwitchMapping$1
            int r2 = r2.ordinal()
            r1 = r1[r2]
        L_0x07d9:
            long r2 = r15.b
            r4 = 1
            if (r1 == r4) goto L_0x0857
            r4 = 2
            if (r1 == r4) goto L_0x0856
            r4 = 3
            if (r1 == r4) goto L_0x0856
            r4 = 4
            if (r1 == r4) goto L_0x0849
            r4 = 5
            if (r1 != r4) goto L_0x0843
            java.lang.Object r1 = r7.getValue()
            j00 r1 = (defpackage.j00) r1
            xme r1 = r1.e
            java.lang.Object r1 = r1.getValue()
            if (r1 == 0) goto L_0x07fd
            r58 = 0
            r60 = 0
            goto L_0x0863
        L_0x07fd:
            xk5 r1 = new xk5
            float r4 = r11.p
            r1.<init>(r4)
            long r8 = r15.a
            r12 = 0
            int r5 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r5 != 0) goto L_0x0813
            float r2 = (float) r2
            r3 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 / r3
            float r4 = r4 * r2
            long r2 = (long) r4
            goto L_0x0815
        L_0x0813:
            long r2 = r11.u
        L_0x0815:
            long r4 = r11.t
            r8 = 0
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x0837
            r8 = 0
            java.lang.String r2 = defpackage.ghf.x(r2, r8, r0)
            int r3 = defpackage.ghf.m(r4)
            r8 = 1
            java.lang.String r0 = defpackage.ghf.w(r3, r4, r0, r8)
            java.lang.String r3 = "/"
            java.lang.String r0 = defpackage.g63.i(r2, r3, r0)
            mgf r2 = new mgf
            r2.<init>(r0)
            goto L_0x083e
        L_0x0837:
            int r0 = defpackage.ewa.t
            igf r2 = new igf
            r2.<init>(r0)
        L_0x083e:
            r60 = r1
            r58 = r2
            goto L_0x0863
        L_0x0843:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0849:
            wk5 r1 = defpackage.wk5.a
            r4 = 1
            java.lang.String r0 = defpackage.ghf.x(r2, r4, r0)
            mgf r2 = new mgf
            r2.<init>(r0)
            goto L_0x083e
        L_0x0856:
            r4 = 1
        L_0x0857:
            yk5 r1 = defpackage.yk5.a
            java.lang.String r0 = defpackage.ghf.x(r2, r4, r0)
            mgf r2 = new mgf
            r2.<init>(r0)
            goto L_0x083e
        L_0x0863:
            cd4 r0 = defpackage.vk5.b
            java.lang.String r1 = defpackage.ld8.J(r15)
            r0.getClass()
            vk5 r57 = defpackage.cd4.l(r1)
            bl5 r0 = new bl5
            ha9 r1 = r6.a()
            long r1 = r1.b
            r8 = r26
            kotlin.Lazy r3 = r8.l
            java.lang.Object r3 = r3.getValue()
            z89 r3 = (defpackage.z89) r3
            r3.getClass()
            r4 = 40
            float r4 = (float) r4
            android.content.res.Resources r5 = defpackage.vo4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r4 = r4 * r5
            int r4 = kotlin.math.MathKt.roundToInt((float) r4)
            r5 = 10
            float r5 = (float) r5
            android.content.res.Resources r8 = defpackage.vo4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r5 = r5 * r8
            int r5 = kotlin.math.MathKt.roundToInt((float) r5)
            kotlin.Lazy r8 = r3.e
            java.lang.Object r8 = r8.getValue()
            et0 r8 = (defpackage.et0) r8
            int r8 = r8.b()
            int r4 = r4 + r5
            int r4 = r8 - r4
            kotlin.Lazy r5 = r3.m
            java.lang.Object r8 = r5.getValue()
            android.text.TextPaint r8 = (android.text.TextPaint) r8
            float r9 = (float) r4
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.MIDDLE
            java.lang.String r12 = r15.c
            java.lang.CharSequence r34 = android.text.TextUtils.ellipsize(r12, r8, r9, r10)
            ds7 r33 = r3.e()
            java.lang.Object r3 = r5.getValue()
            r35 = r3
            android.text.TextPaint r35 = (android.text.TextPaint) r35
            r37 = 1
            r38 = 48
            r36 = r4
            android.text.Layout r56 = r33.a(r34, r35, r36, r37, false, android.text.TextUtils.TruncateAt.END)
            java.lang.Object r3 = r7.getValue()
            j00 r3 = (defpackage.j00) r3
            xme r3 = r3.e
            java.lang.String r4 = r15.c
            r55 = r4
            java.lang.String r4 = r11.r
            r59 = r4
            long r4 = r15.a
            r50 = r4
            java.lang.String r4 = r11.q
            r54 = r4
            r49 = r0
            r52 = r1
            r65 = r3
            r49.<init>(r50, r52, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65)
        L_0x0900:
            r25 = r0
            goto L_0x0bae
        L_0x0904:
            r32 = r7
            r21 = r8
            r47 = r9
            r25 = 0
            goto L_0x0bae
        L_0x090e:
            ha9 r0 = r6.a()
            w28 r0 = r0.x0
            if (r0 == 0) goto L_0x0e5a
            int r9 = r0.G()
            if (r9 != 0) goto L_0x091f
            r2 = 0
            goto L_0x0bac
        L_0x091f:
            java.lang.Object r9 = r0.b
            java.util.List r9 = (java.util.List) r9
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            boolean r11 = r9 instanceof java.util.Collection
            if (r11 == 0) goto L_0x0933
            r11 = r9
            java.util.Collection r11 = (java.util.Collection) r11
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0933
            goto L_0x095a
        L_0x0933:
            java.util.Iterator r9 = r9.iterator()
        L_0x0937:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x095a
            java.lang.Object r11 = r9.next()
            l20 r11 = (defpackage.l20) r11
            g20 r12 = r11.a
            if (r12 == r5) goto L_0x094d
            boolean r11 = defpackage.ld8.Y(r11)
            if (r11 == 0) goto L_0x0937
        L_0x094d:
            java.lang.Object r2 = r2.getValue()
            iz r2 = (defpackage.iz) r2
            ha9 r9 = r6.a()
            r2.a(r9)
        L_0x095a:
            int r2 = r0.G()
            kotlin.Lazy r9 = r8.i
            r11 = 1
            if (r2 != r11) goto L_0x09f5
            r2 = 0
            l20 r0 = r0.F(r2)
            if (r0 == 0) goto L_0x09eb
            k20 r1 = r0.d
            if (r1 == 0) goto L_0x09c9
            java.lang.Object r2 = r9.getValue()
            h90 r2 = (defpackage.h90) r2
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x09a5
            kotlin.Lazy r2 = r8.h
            java.lang.Object r2 = r2.getValue()
            n5g r2 = (defpackage.n5g) r2
            m72 r3 = r14.b
            long r8 = r3.a
            ha9 r3 = r6.a()
            long r10 = r3.c
            jx3 r3 = r2.h
            k5g r5 = new k5g
            r40 = 0
            r33 = r5
            r34 = r2
            r35 = r0
            r36 = r8
            r38 = r10
            r33.<init>(r34, r35, r36, r38, r40)
            r2 = 3
            r11 = 0
            defpackage.ev0.v(r3, r11, r11, r5, r2)
            goto L_0x09a6
        L_0x09a5:
            r11 = 0
        L_0x09a6:
            ede r2 = new ede
            ha9 r3 = r6.a()
            long r8 = r3.b
            java.lang.String r3 = r0.q
            b3g r37 = r4.a(r1, r0, r3)
            java.lang.Object r0 = r7.getValue()
            j00 r0 = (defpackage.j00) r0
            xme r0 = r0.e
            r33 = r2
            r34 = r8
            r36 = r3
            r38 = r0
            r33.<init>(r34, r36, r37, r38)
            goto L_0x0bac
        L_0x09c9:
            r11 = 0
            x10 r1 = r0.b
            if (r1 == 0) goto L_0x09e1
            ybe r2 = new ybe
            ha9 r4 = r6.a()
            long r4 = r4.b
            p87 r1 = r3.a(r1, r0)
            java.lang.String r0 = r0.q
            r2.<init>(r4, r0, r1)
            goto L_0x0bac
        L_0x09e1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r32.toString()
            r0.<init>(r1)
            throw r0
        L_0x09eb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r32.toString()
            r0.<init>(r1)
            throw r0
        L_0x09f5:
            r11 = 0
            java.util.ArrayList r2 = new java.util.ArrayList
            int r7 = r0.G()
            r2.<init>(r7)
            int r7 = r0.G()
            r12 = 0
        L_0x0a04:
            if (r12 >= r7) goto L_0x0b4c
            l20 r13 = r0.F(r12)
            if (r13 != 0) goto L_0x0a1b
        L_0x0a0c:
            r26 = r0
            r20 = r1
            r33 = r3
            r19 = r4
            r25 = r7
            r7 = r8
        L_0x0a17:
            r13 = r9
        L_0x0a18:
            r0 = 1
            goto L_0x0b3c
        L_0x0a1b:
            g20 r15 = r13.a
            if (r15 == r1) goto L_0x0a21
            if (r15 != r5) goto L_0x0a0c
        L_0x0a21:
            java.lang.String r15 = r13.q
            k20 r11 = r13.d
            if (r11 == 0) goto L_0x0a51
            java.lang.Object r19 = r10.getValue()
            s7g r19 = (defpackage.s7g) r19
            r20 = r1
            m72 r1 = r14.b
            r25 = r7
            r26 = r8
            long r7 = r1.a
            ha9 r1 = r6.a()
            long r7 = r1.c
            r19.getClass()
            b3g r1 = r4.a(r11, r13, r15)
            r2.add(r1)
        L_0x0a47:
            r33 = r3
            r19 = r4
            r13 = r9
            r7 = r26
            r26 = r0
            goto L_0x0a18
        L_0x0a51:
            r20 = r1
            r25 = r7
            r26 = r8
            x10 r1 = r13.b
            if (r1 == 0) goto L_0x0a65
            r0.G()
            p87 r7 = r3.a(r1, r13)
            r2.add(r7)
        L_0x0a65:
            java.lang.Object r7 = r9.getValue()
            h90 r7 = (defpackage.h90) r7
            kotlin.Lazy r7 = r7.b
            java.lang.Object r7 = r7.getValue()
            jtb r7 = (defpackage.jtb) r7
            ltb r7 = (defpackage.ltb) r7
            hq r7 = r7.c
            ls7 r7 = r7.g
            java.lang.String r8 = "app.media.autoplay.gif"
            r11 = 1
            boolean r7 = r7.getBoolean(r8, r11)
            if (r7 != 0) goto L_0x0a83
            goto L_0x0a47
        L_0x0a83:
            r7 = r26
            kotlin.Lazy r8 = r7.b
            if (r1 == 0) goto L_0x0aab
            java.lang.String r11 = r1.X
            if (r11 == 0) goto L_0x0aab
            int r19 = r11.length()
            if (r19 <= 0) goto L_0x0aab
            java.lang.Object r19 = r8.getValue()
            ln5 r19 = (defpackage.ln5) r19
            r26 = r0
            r0 = r19
            po5 r0 = (defpackage.po5) r0
            java.io.File r0 = r0.n(r11)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0aad
            r0 = 1
            goto L_0x0aae
        L_0x0aab:
            r26 = r0
        L_0x0aad:
            r0 = 0
        L_0x0aae:
            if (r1 == 0) goto L_0x0b36
            java.lang.String r11 = r1.z
            if (r11 == 0) goto L_0x0b36
            int r19 = r11.length()
            if (r19 <= 0) goto L_0x0b36
            if (r0 != 0) goto L_0x0b36
            d20 r0 = r13.n
            boolean r13 = r0.e()
            r33 = r3
            r19 = r4
            long r3 = r1.y
            if (r13 != 0) goto L_0x0b0d
            boolean r13 = r0.b()
            if (r13 != 0) goto L_0x0b0d
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x0ad8
            r0 = 0
            goto L_0x0b02
        L_0x0ad8:
            java.lang.String r0 = r1.X
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x0aed
            java.lang.Object r1 = r8.getValue()
            ln5 r1 = (defpackage.ln5) r1
            po5 r1 = (defpackage.po5) r1
            java.io.File r0 = r1.n(r0)
            goto L_0x0aee
        L_0x0aed:
            r0 = 0
        L_0x0aee:
            if (r0 == 0) goto L_0x0af6
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x0b02
        L_0x0af6:
            java.lang.Object r0 = r8.getValue()
            ln5 r0 = (defpackage.ln5) r0
            po5 r0 = (defpackage.po5) r0
            java.io.File r0 = r0.k(r3)
        L_0x0b02:
            if (r0 == 0) goto L_0x0b0d
            boolean r0 = r0.exists()
            r1 = 1
            if (r0 != r1) goto L_0x0b0d
            goto L_0x0a17
        L_0x0b0d:
            odf r0 = new odf
            r0.<init>()
            ha9 r1 = r6.a()
            r13 = r9
            long r8 = r1.b
            r0.a = r8
            r0.b = r15
            r0.e = r3
            r0.g = r11
            r1 = 1
            r0.h = r1
            pdf r1 = new pdf
            r1.<init>(r0)
            kotlin.Lazy r0 = r7.c
            java.lang.Object r0 = r0.getValue()
            uk5 r0 = (defpackage.uk5) r0
            r0.a(r1)
            goto L_0x0a18
        L_0x0b36:
            r33 = r3
            r19 = r4
            goto L_0x0a17
        L_0x0b3c:
            int r12 = r12 + r0
            r8 = r7
            r9 = r13
            r4 = r19
            r1 = r20
            r7 = r25
            r0 = r26
            r3 = r33
            r11 = 0
            goto L_0x0a04
        L_0x0b4c:
            r0 = 1
            o43 r1 = new o43
            r3 = 0
            float[] r4 = new float[r3]
            int r3 = r2.size()
            if (r3 > r0) goto L_0x0b59
            goto L_0x0ba8
        L_0x0b59:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r2, 10)
            r0.<init>(r3)
            java.util.Iterator r3 = r2.iterator()
        L_0x0b66:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0ba4
            java.lang.Object r4 = r3.next()
            l43 r4 = (defpackage.l43) r4
            boolean r5 = r4 instanceof defpackage.p87
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L_0x0b88
            p87 r4 = (defpackage.p87) r4
            int r5 = r4.d
            if (r5 == 0) goto L_0x0b96
            int r4 = r4.c
            if (r4 != 0) goto L_0x0b83
            goto L_0x0b96
        L_0x0b83:
            float r4 = (float) r4
            float r5 = (float) r5
            float r7 = r4 / r5
            goto L_0x0b96
        L_0x0b88:
            boolean r5 = r4 instanceof defpackage.b3g
            if (r5 == 0) goto L_0x0b9e
            b3g r4 = (defpackage.b3g) r4
            int r5 = r4.d
            if (r5 == 0) goto L_0x0b96
            int r4 = r4.c
            if (r4 != 0) goto L_0x0b83
        L_0x0b96:
            java.lang.Float r4 = java.lang.Float.valueOf(r7)
            r0.add(r4)
            goto L_0x0b66
        L_0x0b9e:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0ba4:
            float[] r4 = kotlin.collections.CollectionsKt___CollectionsKt.toFloatArray(r0)
        L_0x0ba8:
            r1.<init>(r4, r2)
            r2 = r1
        L_0x0bac:
            r25 = r2
        L_0x0bae:
            xz r0 = new xz
            r1 = r21
            java.lang.Object r1 = r1.c
            r26 = r1
            zf7 r26 = (defpackage.zf7) r26
            r21 = r0
            r21.<init>(r22, r23, r24, r25, r26)
        L_0x0bbd:
            o00 r1 = r0.d
            if (r1 == 0) goto L_0x0bd4
            ha9 r1 = r6.a()
            java.lang.String r1 = r1.y
            if (r1 == 0) goto L_0x0bcf
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0bd4
        L_0x0bcf:
            r2 = r48
            r1 = 0
            r5 = 0
            goto L_0x0bf5
        L_0x0bd4:
            ha9 r1 = r6.a()
            r2 = r48
            kotlin.Lazy r3 = r2.h
            java.lang.Object r3 = r3.getValue()
            vj9 r3 = (defpackage.vj9) r3
            a32 r4 = r6.a
            kotlin.Lazy r5 = r2.g
            java.lang.Object r5 = r5.getValue()
            gb9 r5 = (defpackage.gb9) r5
            a89 r1 = defpackage.gb9.a(r5, r1)
            r5 = 0
            jf9 r1 = defpackage.vj9.e(r3, r4, r1, r5)
        L_0x0bf5:
            ha9 r3 = r6.a()
            qe9 r3 = r3.Y
            qe9 r4 = defpackage.qe9.EDITED
            if (r3 != r4) goto L_0x0c0c
            ha9 r3 = r6.a()
            int r3 = r3.N0
            r4 = 1
            r3 = r3 & r4
            if (r3 != r4) goto L_0x0c0a
            goto L_0x0c0c
        L_0x0c0a:
            r3 = 1
            goto L_0x0c0d
        L_0x0c0c:
            r3 = r5
        L_0x0c0d:
            vk3 r4 = r6.d()
            long r7 = r4.r()
            java.lang.CharSequence r9 = r4.q()
            r10 = r47
            java.lang.String r4 = r4.t(r10)
            yc9 r14 = new yc9
            r14.<init>(r7, r9, r4)
            ha9 r4 = r6.a()
            oa9 r13 = r4.X
            gsb r4 = r6.b
            r4.g()
            java.lang.String r9 = r4.k
            gsb r4 = r6.b
            r4.f()
            java.lang.String r4 = r4.l
            java.lang.String r4 = defpackage.ghf.e(r4)
            if (r4 != 0) goto L_0x0c41
            r8 = r68
            goto L_0x0c42
        L_0x0c41:
            r8 = r4
        L_0x0c42:
            ha9 r4 = r6.a()
            boolean r4 = r4.F()
            if (r4 != 0) goto L_0x0c9a
            a32 r4 = r6.a
            gsb r7 = r6.b
            java.lang.CharSequence r4 = r7.c(r4)
            if (r4 == 0) goto L_0x0c61
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0c5d
            goto L_0x0c61
        L_0x0c5d:
            r28 = r5
            r4 = 1
            goto L_0x0c64
        L_0x0c61:
            r4 = 1
            r28 = 1
        L_0x0c64:
            r7 = r28 ^ 1
            if (r7 == 0) goto L_0x0c73
            ha9 r4 = r6.a()
            int r4 = r4.b()
            if (r4 != 0) goto L_0x0c73
            goto L_0x0c9a
        L_0x0c73:
            ha9 r4 = r6.a()
            java.lang.String r4 = r4.y
            if (r4 == 0) goto L_0x0c81
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0ca6
        L_0x0c81:
            ha9 r4 = r6.a()
            w28 r4 = r4.x0
            if (r4 == 0) goto L_0x0ca6
            int r4 = r4.G()
            r7 = 1
            if (r4 != r7) goto L_0x0ca6
            ha9 r4 = r6.a()
            boolean r4 = r4.C()
            if (r4 == 0) goto L_0x0ca6
        L_0x0c9a:
            ha9 r4 = r6.a()
            ha9 r4 = r4.A0
            if (r4 != 0) goto L_0x0ca6
            r4 = 1
            r28 = 1
            goto L_0x0ca9
        L_0x0ca6:
            r28 = r5
            r4 = 1
        L_0x0ca9:
            r7 = r28 ^ 1
            a32 r4 = r6.a
            boolean r4 = r4.K()
            if (r4 != 0) goto L_0x0cc0
            vk3 r4 = r6.d()
            boolean r4 = r4.w
            if (r4 != 0) goto L_0x0cbc
            goto L_0x0cc0
        L_0x0cbc:
            r10 = r67
            r4 = r5
            goto L_0x0cc3
        L_0x0cc0:
            r4 = 1
            r10 = r67
        L_0x0cc3:
            r10.a = r0
            r10.b = r1
            r10.c = r14
            r10.o = r13
            r11 = r31
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            r10.v = r11
            r10.w = r9
            r10.x = r8
            r10.y = r3
            r10.z = r7
            r10.X = r4
            r11 = 2
            r10.Y = r11
            java.lang.Object r2 = defpackage.msa.a(r2, r6, r0, r10)
            r6 = r30
            if (r2 != r6) goto L_0x0ce7
            return r6
        L_0x0ce7:
            r46 = r0
            r48 = r1
            r6 = r3
            r3 = r4
            r4 = r7
            r42 = r8
            r41 = r9
            r56 = r13
            r57 = r14
            r40 = r31
        L_0x0cf8:
            r49 = r2
            nc9 r49 = (defpackage.nc9) r49
            r12 = r29
            ge8 r12 = (defpackage.ge8) r12
            ha9 r0 = r12.a()
            long r0 = r0.b
            ha9 r2 = r12.a()
            f20 r2 = r2.l()
            if (r2 == 0) goto L_0x0d1a
            ha9 r2 = r12.a()
            boolean r2 = r2.u()
            if (r2 != 0) goto L_0x0d27
        L_0x0d1a:
            ha9 r2 = r12.a()
            boolean r2 = r2.q()
            if (r2 != 0) goto L_0x0d27
            r45 = 1
            goto L_0x0d29
        L_0x0d27:
            r45 = r5
        L_0x0d29:
            ha9 r2 = r12.a()
            long r7 = r2.c
            ha9 r2 = r12.a()
            long r9 = r2.w
            ha9 r2 = r12.a()
            long r13 = r2.o
            vk3 r2 = r12.d()
            boolean r2 = r2.w
            a32 r11 = r12.a
            m72 r11 = r11.b
            java.util.Map r11 = r11.e
            boolean r15 = r11.isEmpty()
            if (r15 == 0) goto L_0x0d50
            r21 = r9
            goto L_0x0da3
        L_0x0d50:
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x0d58:
            boolean r15 = r11.hasNext()
            if (r15 == 0) goto L_0x0da0
            java.lang.Object r15 = r11.next()
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15
            java.lang.Object r16 = r15.getKey()
            java.lang.Long r16 = (java.lang.Long) r16
            java.lang.Object r15 = r15.getValue()
            java.lang.Long r15 = (java.lang.Long) r15
            long r19 = r15.longValue()
            ha9 r15 = r12.a()
            cl4 r5 = r15.R0
            r21 = r9
            if (r5 == 0) goto L_0x0d81
            long r9 = r5.a
            goto L_0x0d83
        L_0x0d81:
            long r9 = r15.o
        L_0x0d83:
            int r5 = (r19 > r9 ? 1 : (r19 == r9 ? 0 : -1))
            if (r5 < 0) goto L_0x0d9c
            vk3 r5 = r12.d()
            long r9 = r5.r()
            if (r16 != 0) goto L_0x0d92
            goto L_0x0d9a
        L_0x0d92:
            long r15 = r16.longValue()
            int r5 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r5 == 0) goto L_0x0d9c
        L_0x0d9a:
            r5 = 1
            goto L_0x0da3
        L_0x0d9c:
            r9 = r21
            r5 = 0
            goto L_0x0d58
        L_0x0da0:
            r21 = r9
            r5 = 0
        L_0x0da3:
            ha9 r9 = r12.a()
            oa9 r9 = r9.X
            oa9 r10 = defpackage.oa9.SENT
            if (r9 == r10) goto L_0x0dba
            ha9 r9 = r12.a()
            oa9 r9 = r9.X
            oa9 r10 = defpackage.oa9.READ
            if (r9 != r10) goto L_0x0db8
            goto L_0x0dba
        L_0x0db8:
            r9 = 0
            goto L_0x0dbb
        L_0x0dba:
            r9 = 1
        L_0x0dbb:
            ha9 r10 = r12.a()
            oa9 r10 = r10.X
            oa9 r11 = defpackage.oa9.SENDING
            if (r10 != r11) goto L_0x0dca
            hcg r2 = defpackage.hcg.Timer
        L_0x0dc7:
            r43 = r2
            goto L_0x0df7
        L_0x0dca:
            if (r2 != 0) goto L_0x0dcf
            hcg r2 = defpackage.hcg.None
            goto L_0x0dc7
        L_0x0dcf:
            if (r5 == 0) goto L_0x0dd6
            if (r9 == 0) goto L_0x0dd6
            hcg r2 = defpackage.hcg.Seen
            goto L_0x0dc7
        L_0x0dd6:
            if (r5 != 0) goto L_0x0ddd
            if (r9 == 0) goto L_0x0ddd
            hcg r2 = defpackage.hcg.Send
            goto L_0x0dc7
        L_0x0ddd:
            ha9 r2 = r12.a()
            r2.getClass()
            oa9 r5 = defpackage.oa9.ERROR
            oa9 r9 = r2.X
            if (r9 == r5) goto L_0x0df4
            qe9 r5 = defpackage.qe9.DELAYED_FIRE_ERROR
            qe9 r2 = r2.Y
            if (r2 != r5) goto L_0x0df1
            goto L_0x0df4
        L_0x0df1:
            hcg r2 = defpackage.hcg.None
            goto L_0x0dc7
        L_0x0df4:
            hcg r2 = defpackage.hcg.Error
            goto L_0x0dc7
        L_0x0df7:
            a32 r2 = r12.a
            m72 r2 = r2.b
            l72 r2 = r2.b
            if (r2 == 0) goto L_0x0e50
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x0e1a
            r5 = 1
            if (r2 == r5) goto L_0x0e15
            r9 = 2
            if (r2 == r9) goto L_0x0e15
            r9 = 3
            if (r2 != r9) goto L_0x0e0f
            goto L_0x0e15
        L_0x0e0f:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0e15:
            rr2 r2 = defpackage.rr2.b
        L_0x0e17:
            r51 = r2
            goto L_0x0e1e
        L_0x0e1a:
            r5 = 1
            rr2 r2 = defpackage.rr2.a
            goto L_0x0e17
        L_0x0e1e:
            ha9 r2 = r12.a()
            xd9 r2 = r2.Q0
            one.me.messages.list.loader.MessageModel r9 = new one.me.messages.list.loader.MessageModel
            if (r4 == 0) goto L_0x0e2b
            r44 = r5
            goto L_0x0e2d
        L_0x0e2b:
            r44 = 0
        L_0x0e2d:
            if (r6 == 0) goto L_0x0e32
            r47 = r5
            goto L_0x0e34
        L_0x0e32:
            r47 = 0
        L_0x0e34:
            if (r3 == 0) goto L_0x0e39
            r55 = r5
            goto L_0x0e3b
        L_0x0e39:
            r55 = 0
        L_0x0e3b:
            r58 = 5775360(0x582000, float:8.093003E-39)
            r50 = 0
            r33 = r9
            r34 = r0
            r36 = r7
            r38 = r13
            r52 = r2
            r53 = r21
            r33.<init>(r34, r36, r38, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r55, r56, r57, r58)
            return r9
        L_0x0e50:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r32.toString()
            r0.<init>(r1)
            throw r0
        L_0x0e5a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r32.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ksa.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
