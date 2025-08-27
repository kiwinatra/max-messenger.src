package defpackage;

import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: upg  reason: default package */
public abstract class upg {
    public static final Method a;
    public static final Method b;
    public static final Method c;
    public static final Method d;
    public static Boolean e = null;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Class<String> cls = String.class;
        Class<WorkSource> cls2 = WorkSource.class;
        Process.myUid();
        try {
            method = cls2.getMethod("add", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            method = null;
        }
        a = method;
        try {
            method2 = cls2.getMethod("add", new Class[]{Integer.TYPE, cls});
        } catch (Exception unused2) {
            method2 = null;
        }
        b = method2;
        try {
            method3 = cls2.getMethod("size", (Class[]) null);
        } catch (Exception unused3) {
            method3 = null;
        }
        c = method3;
        try {
            cls2.getMethod("get", new Class[]{Integer.TYPE});
        } catch (Exception unused4) {
        }
        try {
            cls2.getMethod("getName", new Class[]{Integer.TYPE});
        } catch (Exception unused5) {
        }
        try {
            cls2.getMethod("createWorkChain", (Class[]) null);
        } catch (Exception unused6) {
        }
        try {
            Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[]{Integer.TYPE, cls});
        } catch (Exception unused7) {
        }
        try {
            method4 = cls2.getMethod("isEmpty", (Class[]) null);
            try {
                method4.setAccessible(true);
            } catch (Exception unused8) {
            }
        } catch (Exception unused9) {
            method4 = null;
        }
        d = method4;
    }

    public static void a(WorkSource workSource, int i, String str) {
        Method method = b;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, new Object[]{Integer.valueOf(i), str});
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        } else {
            Method method2 = a;
            if (method2 != null) {
                try {
                    method2.invoke(workSource, new Object[]{Integer.valueOf(i)});
                } catch (Exception e3) {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
                }
            }
        }
    }
}
