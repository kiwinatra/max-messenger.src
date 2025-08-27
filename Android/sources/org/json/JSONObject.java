package org.json;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.regex.Pattern;
import org.apache.http.HttpStatus;

public class JSONObject {
    public static final Object NULL = new Null();
    static final Pattern NUMBER_PATTERN = Pattern.compile("-?(?:0|[1-9]\\d*)(?:\\.\\d+)?(?:[eE][+-]?\\d+)?");
    private final Map<String, Object> map;

    public static final class Null {
        private Null() {
        }

        public final Object clone() {
            return this;
        }

        public boolean equals(Object obj) {
            return obj == null || obj == this;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "null";
        }
    }

    public JSONObject() {
        this.map = new HashMap();
    }

    public static String doubleToString(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            return "null";
        }
        String d2 = Double.toString(d);
        if (d2.indexOf(46) <= 0 || d2.indexOf(HttpStatus.SC_SWITCHING_PROTOCOLS) >= 0 || d2.indexOf(69) >= 0) {
            return d2;
        }
        while (d2.endsWith("0")) {
            d2 = d2.substring(0, d2.length() - 1);
        }
        return d2.endsWith(".") ? d2.substring(0, d2.length() - 1) : d2;
    }

    private static <A extends Annotation> A getAnnotation(Method method, Class<A> cls) {
        if (!(method == null || cls == null)) {
            if (method.isAnnotationPresent(cls)) {
                return method.getAnnotation(cls);
            }
            Class<?> declaringClass = method.getDeclaringClass();
            if (declaringClass.getSuperclass() == null) {
                return null;
            }
            Class[] interfaces = declaringClass.getInterfaces();
            int length = interfaces.length;
            int i = 0;
            while (i < length) {
                try {
                    return getAnnotation(interfaces[i].getMethod(method.getName(), method.getParameterTypes()), cls);
                } catch (NoSuchMethodException | SecurityException unused) {
                    i++;
                }
            }
            try {
                return getAnnotation(declaringClass.getSuperclass().getMethod(method.getName(), method.getParameterTypes()), cls);
            } catch (NoSuchMethodException | SecurityException unused2) {
            }
        }
        return null;
    }

    private static int getAnnotationDepth(Method method, Class<? extends Annotation> cls) {
        if (!(method == null || cls == null)) {
            if (method.isAnnotationPresent(cls)) {
                return 1;
            }
            Class<?> declaringClass = method.getDeclaringClass();
            if (declaringClass.getSuperclass() == null) {
                return -1;
            }
            Class[] interfaces = declaringClass.getInterfaces();
            int length = interfaces.length;
            int i = 0;
            while (i < length) {
                try {
                    int annotationDepth = getAnnotationDepth(interfaces[i].getMethod(method.getName(), method.getParameterTypes()), cls);
                    if (annotationDepth > 0) {
                        return annotationDepth + 1;
                    }
                    i++;
                } catch (NoSuchMethodException | SecurityException unused) {
                }
            }
            try {
                int annotationDepth2 = getAnnotationDepth(declaringClass.getSuperclass().getMethod(method.getName(), method.getParameterTypes()), cls);
                if (annotationDepth2 > 0) {
                    return annotationDepth2 + 1;
                }
            } catch (NoSuchMethodException | SecurityException unused2) {
            }
        }
        return -1;
    }

    private static String getKeyNameFromMethod(Method method) {
        String str;
        int annotationDepth;
        int annotationDepth2 = getAnnotationDepth(method, JSONPropertyIgnore.class);
        Class<JSONPropertyName> cls = JSONPropertyName.class;
        if (annotationDepth2 > 0 && ((annotationDepth = getAnnotationDepth(method, cls)) < 0 || annotationDepth2 <= annotationDepth)) {
            return null;
        }
        JSONPropertyName jSONPropertyName = (JSONPropertyName) getAnnotation(method, cls);
        if (jSONPropertyName != null && jSONPropertyName.value() != null && !jSONPropertyName.value().isEmpty()) {
            return jSONPropertyName.value();
        }
        String name = method.getName();
        if (name.startsWith("get") && name.length() > 3) {
            str = name.substring(3);
        } else if (!name.startsWith("is") || name.length() <= 2) {
            return null;
        } else {
            str = name.substring(2);
        }
        if (Character.isLowerCase(str.charAt(0))) {
            return null;
        }
        if (str.length() == 1) {
            return str.toLowerCase(Locale.ROOT);
        }
        if (Character.isUpperCase(str.charAt(1))) {
            return str;
        }
        return str.substring(0, 1).toLowerCase(Locale.ROOT) + str.substring(1);
    }

    public static String[] getNames(JSONObject jSONObject) {
        if (jSONObject.isEmpty()) {
            return null;
        }
        return (String[]) jSONObject.keySet().toArray(new String[jSONObject.length()]);
    }

    public static final void indent(Writer writer, int i) throws IOException {
        for (int i2 = 0; i2 < i; i2++) {
            writer.write(32);
        }
    }

    public static boolean isDecimalNotation(String str) {
        return str.indexOf(46) > -1 || str.indexOf(HttpStatus.SC_SWITCHING_PROTOCOLS) > -1 || str.indexOf(69) > -1 || "-0".equals(str);
    }

    private static boolean isValidMethodName(String str) {
        return !"getClass".equals(str) && !"getDeclaringClass".equals(str);
    }

    public static String numberToString(Number number) throws JSONException {
        if (number != null) {
            testValidity(number);
            String obj = number.toString();
            if (obj.indexOf(46) <= 0 || obj.indexOf(HttpStatus.SC_SWITCHING_PROTOCOLS) >= 0 || obj.indexOf(69) >= 0) {
                return obj;
            }
            while (obj.endsWith("0")) {
                obj = obj.substring(0, obj.length() - 1);
            }
            return obj.endsWith(".") ? obj.substring(0, obj.length() - 1) : obj;
        }
        throw new JSONException("Null pointer");
    }

    public static BigDecimal objectToBigDecimal(Object obj, BigDecimal bigDecimal) {
        if (NULL.equals(obj)) {
            return bigDecimal;
        }
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        if (obj instanceof BigInteger) {
            return new BigDecimal((BigInteger) obj);
        }
        if ((obj instanceof Double) || (obj instanceof Float)) {
            Number number = (Number) obj;
            return Double.isNaN(number.doubleValue()) ? bigDecimal : new BigDecimal(number.doubleValue());
        } else if ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
            return new BigDecimal(((Number) obj).longValue());
        } else {
            try {
                return new BigDecimal(obj.toString());
            } catch (Exception unused) {
                return bigDecimal;
            }
        }
    }

    public static BigInteger objectToBigInteger(Object obj, BigInteger bigInteger) {
        if (NULL.equals(obj)) {
            return bigInteger;
        }
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        if (obj instanceof BigDecimal) {
            return ((BigDecimal) obj).toBigInteger();
        }
        if ((obj instanceof Double) || (obj instanceof Float)) {
            double doubleValue = ((Number) obj).doubleValue();
            return Double.isNaN(doubleValue) ? bigInteger : new BigDecimal(doubleValue).toBigInteger();
        } else if ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
            return BigInteger.valueOf(((Number) obj).longValue());
        } else {
            try {
                String obj2 = obj.toString();
                return isDecimalNotation(obj2) ? new BigDecimal(obj2).toBigInteger() : new BigInteger(obj2);
            } catch (Exception unused) {
                return bigInteger;
            }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[ExcHandler: IllegalAccessException | IllegalArgumentException | InvocationTargetException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:28:0x0068] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void populateMap(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Class r0 = r8.getClass()
            java.lang.ClassLoader r1 = r0.getClassLoader()
            if (r1 == 0) goto L_0x000f
            java.lang.reflect.Method[] r0 = r0.getMethods()
            goto L_0x0013
        L_0x000f:
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
        L_0x0013:
            int r1 = r0.length
            r2 = 0
        L_0x0015:
            if (r2 >= r1) goto L_0x0070
            r3 = r0[r2]
            int r4 = r3.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isPublic(r4)
            if (r5 == 0) goto L_0x006d
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 != 0) goto L_0x006d
            java.lang.Class[] r4 = r3.getParameterTypes()
            int r4 = r4.length
            if (r4 != 0) goto L_0x006d
            boolean r4 = r3.isBridge()
            if (r4 != 0) goto L_0x006d
            java.lang.Class r4 = r3.getReturnType()
            java.lang.Class r5 = java.lang.Void.TYPE
            if (r4 == r5) goto L_0x006d
            java.lang.String r4 = r3.getName()
            boolean r4 = isValidMethodName(r4)
            if (r4 == 0) goto L_0x006d
            java.lang.String r4 = getKeyNameFromMethod(r3)
            if (r4 == 0) goto L_0x006d
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x006d
            r5 = 0
            java.lang.Object r3 = r3.invoke(r8, r5)     // Catch:{  }
            if (r3 == 0) goto L_0x006d
            java.util.Map<java.lang.String, java.lang.Object> r5 = r7.map     // Catch:{  }
            java.lang.Object r6 = wrap(r3)     // Catch:{  }
            r5.put(r4, r6)     // Catch:{  }
            boolean r4 = r3 instanceof java.io.Closeable     // Catch:{  }
            if (r4 == 0) goto L_0x006d
            java.io.Closeable r3 = (java.io.Closeable) r3     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x006d, IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x006d, IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x006d }
            r3.close()     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x006d, IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x006d, IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x006d }
        L_0x006d:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.JSONObject.populateMap(java.lang.Object):void");
    }

    public static String quote(String str) {
        String obj;
        StringWriter stringWriter = new StringWriter();
        synchronized (stringWriter.getBuffer()) {
            try {
                obj = quote(str, stringWriter).toString();
            } catch (IOException unused) {
                return "";
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public static Number stringToNumber(String str) throws NumberFormatException {
        char charAt = str.charAt(0);
        if ((charAt < '0' || charAt > '9') && charAt != '-') {
            throw new NumberFormatException(wj6.k("val [", str, "] is not a valid number."));
        } else if (!isDecimalNotation(str)) {
            BigInteger bigInteger = new BigInteger(str);
            return bigInteger.bitLength() <= 31 ? Integer.valueOf(bigInteger.intValue()) : bigInteger.bitLength() <= 63 ? Long.valueOf(bigInteger.longValue()) : bigInteger;
        } else if (str.length() > 14) {
            return new BigDecimal(str);
        } else {
            Double valueOf = Double.valueOf(str);
            return (valueOf.isInfinite() || valueOf.isNaN()) ? new BigDecimal(str) : valueOf;
        }
    }

    public static Object stringToValue(String str) {
        if ("".equals(str)) {
            return str;
        }
        if ("true".equalsIgnoreCase(str)) {
            return Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(str)) {
            return Boolean.FALSE;
        }
        if ("null".equalsIgnoreCase(str)) {
            return NULL;
        }
        char charAt = str.charAt(0);
        if ((charAt >= '0' && charAt <= '9') || charAt == '-') {
            try {
                if (isDecimalNotation(str)) {
                    Double valueOf = Double.valueOf(str);
                    return (valueOf.isInfinite() || valueOf.isNaN()) ? str : valueOf;
                }
                Long valueOf2 = Long.valueOf(str);
                if (str.equals(valueOf2.toString())) {
                    return valueOf2.longValue() == ((long) valueOf2.intValue()) ? Integer.valueOf(valueOf2.intValue()) : valueOf2;
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void testValidity(Object obj) throws JSONException {
        if (obj == null) {
            return;
        }
        if (obj instanceof Double) {
            Double d = (Double) obj;
            if (d.isInfinite() || d.isNaN()) {
                throw new JSONException("JSON does not allow non-finite numbers.");
            }
        } else if (obj instanceof Float) {
            Float f = (Float) obj;
            if (f.isInfinite() || f.isNaN()) {
                throw new JSONException("JSON does not allow non-finite numbers.");
            }
        }
    }

    public static String valueToString(Object obj) throws JSONException {
        return JSONWriter.valueToString(obj);
    }

    public static Object wrap(Object obj) {
        if (obj == null) {
            try {
                return NULL;
            } catch (Exception unused) {
                return null;
            }
        } else if ((obj instanceof JSONObject) || (obj instanceof JSONArray) || NULL.equals(obj) || (obj instanceof JSONString) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Boolean) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof String) || (obj instanceof BigInteger) || (obj instanceof BigDecimal)) {
            return obj;
        } else {
            if (obj instanceof Enum) {
                return obj;
            }
            if (obj instanceof Collection) {
                return new JSONArray((Collection<?>) (Collection) obj);
            }
            if (obj.getClass().isArray()) {
                return new JSONArray(obj);
            }
            if (obj instanceof Map) {
                return new JSONObject((Map<?, ?>) (Map) obj);
            }
            Package packageR = obj.getClass().getPackage();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.startsWith("java.") && !name.startsWith("javax.")) {
                if (obj.getClass().getClassLoader() != null) {
                    return new JSONObject(obj);
                }
            }
            return obj.toString();
        }
    }

    public static final Writer writeValue(Writer writer, Object obj, int i, int i2) throws JSONException, IOException {
        if (obj == null || obj.equals((Object) null)) {
            writer.write("null");
        } else if (obj instanceof JSONString) {
            try {
                String jSONString = ((JSONString) obj).toJSONString();
                writer.write(jSONString != null ? jSONString.toString() : quote(obj.toString()));
            } catch (Exception e) {
                throw new JSONException((Throwable) e);
            }
        } else if (obj instanceof Number) {
            String numberToString = numberToString((Number) obj);
            if (NUMBER_PATTERN.matcher(numberToString).matches()) {
                writer.write(numberToString);
            } else {
                quote(numberToString, writer);
            }
        } else if (obj instanceof Boolean) {
            writer.write(obj.toString());
        } else if (obj instanceof Enum) {
            writer.write(quote(((Enum) obj).name()));
        } else if (obj instanceof JSONObject) {
            ((JSONObject) obj).write(writer, i, i2);
        } else if (obj instanceof JSONArray) {
            ((JSONArray) obj).write(writer, i, i2);
        } else if (obj instanceof Map) {
            new JSONObject((Map<?, ?>) (Map) obj).write(writer, i, i2);
        } else if (obj instanceof Collection) {
            new JSONArray((Collection<?>) (Collection) obj).write(writer, i, i2);
        } else if (obj.getClass().isArray()) {
            new JSONArray(obj).write(writer, i, i2);
        } else {
            quote(obj.toString(), writer);
        }
        return writer;
    }

    private static JSONException wrongValueFormatException(String str, String str2, Throwable th) {
        return new JSONException("JSONObject[" + quote(str) + "] is not a " + str2 + ".", th);
    }

    public JSONObject accumulate(String str, Object obj) throws JSONException {
        testValidity(obj);
        Object opt = opt(str);
        if (opt == null) {
            if (obj instanceof JSONArray) {
                obj = new JSONArray().put(obj);
            }
            put(str, obj);
        } else if (opt instanceof JSONArray) {
            ((JSONArray) opt).put(obj);
        } else {
            put(str, (Object) new JSONArray().put(opt).put(obj));
        }
        return this;
    }

    public JSONObject append(String str, Object obj) throws JSONException {
        testValidity(obj);
        Object opt = opt(str);
        if (opt == null) {
            put(str, (Object) new JSONArray().put(obj));
        } else if (opt instanceof JSONArray) {
            put(str, (Object) ((JSONArray) opt).put(obj));
        } else {
            throw wrongValueFormatException(str, "JSONArray", (Object) null, (Throwable) null);
        }
        return this;
    }

    public Set<Map.Entry<String, Object>> entrySet() {
        return this.map.entrySet();
    }

    public Object get(String str) throws JSONException {
        if (str != null) {
            Object opt = opt(str);
            if (opt != null) {
                return opt;
            }
            throw new JSONException("JSONObject[" + quote(str) + "] not found.");
        }
        throw new JSONException("Null key.");
    }

    public BigDecimal getBigDecimal(String str) throws JSONException {
        Object obj = get(str);
        BigDecimal objectToBigDecimal = objectToBigDecimal(obj, (BigDecimal) null);
        if (objectToBigDecimal != null) {
            return objectToBigDecimal;
        }
        throw wrongValueFormatException(str, "BigDecimal", obj, (Throwable) null);
    }

    public BigInteger getBigInteger(String str) throws JSONException {
        Object obj = get(str);
        BigInteger objectToBigInteger = objectToBigInteger(obj, (BigInteger) null);
        if (objectToBigInteger != null) {
            return objectToBigInteger;
        }
        throw wrongValueFormatException(str, "BigInteger", obj, (Throwable) null);
    }

    public boolean getBoolean(String str) throws JSONException {
        Object obj = get(str);
        if (obj.equals(Boolean.FALSE)) {
            return false;
        }
        boolean z = obj instanceof String;
        if (z && ((String) obj).equalsIgnoreCase("false")) {
            return false;
        }
        if (obj.equals(Boolean.TRUE)) {
            return true;
        }
        if (z && ((String) obj).equalsIgnoreCase("true")) {
            return true;
        }
        throw wrongValueFormatException(str, "Boolean", (Throwable) null);
    }

    public double getDouble(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        try {
            return Double.parseDouble(obj.toString());
        } catch (Exception e) {
            throw wrongValueFormatException(str, "double", e);
        }
    }

    public <E extends Enum<E>> E getEnum(Class<E> cls, String str) throws JSONException {
        E optEnum = optEnum(cls, str);
        if (optEnum != null) {
            return optEnum;
        }
        throw wrongValueFormatException(str, "enum of type " + quote(cls.getSimpleName()), (Throwable) null);
    }

    public float getFloat(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).floatValue();
        }
        try {
            return Float.parseFloat(obj.toString());
        } catch (Exception e) {
            throw wrongValueFormatException(str, "float", e);
        }
    }

    public int getInt(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        try {
            return Integer.parseInt(obj.toString());
        } catch (Exception e) {
            throw wrongValueFormatException(str, "int", e);
        }
    }

    public JSONArray getJSONArray(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        throw wrongValueFormatException(str, "JSONArray", (Throwable) null);
    }

    public JSONObject getJSONObject(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        throw wrongValueFormatException(str, "JSONObject", (Throwable) null);
    }

    public long getLong(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        try {
            return Long.parseLong(obj.toString());
        } catch (Exception e) {
            throw wrongValueFormatException(str, "long", e);
        }
    }

    public Number getNumber(String str) throws JSONException {
        Object obj = get(str);
        try {
            return obj instanceof Number ? (Number) obj : stringToNumber(obj.toString());
        } catch (Exception e) {
            throw wrongValueFormatException(str, "number", e);
        }
    }

    public String getString(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw wrongValueFormatException(str, "string", (Throwable) null);
    }

    public boolean has(String str) {
        return this.map.containsKey(str);
    }

    public JSONObject increment(String str) throws JSONException {
        Object opt = opt(str);
        if (opt == null) {
            put(str, 1);
        } else if (opt instanceof Integer) {
            put(str, ((Integer) opt).intValue() + 1);
        } else if (opt instanceof Long) {
            put(str, ((Long) opt).longValue() + 1);
        } else if (opt instanceof BigInteger) {
            put(str, (Object) ((BigInteger) opt).add(BigInteger.ONE));
        } else if (opt instanceof Float) {
            put(str, ((Float) opt).floatValue() + 1.0f);
        } else if (opt instanceof Double) {
            put(str, ((Double) opt).doubleValue() + 1.0d);
        } else if (opt instanceof BigDecimal) {
            put(str, (Object) ((BigDecimal) opt).add(BigDecimal.ONE));
        } else {
            throw new JSONException("Unable to increment [" + quote(str) + "].");
        }
        return this;
    }

    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    public boolean isNull(String str) {
        return NULL.equals(opt(str));
    }

    public Set<String> keySet() {
        return this.map.keySet();
    }

    public Iterator<String> keys() {
        return keySet().iterator();
    }

    public int length() {
        return this.map.size();
    }

    public JSONArray names() {
        if (this.map.isEmpty()) {
            return null;
        }
        return new JSONArray((Collection<?>) this.map.keySet());
    }

    public Object opt(String str) {
        if (str == null) {
            return null;
        }
        return this.map.get(str);
    }

    public BigDecimal optBigDecimal(String str, BigDecimal bigDecimal) {
        return objectToBigDecimal(opt(str), bigDecimal);
    }

    public BigInteger optBigInteger(String str, BigInteger bigInteger) {
        return objectToBigInteger(opt(str), bigInteger);
    }

    public boolean optBoolean(String str) {
        return optBoolean(str, false);
    }

    public double optDouble(String str) {
        return optDouble(str, Double.NaN);
    }

    public <E extends Enum<E>> E optEnum(Class<E> cls, String str) {
        return optEnum(cls, str, (Enum) null);
    }

    public float optFloat(String str) {
        return optFloat(str, Float.NaN);
    }

    public int optInt(String str) {
        return optInt(str, 0);
    }

    public JSONArray optJSONArray(String str) {
        Object opt = opt(str);
        if (opt instanceof JSONArray) {
            return (JSONArray) opt;
        }
        return null;
    }

    public JSONObject optJSONObject(String str) {
        Object opt = opt(str);
        if (opt instanceof JSONObject) {
            return (JSONObject) opt;
        }
        return null;
    }

    public long optLong(String str) {
        return optLong(str, 0);
    }

    public Number optNumber(String str) {
        return optNumber(str, (Number) null);
    }

    public Object optQuery(String str) {
        return optQuery(new JSONPointer(str));
    }

    public String optString(String str) {
        return optString(str, "");
    }

    public JSONObject put(String str, boolean z) throws JSONException {
        return put(str, (Object) z ? Boolean.TRUE : Boolean.FALSE);
    }

    public JSONObject putOnce(String str, Object obj) throws JSONException {
        if (str == null || obj == null) {
            return this;
        }
        if (opt(str) == null) {
            return put(str, obj);
        }
        throw new JSONException(wj6.k("Duplicate key \"", str, "\""));
    }

    public JSONObject putOpt(String str, Object obj) throws JSONException {
        return (str == null || obj == null) ? this : put(str, obj);
    }

    public Object query(String str) {
        return query(new JSONPointer(str));
    }

    public Object remove(String str) {
        return this.map.remove(str);
    }

    public boolean similar(Object obj) {
        try {
            if (!(obj instanceof JSONObject) || !keySet().equals(((JSONObject) obj).keySet())) {
                return false;
            }
            for (Map.Entry next : entrySet()) {
                Object value = next.getValue();
                Object obj2 = ((JSONObject) obj).get((String) next.getKey());
                if (value != obj2) {
                    if (value == null) {
                        return false;
                    }
                    if (value instanceof JSONObject) {
                        if (!((JSONObject) value).similar(obj2)) {
                            return false;
                        }
                    } else if (value instanceof JSONArray) {
                        if (!((JSONArray) value).similar(obj2)) {
                            return false;
                        }
                    } else if (!value.equals(obj2)) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public JSONArray toJSONArray(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.isEmpty()) {
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            jSONArray2.put(opt(jSONArray.getString(i)));
        }
        return jSONArray2;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : entrySet()) {
            hashMap.put(next.getKey(), (next.getValue() == null || NULL.equals(next.getValue())) ? null : next.getValue() instanceof JSONObject ? ((JSONObject) next.getValue()).toMap() : next.getValue() instanceof JSONArray ? ((JSONArray) next.getValue()).toList() : next.getValue());
        }
        return hashMap;
    }

    public String toString() {
        try {
            return toString(0);
        } catch (Exception unused) {
            return null;
        }
    }

    public Writer write(Writer writer) throws JSONException {
        return write(writer, 0, 0);
    }

    public boolean optBoolean(String str, boolean z) {
        Object opt = opt(str);
        if (NULL.equals(opt)) {
            return z;
        }
        if (opt instanceof Boolean) {
            return ((Boolean) opt).booleanValue();
        }
        try {
            return getBoolean(str);
        } catch (Exception unused) {
            return z;
        }
    }

    public double optDouble(String str, double d) {
        Number optNumber = optNumber(str);
        if (optNumber == null) {
            return d;
        }
        return optNumber.doubleValue();
    }

    public <E extends Enum<E>> E optEnum(Class<E> cls, String str, E e) {
        try {
            E opt = opt(str);
            if (NULL.equals(opt)) {
                return e;
            }
            if (cls.isAssignableFrom(opt.getClass())) {
                return (Enum) opt;
            }
            return Enum.valueOf(cls, opt.toString());
        } catch (IllegalArgumentException | NullPointerException unused) {
            return e;
        }
    }

    public float optFloat(String str, float f) {
        Number optNumber = optNumber(str);
        if (optNumber == null) {
            return f;
        }
        return optNumber.floatValue();
    }

    public int optInt(String str, int i) {
        Number optNumber = optNumber(str, (Number) null);
        if (optNumber == null) {
            return i;
        }
        return optNumber.intValue();
    }

    public long optLong(String str, long j) {
        Number optNumber = optNumber(str, (Number) null);
        if (optNumber == null) {
            return j;
        }
        return optNumber.longValue();
    }

    public Number optNumber(String str, Number number) {
        Object opt = opt(str);
        if (NULL.equals(opt)) {
            return number;
        }
        if (opt instanceof Number) {
            return (Number) opt;
        }
        try {
            return stringToNumber(opt.toString());
        } catch (Exception unused) {
            return number;
        }
    }

    public Object optQuery(JSONPointer jSONPointer) {
        try {
            return jSONPointer.queryFrom(this);
        } catch (JSONPointerException unused) {
            return null;
        }
    }

    public String optString(String str, String str2) {
        Object opt = opt(str);
        return NULL.equals(opt) ? str2 : opt.toString();
    }

    public JSONObject put(String str, Collection<?> collection) throws JSONException {
        return put(str, (Object) new JSONArray(collection));
    }

    public Object query(JSONPointer jSONPointer) {
        return jSONPointer.queryFrom(this);
    }

    public String toString(int i) throws JSONException {
        String obj;
        StringWriter stringWriter = new StringWriter();
        synchronized (stringWriter.getBuffer()) {
            obj = write(stringWriter, i, 0).toString();
        }
        return obj;
    }

    public Writer write(Writer writer, int i, int i2) throws JSONException {
        String str;
        String str2;
        try {
            int length = length();
            writer.write(123);
            if (length == 1) {
                Map.Entry next = entrySet().iterator().next();
                str2 = (String) next.getKey();
                writer.write(quote(str2));
                writer.write(58);
                if (i > 0) {
                    writer.write(32);
                }
                writeValue(writer, next.getValue(), i, i2);
            } else if (length != 0) {
                int i3 = i2 + i;
                boolean z = false;
                for (Map.Entry next2 : entrySet()) {
                    if (z) {
                        writer.write(44);
                    }
                    if (i > 0) {
                        writer.write(10);
                    }
                    indent(writer, i3);
                    str = (String) next2.getKey();
                    writer.write(quote(str));
                    writer.write(58);
                    if (i > 0) {
                        writer.write(32);
                    }
                    writeValue(writer, next2.getValue(), i, i3);
                    z = true;
                }
                if (i > 0) {
                    writer.write(10);
                }
                indent(writer, i2);
            }
            writer.write(125);
            return writer;
        } catch (Exception e) {
            throw new JSONException("Unable to write JSONObject value for key: " + str, e);
        } catch (Exception e2) {
            throw new JSONException("Unable to write JSONObject value for key: " + str2, e2);
        } catch (IOException e3) {
            throw new JSONException((Throwable) e3);
        }
    }

    public JSONObject(JSONObject jSONObject, String... strArr) {
        this(strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            try {
                String str = strArr[i];
                putOnce(str, jSONObject.opt(str));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r4 = r4.getClass().getFields();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] getNames(java.lang.Object r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.Class r4 = r4.getClass()
            java.lang.reflect.Field[] r4 = r4.getFields()
            int r1 = r4.length
            if (r1 != 0) goto L_0x0010
            return r0
        L_0x0010:
            java.lang.String[] r0 = new java.lang.String[r1]
            r2 = 0
        L_0x0013:
            if (r2 >= r1) goto L_0x0020
            r3 = r4[r2]
            java.lang.String r3 = r3.getName()
            r0[r2] = r3
            int r2 = r2 + 1
            goto L_0x0013
        L_0x0020:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.JSONObject.getNames(java.lang.Object):java.lang.String[]");
    }

    private static JSONException wrongValueFormatException(String str, String str2, Object obj, Throwable th) {
        return new JSONException("JSONObject[" + quote(str) + "] is not a " + str2 + " (" + obj + ").", th);
    }

    public JSONObject put(String str, double d) throws JSONException {
        return put(str, (Object) Double.valueOf(d));
    }

    public JSONObject put(String str, float f) throws JSONException {
        return put(str, (Object) Float.valueOf(f));
    }

    public JSONObject put(String str, int i) throws JSONException {
        return put(str, (Object) Integer.valueOf(i));
    }

    public JSONObject(JSONTokener jSONTokener) throws JSONException {
        this();
        if (jSONTokener.nextClean() == '{') {
            while (true) {
                char nextClean = jSONTokener.nextClean();
                if (nextClean == 0) {
                    throw jSONTokener.syntaxError("A JSONObject text must end with '}'");
                } else if (nextClean != '}') {
                    jSONTokener.back();
                    String obj = jSONTokener.nextValue().toString();
                    if (jSONTokener.nextClean() == ':') {
                        if (obj != null) {
                            if (opt(obj) == null) {
                                Object nextValue = jSONTokener.nextValue();
                                if (nextValue != null) {
                                    put(obj, nextValue);
                                }
                            } else {
                                throw jSONTokener.syntaxError("Duplicate key \"" + obj + "\"");
                            }
                        }
                        char nextClean2 = jSONTokener.nextClean();
                        if (nextClean2 == ',' || nextClean2 == ';') {
                            if (jSONTokener.nextClean() != '}') {
                                jSONTokener.back();
                            } else {
                                return;
                            }
                        } else if (nextClean2 != '}') {
                            throw jSONTokener.syntaxError("Expected a ',' or '}'");
                        } else {
                            return;
                        }
                    } else {
                        throw jSONTokener.syntaxError("Expected a ':' after a key");
                    }
                } else {
                    return;
                }
            }
        } else {
            throw jSONTokener.syntaxError("A JSONObject text must begin with '{'");
        }
    }

    public static Writer quote(String str, Writer writer) throws IOException {
        if (str == null || str.isEmpty()) {
            writer.write("\"\"");
            return writer;
        }
        int length = str.length();
        writer.write(34);
        int i = 0;
        char c = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == 12) {
                writer.write("\\f");
            } else if (charAt != 13) {
                if (charAt != '\"') {
                    if (charAt != '/') {
                        if (charAt != '\\') {
                            switch (charAt) {
                                case 8:
                                    writer.write("\\b");
                                    break;
                                case 9:
                                    writer.write("\\t");
                                    break;
                                case 10:
                                    writer.write("\\n");
                                    break;
                                default:
                                    if (charAt >= ' ' && ((charAt < 128 || charAt >= 160) && (charAt < 8192 || charAt >= 8448))) {
                                        writer.write(charAt);
                                        break;
                                    } else {
                                        writer.write("\\u");
                                        String hexString = Integer.toHexString(charAt);
                                        writer.write("0000", 0, 4 - hexString.length());
                                        writer.write(hexString);
                                        break;
                                    }
                            }
                        }
                    } else {
                        if (c == '<') {
                            writer.write(92);
                        }
                        writer.write(charAt);
                    }
                }
                writer.write(92);
                writer.write(charAt);
            } else {
                writer.write("\\r");
            }
            i++;
            c = charAt;
        }
        writer.write(34);
        return writer;
    }

    public JSONObject put(String str, long j) throws JSONException {
        return put(str, (Object) Long.valueOf(j));
    }

    public JSONObject put(String str, Map<?, ?> map2) throws JSONException {
        return put(str, (Object) new JSONObject(map2));
    }

    public JSONObject put(String str, Object obj) throws JSONException {
        if (str != null) {
            if (obj != null) {
                testValidity(obj);
                this.map.put(str, obj);
            } else {
                remove(str);
            }
            return this;
        }
        throw new NullPointerException("Null key.");
    }

    public JSONObject(Map<?, ?> map2) {
        if (map2 == null) {
            this.map = new HashMap();
            return;
        }
        this.map = new HashMap(map2.size());
        for (Map.Entry next : map2.entrySet()) {
            if (next.getKey() != null) {
                Object value = next.getValue();
                if (value != null) {
                    this.map.put(String.valueOf(next.getKey()), wrap(value));
                }
            } else {
                throw new NullPointerException("Null key.");
            }
        }
    }

    public JSONObject(Object obj) {
        this();
        populateMap(obj);
    }

    public JSONObject(Object obj, String... strArr) {
        this(strArr.length);
        Class<?> cls = obj.getClass();
        for (String str : strArr) {
            try {
                putOpt(str, cls.getField(str).get(obj));
            } catch (Exception unused) {
            }
        }
    }

    public JSONObject(String str) throws JSONException {
        this(new JSONTokener(str));
    }

    public JSONObject(String str, Locale locale) throws JSONException {
        this();
        ResourceBundle bundle = ResourceBundle.getBundle(str, locale, Thread.currentThread().getContextClassLoader());
        Enumeration<String> keys = bundle.getKeys();
        while (keys.hasMoreElements()) {
            String nextElement = keys.nextElement();
            if (nextElement != null) {
                String str2 = nextElement;
                String[] split = str2.split("\\.");
                int length = split.length - 1;
                JSONObject jSONObject = this;
                for (int i = 0; i < length; i++) {
                    String str3 = split[i];
                    JSONObject optJSONObject = jSONObject.optJSONObject(str3);
                    if (optJSONObject == null) {
                        optJSONObject = new JSONObject();
                        jSONObject.put(str3, (Object) optJSONObject);
                    }
                    jSONObject = optJSONObject;
                }
                jSONObject.put(split[length], (Object) bundle.getString(str2));
            }
        }
    }

    public JSONObject(int i) {
        this.map = new HashMap(i);
    }
}
