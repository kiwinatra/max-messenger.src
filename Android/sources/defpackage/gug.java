package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.HTTP;

/* renamed from: gug  reason: default package */
public final class gug {
    public static final Pattern e = Pattern.compile("^a=(?:rtcp-fb|fmtp):(\\d+) (apt=(\\d+))?.*$");
    public static final Pattern f = Pattern.compile("^a=rtpmap:(\\d+) ([a-zA-Z0-9-]+)(/\\d+)+[\r]?$");
    public final HashSet a;
    public final String b;
    public final int c;
    public final LinkedHashMap d;

    public gug(String str, int i, LinkedHashMap linkedHashMap) {
        this.b = str;
        this.c = i;
        this.d = linkedHashMap;
        this.a = new HashSet(linkedHashMap.size() * 7);
    }

    public static gug a(int i, String str) {
        List asList = Arrays.asList(str.split(" "));
        if (asList.size() <= 3) {
            return null;
        }
        asList.subList(0, 3);
        ArrayList arrayList = new ArrayList(asList.subList(3, asList.size()));
        LinkedHashMap linkedHashMap = new LinkedHashMap(arrayList.size(), 2.0f);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            linkedHashMap.put(str2, new dug(str2));
        }
        return new gug(str, i, linkedHashMap);
    }

    public final ArrayList b(String str) {
        ArrayList arrayList = new ArrayList();
        for (dug dug : this.d.values()) {
            if (Objects.equals(str, dug.b)) {
                arrayList.add(dug);
            }
        }
        return arrayList;
    }

    public final void c(StringBuilder sb, List list, boolean z) {
        boolean d2 = d(list);
        LinkedHashMap linkedHashMap = this.d;
        if (!d2 && !z) {
            for (dug dug : linkedHashMap.values()) {
                Iterator it = dug.c.iterator();
                while (it.hasNext()) {
                    sb.append((String) it.next());
                    sb.append(HTTP.CRLF);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Iterator it3 = b((String) it2.next()).iterator();
            while (it3.hasNext()) {
                dug dug2 = (dug) it3.next();
                Iterator it4 = dug2.c.iterator();
                while (it4.hasNext()) {
                    sb.append((String) it4.next());
                    sb.append(HTTP.CRLF);
                }
                Iterator it5 = dug2.d.iterator();
                while (it5.hasNext()) {
                    String str = (String) it5.next();
                    dug dug3 = (dug) linkedHashMap.get(str);
                    if (dug3 != null) {
                        Iterator it6 = dug3.c.iterator();
                        while (it6.hasNext()) {
                            sb.append((String) it6.next());
                            sb.append(HTTP.CRLF);
                        }
                        arrayList.add(str);
                    }
                }
            }
        }
        if (!z) {
            for (dug dug4 : linkedHashMap.values()) {
                if (!list.contains(dug4.b) && !arrayList.contains(dug4.a)) {
                    Iterator it7 = dug4.c.iterator();
                    while (it7.hasNext()) {
                        sb.append((String) it7.next());
                        sb.append(HTTP.CRLF);
                    }
                }
            }
        }
    }

    public final boolean d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!b((String) it.next()).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void e(int i, String str) {
        dug dug;
        dug dug2;
        dug dug3;
        if (str.startsWith("a=")) {
            Matcher matcher = e.matcher(str);
            boolean matches = matcher.matches();
            HashSet hashSet = this.a;
            LinkedHashMap linkedHashMap = this.d;
            if (matches) {
                String group = matcher.group(1);
                String group2 = matcher.group(3);
                if (!(group2 == null || (dug3 = (dug) linkedHashMap.get(group2)) == null)) {
                    dug3.d.add(group);
                }
                if (group != null && (dug2 = (dug) linkedHashMap.get(group)) != null) {
                    dug2.c.add(str);
                    hashSet.add(Integer.valueOf(i));
                    return;
                }
                return;
            }
            Matcher matcher2 = f.matcher(str);
            if (matcher2.matches()) {
                String group3 = matcher2.group(1);
                String group4 = matcher2.group(2);
                if (group4 != null && group3 != null && (dug = (dug) linkedHashMap.get(group3)) != null) {
                    dug.b = group4;
                    dug dug4 = (dug) linkedHashMap.get(group3);
                    if (dug4 != null) {
                        dug4.c.add(str);
                        hashSet.add(Integer.valueOf(i));
                    }
                }
            }
        }
    }

    public final void f(StringBuilder sb, List list, boolean z) {
        boolean d2 = d(list);
        String str = this.b;
        if (d2 || z) {
            List<String> subList = Arrays.asList(str.split(" ")).subList(0, 3);
            ArrayList arrayList = new ArrayList();
            for (String append : subList) {
                sb.append(append);
                sb.append(' ');
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Iterator it2 = b((String) it.next()).iterator();
                while (it2.hasNext()) {
                    dug dug = (dug) it2.next();
                    sb.append(dug.a);
                    sb.append(' ');
                    Iterator it3 = dug.d.iterator();
                    while (it3.hasNext()) {
                        String str2 = (String) it3.next();
                        sb.append(str2);
                        sb.append(' ');
                        arrayList.add(str2);
                    }
                }
            }
            if (!z) {
                for (dug dug2 : this.d.values()) {
                    if (!list.contains(dug2.b)) {
                        String str3 = dug2.a;
                        if (!arrayList.contains(str3)) {
                            sb.append(str3);
                            sb.append(' ');
                        }
                    }
                }
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append(HTTP.CRLF);
            return;
        }
        sb.append(str);
        sb.append(HTTP.CRLF);
    }
}
