package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.picker.FoldersPickerViewModel;

/* renamed from: k86  reason: default package */
public final class k86 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ FoldersPickerViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k86(FoldersPickerViewModel foldersPickerViewModel, Continuation continuation) {
        super(2, continuation);
        this.c = foldersPickerViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        k86 k86 = new k86(this.c, continuation);
        k86.b = obj;
        return k86;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k86) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        FoldersPickerViewModel foldersPickerViewModel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FoldersPickerViewModel foldersPickerViewModel2 = this.c;
            this.b = foldersPickerViewModel2;
            this.a = 1;
            obj = FoldersPickerViewModel.j(foldersPickerViewModel2, (List) this.b, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            foldersPickerViewModel = foldersPickerViewModel2;
        } else if (i == 1) {
            foldersPickerViewModel = (FoldersPickerViewModel) this.b;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        foldersPickerViewModel.p = (List) obj;
        FoldersPickerViewModel foldersPickerViewModel3 = this.c;
        xme xme = foldersPickerViewModel3.l;
        z76 a2 = z76.a(foldersPickerViewModel3.k(), this.c.p.isEmpty(), new ArrayList(this.c.p), (ArrayList) null, false, 60);
        xme.getClass();
        xme.m((Object) null, a2);
        return Unit.INSTANCE;
    }
}
