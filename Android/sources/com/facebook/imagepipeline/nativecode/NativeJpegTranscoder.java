package com.facebook.imagepipeline.nativecode;

import android.graphics.ColorSpace;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@cr4
public class NativeJpegTranscoder implements sa7 {
    public boolean a;
    public int b;
    public boolean c;

    public static void e(InputStream inputStream, f69 f69, int i, int i2, int i3) {
        m5a.t();
        boolean z = false;
        if (i2 >= 1) {
            if (i2 <= 16) {
                if (i3 >= 0) {
                    if (i3 <= 100) {
                        a00 a00 = go7.a;
                        if (i >= 0 && i <= 270 && i % 90 == 0) {
                            if (!(i2 == 8 && i == 0)) {
                                z = true;
                            }
                            cvg.m("no transformation requested", z);
                            nativeTranscodeJpeg(inputStream, f69, i, i2, i3);
                            return;
                        }
                        throw new IllegalArgumentException();
                    }
                    throw new IllegalArgumentException();
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public static void f(InputStream inputStream, f69 f69, int i, int i2, int i3) {
        boolean z;
        m5a.t();
        boolean z2 = false;
        if (i2 >= 1) {
            if (i2 <= 16) {
                if (i3 >= 0) {
                    if (i3 <= 100) {
                        a00 a00 = go7.a;
                        switch (i) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z = true;
                                break;
                            default:
                                z = false;
                                break;
                        }
                        if (z) {
                            if (!(i2 == 8 && i == 1)) {
                                z2 = true;
                            }
                            cvg.m("no transformation requested", z2);
                            nativeTranscodeJpegWithExifOrientation(inputStream, f69, i, i2, i3);
                            return;
                        }
                        throw new IllegalArgumentException();
                    }
                    throw new IllegalArgumentException();
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    @cr4
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    @cr4
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    public final String a() {
        return "NativeJpegTranscoder";
    }

    /* JADX INFO: finally extract failed */
    public final jq5 b(j55 j55, f69 f69, f8d f8d, v3d v3d, ColorSpace colorSpace) {
        Integer num = 85;
        if (f8d == null) {
            f8d = f8d.b;
        }
        int h = y7e.h(f8d, v3d, j55, this.b);
        InputStream inputStream = null;
        try {
            int c2 = go7.c(f8d, v3d, j55, this.a);
            int i = 1;
            int max = Math.max(1, 8 / h);
            if (this.c) {
                c2 = max;
            }
            inputStream = j55.n();
            a00 a00 = go7.a;
            j55.m0();
            if (a00.contains(Integer.valueOf(j55.v))) {
                int a2 = go7.a(f8d, j55);
                cvg.p(inputStream, "Cannot transcode from null input stream!");
                f(inputStream, f69, a2, c2, num.intValue());
            } else {
                int b2 = go7.b(f8d, j55);
                cvg.p(inputStream, "Cannot transcode from null input stream!");
                e(inputStream, f69, b2, c2, num.intValue());
            }
            a43.b(inputStream);
            if (h != 1) {
                i = 0;
            }
            return new jq5(i, 6);
        } catch (Throwable th) {
            a43.b(inputStream);
            throw th;
        }
    }

    public final boolean c(h97 h97) {
        return h97 == eg4.a;
    }

    public final boolean d(j55 j55, f8d f8d, v3d v3d) {
        if (f8d == null) {
            f8d = f8d.b;
        }
        return go7.c(f8d, v3d, j55, this.a) < 8;
    }
}
