package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;

/* renamed from: kl  reason: default package */
public final class kl {
    public static final Regex b = new Regex("main-([0-9]+)\\.txt");
    public final Context a;

    public kl(int i, Context context) {
        this.a = context;
        RangesKt.coerceIn(i, 1, 100);
    }

    public final File a() {
        String str;
        String r = o54.r();
        Context context = this.a;
        if (Intrinsics.areEqual((Object) r, (Object) context.getPackageName())) {
            str = "tracer";
        } else {
            str = "tracer-" + Uri.encode(StringsKt__StringsJVMKt.replace$default(r, ':', '-', false, 4, (Object) null));
        }
        return FilesKt.resolve(new File(context.getCacheDir(), str), "main_snapshots");
    }
}
