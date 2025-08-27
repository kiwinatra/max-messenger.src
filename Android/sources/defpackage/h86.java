package defpackage;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.picker.FoldersPickerViewModel;

/* renamed from: h86  reason: default package */
public final class h86 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ FoldersPickerViewModel b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h86(FoldersPickerViewModel foldersPickerViewModel, Continuation continuation) {
        super(2, continuation);
        this.b = foldersPickerViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        h86 h86 = new h86(this.b, continuation);
        h86.a = obj;
        return h86;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h86) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        d14 d14 = (d14) this.a;
        if (!e14.f(d14)) {
            return Unit.INSTANCE;
        }
        this.b.r = null;
        Iterable<iqd> iterable = this.b.k().c;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (iqd iqd : iterable) {
            arrayList.add(iqd.a);
        }
        Iterable<w16> iterable2 = this.b.p;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
        for (w16 w16 : iterable2) {
            arrayList2.add(w16.a(w16, w16.c, arrayList.contains(w16.a), 51));
        }
        if (!e14.f(d14)) {
            return Unit.INSTANCE;
        }
        FoldersPickerViewModel foldersPickerViewModel = this.b;
        xme xme = foldersPickerViewModel.l;
        z76 a2 = z76.a(foldersPickerViewModel.k(), false, arrayList2, (ArrayList) null, false, 61);
        xme.getClass();
        xme.m((Object) null, a2);
        return Unit.INSTANCE;
    }
}
