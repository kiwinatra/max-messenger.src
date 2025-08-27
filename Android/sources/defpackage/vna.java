package defpackage;

import android.content.res.Configuration;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.random.Random;
import one.me.android.OneMeApplication;

/* renamed from: vna  reason: default package */
public final class vna extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ OneMeApplication b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vna(OneMeApplication oneMeApplication, Continuation continuation) {
        super(2, continuation);
        this.b = oneMeApplication;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        vna vna = new vna(this.b, continuation);
        vna.a = obj;
        return vna;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vna) create((uy4) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int ordinal = ((uy4) this.a).ordinal();
        z68.c("OneMeDynamicFont", "change dynamic font to " + ordinal, new Object[0]);
        OneMeApplication oneMeApplication = this.b;
        Configuration configuration = new Configuration(oneMeApplication.getResources().getConfiguration());
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        configuration.fontScale = Float.intBitsToFloat(Float.floatToRawIntBits(configuration.fontScale) + (Random.Default.nextBoolean() ? -1 : 1));
        oneMeApplication.getResources().updateConfiguration(configuration, oneMeApplication.getResources().getDisplayMetrics());
        oneMeApplication.onConfigurationChanged(configuration);
        return Unit.INSTANCE;
    }
}
