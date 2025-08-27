package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.page.FolderPageViewModel;

/* renamed from: q36  reason: default package */
public final class q36 extends SuspendLambda implements Function2 {
    public final /* synthetic */ a32 a;
    public final /* synthetic */ FolderPageViewModel b;
    public final /* synthetic */ boolean c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q36(a32 a32, FolderPageViewModel folderPageViewModel, boolean z, Continuation continuation) {
        super(2, continuation);
        this.a = a32;
        this.b = folderPageViewModel;
        this.c = z;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new q36(this.a, this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((q36) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        a32 a32 = this.a;
        a32.l0();
        CharSequence charSequence = a32.X;
        CharSequence charSequence2 = "";
        if (this.a.K()) {
            yva yva = this.b.e;
            int c2 = this.a.b.c();
            if (c2 == 0) {
                yva.getClass();
            } else {
                charSequence2 = ghf.s(zjc.tt_channel_subtitle_count, c2, yva.a);
            }
        } else if (this.a.N()) {
            vk3 m = this.a.m();
            if (m != null) {
                charSequence2 = this.b.f.d(m, false);
            }
        } else {
            yva yva2 = this.b.e;
            charSequence2 = ghf.s(zjc.tt_chat_subtitle_count, this.a.b.c(), yva2.a);
        }
        return new s26(charSequence, charSequence2, this.a, this.c);
    }
}
