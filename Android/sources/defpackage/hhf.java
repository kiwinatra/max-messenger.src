package defpackage;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.HTTP;

/* renamed from: hhf  reason: default package */
public abstract class hhf {
    public static final Pattern a;
    public static final Pattern b = Pattern.compile("@([A-Za-z0-9_-]+)\\s");
    public static final Pattern c = Pattern.compile("@([A-Za-z0-9_-]+)\\s/");
    public static final Pattern d;
    public static final Pattern e;
    public static final Pattern f;
    public static final Pattern g;
    public static final Pattern h = Pattern.compile("[\n\r]");
    public static final Pattern i = Pattern.compile("\\s{2,}");
    public static final String[] j = {HTTP.CRLF, "\r", "\n", " ", " ", ""};
    public static final String[] k = {" ", "\\t", "\\n", "\\r", "\\t", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "​", "‌", "‍", " ", " ", "　"};
    public static final Pattern l = Pattern.compile("[^\\p{L}\\p{Nd} ]+");

    static {
        Pattern compile = Pattern.compile("@([A-Za-z0-9_-]+)");
        a = compile;
        Pattern compile2 = Pattern.compile("[\\p{Punct}\\p{L}\\p{N}\\p{Sm}]+");
        d = Pattern.compile("(" + compile + "\\s)?(?<=\\s|\\p{Zs}|^)\\/[﻿]?[\\p{L}\\p{N}_]+");
        e = Pattern.compile("(" + compile + "\\s)?(?<=\\s|\\p{Zs}|^)\\/[﻿]?[\\p{L}\\p{N}_]+\\s(" + compile2 + ")?");
        StringBuilder sb = new StringBuilder("(");
        sb.append(compile);
        sb.append("\\s)(?<=\\s|\\p{Zs}|^)\\/[﻿]?[\\p{L}\\p{N}_]+");
        f = Pattern.compile(sb.toString());
        g = Pattern.compile("(" + compile + "\\s)(?<=\\s|\\p{Zs}|^)\\/[﻿]?[\\p{L}\\p{N}_]+\\s(" + compile2 + ")?");
    }

    public static CharSequence a(CharSequence charSequence, yva yva) {
        if (cvg.A(charSequence)) {
            return "";
        }
        if (yva.k.g(charSequence, 0)) {
            List a2 = yva.k.a(charSequence);
            if (!a2.isEmpty()) {
                CharSequence charSequence2 = (CharSequence) a2.get(0);
                return charSequence2 == null ? "" : charSequence2;
            }
        }
        String replaceAll = l.matcher(charSequence).replaceAll("");
        if (!cvg.A(replaceAll)) {
            charSequence = replaceAll;
        }
        String[] split = charSequence.toString().trim().split(" +");
        StringBuilder sb = new StringBuilder();
        int min = Math.min(split.length, 2);
        for (int i2 = 0; i2 < min; i2++) {
            String str = split[i2];
            if (!cvg.A(str)) {
                sb.append(Character.isHighSurrogate(str.charAt(0)) ? str.substring(0, Math.min(str.length(), 2)) : str.substring(0, 1));
            }
        }
        return sb.toString().toUpperCase();
    }

    public static String b(String str) {
        String rawPath = cvg.A(str) ? null : URI.create(str).getRawPath();
        return rawPath == null ? "" : rawPath.length() < 2 ? str : rawPath.substring(1);
    }

    public static String c(String str) {
        if (cvg.A(str)) {
            return "";
        }
        return "@" + b(str);
    }

    public static String d(String str, Pattern pattern) {
        Pattern pattern2 = nab.a;
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            Matcher matcher2 = pattern2.matcher(str);
            boolean z = false;
            while (matcher2.find() && matcher2.start() <= matcher.end()) {
                if (matcher2.group().contains(matcher.group())) {
                    z = true;
                }
            }
            if (!z && matcher.group().contains("/﻿")) {
                str = str.replace(matcher.group(), matcher.group().replace("/﻿", String.valueOf('/')));
            }
        }
        return str;
    }

    public static String[] e(String str, yva yva) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < str.length()) {
            if (!tld.i(str.charAt(i2))) {
                int i3 = i2;
                while (i3 < str.length() && yva.k.g(str, i3)) {
                    i3++;
                }
                String substring = i3 > i2 ? str.substring(i2, i3) : null;
                if (!cvg.A(substring)) {
                    arrayList.add(substring);
                    i2 += substring.length() - 1;
                } else {
                    int i4 = i2;
                    while (i4 < str.length()) {
                        yva.getClass();
                        if (tld.i(str.charAt(i4)) || yva.k.g(str, i4)) {
                            break;
                        }
                        i4++;
                    }
                    if (i4 > i2) {
                        arrayList.add(str.substring(i2, i4));
                    }
                    i2 = i4;
                }
            }
            i2++;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String f(String str) {
        if (cvg.A(str)) {
            return str;
        }
        return i.matcher(h.matcher(str).replaceAll(" ")).replaceAll(" ");
    }
}
