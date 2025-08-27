package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: w1e  reason: default package */
public final class w1e implements oa4 {
    public final /* synthetic */ int a;
    public final wa4 b;

    public w1e(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = um4.b;
                return;
            case 2:
                this.b = ka6.b;
                return;
            case 3:
                this.b = dk7.b;
                return;
            case 4:
                this.b = o98.b;
                return;
            case 5:
                this.b = sfa.b;
                return;
            case 6:
                this.b = z4e.b;
                return;
            default:
                this.b = x1e.b;
                return;
        }
    }

    public final wa4 a() {
        switch (this.a) {
            case 0:
                return (x1e) this.b;
            case 1:
                return (um4) this.b;
            case 2:
                return (ka6) this.b;
            case 3:
                return (dk7) this.b;
            case 4:
                return (o98) this.b;
            case 5:
                return (sfa) this.b;
            default:
                return (z4e) this.b;
        }
    }

    public final ab4 b(String str, ra4 ra4, Bundle bundle) {
        i iVar;
        xa4 xa4;
        i iVar2;
        switch (this.a) {
            case 0:
                if (!((x1e) this.b).a.contains(ra4)) {
                    return null;
                }
                x1e.b.getClass();
                if (Intrinsics.areEqual((Object) ra4, (Object) x1e.c)) {
                    return new ab4(str, ra4, bundle, za4.a, new xa4(new red(14), new red(15)), new i(26));
                }
                z68.f(w1e.class.getName(), "invalid route " + ra4, new IllegalArgumentException("invalid route " + ra4));
                return null;
            case 1:
                if (!((um4) this.b).a.contains(ra4)) {
                    return null;
                }
                za4 za4 = za4.a;
                if (Intrinsics.areEqual((Object) ra4, (Object) um4.c)) {
                    iVar = new i(8);
                } else if (Intrinsics.areEqual((Object) ra4, (Object) um4.d)) {
                    iVar = new i(9);
                } else if (Intrinsics.areEqual((Object) ra4, (Object) um4.e)) {
                    za4 = za4.c;
                    iVar = new i(10);
                } else if (Intrinsics.areEqual((Object) ra4, (Object) um4.f)) {
                    iVar = new i(11);
                } else if (Intrinsics.areEqual((Object) ra4, (Object) um4.g)) {
                    iVar = new i(12);
                } else {
                    throw new IllegalStateException(tr1.i("Unknown route=", ra4));
                }
                za4 za42 = za4;
                i iVar3 = iVar;
                if (Intrinsics.areEqual((Object) ra4, (Object) um4.g) || Intrinsics.areEqual((Object) ra4, (Object) um4.f)) {
                    xa4 = xa4.c;
                } else {
                    new xa4
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0222: CONSTRUCTOR  (r11v27 ? I:xa4) =  call: xa4.<init>():void type: CONSTRUCTOR in method: w1e.b(java.lang.String, ra4, android.os.Bundle):ab4, dex: classes2.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:298)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:64)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v27 ?
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	... 43 more
                        */
                    /*
                        this = this;
                        int r0 = r11.a
                        switch(r0) {
                            case 0: goto L_0x0240;
                            case 1: goto L_0x01aa;
                            case 2: goto L_0x014d;
                            case 3: goto L_0x00e3;
                            case 4: goto L_0x00ab;
                            case 5: goto L_0x0042;
                            default: goto L_0x0005;
                        }
                    L_0x0005:
                        wa4 r11 = r11.b
                        z4e r11 = (defpackage.z4e) r11
                        java.util.LinkedHashSet r11 = r11.a
                        boolean r11 = r11.contains(r13)
                        if (r11 != 0) goto L_0x0013
                        r11 = 0
                        goto L_0x0035
                    L_0x0013:
                        z4e r11 = defpackage.z4e.b
                        r11.getClass()
                        ra4 r11 = defpackage.z4e.c
                        boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r11)
                        if (r11 == 0) goto L_0x0036
                        ab4 r11 = new ab4
                        za4 r4 = defpackage.za4.a
                        o72 r6 = new o72
                        r0 = 10
                        r6.<init>(r14, r0)
                        r7 = 16
                        r5 = 0
                        r0 = r11
                        r1 = r12
                        r2 = r13
                        r3 = r14
                        r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                    L_0x0035:
                        return r11
                    L_0x0036:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r12 = "invalid route "
                        java.lang.String r12 = defpackage.tr1.i(r12, r13)
                        r11.<init>(r12)
                        throw r11
                    L_0x0042:
                        wa4 r11 = r11.b
                        sfa r11 = (defpackage.sfa) r11
                        java.util.LinkedHashSet r11 = r11.a
                        boolean r11 = r11.contains(r13)
                        if (r11 != 0) goto L_0x0050
                        r11 = 0
                        goto L_0x009e
                    L_0x0050:
                        ra4 r11 = defpackage.sfa.c
                        boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r11)
                        if (r11 == 0) goto L_0x0061
                        i r11 = new i
                        r0 = 22
                        r11.<init>(r0)
                    L_0x005f:
                        r7 = r11
                        goto L_0x0091
                    L_0x0061:
                        ra4 r11 = defpackage.sfa.d
                        boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r11)
                        if (r11 == 0) goto L_0x0071
                        i r11 = new i
                        r0 = 23
                        r11.<init>(r0)
                        goto L_0x005f
                    L_0x0071:
                        ra4 r11 = defpackage.sfa.e
                        boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r11)
                        if (r11 == 0) goto L_0x0081
                        i r11 = new i
                        r0 = 24
                        r11.<init>(r0)
                        goto L_0x005f
                    L_0x0081:
                        ra4 r11 = defpackage.sfa.f
                        boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r11)
                        if (r11 == 0) goto L_0x009f
                        i r11 = new i
                        r0 = 25
                        r11.<init>(r0)
                        goto L_0x005f
                    L_0x0091:
                        ab4 r11 = new ab4
                        r5 = 0
                        r6 = 0
                        r8 = 24
                        r1 = r11
                        r2 = r12
                        r3 = r13
                        r4 = r14
                        r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                    L_0x009e:
                        return r11
                    L_0x009f:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r12 = "Unknown route"
                        java.lang.String r12 = r12.toString()
                        r11.<init>(r12)
                        throw r11
                    L_0x00ab:
                        wa4 r11 = r11.b
                        o98 r11 = (defpackage.o98) r11
                        r11.getClass()
                        ra4 r11 = defpackage.o98.c
                        boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r11)
                        if (r11 != 0) goto L_0x00bc
                        r11 = 0
                        goto L_0x00e2
                    L_0x00bc:
                        xa4 r5 = new xa4
                        ck7 r11 = new ck7
                        r0 = 19
                        r11.<init>(r0)
                        ck7 r0 = new ck7
                        r1 = 20
                        r0.<init>(r1)
                        r5.<init>(r11, r0)
                        i r6 = new i
                        r11 = 19
                        r6.<init>(r11)
                        ab4 r11 = new ab4
                        r7 = 8
                        r4 = 0
                        r0 = r11
                        r1 = r12
                        r2 = r13
                        r3 = r14
                        r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                    L_0x00e2:
                        return r11
                    L_0x00e3:
                        wa4 r11 = r11.b
                        dk7 r11 = (defpackage.dk7) r11
                        java.util.LinkedHashSet r11 = r11.a
                        boolean r11 = r11.contains(r13)
                        if (r11 != 0) goto L_0x00f1
                        r11 = 0
                        goto L_0x0140
                    L_0x00f1:
                        dk7 r11 = defpackage.dk7.b
                        r11.getClass()
                        ra4 r11 = defpackage.dk7.c
                        boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r11)
                        if (r11 == 0) goto L_0x0114
                        ab4 r11 = new ab4
                        za4 r4 = defpackage.za4.a
                        i r6 = new i
                        r0 = 15
                        r6.<init>(r0)
                        r7 = 16
                        r5 = 0
                        r0 = r11
                        r1 = r12
                        r2 = r13
                        r3 = r14
                        r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                        goto L_0x0140
                    L_0x0114:
                        ra4 r11 = defpackage.dk7.d
                        boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r11)
                        if (r11 == 0) goto L_0x0141
                        xa4 r5 = new xa4
                        a46 r11 = new a46
                        r0 = 29
                        r11.<init>(r0)
                        ck7 r0 = new ck7
                        r1 = 0
                        r0.<init>(r1)
                        r5.<init>(r11, r0)
                        ab4 r11 = new ab4
                        za4 r4 = defpackage.za4.a
                        i r6 = new i
                        r0 = 16
                        r6.<init>(r0)
                        r0 = r11
                        r1 = r12
                        r2 = r13
                        r3 = r14
                        r0.<init>(r1, r2, r3, r4, r5, r6)
                    L_0x0140:
                        return r11
                    L_0x0141:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r12 = "invalid route "
                        java.lang.String r12 = defpackage.tr1.i(r12, r13)
                        r11.<init>(r12)
                        throw r11
                    L_0x014d:
                        wa4 r11 = r11.b
                        ka6 r11 = (defpackage.ka6) r11
                        java.util.LinkedHashSet r11 = r11.a
                        boolean r11 = r11.contains(r13)
                        if (r11 != 0) goto L_0x015b
                        r11 = 0
                        goto L_0x019d
                    L_0x015b:
                        ra4 r11 = defpackage.ka6.c
                        boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r11)
                        if (r11 == 0) goto L_0x019e
                        java.lang.String r11 = "messages_ids"
                        long[] r11 = defpackage.o54.M(r11, r14)
                        java.lang.String r0 = "attach_id"
                        java.lang.Long r0 = defpackage.o54.F(r0, r14)
                        java.lang.String r1 = "is_forward_attach"
                        java.lang.Boolean r1 = defpackage.o54.E(r1, r14)
                        r2 = 0
                        if (r1 == 0) goto L_0x017d
                        boolean r1 = r1.booleanValue()
                        goto L_0x017e
                    L_0x017d:
                        r1 = r2
                    L_0x017e:
                        java.lang.String r3 = "show_ext_sharing"
                        java.lang.Boolean r3 = defpackage.o54.E(r3, r14)
                        if (r3 == 0) goto L_0x018a
                        boolean r2 = r3.booleanValue()
                    L_0x018a:
                        ja6 r9 = new ja6
                        r9.<init>(r11, r0, r1, r2)
                        ab4 r11 = new ab4
                        za4 r7 = defpackage.za4.a
                        r10 = 16
                        r8 = 0
                        r3 = r11
                        r4 = r12
                        r5 = r13
                        r6 = r14
                        r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                    L_0x019d:
                        return r11
                    L_0x019e:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r12 = "invalid route "
                        java.lang.String r12 = defpackage.tr1.i(r12, r13)
                        r11.<init>(r12)
                        throw r11
                    L_0x01aa:
                        wa4 r11 = r11.b
                        um4 r11 = (defpackage.um4) r11
                        java.util.LinkedHashSet r11 = r11.a
                        boolean r11 = r11.contains(r13)
                        if (r11 != 0) goto L_0x01b9
                        r11 = 0
                        goto L_0x0233
                    L_0x01b9:
                        za4 r11 = defpackage.za4.a
                        ra4 r0 = defpackage.um4.c
                        boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r0)
                        if (r0 == 0) goto L_0x01cd
                        i r0 = new i
                        r1 = 8
                        r0.<init>(r1)
                    L_0x01ca:
                        r6 = r11
                        r8 = r0
                        goto L_0x020f
                    L_0x01cd:
                        ra4 r0 = defpackage.um4.d
                        boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r0)
                        if (r0 == 0) goto L_0x01dd
                        i r0 = new i
                        r1 = 9
                        r0.<init>(r1)
                        goto L_0x01ca
                    L_0x01dd:
                        ra4 r0 = defpackage.um4.e
                        boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r0)
                        if (r0 == 0) goto L_0x01ef
                        za4 r11 = defpackage.za4.c
                        i r0 = new i
                        r1 = 10
                        r0.<init>(r1)
                        goto L_0x01ca
                    L_0x01ef:
                        ra4 r0 = defpackage.um4.f
                        boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r0)
                        if (r0 == 0) goto L_0x01ff
                        i r0 = new i
                        r1 = 11
                        r0.<init>(r1)
                        goto L_0x01ca
                    L_0x01ff:
                        ra4 r0 = defpackage.um4.g
                        boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r0)
                        if (r0 == 0) goto L_0x0234
                        i r0 = new i
                        r1 = 12
                        r0.<init>(r1)
                        goto L_0x01ca
                    L_0x020f:
                        ra4 r11 = defpackage.um4.g
                        boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r11)
                        if (r11 != 0) goto L_0x0227
                        ra4 r11 = defpackage.um4.f
                        boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r11)
                        if (r11 == 0) goto L_0x0220
                        goto L_0x0227
                    L_0x0220:
                        xa4 r11 = new xa4
                        r11.<init>()
                    L_0x0225:
                        r7 = r11
                        goto L_0x022a
                    L_0x0227:
                        xa4 r11 = defpackage.xa4.c
                        goto L_0x0225
                    L_0x022a:
                        ab4 r11 = new ab4
                        r2 = r11
                        r3 = r12
                        r4 = r13
                        r5 = r14
                        r2.<init>(r3, r4, r5, r6, r7, r8)
                    L_0x0233:
                        return r11
                    L_0x0234:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r12 = "Unknown route="
                        java.lang.String r12 = defpackage.tr1.i(r12, r13)
                        r11.<init>(r12)
                        throw r11
                    L_0x0240:
                        wa4 r11 = r11.b
                        x1e r11 = (defpackage.x1e) r11
                        java.util.LinkedHashSet r11 = r11.a
                        boolean r11 = r11.contains(r13)
                        r0 = 0
                        if (r11 != 0) goto L_0x024e
                        goto L_0x02a9
                    L_0x024e:
                        x1e r11 = defpackage.x1e.b
                        r11.getClass()
                        ra4 r11 = defpackage.x1e.c
                        boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r11)
                        if (r11 == 0) goto L_0x0281
                        i r7 = new i
                        r11 = 26
                        r7.<init>(r11)
                        ab4 r0 = new ab4
                        za4 r5 = defpackage.za4.a
                        xa4 r6 = new xa4
                        red r11 = new red
                        r1 = 14
                        r11.<init>((int) r1)
                        red r1 = new red
                        r2 = 15
                        r1.<init>((int) r2)
                        r6.<init>(r11, r1)
                        r1 = r0
                        r2 = r12
                        r3 = r13
                        r4 = r14
                        r1.<init>(r2, r3, r4, r5, r6, r7)
                        goto L_0x02a9
                    L_0x0281:
                        java.lang.Class<w1e> r11 = defpackage.w1e.class
                        java.lang.String r11 = r11.getName()
                        java.lang.StringBuilder r12 = new java.lang.StringBuilder
                        java.lang.String r14 = "invalid route "
                        r12.<init>(r14)
                        r12.append(r13)
                        java.lang.String r12 = r12.toString()
                        java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>(r14)
                        r2.append(r13)
                        java.lang.String r13 = r2.toString()
                        r1.<init>(r13)
                        defpackage.z68.f(r11, r12, r1)
                    L_0x02a9:
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.w1e.b(java.lang.String, ra4, android.os.Bundle):ab4");
                }
            }
