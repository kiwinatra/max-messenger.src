package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ru.ok.messages.gallery.GalleryViewModel;

/* renamed from: on6  reason: default package */
public final class on6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ GalleryViewModel a;
    public final /* synthetic */ boolean b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public on6(GalleryViewModel galleryViewModel, boolean z, Continuation continuation) {
        super(2, continuation);
        this.a = galleryViewModel;
        this.b = z;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new on6(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((on6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = GalleryViewModel.S;
        GalleryViewModel galleryViewModel = this.a;
        Iterable<Object> m = galleryViewModel.m();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(m, 10));
        for (Object obj2 : m) {
            if (obj2 instanceof sm6) {
                sm6 sm6 = (sm6) obj2;
                sm6 b2 = sm6.c != 0 ? sm6.b(sm6, 0, (Uri) null, 0, (Uri) null, (p4g) null, (dfb) null, 1021) : sm6;
                if (this.b) {
                    k48 k48 = b2.b;
                    if (!Intrinsics.areEqual((Object) b2.h, (Object) k48.Y)) {
                        obj2 = sm6.b(b2, 0, (Uri) null, 0, k48.Y, (p4g) null, (dfb) null, 959);
                    }
                }
                obj2 = b2;
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
