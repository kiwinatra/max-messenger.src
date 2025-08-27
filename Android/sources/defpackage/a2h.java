package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.text.Typography;

/* renamed from: a2h  reason: default package */
public abstract class a2h {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object a2 : (List) obj) {
                a(sb, i, str, a2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry a3 : ((Map) obj).entrySet()) {
                a(sb, i, str, a3);
            }
        } else {
            sb.append(10);
            b(sb, i);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i2 = 1; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(n79.Z(new fzg(((String) obj).getBytes(y0h.a))));
                sb.append(Typography.quote);
            } else if (obj instanceof fzg) {
                sb.append(": \"");
                sb.append(n79.Z((fzg) obj));
                sb.append(Typography.quote);
            } else if (obj instanceof p0h) {
                sb.append(" {");
                c((p0h) obj, sb, i + 2);
                sb.append("\n");
                b(sb, i);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                int i3 = i + 2;
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                a(sb, i3, "key", entry.getKey());
                a(sb, i3, "value", entry.getValue());
                sb.append("\n");
                b(sb, i);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    public static void b(StringBuilder sb, int i) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(a, 0, i2);
            i -= i2;
        }
    }

    public static void c(azg azg, StringBuilder sb, int i) {
        int i2;
        boolean z;
        Method method;
        Method method2;
        azg azg2 = azg;
        StringBuilder sb2 = sb;
        int i3 = i;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = azg.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                a(sb2, i3, substring.substring(0, substring.length() - 4), p0h.g(azg2, method2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb2, i3, substring.substring(0, substring.length() - 3), p0h.g(azg2, method, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object g = p0h.g(azg2, method4, new Object[0]);
                    if (method5 == null) {
                        if (g instanceof Boolean) {
                            if (!((Boolean) g).booleanValue()) {
                            }
                        } else if (g instanceof Integer) {
                            if (((Integer) g).intValue() == 0) {
                            }
                        } else if (g instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) g).floatValue()) == 0) {
                            }
                        } else if (!(g instanceof Double)) {
                            if (g instanceof String) {
                                z = g.equals("");
                            } else if (g instanceof fzg) {
                                z = g.equals(fzg.c);
                            } else if (g instanceof azg) {
                                if (g == ((p0h) ((p0h) ((azg) g)).m(6))) {
                                }
                            } else if ((g instanceof Enum) && ((Enum) g).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) g).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) p0h.g(azg2, method5, new Object[0])).booleanValue()) {
                    }
                    a(sb2, i3, substring, g);
                }
            }
            i2 = 3;
        }
        b3h b3h = ((p0h) azg2).zzc;
        if (b3h != null) {
            for (int i5 = 0; i5 < b3h.a; i5++) {
                a(sb2, i3, String.valueOf(b3h.b[i5] >>> 3), b3h.c[i5]);
            }
        }
    }
}
