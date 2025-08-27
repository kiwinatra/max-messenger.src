package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.filters.presentation.FolderFiltersViewModel;

/* renamed from: c16  reason: default package */
public final class c16 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ FolderFiltersViewModel b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c16(FolderFiltersViewModel folderFiltersViewModel, Continuation continuation) {
        super(2, continuation);
        this.b = folderFiltersViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new c16(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c16) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        FolderFiltersViewModel folderFiltersViewModel = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            aje aje = folderFiltersViewModel.t;
            if (aje != null) {
                this.a = 1;
                if (aje.d(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            hsg.l(folderFiltersViewModel.n);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List list = (List) folderFiltersViewModel.h.getValue();
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        List list2 = (List) folderFiltersViewModel.j.getValue();
        if (list2 == null) {
            list2 = CollectionsKt.emptyList();
        }
        List list3 = (List) folderFiltersViewModel.l.getValue();
        if (list3 == null) {
            list3 = CollectionsKt.emptyList();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((qo5) next).c) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((qo5) it.next()).b);
        }
        linkedHashSet.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object next2 : list2) {
            if (((qo5) next2).c) {
                arrayList3.add(next2);
            }
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((qo5) it2.next()).b);
        }
        linkedHashSet.addAll(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        for (Object next3 : list3) {
            if (((qo5) next3).c) {
                arrayList5.add(next3);
            }
        }
        ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            arrayList6.add(((qo5) it3.next()).b);
        }
        linkedHashSet.addAll(arrayList6);
        folderFiltersViewModel.f.e("FOLDER_FILTERS_CHANGE");
        this.a = 2;
        ia2 ia2 = (ia2) folderFiltersViewModel.e;
        ia2.getClass();
        Object I = ev0.I(ia2.x, new v92(ia2, folderFiltersViewModel.d, linkedHashSet, (Continuation) null), this);
        if (I != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            I = Unit.INSTANCE;
        }
        if (I != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            I = Unit.INSTANCE;
        }
        if (I == coroutine_suspended) {
            return coroutine_suspended;
        }
        hsg.l(folderFiltersViewModel.n);
        return Unit.INSTANCE;
    }
}
