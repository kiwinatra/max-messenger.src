package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.ParserException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: m64  reason: default package */
public final class m64 implements o8b {
    public static final Pattern a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    public final Object j(Uri uri, l74 l74) {
        String readLine = new BufferedReader(new InputStreamReader(l74, x22.c)).readLine();
        try {
            Matcher matcher = a.matcher(readLine);
            if (matcher.matches()) {
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j = "+".equals(matcher.group(4)) ? 1 : -1;
                    long parseLong = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    time -= (((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0 : Long.parseLong(group2))) * 60000) * j;
                }
                return Long.valueOf(time);
            }
            throw ParserException.b((Exception) null, "Couldn't parse timestamp: " + readLine);
        } catch (ParseException e) {
            throw ParserException.b(e, (String) null);
        }
    }
}
