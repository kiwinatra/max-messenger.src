package defpackage;

import kotlin.jvm.functions.Function0;
import ru.ok.messages.messages.widgets.layouts.OutgoingMessageLayout;

/* renamed from: x5b  reason: default package */
public final /* synthetic */ class x5b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ OutgoingMessageLayout b;

    public /* synthetic */ x5b(OutgoingMessageLayout outgoingMessageLayout, int i) {
        this.a = i;
        this.b = outgoingMessageLayout;
    }

    public final Object invoke() {
        OutgoingMessageLayout outgoingMessageLayout = this.b;
        switch (this.a) {
            case 0:
                int i = OutgoingMessageLayout.F0;
                return ew3.b(outgoingMessageLayout.getContext(), cad.l);
            case 1:
                int i2 = OutgoingMessageLayout.F0;
                return ew3.b(outgoingMessageLayout.getContext(), cad.j);
            case 2:
                int i3 = OutgoingMessageLayout.F0;
                return ew3.b(outgoingMessageLayout.getContext(), cad.l0);
            default:
                int i4 = OutgoingMessageLayout.F0;
                return ew3.b(outgoingMessageLayout.getContext(), cad.J);
        }
    }
}
