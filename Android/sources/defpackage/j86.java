package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.messages.settings.folders.picker.FoldersPickerViewModel;

/* renamed from: j86  reason: default package */
public final class j86 extends SuspendLambda implements Function2 {
    public ArrayList a;
    public ArrayList b;
    public int c;
    public final /* synthetic */ FoldersPickerViewModel o;
    public final /* synthetic */ String v;
    public final /* synthetic */ boolean w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j86(FoldersPickerViewModel foldersPickerViewModel, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.o = foldersPickerViewModel;
        this.v = str;
        this.w = z;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new j86(this.o, this.v, this.w, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j86) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean z;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        String str = this.v;
        FoldersPickerViewModel foldersPickerViewModel = this.o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList5 = new ArrayList(foldersPickerViewModel.k().b);
            ArrayList arrayList6 = new ArrayList(foldersPickerViewModel.k().c);
            ListIterator listIterator = arrayList5.listIterator();
            while (true) {
                boolean hasNext = listIterator.hasNext();
                z = this.w;
                if (!hasNext) {
                    break;
                }
                w16 w16 = (w16) listIterator.next();
                if (Intrinsics.areEqual((Object) w16.a, (Object) str)) {
                    listIterator.set(w16.a(w16, (CharSequence) null, z, 55));
                    break;
                }
            }
            if (z) {
                Iterator it = arrayList6.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (Intrinsics.areEqual((Object) ((iqd) obj2).a, (Object) str)) {
                        break;
                    }
                }
                if (obj2 != null) {
                    return Unit.INSTANCE;
                }
                this.a = arrayList5;
                this.b = arrayList6;
                this.c = 1;
                Object d = ((ia2) foldersPickerViewModel.h).d(str, this);
                if (d == coroutine_suspended) {
                    return coroutine_suspended;
                }
                arrayList4 = arrayList6;
                ArrayList arrayList7 = arrayList5;
                obj = d;
                arrayList3 = arrayList7;
            } else {
                Boxing.boxBoolean(CollectionsKt.removeAll(arrayList6, new iz1(str, 3)));
                arrayList2 = arrayList5;
                arrayList = arrayList6;
                xme xme = foldersPickerViewModel.l;
                z76 a2 = z76.a(foldersPickerViewModel.k(), false, arrayList2, arrayList, true, 25);
                xme.getClass();
                xme.m((Object) null, a2);
                return Unit.INSTANCE;
            }
        } else if (i == 1) {
            arrayList4 = this.b;
            arrayList3 = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        zx5 zx5 = (zx5) obj;
        if (zx5 != null) {
            Boxing.boxBoolean(arrayList4.add(new iqd(str, foldersPickerViewModel.d.a(zx5), FoldersPickerViewModel.l(foldersPickerViewModel.c, str))));
        }
        arrayList2 = arrayList3;
        arrayList = arrayList4;
        xme xme2 = foldersPickerViewModel.l;
        z76 a22 = z76.a(foldersPickerViewModel.k(), false, arrayList2, arrayList, true, 25);
        xme2.getClass();
        xme2.m((Object) null, a22);
        return Unit.INSTANCE;
    }
}
