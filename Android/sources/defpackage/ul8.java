package defpackage;

import android.view.ViewGroup;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: ul8  reason: default package */
public final class ul8 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MediaBarWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ul8(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.b = mediaBarWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ul8 ul8 = new ul8(continuation, this.b);
        ul8.a = obj;
        return ul8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ul8) create((nm6) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        nm6 nm6 = (nm6) this.a;
        if (!(nm6 instanceof hm6)) {
            boolean z = nm6 instanceof im6;
            MediaBarWidget mediaBarWidget = this.b;
            if (z) {
                KProperty[] kPropertyArr = MediaBarWidget.c1;
                il8 r0 = mediaBarWidget.r0();
                r0.v0.setValue(((im6) nm6).a);
            } else if (nm6 instanceof jm6) {
                jm6 jm6 = (jm6) nm6;
                d48 M = cvg.M(jm6.c);
                KProperty[] kPropertyArr2 = MediaBarWidget.c1;
                mediaBarWidget.s0(M, jm6.a, jm6.b);
            } else if (nm6 instanceof lm6) {
                KProperty[] kPropertyArr3 = MediaBarWidget.c1;
                xt1 i0 = mediaBarWidget.i0();
                int i = ((lm6) nm6).a;
                i0.v = i;
                i0.w = i;
                ViewGroup.LayoutParams layoutParams = i0.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = i;
                    layoutParams.height = i;
                    i0.setLayoutParams(layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            } else if (nm6 instanceof mm6) {
                mediaBarWidget.C0 = ((mm6) nm6).a;
                MediaBarWidget.e0(mediaBarWidget);
            } else if (nm6 instanceof km6) {
                MediaBarWidget.d0(mediaBarWidget, ((km6) nm6).a);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }
}
