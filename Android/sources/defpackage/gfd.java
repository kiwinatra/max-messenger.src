package defpackage;

import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: gfd  reason: default package */
public final class gfd extends ObservableProperty {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gfd(int i, Object obj) {
        super(obj);
        this.a = i;
    }

    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                ((Boolean) obj).getClass();
                z68.c("ScheduledSendPickerViewModel", "sendWithNotification = " + booleanValue, new Object[0]);
                return;
            default:
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                ((Boolean) obj).getClass();
                z68.c("ScheduledSendPickerViewModel", "allowWorkHours = " + booleanValue2, new Object[0]);
                return;
        }
    }
}
