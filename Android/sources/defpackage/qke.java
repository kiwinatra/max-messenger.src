package defpackage;

import android.content.Context;
import androidx.fragment.app.c;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: qke  reason: default package */
public final class qke extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ boolean c = false;
    public final /* synthetic */ Context o;
    public final /* synthetic */ c v;
    public final /* synthetic */ Ref.ObjectRef w;
    public final /* synthetic */ d19 x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qke(etc etc, Continuation continuation, Context context, c cVar, Ref.ObjectRef objectRef, d19 d19) {
        super(2, continuation);
        this.b = etc;
        this.o = context;
        this.v = cVar;
        this.w = objectRef;
        this.x = d19;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        Continuation continuation2 = continuation;
        qke qke = new qke((etc) this.b, continuation2, this.o, this.v, this.w, this.x);
        qke.a = obj;
        return qke;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qke) create((o85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r12v18, types: [androidx.fragment.app.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.Object r12 = r11.a
            o85 r12 = (defpackage.o85) r12
            java.lang.Object r12 = r12.a()
            java.lang.Throwable r0 = kotlin.Result.m26exceptionOrNullimpl(r12)
            if (r0 != 0) goto L_0x0193
            hke r12 = (defpackage.hke) r12     // Catch:{ all -> 0x004a }
            boolean r0 = r12 instanceof defpackage.cke     // Catch:{ all -> 0x004a }
            android.content.Context r1 = r11.o
            if (r0 == 0) goto L_0x00cf
            r0 = r12
            cke r0 = (defpackage.cke) r0     // Catch:{ all -> 0x004a }
            boolean r2 = r0 instanceof defpackage.xje     // Catch:{ all -> 0x004a }
            if (r2 == 0) goto L_0x004d
            r0 = r12
            xje r0 = (defpackage.xje) r0     // Catch:{ all -> 0x004a }
            d4g r0 = r0.a     // Catch:{ all -> 0x004a }
            r2 = r12
            xje r2 = (defpackage.xje) r2     // Catch:{ all -> 0x004a }
            boolean r2 = r2.b     // Catch:{ all -> 0x004a }
            xje r12 = (defpackage.xje) r12     // Catch:{ all -> 0x004a }
            boolean r12 = r12.c     // Catch:{ all -> 0x004a }
            int r12 = defpackage.e6.z0     // Catch:{ all -> 0x004a }
            android.content.Intent r12 = new android.content.Intent     // Catch:{ all -> 0x004a }
            java.lang.Class<e6> r2 = defpackage.e6.class
            r12.<init>(r1, r2)     // Catch:{ all -> 0x004a }
            r2 = 335577088(0x14008000, float:6.487592E-27)
            r12.addFlags(r2)     // Catch:{ all -> 0x004a }
            java.lang.String r2 = "ru.ok.tamtam.extra.VIDEO_CONFERENCE"
            r12.putExtra(r2, r0)     // Catch:{ all -> 0x004a }
            r1.startActivity(r12)     // Catch:{ all -> 0x004a }
            goto L_0x0172
        L_0x004a:
            r12 = move-exception
            goto L_0x017f
        L_0x004d:
            boolean r2 = r0 instanceof defpackage.yje     // Catch:{ all -> 0x004a }
            if (r2 == 0) goto L_0x006e
            r0 = r12
            yje r0 = (defpackage.yje) r0     // Catch:{ all -> 0x004a }
            v21 r2 = r0.a     // Catch:{ all -> 0x004a }
            r0 = r12
            yje r0 = (defpackage.yje) r0     // Catch:{ all -> 0x004a }
            d4g r8 = r0.b     // Catch:{ all -> 0x004a }
            r0 = r12
            yje r0 = (defpackage.yje) r0     // Catch:{ all -> 0x004a }
            boolean r9 = r0.c     // Catch:{ all -> 0x004a }
            yje r12 = (defpackage.yje) r12     // Catch:{ all -> 0x004a }
            boolean r10 = r12.d     // Catch:{ all -> 0x004a }
            r3 = 0
            r5 = 0
            r7 = 0
            defpackage.n5.T(r1, r2, r3, r5, r7, r8, r9, r10)     // Catch:{ all -> 0x004a }
            goto L_0x0172
        L_0x006e:
            boolean r2 = r0 instanceof defpackage.ake     // Catch:{ all -> 0x004a }
            if (r2 == 0) goto L_0x008e
            r0 = r12
            ake r0 = (defpackage.ake) r0     // Catch:{ all -> 0x004a }
            v21 r2 = r0.a     // Catch:{ all -> 0x004a }
            r0 = r12
            ake r0 = (defpackage.ake) r0     // Catch:{ all -> 0x004a }
            long r5 = r0.b     // Catch:{ all -> 0x004a }
            r0 = r12
            ake r0 = (defpackage.ake) r0     // Catch:{ all -> 0x004a }
            boolean r9 = r0.c     // Catch:{ all -> 0x004a }
            ake r12 = (defpackage.ake) r12     // Catch:{ all -> 0x004a }
            boolean r10 = r12.d     // Catch:{ all -> 0x004a }
            r3 = 0
            r7 = 0
            r8 = 0
            defpackage.n5.T(r1, r2, r3, r5, r7, r8, r9, r10)     // Catch:{ all -> 0x004a }
            goto L_0x0172
        L_0x008e:
            boolean r2 = r0 instanceof defpackage.bke     // Catch:{ all -> 0x004a }
            if (r2 == 0) goto L_0x00ae
            r0 = r12
            bke r0 = (defpackage.bke) r0     // Catch:{ all -> 0x004a }
            v21 r2 = r0.a     // Catch:{ all -> 0x004a }
            r0 = r12
            bke r0 = (defpackage.bke) r0     // Catch:{ all -> 0x004a }
            long r3 = r0.b     // Catch:{ all -> 0x004a }
            r0 = r12
            bke r0 = (defpackage.bke) r0     // Catch:{ all -> 0x004a }
            boolean r9 = r0.c     // Catch:{ all -> 0x004a }
            bke r12 = (defpackage.bke) r12     // Catch:{ all -> 0x004a }
            boolean r10 = r12.d     // Catch:{ all -> 0x004a }
            r5 = 0
            r7 = 0
            r8 = 0
            defpackage.n5.T(r1, r2, r3, r5, r7, r8, r9, r10)     // Catch:{ all -> 0x004a }
            goto L_0x0172
        L_0x00ae:
            boolean r0 = r0 instanceof defpackage.zje     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x00c9
            r0 = r12
            zje r0 = (defpackage.zje) r0     // Catch:{ all -> 0x004a }
            v21 r2 = r0.a     // Catch:{ all -> 0x004a }
            zje r12 = (defpackage.zje) r12     // Catch:{ all -> 0x004a }
            r12.getClass()     // Catch:{ all -> 0x004a }
            r10 = 0
            r3 = 0
            r5 = 0
            r7 = 1
            r9 = 0
            r8 = 0
            defpackage.n5.T(r1, r2, r3, r5, r7, r8, r9, r10)     // Catch:{ all -> 0x004a }
            goto L_0x0172
        L_0x00c9:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x004a }
            r12.<init>()     // Catch:{ all -> 0x004a }
            throw r12     // Catch:{ all -> 0x004a }
        L_0x00cf:
            boolean r0 = r12 instanceof defpackage.fke     // Catch:{ all -> 0x004a }
            r2 = 0
            java.lang.String r3 = "CallDialog"
            androidx.fragment.app.c r4 = r11.v
            if (r0 == 0) goto L_0x0111
            ru.ok.tamtam.calls.CallDialogFragment r0 = new ru.ok.tamtam.calls.CallDialogFragment     // Catch:{ all -> 0x004a }
            fke r12 = (defpackage.fke) r12     // Catch:{ all -> 0x004a }
            f41 r12 = r12.a     // Catch:{ all -> 0x004a }
            r0.<init>()     // Catch:{ all -> 0x004a }
            r12.getClass()     // Catch:{ all -> 0x004a }
            java.lang.String r1 = "CallDialogInput"
            kotlin.Pair r12 = kotlin.TuplesKt.to(r1, r12)     // Catch:{ all -> 0x004a }
            kotlin.Pair[] r12 = new kotlin.Pair[]{r12}     // Catch:{ all -> 0x004a }
            android.os.Bundle r12 = defpackage.o54.f(r12)     // Catch:{ all -> 0x004a }
            r0.L2(r12)     // Catch:{ all -> 0x004a }
            r0.Y2(r4, r3)     // Catch:{ all -> 0x004a }
            lv7 r12 = r0.b1     // Catch:{ all -> 0x004a }
            vu7 r12 = defpackage.i8b.t(r12)     // Catch:{ all -> 0x004a }
            tke r1 = new tke     // Catch:{ all -> 0x004a }
            kotlin.jvm.internal.Ref$ObjectRef r3 = r11.w     // Catch:{ all -> 0x004a }
            d19 r4 = r11.x     // Catch:{ all -> 0x004a }
            r1.<init>(r3, r0, r4, r2)     // Catch:{ all -> 0x004a }
            ru7 r0 = new ru7     // Catch:{ all -> 0x004a }
            r0.<init>(r12, r1, r2)     // Catch:{ all -> 0x004a }
            r1 = 3
            defpackage.ev0.v(r12, r2, r2, r0, r1)     // Catch:{ all -> 0x004a }
            goto L_0x0172
        L_0x0111:
            boolean r0 = r12 instanceof defpackage.dke     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0126
            androidx.fragment.app.a r12 = r4.E(r3)     // Catch:{ all -> 0x004a }
            boolean r0 = r12 instanceof ru.ok.tamtam.calls.CallDialogFragment     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0120
            r2 = r12
            ru.ok.tamtam.calls.CallDialogFragment r2 = (ru.ok.tamtam.calls.CallDialogFragment) r2     // Catch:{ all -> 0x004a }
        L_0x0120:
            if (r2 == 0) goto L_0x0172
            r2.a3()     // Catch:{ all -> 0x004a }
            goto L_0x0172
        L_0x0126:
            boolean r0 = r12 instanceof defpackage.eke     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0164
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x004a }
            r0.<init>()     // Catch:{ all -> 0x004a }
            r1 = r12
            eke r1 = (defpackage.eke) r1     // Catch:{ all -> 0x004a }
            java.lang.String r1 = r1.b     // Catch:{ all -> 0x004a }
            java.lang.String r2 = "ru.ok.tamtam.extra.CONTENT"
            r0.putCharSequence(r2, r1)     // Catch:{ all -> 0x004a }
            r1 = r12
            eke r1 = (defpackage.eke) r1     // Catch:{ all -> 0x004a }
            java.lang.String r1 = r1.a     // Catch:{ all -> 0x004a }
            java.lang.String r2 = "ru.ok.tamtam.extra.TITLE"
            r0.putString(r2, r1)     // Catch:{ all -> 0x004a }
            r1 = r12
            eke r1 = (defpackage.eke) r1     // Catch:{ all -> 0x004a }
            java.lang.String r1 = r1.c     // Catch:{ all -> 0x004a }
            java.lang.String r2 = "ru.ok.tamtam.extra.POSITIVE_TEXT"
            r0.putString(r2, r1)     // Catch:{ all -> 0x004a }
            eke r12 = (defpackage.eke) r12     // Catch:{ all -> 0x004a }
            java.lang.String r12 = r12.d     // Catch:{ all -> 0x004a }
            java.lang.String r1 = "ru.ok.tamtam.extra.NEGATIVE_TEXT"
            r0.putString(r1, r12)     // Catch:{ all -> 0x004a }
            ru.ok.messages.views.dialogs.ConfirmationDialog r12 = new ru.ok.messages.views.dialogs.ConfirmationDialog     // Catch:{ all -> 0x004a }
            r12.<init>()     // Catch:{ all -> 0x004a }
            r12.L2(r0)     // Catch:{ all -> 0x004a }
            java.lang.String r0 = "ru.ok.messages.views.dialogs.ConfirmationDialog"
            r12.Y2(r4, r0)     // Catch:{ all -> 0x004a }
            goto L_0x0172
        L_0x0164:
            boolean r12 = r12 instanceof defpackage.gke     // Catch:{ all -> 0x004a }
            if (r12 == 0) goto L_0x0179
            int r12 = defpackage.qad.z     // Catch:{ all -> 0x004a }
            java.lang.String r12 = r1.getString(r12)     // Catch:{ all -> 0x004a }
            r0 = 0
            defpackage.hi7.b0(r0, r1, r12)     // Catch:{ all -> 0x004a }
        L_0x0172:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x004a }
            java.lang.Object r12 = kotlin.Result.m23constructorimpl(r12)     // Catch:{ all -> 0x004a }
            goto L_0x0189
        L_0x0179:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x004a }
            r12.<init>()     // Catch:{ all -> 0x004a }
            throw r12     // Catch:{ all -> 0x004a }
        L_0x017f:
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r12 = kotlin.ResultKt.createFailure(r12)
            java.lang.Object r12 = kotlin.Result.m23constructorimpl(r12)
        L_0x0189:
            boolean r11 = r11.c
            if (r11 != 0) goto L_0x0190
            kotlin.ResultKt.throwOnFailure(r12)
        L_0x0190:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L_0x0193:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qke.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
