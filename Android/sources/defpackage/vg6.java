package defpackage;

import kotlin.jvm.functions.Function0;
import ru.ok.messages.contacts.picker.FrgContactMultiPicker;

/* renamed from: vg6  reason: default package */
public final /* synthetic */ class vg6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgContactMultiPicker b;

    public /* synthetic */ vg6(FrgContactMultiPicker frgContactMultiPicker, int i) {
        this.a = i;
        this.b = frgContactMultiPicker;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((ltb) this.b.q1.u()).a;
            case 1:
                return (ptb) this.b.q1.getAccessor().g(ptb.class);
            default:
                return this.b.q1.v();
        }
    }
}
