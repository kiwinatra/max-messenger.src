package defpackage;

import java.nio.ByteBuffer;
import org.webrtc.JniCommon;

/* renamed from: km7  reason: default package */
public final /* synthetic */ class km7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ByteBuffer b;

    public /* synthetic */ km7(int i, ByteBuffer byteBuffer) {
        this.a = i;
        this.b = byteBuffer;
    }

    public final void run() {
        int i = this.a;
        ByteBuffer byteBuffer = this.b;
        switch (i) {
            case 0:
                JniCommon.nativeFreeByteBuffer(byteBuffer);
                return;
            default:
                JniCommon.nativeFreeByteBuffer(byteBuffer);
                return;
        }
    }
}
