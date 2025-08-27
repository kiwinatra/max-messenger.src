package com.facebook.imagepipeline.nativecode;

@cr4
public class NativeJpegTranscoderFactory implements ta7 {
    public final int a;
    public final boolean b;
    public final boolean c;

    @cr4
    public NativeJpegTranscoderFactory(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [com.facebook.imagepipeline.nativecode.NativeJpegTranscoder, sa7, java.lang.Object] */
    @cr4
    public sa7 createImageTranscoder(h97 h97, boolean z) {
        if (h97 != eg4.a) {
            return null;
        }
        ? obj = new Object();
        obj.a = z;
        obj.b = this.a;
        obj.c = this.b;
        if (this.c) {
            m5a.t();
        }
        return obj;
    }
}
