package defpackage;

import com.facebook.soloader.SoLoader;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Stack;

/* renamed from: w6f  reason: default package */
public abstract class w6f {
    public static void a(File file) {
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.canWrite() && !parentFile.setWritable(true)) {
            parentFile.toString();
        }
        if (!file.delete() && file.exists()) {
            throw new IOException("Could not delete file " + file);
        }
    }

    public static void b(File file) {
        Stack stack = new Stack();
        stack.push(file);
        ArrayList arrayList = new ArrayList();
        while (!stack.isEmpty()) {
            File file2 = (File) stack.pop();
            if (!file2.isDirectory()) {
                a(file2);
            } else {
                arrayList.add(file2);
                File[] listFiles = file2.listFiles();
                if (listFiles != null) {
                    for (File push : listFiles) {
                        stack.push(push);
                    }
                }
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a((File) arrayList.get(size));
        }
    }

    public static void c(File file) {
        RandomAccessFile randomAccessFile;
        Stack stack = new Stack();
        stack.push(file);
        while (!stack.isEmpty()) {
            File file2 = (File) stack.pop();
            if (file2.isDirectory()) {
                File[] listFiles = file2.listFiles();
                if (listFiles != null) {
                    for (File push : listFiles) {
                        stack.push(push);
                    }
                } else {
                    throw new IOException("cannot list directory " + file2);
                }
            } else if (!file2.getPath().endsWith("_lock")) {
                try {
                    randomAccessFile = new RandomAccessFile(file2, "r");
                    randomAccessFile.getFD().sync();
                    randomAccessFile.close();
                } catch (IOException e) {
                    file2.toString();
                    e.getMessage();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                continue;
            }
        }
        return;
        throw th;
    }

    public static mm5 d(File file, File file2) {
        boolean z;
        try {
            return new mm5(file2);
        } catch (FileNotFoundException e) {
            z = true;
            if (file.setWritable(true)) {
                mm5 mm5 = new mm5(file2);
                if (!file.setWritable(false)) {
                    file.getCanonicalPath();
                }
                return mm5;
            }
            throw e;
        } catch (Throwable th) {
            th = th;
        }
        if (z && !file.setWritable(false)) {
            file.getCanonicalPath();
        }
        throw th;
    }

    @br4
    public static String getClassLoaderLdLoadLibrary() {
        ClassLoader classLoader = SoLoader.class.getClassLoader();
        if (classLoader == null || (classLoader instanceof BaseDexClassLoader)) {
            try {
                return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", (Class[]) null).invoke((BaseDexClassLoader) classLoader, (Object[]) null);
            } catch (Exception unused) {
                return null;
            }
        } else {
            throw new IllegalStateException("ClassLoader " + classLoader.getClass().getName() + " should be of type BaseDexClassLoader");
        }
    }

    @br4
    public static Method getNativeLoadRuntimeMethod() {
        return null;
    }
}
