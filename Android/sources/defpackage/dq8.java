package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.sdk.gallery.MediaGalleryWidget;

/* renamed from: dq8  reason: default package */
public final class dq8 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MediaGalleryWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dq8(MediaGalleryWidget mediaGalleryWidget, Continuation continuation) {
        super(2, continuation);
        this.b = mediaGalleryWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        dq8 dq8 = new dq8(this.b, continuation);
        dq8.a = obj;
        return dq8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dq8) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        List list = (List) this.a;
        list.size();
        KProperty[] kPropertyArr = MediaGalleryWidget.x;
        MediaGalleryWidget mediaGalleryWidget = this.b;
        mediaGalleryWidget.c0().setVisibility(list.isEmpty() ^ true ? 0 : 8);
        ((kk6) mediaGalleryWidget.o.getValue()).G(list);
        om6 d0 = mediaGalleryWidget.d0();
        int size = list.size();
        xme xme = d0.v;
        Integer valueOf = Integer.valueOf(size);
        xme.getClass();
        xme.m((Object) null, valueOf);
        return Unit.INSTANCE;
    }
}
