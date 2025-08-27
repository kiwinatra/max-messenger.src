package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* renamed from: b7g  reason: default package */
public final /* synthetic */ class b7g implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoMessageWidget b;

    public /* synthetic */ b7g(VideoMessageWidget videoMessageWidget, int i) {
        this.a = i;
        this.b = videoMessageWidget;
    }

    public final Object invoke() {
        VideoMessageWidget videoMessageWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = VideoMessageWidget.X;
                return ew3.b(videoMessageWidget.getContext(), cad.P);
            default:
                KProperty[] kPropertyArr2 = VideoMessageWidget.X;
                return ew3.b(videoMessageWidget.getContext(), cad.O);
        }
    }
}
