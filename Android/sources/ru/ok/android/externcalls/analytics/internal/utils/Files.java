package ru.ok.android.externcalls.analytics.internal.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipException;

public final class Files {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static AtomicReference<byte[]> BUF = new AtomicReference<>();
    private static final int BUFFER_SIZE = 4096;
    public static final byte[] SEPARATOR = {44};

    private Files() {
    }

    public static void cat(File file, File file2, boolean z) throws IOException {
        OutputStream fileOutputStream;
        byte[] obtainBuf;
        if (file != null && file.getParentFile() != null && file2 != null && length(file2) != 0) {
            if (!file.exists()) {
                mkdirs(file.getParentFile());
                try {
                    if (file2.renameTo(file)) {
                        return;
                    }
                } catch (SecurityException e) {
                    throw new IOException("Can't grab file due to security restrictions", e);
                }
            }
            InputStream fileInputStream = new FileInputStream(file2);
            if (z) {
                fileInputStream = new GZIPInputStream(fileInputStream);
            }
            try {
                long length = length(file);
                fileOutputStream = new FileOutputStream(file, true);
                obtainBuf = obtainBuf();
                if (z) {
                    fileOutputStream = new GZIPOutputStream(fileOutputStream, 4096, true);
                }
                if (length > 0) {
                    fileOutputStream.write(SEPARATOR);
                }
                while (true) {
                    int read = fileInputStream.read(obtainBuf);
                    if (read >= 0) {
                        fileOutputStream.write(obtainBuf, 0, read);
                    } else {
                        fileOutputStream.close();
                        releaseBuf(obtainBuf);
                        fileInputStream.close();
                        delete(file2);
                        return;
                    }
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            return;
        }
        throw th;
    }

    public static void delete(File file) throws IOException {
        if (file != null && !deleteFile(file) && !deleteFile(file)) {
            throw new IOException("Cannot delete file " + file);
        }
    }

    private static boolean deleteDirectory(File file) {
        File[] listFiles;
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (File deleteFile : listFiles) {
                if (!deleteFile(deleteFile)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    private static boolean deleteFile(File file) {
        try {
            if (file.isDirectory()) {
                return deleteDirectory(file);
            }
            if (file.exists()) {
                return file.delete();
            }
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static boolean isCompressed(File file) throws IOException {
        FileInputStream fileInputStream;
        if (!(file == null || length(file) == 0)) {
            try {
                fileInputStream = new FileInputStream(file);
                new GZIPInputStream(fileInputStream, 4096).close();
                fileInputStream.close();
                return true;
            } catch (ZipException unused) {
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return false;
        throw th;
    }

    public static long length(File file) {
        if (file == null) {
            return 0;
        }
        try {
            return file.length();
        } catch (SecurityException unused) {
            return 0;
        }
    }

    public static void mkdirs(File file) throws IOException {
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IOException(file.getAbsolutePath() + " is expected to be a directory");
            }
        } else if (!file.mkdirs()) {
            throw new IOException("Cannot create directory " + file.getAbsolutePath());
        }
    }

    public static void mkfile(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            mkdirs(parentFile);
            if (file.exists() && !file.isFile()) {
                throw new IOException(file.getAbsolutePath() + " is expected to be a file");
            }
            return;
        }
        throw new IOException("missing parent file for " + file.getPath());
    }

    private static byte[] obtainBuf() {
        byte[] andSet = BUF.getAndSet((Object) null);
        return andSet != null ? andSet : new byte[4096];
    }

    public static String readTextFile(File file, boolean z) throws IOException {
        StringBuilder sb = new StringBuilder();
        char[] cArr = new char[1024];
        InputStreamReader inputStreamReader = new InputStreamReader(z ? new GZIPInputStream(new FileInputStream(file)) : new FileInputStream(file));
        while (true) {
            try {
                int read = inputStreamReader.read(cArr);
                if (read >= 0) {
                    sb.append(cArr, 0, read);
                } else {
                    inputStreamReader.close();
                    return sb.toString();
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        throw th;
    }

    private static void releaseBuf(byte[] bArr) {
        BUF.set(bArr);
    }

    public static long length(File... fileArr) {
        long j = 0;
        if (fileArr == null) {
            return 0;
        }
        for (File length : fileArr) {
            j += length(length);
        }
        return j;
    }

    public static long length(Collection<File> collection) {
        long j = 0;
        if (collection == null) {
            return 0;
        }
        for (File length : collection) {
            j += length(length);
        }
        return j;
    }
}
