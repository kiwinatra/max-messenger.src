package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: as9  reason: default package */
public final class as9 extends SuspendLambda implements Function2 {
    public Object a;
    public Object b;
    public is9 c;
    public int o;
    public /* synthetic */ Object v;
    public final /* synthetic */ List w;
    public final /* synthetic */ is9 x;
    public final /* synthetic */ long y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public as9(List list, is9 is9, long j, Continuation continuation) {
        super(2, continuation);
        this.w = list;
        this.x = is9;
        this.y = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        as9 as9 = new as9(this.w, this.x, this.y, continuation);
        as9.v = obj;
        return as9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((as9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: finally extract failed */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x00fe: MOVE  (r4v12 java.util.Collection) = (r13v2 java.util.List)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0163  */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.o
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0051
            if (r1 == r5) goto L_0x003d
            if (r1 == r4) goto L_0x002d
            if (r1 != r3) goto L_0x0025
            java.lang.Object r1 = r12.b
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r12.a
            is9 r4 = (defpackage.is9) r4
            java.lang.Object r5 = r12.v
            jz9 r5 = (defpackage.jz9) r5
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = r4
            r10 = r5
            goto L_0x0122
        L_0x0025:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x002d:
            java.lang.Object r1 = r12.a
            ws r1 = (defpackage.ws) r1
            java.lang.Object r4 = r12.v
            d14 r4 = (defpackage.d14) r4
            kotlin.ResultKt.throwOnFailure(r13)     // Catch:{ all -> 0x003a }
            goto L_0x00e7
        L_0x003a:
            r13 = move-exception
            goto L_0x00ee
        L_0x003d:
            is9 r1 = r12.c
            java.lang.Object r5 = r12.b
            xz9 r5 = (defpackage.xz9) r5
            java.lang.Object r6 = r12.a
            ws r6 = (defpackage.ws) r6
            java.lang.Object r7 = r12.v
            d14 r7 = (defpackage.d14) r7
            kotlin.ResultKt.throwOnFailure(r13)
        L_0x004e:
            r13 = r1
            r1 = r6
            goto L_0x0084
        L_0x0051:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Object r13 = r12.v
            d14 r13 = (defpackage.d14) r13
            java.util.List r1 = r12.w
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0063
            jz9 r12 = defpackage.xa8.a
            return r12
        L_0x0063:
            java.util.List r1 = r12.w
            java.util.Collection r1 = (java.util.Collection) r1
            ws r6 = new ws
            r6.<init>((java.util.Collection) r1)
            is9 r1 = r12.x
            a0a r7 = r1.y
            r12.v = r13
            r12.a = r6
            r12.b = r7
            r12.c = r1
            r12.o = r5
            java.lang.Object r5 = r7.d(r12)
            if (r5 != r0) goto L_0x0081
            return r0
        L_0x0081:
            r5 = r7
            r7 = r13
            goto L_0x004e
        L_0x0084:
            ws r6 = r13.z     // Catch:{ all -> 0x0177 }
            r1.e(r6)     // Catch:{ all -> 0x0177 }
            ws r13 = r13.z     // Catch:{ all -> 0x0177 }
            r13.b(r1)     // Catch:{ all -> 0x0177 }
            kotlin.Unit r13 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0177 }
            a0a r5 = (defpackage.a0a) r5
            r5.e(r2)
            boolean r13 = r1.isEmpty()
            if (r13 == 0) goto L_0x00c8
            java.util.List r12 = r12.w
            a67 r13 = defpackage.z68.b
            if (r13 != 0) goto L_0x00a2
            goto L_0x00c5
        L_0x00a2:
            boolean r0 = r13.c()
            if (r0 == 0) goto L_0x00c5
            w78 r0 = defpackage.w78.v
            r3 = r12
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r7 = 0
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r9 = 63
            java.lang.String r12 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(r3, r4, r5, r6, 0, r7, r8, r9, (java.lang.Object) null)
            java.lang.String r1 = "requestContacts: idsForRequest skipped! missedIds=["
            java.lang.String r3 = "]"
            java.lang.String r12 = defpackage.wj6.k(r1, r12, r3)
            java.lang.String r1 = "MissedContactsController"
            r13.d(r0, r1, r12, r2)
        L_0x00c5:
            jz9 r12 = defpackage.xa8.a
            return r12
        L_0x00c8:
            long r5 = r12.y     // Catch:{ all -> 0x00ec }
            zr9 r13 = new zr9     // Catch:{ all -> 0x00ec }
            is9 r8 = r12.x     // Catch:{ all -> 0x00ec }
            r13.<init>(r1, r8, r2)     // Catch:{ all -> 0x00ec }
            r12.v = r7     // Catch:{ all -> 0x00ec }
            r12.a = r1     // Catch:{ all -> 0x00ec }
            r12.b = r2     // Catch:{ all -> 0x00ec }
            r12.c = r2     // Catch:{ all -> 0x00ec }
            r12.o = r4     // Catch:{ all -> 0x00ec }
            long r4 = defpackage.xk4.e(r5)     // Catch:{ all -> 0x00ec }
            java.lang.Object r13 = defpackage.okf.b(r4, r13, r12)     // Catch:{ all -> 0x00ec }
            if (r13 != r0) goto L_0x00e6
            return r0
        L_0x00e6:
            r4 = r7
        L_0x00e7:
            java.util.List r13 = (java.util.List) r13     // Catch:{ all -> 0x003a }
            goto L_0x00f7
        L_0x00ea:
            r4 = r7
            goto L_0x00ee
        L_0x00ec:
            r13 = move-exception
            goto L_0x00ea
        L_0x00ee:
            boolean r5 = r13 instanceof java.util.concurrent.CancellationException
            if (r5 != 0) goto L_0x016f
            boolean r5 = r13 instanceof ru.ok.tamtam.errors.TamErrorException
            if (r5 != 0) goto L_0x016f
            r13 = r2
        L_0x00f7:
            boolean r4 = defpackage.e14.f(r4)
            if (r4 == 0) goto L_0x0163
            r4 = r13
            java.util.Collection r4 = (java.util.Collection) r4
            if (r4 == 0) goto L_0x0163
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0109
            goto L_0x0163
        L_0x0109:
            is9 r4 = r12.x
            boolean r4 = r4.k()
            if (r4 != 0) goto L_0x0112
            goto L_0x0163
        L_0x0112:
            jz9 r1 = new jz9
            r1.<init>((java.lang.Object) r2)
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            is9 r4 = r12.x
            java.util.Iterator r13 = r13.iterator()
            r10 = r1
            r1 = r13
            r13 = r4
        L_0x0122:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0162
            java.lang.Object r4 = r1.next()
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r5 = r4.component1()
            r7 = r5
            long[] r7 = (long[]) r7
            java.lang.Object r4 = r4.component2()
            r5 = r4
            kotlin.Pair r5 = (kotlin.Pair) r5
            r12.v = r10
            r12.a = r13
            r12.b = r1
            r12.c = r2
            r12.o = r3
            r13.getClass()
            xr9 r11 = new xr9
            r9 = 0
            r4 = r11
            r6 = r13
            r8 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r4 = defpackage.e14.d(r11, r12)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r5) goto L_0x015d
            goto L_0x015f
        L_0x015d:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x015f:
            if (r4 != r0) goto L_0x0122
            return r0
        L_0x0162:
            return r10
        L_0x0163:
            is9 r12 = r12.x
            ws r12 = r12.z
            r12.e(r1)
            jz9 r12 = defpackage.wa8.d(r1)
            return r12
        L_0x016f:
            is9 r12 = r12.x
            ws r12 = r12.z
            r12.e(r1)
            throw r13
        L_0x0177:
            r12 = move-exception
            a0a r5 = (defpackage.a0a) r5
            r5.e(r2)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.as9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
