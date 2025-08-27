package defpackage;

import android.content.Intent;
import android.graphics.RectF;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: tyd  reason: default package */
public final class tyd extends SuspendLambda implements Function2 {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ wyd b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tyd(Intent intent, wyd wyd, Continuation continuation) {
        super(2, continuation);
        this.a = intent;
        this.b = wyd;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new tyd(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tyd) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        RectF rectF = (RectF) this.a.getParcelableExtra("ru.ok.tamtam.extra.CROPPED_RECT");
        if (rectF == null) {
            return Unit.INSTANCE;
        }
        KProperty[] kPropertyArr = wyd.E0;
        wyd wyd = this.b;
        wyd.n(((po5) wyd.y.getValue()).r((String) wyd.B0.get()).getAbsolutePath(), rectF);
        return Unit.INSTANCE;
    }
}
