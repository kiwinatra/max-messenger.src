package defpackage;

import java.util.Locale;
import ru.ok.messages.views.fragments.FrgChatProfile;

/* renamed from: og6  reason: default package */
public final /* synthetic */ class og6 implements oj2, u2f, qk3 {
    public final /* synthetic */ FrgChatProfile a;

    public /* synthetic */ og6(FrgChatProfile frgChatProfile) {
        this.a = frgChatProfile;
    }

    public void accept(Object obj) {
        FrgChatProfile frgChatProfile = this.a;
        frgChatProfile.getClass();
        Locale locale = Locale.ENGLISH;
        long j = frgChatProfile.X1.a;
        z68.f("ru.ok.messages.views.fragments.FrgChatProfile", "Can't get getActiveLiveLocations for chat " + j, (Throwable) obj);
    }

    public Object get() {
        FrgChatProfile frgChatProfile = this.a;
        return ((pj2) frgChatProfile.q1.getAccessor().g(pj2.class)).a(frgChatProfile.X1.a, ij2.MEMBER);
    }

    public void s() {
        this.a.I3(false);
    }
}
