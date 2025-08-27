package defpackage;

import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: ci9  reason: default package */
public final class ci9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MessageWriteWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ci9(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.b = messageWriteWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ci9 ci9 = new ci9(continuation, this.b);
        ci9.a = obj;
        return ci9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ci9) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        nh9 nh9;
        Function0 function0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        wg9 wg9 = (wg9) this.a;
        KProperty[] kPropertyArr = MessageWriteWidget.C0;
        MessageWriteWidget messageWriteWidget = this.b;
        messageWriteWidget.getClass();
        qvc qvc = wg9.a;
        MotionEvent motionEvent = wg9.b;
        if (motionEvent.getAction() == 0) {
            int ordinal = wg9.a.ordinal();
            Lazy lazy = messageWriteWidget.y;
            if (ordinal == 0) {
                function0 = new rh9((edb) lazy.getValue());
                nh9 = new nh9(messageWriteWidget, 2);
            } else if (ordinal == 1) {
                function0 = new s01((edb) lazy.getValue());
                nh9 = new nh9(messageWriteWidget, 1);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (!((Boolean) function0.invoke()).booleanValue()) {
                nh9.invoke();
                return Unit.INSTANCE;
            }
        }
        String b2 = messageWriteWidget.f0().b();
        String m = a81.m("record_controls_controller_", qvc.name());
        if (messageWriteWidget.f0().a() == null || !Intrinsics.areEqual((Object) b2, (Object) m)) {
            Class<egd> cls = egd.class;
            Object k = n54.k(messageWriteWidget.getArgs(), "arg_scope_id", cls);
            if (k != null) {
                mz2 f0 = messageWriteWidget.f0();
                boolean areEqual = Intrinsics.areEqual((Object) f0.b(), (Object) m);
                String str = ((egd) ((Parcelable) k)).a;
                if (!areEqual) {
                    i9d i9d = new i9d(new RecordControlsWidget(str, qvc, (DefaultConstructorMarker) null), (String) null, (ey3) null, (ey3) null, false, -1);
                    i9d.d(m);
                    f0.a.R(i9d);
                }
                e9d childRouter = messageWriteWidget.getChildRouter((ViewGroup) messageWriteWidget.w0.getValue(messageWriteWidget, MessageWriteWidget.C0[4]));
                childRouter.e = 1;
                childRouter.Q(false);
                if (!childRouter.n()) {
                    childRouter.R(iq.n(new RecordControlsWidget(str, qvc, (DefaultConstructorMarker) null), (ey3) null, (ey3) null));
                }
            } else {
                throw new IllegalArgumentException(wj6.k("No value passed for key arg_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
            }
        }
        zx3 a2 = messageWriteWidget.f0().a();
        RecordControlsWidget recordControlsWidget = a2 instanceof RecordControlsWidget ? (RecordControlsWidget) a2 : null;
        if (recordControlsWidget != null) {
            pwc D0 = recordControlsWidget.D0();
            if (D0.Z.getValue() == null) {
                int action = motionEvent.getAction();
                wie wie = D0.F0;
                if (action == 0) {
                    if (!D0.o().h()) {
                        xag.h(D0.A0, awc.a);
                    } else {
                        wie.setValue(D0, pwc.H0[0], ev0.v(D0.a, (CoroutineContext) null, f14.b, new jwc(D0, (Continuation) null), 1));
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    KProperty[] kPropertyArr2 = pwc.H0;
                    pm7 pm7 = (pm7) wie.getValue(D0, kPropertyArr2[0]);
                    if (pm7 != null && pm7.isActive() && D0.o().h()) {
                        igf igf = new igf(yya.g);
                        yvc yvc = D0.c;
                        yvc.getClass();
                        xag.h(yvc.b, new wvc(D0.b, igf));
                    }
                    pm7 pm72 = (pm7) wie.getValue(D0, kPropertyArr2[0]);
                    if (pm72 != null) {
                        pm72.b((CancellationException) null);
                    }
                    pm7 pm73 = (pm7) D0.G0.getValue(D0, kPropertyArr2[1]);
                    if (pm73 != null) {
                        pm73.b((CancellationException) null);
                    }
                }
            } else if (motionEvent.getAction() == 3) {
                D0.m();
            } else if (motionEvent.getAction() == 1 && !D0.q()) {
                D0.v(true);
            } else if ((D0.v0.a.getValue() instanceof ewc) && !D0.q()) {
                xag.h(D0.B0, motionEvent);
            }
        }
        return Unit.INSTANCE;
    }
}
