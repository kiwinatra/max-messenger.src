package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: z18  reason: default package */
public final class z18 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Context X;
    public a28 a;
    public Context b;
    public Map c;
    public Iterator o;
    public Map v;
    public kf0 w;
    public int x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ a28 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z18(boolean z2, a28 a28, Context context, Continuation continuation) {
        super(2, continuation);
        this.y = z2;
        this.z = a28;
        this.X = context;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new z18(this.y, this.z, this.X, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((z18) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x002b
            if (r2 != r3) goto L_0x0023
            kf0 r2 = r0.w
            java.util.Map r4 = r0.v
            java.util.Iterator r5 = r0.o
            java.util.Map r6 = r0.c
            android.content.Context r7 = r0.b
            a28 r8 = r0.a
            kotlin.ResultKt.throwOnFailure(r17)
            r12 = r8
            r8 = r5
            r5 = r6
            r6 = r17
            goto L_0x00ba
        L_0x0023:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002b:
            kotlin.ResultKt.throwOnFailure(r17)
            boolean r2 = r0.y
            if (r2 == 0) goto L_0x0035
            java.util.List r2 = defpackage.kf0.c
            goto L_0x0037
        L_0x0035:
            java.util.List r2 = defpackage.kf0.b
        L_0x0037:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r2, 10)
            r4.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
        L_0x0046:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x005b
            java.lang.Object r5 = r2.next()
            java.lang.String r5 = (java.lang.String) r5
            kf0 r6 = new kf0
            r6.<init>(r5)
            r4.add(r6)
            goto L_0x0046
        L_0x005b:
            int r2 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r4, 10)
            int r2 = kotlin.collections.MapsKt.mapCapacity(r2)
            r5 = 16
            int r2 = kotlin.ranges.RangesKt.coerceAtLeast((int) r2, (int) r5)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r2)
            java.util.Iterator r2 = r4.iterator()
            a28 r4 = r0.z
            android.content.Context r6 = r0.X
            r12 = r4
            r4 = r5
            r5 = r2
            r2 = r6
        L_0x007a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00c3
            java.lang.Object r6 = r5.next()
            r13 = r6
            kf0 r13 = (defpackage.kf0) r13
            n28 r7 = r12.a
            r0.a = r12
            r0.b = r2
            r0.c = r4
            r0.o = r5
            r0.v = r4
            r0.w = r13
            r0.x = r3
            kotlin.Lazy r6 = r7.a
            java.lang.Object r6 = r6.getValue()
            gaf r6 = (defpackage.gaf) r6
            osa r6 = (defpackage.osa) r6
            q04 r14 = r6.b()
            m28 r15 = new m28
            r11 = 0
            r10 = 0
            r6 = r15
            r8 = r13
            r9 = r2
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.Object r6 = defpackage.ev0.I(r14, r15, r0)
            if (r6 != r1) goto L_0x00b6
            return r1
        L_0x00b6:
            r7 = r2
            r8 = r5
            r2 = r13
            r5 = r4
        L_0x00ba:
            android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6
            r4.put(r2, r6)
            r4 = r5
            r2 = r7
            r5 = r8
            goto L_0x007a
        L_0x00c3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z18.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
