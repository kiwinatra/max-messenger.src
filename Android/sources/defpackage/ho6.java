package defpackage;

import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import ru.ok.messages.gallery.GalleryViewModel;

/* renamed from: ho6  reason: default package */
public final class ho6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ GalleryViewModel a;
    public final /* synthetic */ uqd b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ho6(GalleryViewModel galleryViewModel, uqd uqd, Continuation continuation) {
        super(2, continuation);
        this.a = galleryViewModel;
        this.b = uqd;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ho6(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ho6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        uqd uqd;
        Uri uri;
        int i;
        boolean z = true;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = GalleryViewModel.S;
        GalleryViewModel galleryViewModel = this.a;
        Iterator it = galleryViewModel.m().iterator();
        int i2 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            uqd = this.b;
            if (!hasNext) {
                i2 = -1;
                break;
            }
            um6 um6 = (um6) it.next();
            if (!(um6 instanceof sm6) ? false : y64.a(((sm6) um6).b.b, uqd.a.c())) {
                break;
            }
            i2++;
        }
        Integer boxInt = Boxing.boxInt(i2);
        if (boxInt.intValue() < 0) {
            z = false;
        }
        if (!z) {
            boxInt = null;
        }
        if (boxInt == null) {
            return Unit.INSTANCE;
        }
        int intValue = boxInt.intValue();
        sm6 sm6 = (sm6) galleryViewModel.m().get(intValue);
        dfb dfb = uqd.c;
        p4g p4g = uqd.b;
        List mutableList = CollectionsKt.toMutableList(galleryViewModel.m());
        dfb dfb2 = uqd.c;
        Uri uri2 = dfb2 != null ? dfb2.v : null;
        d48 d48 = uqd.a;
        int i3 = d48.v;
        Uri uri3 = sm6.h;
        if (dfb.b(dfb, d48)) {
            Uri a2 = dfb.a(dfb, d48);
            i = 0;
            if (!StringsKt__StringsJVMKt.equals$default(a2.getPath(), d48.c, false, 2, (Object) null)) {
                uri = a2;
                mutableList.set(intValue, sm6.b(sm6, 0, uri2, i, uri, p4g, dfb, 143));
                o85 o85 = new o85(mutableList);
                xme xme = galleryViewModel.o;
                xme.getClass();
                xme.m((Object) null, o85);
                return Unit.INSTANCE;
            }
        } else {
            i = i3;
        }
        uri = uri3;
        mutableList.set(intValue, sm6.b(sm6, 0, uri2, i, uri, p4g, dfb, 143));
        o85 o852 = new o85(mutableList);
        xme xme2 = galleryViewModel.o;
        xme2.getClass();
        xme2.m((Object) null, o852);
        return Unit.INSTANCE;
    }
}
