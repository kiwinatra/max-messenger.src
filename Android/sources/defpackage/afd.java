package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;

/* renamed from: afd  reason: default package */
public final class afd extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ScheduledSendPickerDialogFragment b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public afd(ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment, Continuation continuation) {
        super(2, continuation);
        this.b = scheduledSendPickerDialogFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        afd afd = new afd(this.b, continuation);
        afd.a = obj;
        return afd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((afd) create((ped) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [tyc] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.a
            ped r9 = (defpackage.ped) r9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "new data "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ScheduledSendPickerDialogFragment"
            defpackage.z68.c(r1, r0, new java.lang.Object[0])
            ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment r8 = r8.b
            zed r0 = r8.c3()
            ru.ok.tamtam.messages.scheduled.DateTimePicker r0 = r0.d()
            java.util.List r1 = r9.a
            r2 = 1
            r0.L0 = r2
            androidx.recyclerview.widget.RecyclerView r3 = r0.E0
            tyc r3 = r3.getAdapter()
            boolean r4 = r3 instanceof defpackage.q84
            r5 = 0
            if (r4 == 0) goto L_0x003a
            q84 r3 = (defpackage.q84) r3
            goto L_0x003b
        L_0x003a:
            r3 = r5
        L_0x003b:
            if (r3 == 0) goto L_0x0048
            i84 r4 = new i84
            int r6 = r9.d
            r7 = 0
            r4.<init>(r0, r6, r7)
            r3.H(r1, r4)
        L_0x0048:
            zed r0 = r8.c3()
            ru.ok.tamtam.messages.scheduled.DateTimePicker r0 = r0.d()
            r0.M0 = r2
            androidx.recyclerview.widget.RecyclerView r1 = r0.F0
            tyc r1 = r1.getAdapter()
            boolean r3 = r1 instanceof defpackage.gjf
            if (r3 == 0) goto L_0x005f
            gjf r1 = (defpackage.gjf) r1
            goto L_0x0060
        L_0x005f:
            r1 = r5
        L_0x0060:
            if (r1 == 0) goto L_0x006f
            i84 r3 = new i84
            int r4 = r9.e
            r6 = 2
            r3.<init>(r0, r4, r6)
            java.util.List r0 = r9.b
            r1.H(r0, r3)
        L_0x006f:
            zed r8 = r8.c3()
            ru.ok.tamtam.messages.scheduled.DateTimePicker r8 = r8.d()
            r8.N0 = r2
            androidx.recyclerview.widget.RecyclerView r0 = r8.G0
            tyc r0 = r0.getAdapter()
            boolean r1 = r0 instanceof defpackage.gjf
            if (r1 == 0) goto L_0x0086
            r5 = r0
            gjf r5 = (defpackage.gjf) r5
        L_0x0086:
            if (r5 == 0) goto L_0x0095
            i84 r0 = new i84
            int r1 = r9.f
            r2 = 1
            r0.<init>(r8, r1, r2)
            java.util.List r8 = r9.c
            r5.H(r8, r0)
        L_0x0095:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
