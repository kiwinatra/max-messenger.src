package defpackage;

import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* renamed from: z6g  reason: default package */
public final /* synthetic */ class z6g implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoMessageWidget b;

    public /* synthetic */ z6g(VideoMessageWidget videoMessageWidget, int i) {
        this.a = i;
        this.b = videoMessageWidget;
    }

    public final Object invoke(Object obj) {
        boolean z = false;
        VideoMessageWidget videoMessageWidget = this.b;
        switch (this.a) {
            case 0:
                jub jub = (jub) obj;
                KProperty[] kPropertyArr = VideoMessageWidget.X;
                s6g d0 = videoMessageWidget.d0();
                if (jub == jub.b) {
                    z = true;
                }
                xme xme = ((y6g) d0).x0;
                Boolean valueOf = Boolean.valueOf(z);
                xme.getClass();
                xme.m((Object) null, valueOf);
                return Unit.INSTANCE;
            case 1:
                ImageView imageView = (ImageView) obj;
                KProperty[] kPropertyArr2 = VideoMessageWidget.X;
                imageView.setImageResource(cad.g);
                ct.G(imageView, 300, new a7g(videoMessageWidget, 0));
                return Unit.INSTANCE;
            default:
                ImageView imageView2 = (ImageView) obj;
                KProperty[] kPropertyArr3 = VideoMessageWidget.X;
                imageView2.setId(lra.v);
                imageView2.setAlpha(c44.DEFAULT_ASPECT_RATIO);
                ct.G(imageView2, 300, new a7g(videoMessageWidget, 1));
                return Unit.INSTANCE;
        }
    }
}
