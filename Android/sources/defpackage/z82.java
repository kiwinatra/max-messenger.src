package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: z82  reason: default package */
public final class z82 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ String Y;
    public boolean a;
    public ia2 b;
    public String c;
    public Collection o;
    public Iterator v;
    public Collection w;
    public int x;
    public final /* synthetic */ List y;
    public final /* synthetic */ ia2 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z82(List list, ia2 ia2, boolean z2, String str, Continuation continuation) {
        super(2, continuation);
        this.y = list;
        this.z = ia2;
        this.X = z2;
        this.Y = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new z82(this.y, this.z, this.X, this.Y, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((z82) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f6 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.x
            r3 = 1
            r4 = 4
            r5 = 3
            r6 = 2
            ia2 r7 = r0.z
            r8 = 0
            if (r2 == 0) goto L_0x004a
            if (r2 == r3) goto L_0x0034
            if (r2 == r6) goto L_0x002f
            if (r2 == r5) goto L_0x0026
            if (r2 != r4) goto L_0x001e
            kotlin.ResultKt.throwOnFailure(r18)
            goto L_0x00f7
        L_0x001e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0026:
            ia2 r7 = r0.b
            kotlin.ResultKt.throwOnFailure(r18)
            r2 = r18
            goto L_0x00e9
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r18)
            goto L_0x00d8
        L_0x0034:
            boolean r2 = r0.a
            java.util.Collection r9 = r0.w
            java.util.Collection r9 = (java.util.Collection) r9
            java.util.Iterator r10 = r0.v
            java.util.Collection r11 = r0.o
            java.util.Collection r11 = (java.util.Collection) r11
            java.lang.String r12 = r0.c
            ia2 r13 = r0.b
            kotlin.ResultKt.throwOnFailure(r18)
            r4 = r18
            goto L_0x009e
        L_0x004a:
            kotlin.ResultKt.throwOnFailure(r18)
            java.util.List r2 = r0.y
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r2, 10)
            r9.<init>(r10)
            java.util.Iterator r2 = r2.iterator()
            boolean r10 = r0.X
            java.lang.String r11 = r0.Y
            r13 = r7
            r12 = r11
            r16 = r10
            r10 = r2
            r2 = r16
        L_0x0069:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00b1
            java.lang.Object r11 = r10.next()
            java.lang.Number r11 = (java.lang.Number) r11
            long r14 = r11.longValue()
            if (r2 == 0) goto L_0x00a5
            java.lang.String r11 = defpackage.ia2.K0
            kotlin.Lazy r11 = r13.Z
            java.lang.Object r11 = r11.getValue()
            qx2 r11 = (defpackage.qx2) r11
            r0.b = r13
            r0.c = r12
            r4 = r9
            java.util.Collection r4 = (java.util.Collection) r4
            r0.o = r4
            r0.v = r10
            r0.w = r4
            r0.a = r2
            r0.x = r3
            java.lang.Object r4 = r11.d(r14, r0)
            if (r4 != r1) goto L_0x009d
            return r1
        L_0x009d:
            r11 = r9
        L_0x009e:
            a32 r4 = (defpackage.a32) r4
            m72 r4 = r4.b
            long r14 = r4.a
            goto L_0x00a6
        L_0x00a5:
            r11 = r9
        L_0x00a6:
            r32 r4 = new r32
            r4.<init>(r14, r12)
            r9.add(r4)
            r9 = r11
            r4 = 4
            goto L_0x0069
        L_0x00b1:
            java.util.List r9 = (java.util.List) r9
            java.lang.String r2 = defpackage.ia2.K0
            c6d r2 = r7.g()
            r0.b = r8
            r0.c = r8
            r0.o = r8
            r0.v = r8
            r0.w = r8
            r0.x = r6
            r2.getClass()
            ni r4 = new ni
            r6 = 24
            r4.<init>(r6, r2, r9)
            i6d r2 = r2.a
            java.lang.Object r2 = defpackage.i8b.r(r2, r4, r0)
            if (r2 != r1) goto L_0x00d8
            return r1
        L_0x00d8:
            java.lang.String r2 = defpackage.ia2.K0
            c6d r2 = r7.g()
            r0.b = r7
            r0.x = r5
            java.lang.Object r2 = r2.e(r0)
            if (r2 != r1) goto L_0x00e9
            return r1
        L_0x00e9:
            java.util.List r2 = (java.util.List) r2
            r0.b = r8
            r4 = 4
            r0.x = r4
            java.lang.Object r0 = defpackage.ia2.n(r7, r2, r3, r0)
            if (r0 != r1) goto L_0x00f7
            return r1
        L_0x00f7:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z82.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
