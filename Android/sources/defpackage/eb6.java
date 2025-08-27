package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.keyboardmedia.MediaKeyboardWidget;

/* renamed from: eb6  reason: default package */
public final class eb6 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ForwardPickerScreen b;
    public final /* synthetic */ View c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eb6(ForwardPickerScreen forwardPickerScreen, ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.b = forwardPickerScreen;
        this.c = viewGroup;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        eb6 eb6 = new eb6(this.b, (ViewGroup) this.c, continuation);
        eb6.a = obj;
        return eb6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((eb6) create((pg9) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        pg9 pg9 = (pg9) this.a;
        ForwardPickerScreen forwardPickerScreen = this.b;
        e9d e9d = forwardPickerScreen.D0;
        if (e9d != null) {
            int ordinal = pg9.a.ordinal();
            View view = this.c;
            if (ordinal == 0) {
                xr8 xr8 = forwardPickerScreen.F0;
                if (xr8 != null) {
                    KProperty[] kPropertyArr = xr8.m;
                    xr8.e(true);
                }
                forwardPickerScreen.o0().setLeftIcon(cad.c1);
                h88.f(view, ForwardPickerScreen.J0, (Function1) null);
            } else if (ordinal == 1) {
                if (!e9d.n()) {
                    e9d.R(iq.n(new MediaKeyboardWidget(forwardPickerScreen.b, 0, true, 2, (DefaultConstructorMarker) null), (ey3) null, (ey3) null));
                }
                WeakHashMap weakHashMap = gag.a;
                v9g.u(view, (vla) null);
                xr8 xr82 = forwardPickerScreen.F0;
                if (xr82 != null) {
                    xr82.f();
                }
                forwardPickerScreen.o0().setLeftIcon(cad.g1);
            } else if (ordinal == 2) {
                sn0 sn0 = ((ForwardPickerScreen) forwardPickerScreen.E0.b).z0;
                if (sn0.isInitialized()) {
                    ((dc9) sn0.getValue()).e(true);
                }
                forwardPickerScreen.o0().setLeftIcon(cad.c1);
                bs0.K(new ps5(bs0.Y(new k26(pq7.f, 2), 1), new hb6((ViewGroup) view, (Continuation) null), 5), forwardPickerScreen.getViewLifecycleScope());
            }
        }
        return Unit.INSTANCE;
    }
}
