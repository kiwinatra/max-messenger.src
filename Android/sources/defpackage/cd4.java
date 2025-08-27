package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.http.util.LangUtils;
import ru.ok.android.api.http.NoHttpApiEndpointException;
import ru.ok.tamtam.nano.Protos;

/* renamed from: cd4  reason: default package */
public class cd4 implements m30, qk3, nsb, yef, wv9, l47, t28 {
    public static cd4 a;
    public static final cd4 b = new Object();
    public static final cd4 c = new Object();
    public static final cd4 o = new Object();
    public static final cd4 v = new Object();
    public static final cd4 w = new Object();
    public static final cd4 x = new Object();

    public static szf d(String str) {
        return StringsKt__StringsJVMKt.startsWith$default(str, "mailto:", false, 2, (Object) null) ? szf.o : StringsKt__StringsJVMKt.startsWith$default(str, "tel:", false, 2, (Object) null) ? szf.c : szf.b;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [cd4, java.lang.Object] */
    public static synchronized cd4 h() {
        cd4 cd4;
        synchronized (cd4.class) {
            try {
                if (a == null) {
                    a = new Object();
                }
                cd4 = a;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return cd4;
    }

    public static int i(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case Protos.Attaches.Attach.LOCATION /*14*/:
                        return 3062500;
                    case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                        return 8000;
                    case 16:
                        return 256000;
                    case LangUtils.HASH_SEED /*17*/:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    public static boolean k(String str, String str2, ArrayList arrayList) {
        if (str2 != null) {
            String take = StringsKt.take(str, 31);
            int length = take.length();
            String take2 = StringsKt.take(str2, 31);
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str3 = (String) it.next();
                if (StringsKt__StringsJVMKt.startsWith$default(str3, take, false, 2, (Object) null) && str3.length() > length && str3.charAt(length) == '=') {
                    it.remove();
                    if (StringsKt__StringsJVMKt.endsWith$default(str3, take2, false, 2, (Object) null) && str3.length() == take2.length() + length + 1) {
                        arrayList.add(str3);
                        return false;
                    }
                }
            }
            arrayList.add(take + '=' + take2);
            while (arrayList.size() > 30) {
                arrayList.remove(0);
            }
        } else {
            String take3 = StringsKt.take(str, 31);
            int length2 = take3.length();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str4 = (String) it2.next();
                if (StringsKt__StringsJVMKt.startsWith$default(str4, take3, false, 2, (Object) null) && str4.length() > length2 && str4.charAt(length2) == '=') {
                    it2.remove();
                }
            }
            return false;
        }
        return true;
    }

    public static vk5 l(String str) {
        Object obj;
        if (str == null || StringsKt.isBlank(str)) {
            return vk5.UNKNOWN;
        }
        String upperCase = StringsKt.trim((CharSequence) str).toString().toUpperCase(Locale.US);
        if (upperCase.length() > 4) {
            return vk5.UNKNOWN;
        }
        EnumEntries enumEntries = vk5.v;
        Iterator it = enumEntries.subList(1, enumEntries.size()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) ((vk5) obj).name(), (Object) upperCase)) {
                break;
            }
        }
        vk5 vk5 = (vk5) obj;
        return vk5 == null ? vk5.UNKNOWN : vk5;
    }

    public static oa9 n(int i) {
        Object obj;
        Iterator it = oa9.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((oa9) obj).a == i) {
                break;
            }
        }
        oa9 oa9 = (oa9) obj;
        if (oa9 != null) {
            return oa9;
        }
        throw new IllegalArgumentException(a81.j(i, "No such value ", " for MessageStatus"));
    }

    public void a() {
    }

    public void accept(Object obj) {
        z68.f("qj5", "onLogout: clear failed", (Throwable) obj);
    }

    public /* bridge */ Object b(u4d u4d) {
        return null;
    }

    public int c(CharSequence charSequence, int i) {
        int i2 = 2;
        for (int i3 = 0; i3 < i && i2 == 2; i3++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i3));
            zef zef = bff.a;
            if (directionality != 0) {
                if (!(directionality == 1 || directionality == 2)) {
                    switch (directionality) {
                        case Protos.Attaches.Attach.LOCATION /*14*/:
                        case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                            break;
                        case 16:
                        case LangUtils.HASH_SEED /*17*/:
                            break;
                        default:
                            i2 = 2;
                            break;
                    }
                }
                i2 = 0;
            }
            i2 = 1;
        }
        return i2;
    }

    public io0 e(qa7 qa7, Object obj) {
        io0 io0 = new io0(f(qa7.b).toString(), qa7.i, qa7.j, qa7.h, (qx0) null, (String) null);
        io0.g = obj;
        return io0;
    }

    public Uri f(Uri uri) {
        return uri;
    }

    public uae g(Uri uri) {
        return new uae(f(uri).toString());
    }

    public io0 j(qa7 qa7, Object obj) {
        String str;
        qx0 qx0;
        bsb bsb = qa7.q;
        if (bsb != null) {
            qx0 b2 = bsb.b();
            str = bsb.getClass().getName();
            qx0 = b2;
        } else {
            qx0 = null;
            str = null;
        }
        io0 io0 = new io0(f(qa7.b).toString(), qa7.i, qa7.j, qa7.h, qx0, str);
        io0.g = obj;
        return io0;
    }

    public void load() {
        synchronized (fqc.c) {
            Object obj = fqc.d;
            synchronized (obj) {
                if (!fqc.e) {
                    long b2 = fqc.b();
                    synchronized (obj) {
                        fqc.f = b2;
                        fqc.e = true;
                    }
                }
            }
        }
    }

    public Object m(pf9 pf9) {
        long j = 0;
        try {
            j = ryg.d0(pf9, 0);
        } catch (Throwable th) {
            z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            for (xm a2 : ytd.a) {
                a2.a(th);
            }
            xtd.a.getClass();
            int ordinal = xtd.b.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                throw th;
            }
        }
        return Long.valueOf(j);
    }

    public boolean test(Object obj) {
        return !((boe) obj).Y;
    }

    public Uri u(String str) {
        if (Intrinsics.areEqual((Object) str, (Object) "api")) {
            Uri uri = um.a;
            return um.a;
        }
        throw new NoHttpApiEndpointException(str);
    }
}
