package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.ValueCallback;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* renamed from: gig  reason: default package */
public final class gig extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ WebAppRootScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gig(Continuation continuation, WebAppRootScreen webAppRootScreen) {
        super(2, continuation);
        this.b = webAppRootScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        gig gig = new gig(continuation, this.b);
        gig.a = obj;
        return gig;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gig) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        tig tig = (tig) this.a;
        KProperty[] kPropertyArr = WebAppRootScreen.D0;
        WebAppRootScreen webAppRootScreen = this.b;
        webAppRootScreen.getClass();
        if (tig instanceof kig) {
            kig kig = (kig) tig;
            webAppRootScreen.q0().loadUrl(kig.a);
            webAppRootScreen.getArgs().putString("web_root_screen:url", kig.a);
        } else {
            e9d e9d = null;
            int i = 0;
            if (tig instanceof oig) {
                String str = ((oig) tig).a;
                Bundle g = wj6.g(1, "dialog_id");
                String string = webAppRootScreen.getContext().getResources().getString(omc.web_app_root_close_dialog_subtitle, new Object[]{str});
                KProperty[] kPropertyArr2 = BottomSheetWidget.v0;
                ng3 a2 = b0h.a(new igf(omc.web_app_root_close_dialog_title), g, 4);
                a2.f(new mgf(string));
                a2.a(new pg3(1, new igf(omc.web_app_root_close_dialog_accept), og3.c));
                a2.a(new pg3(2, new igf(omc.web_app_root_close_dialog_decline), og3.b));
                ConfirmationBottomSheet e = a2.e();
                e.setTargetController(webAppRootScreen);
                zx3 zx3 = webAppRootScreen;
                while (zx3.getParentController() != null) {
                    zx3 = zx3.getParentController();
                }
                l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
                if (l9d != null) {
                    e9d = l9d.K();
                }
                e.p0(webAppRootScreen);
                if (e9d != null) {
                    i9d i9d = new i9d(e, (String) null, (ey3) null, (ey3) null, false, -1);
                    a81.t(false, i9d, true, "BottomSheetWidget");
                    e9d.G(i9d);
                }
            } else if (tig instanceof iig) {
                webAppRootScreen.i0(true);
                boolean z = ((iig) tig).a;
                ArrayList e2 = webAppRootScreen.getRouter().e();
                ListIterator listIterator = e2.listIterator(e2.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = listIterator.previous();
                    if (((i9d) obj2).a instanceof pd6) {
                        break;
                    }
                }
                i9d i9d2 = (i9d) obj2;
                zx3 zx32 = i9d2 != null ? i9d2.a : null;
                pd6 pd6 = zx32 instanceof pd6 ? (pd6) zx32 : null;
                if (pd6 != null) {
                    KProperty[] kPropertyArr3 = WebAppRootScreen.D0;
                    KProperty kProperty = kPropertyArr3[5];
                    is isVar = webAppRootScreen.v0;
                    if (((Number) isVar.a(webAppRootScreen)).intValue() != 0) {
                        if (z) {
                            i = -1;
                        }
                        KProperty kProperty2 = kPropertyArr3[5];
                        ((ChatScreen) pd6).D0(((Number) isVar.a(webAppRootScreen)).intValue(), i, (Intent) null);
                    }
                }
            } else if (tig instanceof nig) {
                KProperty kProperty3 = WebAppRootScreen.D0[8];
                tlg tlg = (tlg) webAppRootScreen.B0.getValue();
                nig nig = (nig) tig;
                String str2 = nig.a;
                tlg.getClass();
                tlg.a.evaluateJavascript(String.format("\n            (() => {\n                WebApp.sendEvent(\"%s\", \"%s\");\n            })();\n        ", Arrays.copyOf(new Object[]{str2, StringsKt__StringsJVMKt.replace$default(nig.b, "\"", "\\\"", false, 4, (Object) null)}, 2)), (ValueCallback) null);
            } else if (tig instanceof qig) {
                String str3 = ((qig) tig).a;
                Bundle g2 = wj6.g(2, "dialog_id");
                String string2 = webAppRootScreen.getContext().getResources().getString(omc.web_app_root_phone_request_dialog_subtitle, new Object[]{str3});
                KProperty[] kPropertyArr4 = BottomSheetWidget.v0;
                ng3 a3 = b0h.a(new igf(omc.web_app_root_phone_request_dialog_title), g2, 4);
                a3.f(new mgf(string2));
                a3.a(new pg3(1, new igf(omc.web_app_root_phone_request_dialog_accept), og3.c));
                a3.a(new pg3(2, new igf(omc.web_app_root_phone_request_dialog_decline), og3.b));
                ConfirmationBottomSheet e3 = a3.e();
                e3.setTargetController(webAppRootScreen);
                zx3 zx33 = webAppRootScreen;
                while (zx33.getParentController() != null) {
                    zx33 = zx33.getParentController();
                }
                l9d l9d2 = zx33 instanceof l9d ? (l9d) zx33 : null;
                if (l9d2 != null) {
                    e9d = l9d2.K();
                }
                e3.p0(webAppRootScreen);
                if (e9d != null) {
                    i9d i9d3 = new i9d(e3, (String) null, (ey3) null, (ey3) null, false, -1);
                    a81.t(false, i9d3, true, "BottomSheetWidget");
                    e9d.G(i9d3);
                }
            } else if (tig instanceof lig) {
                String str4 = ((lig) tig).a;
                if (str4.length() != 0) {
                    try {
                        webAppRootScreen.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str4)));
                    } catch (ActivityNotFoundException e4) {
                        e4.getMessage();
                    }
                }
            } else if (tig instanceof jig) {
                webAppRootScreen.j0();
                jhg.b.W0().b(":link-intercept", o54.f(TuplesKt.to("link", ((jig) tig).a)));
            } else if (tig instanceof rig) {
                rig rig = (rig) tig;
                webAppRootScreen.z0.setValue(webAppRootScreen, WebAppRootScreen.D0[6], ev0.v(webAppRootScreen.getViewLifecycleScope(), (CoroutineContext) null, f14.b, new hig(rig.a, webAppRootScreen, rig.b, (Continuation) null), 1));
            } else if (tig instanceof pig) {
                webAppRootScreen.startActivityForResult(((pig) tig).a.createIntent(), 1013);
            } else if (tig instanceof sig) {
                String str5 = ((sig) tig).a;
                Uri[] uriArr = str5 != null ? new Uri[]{Uri.parse(str5)} : null;
                ValueCallback<Uri[]> filePathCallback = webAppRootScreen.q0().getFilePathCallback();
                if (filePathCallback != null) {
                    filePathCallback.onReceiveValue(uriArr);
                    webAppRootScreen.q0().setFilePathCallback((ValueCallback<Uri[]>) null);
                }
            } else if (Intrinsics.areEqual((Object) tig, (Object) mig.a)) {
                webAppRootScreen.q0().reload();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }
}
