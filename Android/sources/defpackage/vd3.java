package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Debug;
import java.io.File;
import java.lang.Thread;
import java.nio.charset.Charset;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: vd3  reason: default package */
public final /* synthetic */ class vd3 implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ int a;

    public /* synthetic */ vd3(int i) {
        this.a = i;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        Context context;
        String str;
        switch (this.a) {
            case 0:
                ((uta) sjd.a.l()).c(th, false);
                return;
        }
        while (!(th instanceof OutOfMemoryError)) {
            Throwable cause = th.getCause();
            if (cause != null && cause != th) {
                th = cause;
            } else {
                return;
            }
        }
        rx6 rx6 = rx6.a;
        if (!kof.b && (context = rx6.c) != null && rx6.b.getAndSet(false)) {
            gy8 gy8 = kof.c;
            if (gy8 == null) {
                gy8 = null;
            }
            String str2 = (String) gy8.c;
            String r = o54.r();
            if (Intrinsics.areEqual((Object) r, (Object) context.getPackageName())) {
                str = "tracer";
            } else {
                str = "tracer-" + Uri.encode(StringsKt__StringsJVMKt.replace$default(r, ':', '-', false, 4, (Object) null));
            }
            File file = new File(context.getCacheDir(), str);
            File resolve = FilesKt.resolve(file, "dump-tmp.hprof");
            File resolve2 = FilesKt.resolve(file, "dump-tmp-meta.json");
            try {
                f6e.y(file);
                Debug.dumpHprofData(resolve.getAbsolutePath());
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("buildUuid", (Object) str2);
                jSONObject.put("tag", (Object) null);
                FilesKt__FileReadWriteKt.writeText$default(resolve2, jSONObject.toString(), (Charset) null, 2, (Object) null);
            } catch (Exception unused) {
                rx6.a(resolve);
                rx6.a(resolve2);
            }
            File resolve3 = FilesKt.resolve(file, "dump.hprof");
            File resolve4 = FilesKt.resolve(file, "dump-meta.json");
            try {
                if (resolve3.exists()) {
                    f6e.m(resolve3);
                }
                if (resolve4.exists()) {
                    f6e.m(resolve4);
                }
                f6e.B(resolve, resolve3);
                f6e.B(resolve2, resolve4);
            } catch (Exception unused2) {
                rx6.a(resolve3);
                rx6.a(resolve4);
            }
        }
    }
}
