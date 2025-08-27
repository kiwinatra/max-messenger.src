package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.folders.edit.FolderEditScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: nz5  reason: default package */
public final class nz5 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ FolderEditScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nz5(FolderEditScreen folderEditScreen, Continuation continuation) {
        super(2, continuation);
        this.b = folderEditScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        nz5 nz5 = new nz5(this.b, continuation);
        nz5.a = obj;
        return nz5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nz5) create((qz5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        qz5 qz5 = (qz5) this.a;
        boolean z = qz5 instanceof oz5;
        x2b x2b = s2b.a;
        FolderEditScreen folderEditScreen = this.b;
        if (z) {
            FolderEditScreen.c0(folderEditScreen).setTitle(iua.k);
            KProperty[] kPropertyArr = FolderEditScreen.y;
            KProperty kProperty = kPropertyArr[3];
            ReadOnlyProperty readOnlyProperty = folderEditScreen.x;
            ((OneMeButton) readOnlyProperty.getValue(folderEditScreen, kProperty)).setVisibility(0);
            ((OneMeButton) readOnlyProperty.getValue(folderEditScreen, kPropertyArr[3])).setEnabled(((oz5) qz5).b);
            FolderEditScreen.c0(folderEditScreen).setRightActions(x2b);
        } else if (qz5 instanceof pz5) {
            FolderEditScreen.c0(folderEditScreen).setTitle(iua.l);
            ((OneMeButton) folderEditScreen.x.getValue(folderEditScreen, FolderEditScreen.y[3])).setVisibility(8);
            h3b c0 = FolderEditScreen.c0(folderEditScreen);
            if (((pz5) qz5).c) {
                x2b = new r2b(new lz5(folderEditScreen, 1));
            }
            c0.setRightActions(x2b);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
