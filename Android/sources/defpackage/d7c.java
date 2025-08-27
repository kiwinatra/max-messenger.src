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

/* renamed from: d7c  reason: default package */
public final class d7c extends SuspendLambda implements Function2 {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ k7c b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d7c(Intent intent, k7c k7c, Continuation continuation) {
        super(2, continuation);
        this.a = intent;
        this.b = k7c;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new d7c(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d7c) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        RectF rectF = (RectF) this.a.getParcelableExtra("ru.ok.tamtam.extra.CROPPED_RECT");
        if (rectF == null) {
            return Unit.INSTANCE;
        }
        KProperty[] kPropertyArr = k7c.M0;
        k7c k7c = this.b;
        String absolutePath = ((po5) k7c.v0.getValue()).r((String) k7c.J0.get()).getAbsolutePath();
        ev0.v(k7c.a, ((osa) k7c.n()).b(), (f14) null, new c7c(k7c, absolutePath, rectF, (Continuation) null), 2);
        return Unit.INSTANCE;
    }
}
