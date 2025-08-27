package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* renamed from: c7g  reason: default package */
public final /* synthetic */ class c7g implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kub b;

    public /* synthetic */ c7g(kub kub, int i) {
        this.a = i;
        this.b = kub;
    }

    public final Object invoke() {
        kub kub = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = VideoMessageWidget.X;
                kub.setVisibility(8);
                return Unit.INSTANCE;
            default:
                KProperty[] kPropertyArr2 = VideoMessageWidget.X;
                kub.setVisibility(0);
                return Unit.INSTANCE;
        }
    }
}
