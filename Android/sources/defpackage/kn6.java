package defpackage;

import android.net.Uri;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.gallery.GalleryViewModel;

/* renamed from: kn6  reason: default package */
public final class kn6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ GalleryViewModel a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Uri c;
    public final /* synthetic */ String o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kn6(GalleryViewModel galleryViewModel, String str, Uri uri, String str2, Continuation continuation) {
        super(2, continuation);
        this.a = galleryViewModel;
        this.b = str;
        this.c = uri;
        this.o = str2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new kn6(this.a, this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kn6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        GalleryViewModel galleryViewModel = this.a;
        m5a.o(galleryViewModel.c, this.c, this.b);
        bud bud = galleryViewModel.e;
        String str = this.o;
        o5a.X(bud, str, str);
        o5a.W(galleryViewModel.e, str);
        return Unit.INSTANCE;
    }
}
