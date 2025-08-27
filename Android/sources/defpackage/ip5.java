package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.api.GetAnonymTokenByLinkRequest;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ip5  reason: default package */
public final /* synthetic */ class ip5 implements fc3, yf5, zf5, iv0, qk3, nsb, zi6, op7, yi6, o77 {
    public final /* synthetic */ int a;

    public /* synthetic */ ip5(int i) {
        this.a = i;
    }

    public boolean a(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    public void accept(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 10:
                z68.f("FrgAttachView", "fail", th);
                return;
            case 18:
                z68.f("ru.ok.messages.stickers.FrgGifsLoader", "http request failed", th);
                return;
            case 21:
                z68.f("ru.ok.messages.views.dev.FrgPrefs", "resetCache: failed", th);
                return;
            case 22:
                z68.f("ru.ok.messages.views.dev.FrgPrefs", "onSharedPreferenceChanged: failed to restart session", th);
                return;
            default:
                z68.f("ru.ok.messages.views.fragments.FrgProfilePhoto", "fail", th);
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 12:
                return Long.valueOf(((bj2) obj).a.a);
            case 13:
                return new mo3((fo3) obj);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return Long.valueOf(((bj2) obj).a.a);
            case 16:
                return Long.valueOf(((v62) ((Map.Entry) obj).getValue()).c);
            case LangUtils.HASH_SEED /*17*/:
                return Long.valueOf(((bj2) obj).a.a);
            case 19:
                return String.valueOf((String) obj);
            case 20:
                List list = (List) obj;
                if (list.size() <= 2) {
                    return TextUtils.join(", ", list);
                }
                StringBuilder sb = new StringBuilder();
                sb.append((String) list.get(0));
                sb.append(", ");
                return wj6.n(sb, (String) list.get(1), "…");
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return Long.valueOf(((a32) obj).a);
            default:
                e27 e27 = (e27) obj;
                e27.c();
                return tb7.p(gsg.H(new xff(9), e27.R0.b));
        }
    }

    public String b(Context context) {
        switch (this.a) {
            case 0:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
            case 1:
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                return applicationInfo2 != null ? String.valueOf(applicationInfo2.minSdkVersion) : "";
            case 2:
                return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
        }
    }

    public sf5[] c() {
        switch (this.a) {
            case 5:
                return new sf5[]{new pq5()};
            default:
                return new sf5[]{new px5()};
        }
    }

    public Object g(soc soc) {
        return FirebaseInstallationsRegistrar.lambda$getComponents$0(soc);
    }

    public jv0 h(Bundle bundle) {
        switch (this.a) {
            case 9:
                aa6 aa6 = new aa6();
                if (bundle != null) {
                    ClassLoader classLoader = kv0.class.getClassLoader();
                    int i = t0g.a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(Integer.toString(0, 36));
                ca6 ca6 = ca6.P0;
                String str = ca6.a;
                if (string == null) {
                    string = str;
                }
                aa6.a = string;
                String string2 = bundle.getString(Integer.toString(1, 36));
                if (string2 == null) {
                    string2 = ca6.b;
                }
                aa6.b = string2;
                String string3 = bundle.getString(Integer.toString(2, 36));
                if (string3 == null) {
                    string3 = ca6.c;
                }
                aa6.c = string3;
                aa6.d = bundle.getInt(Integer.toString(3, 36), ca6.o);
                aa6.e = bundle.getInt(Integer.toString(4, 36), ca6.v);
                aa6.f = bundle.getInt(Integer.toString(5, 36), ca6.w);
                aa6.g = bundle.getInt(Integer.toString(6, 36), ca6.x);
                String string4 = bundle.getString(Integer.toString(7, 36));
                if (string4 == null) {
                    string4 = ca6.z;
                }
                aa6.h = string4;
                rp9 rp9 = (rp9) bundle.getParcelable(Integer.toString(8, 36));
                if (rp9 == null) {
                    rp9 = ca6.X;
                }
                aa6.i = rp9;
                String string5 = bundle.getString(Integer.toString(9, 36));
                if (string5 == null) {
                    string5 = ca6.Y;
                }
                aa6.j = string5;
                String string6 = bundle.getString(Integer.toString(10, 36));
                if (string6 == null) {
                    string6 = ca6.Z;
                }
                aa6.k = string6;
                aa6.l = bundle.getInt(Integer.toString(11, 36), ca6.v0);
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                while (true) {
                    String num = Integer.toString(12, 36);
                    String num2 = Integer.toString(i2, 36);
                    StringBuilder sb = new StringBuilder(g63.f(g63.f(1, num), num2));
                    sb.append(num);
                    sb.append("_");
                    sb.append(num2);
                    byte[] byteArray = bundle.getByteArray(sb.toString());
                    if (byteArray == null) {
                        aa6.m = arrayList;
                        aa6.n = (xv4) bundle.getParcelable(Integer.toString(13, 36));
                        aa6.o = bundle.getLong(Integer.toString(14, 36), ca6.y0);
                        aa6.p = bundle.getInt(Integer.toString(15, 36), ca6.z0);
                        aa6.q = bundle.getInt(Integer.toString(16, 36), ca6.A0);
                        aa6.r = bundle.getFloat(Integer.toString(17, 36), ca6.B0);
                        aa6.s = bundle.getInt(Integer.toString(18, 36), ca6.C0);
                        aa6.t = bundle.getFloat(Integer.toString(19, 36), ca6.D0);
                        aa6.u = bundle.getByteArray(Integer.toString(20, 36));
                        aa6.v = bundle.getInt(Integer.toString(21, 36), ca6.F0);
                        Bundle bundle2 = bundle.getBundle(Integer.toString(22, 36));
                        aa6.w = bundle2 == null ? null : new l53(bundle2.getInt(Integer.toString(0, 36), -1), bundle2.getInt(Integer.toString(1, 36), -1), bundle2.getInt(Integer.toString(2, 36), -1), bundle2.getByteArray(Integer.toString(3, 36)));
                        aa6.x = bundle.getInt(Integer.toString(23, 36), ca6.H0);
                        aa6.y = bundle.getInt(Integer.toString(24, 36), ca6.I0);
                        aa6.z = bundle.getInt(Integer.toString(25, 36), ca6.J0);
                        aa6.A = bundle.getInt(Integer.toString(26, 36), ca6.K0);
                        aa6.B = bundle.getInt(Integer.toString(27, 36), ca6.L0);
                        aa6.C = bundle.getInt(Integer.toString(28, 36), ca6.M0);
                        aa6.D = bundle.getInt(Integer.toString(29, 36), ca6.N0);
                        return new ca6(aa6);
                    }
                    arrayList.add(byteArray);
                    i2++;
                }
            default:
                y64.g(bundle.getInt(Integer.toString(0, 36), -1) == 0);
                return bundle.getBoolean(Integer.toString(1, 36), false) ? new wx6(bundle.getBoolean(Integer.toString(2, 36), false)) : new wx6();
        }
    }

    public Object parse(sp7 sp7) {
        return GetAnonymTokenByLinkRequest.lambda$static$0(sp7);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 11:
                return !((Boolean) obj).booleanValue();
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return ((Map.Entry) obj).getValue() != null;
            default:
                a32 a32 = (a32) obj;
                return (a32.b.a().a == 0 || a32.b.a == 0 || !a32.E()) ? false : true;
        }
    }

    /* renamed from: c  reason: collision with other method in class */
    public tf5[] m15c() {
        switch (this.a) {
            case 6:
                return new tf5[]{new qq5()};
            default:
                return new tf5[]{new qx5()};
        }
    }
}
