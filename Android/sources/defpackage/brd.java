package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: brd  reason: default package */
public final class brd extends SuspendLambda implements Function2 {
    public final /* synthetic */ drd a;
    public final /* synthetic */ long b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public brd(drd drd, long j, Continuation continuation) {
        super(2, continuation);
        this.a = drd;
        this.b = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new brd(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((brd) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0059, code lost:
        r6 = r7.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r7)
            drd r7 = r6.a
            zqd r7 = r7.a
            r7.getClass()
            java.lang.String r0 = "SELECT * FROM selected_mentions WHERE id = ?"
            r1 = 1
            d7d r0 = defpackage.d7d.a(r1, r0)
            long r2 = r6.b
            r0.k(r1, r2)
            java.lang.Object r6 = r7.b
            i6d r6 = (defpackage.i6d) r6
            r6.b()
            r7 = 0
            android.database.Cursor r6 = r6.o(r0, r7)
            java.lang.String r2 = "id"
            int r2 = defpackage.kne.u(r6, r2)     // Catch:{ all -> 0x004f }
            java.lang.String r3 = "selectedMentionType"
            int r3 = defpackage.kne.u(r6, r3)     // Catch:{ all -> 0x004f }
            boolean r4 = r6.moveToFirst()     // Catch:{ all -> 0x004f }
            if (r4 == 0) goto L_0x0051
            long r4 = r6.getLong(r2)     // Catch:{ all -> 0x004f }
            int r7 = r6.getInt(r3)     // Catch:{ all -> 0x004f }
            erd r2 = defpackage.erd.a     // Catch:{ all -> 0x004f }
            if (r7 != 0) goto L_0x0044
            goto L_0x0049
        L_0x0044:
            erd r3 = defpackage.erd.b     // Catch:{ all -> 0x004f }
            if (r7 != r1) goto L_0x0049
            r2 = r3
        L_0x0049:
            yqd r7 = new yqd     // Catch:{ all -> 0x004f }
            r7.<init>(r4, r2)     // Catch:{ all -> 0x004f }
            goto L_0x0051
        L_0x004f:
            r7 = move-exception
            goto L_0x0060
        L_0x0051:
            r6.close()
            r0.o()
            if (r7 == 0) goto L_0x005d
            erd r6 = r7.b
            if (r6 != 0) goto L_0x005f
        L_0x005d:
            erd r6 = defpackage.erd.a
        L_0x005f:
            return r6
        L_0x0060:
            r6.close()
            r0.o()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
