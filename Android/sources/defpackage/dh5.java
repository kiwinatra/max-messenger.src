package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import java.util.HashMap;
import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.webview.FaqWebViewWidget;

/* renamed from: dh5  reason: default package */
public final class dh5 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ FaqWebViewWidget c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dh5(FaqWebViewWidget faqWebViewWidget, Continuation continuation) {
        super(2, continuation);
        this.c = faqWebViewWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        dh5 dh5 = new dh5(this.c, continuation);
        dh5.b = obj;
        return dh5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dh5) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        d14 d14;
        String str;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        FaqWebViewWidget faqWebViewWidget = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d142 = (d14) this.b;
            bk5 bk5 = faqWebViewWidget.v;
            this.b = d142;
            this.a = 1;
            Object a2 = bk5.a(this);
            if (a2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            d14 d143 = d142;
            obj = a2;
            d14 = d143;
        } else if (i == 1) {
            d14 = (d14) this.b;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str3 = (String) obj;
        str3.getClass();
        if (str3.startsWith("mailto:")) {
            int indexOf = str3.indexOf(35);
            String substring = indexOf != -1 ? str3.substring(0, indexOf) : str3;
            int indexOf2 = substring.indexOf(63);
            if (indexOf2 == -1) {
                str = Uri.decode(substring.substring(7));
                str2 = null;
            } else {
                str = Uri.decode(substring.substring(7, indexOf2));
                str2 = substring.substring(indexOf2 + 1);
            }
            HashMap hashMap = new HashMap();
            if (str2 != null) {
                for (String split : str2.split("&")) {
                    String[] split2 = split.split("=", 2);
                    if (split2.length != 0) {
                        hashMap.put(Uri.decode(split2[0]).toLowerCase(Locale.ROOT), split2.length > 1 ? Uri.decode(split2[1]) : null);
                    }
                }
            }
            String str4 = (String) hashMap.get("to");
            if (str4 != null) {
                str = g63.i(str, ", ", str4);
            }
            hashMap.put("to", str);
            String p = q8.p(t3b.a, faqWebViewWidget.getContext());
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse(str3));
            intent.putExtra("android.intent.extra.SUBJECT", (String) hashMap.get("subject"));
            intent.putExtra("android.intent.extra.CC", (String) hashMap.get("cc"));
            intent.putExtra("android.intent.extra.TEXT", (String) hashMap.get("body"));
            try {
                faqWebViewWidget.startActivity(Intent.createChooser(intent, p));
            } catch (ActivityNotFoundException e) {
                z68.f(d14.getClass().getName(), "error no email app found", e);
            }
            return Unit.INSTANCE;
        }
        throw new RuntimeException("Not a mailto scheme");
    }
}
