package defpackage;

import java.util.function.Consumer;
import ru.ok.messages.contacts.picker.FrgContactMultiPicker;

/* renamed from: xg6  reason: default package */
public final /* synthetic */ class xg6 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xg6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void accept(Object obj) {
        vk3 vk3 = (vk3) obj;
        switch (this.a) {
            case 0:
                ((FrgContactMultiPicker) this.b).k3(vk3);
                return;
            default:
                ((FrgContactMultiPicker) ((zqd) this.b).c).k3(vk3);
                return;
        }
    }
}
