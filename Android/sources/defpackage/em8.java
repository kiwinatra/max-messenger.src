package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: em8  reason: default package */
public final class em8 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaBarWidget b;

    public /* synthetic */ em8(MediaBarWidget mediaBarWidget, int i) {
        this.a = i;
        this.b = mediaBarWidget;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        MediaBarWidget mediaBarWidget = this.b;
        switch (this.a) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                MediaBarWidget.e0(mediaBarWidget);
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                KProperty[] kPropertyArr = MediaBarWidget.c1;
                if (mediaBarWidget.r0().l()) {
                    mediaBarWidget.n0().k();
                    return;
                }
                orb n0 = mediaBarWidget.n0();
                int i9 = orb.z;
                n0.setHalfScreen((Function2<? super Float, ? super Float, Unit>) null);
                return;
        }
    }
}
