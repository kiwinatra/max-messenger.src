package defpackage;

import ru.ok.messages.views.fragments.base.FrgBaseProfile;

/* renamed from: yr1  reason: default package */
public final /* synthetic */ class yr1 implements dla {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yr1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(Object obj) {
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                ((zr1) obj2).k(obj);
                return;
            case 1:
                ((zvb) ((cwb) obj2)).s(obj);
                return;
            case 2:
                ((vb6) obj2).k(obj);
                return;
            case 3:
                Integer num = (Integer) obj;
                num.getClass();
                l83 l83 = (l83) obj2;
                l83.o.setValue(l83, l83.v[0], num);
                return;
            default:
                t4d t4d = (t4d) obj;
                n09 n09 = (n09) obj2;
                FrgBaseProfile frgBaseProfile = (FrgBaseProfile) n09.y;
                try {
                    frgBaseProfile.getClass();
                    y64.B(new v1c(frgBaseProfile, 0));
                    t4d.getClass();
                    if (t4d instanceof s4d) {
                        n09.k(frgBaseProfile);
                        ((h48) n09.w).f.a();
                        return;
                    }
                    z68.f("n09", "takePhotoFromSelectedMedia: failed", ((r4d) t4d).a);
                    n09.i();
                    return;
                } catch (Throwable th) {
                    z68.f("n09", "unexpected error", th);
                    ((uta) ((m95) n09.v)).c(new Exception("fail to take photo from selected media", th), false);
                    return;
                }
        }
    }
}
