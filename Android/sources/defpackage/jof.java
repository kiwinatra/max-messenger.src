package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.ok.android.externcalls.BuildConfig;

/* renamed from: jof  reason: default package */
public final class jof extends Lambda implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jof(Context context, int i) {
        super(0);
        this.a = i;
        this.b = context;
    }

    public final Object invoke() {
        String str;
        switch (this.a) {
            case 0:
                String r = o54.r();
                Context context = this.b;
                if (Intrinsics.areEqual((Object) r, (Object) context.getPackageName())) {
                    str = "tracer";
                } else {
                    str = "tracer-" + Uri.encode(StringsKt__StringsJVMKt.replace$default(r, ':', '-', false, 4, (Object) null));
                }
                File file = new File(context.getCacheDir(), str);
                f6e.y(file);
                return FilesKt.resolve(file, "settings.data");
            default:
                Context applicationContext = this.b.getApplicationContext();
                vof vof = new vof();
                m61.Z.invoke(vof);
                xof xof = new xof(applicationContext, BuildConfig.LIBRARY_PACKAGE_NAME, new xe8(vof));
                xof.b("calls-sdk-version", "125.1.0.48");
                return xof;
        }
    }
}
