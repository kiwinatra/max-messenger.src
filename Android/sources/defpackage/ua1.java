package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: ua1  reason: default package */
public final class ua1 extends SuspendLambda implements Function3 {
    public int a;
    public /* synthetic */ ds5 b;
    public /* synthetic */ Object[] c;
    public final /* synthetic */ d14 o;
    public final /* synthetic */ List v;
    public final /* synthetic */ ya1 w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ua1(Continuation continuation, d14 d14, List list, ya1 ya1) {
        super(3, continuation);
        this.o = d14;
        this.v = list;
        this.w = ya1;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ua1 ua1 = new ua1((Continuation) obj3, this.o, this.v, this.w);
        ua1.b = (ds5) obj;
        ua1.c = (Object[]) obj2;
        return ua1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a6 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r12.a
            r3 = 2
            r4 = 0
            if (r2 == 0) goto L_0x0029
            if (r2 == r0) goto L_0x001c
            if (r2 != r3) goto L_0x0014
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x00a7
        L_0x0014:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x001c:
            java.lang.Object[] r0 = r12.c
            vk3[] r0 = (defpackage.vk3[]) r0
            ds5 r2 = r12.b
            kotlin.ResultKt.throwOnFailure(r13)     // Catch:{ all -> 0x0026 }
            goto L_0x0085
        L_0x0026:
            r13 = move-exception
            goto L_0x0090
        L_0x0029:
            kotlin.ResultKt.throwOnFailure(r13)
            ds5 r2 = r12.b
            java.lang.Object[] r13 = r12.c
            vk3[] r13 = (defpackage.vk3[]) r13
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r13.length
            r7 = 0
            r8 = r7
        L_0x003a:
            if (r7 >= r6) goto L_0x0058
            r9 = r13[r7]
            int r10 = r8 + 1
            boolean r9 = defpackage.kv0.M(r9)
            if (r9 == 0) goto L_0x004f
            java.util.List r9 = r12.v
            java.lang.Object r8 = r9.get(r8)
            java.lang.Long r8 = (java.lang.Long) r8
            goto L_0x0050
        L_0x004f:
            r8 = r4
        L_0x0050:
            if (r8 == 0) goto L_0x0055
            r5.add(r8)
        L_0x0055:
            int r7 = r7 + r0
            r8 = r10
            goto L_0x003a
        L_0x0058:
            jz9 r5 = defpackage.wa8.d(r5)
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x009a
            kotlin.Result$Companion r6 = kotlin.Result.Companion     // Catch:{ all -> 0x008c }
            ya1 r6 = r12.w     // Catch:{ all -> 0x008c }
            kotlin.Lazy r6 = r6.z     // Catch:{ all -> 0x008c }
            java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x008c }
            is9 r6 = (defpackage.is9) r6     // Catch:{ all -> 0x008c }
            kotlin.time.Duration$Companion r7 = kotlin.time.Duration.Companion     // Catch:{ all -> 0x008c }
            kotlin.time.DurationUnit r7 = kotlin.time.DurationUnit.SECONDS     // Catch:{ all -> 0x008c }
            r8 = 5
            long r7 = kotlin.time.DurationKt.toDuration((int) r8, (kotlin.time.DurationUnit) r7)     // Catch:{ all -> 0x008c }
            r12.b = r2     // Catch:{ all -> 0x008c }
            r12.c = r13     // Catch:{ all -> 0x008c }
            r12.a = r0     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = r6.v(r5, r7, r12)     // Catch:{ all -> 0x008c }
            if (r0 != r1) goto L_0x0084
            return r1
        L_0x0084:
            r0 = r13
        L_0x0085:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0026 }
            kotlin.Result.m23constructorimpl(r13)     // Catch:{ all -> 0x0026 }
        L_0x008a:
            r13 = r0
            goto L_0x009a
        L_0x008c:
            r0 = move-exception
            r11 = r0
            r0 = r13
            r13 = r11
        L_0x0090:
            kotlin.Result$Companion r5 = kotlin.Result.Companion
            java.lang.Object r13 = kotlin.ResultKt.createFailure(r13)
            kotlin.Result.m23constructorimpl(r13)
            goto L_0x008a
        L_0x009a:
            r12.b = r4
            r12.c = r4
            r12.a = r3
            java.lang.Object r12 = r2.a(r13, r12)
            if (r12 != r1) goto L_0x00a7
            return r1
        L_0x00a7:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ua1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
