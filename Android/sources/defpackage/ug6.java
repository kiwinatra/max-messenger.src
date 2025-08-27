package defpackage;

import java.util.Set;
import java.util.function.Predicate;
import ru.ok.messages.contacts.picker.FrgContactMultiPicker;

/* renamed from: ug6  reason: default package */
public final /* synthetic */ class ug6 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ug6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((FrgContactMultiPicker) this.b).H1.contains(Long.valueOf(((vk3) obj).r()));
            default:
                return ((Set) this.b).contains((Long) obj);
        }
    }
}
