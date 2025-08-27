package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: xp7  reason: default package */
public final class xp7 implements eha, f1g {
    public final boolean a = true;
    public final JsonWriter b;
    public final Map c;
    public final Map d;
    public final dha e;
    public final boolean f;

    public xp7(BufferedWriter bufferedWriter, HashMap hashMap, HashMap hashMap2, bp7 bp7, boolean z) {
        this.b = new JsonWriter(bufferedWriter);
        this.c = hashMap;
        this.d = hashMap2;
        this.e = bp7;
        this.f = z;
    }

    public final eha a(mk5 mk5, Object obj) {
        g(obj, mk5.a);
        return this;
    }

    public final f1g b(String str) {
        h();
        this.b.value(str);
        return this;
    }

    public final f1g c(boolean z) {
        h();
        this.b.value(z);
        return this;
    }

    public final eha d(mk5 mk5, int i) {
        String str = mk5.a;
        h();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        h();
        jsonWriter.value((long) i);
        return this;
    }

    public final eha e(mk5 mk5, long j) {
        String str = mk5.a;
        h();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(j);
        return this;
    }

    public final void f(Object obj) {
        JsonWriter jsonWriter = this.b;
        if (obj == null) {
            jsonWriter.nullValue();
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                h();
                jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                return;
            }
            jsonWriter.beginArray();
            int i = 0;
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i < length) {
                    jsonWriter.value((long) iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    long j = jArr[i];
                    h();
                    jsonWriter.value(j);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    jsonWriter.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    jsonWriter.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                Number[] numberArr = (Number[]) obj;
                int length5 = numberArr.length;
                while (i < length5) {
                    f(numberArr[i]);
                    i++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length6 = objArr.length;
                while (i < length6) {
                    f(objArr[i]);
                    i++;
                }
            }
            jsonWriter.endArray();
        } else if (obj instanceof Collection) {
            jsonWriter.beginArray();
            for (Object f2 : (Collection) obj) {
                f(f2);
            }
            jsonWriter.endArray();
        } else if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    g(entry.getValue(), (String) key);
                } catch (ClassCastException e2) {
                    throw new RuntimeException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e2);
                }
            }
            jsonWriter.endObject();
        } else {
            dha dha = (dha) this.c.get(obj.getClass());
            if (dha != null) {
                jsonWriter.beginObject();
                dha.a(obj, this);
                jsonWriter.endObject();
                return;
            }
            e1g e1g = (e1g) this.d.get(obj.getClass());
            if (e1g != null) {
                e1g.a(obj, this);
            } else if (obj instanceof Enum) {
                String name = ((Enum) obj).name();
                h();
                jsonWriter.value(name);
            } else {
                jsonWriter.beginObject();
                this.e.a(obj, this);
                jsonWriter.endObject();
            }
        }
    }

    public final void g(Object obj, String str) {
        boolean z = this.f;
        JsonWriter jsonWriter = this.b;
        if (!z) {
            h();
            jsonWriter.name(str);
            if (obj == null) {
                jsonWriter.nullValue();
            } else {
                f(obj);
            }
        } else if (obj != null) {
            h();
            jsonWriter.name(str);
            f(obj);
        }
    }

    public final void h() {
        if (!this.a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
