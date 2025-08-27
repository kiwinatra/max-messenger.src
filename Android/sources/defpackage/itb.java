package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: itb  reason: default package */
public final class itb extends SuspendLambda implements Function2 {
    public npg a;
    public Context b;
    public Iterator c;
    public Map.Entry o;
    public int v;
    public final /* synthetic */ npg w;
    public final /* synthetic */ Context x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public itb(npg npg, Context context, Continuation continuation) {
        super(2, continuation);
        this.w = npg;
        this.x = context;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new itb(this.w, this.x, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((itb) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.util.Map$Entry} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.v
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 != r3) goto L_0x0018
            java.util.Map$Entry r1 = r9.o
            java.util.Iterator r4 = r9.c
            android.content.Context r5 = r9.b
            npg r6 = r9.a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x007b
        L_0x0018:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0020:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.String r10 = "Prefetch chat themes."
            java.lang.String r1 = "PrefetchThemeBackgroundUseCase"
            defpackage.z68.c(r1, r10, new java.lang.Object[0])
            npg r10 = r9.w
            java.lang.Object r1 = r10.b
            kotlin.Lazy r1 = (kotlin.Lazy) r1
            java.lang.Object r1 = r1.getValue()
            ff0 r1 = (defpackage.ff0) r1
            r1.getClass()
            android.content.Context r1 = r9.x
            java.util.LinkedHashMap r4 = defpackage.ff0.b(r1, r2)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            r6 = r10
            r5 = r1
        L_0x0049:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x009a
            java.lang.Object r10 = r4.next()
            r1 = r10
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r10 = r1.getValue()
            m1g r10 = (defpackage.m1g) r10
            l1g r10 = r10.a
            if (r10 == 0) goto L_0x007e
            java.lang.Object r7 = r6.b
            kotlin.Lazy r7 = (kotlin.Lazy) r7
            java.lang.Object r7 = r7.getValue()
            ff0 r7 = (defpackage.ff0) r7
            r9.a = r6
            r9.b = r5
            r9.c = r4
            r9.o = r1
            r9.v = r3
            java.lang.Object r10 = r7.c(r5, r10, r9)
            if (r10 != r0) goto L_0x007b
            return r0
        L_0x007b:
            o5f r10 = (defpackage.o5f) r10
            goto L_0x007f
        L_0x007e:
            r10 = r2
        L_0x007f:
            uhf r7 = new uhf
            java.lang.Object r8 = r1.getValue()
            m1g r8 = (defpackage.m1g) r8
            thf r10 = defpackage.ld8.B0(r8, r10)
            r7.<init>(r10)
            android.util.LruCache r10 = defpackage.qhf.a
            java.lang.Object r10 = r1.getKey()
            kf0 r10 = (defpackage.kf0) r10
            defpackage.qhf.a(r10, r7)
            goto L_0x0049
        L_0x009a:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.itb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
