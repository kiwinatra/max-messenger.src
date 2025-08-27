package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;

/* renamed from: uu5  reason: default package */
public final class uu5 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object o;
    public final /* synthetic */ Object v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uu5(Object obj, Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.a = i;
        this.o = obj;
        this.v = obj2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                uu5 uu5 = new uu5((Object) (Function2) this.v, (Continuation) obj3, 0);
                uu5.c = (ds5) obj;
                uu5.o = obj2;
                return uu5.invokeSuspend(Unit.INSTANCE);
            case 1:
                uu5 uu52 = new uu5((Continuation) obj3, (Object) (Function4) this.v, 1);
                uu52.c = (ds5) obj;
                uu52.o = (Object[]) obj2;
                return uu52.invokeSuspend(Unit.INSTANCE);
            case 2:
                uu5 uu53 = new uu5((Continuation) obj3, (Object) (Function5) this.v, 2);
                uu53.c = (ds5) obj;
                uu53.o = (Object[]) obj2;
                return uu53.invokeSuspend(Unit.INSTANCE);
            case 3:
                uu5 uu54 = new uu5((Continuation) obj3, (Object) (Function6) this.v, 3);
                uu54.c = (ds5) obj;
                uu54.o = (Object[]) obj2;
                return uu54.invokeSuspend(Unit.INSTANCE);
            case 4:
                uu5 uu55 = new uu5((Object) (Function3) this.v, (Continuation) obj3, 4);
                uu55.c = (ds5) obj;
                uu55.o = (Object[]) obj2;
                return uu55.invokeSuspend(Unit.INSTANCE);
            case 5:
                uu5 uu56 = new uu5((Object) (by7) this.v, (Continuation) obj3, 5);
                uu56.c = (ds5) obj;
                uu56.o = (Throwable) obj2;
                return uu56.invokeSuspend(Unit.INSTANCE);
            case 6:
                uu5 uu57 = new uu5((Object) (r49) this.v, (Continuation) obj3, 6);
                uu57.c = (List) obj;
                uu57.o = (n39) obj2;
                return uu57.invokeSuspend(Unit.INSTANCE);
            case 7:
                uu5 uu58 = new uu5((Continuation) obj3, (Object) (r49) this.v, 7);
                uu58.c = (ds5) obj;
                uu58.o = obj2;
                return uu58.invokeSuspend(Unit.INSTANCE);
            case 8:
                uu5 uu59 = new uu5((Continuation) obj3, (Object) (kee) this.v, 8);
                uu59.c = (ds5) obj;
                uu59.o = obj2;
                return uu59.invokeSuspend(Unit.INSTANCE);
            case 9:
                ds5 ds5 = (ds5) obj;
                uu5 uu510 = new uu5((h5f) this.o, (kxf) this.v, (Continuation) obj3, 9);
                uu510.c = (Throwable) obj2;
                return uu510.invokeSuspend(Unit.INSTANCE);
            case 10:
                ds5 ds52 = (ds5) obj;
                uu5 uu511 = new uu5((h5f) this.o, (bxf) this.v, (Continuation) obj3, 10);
                uu511.c = (Throwable) obj2;
                return uu511.invokeSuspend(Unit.INSTANCE);
            default:
                ds5 ds53 = (ds5) obj;
                uu5 uu512 = new uu5((l5f) this.o, (qf9) this.v, (Continuation) obj3, 11);
                uu512.c = (Throwable) obj2;
                return uu512.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: ds5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: ds5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: ds5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: ds5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: ds5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.a
            switch(r0) {
                case 0: goto L_0x0411;
                case 1: goto L_0x03b6;
                case 2: goto L_0x0356;
                case 3: goto L_0x02f3;
                case 4: goto L_0x02a2;
                case 5: goto L_0x0260;
                case 6: goto L_0x0225;
                case 7: goto L_0x01ce;
                case 8: goto L_0x0150;
                case 9: goto L_0x00fb;
                case 10: goto L_0x0061;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.b
            r2 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r2) goto L_0x0018
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0018:
            java.lang.Object r12 = r12.c
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x005f
        L_0x0020:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Object r13 = r12.c
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            boolean r1 = r13 instanceof ru.ok.tamtam.errors.TamErrorException
            if (r1 == 0) goto L_0x003c
            r1 = r13
            ru.ok.tamtam.errors.TamErrorException r1 = (ru.ok.tamtam.errors.TamErrorException) r1
            qaf r1 = r1.a
            java.lang.String r1 = r1.b
            java.lang.String r3 = "invalid.token"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x003c
            r1 = r2
            goto L_0x003d
        L_0x003c:
            r1 = 0
        L_0x003d:
            java.lang.Object r3 = r12.o
            l5f r3 = (defpackage.l5f) r3
            if (r1 == 0) goto L_0x0060
            java.lang.Object r1 = r12.v
            qf9 r1 = (defpackage.qf9) r1
            kxf r1 = defpackage.l5f.a(r3, r1)
            kotlin.Lazy r3 = r3.b
            java.lang.Object r3 = r3.getValue()
            h5f r3 = (defpackage.h5f) r3
            r12.c = r13
            r12.b = r2
            java.lang.Object r12 = r3.d(r1, r12)
            if (r12 != r0) goto L_0x005e
            return r0
        L_0x005e:
            r12 = r13
        L_0x005f:
            r13 = r12
        L_0x0060:
            throw r13
        L_0x0061:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.b
            r2 = 1
            if (r1 == 0) goto L_0x007c
            if (r1 == r2) goto L_0x0074
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0074:
            java.lang.Object r12 = r12.c
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x00ba
        L_0x007c:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Object r13 = r12.c
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            boolean r1 = r13 instanceof one.me.sdk.transfer.exceptions.TamHttpUrlExpiredException
            java.lang.Object r3 = r12.v
            bxf r3 = (defpackage.bxf) r3
            java.lang.Object r4 = r12.o
            h5f r4 = (defpackage.h5f) r4
            if (r1 == 0) goto L_0x00bb
            r12.c = r13
            r12.b = r2
            java.lang.String r1 = r4.b
            java.lang.String r2 = "Url is expired, reset it in repository"
            defpackage.z68.p(r1, r2)
            axf r1 = r3.b()
            r2 = 0
            r1.d = r2
            r2 = 0
            r1.e = r2
            bxf r2 = new bxf
            r2.<init>(r1)
            java.lang.Object r12 = r4.f(r2, r12)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r12 != r1) goto L_0x00b4
            goto L_0x00b6
        L_0x00b4:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
        L_0x00b6:
            if (r12 != r0) goto L_0x00b9
            return r0
        L_0x00b9:
            r12 = r13
        L_0x00ba:
            throw r12
        L_0x00bb:
            kotlin.Lazy r12 = r4.d
            java.lang.Object r12 = r12.getValue()
            x23 r12 = (defpackage.x23) r12
            a33 r12 = (defpackage.a33) r12
            r12.getClass()
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.DAYS
            r0 = 7
            long r5 = r12.toMillis(r0)
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x00fa
            long r5 = java.lang.System.currentTimeMillis()
            long r2 = r3.i
            long r5 = r5 - r2
            kotlin.Lazy r2 = r4.d
            java.lang.Object r2 = r2.getValue()
            x23 r2 = (defpackage.x23) r2
            a33 r2 = (defpackage.a33) r2
            r2.getClass()
            long r0 = r12.toMillis(r0)
            int r12 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r12 <= 0) goto L_0x00fa
            ru.ok.tamtam.rx.TamTamObservables$TamObservableException r12 = new ru.ok.tamtam.rx.TamTamObservables$TamObservableException
            java.lang.String r0 = "timeout reached"
            r12.<init>(r0, r13)
            throw r12
        L_0x00fa:
            throw r13
        L_0x00fb:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.b
            r2 = 1
            if (r1 == 0) goto L_0x0116
            if (r1 == r2) goto L_0x010e
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x010e:
            java.lang.Object r12 = r12.c
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x014f
        L_0x0116:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Object r13 = r12.c
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            java.lang.Object r1 = r12.o
            h5f r1 = (defpackage.h5f) r1
            java.lang.String r3 = r1.b
            java.lang.String r4 = "Got error during upload"
            defpackage.z68.f(r3, r4, r13)
            yqf r3 = r1.a
            kotlin.Lazy r3 = r3.d
            java.lang.Object r3 = r3.getValue()
            m95 r3 = (defpackage.m95) r3
            ru.ok.tamtam.ExceptionHandler$HandledException r4 = new ru.ok.tamtam.ExceptionHandler$HandledException
            r5 = 0
            java.lang.String r6 = "ONEME-11028"
            r4.<init>(r5, r13, r2, r6)
            uta r3 = (defpackage.uta) r3
            r3.c(r4, r2)
            r12.c = r13
            r12.b = r2
            java.lang.Object r2 = r12.v
            kxf r2 = (defpackage.kxf) r2
            java.lang.Object r12 = r1.h(r2, r12)
            if (r12 != r0) goto L_0x014e
            return r0
        L_0x014e:
            r12 = r13
        L_0x014f:
            throw r12
        L_0x0150:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.b
            r2 = 1
            if (r1 == 0) goto L_0x0167
            if (r1 != r2) goto L_0x015f
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x01cb
        L_0x015f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0167:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Object r13 = r12.c
            ds5 r13 = (defpackage.ds5) r13
            java.lang.Object r1 = r12.o
            java.lang.Number r1 = (java.lang.Number) r1
            r1.intValue()
            java.lang.Object r1 = r12.v
            kee r1 = (defpackage.kee) r1
            kotlin.Lazy r3 = r1.e
            java.lang.Object r3 = r3.getValue()
            qx2 r3 = (defpackage.qx2) r3
            long r4 = r1.a
            my2 r3 = (defpackage.my2) r3
            etc r3 = r3.o(r4)
            on2 r4 = new on2
            r5 = 28
            r4.<init>(r3, r5)
            kotlin.Lazy r3 = r1.f
            java.lang.Object r3 = r3.getValue()
            eu3 r3 = (defpackage.eu3) r3
            long r5 = r1.d
            etc r3 = r3.c(r5)
            on2 r5 = new on2
            r6 = 28
            r5.<init>(r3, r6)
            zpd r3 = new zpd
            r6 = 0
            r7 = 1
            r3.<init>((java.lang.Object) r1, (kotlin.coroutines.Continuation) r6, (int) r7)
            i21 r6 = new i21
            r7 = 4
            r6.<init>(r4, r5, r3, r7)
            bs5 r3 = defpackage.bs0.w(r6)
            gaf r1 = r1.c
            osa r1 = (defpackage.osa) r1
            q04 r1 = r1.b()
            bs5 r1 = defpackage.bs0.F(r3, r1)
            r12.b = r2
            java.lang.Object r12 = defpackage.bs0.x(r1, r13, r12)
            if (r12 != r0) goto L_0x01cb
            goto L_0x01cd
        L_0x01cb:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x01cd:
            return r0
        L_0x01ce:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.b
            r2 = 1
            if (r1 == 0) goto L_0x01e5
            if (r1 != r2) goto L_0x01dd
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0222
        L_0x01dd:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x01e5:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Object r13 = r12.c
            ds5 r13 = (defpackage.ds5) r13
            java.lang.Object r1 = r12.o
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r3 = r12.v
            r49 r3 = (defpackage.r49) r3
            t39 r4 = r3.x
            n6e r4 = r4.a
            dtc r5 = new dtc
            r5.<init>(r4)
            uu5 r4 = new uu5
            r6 = 0
            r7 = 6
            r4.<init>((java.lang.Object) r3, (kotlin.coroutines.Continuation) r6, (int) r7)
            i21 r3 = new i21
            r3.<init>(r1, r5, r4)
            m49 r4 = new m49
            r4.<init>(r1, r6)
            ps5 r1 = new ps5
            r1.<init>(r3, r4)
            r3 = 200(0xc8, double:9.9E-322)
            bs5 r1 = defpackage.bs0.v(r1, r3)
            r12.b = r2
            java.lang.Object r12 = defpackage.bs0.x(r1, r13, r12)
            if (r12 != r0) goto L_0x0222
            goto L_0x0224
        L_0x0222:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x0224:
            return r0
        L_0x0225:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.b
            r2 = 1
            if (r1 == 0) goto L_0x023c
            if (r1 != r2) goto L_0x0234
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0259
        L_0x0234:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x023c:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Object r13 = r12.c
            java.util.List r13 = (java.util.List) r13
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r1 = r12.o
            n39 r1 = (defpackage.n39) r1
            r3 = 0
            r12.c = r3
            r12.b = r2
            java.lang.Object r2 = r12.v
            r49 r2 = (defpackage.r49) r2
            java.lang.Object r13 = defpackage.r49.j(r1, r2, r13, r12)
            if (r13 != r0) goto L_0x0259
            goto L_0x025f
        L_0x0259:
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.List r0 = kotlin.collections.CollectionsKt.toList(r13)
        L_0x025f:
            return r0
        L_0x0260:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.b
            r2 = 1
            if (r1 == 0) goto L_0x0277
            if (r1 != r2) goto L_0x026f
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x029f
        L_0x026f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0277:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Object r13 = r12.c
            ds5 r13 = (defpackage.ds5) r13
            java.lang.Object r1 = r12.o
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            boolean r3 = r1 instanceof java.util.concurrent.CancellationException
            if (r3 != 0) goto L_0x029f
            java.lang.Object r3 = r12.v
            by7 r3 = (defpackage.by7) r3
            java.lang.String r3 = r3.r
            java.lang.String r4 = "fail"
            defpackage.z68.f(r3, r4, r1)
            uw7 r1 = defpackage.uw7.a
            r3 = 0
            r12.c = r3
            r12.b = r2
            java.lang.Object r12 = r13.a(r1, r12)
            if (r12 != r0) goto L_0x029f
            goto L_0x02a1
        L_0x029f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x02a1:
            return r0
        L_0x02a2:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x02c4
            if (r1 == r3) goto L_0x02bc
            if (r1 != r2) goto L_0x02b4
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x02f0
        L_0x02b4:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x02bc:
            java.lang.Object r1 = r12.c
            ds5 r1 = (defpackage.ds5) r1
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x02e4
        L_0x02c4:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Object r13 = r12.c
            r1 = r13
            ds5 r1 = (defpackage.ds5) r1
            java.lang.Object r13 = r12.o
            java.lang.Object[] r13 = (java.lang.Object[]) r13
            r4 = 0
            r4 = r13[r4]
            r13 = r13[r3]
            r12.c = r1
            r12.b = r3
            java.lang.Object r3 = r12.v
            kotlin.jvm.functions.Function3 r3 = (kotlin.jvm.functions.Function3) r3
            java.lang.Object r13 = r3.invoke(r4, r13, r12)
            if (r13 != r0) goto L_0x02e4
            goto L_0x02f2
        L_0x02e4:
            r3 = 0
            r12.c = r3
            r12.b = r2
            java.lang.Object r12 = r1.a(r13, r12)
            if (r12 != r0) goto L_0x02f0
            goto L_0x02f2
        L_0x02f0:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x02f2:
            return r0
        L_0x02f3:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0315
            if (r1 == r3) goto L_0x030d
            if (r1 != r2) goto L_0x0305
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0353
        L_0x0305:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x030d:
            java.lang.Object r1 = r12.c
            ds5 r1 = (defpackage.ds5) r1
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0347
        L_0x0315:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Object r13 = r12.c
            r1 = r13
            ds5 r1 = (defpackage.ds5) r1
            java.lang.Object r13 = r12.o
            java.lang.Object[] r13 = (java.lang.Object[]) r13
            r4 = 0
            r6 = r13[r4]
            r7 = r13[r3]
            r8 = r13[r2]
            r4 = 3
            r9 = r13[r4]
            r4 = 4
            r10 = r13[r4]
            r12.c = r1
            r12.b = r3
            r13 = 6
            kotlin.jvm.internal.InlineMarker.mark((int) r13)
            java.lang.Object r13 = r12.v
            r5 = r13
            kotlin.jvm.functions.Function6 r5 = (kotlin.jvm.functions.Function6) r5
            r11 = r12
            java.lang.Object r13 = r5.invoke(r6, r7, r8, r9, r10, r11)
            r3 = 7
            kotlin.jvm.internal.InlineMarker.mark((int) r3)
            if (r13 != r0) goto L_0x0347
            goto L_0x0355
        L_0x0347:
            r3 = 0
            r12.c = r3
            r12.b = r2
            java.lang.Object r12 = r1.a(r13, r12)
            if (r12 != r0) goto L_0x0353
            goto L_0x0355
        L_0x0353:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x0355:
            return r0
        L_0x0356:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0378
            if (r1 == r3) goto L_0x0370
            if (r1 != r2) goto L_0x0368
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x03b3
        L_0x0368:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0370:
            java.lang.Object r1 = r12.c
            ds5 r1 = (defpackage.ds5) r1
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x03a7
        L_0x0378:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Object r13 = r12.c
            r1 = r13
            ds5 r1 = (defpackage.ds5) r1
            java.lang.Object r13 = r12.o
            java.lang.Object[] r13 = (java.lang.Object[]) r13
            r4 = 0
            r6 = r13[r4]
            r7 = r13[r3]
            r8 = r13[r2]
            r4 = 3
            r9 = r13[r4]
            r12.c = r1
            r12.b = r3
            r13 = 6
            kotlin.jvm.internal.InlineMarker.mark((int) r13)
            java.lang.Object r13 = r12.v
            r5 = r13
            kotlin.jvm.functions.Function5 r5 = (kotlin.jvm.functions.Function5) r5
            r10 = r12
            java.lang.Object r13 = r5.invoke(r6, r7, r8, r9, r10)
            r3 = 7
            kotlin.jvm.internal.InlineMarker.mark((int) r3)
            if (r13 != r0) goto L_0x03a7
            goto L_0x03b5
        L_0x03a7:
            r3 = 0
            r12.c = r3
            r12.b = r2
            java.lang.Object r12 = r1.a(r13, r12)
            if (r12 != r0) goto L_0x03b3
            goto L_0x03b5
        L_0x03b3:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x03b5:
            return r0
        L_0x03b6:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x03d8
            if (r1 == r3) goto L_0x03d0
            if (r1 != r2) goto L_0x03c8
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x040e
        L_0x03c8:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x03d0:
            java.lang.Object r1 = r12.c
            ds5 r1 = (defpackage.ds5) r1
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0402
        L_0x03d8:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Object r13 = r12.c
            r1 = r13
            ds5 r1 = (defpackage.ds5) r1
            java.lang.Object r13 = r12.o
            java.lang.Object[] r13 = (java.lang.Object[]) r13
            r4 = 0
            r4 = r13[r4]
            r5 = r13[r3]
            r13 = r13[r2]
            r12.c = r1
            r12.b = r3
            r3 = 6
            kotlin.jvm.internal.InlineMarker.mark((int) r3)
            java.lang.Object r3 = r12.v
            kotlin.jvm.functions.Function4 r3 = (kotlin.jvm.functions.Function4) r3
            java.lang.Object r13 = r3.invoke(r4, r5, r13, r12)
            r3 = 7
            kotlin.jvm.internal.InlineMarker.mark((int) r3)
            if (r13 != r0) goto L_0x0402
            goto L_0x0410
        L_0x0402:
            r3 = 0
            r12.c = r3
            r12.b = r2
            java.lang.Object r12 = r1.a(r13, r12)
            if (r12 != r0) goto L_0x040e
            goto L_0x0410
        L_0x040e:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x0410:
            return r0
        L_0x0411:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0433
            if (r1 == r3) goto L_0x042b
            if (r1 != r2) goto L_0x0423
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0458
        L_0x0423:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x042b:
            java.lang.Object r1 = r12.c
            ds5 r1 = (defpackage.ds5) r1
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x044c
        L_0x0433:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Object r13 = r12.c
            r1 = r13
            ds5 r1 = (defpackage.ds5) r1
            java.lang.Object r13 = r12.o
            r12.c = r1
            r12.b = r3
            java.lang.Object r3 = r12.v
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            java.lang.Object r13 = r3.invoke(r13, r12)
            if (r13 != r0) goto L_0x044c
            goto L_0x045a
        L_0x044c:
            r3 = 0
            r12.c = r3
            r12.b = r2
            java.lang.Object r12 = r1.a(r13, r12)
            if (r12 != r0) goto L_0x0458
            goto L_0x045a
        L_0x0458:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x045a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uu5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uu5(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.a = i;
        this.v = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uu5(Continuation continuation, Object obj, int i) {
        super(3, continuation);
        this.a = i;
        this.v = obj;
    }
}
