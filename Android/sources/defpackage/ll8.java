package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: ll8  reason: default package */
public final /* synthetic */ class ll8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaBarWidget b;

    public /* synthetic */ ll8(MediaBarWidget mediaBarWidget, int i) {
        this.a = i;
        this.b = mediaBarWidget;
    }

    public final Object invoke(Object obj) {
        Object value;
        n00 n00;
        MediaBarWidget mediaBarWidget = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                KProperty[] kPropertyArr = MediaBarWidget.c1;
                xme xme = mediaBarWidget.r0().y;
                do {
                    value = xme.getValue();
                    int ordinal = ((n00) value).ordinal();
                    if (ordinal == 0) {
                        n00 = n00.b;
                    } else if (ordinal == 1) {
                        n00 = n00.a;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } while (!xme.b(value, n00));
                return Unit.INSTANCE;
            case 1:
                mediaBarWidget.v.f.j = (CharSequence) obj;
                return Unit.INSTANCE;
            default:
                View view2 = (View) obj;
                KProperty[] kPropertyArr2 = MediaBarWidget.c1;
                mediaBarWidget.n0().j(true);
                return Unit.INSTANCE;
        }
    }
}
