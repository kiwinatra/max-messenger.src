package defpackage;

import com.android.billingclient.api.BillingClient;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: g84  reason: default package */
public final class g84 {
    public static final Pattern h = Pattern.compile("\\|[^\\|]*\\|");
    public static final Pattern i = Pattern.compile("f{1,9}");
    public static final ArrayList j;
    public final String a;
    public final Locale b;
    public ArrayList c;
    public ArrayList d;
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final LinkedHashMap g = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList();
        j = arrayList;
        arrayList.add("YYYY");
        arrayList.add("YY");
        arrayList.add("MMMM");
        arrayList.add("MMM");
        arrayList.add("MM");
        arrayList.add("M");
        arrayList.add("DD");
        arrayList.add("D");
        arrayList.add("WWWW");
        arrayList.add("WWW");
        arrayList.add("hh12");
        arrayList.add("h12");
        arrayList.add("hh");
        arrayList.add("h");
        arrayList.add("mm");
        arrayList.add("m");
        arrayList.add("ss");
        arrayList.add("s");
        arrayList.add("a");
        arrayList.add("fffffffff");
        arrayList.add("ffffffff");
        arrayList.add("fffffff");
        arrayList.add("ffffff");
        arrayList.add("fffff");
        arrayList.add("ffff");
        arrayList.add(BillingClient.FeatureType.PRODUCT_DETAILS);
        arrayList.add("ff");
        arrayList.add("f");
    }

    public g84(String str) {
        this.a = str;
        this.b = null;
        if (!m58.J(str)) {
            throw new IllegalArgumentException("DateTime format has no content.");
        }
    }

    public static String a(String str) {
        return (!m58.J(str) || str.length() != 1) ? str : "0".concat(str);
    }

    public static Integer f(Integer num) {
        if (num == null) {
            return num;
        }
        if (num.intValue() == 0) {
            return 12;
        }
        return num.intValue() > 12 ? Integer.valueOf(num.intValue() - 12) : num;
    }

    public static String g(Object obj) {
        return obj != null ? String.valueOf(obj) : "";
    }

    /* JADX WARNING: type inference failed for: r7v4, types: [f84, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v8, types: [e84, java.lang.Object] */
    public final String b(d84 d84) {
        String str;
        this.d = new ArrayList();
        this.c = new ArrayList();
        Pattern pattern = h;
        String str2 = this.a;
        Matcher matcher = pattern.matcher(str2);
        while (matcher.find()) {
            ? obj = new Object();
            obj.a = matcher.start();
            obj.b = matcher.end() - 1;
            this.d.add(obj);
        }
        Iterator it = j.iterator();
        String str3 = str2;
        while (true) {
            int i2 = 0;
            if (it.hasNext()) {
                String str4 = (String) it.next();
                Matcher matcher2 = Pattern.compile(str4).matcher(str3);
                while (matcher2.find()) {
                    ? obj2 = new Object();
                    obj2.a = matcher2.start();
                    obj2.b = matcher2.end() - 1;
                    Iterator it2 = this.d.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            e84 e84 = (e84) it2.next();
                            int i3 = e84.a;
                            int i4 = obj2.a;
                            if (i3 <= i4 && i4 <= e84.b) {
                                break;
                            }
                        } else {
                            String group = matcher2.group();
                            if ("YYYY".equals(group)) {
                                str = g(d84.a);
                            } else if ("YY".equals(group)) {
                                String g2 = g(d84.a);
                                str = m58.J(g2) ? g2.substring(2) : "";
                            } else if ("MMMM".equals(group)) {
                                Integer num = d84.b;
                                num.getClass();
                                str = c(num);
                            } else if ("MMM".equals(group)) {
                                Integer num2 = d84.b;
                                num2.getClass();
                                str = c(num2);
                                if (m58.J(str) && str.length() >= 3) {
                                    str = str.substring(0, 3);
                                }
                            } else if ("MM".equals(group)) {
                                str = a(g(d84.b));
                            } else if ("M".equals(group)) {
                                str = g(d84.b);
                            } else if ("DD".equals(group)) {
                                str = a(g(d84.c));
                            } else if ("D".equals(group)) {
                                str = g(d84.c);
                            } else if ("WWWW".equals(group)) {
                                d84.f();
                                str = d(Integer.valueOf(((d84.c() + 1) % 7) + 1));
                            } else if ("WWW".equals(group)) {
                                d84.f();
                                str = d(Integer.valueOf(((d84.c() + 1) % 7) + 1));
                                if (m58.J(str) && str.length() >= 3) {
                                    str = str.substring(0, 3);
                                }
                            } else if ("hh".equals(group)) {
                                str = a(g(d84.o));
                            } else if ("h".equals(group)) {
                                str = g(d84.o);
                            } else if ("h12".equals(group)) {
                                str = g(f(d84.o));
                            } else if ("hh12".equals(group)) {
                                str = a(g(f(d84.o)));
                            } else if ("a".equals(group)) {
                                Integer num3 = d84.o;
                                num3.getClass();
                                Locale locale = this.b;
                                if (locale != null) {
                                    LinkedHashMap linkedHashMap = this.g;
                                    if (!linkedHashMap.containsKey(locale)) {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(e(6));
                                        arrayList.add(e(18));
                                        linkedHashMap.put(locale, arrayList);
                                    }
                                    str = num3.intValue() < 12 ? (String) ((List) linkedHashMap.get(locale)).get(0) : (String) ((List) linkedHashMap.get(locale)).get(1);
                                } else {
                                    throw new IllegalArgumentException("Your date pattern requires either a Locale, or your own custom localizations for text:" + m58.I(str2));
                                }
                            } else if ("mm".equals(group)) {
                                str = a(g(d84.v));
                            } else if ("m".equals(group)) {
                                str = g(d84.v);
                            } else if ("ss".equals(group)) {
                                str = a(g(d84.w));
                            } else if ("s".equals(group)) {
                                str = g(d84.w);
                            } else if (!group.startsWith("f")) {
                                throw new IllegalArgumentException("Unknown token in date formatting pattern: ".concat(group));
                            } else if (i.matcher(group).matches()) {
                                String g3 = g(d84.x);
                                while (g3.length() < 9) {
                                    g3 = "0".concat(g3);
                                }
                                int length = group.length();
                                str = (!m58.J(g3) || g3.length() < length) ? g3 : g3.substring(0, length);
                            } else {
                                throw new IllegalArgumentException("Unknown token in date formatting pattern: ".concat(group));
                            }
                            obj2.c = str;
                            this.c.add(obj2);
                        }
                    }
                }
                StringBuilder sb = new StringBuilder();
                for (int i5 = 1; i5 <= str4.length(); i5++) {
                    sb.append("@");
                }
                str3 = str3.replace(str4, sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                while (i2 < str2.length()) {
                    String substring = str2.substring(i2, i2 + 1);
                    Iterator it3 = this.c.iterator();
                    f84 f84 = null;
                    while (it3.hasNext()) {
                        f84 f842 = (f84) it3.next();
                        if (f842.a == i2) {
                            f84 = f842;
                        }
                    }
                    if (f84 != null) {
                        sb2.append(f84.c);
                        i2 = f84.b;
                    } else if (!"|".equals(substring)) {
                        sb2.append(substring);
                    }
                    i2++;
                }
                return sb2.toString();
            }
        }
    }

    public final String c(Integer num) {
        if (num == null) {
            return "";
        }
        Locale locale = this.b;
        if (locale != null) {
            LinkedHashMap linkedHashMap = this.e;
            if (!linkedHashMap.containsKey(locale)) {
                ArrayList arrayList = new ArrayList();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM", locale);
                for (int i2 = 0; i2 <= 11; i2++) {
                    GregorianCalendar gregorianCalendar = new GregorianCalendar();
                    gregorianCalendar.set(1, 2000);
                    gregorianCalendar.set(2, i2);
                    gregorianCalendar.set(5, 15);
                    arrayList.add(simpleDateFormat.format(gregorianCalendar.getTime()));
                }
                linkedHashMap.put(locale, arrayList);
            }
            return (String) ((List) linkedHashMap.get(locale)).get(num.intValue() - 1);
        }
        throw new IllegalArgumentException("Your date pattern requires either a Locale, or your own custom localizations for text:" + m58.I(this.a));
    }

    public final String d(Integer num) {
        Locale locale = this.b;
        if (locale != null) {
            LinkedHashMap linkedHashMap = this.f;
            if (!linkedHashMap.containsKey(locale)) {
                ArrayList arrayList = new ArrayList();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE", locale);
                for (int i2 = 8; i2 <= 14; i2++) {
                    GregorianCalendar gregorianCalendar = new GregorianCalendar();
                    gregorianCalendar.set(1, 2009);
                    gregorianCalendar.set(2, 1);
                    gregorianCalendar.set(5, i2);
                    arrayList.add(simpleDateFormat.format(gregorianCalendar.getTime()));
                }
                linkedHashMap.put(locale, arrayList);
            }
            return (String) ((List) linkedHashMap.get(locale)).get(num.intValue() - 1);
        }
        throw new IllegalArgumentException("Your date pattern requires either a Locale, or your own custom localizations for text:" + m58.I(this.a));
    }

    public final String e(Integer num) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("a", this.b);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, 2000);
        gregorianCalendar.set(2, 6);
        gregorianCalendar.set(5, 15);
        gregorianCalendar.set(11, num.intValue());
        return simpleDateFormat.format(gregorianCalendar.getTime());
    }

    public g84(String str, Locale locale) {
        this.a = str;
        this.b = locale;
        if (!m58.J(str)) {
            throw new IllegalArgumentException("DateTime format has no content.");
        }
    }
}
