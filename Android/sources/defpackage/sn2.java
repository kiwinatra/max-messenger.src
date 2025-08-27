package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.FrameLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: sn2  reason: default package */
public final class sn2 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ FrameLayout b;
    public /* synthetic */ k2b c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sn2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.a = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FrameLayout frameLayout = (FrameLayout) obj;
        k2b k2b = (k2b) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.a) {
            case 0:
                sn2 sn2 = new sn2(3, continuation, 0);
                sn2.b = frameLayout;
                sn2.c = k2b;
                return sn2.invokeSuspend(Unit.INSTANCE);
            case 1:
                sn2 sn22 = new sn2(3, continuation, 1);
                sn22.b = frameLayout;
                sn22.c = k2b;
                return sn22.invokeSuspend(Unit.INSTANCE);
            case 2:
                sn2 sn23 = new sn2(3, continuation, 2);
                sn23.b = frameLayout;
                sn23.c = k2b;
                return sn23.invokeSuspend(Unit.INSTANCE);
            case 3:
                sn2 sn24 = new sn2(3, continuation, 3);
                sn24.b = frameLayout;
                sn24.c = k2b;
                return sn24.invokeSuspend(Unit.INSTANCE);
            case 4:
                sn2 sn25 = new sn2(3, continuation, 4);
                sn25.b = frameLayout;
                sn25.c = k2b;
                return sn25.invokeSuspend(Unit.INSTANCE);
            case 5:
                sn2 sn26 = new sn2(3, continuation, 5);
                sn26.b = frameLayout;
                sn26.c = k2b;
                return sn26.invokeSuspend(Unit.INSTANCE);
            default:
                sn2 sn27 = new sn2(3, continuation, 6);
                sn27.b = frameLayout;
                sn27.c = k2b;
                return sn27.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                this.b.setBackgroundColor(this.c.a().j().a.a);
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure(obj);
                this.b.setBackgroundColor(this.c.a().f().a.a);
                return Unit.INSTANCE;
            case 2:
                ResultKt.throwOnFailure(obj);
                FrameLayout frameLayout = this.b;
                k2b k2b = this.c;
                fu4.k.e(frameLayout.getContext()).getClass();
                fu4.d(frameLayout, k2b);
                return Unit.INSTANCE;
            case 3:
                ResultKt.throwOnFailure(obj);
                FrameLayout frameLayout2 = this.b;
                k2b k2b2 = this.c;
                Drawable background = frameLayout2.getBackground();
                GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                if (gradientDrawable != null) {
                    gradientDrawable.setColors(k2b2.d().d.a);
                }
                return Unit.INSTANCE;
            case 4:
                ResultKt.throwOnFailure(obj);
                this.b.setBackgroundColor(this.c.c().i);
                return Unit.INSTANCE;
            case 5:
                ResultKt.throwOnFailure(obj);
                this.b.setBackgroundColor(this.c.c().h);
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                FrameLayout frameLayout3 = this.b;
                k2b k2b3 = this.c;
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(vo4.c().getDisplayMetrics().density * 16.0f);
                gradientDrawable2.setTint(k2b3.c().f);
                frameLayout3.setBackground(gradientDrawable2);
                frameLayout3.setForeground(new RippleDrawable(ColorStateList.valueOf(k2b3.b().a.f), (Drawable) null, hqe.L0));
                return Unit.INSTANCE;
        }
    }
}
