package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import ru.ok.messages.gallery.GalleryViewModel;

/* renamed from: oo6  reason: default package */
public final class oo6 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ pm6 b;
    public final /* synthetic */ GalleryViewModel c;
    public final /* synthetic */ pm6 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oo6(pm6 pm6, GalleryViewModel galleryViewModel, pm6 pm62, Continuation continuation) {
        super(2, continuation);
        this.b = pm6;
        this.c = galleryViewModel;
        this.o = pm62;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new oo6(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((oo6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        pm6 pm6 = this.o;
        GalleryViewModel galleryViewModel = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            pm6 pm62 = this.b;
            if (pm62 != null) {
                s48 s48 = galleryViewModel.f;
                vk6 vk6 = pm62.a.a;
                int i2 = galleryViewModel.q.f;
                this.a = 1;
                if (((yd7) s48).h(vk6, i2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            galleryViewModel.i.setValue((List) obj);
            galleryViewModel.G = ev0.v(b0h.C(galleryViewModel), ((osa) galleryViewModel.o()).e().plus(galleryViewModel.h), (f14) null, new sn6(galleryViewModel, pm6.a, (Continuation) null), 2);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        KProperty[] kPropertyArr = GalleryViewModel.S;
        q04 a2 = ((osa) galleryViewModel.o()).a();
        no6 no6 = new no6(galleryViewModel, pm6, (Continuation) null);
        this.a = 2;
        obj = ev0.I(a2, no6, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        galleryViewModel.i.setValue((List) obj);
        galleryViewModel.G = ev0.v(b0h.C(galleryViewModel), ((osa) galleryViewModel.o()).e().plus(galleryViewModel.h), (f14) null, new sn6(galleryViewModel, pm6.a, (Continuation) null), 2);
        return Unit.INSTANCE;
    }
}
