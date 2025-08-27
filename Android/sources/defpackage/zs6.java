package defpackage;

import android.graphics.Picture;
import android.text.Layout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: zs6  reason: default package */
public final class zs6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ at6 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zs6(Layout layout, at6 at6, Continuation continuation) {
        super(2, continuation);
        this.a = layout;
        this.b = at6;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new zs6(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zs6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Layout layout = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xqb xqb = at6.c;
        Picture picture = (Picture) xqb.c();
        if (picture == null) {
            picture = new Picture();
        }
        try {
            layout.draw(picture.beginRecording(layout.getWidth(), layout.getHeight()));
            picture.endRecording();
            xqb.b(picture);
        } catch (Throwable th) {
            z68.f(this.b.b, "fail to warm layout", th);
        }
        return Unit.INSTANCE;
    }
}
