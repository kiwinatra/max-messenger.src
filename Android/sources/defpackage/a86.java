package defpackage;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.picker.FoldersPickerViewModel;

/* renamed from: a86  reason: default package */
public final class a86 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ FoldersPickerViewModel b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a86(FoldersPickerViewModel foldersPickerViewModel, Continuation continuation) {
        super(2, continuation);
        this.b = foldersPickerViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new a86(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a86) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        FoldersPickerViewModel foldersPickerViewModel = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Iterable<iqd> iterable = foldersPickerViewModel.k().c;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            for (iqd iqd : iterable) {
                arrayList.add(iqd.a);
            }
            long j = ((qs9) foldersPickerViewModel.c).a;
            this.a = 1;
            ia2 ia2 = (ia2) foldersPickerViewModel.h;
            ia2.getClass();
            Object I = ev0.I(ia2.x, new w92(ia2, j, arrayList, (Continuation) null), this);
            if (I != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                I = Unit.INSTANCE;
            }
            if (I == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xme xme = foldersPickerViewModel.n;
        o85 o85 = new o85(v76.a);
        xme.getClass();
        xme.m((Object) null, o85);
        return Unit.INSTANCE;
    }
}
