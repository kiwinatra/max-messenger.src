package defpackage;

import ru.ok.messages.views.fragments.base.FrgBaseProfile;

/* renamed from: v1c  reason: default package */
public final /* synthetic */ class v1c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgBaseProfile b;

    public /* synthetic */ v1c(FrgBaseProfile frgBaseProfile, int i) {
        this.a = i;
        this.b = frgBaseProfile;
    }

    public final void run() {
        int i = this.a;
        FrgBaseProfile frgBaseProfile = this.b;
        frgBaseProfile.getClass();
        switch (i) {
            case 0:
                frgBaseProfile.a3();
                return;
            default:
                frgBaseProfile.g3(true);
                return;
        }
    }
}
