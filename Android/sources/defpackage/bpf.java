package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.tracer.minidump.Minidump;

/* renamed from: bpf  reason: default package */
public abstract class bpf {
    public static boolean a() {
        if (Intrinsics.areEqual((Object) null, (Object) Boolean.FALSE)) {
            return false;
        }
        try {
            Minidump.getInstance();
            return true;
        } catch (Throwable unused) {
            Intrinsics.areEqual((Object) null, (Object) Boolean.TRUE);
            return false;
        }
    }

    public static void b(Context context) {
        String str;
        try {
            String r = o54.r();
            if (Intrinsics.areEqual((Object) r, (Object) context.getPackageName())) {
                str = "tracer";
            } else {
                str = "tracer-" + Uri.encode(StringsKt__StringsJVMKt.replace$default(r, ':', '-', false, 4, (Object) null));
            }
            File resolve = FilesKt.resolve(new File(context.getCacheDir(), str), "minidump");
            f6e.y(resolve);
            Minidump.getInstance().installMinidumpWriter(resolve.getPath());
        } catch (Throwable unused) {
        }
    }
}
