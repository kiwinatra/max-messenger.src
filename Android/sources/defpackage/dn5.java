package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: dn5  reason: default package */
public final class dn5 implements SharedPreferences {
    public static final Object h = new Object();
    public final en5 a;
    public final wie b;
    public final ez c;
    public qz9 d;
    public final Lazy e;
    public final Lazy f;
    public final Object g;

    public dn5(File file, en5 en5, fn5 fn5, wie wie) {
        this.a = en5;
        this.b = wie;
        File file2 = new File(file, tr1.j(StringsKt__StringsKt.removeSuffix(en5.a, (CharSequence) ".prefs"), ".prefs"));
        ez ezVar = new ez(file2, wie != null ? new lc5(7, (Object) this) : null);
        this.c = ezVar;
        this.d = new qz9(10);
        this.e = LazyKt.lazy(new j35(9, (Object) this, (Object) fn5));
        this.f = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new qr3(29));
        this.g = new Object();
        if (file2.exists()) {
            if (wie != null) {
                try {
                    wie.g0("read prefs from file");
                } catch (Throwable th) {
                    wie wie2 = this.b;
                    if (wie2 != null) {
                        z68.f(((y2) wie2.b).e, "read prefs from file failure", th);
                        return;
                    }
                    return;
                }
            }
            atc.a(ezVar, new r6(11, this));
        }
    }

    public final void a(rz9 rz9, boolean z, oz9 oz9) {
        rz9 rz92 = rz9;
        oz9 oz92 = oz9;
        if (rz92.d != 0) {
            if (oz92.b == 0 && !z) {
                return;
            }
            if (!Intrinsics.areEqual((Object) Looper.myLooper(), (Object) Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new bn5(0, this, rz9, oz9, z));
                return;
            }
            char c2 = 7;
            long j = -9187201950435737472L;
            if (z) {
                Object[] objArr = rz92.b;
                long[] jArr = rz92.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j2 = jArr[i];
                        if ((((~j2) << 7) & j2 & j) != j) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((j2 & 255) < 128) {
                                    ((SharedPreferences.OnSharedPreferenceChangeListener) objArr[(i << 3) + i3]).onSharedPreferenceChanged(this, (String) null);
                                }
                                j2 >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                        j = -9187201950435737472L;
                    }
                }
            }
            Object[] objArr2 = oz92.a;
            int i4 = oz92.b - 1;
            while (-1 < i4) {
                String str = (String) objArr2[i4];
                Object[] objArr3 = rz92.b;
                long[] jArr2 = rz92.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j3 = jArr2[i5];
                        if ((((~j3) << c2) & j3 & -9187201950435737472L) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j3 & 255) < 128) {
                                    ((SharedPreferences.OnSharedPreferenceChangeListener) objArr3[(i5 << 3) + i7]).onSharedPreferenceChanged(this, str);
                                }
                                j3 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length2) {
                            break;
                        }
                        i5++;
                        c2 = 7;
                    }
                }
                i4--;
                c2 = 7;
            }
        }
    }

    public final boolean contains(String str) {
        return this.d.a(str);
    }

    public final SharedPreferences.Editor edit() {
        en5 en5 = this.a;
        wie wie = this.b;
        if (wie != null) {
            en5.getClass();
            k63 k63 = k63.a;
            wie.g0("edit: strategy = " + k63);
        }
        en5.getClass();
        k63 k632 = k63.a;
        return new cn5(this);
    }

    public final Map getAll() {
        HashMap hashMap = new HashMap(this.d.e);
        qz9 qz9 = this.d;
        Object[] objArr = qz9.b;
        Object[] objArr2 = qz9.c;
        long[] jArr = qz9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            hashMap.put((String) objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return hashMap;
    }

    public final boolean getBoolean(String str, boolean z) {
        Object c2 = this.d.c(str);
        Boolean bool = c2 instanceof Boolean ? (Boolean) c2 : null;
        return bool != null ? bool.booleanValue() : z;
    }

    public final float getFloat(String str, float f2) {
        Object c2 = this.d.c(str);
        Float f3 = c2 instanceof Float ? (Float) c2 : null;
        return f3 != null ? f3.floatValue() : f2;
    }

    public final int getInt(String str, int i) {
        Object c2 = this.d.c(str);
        Integer num = c2 instanceof Integer ? (Integer) c2 : null;
        return num != null ? num.intValue() : i;
    }

    public final long getLong(String str, long j) {
        Object c2 = this.d.c(str);
        Long l = c2 instanceof Long ? (Long) c2 : null;
        return l != null ? l.longValue() : j;
    }

    public final String getString(String str, String str2) {
        Object c2 = this.d.c(str);
        String str3 = c2 instanceof String ? (String) c2 : null;
        return str3 == null ? str2 : str3;
    }

    public final Set getStringSet(String str, Set set) {
        Object c2 = this.d.c(str);
        Set set2 = c2 instanceof Set ? (Set) c2 : null;
        return set2 == null ? set : set2;
    }

    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.g) {
            ((WeakHashMap) this.f.getValue()).put(onSharedPreferenceChangeListener, h);
        }
    }

    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.g) {
            ((WeakHashMap) this.f.getValue()).remove(onSharedPreferenceChangeListener);
        }
    }
}
