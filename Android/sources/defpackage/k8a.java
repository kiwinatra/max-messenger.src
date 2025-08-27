package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.login.neuroavatars.NeuroAvatarsScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: k8a  reason: default package */
public final class k8a extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ NeuroAvatarsScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k8a(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.b = neuroAvatarsScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        k8a k8a = new k8a(continuation, this.b);
        k8a.a = obj;
        return k8a;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k8a) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Object obj2 = this.a;
        boolean z = obj2 instanceof t88;
        CharSequence charSequence = null;
        NeuroAvatarsScreen neuroAvatarsScreen = this.b;
        if (z) {
            ngf ngf = ((t88) obj2).c;
            neuroAvatarsScreen.a.getClass();
            CharSequence a2 = ngf.a(neuroAvatarsScreen.getContext());
            if (a2 != null) {
                e0b e0b = new e0b((Widget) neuroAvatarsScreen);
                e0b.i(a2);
                e0b.b((CharSequence) null);
                e0b.e(1);
                e0b.j();
            }
        } else if (obj2 instanceof u88) {
            u88 u88 = (u88) obj2;
            q80 q80 = u88.e;
            KProperty[] kPropertyArr = NeuroAvatarsScreen.K0;
            if (neuroAvatarsScreen.e0() != null) {
                ((r80) neuroAvatarsScreen.o.getValue()).a(new p80(q80));
            }
            neuroAvatarsScreen.a.getClass();
            CharSequence a3 = u88.c.a(neuroAvatarsScreen.getContext());
            if (a3 != null) {
                ngf ngf2 = u88.d;
                if (ngf2 != null) {
                    charSequence = ngf2.a(neuroAvatarsScreen.getContext());
                }
                e0b e0b2 = new e0b((Widget) neuroAvatarsScreen);
                e0b2.i(a3);
                e0b2.b(charSequence);
                e0b2.e(1);
                e0b2.j();
            }
        }
        KProperty[] kPropertyArr2 = NeuroAvatarsScreen.K0;
        neuroAvatarsScreen.getClass();
        OneMeButton oneMeButton = (OneMeButton) neuroAvatarsScreen.Z.getValue(neuroAvatarsScreen, NeuroAvatarsScreen.K0[7]);
        oneMeButton.setProgressEnabled(false);
        oneMeButton.setClickable(true);
        return Unit.INSTANCE;
    }
}
