package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.gallery.GalleryViewModel;

/* renamed from: un6  reason: default package */
public final class un6 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ GalleryViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public un6(GalleryViewModel galleryViewModel, Continuation continuation) {
        super(2, continuation);
        this.c = galleryViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        un6 un6 = new un6(this.c, continuation);
        un6.b = obj;
        return un6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((un6) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Boolean boxBoolean = Boxing.boxBoolean(this.c.m.b);
            this.a = 1;
            if (((ds5) this.b).a(boxBoolean, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
