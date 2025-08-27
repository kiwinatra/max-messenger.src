package defpackage;

import android.net.Uri;
import androidx.fragment.app.a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.views.ActAvatarCrop;

/* renamed from: sle  reason: default package */
public final class sle extends SuspendLambda implements Function2 {
    public final /* synthetic */ a a;
    public final /* synthetic */ Uri b;
    public final /* synthetic */ String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sle(a aVar, Uri uri, String str, Continuation continuation) {
        super(2, continuation);
        this.a = aVar;
        this.b = uri;
        this.c = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new sle(this.a, this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sle) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ActAvatarCrop.T(this.a, this.b, this.c, false, true, true);
        return Unit.INSTANCE;
    }
}
