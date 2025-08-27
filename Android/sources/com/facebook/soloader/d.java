package com.facebook.soloader;

import android.os.Trace;
import java.io.FileInputStream;
import java.nio.channels.ClosedByInterruptException;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public abstract class d {
    static {
        new ReentrantReadWriteLock();
    }

    public static String[] a(String str, y05 y05) {
        String[] strArr;
        z05 z05;
        int i;
        if (SoLoader.a) {
            Api18TraceUtils.a("soloader.NativeDeps.getDependencies[", str, "]");
        }
        try {
            if (y05 instanceof z05) {
                z05 = (z05) y05;
                i = 0;
                while (true) {
                    strArr = kr7.s(z05);
                    break;
                }
            }
            strArr = kr7.s(y05);
            if (SoLoader.a) {
                Trace.endSection();
            }
            return strArr;
        } catch (ClosedByInterruptException e) {
            i++;
            if (i <= 4) {
                Thread.interrupted();
                FileInputStream fileInputStream = new FileInputStream(z05.a);
                z05.b = fileInputStream;
                z05.c = fileInputStream.getChannel();
            } else {
                throw e;
            }
        } catch (wq9 e2) {
            try {
                throw m5a.q(str, e2);
            } catch (Throwable th) {
                if (SoLoader.a) {
                    Trace.endSection();
                }
                throw th;
            }
        }
    }
}
