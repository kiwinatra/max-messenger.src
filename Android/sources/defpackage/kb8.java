package defpackage;

import java.io.File;
import java.io.FileFilter;

/* renamed from: kb8  reason: default package */
public final /* synthetic */ class kb8 implements FileFilter {
    public final /* synthetic */ String a;

    public /* synthetic */ kb8(String str) {
        this.a = str;
    }

    public final boolean accept(File file) {
        String name = file.getName();
        if (name == null || name.length() == 0) {
            return false;
        }
        return StringsKt__StringsJVMKt.startsWith$default(name, this.a, false, 2, (Object) null);
    }
}
