package ru.ok.messages.settings;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.biometric.BiometricViewModel;
import androidx.fragment.app.b;
import java.security.MessageDigest;
import java.util.ArrayList;
import kotlin.KotlinVersion;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KClass;
import org.apache.http.HttpStatus;
import ru.ok.messages.pinlock.PinLockViewModel;
import ru.ok.messages.views.dialogs.FrgDlgPinAutoLock;

public class FrgPinLockSettings extends FrgBaseSettings {
    public nlb E1;
    public xv1 F1;
    public final v9a G1 = new v9a(12);

    public final void C(int i, Object obj) {
        MessageDigest messageDigest;
        if (i == lic.setting_pin_lock_code) {
            if (this.E1.a()) {
                ((qra) ym.e()).c().e("PASSCODE_RESET");
                nlb nlb = this.E1;
                nlb.c.k("pinLock.timeout", 60000L);
                String str = null;
                if (TextUtils.isEmpty((CharSequence) null)) {
                    str = "";
                } else {
                    try {
                        messageDigest = MessageDigest.getInstance("SHA-256");
                    } catch (Exception unused) {
                        messageDigest = null;
                    }
                    if (messageDigest != null) {
                        throw null;
                    }
                }
                hq hqVar = nlb.c;
                hqVar.l("pinLock.pinCode", str);
                hqVar.i("pinLock.fingerprintEnabled", true);
                ym.v.c().c.G(ym.v.c().a.g.getBoolean("notif.showMessageText", false));
                k3();
                return;
            }
            p6.T(this, 0, HttpStatus.SC_SWITCHING_PROTOCOLS);
        } else if (i == lic.setting_pin_lock_fingerprint) {
            this.E1.c.i("pinLock.fingerprintEnabled", ((Boolean) obj).booleanValue());
        } else if (i == lic.setting_notification_show_text) {
            ym.v.c().c.G(((Boolean) obj).booleanValue());
        } else if (i == lic.setting_pin_lock_screenshot_enabled) {
            ym.v.c().c.i("app.pinLock.screenshotEnabled", ((Boolean) obj).booleanValue());
            m5 X2 = X2();
            if (X2 != null) {
                X2.R();
            }
        }
    }

    public final void E(int i, Object obj) {
        if (i == lic.setting_pin_lock_change_code) {
            p6.T(this, 1, HttpStatus.SC_PROCESSING);
        } else if (i == lic.setting_pin_lock_auto_lock) {
            new FrgDlgPinAutoLock().Y2(N1(), "ru.ok.messages.views.dialogs.FrgDlgPinAutoLock");
        }
    }

    public final String V2() {
        return "SETTINGS_PRIVACY_PINLOCK";
    }

    public final void b3(int i, int i2, Intent intent) {
        if (i == 101 || i == 102) {
            if (i2 == -1 && i == 101) {
                ((qra) ym.e()).c().e("PASSCODE_SET");
                ym.v.c().a.i("notif.showMessageText", ym.v.c().c.B());
                ym.v.c().c.G(false);
            }
            k3();
        }
    }

    public final void i2(Bundle bundle) {
        BiometricViewModel biometricViewModel;
        super.i2(bundle);
        this.E1 = ((qra) ym.e()).x();
        o5h o5h = new o5h(getViewModelStore(), getDefaultViewModelProviderFactory(), getDefaultViewModelCreationExtras());
        KClass<PinLockViewModel> kotlinClass = JvmClassMappingKt.getKotlinClass(PinLockViewModel.class);
        String qualifiedName = kotlinClass.getQualifiedName();
        if (qualifiedName != null) {
            PinLockViewModel pinLockViewModel = (PinLockViewModel) o5h.x(kotlinClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName));
            String S1 = S1(qad.s7);
            String S12 = S1(qad.m0);
            if (TextUtils.isEmpty(S1)) {
                throw new IllegalArgumentException("Title must be set and non-empty.");
            } else if (!o5a.N(KotlinVersion.MAX_COMPONENT_VALUE)) {
                throw new IllegalArgumentException(wj6.l(new StringBuilder("Authenticator combination is unsupported on API "), Build.VERSION.SDK_INT, ": BIOMETRIC_WEAK"));
            } else if (!TextUtils.isEmpty(S12)) {
                TextUtils.isEmpty(S12);
                w28 w28 = new w28(new u6h(G2()));
                if (io1.a == null) {
                    throw new IllegalArgumentException("Executor must not be null.");
                } else if (this.G1 != null) {
                    b M1 = M1();
                    N1();
                    if (M1 != null) {
                        o5h o5h2 = new o5h(M1.getViewModelStore(), M1.getDefaultViewModelProviderFactory(), M1.getDefaultViewModelCreationExtras());
                        KClass<BiometricViewModel> kotlinClass2 = JvmClassMappingKt.getKotlinClass(BiometricViewModel.class);
                        String qualifiedName2 = kotlinClass2.getQualifiedName();
                        if (qualifiedName2 != null) {
                            biometricViewModel = (BiometricViewModel) o5h2.x(kotlinClass2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName2));
                        } else {
                            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
                        }
                    } else {
                        biometricViewModel = null;
                    }
                    if (biometricViewModel != null) {
                        this.b1.a(new vn0(biometricViewModel));
                    }
                    this.F1 = new xv1(20, (Object) w28);
                } else {
                    throw new IllegalArgumentException("AuthenticationCallback must not be null.");
                }
            } else {
                throw new IllegalArgumentException("Negative text must be set and non-empty.");
            }
        } else {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
        }
    }

    public final ArrayList i3() {
        ArrayList arrayList = new ArrayList();
        boolean a = this.E1.a();
        fyd a2 = fyd.a(S1(qad.G7), lic.setting_pin_lock_code, S1(qad.H7), a);
        arrayList.add(a2);
        if (a) {
            fyd c = fyd.c(lic.setting_pin_lock_change_code, S1(qad.x7), (String) null);
            c.X = true;
            arrayList.add(c);
        } else {
            a2.X = true;
        }
        fyd fyd = new fyd(lic.setting_pin_lock_auto_lock, S1(qad.w7), (String) null, (String) null, j4b.q(this.E1.c.e("pinLock.timeout", 60000), O1()), 1);
        fyd.z = a;
        fyd.v0 = a ? 1.0f : 0.5f;
        arrayList.add(fyd);
        w28 w28 = (w28) this.F1.b;
        boolean z = false;
        if (w28.y(KotlinVersion.MAX_COMPONENT_VALUE) == 0 || w28.y(15) == 0) {
            fyd a3 = fyd.a(S1(qad.y7), lic.setting_pin_lock_fingerprint, (String) null, a && this.E1.c.g.getBoolean("pinLock.fingerprintEnabled", true));
            a3.z = a;
            arrayList.add(a3);
        }
        fyd a4 = fyd.a(S1(qad.M5), lic.setting_notification_show_text, S1(qad.B7), a && ym.v.c().c.B());
        a4.z = true;
        arrayList.add(a4);
        int i = lic.setting_pin_lock_screenshot_enabled;
        String S1 = S1(qad.z7);
        String S12 = S1(qad.A7);
        if (a && ym.v.c().c.g.getBoolean("app.pinLock.screenshotEnabled", true)) {
            z = true;
        }
        fyd a5 = fyd.a(S1, i, S12, z);
        a5.z = true;
        arrayList.add(a5);
        return arrayList;
    }

    public final String j3() {
        return S1(qad.G7);
    }
}
