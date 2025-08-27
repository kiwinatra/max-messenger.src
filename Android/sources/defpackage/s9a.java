package defpackage;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.UShort;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: s9a  reason: default package */
public final class s9a implements zi6, fc3, qk3, xxf, dz, b4d, e3f, pd8, wv9, y1c, x34, jaf {
    public static s9a b;
    public static final s9a c = new s9a(1, (byte) 0);
    public static final s9a o = new s9a(2, (byte) 0);
    public static final s9a v = new s9a(3, (byte) 0);
    public static final s9a w = new s9a(5, (byte) 0);
    public static final s9a x = new s9a(6, (byte) 0);
    public static s9a y;
    public final /* synthetic */ int a;

    public /* synthetic */ s9a(int i, byte b2) {
        this.a = i;
    }

    public static String f(short s) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("0x%s", Arrays.copyOf(new Object[]{Integer.toHexString(s & UShort.MAX_VALUE)}, 1));
    }

    public static s9a h(jm7[] jm7Arr) {
        if (jm7Arr.length <= 31) {
            int i = 0;
            for (jm7 jm7 : jm7Arr) {
                if (jm7.a()) {
                    i |= jm7.getMask();
                }
            }
            return new s9a(i);
        }
        throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", new Object[]{jm7Arr[0].getClass().getName(), Integer.valueOf(jm7Arr.length)}));
    }

    public static void i(String str, String str2, String str3) {
        if (str != null && StringsKt__StringsJVMKt.startsWith$default(str, "{", false, 2, (Object) null)) {
            try {
                j(new JSONObject(str), str2, str3);
            } catch (JSONException unused) {
            }
        }
    }

    public static void j(JSONObject jSONObject, String str, String str2) {
        JSONObject optJSONObject = jSONObject.optJSONObject("commands");
        if (optJSONObject != null) {
            long optLong = optJSONObject.optLong("tagShutdownMs");
            long optLong2 = optJSONObject.optLong("featureShutdownMs");
            Long valueOf = Long.valueOf(optJSONObject.optLong("globalShutdownMs"));
            Long valueOf2 = Long.valueOf(optLong2);
            Long valueOf3 = Long.valueOf(optLong);
            Map createMapBuilder = MapsKt.createMapBuilder();
            vzg.b(createMapBuilder, "system.shutdown.until.ts", valueOf);
            vzg.b(createMapBuilder, "system." + str + ".shutdown.until.ts", valueOf2);
            if (str2 != null) {
                vzg.b(createMapBuilder, "system." + str + '.' + str2 + ".shutdown.until.ts", valueOf3);
            }
            Map build = MapsKt.build(createMapBuilder);
            abe abe = pf6.o;
            if (abe != null) {
                AtomicReference atomicReference = (AtomicReference) abe.b.getValue();
                loop0:
                while (true) {
                    Map map = (Map) atomicReference.get();
                    Map mutableMap = MapsKt.toMutableMap(map);
                    for (Map.Entry entry : build.entrySet()) {
                        String str3 = (String) entry.getKey();
                        Object value = entry.getValue();
                        if (value == null) {
                            mutableMap.remove(str3);
                        } else {
                            mutableMap.put(str3, value);
                        }
                    }
                    while (true) {
                        if (atomicReference.compareAndSet(map, mutableMap)) {
                            break loop0;
                        } else if (atomicReference.get() != map) {
                        }
                    }
                }
                abe abe2 = pf6.o;
                if (abe2 != null) {
                    abe2.b();
                    return;
                }
                throw new IllegalStateException("Tracer settings are not initialized.");
            }
            throw new IllegalStateException("Tracer settings are not initialized.");
        }
    }

    public void a(int i, Serializable serializable) {
    }

    public void accept(Object obj) {
        List list = gvc.h;
        z68.f("gvc", "RECENT ADDED update handle fail", (Throwable) obj);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                jb1 jb1 = (jb1) obj;
                return new gb1(jb1.c, jb1.a, jb1.b);
            default:
                iu4 iu4 = (iu4) obj;
                iu4.getClass();
                return new qa3(2, new fc2(3, iu4));
        }
    }

    public void b(Object obj) {
        try {
            a43.a((Closeable) obj);
        } catch (IOException unused) {
        }
    }

    public f3f c(g5b g5b) {
        return new ef6((Context) g5b.c, (String) g5b.o, (ty) g5b.v, g5b.a, g5b.b);
    }

    public void d(String str, Throwable th) {
    }

    public Object e(reb reb) {
        return Integer.valueOf(reb.S0);
    }

    public Object g(soc soc) {
        return new y95((Executor) soc.g(new pac(pv7.class, Executor.class)));
    }

    public Object m(pf9 pf9) {
        return ryg.g0(pf9);
    }

    public /* synthetic */ s9a(int i, Object obj, Object obj2) {
        this.a = i;
    }

    public s9a(int i) {
        this.a = 13;
    }
}
