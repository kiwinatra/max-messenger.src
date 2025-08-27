package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Objects;
import kotlin.jvm.internal.IntCompanionObject;

public abstract class e implements Closeable {
    public static void a(mm5 mm5, byte[] bArr, File file) {
        RandomAccessFile randomAccessFile;
        int read;
        InputStream inputStream = (InputStream) mm5.c;
        fbf fbf = (fbf) mm5.b;
        Object obj = fbf.b;
        File file2 = new File(file, (String) fbf.b);
        try {
            randomAccessFile = new RandomAccessFile(file2, "rw");
            int available = inputStream.available();
            if (available > 1) {
                SysUtil$LollipopSysdeps.fallocateIfSupported(randomAccessFile.getFD(), (long) available);
            }
            int i = 0;
            while (i < Integer.MAX_VALUE && (read = inputStream.read(bArr, 0, Math.min(bArr.length, IntCompanionObject.MAX_VALUE - i))) != -1) {
                randomAccessFile.write(bArr, 0, read);
                i += read;
            }
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            if (file2.setExecutable(true, false)) {
                randomAccessFile.close();
                if (file2.exists() && !file2.setWritable(false)) {
                    file2.toString();
                    Objects.toString(file);
                    file.canWrite();
                    return;
                }
                return;
            }
            throw new IOException("cannot make file executable: " + file2);
        } catch (IOException e) {
            try {
                file2.toString();
                e.toString();
                w6f.b(file2);
                throw e;
            } catch (Throwable th) {
                if (file2.exists() && !file2.setWritable(false)) {
                    file2.toString();
                    Objects.toString(file);
                    file.canWrite();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public void close() {
    }

    public abstract fbf[] m();

    public abstract void n(File file);
}
