package defpackage;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chats.forward.ForwardPickerScreen;

/* renamed from: kb6  reason: default package */
public final class kb6 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ForwardPickerScreen b;
    public final /* synthetic */ View c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kb6(ForwardPickerScreen forwardPickerScreen, View view, Continuation continuation) {
        super(2, continuation);
        this.b = forwardPickerScreen;
        this.c = view;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        kb6 kb6 = new kb6(this.b, this.c, continuation);
        kb6.a = obj;
        return kb6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kb6) create((Set) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int size = ((Set) this.a).size();
        KProperty[] kPropertyArr = ForwardPickerScreen.I0;
        ForwardPickerScreen forwardPickerScreen = this.b;
        boolean z = forwardPickerScreen.o0().getVisibility() == 0;
        AutoTransition autoTransition = forwardPickerScreen.y0;
        View view = this.c;
        if (!z && size > 0) {
            TransitionManager.beginDelayedTransition((ViewGroup) view, autoTransition);
            forwardPickerScreen.o0().setVisibility(0);
        } else if (z && size == 0) {
            TransitionManager.beginDelayedTransition((ViewGroup) view, autoTransition);
            sn0 sn0 = forwardPickerScreen.z0;
            if (sn0.isInitialized()) {
                ((dc9) sn0.getValue()).setVisibility(8);
            }
            e9d e9d = forwardPickerScreen.D0;
            if (e9d == null || !e9d.n()) {
                int i = pq7.a;
                if (pq7.b(pq7.c)) {
                    forwardPickerScreen.E0.k();
                }
            } else {
                ((ya6) forwardPickerScreen.l0().c).q.C(og9.a);
            }
        }
        return Unit.INSTANCE;
    }
}
