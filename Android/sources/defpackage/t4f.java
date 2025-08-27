package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: t4f  reason: default package */
public final class t4f extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ h5f c;
    public final /* synthetic */ kxf o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t4f(h5f h5f, kxf kxf, Continuation continuation) {
        super(2, continuation);
        this.c = h5f;
        this.o = kxf;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        t4f t4f = new t4f(this.c, this.o, continuation);
        t4f.b = obj;
        return t4f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t4f) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: ds5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.Long} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0025
            if (r1 == r4) goto L_0x001c
            if (r1 != r3) goto L_0x0014
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00e4
        L_0x0014:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x001c:
            java.lang.Object r1 = r11.b
            ds5 r1 = (defpackage.ds5) r1
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00b5
        L_0x0025:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.Object r12 = r11.b
            r1 = r12
            ds5 r1 = (defpackage.ds5) r1
            h5f r12 = r11.c
            java.lang.String r12 = r12.b
            kxf r5 = r11.o
            a67 r6 = defpackage.z68.b
            if (r6 != 0) goto L_0x0038
            goto L_0x0051
        L_0x0038:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x0051
            w78 r7 = defpackage.w78.o
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Starting uploading data="
            r8.<init>(r9)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r6.d(r7, r12, r5, r2)
        L_0x0051:
            h5f r12 = r11.c
            kxf r5 = r11.o
            r12.getClass()
            java.lang.String r6 = r5.a
            kotlin.Result$Companion r7 = kotlin.Result.Companion     // Catch:{ all -> 0x006e }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x006e }
            r7.<init>(r6)     // Catch:{ all -> 0x006e }
            long r6 = r7.lastModified()     // Catch:{ all -> 0x006e }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x006e }
            java.lang.Object r6 = kotlin.Result.m23constructorimpl(r6)     // Catch:{ all -> 0x006e }
            goto L_0x0079
        L_0x006e:
            r6 = move-exception
            kotlin.Result$Companion r7 = kotlin.Result.Companion
            java.lang.Object r6 = kotlin.ResultKt.createFailure(r6)
            java.lang.Object r6 = kotlin.Result.m23constructorimpl(r6)
        L_0x0079:
            r7 = 0
            java.lang.Long r9 = java.lang.Long.valueOf(r7)
            boolean r10 = kotlin.Result.m29isFailureimpl(r6)
            if (r10 == 0) goto L_0x0086
            r6 = r9
        L_0x0086:
            java.lang.Number r6 = (java.lang.Number) r6
            long r9 = r6.longValue()
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x00a6
            long r5 = r5.b
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0097
            goto L_0x00a6
        L_0x0097:
            java.lang.String r11 = r12.b
            java.lang.String r12 = "File is changed during uploading, aborting!"
            defpackage.z68.c(r11, r12, new java.lang.Object[0])
            one.me.sdk.transfer.domain.UploadException r11 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r12 = "Error to upload, file changed"
            r11.<init>(r12)
            throw r11
        L_0x00a6:
            h5f r12 = r11.c
            kxf r5 = r11.o
            r11.b = r1
            r11.a = r4
            java.lang.Object r12 = defpackage.h5f.a(r12, r5, r11)
            if (r12 != r0) goto L_0x00b5
            return r0
        L_0x00b5:
            bxf r12 = (defpackage.bxf) r12
            h5f r4 = r11.c
            java.lang.String r4 = r4.b
            a67 r5 = defpackage.z68.b
            if (r5 != 0) goto L_0x00c0
            goto L_0x00d9
        L_0x00c0:
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x00d9
            w78 r6 = defpackage.w78.o
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Retrieved upload from repository = "
            r7.<init>(r8)
            r7.append(r12)
            java.lang.String r7 = r7.toString()
            r5.d(r6, r4, r7, r2)
        L_0x00d9:
            r11.b = r2
            r11.a = r3
            java.lang.Object r11 = r1.a(r12, r11)
            if (r11 != r0) goto L_0x00e4
            return r0
        L_0x00e4:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t4f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
