package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.channels.CreateChannelViewModel;

/* renamed from: j34  reason: default package */
public final class j34 extends SuspendLambda implements Function2 {
    public File a;
    public int b;
    public final /* synthetic */ CreateChannelViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j34(CreateChannelViewModel createChannelViewModel, Continuation continuation) {
        super(2, continuation);
        this.c = createChannelViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new j34(this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j34) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        File file;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        CreateChannelViewModel createChannelViewModel = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ln5 ln5 = createChannelViewModel.d;
            po5 po5 = (po5) ln5;
            File r = po5.r((String) createChannelViewModel.D.getValue(createChannelViewModel, CreateChannelViewModel.G[7]));
            String absolutePath = r.getAbsolutePath();
            createChannelViewModel.l(absolutePath);
            q04 b2 = ((osa) createChannelViewModel.g).b();
            i34 i34 = new i34(createChannelViewModel, absolutePath, (Continuation) null);
            this.a = r;
            this.b = 1;
            if (ev0.I(b2, i34, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            file = r;
        } else if (i == 1) {
            file = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Pair pair = new Pair(Uri.fromFile(file), file.getAbsolutePath());
        xme xme = createChannelViewModel.q;
        o85 o85 = new o85(pair);
        xme.getClass();
        xme.m((Object) null, o85);
        return Unit.INSTANCE;
    }
}
