package defpackage;

import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import one.me.android.deeplink.LinkInterceptorWidget;

/* renamed from: dy7  reason: default package */
public final /* synthetic */ class dy7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinkInterceptorWidget b;

    public /* synthetic */ dy7(LinkInterceptorWidget linkInterceptorWidget, int i) {
        this.a = i;
        this.b = linkInterceptorWidget;
    }

    public final Object invoke() {
        LinkInterceptorWidget linkInterceptorWidget = this.b;
        switch (this.a) {
            case 0:
                int i = LinkInterceptorWidget.o;
                return new lf1(LazyKt.lazy(new dy7(linkInterceptorWidget, 1)), new eng(linkInterceptorWidget, 0));
            default:
                int i2 = LinkInterceptorWidget.o;
                return linkInterceptorWidget.getRouter();
        }
    }
}
