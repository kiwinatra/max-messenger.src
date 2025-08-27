package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ajg  reason: default package */
public final class ajg extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ hjg b;
    public final /* synthetic */ String c;
    public final /* synthetic */ byte[] o;
    public final /* synthetic */ String v;
    public final /* synthetic */ String w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajg(hjg hjg, String str, byte[] bArr, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.b = hjg;
        this.c = str;
        this.o = bArr;
        this.v = str2;
        this.w = str3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ajg(this.b, this.c, this.o, this.v, this.w, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ajg) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        r4 = r6.w;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        r3 = r6.v;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.a
            r2 = 1
            if (r1 == 0) goto L_0x0017
            if (r1 != r2) goto L_0x000f
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0062
        L_0x000f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0017:
            kotlin.ResultKt.throwOnFailure(r7)
            hjg r7 = r6.b
            tgg r7 = r7.A0
            r6.a = r2
            r7.getClass()
            yo7 r1 = defpackage.yo7.d
            r1.getClass()
            vjg r2 = defpackage.wjg.Companion
            aq7 r2 = r2.serializer()
            java.lang.String r3 = r6.c
            java.lang.Object r1 = r1.a(r2, r3)
            wjg r1 = (defpackage.wjg) r1
            byte[] r2 = r6.o
            if (r2 == 0) goto L_0x0048
            java.lang.String r3 = r6.v
            if (r3 == 0) goto L_0x0048
            java.lang.String r4 = r6.w
            if (r4 == 0) goto L_0x0048
            tjg r5 = new tjg
            r5.<init>(r3, r4, r2)
            goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            no7 r2 = new no7
            r2.<init>(r1, r5)
            java.lang.Object r7 = r7.o
            ru0 r7 = (defpackage.ru0) r7
            java.lang.Object r6 = r7.t(r2, r6)
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r6 != r7) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
        L_0x005f:
            if (r6 != r0) goto L_0x0062
            return r0
        L_0x0062:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
