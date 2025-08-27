package defpackage;

import android.content.Context;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import ru.ok.messages.video.fetcher.FetcherException;

/* renamed from: fhf  reason: default package */
public abstract class fhf {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile("#(?i)([\\p{L}0-9_]+)");
    }

    public static String a(aeb aeb, String str, String str2, String str3) {
        teb teb;
        if (cvg.A(str2)) {
            str2 = str3;
        }
        String str4 = "RU";
        if (!cvg.A(str2)) {
            String upperCase = str2.toUpperCase();
            if (Collections.unmodifiableSet(aeb.f).contains(upperCase)) {
                str4 = upperCase;
            }
        }
        try {
            teb = aeb.t(!str.startsWith("+") ? "+".concat(str) : str, str4);
        } catch (NumberParseException unused) {
            teb = null;
        }
        return teb == null ? str : aeb.d(teb, 2);
    }

    public static String b(Context context, l20 l20) {
        g20 g20 = l20.a;
        return g20 == g20.o ? context.getString(qad.d2) : g20 == g20.c ? context.getString(qad.c2) : context.getString(qad.b2);
    }

    public static String c(Context context, qaf qaf) {
        if (!cvg.A(qaf.o)) {
            return qaf.o;
        }
        String str = qaf.b;
        return m58.A(str) ? "io.exception".equals(str) ? context.getString(qad.w1) : context.getString(qad.z1) : context.getString(qad.u1);
    }

    public static String d(Context context, String str, String str2) {
        if ("DEFAULT".equals(str) || str.equals(str2)) {
            return context.getString(qad.s1);
        }
        if (str.equals("_NONE_")) {
            return context.getString(qad.x1);
        }
        Ringtone ringtone = RingtoneManager.getRingtone(context, Uri.parse(str));
        return ringtone != null ? ringtone.getTitle(context) : context.getString(qad.A1);
    }

    public static String e(int i, Context context) {
        String str;
        if (i < 60) {
            str = context.getString(qad.B9);
        } else {
            str = context.getString(qad.A9);
            i = (int) TimeUnit.SECONDS.toMinutes((long) i);
        }
        return context.getString(qad.C9, new Object[]{Integer.valueOf(i), str});
    }

    public static String f(Context context, Throwable th) {
        int i;
        if (th instanceof FetcherException) {
            switch (tr1.y(((FetcherException) th).a)) {
                case 5:
                    i = qad.na;
                    break;
                case 6:
                    i = qad.ua;
                    break;
                case 7:
                    i = qad.sa;
                    break;
                case 8:
                    i = qad.ra;
                    break;
                case 9:
                    i = qad.qa;
                    break;
                case 10:
                    i = qad.ja;
                    break;
                default:
                    i = qad.w1;
                    break;
            }
        } else {
            i = qad.ja;
        }
        return context.getString(i);
    }
}
