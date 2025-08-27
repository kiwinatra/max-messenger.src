package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.page.FolderPageFragment;

/* renamed from: i26  reason: default package */
public final class i26 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ boolean c = false;
    public final /* synthetic */ FolderPageFragment o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i26(on2 on2, Continuation continuation, FolderPageFragment folderPageFragment) {
        super(2, continuation);
        this.b = on2;
        this.o = folderPageFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        i26 i26 = new i26((on2) this.b, continuation, this.o);
        i26.a = obj;
        return i26;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i26) create((o85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
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
            f36 f36 = (f36) a2;
            boolean z = f36 instanceof a36;
            FolderPageFragment folderPageFragment = this.o;
            if (z) {
                ((z16) folderPageFragment.B1).n1();
            } else if (f36 instanceof d36) {
                ((z16) folderPageFragment.B1).o1(((d36) f36).a);
            } else if (f36 instanceof c36) {
                folderPageFragment.G1.a(new w9f(((c36) f36).a, (ArrayList) ((c36) f36).b));
            } else if (f36 instanceof b36) {
                r46 r46 = folderPageFragment.B1;
                long j = ((b36) f36).a;
                ta4 W0 = ((z16) r46).W0();
                W0.b(":chats?id=" + j + "&type=local", (Bundle) null);
            } else if (f36 instanceof e36) {
                r46 r462 = folderPageFragment.B1;
                String str = ((e36) f36).a;
                ta4 W02 = ((z16) r462).W0();
                W02.b(":settings/folder/filter?id=" + str, (Bundle) null);
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
