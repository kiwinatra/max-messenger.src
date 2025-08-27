package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import ru.ok.messages.settings.folders.filters.presentation.FolderFiltersViewModel;

/* renamed from: g16  reason: default package */
public final class g16 extends SuspendLambda implements Function2 {
    public boolean a;
    public int b;
    public final /* synthetic */ FolderFiltersViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g16(FolderFiltersViewModel folderFiltersViewModel, Continuation continuation) {
        super(2, continuation);
        this.c = folderFiltersViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new g16(this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g16) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        String str = null;
        FolderFiltersViewModel folderFiltersViewModel = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            T t = (List) folderFiltersViewModel.j.getValue();
            if (t == null) {
                return Unit.INSTANCE;
            }
            objectRef.element = t;
            xme xme = folderFiltersViewModel.h;
            List list = (List) xme.getValue();
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object next : list) {
                    if (((qo5) next).c) {
                        arrayList.add(next);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (SetsKt.setOf(q82.w, q82.v).contains(((qo5) it.next()).b)) {
                                z2 = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            z2 = false;
            xme xme2 = folderFiltersViewModel.j;
            if (!z2) {
                Iterable<qo5> iterable = (Iterable) objectRef.element;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                for (qo5 a2 : iterable) {
                    arrayList2.add(qo5.a(a2, false));
                }
                xme2.setValue(CollectionsKt.toList(arrayList2));
            }
            List list2 = (List) xme.getValue();
            if (list2 == null) {
                return Unit.INSTANCE;
            }
            T t2 = (List) xme2.getValue();
            if (t2 == null) {
                return Unit.INSTANCE;
            }
            objectRef.element = t2;
            List list3 = (List) folderFiltersViewModel.l.getValue();
            if (list3 == null) {
                return Unit.INSTANCE;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
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
            for (Object next3 : (Iterable) objectRef.element) {
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
            ArrayList arrayList7 = new ArrayList();
            for (Object next4 : list3) {
                if (((qo5) next4).c) {
                    arrayList7.add(next4);
                }
            }
            ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
            Iterator it4 = arrayList7.iterator();
            while (it4.hasNext()) {
                arrayList8.add(((qo5) it4.next()).b);
            }
            linkedHashSet.addAll(arrayList8);
            this.a = z2;
            this.b = 1;
            ia2 ia2 = (ia2) folderFiltersViewModel.e;
            ia2.getClass();
            obj = ev0.I(ia2.x, new h92(ia2, linkedHashSet, (Continuation) null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            z = z2;
        } else if (i == 1) {
            z = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int size = ((List) obj).size();
        xme xme3 = folderFiltersViewModel.p;
        if (size > 0) {
            str = folderFiltersViewModel.c.getString(qad.n3, new Object[]{Boxing.boxInt(size)});
        }
        xme3.setValue(str);
        folderFiltersViewModel.r.setValue(Boxing.boxBoolean(z));
        return Unit.INSTANCE;
    }
}
