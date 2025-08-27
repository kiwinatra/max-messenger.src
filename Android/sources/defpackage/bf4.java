package defpackage;

import android.media.MediaCodecInfo;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: bf4  reason: default package */
public final /* synthetic */ class bf4 implements df4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ bf4(String str, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = i;
    }

    public final int a(MediaCodecInfo mediaCodecInfo) {
        int i = this.c;
        String str = this.b;
        switch (this.a) {
            case 0:
                return Math.abs(((Integer) k65.d(mediaCodecInfo, str).clamp(Integer.valueOf(i))).intValue() - i);
            default:
                ms msVar = k65.a;
                if (mediaCodecInfo.getCapabilitiesForType(str).getEncoderCapabilities().isBitrateModeSupported(i)) {
                    return 0;
                }
                return IntCompanionObject.MAX_VALUE;
        }
    }
}
