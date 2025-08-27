package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.ImageView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.richvector.VectorPath;

/* renamed from: xd2  reason: default package */
public final class xd2 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ ImageView b;
    public /* synthetic */ k2b c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xd2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.a = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ImageView imageView = (ImageView) obj;
        k2b k2b = (k2b) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.a) {
            case 0:
                xd2 xd2 = new xd2(3, continuation, 0);
                xd2.b = imageView;
                xd2.c = k2b;
                return xd2.invokeSuspend(Unit.INSTANCE);
            case 1:
                xd2 xd22 = new xd2(3, continuation, 1);
                xd22.b = imageView;
                xd22.c = k2b;
                return xd22.invokeSuspend(Unit.INSTANCE);
            case 2:
                xd2 xd23 = new xd2(3, continuation, 2);
                xd23.b = imageView;
                xd23.c = k2b;
                return xd23.invokeSuspend(Unit.INSTANCE);
            case 3:
                xd2 xd24 = new xd2(3, continuation, 3);
                xd24.b = imageView;
                xd24.c = k2b;
                return xd24.invokeSuspend(Unit.INSTANCE);
            case 4:
                xd2 xd25 = new xd2(3, continuation, 4);
                xd25.b = imageView;
                xd25.c = k2b;
                return xd25.invokeSuspend(Unit.INSTANCE);
            case 5:
                xd2 xd26 = new xd2(3, continuation, 5);
                xd26.b = imageView;
                xd26.c = k2b;
                return xd26.invokeSuspend(Unit.INSTANCE);
            case 6:
                xd2 xd27 = new xd2(3, continuation, 6);
                xd27.b = imageView;
                xd27.c = k2b;
                return xd27.invokeSuspend(Unit.INSTANCE);
            case 7:
                xd2 xd28 = new xd2(3, continuation, 7);
                xd28.b = imageView;
                xd28.c = k2b;
                return xd28.invokeSuspend(Unit.INSTANCE);
            case 8:
                xd2 xd29 = new xd2(3, continuation, 8);
                xd29.b = imageView;
                xd29.c = k2b;
                return xd29.invokeSuspend(Unit.INSTANCE);
            default:
                xd2 xd210 = new xd2(3, continuation, 9);
                xd210.b = imageView;
                xd210.c = k2b;
                return xd210.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                this.b.setImageTintList(ColorStateList.valueOf(this.c.getIcon().i));
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure(obj);
                this.b.setImageTintList(ColorStateList.valueOf(this.c.a().f().c.c));
                return Unit.INSTANCE;
            case 2:
                ResultKt.throwOnFailure(obj);
                ImageView imageView = this.b;
                this.c.getIcon().getClass();
                imageView.setImageTintList(ColorStateList.valueOf(-1));
                return Unit.INSTANCE;
            case 3:
                ResultKt.throwOnFailure(obj);
                ImageView imageView2 = this.b;
                this.c.getIcon().getClass();
                imageView2.setImageTintList(ColorStateList.valueOf(-1));
                return Unit.INSTANCE;
            case 4:
                ResultKt.throwOnFailure(obj);
                ImageView imageView3 = this.b;
                k2b k2b = this.c;
                Drawable drawable = imageView3.getDrawable();
                EnhancedVectorDrawable enhancedVectorDrawable = drawable instanceof EnhancedVectorDrawable ? (EnhancedVectorDrawable) drawable : null;
                if (enhancedVectorDrawable != null) {
                    int i2 = k2b.h().j;
                    VectorPath findPath = enhancedVectorDrawable.findPath("stroke");
                    if (findPath != null) {
                        findPath.setStrokeColor(i2);
                        enhancedVectorDrawable.invalidatePath();
                    }
                }
                return Unit.INSTANCE;
            case 5:
                ResultKt.throwOnFailure(obj);
                ImageView imageView4 = this.b;
                k2b k2b2 = this.c;
                Drawable background = imageView4.getBackground();
                GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                if (gradientDrawable != null) {
                    gradientDrawable.setColor(k2b2.c().i);
                }
                Drawable drawable2 = imageView4.getDrawable();
                k2b2.getIcon().getClass();
                iq.a0(drawable2, -16745729);
                return Unit.INSTANCE;
            case 6:
                ResultKt.throwOnFailure(obj);
                ImageView imageView5 = this.b;
                k2b k2b3 = this.c;
                Drawable drawable3 = imageView5.getDrawable();
                k2b3.getIcon().getClass();
                iq.a0(drawable3, -16745729);
                return Unit.INSTANCE;
            case 7:
                ResultKt.throwOnFailure(obj);
                ImageView imageView6 = this.b;
                k2b k2b4 = this.c;
                Drawable drawable4 = imageView6.getDrawable();
                k2b4.getIcon().getClass();
                iq.a0(drawable4, -16745729);
                return Unit.INSTANCE;
            case 8:
                ResultKt.throwOnFailure(obj);
                iq.a0(this.b.getDrawable(), this.c.e().a);
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                ImageView imageView7 = this.b;
                k2b k2b5 = this.c;
                int i3 = k2b5.b().a.c;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(k2b5.c().a.g);
                imageView7.setBackground(new RippleDrawable(ColorStateList.valueOf(i3), shapeDrawable, (Drawable) null));
                k2b5.getIcon().getClass();
                imageView7.setImageTintList(ColorStateList.valueOf(-1));
                return Unit.INSTANCE;
        }
    }
}
