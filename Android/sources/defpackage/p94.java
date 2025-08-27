package defpackage;

import android.os.SystemClock;
import java.util.LinkedHashMap;

/* renamed from: p94  reason: default package */
public abstract class p94 {
    public static final LinkedHashMap a = new LinkedHashMap();

    static {
        cs a2 = wb7.a();
        a2.F("AssetLoader", tb7.u("InputFormat", "OutputFormat"));
        Object[] objArr = {"InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"};
        f6e.g(6, objArr);
        a2.F("AudioDecoder", tb7.n(6, objArr));
        a2.F("AudioGraph", tb7.u("RegisterNewInputStream", "OutputEnded"));
        Object[] objArr2 = {"RegisterNewInputStream", "OutputFormat", "ProducedOutput"};
        f6e.g(3, objArr2);
        a2.F("AudioMixer", tb7.n(3, objArr2));
        Object[] objArr3 = {"InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"};
        f6e.g(6, objArr3);
        a2.F("AudioEncoder", tb7.n(6, objArr3));
        Object[] objArr4 = {"InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"};
        f6e.g(6, objArr4);
        a2.F("VideoDecoder", tb7.n(6, objArr4));
        Object[] objArr5 = {"RegisterNewInputStream", "SurfaceTextureInput", "QueueFrame", "QueueBitmap", "QueueTexture", "RenderedToOutputSurface", "OutputTextureRendered", "ReceiveEndOfAllInput", "SignalEnded"};
        f6e.g(9, objArr5);
        a2.F("VFP", tb7.n(9, objArr5));
        a2.F("ExternalTextureManager", tb7.u("SignalEOS", "SurfaceTextureTransformFix"));
        a2.F("BitmapTextureManager", tb7.t("SignalEOS"));
        a2.F("TexIdTextureManager", tb7.t("SignalEOS"));
        a2.F("Compositor", tb7.t("OutputTextureRendered"));
        Object[] objArr6 = {"InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"};
        f6e.g(6, objArr6);
        a2.F("VideoEncoder", tb7.n(6, objArr6));
        a2.F("Muxer", tb7.v("InputFormat", "CanWriteSample", "AcceptedInput", "InputEnded", "OutputEnded"));
        a2.h();
        SystemClock.elapsedRealtime();
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 114 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a() {
        /*
            java.lang.Class<p94> r0 = defpackage.p94.class
            monitor-enter(r0)
            java.lang.Class<p94> r1 = defpackage.p94.class
            monitor-enter(r1)     // Catch:{ all -> 0x000b }
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            monitor-exit(r0)
            return
        L_0x0009:
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            throw r1
        L_0x000b:
            r1 = move-exception
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p94.a():void");
    }
}
