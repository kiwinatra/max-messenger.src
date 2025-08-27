package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;

/* renamed from: zk7  reason: default package */
public final class zk7 extends SuspendLambda implements Function2 {
    public InviteByQrBottomSheet a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ InviteByQrBottomSheet o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zk7(InviteByQrBottomSheet inviteByQrBottomSheet, Continuation continuation) {
        super(2, continuation);
        this.o = inviteByQrBottomSheet;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        zk7 zk7 = new zk7(this.o, continuation);
        zk7.c = obj;
        return zk7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zk7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.b
            one.me.inviteactions.invitebyqr.InviteByQrBottomSheet r2 = r8.o
            r3 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 != r3) goto L_0x001a
            one.me.inviteactions.invitebyqr.InviteByQrBottomSheet r0 = r8.a
            java.lang.Object r8 = r8.c
            d14 r8 = (defpackage.d14) r8
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ all -> 0x0017 }
            goto L_0x005a
        L_0x0017:
            r9 = move-exception
            goto L_0x0093
        L_0x001a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0022:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.c
            d14 r9 = (defpackage.d14) r9
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch:{ all -> 0x0091 }
            kotlin.reflect.KProperty[] r1 = one.me.inviteactions.invitebyqr.InviteByQrBottomSheet.C0     // Catch:{ all -> 0x0091 }
            kotlin.Lazy r1 = r2.A0     // Catch:{ all -> 0x0091 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0091 }
            cl7 r1 = (defpackage.cl7) r1     // Catch:{ all -> 0x0091 }
            r8.c = r9     // Catch:{ all -> 0x0091 }
            r8.a = r2     // Catch:{ all -> 0x0091 }
            r8.b = r3     // Catch:{ all -> 0x0091 }
            kotlin.Lazy r4 = r1.w     // Catch:{ all -> 0x0091 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0091 }
            gaf r4 = (defpackage.gaf) r4     // Catch:{ all -> 0x0091 }
            osa r4 = (defpackage.osa) r4     // Catch:{ all -> 0x0091 }
            q04 r4 = r4.b()     // Catch:{ all -> 0x0091 }
            bl7 r5 = new bl7     // Catch:{ all -> 0x0091 }
            r6 = 0
            r5.<init>(r1, r6)     // Catch:{ all -> 0x0091 }
            java.lang.Object r8 = defpackage.ev0.I(r4, r5, r8)     // Catch:{ all -> 0x0091 }
            if (r8 != r0) goto L_0x0056
            return r0
        L_0x0056:
            r0 = r2
            r7 = r9
            r9 = r8
            r8 = r7
        L_0x005a:
            android.net.Uri r9 = (android.net.Uri) r9     // Catch:{ all -> 0x0017 }
            if (r9 != 0) goto L_0x0061
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0017 }
            return r8
        L_0x0061:
            hr6 r1 = new hr6     // Catch:{ all -> 0x0017 }
            android.content.Context r4 = r0.getContext()     // Catch:{ all -> 0x0017 }
            r1.<init>((android.content.Context) r4)     // Catch:{ all -> 0x0017 }
            o9a r5 = defpackage.sq9.b     // Catch:{ all -> 0x0017 }
            java.lang.String r5 = "image/*"
            java.lang.Object r6 = r1.b     // Catch:{ all -> 0x0017 }
            android.content.Intent r6 = (android.content.Intent) r6     // Catch:{ all -> 0x0017 }
            r6.setType(r5)     // Catch:{ all -> 0x0017 }
            r1.t(r9)     // Catch:{ all -> 0x0017 }
            int r9 = defpackage.ead.e     // Catch:{ all -> 0x0017 }
            java.lang.CharSequence r9 = r4.getText(r9)     // Catch:{ all -> 0x0017 }
            r1.c = r9     // Catch:{ all -> 0x0017 }
            r1.w()     // Catch:{ all -> 0x0017 }
            r0.i0(r3)     // Catch:{ all -> 0x0017 }
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0017 }
            java.lang.Object r9 = kotlin.Result.m23constructorimpl(r9)     // Catch:{ all -> 0x0017 }
            goto L_0x009d
        L_0x008d:
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x0093
        L_0x0091:
            r8 = move-exception
            goto L_0x008d
        L_0x0093:
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r9 = kotlin.ResultKt.createFailure(r9)
            java.lang.Object r9 = kotlin.Result.m23constructorimpl(r9)
        L_0x009d:
            java.lang.Throwable r9 = kotlin.Result.m26exceptionOrNullimpl(r9)
            if (r9 == 0) goto L_0x00bb
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getName()
            java.lang.String r0 = "shareQrCode: failed to share qr code"
            defpackage.z68.f(r8, r0, r9)
            kotlin.Lazy r8 = r2.z0
            java.lang.Object r8 = r8.getValue()
            e0b r8 = (defpackage.e0b) r8
            r8.j()
        L_0x00bb:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zk7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
