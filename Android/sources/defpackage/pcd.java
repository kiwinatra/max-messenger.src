package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.views.dialogs.SaveToGalleryDialog;

/* renamed from: pcd  reason: default package */
public final class pcd extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ SaveToGalleryDialog b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pcd(SaveToGalleryDialog saveToGalleryDialog, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.b = saveToGalleryDialog;
        this.c = str;
        this.o = z;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new pcd(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pcd) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        SaveToGalleryDialog saveToGalleryDialog = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            vcd vcd = new vcd(((qra) ryg.x(saveToGalleryDialog)).A(), ((osa) ((qra) ((id3) saveToGalleryDialog.E1.b)).G()).b(), (jab) ((qra) ryg.x(saveToGalleryDialog)).getAccessor().g(jab.class));
            this.a = 1;
            obj = vcd.b(this.c, this.o, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        saveToGalleryDialog.c3(((Boolean) obj).booleanValue());
        return Unit.INSTANCE;
    }
}
