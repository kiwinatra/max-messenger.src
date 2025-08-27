package defpackage;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.messages.gallery.GalleryViewModel;

/* renamed from: no6  reason: default package */
public final class no6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ GalleryViewModel a;
    public final /* synthetic */ pm6 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public no6(GalleryViewModel galleryViewModel, pm6 pm6, Continuation continuation) {
        super(2, continuation);
        this.a = galleryViewModel;
        this.b = pm6;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new no6(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((no6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        GalleryViewModel galleryViewModel = this.a;
        Iterable<pm6> iterable = (Iterable) galleryViewModel.i.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (pm6 pm6 : iterable) {
            boolean areEqual = Intrinsics.areEqual((Object) pm6.a, (Object) this.b.a);
            if (pm6.b != areEqual) {
                pm6 = GalleryViewModel.j(galleryViewModel, pm6.a, areEqual, pm6.f, pm6.g);
            }
            arrayList.add(pm6);
        }
        return arrayList;
    }
}
