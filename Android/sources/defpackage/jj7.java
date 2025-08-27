package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: jj7  reason: default package */
public final class jj7 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ Function0 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jj7(Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.b = function0;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        jj7 jj7 = new jj7(this.b, continuation);
        jj7.a = obj;
        return jj7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jj7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
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
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:205)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r4)
            java.lang.Object r4 = r3.a
            d14 r4 = (defpackage.d14) r4
            kotlin.coroutines.CoroutineContext r4 = r4.U()
            kotlin.jvm.functions.Function0 r3 = r3.b
            qif r0 = new qif     // Catch:{ InterruptedException -> 0x0042 }
            r0.<init>()     // Catch:{ InterruptedException -> 0x0042 }
            pm7 r4 = defpackage.kv0.B(r4)     // Catch:{ InterruptedException -> 0x0042 }
            pq4 r4 = defpackage.kv0.H(r4, r0)     // Catch:{ InterruptedException -> 0x0042 }
            r0.w = r4     // Catch:{ InterruptedException -> 0x0042 }
        L_0x001f:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = defpackage.qif.x     // Catch:{ InterruptedException -> 0x0042 }
            int r1 = r4.get(r0)     // Catch:{ InterruptedException -> 0x0042 }
            if (r1 == 0) goto L_0x0033
            r4 = 2
            if (r1 == r4) goto L_0x003a
            r4 = 3
            if (r1 != r4) goto L_0x002e
            goto L_0x003a
        L_0x002e:
            defpackage.qif.k(r1)     // Catch:{ InterruptedException -> 0x0042 }
            r3 = 0
            throw r3     // Catch:{ InterruptedException -> 0x0042 }
        L_0x0033:
            r2 = 0
            boolean r4 = r4.compareAndSet(r0, r1, r2)     // Catch:{ InterruptedException -> 0x0042 }
            if (r4 == 0) goto L_0x001f
        L_0x003a:
            java.lang.Object r3 = r3.invoke()     // Catch:{ all -> 0x0044 }
            r0.j()     // Catch:{ InterruptedException -> 0x0042 }
            return r3
        L_0x0042:
            r3 = move-exception
            goto L_0x0049
        L_0x0044:
            r3 = move-exception
            r0.j()     // Catch:{ InterruptedException -> 0x0042 }
            throw r3     // Catch:{ InterruptedException -> 0x0042 }
        L_0x0049:
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "Blocking call was interrupted due to parent cancellation"
            r4.<init>(r0)
            java.lang.Throwable r3 = r4.initCause(r3)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
