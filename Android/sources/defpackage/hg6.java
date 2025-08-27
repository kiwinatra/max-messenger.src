package defpackage;

import android.content.Intent;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KClass;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.messages.chats.common.CommonChatsViewModel;
import ru.ok.messages.views.fragments.base.FrgBaseProfile;

/* renamed from: hg6  reason: default package */
public final /* synthetic */ class hg6 implements qk3, u2f, q85 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgBaseProfile b;

    public /* synthetic */ hg6(FrgBaseProfile frgBaseProfile, int i) {
        this.a = i;
        this.b = frgBaseProfile;
    }

    public void accept(Object obj) {
        z68.f(this.b.B1, "Can't check is file internal or not", (Throwable) obj);
    }

    public void d(Object obj) {
        switch (this.a) {
            case 2:
                a32 a32 = (a32) obj;
                FrgBaseProfile frgBaseProfile = this.b;
                frgBaseProfile.getClass();
                z68.c(frgBaseProfile.B1, "handle click on common chat %d", Long.valueOf(a32.a));
                m5 X2 = frgBaseProfile.X2();
                t5 t5Var = new t5(a32.a);
                t5Var.j = true;
                t5Var.e = true;
                q5.T(X2, t5Var);
                return;
            case 3:
                tl6 tl6 = (tl6) obj;
                FrgBaseProfile frgBaseProfile2 = this.b;
                z68.c(frgBaseProfile2.B1, "galleryModule: onResult %s", tl6);
                if (tl6 instanceof sl6) {
                    tqd tqd = ((sl6) tl6).a;
                    n09 n09 = frgBaseProfile2.D1;
                    jv7 X1 = frgBaseProfile2.X1();
                    FrgBaseProfile frgBaseProfile3 = (FrgBaseProfile) n09.y;
                    frgBaseProfile3.getClass();
                    frgBaseProfile3.getClass();
                    y64.B(new v1c(frgBaseProfile3, 1));
                    zc4 zc4 = (zc4) n09.c;
                    j4b.X(((osa) ((gaf) zc4.o)).b().plus((faf) zc4.v), MultiFileUploader.UPLOAD_NEXT_INTERVAL, new i9f(zc4, (String) n09.a, tqd, (Continuation) null)).e(X1, new yr1(4, n09));
                    return;
                }
                i3a i3a = frgBaseProfile2.P1.E0;
                if (i3a != null) {
                    for (k1a k1a : (Set) i3a.a) {
                        k1a.getClass();
                        k1a.V(new j1a(k1a));
                    }
                    return;
                }
                return;
            case 4:
                Unit unit = (Unit) obj;
                FrgBaseProfile frgBaseProfile4 = this.b;
                z68.c(frgBaseProfile4.B1, "galleryModule: onClose", new Object[0]);
                i3a i3a2 = frgBaseProfile4.P1.E0;
                if (i3a2 != null) {
                    i3a2.a0((Runnable) null, true);
                    return;
                }
                return;
            default:
                FrgBaseProfile frgBaseProfile5 = this.b;
                z68.c(frgBaseProfile5.B1, "galleryModule: send medias %s", (Intent) obj);
                i3a i3a3 = frgBaseProfile5.P1.E0;
                if (i3a3 != null) {
                    for (k1a k1a2 : (Set) i3a3.a) {
                        i1a i1a = k1a2.c;
                        if (i1a != null) {
                            k0a k0a = i1a.a;
                            k0a.a0(k0a.c.f.q());
                        }
                    }
                    return;
                }
                return;
        }
    }

    public Object get() {
        FrgBaseProfile frgBaseProfile = this.b;
        vk3 l3 = frgBaseProfile.l3();
        cs3 m3 = frgBaseProfile.m3();
        long r = l3 != null ? l3.r() : -1;
        if (m3 != null) {
            r = m3.a.a;
        }
        o5h o5h = new o5h(frgBaseProfile.getViewModelStore(), new o83(r, (id3) frgBaseProfile.p1.b, 0), frgBaseProfile.getDefaultViewModelCreationExtras());
        KClass<CommonChatsViewModel> kotlinClass = JvmClassMappingKt.getKotlinClass(CommonChatsViewModel.class);
        String qualifiedName = kotlinClass.getQualifiedName();
        if (qualifiedName != null) {
            return (CommonChatsViewModel) o5h.x(kotlinClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
