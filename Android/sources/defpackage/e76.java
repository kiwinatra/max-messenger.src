package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.messages.settings.folders.picker.FoldersPickerFragment;

/* renamed from: e76  reason: default package */
public final class e76 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ boolean c = false;
    public final /* synthetic */ FoldersPickerFragment o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e76(on2 on2, Continuation continuation, FoldersPickerFragment foldersPickerFragment) {
        super(2, continuation);
        this.b = on2;
        this.o = foldersPickerFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        e76 e76 = new e76((on2) this.b, continuation, this.o);
        e76.a = obj;
        return e76;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e76) create((o85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Object a2 = ((o85) this.a).a();
        if (Result.m26exceptionOrNullimpl(a2) != null) {
            return Unit.INSTANCE;
        }
        try {
            y76 y76 = (y76) a2;
            boolean z = y76 instanceof v76;
            FoldersPickerFragment foldersPickerFragment = this.o;
            if (z) {
                ((z16) foldersPickerFragment.C1).n1();
            } else if (y76 instanceof w76) {
                foldersPickerFragment.Q1().f0("folders.picker.request.key", o54.f(TuplesKt.to("folders.picker.result", new List[]{((w76) y76).a})));
                ((z16) foldersPickerFragment.C1).n1();
            } else if (Intrinsics.areEqual((Object) y76, (Object) x76.a)) {
                ((z16) foldersPickerFragment.C1).o1(xy5.a);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            obj2 = Result.m23constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            obj2 = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        if (!this.c) {
            ResultKt.throwOnFailure(obj2);
        }
        return Unit.INSTANCE;
    }
}
