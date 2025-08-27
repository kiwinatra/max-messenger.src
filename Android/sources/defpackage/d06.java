package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: d06  reason: default package */
public final class d06 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ m06 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d06(m06 m06, Continuation continuation) {
        super(2, continuation);
        this.b = m06;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new d06(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d06) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:579)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:485)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.a
            r2 = 1
            if (r1 == 0) goto L_0x0017
            if (r1 != r2) goto L_0x000f
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0076
        L_0x000f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0017:
            kotlin.ResultKt.throwOnFailure(r7)
            m06 r7 = r6.b
            zx5 r7 = r7.A0
            m06 r1 = r6.b
            java.util.concurrent.atomic.AtomicReference r1 = r1.y0
            java.lang.Object r1 = r1.get()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r1, 10)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x0035:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x004d
            java.lang.Object r4 = r1.next()
            a32 r4 = (defpackage.a32) r4
            m72 r4 = r4.b
            long r4 = r4.a
            java.lang.Long r4 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r4)
            r3.add(r4)
            goto L_0x0035
        L_0x004d:
            m06 r1 = r6.b
            java.lang.String r1 = r1.b
            if (r1 == 0) goto L_0x005b
            if (r7 == 0) goto L_0x005b
            java.util.Set r7 = r7.Y
            java.util.Set r3 = kotlin.collections.SetsKt.plus(r7, r3)
        L_0x005b:
            m06 r7 = r6.b
            gaf r7 = r7.o
            osa r7 = (defpackage.osa) r7
            q04 r7 = r7.b()
            c06 r1 = new c06
            m06 r4 = r6.b
            r5 = 0
            r1.<init>(r3, r4, r5)
            r6.a = r2
            java.lang.Object r7 = defpackage.ev0.I(r7, r1, r6)
            if (r7 != r0) goto L_0x0076
            return r0
        L_0x0076:
            java.util.List r7 = (java.util.List) r7
            m06 r6 = r6.b
            s85 r6 = r6.x0
            sy5 r0 = new sy5
            r0.<init>(r7)
            defpackage.xag.h(r6, r0)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d06.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
