package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;

/* renamed from: ee  reason: default package */
public final class ee implements y47 {
    public static final Pattern d = Pattern.compile("^bytes \\*/([0-9]+)");
    public static final Pattern e = Pattern.compile(".*filename=\".*\\.(\\w+)\".*");
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final Lazy b;
    public final yqf c;

    public ee(Lazy lazy, yqf yqf) {
        this.b = lazy;
        this.c = yqf;
    }

    public static boolean d(ee eeVar, k4d k4d, long j) {
        eeVar.getClass();
        if (k4d.o != 416) {
            return false;
        }
        String b2 = k4d.w.b("Content-Range");
        if (b2 == null) {
            b2 = null;
        }
        if (b2 == null) {
            return false;
        }
        Matcher matcher = d.matcher(b2);
        return matcher.find() && ((long) Integer.parseInt(matcher.group(1))) == j;
    }

    public static File e(ee eeVar, File file, File file2, String str) {
        File file3;
        eeVar.getClass();
        try {
            if (!cvg.A(str)) {
                String name = file2.getName();
                int m = StringsKt__StringsKt.lastIndexOf$default((CharSequence) name, '.', 0, false, 6, (Object) null);
                if (m >= 0) {
                    name = name.substring(0, m);
                }
                file2 = new File(file2.getParentFile(), name + "." + str);
            }
            file3 = wc8.p(file2.getParentFile(), file2.getName());
            try {
                j4b.m(file, file3);
                file.delete();
            } catch (IOException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            e = e3;
            file3 = null;
            z68.f("ee", e.getMessage(), (Throwable) null);
            return file3;
        }
        return file3;
    }

    public static String f(ee eeVar, k4d k4d) {
        eeVar.getClass();
        String b2 = k4d.w.b("Content-Disposition");
        if (b2 == null) {
            b2 = null;
        }
        if (cvg.A(b2)) {
            return null;
        }
        Matcher matcher = e.matcher(b2);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    public static void g(ee eeVar, de deVar, String str) {
        eeVar.getClass();
        synchronized (deVar.a) {
            deVar.a.clear();
        }
        eeVar.a.remove(str);
    }

    public static void h(ee eeVar, de deVar, File file) {
        eeVar.getClass();
        file.delete();
        synchronized (deVar.a) {
            try {
                Iterator it = deVar.a.iterator();
                while (it.hasNext()) {
                    ((v47) it.next()).d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static File i(File file, String str) {
        String parent = file.getParent();
        return new File(parent, file.getName() + "_part_" + str);
    }

    public final void a(File file, String str) {
        de deVar = (de) this.a.get(i(file, str).getAbsolutePath());
        if (deVar != null) {
            deVar.b.e();
            synchronized (deVar.a) {
                try {
                    Iterator it = deVar.a.iterator();
                    while (it.hasNext()) {
                        ((v47) it.next()).h();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [ce, java.lang.Object, yn1] */
    public final boolean b(String str, File file, v47 v47, String str2) {
        z68.c("ee", "downloadFile url = %s", str);
        File i = i(file, str2);
        if (this.a.containsKey(i.getAbsolutePath())) {
            de deVar = (de) this.a.get(i.getAbsolutePath());
            if (deVar != null) {
                synchronized (deVar.a) {
                    int i2 = 0;
                    while (i2 < deVar.a.size()) {
                        try {
                            if (((v47) deVar.a.get(i2)).getDownloadContext().equals(v47.getDownloadContext())) {
                                z68.c("ee", "file already downloading in listener context, do nothing return false", new Object[0]);
                                return false;
                            }
                            i2++;
                        } finally {
                        }
                    }
                    z68.c("ee", "file already downloading add listener and return true", new Object[0]);
                    deVar.a.add(v47);
                }
            }
            return true;
        }
        try {
            hr6 hr6 = new hr6();
            hr6.C(str);
            hr6.A(UUID.randomUUID().toString());
            if (i.exists() && i.length() > 0) {
                z68.c("ee", "resume download file, downloaded size: " + i.length(), new Object[0]);
                ((e4) hr6.c).k("Range", "bytes=" + i.length() + "-");
            }
            y2d c2 = hr6.c();
            jtc b2 = ((rla) this.b.getValue()).b(c2);
            de deVar2 = new de(b2);
            synchronized (deVar2.a) {
                deVar2.a.add(v47);
                this.a.put(i.getAbsolutePath(), deVar2);
            }
            ? obj = new Object();
            obj.w = this;
            obj.b = c2;
            obj.c = deVar2;
            obj.o = i;
            obj.v = file;
            obj.a = false;
            b2.f(obj);
            z68.c("ee", "start file download", new Object[0]);
            return true;
        } catch (IllegalArgumentException unused) {
            v47.a();
            i.delete();
            return false;
        }
    }

    public final void c(v47 v47) {
        if (v47 != null) {
            for (de deVar : this.a.values()) {
                synchronized (deVar.a) {
                    deVar.a.remove(v47);
                }
            }
        }
    }
}
