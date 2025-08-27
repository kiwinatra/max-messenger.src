package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;
import android.text.TextPaint;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KProperty;
import one.me.android.MainActivity;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: mh0  reason: default package */
public final class mh0 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mh0(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.a = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                ds5 ds5 = (ds5) obj;
                Throwable th = (Throwable) obj2;
                return new mh0((Object) (nh0) this.b, (Continuation) obj3, 0).invokeSuspend(Unit.INSTANCE);
            case 1:
                k2b k2b = (k2b) obj2;
                mh0 mh0 = new mh0(3, (Continuation) obj3, 1);
                mh0.b = (lw0) obj;
                return mh0.invokeSuspend(Unit.INSTANCE);
            case 2:
                k2b k2b2 = (k2b) obj2;
                mh0 mh02 = new mh0(3, (Continuation) obj3, 2);
                mh02.b = (AppCompatTextView) obj;
                return mh02.invokeSuspend(Unit.INSTANCE);
            case 3:
                k2b k2b3 = (k2b) obj2;
                mh0 mh03 = new mh0(3, (Continuation) obj3, 3);
                mh03.b = (oz1) obj;
                return mh03.invokeSuspend(Unit.INSTANCE);
            case 4:
                k2b k2b4 = (k2b) obj2;
                mh0 mh04 = new mh0(3, (Continuation) obj3, 4);
                mh04.b = (CoordinatorLayout) obj;
                return mh04.invokeSuspend(Unit.INSTANCE);
            case 5:
                ImageView imageView = (ImageView) obj;
                k2b k2b5 = (k2b) obj2;
                return new mh0((Object) (g15) this.b, (Continuation) obj3, 5).invokeSuspend(Unit.INSTANCE);
            case 6:
                k2b k2b6 = (k2b) obj2;
                mh0 mh05 = new mh0(3, (Continuation) obj3, 6);
                mh05.b = (ConstraintLayout) obj;
                return mh05.invokeSuspend(Unit.INSTANCE);
            case 7:
                k2b k2b7 = (k2b) obj2;
                mh0 mh06 = new mh0(3, (Continuation) obj3, 7);
                mh06.b = (EndlessRecyclerView2) obj;
                return mh06.invokeSuspend(Unit.INSTANCE);
            case 8:
                oz1 oz1 = (oz1) obj;
                k2b k2b8 = (k2b) obj2;
                return new mh0((Object) (MainActivity) this.b, (Continuation) obj3, 8).invokeSuspend(Unit.INSTANCE);
            case 9:
                k2b k2b9 = (k2b) obj2;
                mh0 mh07 = new mh0(3, (Continuation) obj3, 9);
                mh07.b = (occ) obj;
                return mh07.invokeSuspend(Unit.INSTANCE);
            case 10:
                k2b k2b10 = (k2b) obj2;
                mh0 mh08 = new mh0(3, (Continuation) obj3, 10);
                mh08.b = (ImageView) obj;
                return mh08.invokeSuspend(Unit.INSTANCE);
            case 11:
                ds5 ds52 = (ds5) obj;
                Throwable th2 = (Throwable) obj2;
                return new mh0((Object) (ocb) this.b, (Continuation) obj3, 11).invokeSuspend(Unit.INSTANCE);
            case 12:
                k2b k2b11 = (k2b) obj2;
                mh0 mh09 = new mh0(3, (Continuation) obj3, 12);
                mh09.b = (rrb) obj;
                return mh09.invokeSuspend(Unit.INSTANCE);
            case 13:
                LinearLayout linearLayout = (LinearLayout) obj;
                k2b k2b12 = (k2b) obj2;
                return new mh0((Object) (RecordControlsWidget) this.b, (Continuation) obj3, 13).invokeSuspend(Unit.INSTANCE);
            default:
                k2b k2b13 = (k2b) obj2;
                mh0 mh010 = new mh0(3, (Continuation) obj3, 14);
                mh010.b = (orb) obj;
                return mh010.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        js9 js9 = fu4.k;
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                nh0 nh0 = (nh0) this.b;
                nh0.a.unregisterActivityLifecycleCallbacks(nh0.f);
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure(obj);
                lw0 lw0 = (lw0) this.b;
                TextPaint textPaint = lw0.w0;
                js9.e(lw0.getContext()).f().getText().getClass();
                textPaint.setColor(-1);
                lw0.z.setColor(js9.e(lw0.getContext()).f().a().a(true).a.a.a);
                lw0.v0.setColor(js9.e(lw0.getContext()).f().a().a(true).a.a.c);
                te7 te7 = lw0.E0;
                if (te7 != null) {
                    te7.b = new int[]{js9.e(lw0.getContext()).f().d().f.b, js9.e(lw0.getContext()).f().d().f.a};
                }
                return Unit.INSTANCE;
            case 2:
                ResultKt.throwOnFailure(obj);
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.b;
                appCompatTextView.setTextColor(js9.f(appCompatTextView).getText().h);
                return Unit.INSTANCE;
            case 3:
                ResultKt.throwOnFailure(obj);
                oz1 oz1 = (oz1) this.b;
                oz1.setBackgroundColor(js9.f(oz1).a().f().a.a);
                return Unit.INSTANCE;
            case 4:
                ResultKt.throwOnFailure(obj);
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.b;
                coordinatorLayout.setBackgroundColor(js9.f(coordinatorLayout).c().h);
                return Unit.INSTANCE;
            case 5:
                ResultKt.throwOnFailure(obj);
                int i2 = g15.F0;
                ImageView imageView = (ImageView) ((g15) this.b).a;
                int i3 = js9.f(imageView).b().a.f;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(-1);
                imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i3), (Drawable) null, shapeDrawable));
                return Unit.INSTANCE;
            case 6:
                ResultKt.throwOnFailure(obj);
                ConstraintLayout constraintLayout = (ConstraintLayout) this.b;
                constraintLayout.setBackgroundColor(js9.f(constraintLayout).c().h);
                return Unit.INSTANCE;
            case 7:
                ResultKt.throwOnFailure(obj);
                EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) this.b;
                endlessRecyclerView2.setBackgroundColor(js9.f(endlessRecyclerView2).c().k);
                fu4.e(js9.e(endlessRecyclerView2.getContext()), endlessRecyclerView2);
                endlessRecyclerView2.a0();
                return Unit.INSTANCE;
            case 8:
                ResultKt.throwOnFailure(obj);
                o81 o81 = ((MainActivity) this.b).B0;
                if (o81 != null) {
                    o81.k();
                }
                return Unit.INSTANCE;
            case 9:
                ResultKt.throwOnFailure(obj);
                occ occ = (occ) this.b;
                occ.setBackgroundColor(js9.f(occ).a().f().a.a);
                return Unit.INSTANCE;
            case 10:
                ResultKt.throwOnFailure(obj);
                ImageView imageView2 = (ImageView) this.b;
                imageView2.setImageTintList(ColorStateList.valueOf(js9.f(imageView2).getIcon().f));
                imageView2.setBackgroundColor(js9.e(imageView2.getContext()).f().c().a.g);
                return Unit.INSTANCE;
            case 11:
                ResultKt.throwOnFailure(obj);
                ocb ocb = (ocb) this.b;
                ocb.a.unregisterActivityLifecycleCallbacks(ocb.c);
                return Unit.INSTANCE;
            case 12:
                ResultKt.throwOnFailure(obj);
                rrb rrb = (rrb) this.b;
                int i4 = rrb.getCurrentTheme().b().a.c;
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RectShape());
                shapeDrawable2.getPaint().setColor(rrb.getCurrentTheme().c().f);
                rrb.setBackground(new RippleDrawable(ColorStateList.valueOf(i4), shapeDrawable2, (Drawable) null));
                return Unit.INSTANCE;
            case 13:
                ResultKt.throwOnFailure(obj);
                KProperty[] kPropertyArr = RecordControlsWidget.g1;
                RecordControlsWidget recordControlsWidget = (RecordControlsWidget) this.b;
                if (recordControlsWidget.D0().v0.a.getValue() instanceof dwc) {
                    GradientDrawable E0 = recordControlsWidget.E0();
                    js9.f(recordControlsWidget.w0()).getIcon().getClass();
                    E0.setColor(-16745729);
                } else {
                    GradientDrawable E02 = recordControlsWidget.E0();
                    js9.f(recordControlsWidget.o0()).c().a.getClass();
                    E02.setColor(i8b.Y(0.08f, -16745729));
                }
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                orb orb = (orb) this.b;
                js9.f(orb).c().getClass();
                orb.setBackground(new ColorDrawable(-1728053248));
                return Unit.INSTANCE;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mh0(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.a = i;
        this.b = obj;
    }
}
