package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.messages.list.loader.MessageModel;

/* renamed from: nm9  reason: default package */
public final class nm9 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ en9 b;
    public final /* synthetic */ MessageModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nm9(en9 en9, MessageModel messageModel, Continuation continuation) {
        super(2, continuation);
        this.b = en9;
        this.c = messageModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new nm9(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nm9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.b.z0;
            MessageModel messageModel = this.c;
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                a67.d(w78.o, str, a81.m("On unreadScrollButton clicked, current messageModel=", messageModel.n()), (Throwable) null);
            }
            String str2 = this.b.z0;
            MessageModel messageModel2 = this.c;
            a67 a672 = z68.b;
            if (a672 != null && a672.c()) {
                a672.d(w78.o, str2, a81.m("onUnreadScrollButtonClicked: current messageModel=", messageModel2.n()), (Throwable) null);
            }
            a32 a32 = (a32) this.b.k1.a.getValue();
            if (a32 == null) {
                return Unit.INSTANCE;
            }
            long o = a32.o();
            long h = a32.c.h();
            if (o >= h || this.c.c >= o) {
                String str3 = this.b.z0;
                a67 a673 = z68.b;
                if (a673 != null && a673.c()) {
                    w78 w78 = w78.o;
                    StringBuilder n = tr1.n(o, "onUnreadScrollButtonClicked: selfReadMark=", " >= lastMessageTime=");
                    n.append(h);
                    a673.d(w78, str3, n.toString(), (Throwable) null);
                }
                en9 en9 = this.b;
                this.a = 1;
                if (en9.A(h, true) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                wj9 wj9 = (wj9) this.b.l1.getValue();
                List list = wj9.a;
                int g = wj9.g(o);
                if (g < 0) {
                    g = Math.abs(g) - 1;
                }
                MessageModel messageModel3 = (MessageModel) CollectionsKt.getOrNull(list, g);
                if (messageModel3 == null) {
                    String str4 = this.b.z0;
                    a67 a674 = z68.b;
                    if (a674 != null && a674.c()) {
                        a674.d(w78.o, str4, "onUnreadScrollButtonClicked: message with ts=selfReadMark is not loaded, load around it", (Throwable) null);
                    }
                    ((gx) this.b.o).r(o);
                    cid cid = this.b.s1;
                    cid.getClass();
                    cid.a.setValue(new zhd(o, false, false, false, false));
                } else if (messageModel3.c == this.c.c) {
                    String str5 = this.b.z0;
                    a67 a675 = z68.b;
                    if (a675 != null && a675.c()) {
                        a675.d(w78.o, str5, wj6.i(h, "onUnreadScrollButtonClicked: message with ts=selfReadMark is loaded and is last on screen, scroll to lastMessageTime="), (Throwable) null);
                    }
                    en9 en92 = this.b;
                    this.a = 2;
                    if (en92.A(h, false) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    String str6 = this.b.z0;
                    a67 a676 = z68.b;
                    if (a676 != null && a676.c()) {
                        a676.d(w78.o, str6, "onUnreadScrollButtonClicked: message with ts=selfReadMark is loaded, scroll to it", (Throwable) null);
                    }
                    cid cid2 = this.b.s1;
                    long j = messageModel3.c;
                    cid2.getClass();
                    cid2.a.setValue(new zhd(j, true, true, true, false));
                }
            }
        } else if (i == 1 || i == 2) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
