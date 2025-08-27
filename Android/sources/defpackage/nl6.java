package defpackage;

import android.view.View;
import android.widget.TextView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import ru.ok.messages.gallery.GalleryFragment;

/* renamed from: nl6  reason: default package */
public final class nl6 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ GalleryFragment b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nl6(GalleryFragment galleryFragment, Continuation continuation) {
        super(2, continuation);
        this.b = galleryFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        nl6 nl6 = new nl6(this.b, continuation);
        nl6.a = obj;
        return nl6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nl6) create((pm6) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        pm6 pm6 = (pm6) this.a;
        GalleryFragment galleryFragment = this.b;
        cl6 cl6 = galleryFragment.E1;
        cl6.getClass();
        KProperty[] kPropertyArr = cl6.y;
        KProperty kProperty = kPropertyArr[3];
        cl6 cl62 = galleryFragment.E1;
        cl62.getClass();
        KProperty kProperty2 = kPropertyArr[3];
        ((TextView) ((View) cl6.w.getValue(cl6, kProperty)).findViewById(lic.ll_media_empty_view__title)).setText(pm6.d);
        ((TextView) ((View) cl62.w.getValue(cl62, kProperty2)).findViewById(lic.ll_media_empty_view__subtitle)).setText(pm6.e);
        return Unit.INSTANCE;
    }
}
