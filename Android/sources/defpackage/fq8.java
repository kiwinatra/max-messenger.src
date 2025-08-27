package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.sdk.gallery.MediaGalleryWidget;

/* renamed from: fq8  reason: default package */
public final class fq8 extends SuspendLambda implements Function2 {
    public /* synthetic */ boolean a;
    public final /* synthetic */ MediaGalleryWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fq8(MediaGalleryWidget mediaGalleryWidget, Continuation continuation) {
        super(2, continuation);
        this.b = mediaGalleryWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        fq8 fq8 = new fq8(this.b, continuation);
        fq8.a = ((Boolean) obj).booleanValue();
        return fq8;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((fq8) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean z = this.a;
        KProperty[] kPropertyArr = MediaGalleryWidget.x;
        this.b.c0().setRefreshingNext(z);
        return Unit.INSTANCE;
    }
}
