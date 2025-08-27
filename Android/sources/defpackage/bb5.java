package defpackage;

import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;

/* renamed from: bb5  reason: default package */
public abstract class bb5 {
    public static void a(FileDescriptor fileDescriptor) throws ErrnoException {
        Os.close(fileDescriptor);
    }

    public static FileDescriptor b(FileDescriptor fileDescriptor) throws ErrnoException {
        return Os.dup(fileDescriptor);
    }

    public static long c(FileDescriptor fileDescriptor, long j, int i) throws ErrnoException {
        return Os.lseek(fileDescriptor, j, i);
    }
}
