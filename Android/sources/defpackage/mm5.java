package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileLock;

/* renamed from: mm5  reason: default package */
public final class mm5 implements Closeable, h57 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ mm5(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void m() {
    }

    public final void close() {
        switch (this.a) {
            case 0:
                FileOutputStream fileOutputStream = (FileOutputStream) this.b;
                try {
                    FileLock fileLock = (FileLock) this.c;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    return;
                } finally {
                    fileOutputStream.close();
                }
            case 1:
                return;
            default:
                ((InputStream) this.c).close();
                return;
        }
    }

    public long getContentLength() {
        return (long) ((byte[]) this.c).length;
    }

    public String getContentType() {
        return (String) this.b;
    }

    public void writeTo(OutputStream outputStream) {
        outputStream.write((byte[]) this.c);
    }

    public mm5(File file) {
        this.a = 0;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.b = fileOutputStream;
        try {
            FileLock lock = fileOutputStream.getChannel().lock();
            if (lock == null) {
                fileOutputStream.close();
            }
            this.c = lock;
        } catch (Throwable th) {
            ((FileOutputStream) this.b).close();
            throw th;
        }
    }
}
