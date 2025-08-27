package defpackage;

import ru.ok.messages.contacts.picker.FrgContactMultiPicker;

/* renamed from: tg6  reason: default package */
public final /* synthetic */ class tg6 implements u2f, nsb {
    public final /* synthetic */ FrgContactMultiPicker a;

    public /* synthetic */ tg6(FrgContactMultiPicker frgContactMultiPicker) {
        this.a = frgContactMultiPicker;
    }

    public Object get() {
        FrgContactMultiPicker frgContactMultiPicker = this.a;
        return ((pj2) frgContactMultiPicker.q1.getAccessor().g(pj2.class)).a(frgContactMultiPicker.K1.a, ij2.MEMBER);
    }

    public boolean test(Object obj) {
        return this.a.H1.contains(Long.valueOf(((vk3) obj).r()));
    }
}
