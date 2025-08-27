package defpackage;

import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: j7a  reason: default package */
public final class j7a extends SuspendLambda implements Function2 {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ l7a b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j7a(Intent intent, l7a l7a, Continuation continuation) {
        super(2, continuation);
        this.a = intent;
        this.b = l7a;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new j7a(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j7a) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        RectF rectF = (RectF) this.a.getParcelableExtra("ru.ok.tamtam.extra.CROPPED_RECT");
        if (rectF == null) {
            return Unit.INSTANCE;
        }
        Rect rect = (Rect) this.a.getParcelableExtra("ru.ok.tamtam.extra.CROPPED_ABSOLUTE");
        if (rect == null) {
            return Unit.INSTANCE;
        }
        String absolutePath = ((po5) this.b.b.getValue()).r(this.b.k).getAbsolutePath();
        l7a l7a = this.b;
        sd0 sd0 = sd0.a;
        l7a.getClass();
        ev0.v(l7a.f, (CoroutineContext) null, (f14) null, new i7a(absolutePath, rect, l7a, rectF, sd0, (Continuation) null), 3);
        return Unit.INSTANCE;
    }
}
