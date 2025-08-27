package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import kotlin.uuid.Uuid;

/* renamed from: w8c  reason: default package */
public final class w8c implements eha {
    public static final Charset f = Charset.forName("UTF-8");
    public static final mk5 g;
    public static final mk5 h;
    public static final bp7 i = new bp7(1);
    public OutputStream a;
    public final Map b;
    public final Map c;
    public final dha d;
    public final x8c e = new x8c(this);

    static {
        Class<v8c> cls = v8c.class;
        g = new mk5("key", tr1.t(tr1.s(cls, new oy(1))));
        h = new mk5("value", tr1.t(tr1.s(cls, new oy(2))));
    }

    public w8c(ByteArrayOutputStream byteArrayOutputStream, Map map, Map map2, dha dha) {
        this.a = byteArrayOutputStream;
        this.b = map;
        this.c = map2;
        this.d = dha;
    }

    public static int g(mk5 mk5) {
        v8c v8c = (v8c) ((Annotation) mk5.b.get(v8c.class));
        if (v8c != null) {
            return ((oy) v8c).b;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final eha a(mk5 mk5, Object obj) {
        c(mk5, obj, true);
        return this;
    }

    public final void b(mk5 mk5, int i2, boolean z) {
        if (!z || i2 != 0) {
            v8c v8c = (v8c) ((Annotation) mk5.b.get(v8c.class));
            if (v8c != null) {
                h(((oy) v8c).b << 3);
                h(i2);
                return;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
    }

    public final void c(mk5 mk5, Object obj, boolean z) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    h((g(mk5) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f);
                    h(bytes.length);
                    this.a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object c2 : (Collection) obj) {
                    c(mk5, c2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry f2 : ((Map) obj).entrySet()) {
                    f(i, mk5, f2, false);
                }
            } else if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (!z || doubleValue != 0.0d) {
                    h((g(mk5) << 3) | 1);
                    this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
                }
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z || floatValue != c44.DEFAULT_ASPECT_RATIO) {
                    h((g(mk5) << 3) | 5);
                    this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z || longValue != 0) {
                    v8c v8c = (v8c) ((Annotation) mk5.b.get(v8c.class));
                    if (v8c != null) {
                        h(((oy) v8c).b << 3);
                        i(longValue);
                        return;
                    }
                    throw new RuntimeException("Field has no @Protobuf config");
                }
            } else if (obj instanceof Boolean) {
                b(mk5, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (!z || bArr.length != 0) {
                    h((g(mk5) << 3) | 2);
                    h(bArr.length);
                    this.a.write(bArr);
                }
            } else {
                dha dha = (dha) this.b.get(obj.getClass());
                if (dha != null) {
                    f(dha, mk5, obj, z);
                    return;
                }
                e1g e1g = (e1g) this.c.get(obj.getClass());
                if (e1g != null) {
                    x8c x8c = this.e;
                    x8c.a = false;
                    x8c.c = mk5;
                    x8c.b = z;
                    e1g.a(obj, x8c);
                } else if (obj instanceof s8c) {
                    b(mk5, ((s8c) obj).a(), true);
                } else if (obj instanceof Enum) {
                    b(mk5, ((Enum) obj).ordinal(), true);
                } else {
                    f(this.d, mk5, obj, z);
                }
            }
        }
    }

    public final eha d(mk5 mk5, int i2) {
        b(mk5, i2, true);
        return this;
    }

    public final eha e(mk5 mk5, long j) {
        if (j != 0) {
            v8c v8c = (v8c) ((Annotation) mk5.b.get(v8c.class));
            if (v8c != null) {
                h(((oy) v8c).b << 3);
                i(j);
            } else {
                throw new RuntimeException("Field has no @Protobuf config");
            }
        }
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.OutputStream, ut7] */
    public final void f(dha dha, mk5 mk5, Object obj, boolean z) {
        OutputStream outputStream;
        ? outputStream2 = new OutputStream();
        outputStream2.a = 0;
        try {
            outputStream = this.a;
            this.a = outputStream2;
            dha.a(obj, this);
            this.a = outputStream;
            long j = outputStream2.a;
            outputStream2.close();
            if (!z || j != 0) {
                h((g(mk5) << 3) | 2);
                i(j);
                dha.a(obj, this);
                return;
            }
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final void h(int i2) {
        while (((long) (i2 & -128)) != 0) {
            this.a.write((i2 & 127) | Uuid.SIZE_BITS);
            i2 >>>= 7;
        }
        this.a.write(i2 & 127);
    }

    public final void i(long j) {
        while ((-128 & j) != 0) {
            this.a.write((((int) j) & 127) | Uuid.SIZE_BITS);
            j >>>= 7;
        }
        this.a.write(((int) j) & 127);
    }
}
