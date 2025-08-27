package defpackage;

import java.util.Collections;
import ru.ok.messages.channels.FrgChatMembers;
import ru.ok.messages.contacts.picker.ActAdminPicker;

/* renamed from: lg6  reason: default package */
public final /* synthetic */ class lg6 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgChatMembers b;
    public final /* synthetic */ bj2 c;

    public /* synthetic */ lg6(FrgChatMembers frgChatMembers, bj2 bj2, int i) {
        this.a = i;
        this.b = frgChatMembers;
        this.c = bj2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                FrgChatMembers frgChatMembers = this.b;
                ij2 ij2 = frgChatMembers.C1;
                ij2 ij22 = ij2.ADMIN;
                bj2 bj2 = this.c;
                if (ij2 == ij22 && frgChatMembers.B1.s()) {
                    long j = frgChatMembers.B1.b.d;
                    long j2 = bj2.a.a;
                    if (j != j2) {
                        z4.T(frgChatMembers.X2(), 115, j2, frgChatMembers.B1.a);
                        return;
                    }
                }
                q6.T(frgChatMembers.M1(), bj2.a.a);
                return;
            default:
                FrgChatMembers frgChatMembers2 = this.b;
                ng6 ng6 = frgChatMembers2.D1;
                ng6 ng62 = ng6.a;
                bj2 bj22 = this.c;
                if (ng6 == ng62) {
                    fo3 fo3 = bj22.a;
                    m5 X2 = frgChatMembers2.X2();
                    yg6 yg6 = X2 instanceof yg6 ? (yg6) X2 : null;
                    if (yg6 == null) {
                        z68.f("ru.ok.messages.channels.FrgChatMembers", "onAdminPicked: failed, pickAdminListener is null", (Throwable) null);
                        return;
                    }
                    vk3 p = frgChatMembers2.q1.i().p(fo3.a, true);
                    if (p == null) {
                        z68.f("ru.ok.messages.channels.FrgChatMembers", "onAdminPicked: failed, contact is null", (Throwable) null);
                        return;
                    } else {
                        ((ActAdminPicker) yg6).W(Collections.singletonList(p));
                        return;
                    }
                } else if (ng6 != ng6.b) {
                    frgChatMembers2.i3(Collections.singletonList(bj22.a));
                    return;
                } else if (frgChatMembers2.M1() instanceof ActAdminPicker) {
                    ActAdminPicker actAdminPicker = (ActAdminPicker) frgChatMembers2.M1();
                    actAdminPicker.getClass();
                    actAdminPicker.U(bj22.a.a);
                    return;
                } else {
                    return;
                }
        }
    }
}
