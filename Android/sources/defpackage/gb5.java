package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* renamed from: gb5  reason: default package */
public final class gb5 extends hb5 {
    public final e43 N0;
    public boolean O0;

    public gb5(o5h o5h, jz2 jz2, ut utVar) {
        super(1, jz2, utVar);
        this.N0 = o5h;
    }

    public final boolean G() {
        ba4 d = this.C0.d();
        if (d == null) {
            return false;
        }
        if (!this.O0) {
            if (this.D0.d()) {
                ByteBuffer byteBuffer = d.v;
                byteBuffer.getClass();
                byteBuffer.limit(0);
                d.a(4);
                this.E0 = this.C0.f();
                return false;
            }
            ByteBuffer c = this.D0.c();
            if (c == null) {
                return false;
            }
            d.B(c.limit());
            d.v.put(c).flip();
            md4 md4 = this.D0;
            MediaCodec.BufferInfo bufferInfo = md4.f(false) ? md4.a : null;
            bufferInfo.getClass();
            d.x = bufferInfo.presentationTimeUs;
            d.b = bufferInfo.flags;
            this.D0.i();
            this.O0 = true;
        }
        if (!this.C0.f()) {
            return false;
        }
        this.O0 = false;
        return true;
    }

    public final void H(ea6 ea6) {
        this.D0 = this.N0.p(ea6);
    }

    public final boolean P(ba4 ba4) {
        if (ba4.h(4)) {
            return false;
        }
        long j = ba4.x - this.A0;
        ba4.x = j;
        if (this.D0 == null || j >= 0) {
            return false;
        }
        ba4.z();
        return true;
    }

    public final String l() {
        return "ExoAssetLoaderAudioRenderer";
    }
}
