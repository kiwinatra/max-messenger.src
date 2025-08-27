package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: sx1  reason: default package */
public final class sx1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ AppCompatImageView b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sx1(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.a = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) obj;
        k2b k2b = (k2b) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.a) {
            case 0:
                sx1 sx1 = new sx1(3, continuation, 0);
                sx1.b = appCompatImageView;
                return sx1.invokeSuspend(Unit.INSTANCE);
            case 1:
                sx1 sx12 = new sx1(3, continuation, 1);
                sx12.b = appCompatImageView;
                return sx12.invokeSuspend(Unit.INSTANCE);
            case 2:
                sx1 sx13 = new sx1(3, continuation, 2);
                sx13.b = appCompatImageView;
                return sx13.invokeSuspend(Unit.INSTANCE);
            default:
                sx1 sx14 = new sx1(3, continuation, 3);
                sx14.b = appCompatImageView;
                return sx14.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                AppCompatImageView appCompatImageView = this.b;
                js9 js9 = fu4.k;
                int i2 = js9.f(appCompatImageView).b().a.f;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(-1);
                appCompatImageView.setBackgroundDrawable(new RippleDrawable(ColorStateList.valueOf(i2), (Drawable) null, shapeDrawable));
                appCompatImageView.setImageResource(cad.p0);
                appCompatImageView.setImageTintList(ColorStateList.valueOf(js9.e(appCompatImageView.getContext()).f().getIcon().i));
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure(obj);
                AppCompatImageView appCompatImageView2 = this.b;
                appCompatImageView2.setImageTintList(ColorStateList.valueOf(fu4.k.f(appCompatImageView2).getIcon().h));
                appCompatImageView2.setImageResource(lya.z);
                return Unit.INSTANCE;
            case 2:
                ResultKt.throwOnFailure(obj);
                AppCompatImageView appCompatImageView3 = this.b;
                js9 js92 = fu4.k;
                appCompatImageView3.setImageTintList(ColorStateList.valueOf(js92.f(appCompatImageView3).getIcon().h));
                appCompatImageView3.setImageResource(lya.a);
                int i3 = js92.e(appCompatImageView3.getContext()).f().b().a.f;
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                shapeDrawable2.getPaint().setColor(-1);
                appCompatImageView3.setBackgroundDrawable(new RippleDrawable(ColorStateList.valueOf(i3), (Drawable) null, shapeDrawable2));
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                AppCompatImageView appCompatImageView4 = this.b;
                js9 js93 = fu4.k;
                appCompatImageView4.setImageTintList(ColorStateList.valueOf(js93.f(appCompatImageView4).getIcon().h));
                appCompatImageView4.setImageResource(yua.i);
                int i4 = js93.e(appCompatImageView4.getContext()).f().b().a.f;
                ShapeDrawable shapeDrawable3 = new ShapeDrawable(new OvalShape());
                shapeDrawable3.getPaint().setColor(-1);
                appCompatImageView4.setBackgroundDrawable(new RippleDrawable(ColorStateList.valueOf(i4), (Drawable) null, shapeDrawable3));
                return Unit.INSTANCE;
        }
    }
}
