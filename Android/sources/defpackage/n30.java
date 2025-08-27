package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.media.ApplicationMediaCapabilities;
import android.media.AudioManager$OnCommunicationDeviceChangedListener;
import android.media.AudioProfile;
import android.media.MediaRecorder;
import android.view.ContentInfo;

/* renamed from: n30  reason: default package */
public abstract /* synthetic */ class n30 {
    public static /* synthetic */ MultiResolutionStreamInfo c(int i, int i2, String str) {
        return new MultiResolutionStreamInfo(i, i2, str);
    }

    public static /* synthetic */ ApplicationMediaCapabilities.Builder d() {
        return new ApplicationMediaCapabilities.Builder();
    }

    public static /* bridge */ /* synthetic */ AudioManager$OnCommunicationDeviceChangedListener h(Object obj) {
        return (AudioManager$OnCommunicationDeviceChangedListener) obj;
    }

    public static /* bridge */ /* synthetic */ AudioProfile i(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* synthetic */ MediaRecorder j(Context context) {
        return new MediaRecorder(context);
    }

    public static /* synthetic */ ContentInfo.Builder k(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* bridge */ /* synthetic */ ContentInfo m(Object obj) {
        return (ContentInfo) obj;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInlineVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.visitors.MethodInlineVisitor.inlineMth(MethodInlineVisitor.java:57)
        	at jadx.core.dex.visitors.MethodInlineVisitor.visit(MethodInlineVisitor.java:47)
        */
    public static /* synthetic */ void q() {
        /*
            android.hardware.camera2.params.MultiResolutionStreamInfo r0 = new android.hardware.camera2.params.MultiResolutionStreamInfo
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n30.q():void");
    }
}
