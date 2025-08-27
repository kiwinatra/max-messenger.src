package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.messages.settings.folders.page.FolderPageViewModel;

/* renamed from: n36  reason: default package */
public final class n36 extends SuspendLambda implements Function2 {
    public List a;
    public c05 b;
    public int c;
    public int o;
    public final /* synthetic */ FolderPageViewModel v;
    public final /* synthetic */ String w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n36(FolderPageViewModel folderPageViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.v = folderPageViewModel;
        this.w = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new n36(this.v, this.w, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n36) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        List list;
        c05 c05;
        int i;
        String str;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.o;
        FolderPageViewModel folderPageViewModel = this.v;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            List list2 = folderPageViewModel.k().i;
            if (list2 == null) {
                return Unit.INSTANCE;
            }
            Iterator it = list2.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                str = this.w;
                if (!hasNext) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (Intrinsics.areEqual((Object) ((c05) obj2).a, (Object) str)) {
                    break;
                }
            }
            c05 = (c05) obj2;
            if (c05 == null) {
                return Unit.INSTANCE;
            }
            boolean z2 = !c05.d;
            folderPageViewModel.i.e("FOLDER_EXCLUDE");
            this.a = list2;
            this.b = c05;
            this.c = z2 ? 1 : 0;
            this.o = 1;
            ia2 ia2 = (ia2) folderPageViewModel.h;
            ia2.getClass();
            Object I = ev0.I(ia2.x, new u92(ia2, str, z2, (Continuation) null), this);
            if (I != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                I = Unit.INSTANCE;
            }
            if (I == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = list2;
            i = z2;
        } else if (i2 == 1) {
            i = this.c;
            c05 = this.b;
            list = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterable iterable = list;
        if (i == 0) {
            z = false;
        }
        kne.I(iterable, c05, new c05(c05.a, c05.b, c05.c, z));
        g36 a2 = g36.a(folderPageViewModel.k(), (List) null, CollectionsKt.toList(iterable), (List) null, 1791);
        xme xme = folderPageViewModel.k;
        xme.getClass();
        xme.m((Object) null, a2);
        return Unit.INSTANCE;
    }
}
