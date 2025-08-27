package defpackage;

import android.os.Bundle;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: p72  reason: default package */
public final class p72 implements oa4 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final r72 d = r72.b;

    public p72(Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = lazy3;
        this.b = lazy;
        this.c = lazy2;
    }

    public final wa4 a() {
        return this.d;
    }

    public final ab4 b(String str, ra4 ra4, Bundle bundle) {
        o72 o72;
        xa4 xa4;
        Bundle bundle2;
        List list = null;
        if (!this.d.a.contains(ra4)) {
            return null;
        }
        if (Intrinsics.areEqual((Object) ra4, (Object) r72.c)) {
            Pair pair = TuplesKt.to("id", Long.valueOf(o54.L("id", bundle)));
            v02 v02 = q72.b;
            String N = o54.N("type", bundle);
            v02.getClass();
            Pair pair2 = TuplesKt.to("type", v02.l(N));
            Pair pair3 = TuplesKt.to("load_mark", o54.F("load_mark", bundle));
            Pair pair4 = TuplesKt.to("message_id", o54.F("message_id", bundle));
            if (bundle.containsKey("highlights")) {
                list = StringsKt__StringsKt.split$default((CharSequence) o54.N("highlights", bundle), new String[]{","}, true, 0, 4, (Object) null);
            }
            o72 = new o72(o54.f(pair, pair2, pair3, pair4, TuplesKt.to("highlights", list), TuplesKt.to("highlight_message", o54.E("highlight_message", bundle)), TuplesKt.to("from_forward", o54.E("from_forward", bundle))), 0);
        } else if (Intrinsics.areEqual((Object) ra4, (Object) r72.d)) {
            if (((akd) ((bud) this.b.getValue())).y()) {
                a32 a32 = (a32) ((edd) this.a.getValue()).a.getValue();
                if (a32 != null) {
                    bundle2 = new Bundle();
                    bundle2.putLong("id", a32.a);
                    bundle2.putParcelable("type", q72.LOCAL_ID);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                bundle2 = new Bundle();
                bundle2.putLong("id", 1);
                bundle2.putParcelable("type", q72.LOCAL_ID);
            }
            o72 = new o72(bundle2, 1);
        } else {
            throw new IllegalStateException(tr1.i("invalid route ", ra4));
        }
        vj5 vj5 = (vj5) ((uj5) this.c.getValue());
        vj5.getClass();
        if (vj5.m(PmsKey.f18chatanim, false)) {
            xa4 = new xa4(new r52(1), new r52(2));
        } else {
            new xa4
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0110: CONSTRUCTOR  (r11v6 ? I:xa4) =  call: xa4.<init>():void type: CONSTRUCTOR in method: p72.b(java.lang.String, ra4, android.os.Bundle):ab4, dex: classes2.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v6 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 38 more
                */
            /*
                this = this;
                r72 r0 = r11.d
                java.util.LinkedHashSet r0 = r0.a
                boolean r0 = r0.contains(r13)
                r1 = 0
                if (r0 != 0) goto L_0x000c
                return r1
            L_0x000c:
                ra4 r0 = defpackage.r72.c
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r0)
                java.lang.String r2 = "type"
                java.lang.String r3 = "id"
                if (r0 == 0) goto L_0x0089
                long r4 = defpackage.o54.L(r3, r14)
                java.lang.Long r0 = java.lang.Long.valueOf(r4)
                kotlin.Pair r4 = kotlin.TuplesKt.to(r3, r0)
                v02 r0 = defpackage.q72.b
                java.lang.String r3 = defpackage.o54.N(r2, r14)
                r0.getClass()
                q72 r0 = defpackage.v02.l(r3)
                kotlin.Pair r5 = kotlin.TuplesKt.to(r2, r0)
                java.lang.String r0 = "load_mark"
                java.lang.Long r2 = defpackage.o54.F(r0, r14)
                kotlin.Pair r6 = kotlin.TuplesKt.to(r0, r2)
                java.lang.String r0 = "message_id"
                java.lang.Long r2 = defpackage.o54.F(r0, r14)
                kotlin.Pair r7 = kotlin.TuplesKt.to(r0, r2)
                java.lang.String r0 = "highlights"
                boolean r2 = r14.containsKey(r0)
                if (r2 == 0) goto L_0x0061
                java.lang.String r1 = defpackage.o54.N(r0, r14)
                java.lang.String r2 = ","
                java.lang.String[] r2 = new java.lang.String[]{r2}
                r3 = 1
                r8 = 4
                java.util.List r1 = kotlin.text.StringsKt__StringsKt.split$default((java.lang.CharSequence) r1, (java.lang.String[]) r2, (boolean) r3, 0, (int) r8, (java.lang.Object) null)
            L_0x0061:
                kotlin.Pair r8 = kotlin.TuplesKt.to(r0, r1)
                java.lang.String r0 = "highlight_message"
                java.lang.Boolean r1 = defpackage.o54.E(r0, r14)
                kotlin.Pair r9 = kotlin.TuplesKt.to(r0, r1)
                java.lang.String r0 = "from_forward"
                java.lang.Boolean r1 = defpackage.o54.E(r0, r14)
                kotlin.Pair r10 = kotlin.TuplesKt.to(r0, r1)
                kotlin.Pair[] r0 = new kotlin.Pair[]{r4, r5, r6, r7, r8, r9, r10}
                android.os.Bundle r0 = defpackage.o54.f(r0)
                o72 r1 = new o72
                r2 = 0
                r1.<init>(r0, r2)
                r9 = r1
                goto L_0x00e5
            L_0x0089:
                ra4 r0 = defpackage.r72.d
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r0)
                if (r0 == 0) goto L_0x0121
                kotlin.Lazy r0 = r11.b
                java.lang.Object r0 = r0.getValue()
                bud r0 = (defpackage.bud) r0
                akd r0 = (defpackage.akd) r0
                boolean r0 = r0.y()
                if (r0 == 0) goto L_0x00cf
                kotlin.Lazy r0 = r11.a
                java.lang.Object r0 = r0.getValue()
                edd r0 = (defpackage.edd) r0
                ome r0 = r0.a
                java.lang.Object r0 = r0.getValue()
                a32 r0 = (defpackage.a32) r0
                if (r0 == 0) goto L_0x00c3
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                long r4 = r0.a
                r1.putLong(r3, r4)
                q72 r0 = defpackage.q72.LOCAL_ID
                r1.putParcelable(r2, r0)
                goto L_0x00de
            L_0x00c3:
                java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                java.lang.String r12 = "Required value was null."
                java.lang.String r12 = r12.toString()
                r11.<init>(r12)
                throw r11
            L_0x00cf:
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                r4 = 1
                r1.putLong(r3, r4)
                q72 r0 = defpackage.q72.LOCAL_ID
                r1.putParcelable(r2, r0)
            L_0x00de:
                o72 r0 = new o72
                r2 = 1
                r0.<init>(r1, r2)
                r9 = r0
            L_0x00e5:
                kotlin.Lazy r11 = r11.c
                java.lang.Object r11 = r11.getValue()
                uj5 r11 = (defpackage.uj5) r11
                vj5 r11 = (defpackage.vj5) r11
                r11.getClass()
                ru.ok.tamtam.android.prefs.PmsKey r0 = ru.ok.tamtam.android.prefs.PmsKey.f18chatanim
                r1 = 0
                boolean r11 = r11.m(r0, r1)
                if (r11 == 0) goto L_0x010e
                xa4 r11 = new xa4
                r52 r0 = new r52
                r1 = 1
                r0.<init>(r1)
                r52 r1 = new r52
                r2 = 2
                r1.<init>(r2)
                r11.<init>(r0, r1)
            L_0x010c:
                r8 = r11
                goto L_0x0114
            L_0x010e:
                xa4 r11 = new xa4
                r11.<init>()
                goto L_0x010c
            L_0x0114:
                ab4 r11 = new ab4
                r10 = 8
                r7 = 0
                r3 = r11
                r4 = r12
                r5 = r13
                r6 = r14
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return r11
            L_0x0121:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "invalid route "
                java.lang.String r12 = defpackage.tr1.i(r12, r13)
                r11.<init>(r12)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.p72.b(java.lang.String, ra4, android.os.Bundle):ab4");
        }
    }
