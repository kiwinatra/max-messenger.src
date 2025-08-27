package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ru.ok.messages.channels.CreateChannelViewModel;

/* renamed from: h34  reason: default package */
public final class h34 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CreateChannelViewModel a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h34(CreateChannelViewModel createChannelViewModel, Continuation continuation) {
        super(2, continuation);
        this.a = createChannelViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new h34(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h34) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CreateChannelViewModel createChannelViewModel = this.a;
        String str = (String) createChannelViewModel.B.getValue(createChannelViewModel, CreateChannelViewModel.G[5]);
        if (str != null) {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i : length), 32) <= 0;
                if (!z) {
                    if (!z2) {
                        z = true;
                    } else {
                        i++;
                    }
                } else if (!z2) {
                    break;
                } else {
                    length--;
                }
            }
            String obj2 = str.subSequence(i, length + 1).toString();
            if (obj2 != null) {
                o85 o85 = new o85(Boxing.boxBoolean(false));
                xme xme = createChannelViewModel.m;
                xme.getClass();
                xme.m((Object) null, o85);
                eaf.a().getClass();
                rl d = ((sjd) eaf.b()).d();
                KProperty[] kPropertyArr = CreateChannelViewModel.G;
                jna jna = (jna) d;
                createChannelViewModel.j.setValue(createChannelViewModel, kPropertyArr[2], Long.valueOf(jna.z(jna, new z02(((ltb) jna.D()).a.n(), obj2, (String) createChannelViewModel.C.getValue(createChannelViewModel, kPropertyArr[6])))));
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}
