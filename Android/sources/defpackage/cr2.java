package defpackage;

import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: cr2  reason: default package */
public final class cr2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ fr2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cr2(Intent intent, fr2 fr2, Continuation continuation) {
        super(2, continuation);
        this.a = intent;
        this.b = fr2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new cr2(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cr2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
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
        fr2 fr2 = this.b;
        KProperty[] kPropertyArr = fr2.H0;
        this.b.k(((po5) fr2.y.getValue()).r(this.b.E0).getAbsolutePath(), rectF, rect);
        return Unit.INSTANCE;
    }
}
