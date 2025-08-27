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
import one.me.sharedata.ShareDataPickerScreen;

/* renamed from: l5e  reason: default package */
public final class l5e extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ShareDataPickerScreen b;
    public final /* synthetic */ View c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l5e(ShareDataPickerScreen shareDataPickerScreen, View view, Continuation continuation) {
        super(2, continuation);
        this.b = shareDataPickerScreen;
        this.c = view;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        l5e l5e = new l5e(this.b, this.c, continuation);
        l5e.a = obj;
        return l5e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l5e) create((Set) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int size = ((Set) this.a).size();
        KProperty[] kPropertyArr = ShareDataPickerScreen.A0;
        ShareDataPickerScreen shareDataPickerScreen = this.b;
        boolean z = shareDataPickerScreen.n0().getVisibility() == 0;
        AutoTransition autoTransition = shareDataPickerScreen.Y;
        View view = this.c;
        if (!z && size > 0) {
            TransitionManager.beginDelayedTransition((ViewGroup) view, autoTransition);
            shareDataPickerScreen.n0().setVisibility(0);
        } else if (z && size == 0) {
            TransitionManager.beginDelayedTransition((ViewGroup) view, autoTransition);
            sn0 sn0 = shareDataPickerScreen.Z;
            if (sn0.isInitialized()) {
                ((dc9) sn0.getValue()).setVisibility(8);
            }
            e9d e9d = shareDataPickerScreen.x0;
            if (e9d == null || !e9d.n()) {
                int i = pq7.a;
                if (pq7.b(pq7.c)) {
                    shareDataPickerScreen.y0.k();
                }
            } else {
                ((e5e) shareDataPickerScreen.l0().c).k.C(og9.a);
            }
        }
        return Unit.INSTANCE;
    }
}
