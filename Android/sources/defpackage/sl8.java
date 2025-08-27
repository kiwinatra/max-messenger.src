package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: sl8  reason: default package */
public final class sl8 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MediaBarWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sl8(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.b = mediaBarWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        sl8 sl8 = new sl8(continuation, this.b);
        sl8.a = obj;
        return sl8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sl8) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        gpd gpd = (gpd) this.a;
        boolean z = gpd instanceof fpd;
        MediaBarWidget mediaBarWidget = this.b;
        if (z) {
            KProperty[] kPropertyArr = MediaBarWidget.c1;
            mediaBarWidget.p0().setVisibility(8);
        } else if (gpd instanceof dpd) {
            dpd dpd = (dpd) gpd;
            mediaBarWidget.E0 = dpd.a;
            MediaBarWidget.e0(mediaBarWidget);
            mediaBarWidget.q0().setDropdownRotationProgress(((float) dpd.a) / 512.0f);
        } else if (gpd instanceof epd) {
            KProperty[] kPropertyArr2 = MediaBarWidget.c1;
            om6 k0 = mediaBarWidget.k0();
            epd epd = (epd) gpd;
            wk6 wk6 = epd.a;
            k0.getClass();
            xag.h(k0.o, new em6(wk6));
            h3 c = epd.a.a.c();
            if (c instanceof lk6) {
                str = mediaBarWidget.getContext().getString(((lk6) c).a);
            } else if (c instanceof mk6) {
                str = ((mk6) c).a;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            mediaBarWidget.q0().setTitle((CharSequence) str);
        }
        return Unit.INSTANCE;
    }
}
