package defpackage;

import android.animation.ValueAnimator;
import kotlin.KotlinVersion;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: ol8  reason: default package */
public final class ol8 extends SuspendLambda implements Function2 {
    public /* synthetic */ boolean a;
    public final /* synthetic */ MediaBarWidget b;
    public final /* synthetic */ orb c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ol8(MediaBarWidget mediaBarWidget, orb orb, Continuation continuation) {
        super(2, continuation);
        this.b = mediaBarWidget;
        this.c = orb;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ol8 ol8 = new ol8(this.b, this.c, continuation);
        ol8.a = ((Boolean) obj).booleanValue();
        return ol8;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((ol8) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean z = this.a;
        KProperty[] kPropertyArr = MediaBarWidget.c1;
        MediaBarWidget mediaBarWidget = this.b;
        if (mediaBarWidget.r0().y0.a.getValue() == pub.b) {
            return Unit.INSTANCE;
        }
        if (this.c.getScrollState() == lrb.b && mediaBarWidget.n0().v == null) {
            mediaBarWidget.n0().k();
        }
        ValueAnimator valueAnimator = mediaBarWidget.L0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int alpha = mediaBarWidget.K0.getAlpha();
        int i = z ? (fu4.k.f(mediaBarWidget.j0()).c().d >> 24) & KotlinVersion.MAX_COMPONENT_VALUE : 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
        ofFloat.addUpdateListener(new kl8(mediaBarWidget, alpha, i));
        ofFloat.setDuration(100);
        ofFloat.start();
        mediaBarWidget.L0 = ofFloat;
        return Unit.INSTANCE;
    }
}
