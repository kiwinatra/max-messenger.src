package org.json;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class JSONArray implements Iterable<Object> {
    private final ArrayList<Object> myArrayList;

    public JSONArray() {
        this.myArrayList = new ArrayList<>();
    }

    private static JSONException wrongValueFormatException(int i, String str, Throwable th) {
        return new JSONException("JSONArray[" + i + "] is not a " + str + ".", th);
    }

    public Object get(int i) throws JSONException {
        Object opt = opt(i);
        if (opt != null) {
            return opt;
        }
        throw new JSONException(a81.j(i, "JSONArray[", "] not found."));
    }

    public BigDecimal getBigDecimal(int i) throws JSONException {
        Object obj = get(i);
        BigDecimal objectToBigDecimal = JSONObject.objectToBigDecimal(obj, (BigDecimal) null);
        if (objectToBigDecimal != null) {
            return objectToBigDecimal;
        }
        throw wrongValueFormatException(i, "BigDecimal", obj, (Throwable) null);
    }

    public BigInteger getBigInteger(int i) throws JSONException {
        Object obj = get(i);
        BigInteger objectToBigInteger = JSONObject.objectToBigInteger(obj, (BigInteger) null);
        if (objectToBigInteger != null) {
            return objectToBigInteger;
        }
        throw wrongValueFormatException(i, "BigInteger", obj, (Throwable) null);
    }

    public boolean getBoolean(int i) throws JSONException {
        Object obj = get(i);
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
        throw wrongValueFormatException(i, "boolean", (Throwable) null);
    }

    public double getDouble(int i) throws JSONException {
        Object obj = get(i);
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        try {
            return Double.parseDouble(obj.toString());
        } catch (Exception e) {
            throw wrongValueFormatException(i, "double", e);
        }
    }

    public <E extends Enum<E>> E getEnum(Class<E> cls, int i) throws JSONException {
        E optEnum = optEnum(cls, i);
        if (optEnum != null) {
            return optEnum;
        }
        throw wrongValueFormatException(i, "enum of type " + JSONObject.quote(cls.getSimpleName()), (Throwable) null);
    }

    public float getFloat(int i) throws JSONException {
        Object obj = get(i);
        if (obj instanceof Number) {
            return ((Float) obj).floatValue();
        }
        try {
            return Float.parseFloat(obj.toString());
        } catch (Exception e) {
            throw wrongValueFormatException(i, "float", e);
        }
    }

    public int getInt(int i) throws JSONException {
        Object obj = get(i);
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        try {
            return Integer.parseInt(obj.toString());
        } catch (Exception e) {
            throw wrongValueFormatException(i, "int", e);
        }
    }

    public JSONArray getJSONArray(int i) throws JSONException {
        Object obj = get(i);
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        throw wrongValueFormatException(i, "JSONArray", (Throwable) null);
    }

    public JSONObject getJSONObject(int i) throws JSONException {
        Object obj = get(i);
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        throw wrongValueFormatException(i, "JSONObject", (Throwable) null);
    }

    public long getLong(int i) throws JSONException {
        Object obj = get(i);
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        try {
            return Long.parseLong(obj.toString());
        } catch (Exception e) {
            throw wrongValueFormatException(i, "long", e);
        }
    }

    public Number getNumber(int i) throws JSONException {
        Object obj = get(i);
        try {
            return obj instanceof Number ? (Number) obj : JSONObject.stringToNumber(obj.toString());
        } catch (Exception e) {
            throw wrongValueFormatException(i, "number", e);
        }
    }

    public String getString(int i) throws JSONException {
        Object obj = get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw wrongValueFormatException(i, "String", (Throwable) null);
    }

    public boolean isEmpty() {
        return this.myArrayList.isEmpty();
    }

    public boolean isNull(int i) {
        return JSONObject.NULL.equals(opt(i));
    }

    public Iterator<Object> iterator() {
        return this.myArrayList.iterator();
    }

    public String join(String str) throws JSONException {
        int length = length();
        if (length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(JSONObject.valueToString(this.myArrayList.get(0)));
        for (int i = 1; i < length; i++) {
            sb.append(str);
            sb.append(JSONObject.valueToString(this.myArrayList.get(i)));
        }
        return sb.toString();
    }

    public int length() {
        return this.myArrayList.size();
    }

    public Object opt(int i) {
        if (i < 0 || i >= length()) {
            return null;
        }
        return this.myArrayList.get(i);
    }

    public BigDecimal optBigDecimal(int i, BigDecimal bigDecimal) {
        return JSONObject.objectToBigDecimal(opt(i), bigDecimal);
    }

    public BigInteger optBigInteger(int i, BigInteger bigInteger) {
        return JSONObject.objectToBigInteger(opt(i), bigInteger);
    }

    public boolean optBoolean(int i) {
        return optBoolean(i, false);
    }

    public double optDouble(int i) {
        return optDouble(i, Double.NaN);
    }

    public <E extends Enum<E>> E optEnum(Class<E> cls, int i) {
        return optEnum(cls, i, (Enum) null);
    }

    public float optFloat(int i) {
        return optFloat(i, Float.NaN);
    }

    public int optInt(int i) {
        return optInt(i, 0);
    }

    public JSONArray optJSONArray(int i) {
        Object opt = opt(i);
        if (opt instanceof JSONArray) {
            return (JSONArray) opt;
        }
        return null;
    }

    public JSONObject optJSONObject(int i) {
        Object opt = opt(i);
        if (opt instanceof JSONObject) {
            return (JSONObject) opt;
        }
        return null;
    }

    public long optLong(int i) {
        return optLong(i, 0);
    }

    public Number optNumber(int i) {
        return optNumber(i, (Number) null);
    }

    public Object optQuery(String str) {
        return optQuery(new JSONPointer(str));
    }

    public String optString(int i) {
        return optString(i, "");
    }

    public JSONArray put(boolean z) {
        return put((Object) z ? Boolean.TRUE : Boolean.FALSE);
    }

    public Object query(String str) {
        return query(new JSONPointer(str));
    }

    public Object remove(int i) {
        if (i < 0 || i >= length()) {
            return null;
        }
        return this.myArrayList.remove(i);
    }

    public boolean similar(Object obj) {
        if (!(obj instanceof JSONArray)) {
            return false;
        }
        int length = length();
        JSONArray jSONArray = (JSONArray) obj;
        if (length != jSONArray.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            Object obj2 = this.myArrayList.get(i);
            Object obj3 = jSONArray.myArrayList.get(i);
            if (obj2 != obj3) {
                if (obj2 == null) {
                    return false;
                }
                if (obj2 instanceof JSONObject) {
                    if (!((JSONObject) obj2).similar(obj3)) {
                        return false;
                    }
                } else if (obj2 instanceof JSONArray) {
                    if (!((JSONArray) obj2).similar(obj3)) {
                        return false;
                    }
                } else if (!obj2.equals(obj3)) {
                    return false;
                }
            }
        }
        return true;
    }

    public JSONObject toJSONObject(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.isEmpty() || isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            jSONObject.put(jSONArray.getString(i), opt(i));
        }
        return jSONObject;
    }

    public List<Object> toList() {
        ArrayList arrayList = new ArrayList(this.myArrayList.size());
        Iterator<Object> it = this.myArrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next == null || JSONObject.NULL.equals(next)) {
                arrayList.add((Object) null);
            } else if (next instanceof JSONArray) {
                arrayList.add(((JSONArray) next).toList());
            } else if (next instanceof JSONObject) {
                arrayList.add(((JSONObject) next).toMap());
            } else {
                arrayList.add(next);
            }
        }
        return arrayList;
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

    private static JSONException wrongValueFormatException(int i, String str, Object obj, Throwable th) {
        return new JSONException("JSONArray[" + i + "] is not a " + str + " (" + obj + ").", th);
    }

    public boolean optBoolean(int i, boolean z) {
        try {
            return getBoolean(i);
        } catch (Exception unused) {
            return z;
        }
    }

    public double optDouble(int i, double d) {
        Number optNumber = optNumber(i, (Number) null);
        if (optNumber == null) {
            return d;
        }
        return optNumber.doubleValue();
    }

    public <E extends Enum<E>> E optEnum(Class<E> cls, int i, E e) {
        try {
            E opt = opt(i);
            if (JSONObject.NULL.equals(opt)) {
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

    public float optFloat(int i, float f) {
        Number optNumber = optNumber(i, (Number) null);
        if (optNumber == null) {
            return f;
        }
        return optNumber.floatValue();
    }

    public int optInt(int i, int i2) {
        Number optNumber = optNumber(i, (Number) null);
        if (optNumber == null) {
            return i2;
        }
        return optNumber.intValue();
    }

    public long optLong(int i, long j) {
        Number optNumber = optNumber(i, (Number) null);
        if (optNumber == null) {
            return j;
        }
        return optNumber.longValue();
    }

    public Number optNumber(int i, Number number) {
        Object opt = opt(i);
        if (JSONObject.NULL.equals(opt)) {
            return number;
        }
        if (opt instanceof Number) {
            return (Number) opt;
        }
        if (opt instanceof String) {
            try {
                return JSONObject.stringToNumber((String) opt);
            } catch (Exception unused) {
            }
        }
        return number;
    }

    public Object optQuery(JSONPointer jSONPointer) {
        try {
            return jSONPointer.queryFrom(this);
        } catch (JSONPointerException unused) {
            return null;
        }
    }

    public String optString(int i, String str) {
        Object opt = opt(i);
        return JSONObject.NULL.equals(opt) ? str : opt.toString();
    }

    public JSONArray put(Collection<?> collection) {
        return put((Object) new JSONArray(collection));
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
        int i3;
        try {
            int length = length();
            writer.write(91);
            i3 = 0;
            if (length == 1) {
                JSONObject.writeValue(writer, this.myArrayList.get(0), i, i2);
            } else if (length != 0) {
                int i4 = i2 + i;
                boolean z = false;
                while (i3 < length) {
                    if (z) {
                        writer.write(44);
                    }
                    if (i > 0) {
                        writer.write(10);
                    }
                    JSONObject.indent(writer, i4);
                    JSONObject.writeValue(writer, this.myArrayList.get(i3), i, i4);
                    i3++;
                    z = true;
                }
                if (i > 0) {
                    writer.write(10);
                }
                JSONObject.indent(writer, i2);
            }
            writer.write(93);
            return writer;
        } catch (Exception e) {
            throw new JSONException("Unable to write JSONArray value at index: " + i3, e);
        } catch (Exception e2) {
            throw new JSONException("Unable to write JSONArray value at index: 0", e2);
        } catch (IOException e3) {
            throw new JSONException((Throwable) e3);
        }
    }

    public JSONArray(JSONTokener jSONTokener) throws JSONException {
        this();
        if (jSONTokener.nextClean() == '[') {
            char nextClean = jSONTokener.nextClean();
            if (nextClean == 0) {
                throw jSONTokener.syntaxError("Expected a ',' or ']'");
            } else if (nextClean != ']') {
                jSONTokener.back();
                while (true) {
                    if (jSONTokener.nextClean() == ',') {
                        jSONTokener.back();
                        this.myArrayList.add(JSONObject.NULL);
                    } else {
                        jSONTokener.back();
                        this.myArrayList.add(jSONTokener.nextValue());
                    }
                    char nextClean2 = jSONTokener.nextClean();
                    if (nextClean2 == 0) {
                        throw jSONTokener.syntaxError("Expected a ',' or ']'");
                    } else if (nextClean2 == ',') {
                        char nextClean3 = jSONTokener.nextClean();
                        if (nextClean3 == 0) {
                            throw jSONTokener.syntaxError("Expected a ',' or ']'");
                        } else if (nextClean3 != ']') {
                            jSONTokener.back();
                        } else {
                            return;
                        }
                    } else if (nextClean2 != ']') {
                        throw jSONTokener.syntaxError("Expected a ',' or ']'");
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw jSONTokener.syntaxError("A JSONArray text must start with '['");
        }
    }

    public JSONArray put(double d) throws JSONException {
        return put((Object) Double.valueOf(d));
    }

    public JSONArray put(float f) throws JSONException {
        return put((Object) Float.valueOf(f));
    }

    public JSONArray put(int i) {
        return put((Object) Integer.valueOf(i));
    }

    public JSONArray put(long j) {
        return put((Object) Long.valueOf(j));
    }

    public JSONArray put(Map<?, ?> map) {
        return put((Object) new JSONObject(map));
    }

    public JSONArray put(Object obj) {
        JSONObject.testValidity(obj);
        this.myArrayList.add(obj);
        return this;
    }

    public JSONArray put(int i, boolean z) throws JSONException {
        return put(i, (Object) z ? Boolean.TRUE : Boolean.FALSE);
    }

    public JSONArray put(int i, Collection<?> collection) throws JSONException {
        return put(i, (Object) new JSONArray(collection));
    }

    public JSONArray put(int i, double d) throws JSONException {
        return put(i, (Object) Double.valueOf(d));
    }

    public JSONArray put(int i, float f) throws JSONException {
        return put(i, (Object) Float.valueOf(f));
    }

    public JSONArray put(int i, int i2) throws JSONException {
        return put(i, (Object) Integer.valueOf(i2));
    }

    public JSONArray put(int i, long j) throws JSONException {
        return put(i, (Object) Long.valueOf(j));
    }

    public JSONArray put(int i, Map<?, ?> map) throws JSONException {
        put(i, (Object) new JSONObject(map));
        return this;
    }

    public JSONArray put(int i, Object obj) throws JSONException {
        if (i < 0) {
            throw new JSONException(a81.j(i, "JSONArray[", "] not found."));
        } else if (i < length()) {
            JSONObject.testValidity(obj);
            this.myArrayList.set(i, obj);
            return this;
        } else if (i == length()) {
            return put(obj);
        } else {
            this.myArrayList.ensureCapacity(i + 1);
            while (i != length()) {
                this.myArrayList.add(JSONObject.NULL);
            }
            return put(obj);
        }
    }

    public JSONArray(String str) throws JSONException {
        this(new JSONTokener(str));
    }

    public JSONArray(Collection<?> collection) {
        if (collection == null) {
            this.myArrayList = new ArrayList<>();
            return;
        }
        this.myArrayList = new ArrayList<>(collection.size());
        for (Object wrap : collection) {
            this.myArrayList.add(JSONObject.wrap(wrap));
        }
    }

    public JSONArray(Object obj) throws JSONException {
        this();
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            this.myArrayList.ensureCapacity(length);
            for (int i = 0; i < length; i++) {
                put(JSONObject.wrap(Array.get(obj, i)));
            }
            return;
        }
        throw new JSONException("JSONArray initial value should be a string or collection or array.");
    }
}
