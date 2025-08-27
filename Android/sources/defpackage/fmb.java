package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function0;
import ru.ok.messages.messages.panels.widgets.PinnedMessageView;

/* renamed from: fmb  reason: default package */
public final /* synthetic */ class fmb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PinnedMessageView b;

    public /* synthetic */ fmb(PinnedMessageView pinnedMessageView, int i) {
        this.a = i;
        this.b = pinnedMessageView;
    }

    public final Object invoke() {
        PinnedMessageView pinnedMessageView = this.b;
        switch (this.a) {
            case 0:
                int i = PinnedMessageView.O0;
                Drawable L = pinnedMessageView.L(nad.J0);
                L.setTint(-1);
                return L;
            case 1:
                int i2 = PinnedMessageView.O0;
                Drawable L2 = pinnedMessageView.L(nad.Q0);
                L2.setTint(-1);
                return L2;
            case 2:
                int i3 = PinnedMessageView.O0;
                Drawable L3 = pinnedMessageView.L(nad.U);
                L3.setTint(-1);
                return L3;
            case 3:
                int i4 = PinnedMessageView.O0;
                Drawable L4 = pinnedMessageView.L(nad.V0);
                L4.setTint(-1);
                return L4;
            case 4:
                int i5 = PinnedMessageView.O0;
                Drawable L5 = pinnedMessageView.L(nad.j0);
                L5.setTint(-1);
                return L5;
            default:
                int i6 = PinnedMessageView.O0;
                Drawable L6 = pinnedMessageView.L(nad.g1);
                L6.setTint(-1);
                return L6;
        }
    }
}
