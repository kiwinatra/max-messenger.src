package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KProperty;
import ru.ok.messages.gallery.GalleryViewModel;

/* renamed from: qn6  reason: default package */
public final class qn6 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ GalleryViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qn6(Set set, Continuation continuation, GalleryViewModel galleryViewModel) {
        super(2, continuation);
        this.b = set;
        this.c = galleryViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        qn6 qn6 = new qn6(this.b, continuation, this.c);
        qn6.a = obj;
        return qn6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qn6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        d14 d14 = (d14) this.a;
        List mutableList = CollectionsKt.toMutableList(this.b);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        KProperty[] kPropertyArr = GalleryViewModel.S;
        GalleryViewModel galleryViewModel = this.c;
        Iterable<Object> m = galleryViewModel.m();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(m, 10));
        for (Object obj2 : m) {
            if (!e14.f(d14)) {
                return Unit.INSTANCE;
            }
            if (!mutableList.isEmpty() && (obj2 instanceof sm6)) {
                sm6 sm6 = (sm6) obj2;
                Uri uri = sm6.b.b;
                KProperty kProperty = GalleryViewModel.S[1];
                sv3 c2 = ((wj0) ((ou8) galleryViewModel.n.get())).c(uri.toString());
                Iterator it = mutableList.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    Uri c3 = ((uqd) it.next()).a.c();
                    if (y64.a(uri, c3) ? true : c2 == null ? false : Intrinsics.areEqual((Object) String.valueOf(c3), (Object) c2.e)) {
                        break;
                    }
                    i++;
                }
                if (i != -1) {
                    mutableList.remove(i);
                    int n = galleryViewModel.n(sm6.b);
                    if (sm6.c != n) {
                        booleanRef.element = true;
                        obj2 = sm6.b(sm6, n, (Uri) null, 0, (Uri) null, (p4g) null, (dfb) null, 1021);
                    }
                }
            }
            arrayList.add(obj2);
        }
        if (e14.f(d14) && booleanRef.element) {
            o85 o85 = new o85(arrayList);
            xme xme = galleryViewModel.o;
            xme.getClass();
            xme.m((Object) null, o85);
        }
        return Unit.INSTANCE;
    }
}
