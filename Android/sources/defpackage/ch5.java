package defpackage;

import android.net.Uri;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.webview.FaqWebViewWidget;

/* renamed from: ch5  reason: default package */
public final class ch5 extends SuspendLambda implements Function2 {
    public Uri.Builder a;
    public int b;
    public final /* synthetic */ FaqWebViewWidget c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ch5(FaqWebViewWidget faqWebViewWidget, Continuation continuation) {
        super(2, continuation);
        this.c = faqWebViewWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ch5(this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ch5) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Uri.Builder builder;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        FaqWebViewWidget faqWebViewWidget = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Uri.Builder buildUpon = Uri.parse(q8.p(qad.n6, faqWebViewWidget.getContext())).buildUpon();
            this.a = buildUpon;
            this.b = 1;
            Object a2 = faqWebViewWidget.w.a(this);
            if (a2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            Uri.Builder builder2 = buildUpon;
            obj = a2;
            builder = builder2;
        } else if (i == 1) {
            builder = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Boolean) obj).booleanValue()) {
            builder.appendQueryParameter("source", "settings");
        } else {
            builder.appendQueryParameter("source", "reg");
        }
        String uri = builder.build().toString();
        KProperty[] kPropertyArr = FaqWebViewWidget.x;
        faqWebViewWidget.getClass();
        ((n3b) faqWebViewWidget.a.getValue(faqWebViewWidget, FaqWebViewWidget.x[0])).loadUrl(uri);
        return Unit.INSTANCE;
    }
}
