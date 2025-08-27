package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;

/* renamed from: rpd  reason: default package */
public final class rpd extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ SelectAlbumWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rpd(Continuation continuation, SelectAlbumWidget selectAlbumWidget) {
        super(2, continuation);
        this.b = selectAlbumWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        rpd rpd = new rpd(continuation, this.b);
        rpd.a = obj;
        return rpd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rpd) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        bpd bpd = (bpd) this.a;
        if (bpd instanceof bpd) {
            KProperty[] kPropertyArr = SelectAlbumWidget.w;
            this.b.d0().j(bpd.a);
            return Unit.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
