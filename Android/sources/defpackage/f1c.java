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

/* renamed from: f1c  reason: default package */
public final class f1c extends SuspendLambda implements Function2 {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ j1c b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f1c(Intent intent, j1c j1c, Continuation continuation) {
        super(2, continuation);
        this.a = intent;
        this.b = j1c;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new f1c(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f1c) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        RectF rectF = (RectF) this.a.getParcelableExtra("ru.ok.tamtam.extra.CROPPED_RECT");
        if (rectF == null) {
            return Unit.INSTANCE;
        }
        KProperty[] kPropertyArr = j1c.A0;
        j1c j1c = this.b;
        String absolutePath = ((po5) j1c.x.getValue()).r((String) j1c.z0.get()).getAbsolutePath();
        ev0.v(j1c.a, ((osa) j1c.j()).b(), (f14) null, new e1c(j1c, absolutePath, rectF, (Continuation) null), 2);
        return Unit.INSTANCE;
    }
}
