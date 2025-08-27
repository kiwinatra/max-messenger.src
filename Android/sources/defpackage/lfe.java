package defpackage;

import android.content.Context;

/* renamed from: lfe  reason: default package */
public final class lfe extends mfe {
    /* JADX WARNING: type inference failed for: r4v1, types: [lfe, mfe] */
    public static lfe a(String str, Context context, nfe[] nfeArr) {
        StringBuilder p = tr1.p("couldn't find DSO to load: ", str, "\n\texisting SO sources: ");
        for (int i = 0; i < nfeArr.length; i++) {
            p.append("\n\t\tSoSource ");
            p.append(i);
            p.append(": ");
            p.append(nfeArr[i].toString());
        }
        if (context != null) {
            p.append("\n\tNative lib dir: ");
            p.append(context.getApplicationInfo().nativeLibraryDir);
            p.append("\n");
        }
        return new mfe(str, p.toString());
    }
}
