package defpackage;

import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import one.me.folders.edit.FolderEditScreen;
import one.me.folders.picker.FolderMemberPickerScreen;

/* renamed from: r16  reason: default package */
public final class r16 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ FolderMemberPickerScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r16(Continuation continuation, FolderMemberPickerScreen folderMemberPickerScreen) {
        super(2, continuation);
        this.b = folderMemberPickerScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        r16 r16 = new r16(continuation, this.b);
        r16.a = obj;
        return r16;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((r16) create((n16) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        n16 n16 = (n16) this.a;
        if (n16 instanceof n16) {
            KProperty[] kPropertyArr = FolderMemberPickerScreen.v0;
            FolderMemberPickerScreen folderMemberPickerScreen = this.b;
            folderMemberPickerScreen.getClass();
            KProperty[] kPropertyArr2 = FolderMemberPickerScreen.v0;
            KProperty kProperty = kPropertyArr2[1];
            is isVar = folderMemberPickerScreen.Z;
            if (!StringsKt.isBlank((String) isVar.a(folderMemberPickerScreen))) {
                e9d router = folderMemberPickerScreen.getRouter();
                KProperty kProperty2 = kPropertyArr2[1];
                zx3 g = router.g((String) isVar.a(folderMemberPickerScreen));
                u36 u36 = g instanceof u36 ? (u36) g : null;
                if (u36 != null) {
                    Set set = n16.a;
                    m06 d0 = ((FolderEditScreen) u36).d0();
                    d0.C0.setValue(d0, m06.D0[1], ev0.u(d0.a, ((osa) d0.o).b(), f14.b, new e06(d0, set, (Continuation) null)));
                }
            }
            folderMemberPickerScreen.getRouter().C();
            return Unit.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
