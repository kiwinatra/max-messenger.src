package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.folders.edit.FolderEditScreen;

/* renamed from: mz5  reason: default package */
public final class mz5 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ FolderEditScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mz5(FolderEditScreen folderEditScreen, Continuation continuation) {
        super(2, continuation);
        this.b = folderEditScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        mz5 mz5 = new mz5(this.b, continuation);
        mz5.a = obj;
        return mz5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mz5) create((ty5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        qc7 qc7;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ty5 ty5 = (ty5) this.a;
        boolean z = ty5 instanceof qy5;
        FolderEditScreen folderEditScreen = this.b;
        if (z) {
            KProperty[] kPropertyArr = FolderEditScreen.y;
            folderEditScreen.e0();
            folderEditScreen.getRouter().C();
            if (((qy5) ty5).a && (qc7 = (qc7) i66.a.getAccessor().j(qc7.class)) != null) {
                qc7.f(SetsKt.setOf(new pc7(nc7.CREATE_FOLDER, 1)), jgd.SETTINGS_FOLDERS);
            }
        } else if (ty5 instanceof sy5) {
            String str = ((i9d) CollectionsKt.last(folderEditScreen.getRouter().e())).b;
            if (str == null) {
                return Unit.INSTANCE;
            }
            folderEditScreen.e0();
            z16.b.W0().b(g63.j(":settings/folder/members-picker?tag=", str, "&members_ids=", CollectionsKt___CollectionsKt.joinToString$default(((sy5) ty5).a, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null)), (Bundle) null);
        } else if (ty5 instanceof ry5) {
            KProperty[] kPropertyArr2 = FolderEditScreen.y;
            kr7.N(String.valueOf(((qz5) folderEditScreen.d0().Z.a.getValue()).a()), folderEditScreen);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
