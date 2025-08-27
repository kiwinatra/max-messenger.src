package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: tw  reason: default package */
public final class tw extends SuspendLambda implements Function2 {
    public a32 a;
    public gx b;
    public Iterator c;
    public int o;
    public int v;
    public int w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ gx z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tw(gx gxVar, Continuation continuation) {
        super(2, continuation);
        this.z = gxVar;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        tw twVar = new tw(this.z, continuation);
        twVar.y = obj;
        return twVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tw) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: one.me.messages.list.loader.MessageModel} */
    /* JADX WARNING: type inference failed for: r9v7, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0181 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = 1
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.x
            r4 = 3
            r5 = 2
            gx r7 = r0.z
            if (r3 == 0) goto L_0x004a
            if (r3 == r1) goto L_0x003a
            if (r3 == r5) goto L_0x0022
            if (r3 != r4) goto L_0x001a
            kotlin.ResultKt.throwOnFailure(r21)
            goto L_0x0182
        L_0x001a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0022:
            int r3 = r0.w
            int r8 = r0.v
            int r9 = r0.o
            java.util.Iterator r10 = r0.c
            gx r11 = r0.b
            a32 r12 = r0.a
            java.lang.Object r13 = r0.y
            java.util.List r13 = (java.util.List) r13
            kotlin.ResultKt.throwOnFailure(r21)
            r14 = r3
            r3 = r12
            r15 = r13
            goto L_0x012e
        L_0x003a:
            int r3 = r0.v
            int r8 = r0.o
            java.lang.Object r9 = r0.y
            java.util.List r9 = (java.util.List) r9
            kotlin.ResultKt.throwOnFailure(r21)
            r10 = r9
            r9 = r3
            r3 = r21
            goto L_0x0095
        L_0x004a:
            kotlin.ResultKt.throwOnFailure(r21)
            java.lang.Object r3 = r0.y
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r8 = kotlin.collections.CollectionsKt.firstOrNull(r3)
            boolean r8 = r8 instanceof defpackage.fz6
            java.lang.Object r9 = kotlin.collections.CollectionsKt.lastOrNull(r3)
            boolean r9 = r9 instanceof defpackage.fz6
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0068:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x007a
            java.lang.Object r11 = r3.next()
            boolean r12 = r11 instanceof one.me.messages.list.loader.MessageModel
            if (r12 == 0) goto L_0x0068
            r10.add(r11)
            goto L_0x0068
        L_0x007a:
            kotlin.reflect.KProperty[] r3 = defpackage.gx.F
            kotlin.Lazy r3 = r7.p
            java.lang.Object r3 = r3.getValue()
            qx2 r3 = (defpackage.qx2) r3
            r0.y = r10
            r0.o = r8
            r0.v = r9
            r0.x = r1
            long r11 = r7.a
            java.lang.Object r3 = r3.d(r11, r0)
            if (r3 != r2) goto L_0x0095
            return r2
        L_0x0095:
            a32 r3 = (defpackage.a32) r3
            r11 = r10
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r15 = r10
            r10 = r11
            r14 = 0
            r11 = r7
            r19 = r9
            r9 = r8
            r8 = r19
        L_0x00a7:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x0156
            java.lang.Object r12 = r10.next()
            int r6 = r14 + 1
            if (r14 >= 0) goto L_0x00b8
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L_0x00b8:
            one.me.messages.list.loader.MessageModel r12 = (one.me.messages.list.loader.MessageModel) r12
            esa r12 = r11.h
            r0.y = r15
            r0.a = r3
            r0.b = r11
            r0.c = r10
            r0.o = r9
            r0.v = r8
            r0.w = r6
            r0.x = r5
            r12.getClass()
            java.lang.Object r16 = kotlin.collections.CollectionsKt.getOrNull(r15, r14)
            r1 = r16
            one.me.messages.list.loader.MessageModel r1 = (one.me.messages.list.loader.MessageModel) r1
            java.lang.String r5 = r12.a
            if (r1 == 0) goto L_0x0133
            zc9 r4 = r1.w0
            if (r4 == 0) goto L_0x00e4
        L_0x00df:
            r18 = r3
            r21 = r15
            goto L_0x0126
        L_0x00e4:
            kotlin.Lazy r4 = r12.d
            java.lang.Object r4 = r4.getValue()
            esb r4 = (defpackage.esb) r4
            java.util.concurrent.ConcurrentHashMap r4 = r4.c
            r21 = r14
            long r13 = r1.a
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            java.lang.Object r4 = r4.get(r13)
            r17 = r4
            gsb r17 = (defpackage.gsb) r17
            if (r17 != 0) goto L_0x0107
            java.lang.String r4 = "Trying to update message with non-existed preProcessedData!"
            r12 = 0
            defpackage.z68.f(r5, r4, r12)
            goto L_0x00df
        L_0x0107:
            fe8 r4 = new fe8
            r4.<init>()
            zra r5 = new zra
            r14 = r12
            r12 = r5
            r13 = r3
            r18 = r3
            r3 = r14
            r14 = r21
            r21 = r15
            r15 = r1
            r16 = r21
            r12.<init>(r13, r14, r15, r16, r17)
            ge8 r1 = r4.a(r5)
            java.lang.Object r1 = r3.e(r1, r0)
        L_0x0126:
            if (r1 != r2) goto L_0x0129
            return r2
        L_0x0129:
            r15 = r21
            r14 = r6
            r3 = r18
        L_0x012e:
            r1 = 1
            r4 = 3
            r5 = 2
            goto L_0x00a7
        L_0x0133:
            r21 = r14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Trying to update message with index="
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r1 = " which not exists!"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            defpackage.z68.f(r5, r0, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0156:
            r21 = r15
            xme r1 = r7.A
            wj9 r3 = new wj9
            if (r8 == 0) goto L_0x0160
            r4 = 1
            goto L_0x0161
        L_0x0160:
            r4 = 0
        L_0x0161:
            r15 = r21
            if (r9 == 0) goto L_0x0167
            r5 = 1
            goto L_0x0168
        L_0x0167:
            r5 = 0
        L_0x0168:
            r3.<init>(r15, r4, r5)
            r4 = 0
            r0.y = r4
            r0.a = r4
            r0.b = r4
            r0.c = r4
            r5 = 3
            r0.x = r5
            r1.getClass()
            r1.m(r4, r3)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            if (r0 != r2) goto L_0x0182
            return r2
        L_0x0182:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
