package defpackage;

import android.graphics.drawable.ShapeDrawable;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KProperty;
import one.me.appearancesettings.AppearanceSettingsScreen;

/* renamed from: mr  reason: default package */
public final class mr extends SuspendLambda implements Function3 {
    public /* synthetic */ LinearLayout a;
    public /* synthetic */ k2b b;
    public final /* synthetic */ AppearanceSettingsScreen c;
    public final /* synthetic */ TextView o;
    public final /* synthetic */ TextView v;
    public final /* synthetic */ TextView w;
    public final /* synthetic */ ShapeDrawable x;
    public final /* synthetic */ u32 y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mr(AppearanceSettingsScreen appearanceSettingsScreen, TextView textView, TextView textView2, TextView textView3, ShapeDrawable shapeDrawable, u32 u32, Continuation continuation) {
        super(3, continuation);
        this.c = appearanceSettingsScreen;
        this.o = textView;
        this.v = textView2;
        this.w = textView3;
        this.x = shapeDrawable;
        this.y = u32;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ShapeDrawable shapeDrawable = this.x;
        u32 u32 = this.y;
        mr mrVar = new mr(this.c, this.o, this.v, this.w, shapeDrawable, u32, (Continuation) obj3);
        mrVar.a = (LinearLayout) obj;
        mrVar.b = (k2b) obj2;
        return mrVar.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        LinearLayout linearLayout = this.a;
        k2b k2b = this.b;
        KProperty[] kPropertyArr = AppearanceSettingsScreen.y;
        AppearanceSettingsScreen appearanceSettingsScreen = this.c;
        appearanceSettingsScreen.c0().u();
        linearLayout.setBackgroundColor(k2b.c().h);
        this.o.setTextColor(k2b.getText().f);
        this.v.setTextColor(k2b.getText().f);
        this.w.setTextColor(k2b.getText().f);
        ev0.v(appearanceSettingsScreen.getViewLifecycleScope(), (CoroutineContext) null, (f14) null, new lr(this.y, appearanceSettingsScreen, (Continuation) null), 3);
        iq.a0(this.x, k2b.c().f);
        return Unit.INSTANCE;
    }
}
