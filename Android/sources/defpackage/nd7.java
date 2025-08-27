package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: nd7  reason: default package */
public final class nd7 extends SuspendLambda implements Function2 {
    public int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ wk6 o;
    public final /* synthetic */ int v;
    public final /* synthetic */ yd7 w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nd7(wk6 wk6, int i, yd7 yd7, Continuation continuation) {
        super(2, continuation);
        this.o = wk6;
        this.v = i;
        this.w = yd7;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        nd7 nd7 = new nd7(this.o, this.v, this.w, continuation);
        nd7.c = obj;
        return nd7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nd7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.String r1 = "getItems for album "
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.b
            yd7 r12 = r0.w
            r4 = 2
            java.lang.String r13 = ", limit = "
            int r14 = r0.v
            r15 = 1
            wk6 r11 = r0.o
            if (r3 == 0) goto L_0x003d
            if (r3 == r15) goto L_0x0035
            if (r3 != r4) goto L_0x002d
            int r1 = r0.a
            java.lang.Object r0 = r0.c
            r2 = r0
            java.util.List r2 = (java.util.List) r2
            kotlin.ResultKt.throwOnFailure(r20)     // Catch:{ all -> 0x0029 }
            r0 = r20
            r3 = r11
            goto L_0x00fe
        L_0x0029:
            r0 = move-exception
            r3 = r11
            goto L_0x0114
        L_0x002d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0035:
            java.lang.Object r3 = r0.c
            d14 r3 = (defpackage.d14) r3
            kotlin.ResultKt.throwOnFailure(r20)
            goto L_0x007b
        L_0x003d:
            kotlin.ResultKt.throwOnFailure(r20)
            java.lang.Object r3 = r0.c
            d14 r3 = (defpackage.d14) r3
            java.lang.String r5 = defpackage.yd7.C0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "start loadMoreItems: "
            r6.<init>(r7)
            r6.append(r11)
            r6.append(r13)
            r6.append(r14)
            java.lang.String r6 = r6.toString()
            defpackage.z68.c(r5, r6, new java.lang.Object[0])
            aje r6 = r12.A0
            if (r6 == 0) goto L_0x006c
            boolean r6 = r6.isActive()
            if (r6 != r15) goto L_0x006c
            java.lang.String r6 = "waiting for contentChangedJob"
            defpackage.z68.c(r5, r6, new java.lang.Object[0])
        L_0x006c:
            aje r5 = r12.A0
            if (r5 == 0) goto L_0x007b
            r0.c = r3
            r0.b = r15
            java.lang.Object r3 = r5.d(r0)
            if (r3 != r2) goto L_0x007b
            return r2
        L_0x007b:
            java.util.concurrent.ConcurrentHashMap r3 = r12.y0
            vk6 r5 = r11.a
            java.lang.Object r6 = r3.get(r5)
            if (r6 != 0) goto L_0x0091
            java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
            java.lang.Object r3 = r3.putIfAbsent(r5, r6)
            if (r3 != 0) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            r6 = r3
        L_0x0091:
            r3 = r6
            java.util.List r3 = (java.util.List) r3
            boolean r5 = r12.b(r11)
            if (r5 != 0) goto L_0x00a4
            q48 r0 = new q48
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            r0.<init>(r1)
            return r0
        L_0x00a4:
            int r10 = r3.size()
            int r8 = r0.v
            kotlin.Result$Companion r5 = kotlin.Result.Companion     // Catch:{ all -> 0x010d }
            zcf r6 = new zcf     // Catch:{ all -> 0x010d }
            java.lang.String r5 = defpackage.yd7.C0     // Catch:{ all -> 0x010d }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x010d }
            r5.<init>(r1)     // Catch:{ all -> 0x010d }
            r5.append(r11)     // Catch:{ all -> 0x010d }
            r5.append(r13)     // Catch:{ all -> 0x010d }
            r5.append(r8)     // Catch:{ all -> 0x010d }
            java.lang.String r1 = ", offset = "
            r5.append(r1)     // Catch:{ all -> 0x010d }
            r5.append(r10)     // Catch:{ all -> 0x010d }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x010d }
            r6.<init>(r1)     // Catch:{ all -> 0x010d }
            vk6 r5 = r11.a     // Catch:{ all -> 0x010d }
            r0.c = r3     // Catch:{ all -> 0x010d }
            r0.a = r10     // Catch:{ all -> 0x010d }
            r0.b = r4     // Catch:{ all -> 0x010d }
            gaf r1 = r12.c     // Catch:{ all -> 0x010d }
            osa r1 = (defpackage.osa) r1     // Catch:{ all -> 0x010d }
            q04 r1 = r1.b()     // Catch:{ all -> 0x010d }
            hd7 r9 = new hd7     // Catch:{ all -> 0x010d }
            r16 = 0
            r17 = 1
            r4 = r9
            r7 = r12
            r15 = r9
            r9 = r10
            r18 = r10
            r10 = r17
            r20 = r3
            r3 = r11
            r11 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0107 }
            java.lang.Object r0 = defpackage.ev0.I(r1, r15, r0)     // Catch:{ all -> 0x0107 }
            if (r0 != r2) goto L_0x00fa
            return r2
        L_0x00fa:
            r2 = r20
            r1 = r18
        L_0x00fe:
            zc7 r0 = (defpackage.zc7) r0     // Catch:{ all -> 0x0105 }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x0105 }
            goto L_0x011e
        L_0x0105:
            r0 = move-exception
            goto L_0x0114
        L_0x0107:
            r0 = move-exception
        L_0x0108:
            r2 = r20
            r1 = r18
            goto L_0x0114
        L_0x010d:
            r0 = move-exception
            r20 = r3
            r18 = r10
            r3 = r11
            goto L_0x0108
        L_0x0114:
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)
        L_0x011e:
            java.lang.Throwable r4 = kotlin.Result.m26exceptionOrNullimpl(r0)
            if (r4 != 0) goto L_0x01a5
            zc7 r0 = (defpackage.zc7) r0
            java.util.List r4 = r0.a
            int r4 = r4.size()
            java.util.List r0 = r0.a
            if (r4 >= r14) goto L_0x0138
            if (r1 != 0) goto L_0x0138
            int r1 = r0.size()
            r3.b = r1
        L_0x0138:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0144
            int r1 = r2.size()
            r3.b = r1
        L_0x0144:
            r1 = 1
            r3.c = r1
            java.util.Collection r2 = (java.util.Collection) r2
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = kotlin.collections.CollectionsKt.plus(r2, r1)
            java.util.concurrent.ConcurrentHashMap r2 = r12.y0
            vk6 r4 = r3.a
            r2.put(r4, r1)
            java.util.concurrent.ConcurrentHashMap r1 = r12.z0
            boolean r2 = r1.containsKey(r4)
            if (r2 != 0) goto L_0x016a
            java.lang.Object r2 = kotlin.collections.CollectionsKt.firstOrNull(r0)
            k48 r2 = (defpackage.k48) r2
            if (r2 == 0) goto L_0x016a
            r1.put(r4, r2)
        L_0x016a:
            java.lang.String r1 = defpackage.yd7.C0
            java.util.concurrent.ConcurrentHashMap r2 = r12.y0
            java.lang.Object r2 = r2.get(r4)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x017f
            int r2 = r2.size()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)
            goto L_0x0180
        L_0x017f:
            r2 = 0
        L_0x0180:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "finish loadMoreItems: "
            r4.<init>(r5)
            r4.append(r3)
            r4.append(r13)
            r4.append(r14)
            java.lang.String r3 = ", current size = "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            defpackage.z68.c(r1, r2, new java.lang.Object[0])
            q48 r1 = new q48
            r1.<init>(r0)
            return r1
        L_0x01a5:
            p48 r0 = new p48
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
