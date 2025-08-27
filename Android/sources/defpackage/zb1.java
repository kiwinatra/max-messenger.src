package defpackage;

import android.content.Intent;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.sdk.arch.Widget;
import org.apache.http.protocol.HTTP;

/* renamed from: zb1  reason: default package */
public final class zb1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ CallLinkInfoScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zb1(Continuation continuation, CallLinkInfoScreen callLinkInfoScreen) {
        super(2, continuation);
        this.b = callLinkInfoScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        zb1 zb1 = new zb1(continuation, this.b);
        zb1.a = obj;
        return zb1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zb1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        if (v5a instanceof pa4) {
            b71.b.Y0((pa4) v5a);
        } else {
            boolean z = v5a instanceof g91;
            CallLinkInfoScreen callLinkInfoScreen = this.b;
            if (z) {
                KProperty[] kPropertyArr = CallLinkInfoScreen.z0;
                callLinkInfoScreen.c0().b(oq1.INSIDE_SHARE, pq1.CREATE_CALL);
                b71 b71 = b71.b;
                String string = callLinkInfoScreen.getContext().getString(lqa.k);
                String obj2 = ((g91) v5a).b.toString();
                String name = CallLinkInfoScreen.class.getName();
                b71.getClass();
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", obj2);
                intent.setType(HTTP.PLAIN_TEXT_TYPE);
                b71.W0().b(":chats/share", o54.f(TuplesKt.to("ru.ok.tamtam.extra.DATA", intent), TuplesKt.to("ru.ok.tamtam.extra.SHARE_TITLE", string), TuplesKt.to("tag", name)));
            } else if (v5a instanceof h91) {
                KProperty[] kPropertyArr2 = CallLinkInfoScreen.z0;
                callLinkInfoScreen.c0().b(oq1.OUTSIDE_SHARE, pq1.CREATE_CALL);
                String str = hsg.n;
                hsg.G(callLinkInfoScreen.getContext(), ((h91) v5a).b);
            } else if (v5a instanceof f91) {
                KProperty[] kPropertyArr3 = CallLinkInfoScreen.z0;
                callLinkInfoScreen.c0().b(oq1.COPY_LINK, pq1.CREATE_CALL);
                te8.f(callLinkInfoScreen.getContext(), ((f91) v5a).b.toString());
                if (b59.C()) {
                    igf igf = new igf(lqa.j);
                    int i = jqa.e;
                    e0b e0b = new e0b((Widget) callLinkInfoScreen);
                    e0b.h(igf);
                    e0b.f(new o0b(i));
                    e0b.j();
                }
            } else if (v5a instanceof i91) {
                ngf ngf = ((i91) v5a).b;
                KProperty[] kPropertyArr4 = CallLinkInfoScreen.z0;
                callLinkInfoScreen.getClass();
                e0b e0b2 = new e0b((Widget) callLinkInfoScreen);
                e0b2.h((igf) ngf);
                e0b2.f(p0b.a);
                e0b2.j();
            }
        }
        return Unit.INSTANCE;
    }
}
