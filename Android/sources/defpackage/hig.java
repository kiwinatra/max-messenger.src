package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KProperty;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* renamed from: hig  reason: default package */
public final class hig extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;
    public final /* synthetic */ WebAppRootScreen c;
    public final /* synthetic */ tjg o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hig(String str, WebAppRootScreen webAppRootScreen, tjg tjg, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = webAppRootScreen;
        this.o = tjg;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        hig hig = new hig(this.b, this.c, this.o, continuation);
        hig.a = obj;
        return hig;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hig) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        d14 d14 = (d14) this.a;
        WebAppRootScreen webAppRootScreen = this.c;
        String str = this.b;
        if (str == null) {
            Context context = webAppRootScreen.getContext();
            akd akd = (akd) ((bud) xfg.a.getAccessor().g(bud.class));
            String string = akd.g.getString("invite-long", (String) null);
            if (string != null) {
                str = string;
            } else {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                str = String.format(context.getString(jad.F), Arrays.copyOf(new Object[]{akd.p()}, 1));
            }
        }
        try {
            Result.Companion companion = Result.Companion;
            tjg tjg = this.o;
            if (tjg == null) {
                String str2 = hsg.n;
                hsg.G(webAppRootScreen.getContext(), str);
            } else {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", str);
                WebAppRootScreen.n0(webAppRootScreen, intent, tjg);
                String str3 = hsg.n;
                Intent q = hsg.q(webAppRootScreen.getContext(), intent);
                if (q != null) {
                    intent = q;
                }
                webAppRootScreen.getContext().startActivity(intent);
            }
            obj2 = Result.m23constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m30isSuccessimpl(obj2)) {
            Unit unit = (Unit) obj2;
            KProperty[] kPropertyArr = WebAppRootScreen.D0;
            webAppRootScreen.q0().evaluateJavascript("window.navigator.__share__receive()", new o3b(1));
        }
        Throwable r7 = Result.m26exceptionOrNullimpl(obj2);
        if (r7 != null) {
            d14.getClass();
            r7.toString();
            KProperty[] kPropertyArr2 = WebAppRootScreen.D0;
            webAppRootScreen.q0().evaluateJavascript("window.navigator.__share__receive(abort)", new o3b(1));
        }
        return Unit.INSTANCE;
    }
}
