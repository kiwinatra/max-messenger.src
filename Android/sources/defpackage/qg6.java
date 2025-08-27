package defpackage;

import java.lang.ref.WeakReference;
import ru.ok.messages.contacts.profile.FrgContactAvatar;
import ru.ok.messages.views.fragments.FrgProfilePhoto;

/* renamed from: qg6  reason: default package */
public final class qg6 implements r97 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ WeakReference o;

    public /* synthetic */ qg6(long j, String str, WeakReference weakReference, int i) {
        this.a = i;
        this.b = j;
        this.c = str;
        this.o = weakReference;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                ((qra) ym.e()).J().c(new vr4(this.c, (String) null, this.b, 0));
                return;
            default:
                ((qra) ym.e()).J().c(new vr4(this.c, (String) null, this.b, 0));
                return;
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                FrgContactAvatar frgContactAvatar = (FrgContactAvatar) this.o.get();
                if (frgContactAvatar != null && frgContactAvatar.X2() != null) {
                    frgContactAvatar.g3(true);
                    return;
                }
                return;
            default:
                FrgProfilePhoto frgProfilePhoto = (FrgProfilePhoto) this.o.get();
                if (frgProfilePhoto != null && frgProfilePhoto.X2() != null) {
                    frgProfilePhoto.g3(true);
                    return;
                }
                return;
        }
    }

    public final void c(String str) {
        switch (this.a) {
            case 0:
                ((qra) ym.e()).J().c(new tr4(this.b, 0, "", str, (String) null));
                return;
            default:
                ((qra) ym.e()).J().c(new tr4(this.b, 0, "", str, (String) null));
                return;
        }
    }
}
