package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.messages.gallery.GalleryViewModel;

/* renamed from: ep6  reason: default package */
public final class ep6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ GalleryViewModel a;
    public final /* synthetic */ boolean b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ep6(GalleryViewModel galleryViewModel, boolean z, Continuation continuation) {
        super(2, continuation);
        this.a = galleryViewModel;
        this.b = z;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ep6(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ep6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        z68.c(GalleryViewModel.T, "updateUiItemsBySelections()", new Object[0]);
        GalleryViewModel galleryViewModel = this.a;
        Iterable<Object> m = galleryViewModel.m();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(m, 10));
        for (Object obj2 : m) {
            if (!Intrinsics.areEqual(obj2, (Object) qm6.b)) {
                if (obj2 instanceof sm6) {
                    int n = this.b ? 0 : galleryViewModel.n(((sm6) obj2).b);
                    sm6 sm6 = (sm6) obj2;
                    obj2 = n != sm6.c ? sm6.b(sm6, n, (Uri) null, 0, (Uri) null, (p4g) null, (dfb) null, 1021) : sm6;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            arrayList.add(obj2);
        }
        o85 o85 = new o85(arrayList);
        xme xme = galleryViewModel.o;
        xme.getClass();
        xme.m((Object) null, o85);
        return Unit.INSTANCE;
    }
}
