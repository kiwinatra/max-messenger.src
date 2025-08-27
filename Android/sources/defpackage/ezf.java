package defpackage;

import java.io.File;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: ezf  reason: default package */
public final class ezf {
    public HashSet a;

    public static void a(HashSet hashSet, String str) {
        if (!cvg.A(str)) {
            hashSet.add(new File(str));
        }
    }

    public final boolean b(File file) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((File) it.next()).equals(file)) {
                z68.c("ezf", "canBeRemoved: skip file: %s", file);
                return false;
            }
        }
        return true;
    }
}
