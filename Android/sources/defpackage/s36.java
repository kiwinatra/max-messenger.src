package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.messages.settings.folders.page.FolderPageViewModel;

/* renamed from: s36  reason: default package */
public final class s36 extends ContinuationImpl {
    public FolderPageViewModel a;
    public /* synthetic */ Object b;
    public final /* synthetic */ FolderPageViewModel c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s36(FolderPageViewModel folderPageViewModel, Continuation continuation) {
        super(continuation);
        this.c = folderPageViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return FolderPageViewModel.j(this.c, (List) null, this);
    }
}
