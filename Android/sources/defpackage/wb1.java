package defpackage;

import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;

/* renamed from: wb1  reason: default package */
public final /* synthetic */ class wb1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallLinkInfoScreen b;

    public /* synthetic */ wb1(CallLinkInfoScreen callLinkInfoScreen, int i) {
        this.a = i;
        this.b = callLinkInfoScreen;
    }

    public final Object invoke() {
        CallLinkInfoScreen callLinkInfoScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = CallLinkInfoScreen.z0;
                return callLinkInfoScreen.getRouter();
            case 1:
                KProperty[] kPropertyArr2 = CallLinkInfoScreen.z0;
                return new ee0(ew3.b(callLinkInfoScreen.getContext(), jqa.c), ioa.a, fu4.k.e(callLinkInfoScreen.getContext()).f(), new h9(24), new h9(25));
            case 2:
                KProperty[] kPropertyArr3 = CallLinkInfoScreen.z0;
                return new be0(ew3.b(callLinkInfoScreen.getContext(), jqa.a), goa.a, callLinkInfoScreen.getContext(), new h9(21), new h9(22));
            default:
                KProperty[] kPropertyArr4 = CallLinkInfoScreen.z0;
                return new lf1(LazyKt.lazy(new wb1(callLinkInfoScreen, 0)), new eng(callLinkInfoScreen, 0));
        }
    }
}
