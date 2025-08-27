package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.filters.presentation.FolderFiltersViewModel;

/* renamed from: b16  reason: default package */
public final class b16 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ FolderFiltersViewModel b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b16(FolderFiltersViewModel folderFiltersViewModel, Continuation continuation) {
        super(2, continuation);
        this.b = folderFiltersViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new b16(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b16) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Set set;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        FolderFiltersViewModel folderFiltersViewModel = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            u82 u82 = folderFiltersViewModel.e;
            this.a = 1;
            obj = ((ia2) u82).d(folderFiltersViewModel.d, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        zx5 zx5 = (zx5) obj;
        if (zx5 == null) {
            return Unit.INSTANCE;
        }
        Set of = SetsKt.setOf(q82.y, q82.z, q82.w, q82.v, q82.X);
        Iterable iterable = (List) ((ia2) folderFiltersViewModel.e).G0.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (of.contains(((Pair) next).getFirst())) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            set = zx5.w;
            if (!hasNext) {
                break;
            }
            Pair pair = (Pair) it.next();
            arrayList2.add(new qo5((String) pair.getSecond(), (q82) pair.getFirst(), set.contains((q82) pair.getFirst())));
        }
        xme xme = folderFiltersViewModel.h;
        xme.getClass();
        xme.m((Object) null, arrayList2);
        Set of2 = SetsKt.setOf(q82.Z, q82.Y);
        ArrayList arrayList3 = new ArrayList();
        for (Object next2 : iterable) {
            if (of2.contains(((Pair) next2).getFirst())) {
                arrayList3.add(next2);
            }
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Pair pair2 = (Pair) it2.next();
            arrayList4.add(new qo5((String) pair2.getSecond(), (q82) pair2.getFirst(), set.contains((q82) pair2.getFirst())));
        }
        xme xme2 = folderFiltersViewModel.j;
        xme2.getClass();
        xme2.m((Object) null, arrayList4);
        Set of3 = SetsKt.setOf(q82.x0, q82.v0, q82.w0, q82.y0);
        ArrayList arrayList5 = new ArrayList();
        for (Object next3 : iterable) {
            if (of3.contains(((Pair) next3).getFirst())) {
                arrayList5.add(next3);
            }
        }
        ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            Pair pair3 = (Pair) it3.next();
            arrayList6.add(new qo5((String) pair3.getSecond(), (q82) pair3.getFirst(), set.contains((q82) pair3.getFirst())));
        }
        xme xme3 = folderFiltersViewModel.l;
        xme3.getClass();
        xme3.m((Object) null, arrayList6);
        this.a = 2;
        if (FolderFiltersViewModel.j(folderFiltersViewModel, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
