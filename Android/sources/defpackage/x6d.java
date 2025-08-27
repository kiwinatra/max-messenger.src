package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: x6d  reason: default package */
public final class x6d extends SuspendLambda implements Function2 {
    public final /* synthetic */ long X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ boolean Z;
    public z6d a;
    public Collection b;
    public Iterator c;
    public Collection o;
    public int v;
    public final /* synthetic */ bl4 w;
    public final /* synthetic */ z6d x;
    public final /* synthetic */ long y;
    public final /* synthetic */ long z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x6d(bl4 bl4, z6d z6d, long j, long j2, long j3, int i, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.w = bl4;
        this.x = z6d;
        this.y = j;
        this.z = j2;
        this.X = j3;
        this.Y = i;
        this.Z = z2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new x6d(this.w, this.x, this.y, this.z, this.X, this.Y, this.Z, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((x6d) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0177  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r2 = 5
            r3 = 3
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r0.v
            z6d r6 = r0.x
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L_0x0046
            if (r5 == r8) goto L_0x003e
            if (r5 == r7) goto L_0x0036
            if (r5 != r3) goto L_0x002e
            java.util.Collection r1 = r0.o
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r2 = r0.c
            java.util.Collection r5 = r0.b
            java.util.Collection r5 = (java.util.Collection) r5
            z6d r6 = r0.a
            kotlin.ResultKt.throwOnFailure(r19)
            r7 = r6
            r6 = r2
            r2 = r5
            r5 = r4
            r4 = r3
            r3 = r19
            goto L_0x016e
        L_0x002e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r19)
            r1 = r19
            r5 = r4
            goto L_0x00c5
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r19)
            r1 = r19
            r5 = r4
            goto L_0x0134
        L_0x0046:
            kotlin.ResultKt.throwOnFailure(r19)
            bl4 r5 = r0.w
            int r5 = r5.ordinal()
            r9 = 10
            boolean r10 = r0.Z
            int r11 = r0.Y
            long r12 = r0.X
            long r14 = r0.z
            r16 = r4
            long r3 = r0.y
            if (r5 == 0) goto L_0x00ce
            if (r5 != r8) goto L_0x00c8
            aj9 r5 = r6.d()
            r0.v = r7
            i6d r1 = r5.a
            if (r10 == 0) goto L_0x0097
            sq6 r10 = defpackage.qe9.b
            java.lang.String r10 = "SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire >= ? AND delayed_attrs_time_to_fire <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire ASC LIMIT ?"
            d7d r10 = defpackage.d7d.a(r2, r10)
            r10.k(r8, r3)
            r10.k(r7, r14)
            r3 = 3
            defpackage.i2a.o(r10, r3, r12, r5)
            long r3 = (long) r9
            r7 = 4
            r10.k(r7, r3)
            long r3 = (long) r11
            r10.k(r2, r3)
            android.os.CancellationSignal r3 = new android.os.CancellationSignal
            r3.<init>()
            yi9 r4 = new yi9
            r4.<init>(r5, r10, r2)
            java.lang.Object r1 = defpackage.i8b.q(r1, r3, r4, r0)
        L_0x0094:
            r5 = r16
            goto L_0x00c2
        L_0x0097:
            sq6 r10 = defpackage.qe9.b
            java.lang.String r10 = "SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire >= ? AND delayed_attrs_time_to_fire <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire DESC LIMIT ?"
            d7d r10 = defpackage.d7d.a(r2, r10)
            r10.k(r8, r3)
            r10.k(r7, r14)
            r3 = 3
            defpackage.i2a.o(r10, r3, r12, r5)
            long r3 = (long) r9
            r7 = 4
            r10.k(r7, r3)
            long r3 = (long) r11
            r10.k(r2, r3)
            android.os.CancellationSignal r2 = new android.os.CancellationSignal
            r2.<init>()
            yi9 r3 = new yi9
            r4 = 6
            r3.<init>(r5, r10, r4)
            java.lang.Object r1 = defpackage.i8b.q(r1, r2, r3, r0)
            goto L_0x0094
        L_0x00c2:
            if (r1 != r5) goto L_0x00c5
            return r5
        L_0x00c5:
            java.util.List r1 = (java.util.List) r1
            goto L_0x0136
        L_0x00c8:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00ce:
            r5 = r16
            aj9 r1 = r6.d()
            r0.v = r8
            i6d r9 = r1.a
            if (r10 == 0) goto L_0x0106
            sq6 r10 = defpackage.qe9.b
            java.lang.String r10 = "SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time DESC, time_local DESC LIMIT ?"
            d7d r10 = defpackage.d7d.a(r2, r10)
            r10.k(r8, r3)
            r10.k(r7, r14)
            r3 = 3
            defpackage.i2a.o(r10, r3, r12, r1)
            r3 = 10
            long r3 = (long) r3
            r7 = 4
            r10.k(r7, r3)
            long r3 = (long) r11
            r10.k(r2, r3)
            android.os.CancellationSignal r2 = new android.os.CancellationSignal
            r2.<init>()
            yi9 r3 = new yi9
            r3.<init>(r1, r10, r7)
            java.lang.Object r1 = defpackage.i8b.q(r9, r2, r3, r0)
            goto L_0x0131
        L_0x0106:
            sq6 r10 = defpackage.qe9.b
            java.lang.String r10 = "SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time ASC, time_local ASC LIMIT ?"
            d7d r10 = defpackage.d7d.a(r2, r10)
            r10.k(r8, r3)
            r10.k(r7, r14)
            r3 = 3
            defpackage.i2a.o(r10, r3, r12, r1)
            r4 = 10
            long r7 = (long) r4
            r4 = 4
            r10.k(r4, r7)
            long r7 = (long) r11
            r10.k(r2, r7)
            android.os.CancellationSignal r2 = new android.os.CancellationSignal
            r2.<init>()
            yi9 r4 = new yi9
            r4.<init>(r1, r10, r3)
            java.lang.Object r1 = defpackage.i8b.q(r9, r2, r4, r0)
        L_0x0131:
            if (r1 != r5) goto L_0x0134
            return r5
        L_0x0134:
            java.util.List r1 = (java.util.List) r1
        L_0x0136:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r1, 10)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
            r17 = r2
            r2 = r1
            r1 = r17
        L_0x014a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0177
            java.lang.Object r3 = r2.next()
            ya9 r3 = (defpackage.ya9) r3
            r0.a = r6
            r4 = r1
            java.util.Collection r4 = (java.util.Collection) r4
            r0.b = r4
            r0.c = r2
            r0.o = r4
            r4 = 3
            r0.v = r4
            java.lang.Object r3 = r6.h(r3, r0)
            if (r3 != r5) goto L_0x016b
            return r5
        L_0x016b:
            r7 = r6
            r6 = r2
            r2 = r1
        L_0x016e:
            ha9 r3 = (defpackage.ha9) r3
            r1.add(r3)
            r1 = r2
            r2 = r6
            r6 = r7
            goto L_0x014a
        L_0x0177:
            java.util.List r1 = (java.util.List) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x6d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
