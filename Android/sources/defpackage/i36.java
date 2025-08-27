package defpackage;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.page.FolderPageViewModel;

/* renamed from: i36  reason: default package */
public final class i36 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ FolderPageViewModel b;
    public final /* synthetic */ z26 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i36(z26 z26, Continuation continuation, FolderPageViewModel folderPageViewModel) {
        super(2, continuation);
        this.b = folderPageViewModel;
        this.c = z26;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new i36(this.c, continuation, this.b);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i36) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        z26 z26 = this.c;
        FolderPageViewModel folderPageViewModel = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            u82 u82 = folderPageViewModel.h;
            String str = z26.a;
            this.a = 1;
            ia2 ia2 = (ia2) u82;
            ia2.getClass();
            obj = ev0.I(ia2.x, new k92(ia2, str, (Continuation) null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterable<a32> iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (a32 a32 : iterable) {
            arrayList.add(Boxing.boxLong(a32.a));
        }
        xme xme = folderPageViewModel.m;
        o85 o85 = new o85(new c36(z26.a, arrayList));
        xme.getClass();
        xme.m((Object) null, o85);
        return Unit.INSTANCE;
    }
}
