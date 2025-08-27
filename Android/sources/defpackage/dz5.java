package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.edit.presentation.FolderEditFragment;

/* renamed from: dz5  reason: default package */
public final class dz5 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ boolean c = false;
    public final /* synthetic */ FolderEditFragment o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dz5(on2 on2, Continuation continuation, FolderEditFragment folderEditFragment) {
        super(2, continuation);
        this.b = on2;
        this.o = folderEditFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        dz5 dz5 = new dz5((on2) this.b, continuation, this.o);
        dz5.a = obj;
        return dz5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dz5) create((o85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
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
            yz5 yz5 = (yz5) a2;
            boolean z = yz5 instanceof wz5;
            FolderEditFragment folderEditFragment = this.o;
            if (z) {
                hd8.B(folderEditFragment.E2());
                ((z16) folderEditFragment.B1).n1();
            } else if (yz5 instanceof xz5) {
                hd8.B(folderEditFragment.E2());
                ((z16) folderEditFragment.B1).n1();
                ((z16) folderEditFragment.B1).p1(((xz5) yz5).a);
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
