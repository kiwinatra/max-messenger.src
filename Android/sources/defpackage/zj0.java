package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import androidx.fragment.app.a;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.uuid.Uuid;
import one.me.rlottie.RLottieImageViewUtils;
import ru.ok.messages.views.fragments.base.FrgBase;
import ru.ok.tamtam.stickers.lottie.KeyboardLottieAnimationView;

/* renamed from: zj0  reason: default package */
public final /* synthetic */ class zj0 implements tk3 {
    public final /* synthetic */ int a;

    public /* synthetic */ zj0(int i) {
        this.a = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02b3, code lost:
        if (r10.toLowerCase(r5).startsWith("td1a") == false) goto L_0x02b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02da, code lost:
        if (r8.toLowerCase(r5).startsWith("tp1a") == false) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02f2, code lost:
        if ((android.os.Build.VERSION.SDK_INT == 33) != false) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0308, code lost:
        if ((android.os.Build.VERSION.SDK_INT == 33) != false) goto L_0x030d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.lang.Object r13) {
        /*
            r12 = this;
            jcc r13 = (defpackage.jcc) r13
            ykb r12 = new ykb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk.a
            java.lang.String r2 = android.os.Build.MODEL
            boolean r1 = r1.contains(r2)
            r3 = 1
            r4 = 0
            java.lang.String r5 = "Google"
            if (r1 == 0) goto L_0x0021
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0021
            r1 = r3
            goto L_0x0022
        L_0x0021:
            r1 = r4
        L_0x0022:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk> r6 = androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk.class
            boolean r1 = r13.a(r6, r1)
            if (r1 == 0) goto L_0x0032
            androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk r1 = new androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk
            r1.<init>()
            r0.add(r1)
        L_0x0032:
            boolean r1 = androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk.f()
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk> r6 = androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk.class
            boolean r1 = r13.a(r6, r1)
            if (r1 == 0) goto L_0x0046
            androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk r1 = new androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk
            r1.<init>()
            r0.add(r1)
        L_0x0046:
            java.util.List r1 = androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk.a
            java.lang.String r1 = android.os.Build.BRAND
            java.lang.String r6 = "GOOGLE"
            r6.equalsIgnoreCase(r1)
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk> r6 = androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk.class
            boolean r6 = r13.a(r6, r4)
            if (r6 == 0) goto L_0x005f
            androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk r6 = new androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk
            r6.<init>()
            r0.add(r6)
        L_0x005f:
            java.lang.String r6 = "OnePlus"
            boolean r7 = r6.equalsIgnoreCase(r1)
            java.lang.String r8 = "SAMSUNG"
            if (r7 == 0) goto L_0x0074
            java.lang.String r7 = "OnePlus6"
            java.lang.String r9 = android.os.Build.DEVICE
            boolean r7 = r7.equalsIgnoreCase(r9)
            if (r7 == 0) goto L_0x0074
            goto L_0x00cc
        L_0x0074:
            boolean r6 = r6.equalsIgnoreCase(r1)
            if (r6 == 0) goto L_0x0085
            java.lang.String r6 = "OnePlus6T"
            java.lang.String r7 = android.os.Build.DEVICE
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x0085
            goto L_0x00cc
        L_0x0085:
            java.lang.String r6 = "HUAWEI"
            boolean r6 = r6.equalsIgnoreCase(r1)
            if (r6 == 0) goto L_0x0098
            java.lang.String r6 = "HWANE"
            java.lang.String r7 = android.os.Build.DEVICE
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x0098
            goto L_0x00cc
        L_0x0098:
            boolean r6 = r8.equalsIgnoreCase(r1)
            if (r6 == 0) goto L_0x00a9
            java.lang.String r6 = "ON7XELTE"
            java.lang.String r7 = android.os.Build.DEVICE
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x00a9
            goto L_0x00cc
        L_0x00a9:
            boolean r6 = r8.equalsIgnoreCase(r1)
            if (r6 == 0) goto L_0x00ba
            java.lang.String r6 = "J7XELTE"
            java.lang.String r7 = android.os.Build.DEVICE
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x00ba
            goto L_0x00cc
        L_0x00ba:
            java.lang.String r6 = "REDMI"
            boolean r6 = r6.equalsIgnoreCase(r1)
            if (r6 == 0) goto L_0x00ce
            java.lang.String r6 = "joyeuse"
            java.lang.String r7 = android.os.Build.DEVICE
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x00ce
        L_0x00cc:
            r6 = r3
            goto L_0x00cf
        L_0x00ce:
            r6 = r4
        L_0x00cf:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk.class
            boolean r6 = r13.a(r7, r6)
            if (r6 == 0) goto L_0x00df
            androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk r6 = new androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk
            r6.<init>()
            r0.add(r6)
        L_0x00df:
            java.util.List r6 = androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.a
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r7 = r2.toUpperCase(r6)
            java.util.List r9 = androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.a
            boolean r7 = r9.contains(r7)
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk> r9 = androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class
            boolean r7 = r13.a(r9, r7)
            if (r7 == 0) goto L_0x00fd
            androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk r7 = new androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk
            r7.<init>()
            r0.add(r7)
        L_0x00fd:
            java.util.List r7 = androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk.a
            java.lang.String r7 = android.os.Build.MANUFACTURER
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x011b
            java.lang.String r5 = android.os.Build.DEVICE
            java.util.Locale r9 = java.util.Locale.getDefault()
            java.lang.String r5 = r5.toLowerCase(r9)
            java.util.List r9 = androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk.a
            boolean r5 = r9.contains(r5)
            if (r5 == 0) goto L_0x011b
            r5 = r3
            goto L_0x011c
        L_0x011b:
            r5 = r4
        L_0x011c:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk> r9 = androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk.class
            boolean r5 = r13.a(r9, r5)
            if (r5 == 0) goto L_0x012c
            androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk r5 = new androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk
            r5.<init>()
            r0.add(r5)
        L_0x012c:
            java.lang.String r5 = r7.toUpperCase(r6)
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0144
            java.lang.String r5 = r2.toUpperCase(r6)
            java.lang.String r8 = "SM-A716"
            boolean r5 = r5.startsWith(r8)
            if (r5 == 0) goto L_0x0144
            r5 = r3
            goto L_0x0145
        L_0x0144:
            r5 = r4
        L_0x0145:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk> r8 = androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk.class
            boolean r5 = r13.a(r8, r5)
            if (r5 == 0) goto L_0x0155
            androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk r5 = new androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk
            r5.<init>()
            r0.add(r5)
        L_0x0155:
            k3f r5 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.a
            java.lang.String r5 = android.os.Build.DEVICE
            java.lang.String r8 = "heroqltevzw"
            boolean r8 = r8.equalsIgnoreCase(r5)
            java.lang.String r9 = "google"
            if (r8 != 0) goto L_0x0189
            java.lang.String r8 = "heroqltetmo"
            boolean r5 = r8.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x016c
            goto L_0x0189
        L_0x016c:
            boolean r5 = r9.equalsIgnoreCase(r1)
            if (r5 != 0) goto L_0x0174
            r5 = r4
            goto L_0x017e
        L_0x0174:
            java.lang.String r5 = r2.toUpperCase(r6)
            java.util.HashSet r8 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.c
            boolean r5 = r8.contains(r5)
        L_0x017e:
            if (r5 != 0) goto L_0x0189
            boolean r5 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.e()
            if (r5 == 0) goto L_0x0187
            goto L_0x0189
        L_0x0187:
            r5 = r4
            goto L_0x018a
        L_0x0189:
            r5 = r3
        L_0x018a:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk> r8 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.class
            boolean r5 = r13.a(r8, r5)
            if (r5 == 0) goto L_0x019a
            androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk r5 = new androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk
            r5.<init>()
            r0.add(r5)
        L_0x019a:
            java.util.HashSet r5 = androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.a
            android.util.Pair r8 = new android.util.Pair
            java.lang.String r7 = r7.toLowerCase(r6)
            java.lang.String r10 = r2.toLowerCase(r6)
            r8.<init>(r7, r10)
            boolean r5 = r5.contains(r8)
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.class
            boolean r5 = r13.a(r7, r5)
            if (r5 == 0) goto L_0x01bd
            androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk r5 = new androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk
            r5.<init>()
            r0.add(r5)
        L_0x01bd:
            java.lang.String r5 = "Huawei"
            boolean r5 = r5.equalsIgnoreCase(r1)
            if (r5 == 0) goto L_0x01cf
            java.lang.String r5 = "mha-l29"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x01cf
            r5 = r3
            goto L_0x01d0
        L_0x01cf:
            r5 = r4
        L_0x01d0:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk.class
            boolean r5 = r13.a(r7, r5)
            if (r5 == 0) goto L_0x01e0
            androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk r5 = new androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk
            r5.<init>()
            r0.add(r5)
        L_0x01e0:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk> r5 = androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk.class
            boolean r5 = r13.a(r5, r4)
            if (r5 == 0) goto L_0x01f0
            androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk r5 = new androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk
            r5.<init>()
            r0.add(r5)
        L_0x01f0:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk> r5 = androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk.class
            boolean r5 = r13.a(r5, r4)
            if (r5 == 0) goto L_0x0200
            androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk r5 = new androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk
            r5.<init>()
            r0.add(r5)
        L_0x0200:
            java.util.List r5 = androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk.a
            java.lang.String r5 = r2.toLowerCase(r6)
            java.util.List r7 = androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk.a
            boolean r5 = r7.contains(r5)
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk.class
            boolean r5 = r13.a(r7, r5)
            if (r5 == 0) goto L_0x021c
            androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk r5 = new androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk
            r5.<init>()
            r0.add(r5)
        L_0x021c:
            java.util.List r5 = androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk.a
            java.lang.String r5 = "samsung"
            boolean r7 = r5.equalsIgnoreCase(r1)
            java.lang.String r8 = "xiaomi"
            if (r7 == 0) goto L_0x0231
            java.util.List r7 = androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk.a
            boolean r7 = androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk.e(r7)
            if (r7 == 0) goto L_0x0231
            goto L_0x023f
        L_0x0231:
            boolean r7 = r8.equalsIgnoreCase(r1)
            if (r7 == 0) goto L_0x0241
            java.util.List r7 = androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk.b
            boolean r7 = androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk.e(r7)
            if (r7 == 0) goto L_0x0241
        L_0x023f:
            r7 = r3
            goto L_0x0242
        L_0x0241:
            r7 = r4
        L_0x0242:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk> r10 = androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk.class
            boolean r7 = r13.a(r10, r7)
            if (r7 == 0) goto L_0x0252
            androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk r7 = new androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk
            r7.<init>()
            r0.add(r7)
        L_0x0252:
            java.lang.String r7 = "motorola"
            boolean r7 = r7.equalsIgnoreCase(r1)
            if (r7 == 0) goto L_0x0264
            java.lang.String r7 = "moto e5 play"
            boolean r7 = r7.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x0264
            r7 = r3
            goto L_0x0265
        L_0x0264:
            r7 = r4
        L_0x0265:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk> r10 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk.class
            boolean r7 = r13.a(r10, r7)
            if (r7 == 0) goto L_0x0275
            androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk r7 = new androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk
            r7.<init>()
            r0.add(r7)
        L_0x0275:
            java.util.List r7 = androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk.a
            boolean r5 = r5.equalsIgnoreCase(r1)
            java.lang.String r7 = "tp1a"
            if (r5 == 0) goto L_0x028f
            java.lang.String r5 = android.os.Build.ID
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r10)
            boolean r5 = r5.startsWith(r7)
            if (r5 == 0) goto L_0x028f
            goto L_0x030d
        L_0x028f:
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r10 = r2.toLowerCase(r5)
            java.util.List r11 = androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk.a
            boolean r10 = r11.contains(r10)
            if (r10 == 0) goto L_0x02b6
            java.lang.String r10 = android.os.Build.ID
            java.lang.String r11 = r10.toLowerCase(r5)
            boolean r11 = r11.startsWith(r7)
            if (r11 != 0) goto L_0x030d
            java.lang.String r10 = r10.toLowerCase(r5)
            java.lang.String r11 = "td1a"
            boolean r10 = r10.startsWith(r11)
            if (r10 == 0) goto L_0x02b6
            goto L_0x030d
        L_0x02b6:
            java.lang.String r10 = "redmi"
            boolean r10 = r10.equalsIgnoreCase(r1)
            if (r10 != 0) goto L_0x02c4
            boolean r8 = r8.equalsIgnoreCase(r1)
            if (r8 == 0) goto L_0x02dd
        L_0x02c4:
            java.lang.String r8 = android.os.Build.ID
            java.lang.String r10 = r8.toLowerCase(r5)
            java.lang.String r11 = "tkq1"
            boolean r10 = r10.startsWith(r11)
            if (r10 != 0) goto L_0x030d
            java.lang.String r8 = r8.toLowerCase(r5)
            boolean r7 = r8.startsWith(r7)
            if (r7 == 0) goto L_0x02dd
            goto L_0x030d
        L_0x02dd:
            java.lang.String r7 = r2.toLowerCase(r5)
            java.util.List r8 = androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk.b
            boolean r7 = r8.contains(r7)
            r8 = 33
            if (r7 == 0) goto L_0x02f5
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 != r8) goto L_0x02f1
            r7 = r3
            goto L_0x02f2
        L_0x02f1:
            r7 = r4
        L_0x02f2:
            if (r7 == 0) goto L_0x02f5
            goto L_0x030d
        L_0x02f5:
            java.lang.String r5 = r2.toLowerCase(r5)
            java.util.List r7 = androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk.c
            boolean r5 = r7.contains(r5)
            if (r5 == 0) goto L_0x030b
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 != r8) goto L_0x0307
            r5 = r3
            goto L_0x0308
        L_0x0307:
            r5 = r4
        L_0x0308:
            if (r5 == 0) goto L_0x030b
            goto L_0x030d
        L_0x030b:
            r5 = r4
            goto L_0x030e
        L_0x030d:
            r5 = r3
        L_0x030e:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk.class
            boolean r5 = r13.a(r7, r5)
            if (r5 == 0) goto L_0x031e
            androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk r5 = new androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk
            r5.<init>()
            r0.add(r5)
        L_0x031e:
            java.lang.String r5 = "samsungexynos7870"
            java.lang.String r7 = android.os.Build.HARDWARE
            boolean r5 = r5.equalsIgnoreCase(r7)
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk.class
            boolean r5 = r13.a(r7, r5)
            if (r5 == 0) goto L_0x0336
            androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk r5 = new androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk
            r5.<init>()
            r0.add(r5)
        L_0x0336:
            java.util.HashMap r5 = androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk.a
            java.lang.String r2 = r2.toUpperCase(r6)
            boolean r2 = r5.containsKey(r2)
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk> r5 = androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk.class
            boolean r2 = r13.a(r5, r2)
            if (r2 == 0) goto L_0x0350
            androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk
            r2.<init>()
            r0.add(r2)
        L_0x0350:
            boolean r1 = r9.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x035d
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            if (r1 < r2) goto L_0x035d
            goto L_0x035e
        L_0x035d:
            r3 = r4
        L_0x035e:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk> r1 = androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk.class
            boolean r13 = r13.a(r1, r3)
            if (r13 == 0) goto L_0x036e
            androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk r13 = new androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk
            r13.<init>()
            r0.add(r13)
        L_0x036e:
            r12.<init>((java.util.List) r0)
            defpackage.qn4.a = r12
            ykb r12 = defpackage.qn4.a
            defpackage.ykb.k(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zj0.a(java.lang.Object):void");
    }

    private final void b(Object obj) {
        ak3 ak3;
        k0a k0a = (k0a) obj;
        if (k0a.a != null) {
            p99 p99 = k0a.v;
            p99.getClass();
            boolean B = cjf.B(Collections.emptyList());
            bk3 bk3 = p99.d;
            a32 a32 = k0a.X;
            if (B || a32 == null) {
                p99.a();
                if (a32 != null) {
                    bk3.getClass();
                }
            } else {
                long j = k0a.Z;
                if (!cjf.B(p99.j) && a32.a > 0) {
                    ak3 = new ak3((String) p99.k.J(), p99.j, p99.h, (String) null, (mc8) null, false, p99.b(j));
                    bk3.getClass();
                } else {
                    ak3 = null;
                }
                if (ak3 != null) {
                    ((l2a) k0a.a).c0(ak3);
                }
            }
            f2a f2a = k0a.z.c.a;
            if (f2a != null) {
                s3a s3a = (s3a) f2a;
                Editable text = s3a.X.getText();
                if (!cvg.c(text == null ? null : text.toString(), (CharSequence) null)) {
                    s3a.X.setText((CharSequence) null);
                }
            }
            k0a.c.f.a();
            n99 n99 = k0a.b;
            n99.getClass();
            try {
                ed6 v = n99.w.E2().v();
                List<a> q = cjf.q(v.c.f(), new p79(4));
                if (!q.isEmpty()) {
                    xe0 xe0 = new xe0(v);
                    for (a j2 : q) {
                        xe0.j(j2);
                    }
                    xe0.g();
                }
            } catch (Throwable th) {
                z68.f("n99", "could not remove fragments", th);
            }
            i3a i3a = n99.E0;
            i3a.getClass();
            z68.c("i3a", "releaseView()", new Object[0]);
            if (i3a.x0 != null) {
                i3a.d0();
                g5b g5b = i3a.x0;
                if (g5b != null) {
                    g5b.i();
                }
                i3a.x0 = null;
                i3a.w0 = null;
            }
            n99.o.getClass();
            ni0 ni0 = n99.A0;
            if (ni0 != null) {
                ryg.k0(ni0.B(), new p79(3), m58.g, m58.e);
            }
            n99.b();
            gb8 gb8 = n99.D0;
            n99.b.a(gb8);
            Set<eb8> set = gb8.a;
            if (set != null) {
                for (eb8 eb8 : set) {
                    KeyboardLottieAnimationView keyboardLottieAnimationView = (KeyboardLottieAnimationView) eb8;
                    keyboardLottieAnimationView.getClass();
                    RLottieImageViewUtils.release(keyboardLottieAnimationView);
                    keyboardLottieAnimationView.x = null;
                }
            }
        }
    }

    private final void c(Object obj) {
        k0a k0a = (k0a) obj;
        k0a.getClass();
        z68.c("k0a", "onSendToChatClicked", new Object[0]);
        a32 a32 = k0a.X;
        if (a32 == null) {
            n99 n99 = k0a.b;
            n99.getClass();
            int i = u5.z0;
            FrgBase frgBase = n99.w;
            Intent intent = new Intent(frgBase.M1(), u5.class);
            intent.putExtra("ru.ok.tamtam.extra.SHOW_DESCRIPTION", false);
            frgBase.S2(intent, Uuid.SIZE_BITS, (Bundle) null);
            return;
        }
        k0a.b0(new long[]{a32.a});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0439, code lost:
        if (androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk.b.contains(android.os.Build.SOC_MODEL.toLowerCase()) != false) goto L_0x0461;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x05fd, code lost:
        if (androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk.a.contains(r1.toLowerCase(java.util.Locale.ROOT)) != false) goto L_0x065d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02e1, code lost:
        if ("Q2Q".equalsIgnoreCase(r2) == false) goto L_0x02e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02f4, code lost:
        if ("OP4E75L1".equalsIgnoreCase(android.os.Build.DEVICE) != false) goto L_0x0309;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0307, code lost:
        if ("Q706F".equalsIgnoreCase(android.os.Build.DEVICE) != false) goto L_0x0309;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x040d  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x041d  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x042b  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x043c  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x046c  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x049e  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x04a9  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x04c7  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x04db  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x04dd  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x04e6  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0556  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0558  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0561  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0586  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0591  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x05a9  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x05ab  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x05b4  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x05c8  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x05d4  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x05d6  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x05df  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x05f1  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0668  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x067e  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0680  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0689  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x069d  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x069f  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x06a8  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x06bc  */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x06be  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x06c7  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x06db  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x06dd  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x06e6  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x06fa  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x06fc  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x0705  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x0719  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x071b  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x0724  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0738  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x073a  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x0743  */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x087a  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0898  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x089a  */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x08a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r20) {
        /*
            r19 = this;
            java.lang.String r0 = "Samsung"
            java.lang.String r1 = "Vivo"
            java.lang.String r2 = "SAMSUNG"
            r3 = 5
            r4 = 0
            r5 = -1
            r7 = 4
            r8 = 2
            r9 = 3
            r10 = 0
            r11 = 1
            r12 = r19
            int r13 = r12.a
            switch(r13) {
                case 0: goto L_0x0b74;
                case 1: goto L_0x0b5e;
                case 2: goto L_0x0ad0;
                case 3: goto L_0x0ac8;
                case 4: goto L_0x095b;
                case 5: goto L_0x0901;
                case 6: goto L_0x08cf;
                case 7: goto L_0x08c7;
                case 8: goto L_0x08be;
                case 9: goto L_0x08b6;
                case 10: goto L_0x0756;
                case 11: goto L_0x034c;
                case 12: goto L_0x02b8;
                case 13: goto L_0x02b4;
                case 14: goto L_0x02ad;
                case 15: goto L_0x02a6;
                case 16: goto L_0x029f;
                case 17: goto L_0x0298;
                case 18: goto L_0x0239;
                case 19: goto L_0x00b1;
                case 20: goto L_0x0088;
                case 21: goto L_0x0080;
                case 22: goto L_0x0078;
                case 23: goto L_0x0070;
                case 24: goto L_0x0053;
                case 25: goto L_0x0048;
                case 26: goto L_0x0038;
                case 27: goto L_0x0034;
                case 28: goto L_0x0030;
                default: goto L_0x0016;
            }
        L_0x0016:
            r0 = r20
            k0a r0 = (defpackage.k0a) r0
            p99 r1 = r0.v
            r1.getClass()
            defpackage.jbd.c(r4)
            defpackage.jbd.c(r4)
            f2a r0 = r0.a
            if (r0 != 0) goto L_0x002a
            goto L_0x002f
        L_0x002a:
            l2a r0 = (defpackage.l2a) r0
            r0.a0(r10, r4)
        L_0x002f:
            return
        L_0x0030:
            r19.c(r20)
            return
        L_0x0034:
            r19.b(r20)
            return
        L_0x0038:
            r0 = r20
            k0a r0 = (defpackage.k0a) r0
            a32 r1 = r0.X
            long r1 = r1.a
            long[] r3 = new long[r11]
            r3[r10] = r1
            r0.b0(r3)
            return
        L_0x0048:
            r0 = r20
            k0a r0 = (defpackage.k0a) r0
            r0.e0()
            r0.d0()
            return
        L_0x0053:
            r0 = r20
            k0a r0 = (defpackage.k0a) r0
            f2a r1 = r0.a
            if (r1 == 0) goto L_0x0064
            l2a r1 = (defpackage.l2a) r1
            ru.ok.messages.constructor.MessagesConstructorDraftView r1 = r1.Y
            if (r1 == 0) goto L_0x0064
            r1.setVisible(r10)
        L_0x0064:
            a32 r1 = r0.X
            if (r1 == 0) goto L_0x006f
            p99 r0 = r0.v
            bk3 r0 = r0.d
            r0.getClass()
        L_0x006f:
            return
        L_0x0070:
            r0 = r20
            n4a r0 = (defpackage.n4a) r0
            r0.H()
            return
        L_0x0078:
            r0 = r20
            n4a r0 = (defpackage.n4a) r0
            r0.n()
            return
        L_0x0080:
            r0 = r20
            n4a r0 = (defpackage.n4a) r0
            r0.m()
            return
        L_0x0088:
            r0 = r20
            s3a r0 = (defpackage.s3a) r0
            java.lang.Object r1 = r0.b
            android.content.Context r1 = (android.content.Context) r1
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L_0x00b0
            android.app.Activity r1 = (android.app.Activity) r1
            ru.ok.messages.messages.widgets.MessageComposeEditText r0 = r0.X
            if (r1 == 0) goto L_0x00b0
            boolean r2 = r1.isFinishing()
            if (r2 != 0) goto L_0x00b0
            if (r0 != 0) goto L_0x00a3
            goto L_0x00b0
        L_0x00a3:
            r0.requestFocus()
            uo5 r2 = new uo5
            r3 = 18
            r2.<init>((int) r3, (java.lang.Object) r1, (java.lang.Object) r0)
            r0.post(r2)
        L_0x00b0:
            return
        L_0x00b1:
            r0 = r20
            u2a r0 = (defpackage.u2a) r0
            d8b r1 = r0.X
            r1.g()
            oh4 r0 = r0.w
            or7 r1 = r0.A0
            boolean r1 = defpackage.o54.y(r1)
            jbf r2 = r0.c
            java.lang.String r4 = "oh4"
            if (r1 != 0) goto L_0x00ce
            java.lang.String r1 = "loadRecentEmojis: skipped, not disposed"
            defpackage.z68.c(r4, r1, new java.lang.Object[0])
            goto L_0x0127
        L_0x00ce:
            java.lang.String r1 = "loadRecentEmojis:"
            defpackage.z68.c(r4, r1, new java.lang.Object[0])
            gvc r1 = r0.x
            wuc r1 = r1.b()
            cvc r5 = defpackage.cvc.EMOJI
            java.util.List r5 = kotlin.collections.CollectionsKt.listOf(r5)
            jha r1 = r1.a(r5)
            o9a r5 = defpackage.o9a.w
            yia r6 = new yia
            r6.<init>(r1, r5, r9)
            tb4 r1 = new tb4
            r5 = 19
            r1.<init>(r5)
            mha r5 = new mha
            r5.<init>(r6, r1, r9)
            mh4 r1 = new mh4
            r1.<init>(r0, r11)
            yia r6 = new yia
            r6.<init>(r5, r1, r9)
            r2.getClass()
            r1 = r2
            kbf r1 = (defpackage.kbf) r1
            lfd r1 = r1.a()
            pka r1 = r6.x(r1)
            mh4 r5 = new mh4
            r5.<init>(r0, r8)
            mh4 r6 = new mh4
            r6.<init>(r0, r9)
            ue4 r10 = new ue4
            r10.<init>(r9)
            or7 r12 = new or7
            r12.<init>(r5, r6, r10)
            r1.a(r12)
            r0.A0 = r12
        L_0x0127:
            or7 r1 = r0.B0
            boolean r1 = defpackage.o54.y(r1)
            if (r1 != 0) goto L_0x0135
            java.lang.String r1 = "loadRecentStickersAndGifs: skipped, not disposed"
            defpackage.z68.c(r4, r1, new java.lang.Object[0])
            goto L_0x018f
        L_0x0135:
            java.lang.String r1 = "loadRecentStickersAndGifs:"
            defpackage.z68.c(r4, r1, new java.lang.Object[0])
            moe r1 = r0.z
            hs7 r5 = r1.k
            java.lang.Object r5 = r5.get()
            gvc r5 = (defpackage.gvc) r5
            wuc r5 = r5.b()
            java.util.List r6 = defpackage.gvc.h
            jha r5 = r5.a(r6)
            joe r6 = new joe
            r6.<init>(r1, r8)
            yia r1 = new yia
            r1.<init>(r5, r6, r9)
            mh4 r5 = new mh4
            r6 = 15
            r5.<init>(r0, r6)
            yia r6 = new yia
            r6.<init>(r1, r5, r9)
            r2.getClass()
            r1 = r2
            kbf r1 = (defpackage.kbf) r1
            lfd r1 = r1.a()
            pka r1 = r6.x(r1)
            mh4 r5 = new mh4
            r6 = 16
            r5.<init>(r0, r6)
            mh4 r6 = new mh4
            r10 = 17
            r6.<init>(r0, r10)
            ue4 r10 = new ue4
            r10.<init>(r8)
            or7 r8 = new or7
            r8.<init>(r5, r6, r10)
            r1.a(r8)
            r0.B0 = r8
        L_0x018f:
            or7 r1 = r0.E0
            boolean r1 = defpackage.o54.y(r1)
            if (r1 != 0) goto L_0x019d
            java.lang.String r1 = "loadFavoriteStickersPage: skipped, not disposed"
            defpackage.z68.c(r4, r1, new java.lang.Object[0])
            goto L_0x01df
        L_0x019d:
            java.lang.String r1 = "loadFavoriteStickersPage:"
            defpackage.z68.c(r4, r1, new java.lang.Object[0])
            vi5 r1 = r0.b
            yia r1 = r1.a()
            mh4 r5 = new mh4
            r6 = 8
            r5.<init>(r0, r6)
            yia r6 = new yia
            r6.<init>(r1, r5, r9)
            r2.getClass()
            r1 = r2
            kbf r1 = (defpackage.kbf) r1
            lfd r1 = r1.a()
            pka r1 = r6.x(r1)
            mh4 r5 = new mh4
            r6 = 9
            r5.<init>(r0, r6)
            mh4 r6 = new mh4
            r8 = 10
            r6.<init>(r0, r8)
            ue4 r8 = new ue4
            r8.<init>(r3)
            or7 r9 = new or7
            r9.<init>(r5, r6, r8)
            r1.a(r9)
            r0.E0 = r9
        L_0x01df:
            or7 r1 = r0.D0
            boolean r1 = defpackage.o54.y(r1)
            if (r1 != 0) goto L_0x01ed
            java.lang.String r0 = "loadFavoriteStickerSetsPages: skipped, not disposed"
            defpackage.z68.c(r4, r0, new java.lang.Object[0])
            goto L_0x0238
        L_0x01ed:
            java.lang.String r1 = "loadFavoriteStickerSetsPages: "
            defpackage.z68.c(r4, r1, new java.lang.Object[0])
            ai5 r1 = r0.a
            yia r1 = r1.c()
            mh4 r4 = new mh4
            r4.<init>(r0, r7)
            gga r5 = defpackage.m58.f
            dj6 r6 = defpackage.m58.e
            iia r8 = new iia
            r8.<init>(r1, r4, r5, r6)
            mh4 r1 = new mh4
            r1.<init>(r0, r3)
            yia r3 = new yia
            r3.<init>(r8, r1, r11)
            r2.getClass()
            kbf r2 = (defpackage.kbf) r2
            lfd r1 = r2.a()
            pka r1 = r3.x(r1)
            mh4 r2 = new mh4
            r3 = 6
            r2.<init>(r0, r3)
            mh4 r3 = new mh4
            r4 = 7
            r3.<init>(r0, r4)
            ue4 r4 = new ue4
            r4.<init>(r7)
            or7 r5 = new or7
            r5.<init>(r2, r3, r4)
            r1.a(r5)
            r0.D0 = r5
        L_0x0238:
            return
        L_0x0239:
            r0 = r20
            u2a r0 = (defpackage.u2a) r0
            cpe r1 = r0.y
            if (r1 != 0) goto L_0x0245
            r0.Z()
            goto L_0x027c
        L_0x0245:
            d8b r2 = r0.X
            r2.getClass()
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0266
            d8b r1 = r0.X
            boolean r2 = r1.e()
            if (r2 != 0) goto L_0x0259
            goto L_0x027c
        L_0x0259:
            r1.a = r11
            b8b r1 = r1.d
            if (r1 == 0) goto L_0x027c
            r1.o0()
            r1.W()
            goto L_0x027c
        L_0x0266:
            cpe r1 = r0.y
            ru.ok.tamtam.stickers.panel.RelativePanelLayout r2 = r0.z
            int r2 = r2.getPaddingBottom()
            if (r2 != 0) goto L_0x0275
            ch r2 = r0.v
            r2.j(r1)
        L_0x0275:
            d8b r1 = r0.X
            cpe r2 = r0.y
            r1.h(r2)
        L_0x027c:
            java.lang.Object r1 = r0.a
            java.util.Set r1 = (java.util.Set) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0284:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0297
            java.lang.Object r2 = r1.next()
            h1a r2 = (defpackage.h1a) r2
            r0.a0()
            r2.X()
            goto L_0x0284
        L_0x0297:
            return
        L_0x0298:
            r0 = r20
            u58 r0 = (defpackage.u58) r0
            r0.a = r10
            return
        L_0x029f:
            r0 = r20
            u58 r0 = (defpackage.u58) r0
            r0.o = r5
            return
        L_0x02a6:
            r0 = r20
            u58 r0 = (defpackage.u58) r0
            r0.l = r11
            return
        L_0x02ad:
            r0 = r20
            u58 r0 = (defpackage.u58) r0
            r0.d = r11
            return
        L_0x02b4:
            r19.a(r20)
            return
        L_0x02b8:
            r0 = r20
            jcc r0 = (defpackage.jcc) r0
            ykb r1 = new ykb
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 >= r5) goto L_0x030b
            java.lang.String r4 = android.os.Build.MANUFACTURER
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L_0x02e4
            java.lang.String r2 = android.os.Build.DEVICE
            java.lang.String r5 = "F2Q"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 != 0) goto L_0x0309
            java.lang.String r5 = "Q2Q"
            boolean r2 = r5.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x02e4
            goto L_0x0309
        L_0x02e4:
            java.lang.String r2 = "OPPO"
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L_0x02f7
            java.lang.String r2 = "OP4E75L1"
            java.lang.String r5 = android.os.Build.DEVICE
            boolean r2 = r2.equalsIgnoreCase(r5)
            if (r2 == 0) goto L_0x02f7
            goto L_0x0309
        L_0x02f7:
            java.lang.String r2 = "LENOVO"
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L_0x030b
            java.lang.String r2 = "Q706F"
            java.lang.String r4 = android.os.Build.DEVICE
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L_0x030b
        L_0x0309:
            r2 = r11
            goto L_0x030c
        L_0x030b:
            r2 = r10
        L_0x030c:
            java.lang.Class<androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk> r4 = androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk.class
            boolean r2 = r0.a(r4, r2)
            if (r2 == 0) goto L_0x031c
            androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk r2 = new androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk
            r2.<init>()
            r3.add(r2)
        L_0x031c:
            java.lang.String r2 = "XIAOMI"
            java.lang.String r4 = android.os.Build.MANUFACTURER
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L_0x0331
            java.lang.String r2 = "M2101K7AG"
            java.lang.String r4 = android.os.Build.MODEL
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L_0x0331
            r10 = r11
        L_0x0331:
            java.lang.Class<androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk> r2 = androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk.class
            boolean r0 = r0.a(r2, r10)
            if (r0 == 0) goto L_0x0341
            androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk r0 = new androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk
            r0.<init>()
            r3.add(r0)
        L_0x0341:
            r1.<init>((java.util.List) r3)
            defpackage.pn4.a = r1
            ykb r0 = defpackage.pn4.a
            defpackage.ykb.k(r0)
            return
        L_0x034c:
            r3 = r20
            jcc r3 = (defpackage.jcc) r3
            ykb r4 = new ykb
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.Class<androidx.camera.video.internal.compat.quirk.MediaFormatMustNotUseFrameRateToFindEncoderQuirk> r6 = androidx.camera.video.internal.compat.quirk.MediaFormatMustNotUseFrameRateToFindEncoderQuirk.class
            boolean r6 = r3.a(r6, r10)
            if (r6 == 0) goto L_0x0367
            androidx.camera.video.internal.compat.quirk.MediaFormatMustNotUseFrameRateToFindEncoderQuirk r6 = new androidx.camera.video.internal.compat.quirk.MediaFormatMustNotUseFrameRateToFindEncoderQuirk
            r6.<init>()
            r5.add(r6)
        L_0x0367:
            java.util.List r6 = androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk.a
            java.lang.String r6 = android.os.Build.BRAND
            java.lang.String r7 = "Nokia"
            boolean r8 = r7.equalsIgnoreCase(r6)
            java.lang.String r9 = "positivo"
            java.lang.String r12 = "twist 2 pro"
            java.lang.String r13 = "motorola"
            java.lang.String r14 = "moto c"
            java.lang.String r15 = "Nokia 1"
            if (r8 == 0) goto L_0x0387
            java.lang.String r8 = android.os.Build.MODEL
            boolean r8 = r15.equalsIgnoreCase(r8)
            if (r8 == 0) goto L_0x0387
            goto L_0x0402
        L_0x0387:
            boolean r8 = r13.equalsIgnoreCase(r6)
            if (r8 == 0) goto L_0x0397
            java.lang.String r8 = android.os.Build.MODEL
            boolean r8 = r14.equalsIgnoreCase(r8)
            if (r8 == 0) goto L_0x0397
            goto L_0x0402
        L_0x0397:
            java.lang.String r8 = "infinix"
            boolean r8 = r8.equalsIgnoreCase(r6)
            if (r8 == 0) goto L_0x03aa
            java.lang.String r8 = "infinix x650"
            java.lang.String r11 = android.os.Build.MODEL
            boolean r8 = r8.equalsIgnoreCase(r11)
            if (r8 == 0) goto L_0x03aa
            goto L_0x0402
        L_0x03aa:
            java.lang.String r8 = "LGE"
            boolean r8 = r8.equalsIgnoreCase(r6)
            if (r8 == 0) goto L_0x03bd
            java.lang.String r8 = "LG-X230"
            java.lang.String r11 = android.os.Build.MODEL
            boolean r8 = r8.equalsIgnoreCase(r11)
            if (r8 == 0) goto L_0x03bd
            goto L_0x0402
        L_0x03bd:
            java.lang.String r8 = "Huawei"
            boolean r8 = r8.equalsIgnoreCase(r6)
            if (r8 == 0) goto L_0x03d0
            java.lang.String r8 = "mha-l29"
            java.lang.String r11 = android.os.Build.MODEL
            boolean r8 = r8.equalsIgnoreCase(r11)
            if (r8 == 0) goto L_0x03d0
            goto L_0x0402
        L_0x03d0:
            java.lang.String r8 = "Redmi"
            boolean r8 = r8.equalsIgnoreCase(r6)
            if (r8 == 0) goto L_0x03e3
            java.lang.String r8 = "Redmi Note 8 Pro"
            java.lang.String r11 = android.os.Build.MODEL
            boolean r8 = r8.equalsIgnoreCase(r11)
            if (r8 == 0) goto L_0x03e3
            goto L_0x0402
        L_0x03e3:
            boolean r8 = r9.equalsIgnoreCase(r6)
            if (r8 == 0) goto L_0x03f2
            java.lang.String r8 = android.os.Build.MODEL
            boolean r8 = r12.equalsIgnoreCase(r8)
            if (r8 == 0) goto L_0x03f2
            goto L_0x0402
        L_0x03f2:
            java.lang.String r8 = android.os.Build.MODEL
            java.util.Locale r11 = java.util.Locale.US
            java.lang.String r8 = r8.toLowerCase(r11)
            java.util.List r11 = androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk.a
            boolean r8 = r11.contains(r8)
            if (r8 == 0) goto L_0x0404
        L_0x0402:
            r8 = 1
            goto L_0x0405
        L_0x0404:
            r8 = r10
        L_0x0405:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk> r11 = androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk.class
            boolean r8 = r3.a(r11, r8)
            if (r8 == 0) goto L_0x0415
            androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk r8 = new androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk
            r8.<init>()
            r5.add(r8)
        L_0x0415:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk> r8 = androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class
            boolean r8 = r3.a(r8, r10)
            if (r8 == 0) goto L_0x0425
            androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk r8 = new androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk
            r8.<init>()
            r5.add(r8)
        L_0x0425:
            int r8 = android.os.Build.VERSION.SDK_INT
            r11 = 31
            if (r8 < r11) goto L_0x043c
            java.util.HashSet r11 = androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk.b
            java.lang.String r17 = android.os.Build.SOC_MODEL
            java.lang.String r10 = r17.toLowerCase()
            boolean r10 = r11.contains(r10)
            if (r10 == 0) goto L_0x043e
            goto L_0x0461
        L_0x043c:
            java.util.HashSet r10 = androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk.a
        L_0x043e:
            boolean r2 = r2.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x0453
            java.util.HashSet r2 = androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk.a
            java.lang.String r10 = android.os.Build.HARDWARE
            java.lang.String r10 = r10.toLowerCase()
            boolean r2 = r2.contains(r10)
            if (r2 == 0) goto L_0x0453
            goto L_0x0461
        L_0x0453:
            java.util.HashSet r2 = androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk.c
            java.lang.String r10 = android.os.Build.MODEL
            java.lang.String r10 = r10.toLowerCase()
            boolean r2 = r2.contains(r10)
            if (r2 == 0) goto L_0x0463
        L_0x0461:
            r2 = 1
            goto L_0x0464
        L_0x0463:
            r2 = 0
        L_0x0464:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk> r10 = androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk.class
            boolean r2 = r3.a(r10, r2)
            if (r2 == 0) goto L_0x0474
            androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk r2 = new androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk
            r2.<init>()
            r5.add(r2)
        L_0x0474:
            boolean r2 = androidx.camera.video.internal.compat.quirk.ReportedVideoQualityNotSupportedQuirk.e()
            java.lang.String r10 = "vivo 1820"
            if (r2 != 0) goto L_0x04a0
            boolean r2 = androidx.camera.video.internal.compat.quirk.ReportedVideoQualityNotSupportedQuirk.f()
            if (r2 != 0) goto L_0x04a0
            boolean r1 = r1.equalsIgnoreCase(r6)
            if (r1 == 0) goto L_0x0491
            java.lang.String r1 = android.os.Build.MODEL
            boolean r1 = r10.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0491
            goto L_0x04a0
        L_0x0491:
            boolean r1 = androidx.camera.video.internal.compat.quirk.ReportedVideoQualityNotSupportedQuirk.g()
            if (r1 != 0) goto L_0x04a0
            boolean r1 = androidx.camera.video.internal.compat.quirk.ReportedVideoQualityNotSupportedQuirk.h()
            if (r1 == 0) goto L_0x049e
            goto L_0x04a0
        L_0x049e:
            r1 = 0
            goto L_0x04a1
        L_0x04a0:
            r1 = 1
        L_0x04a1:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.ReportedVideoQualityNotSupportedQuirk> r2 = androidx.camera.video.internal.compat.quirk.ReportedVideoQualityNotSupportedQuirk.class
            boolean r1 = r3.a(r2, r1)
            if (r1 == 0) goto L_0x04b1
            androidx.camera.video.internal.compat.quirk.ReportedVideoQualityNotSupportedQuirk r1 = new androidx.camera.video.internal.compat.quirk.ReportedVideoQualityNotSupportedQuirk
            r1.<init>()
            r5.add(r1)
        L_0x04b1:
            java.util.List r1 = androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk.a
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r2 = r1.toUpperCase()
            java.util.List r11 = androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk.a
            boolean r2 = r11.contains(r2)
            java.lang.Class<androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk> r11 = androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk.class
            boolean r2 = r3.a(r11, r2)
            if (r2 == 0) goto L_0x04cf
            androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk r2 = new androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk
            r2.<init>()
            r5.add(r2)
        L_0x04cf:
            boolean r2 = r9.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x04dd
            boolean r2 = r12.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x04dd
            r2 = 1
            goto L_0x04de
        L_0x04dd:
            r2 = 0
        L_0x04de:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.VideoEncoderCrashQuirk> r11 = androidx.camera.video.internal.compat.quirk.VideoEncoderCrashQuirk.class
            boolean r2 = r3.a(r11, r2)
            if (r2 == 0) goto L_0x04ee
            androidx.camera.video.internal.compat.quirk.VideoEncoderCrashQuirk r2 = new androidx.camera.video.internal.compat.quirk.VideoEncoderCrashQuirk
            r2.<init>()
            r5.add(r2)
        L_0x04ee:
            boolean r2 = r0.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x04fd
            java.lang.String r2 = "SM-J260F"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x04fd
            goto L_0x0556
        L_0x04fd:
            boolean r2 = r0.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x050c
            java.lang.String r2 = "SM-J400G"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x050c
            goto L_0x0556
        L_0x050c:
            boolean r2 = r0.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x051b
            java.lang.String r2 = "SM-J530F"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x051b
            goto L_0x0556
        L_0x051b:
            boolean r2 = r0.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x052a
            java.lang.String r2 = "sm-j600g"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x052a
            goto L_0x0556
        L_0x052a:
            boolean r2 = r0.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x0539
            java.lang.String r2 = "SM-J701F"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x0539
            goto L_0x0556
        L_0x0539:
            boolean r2 = r0.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x0548
            java.lang.String r2 = "SM-G610M"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x0548
            goto L_0x0556
        L_0x0548:
            boolean r2 = r0.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x0558
            java.lang.String r2 = "SM-J710MN"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x0558
        L_0x0556:
            r2 = 1
            goto L_0x0559
        L_0x0558:
            r2 = 0
        L_0x0559:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.ExcludeStretchedVideoQualityQuirk> r11 = androidx.camera.video.internal.compat.quirk.ExcludeStretchedVideoQualityQuirk.class
            boolean r2 = r3.a(r11, r2)
            if (r2 == 0) goto L_0x0569
            androidx.camera.video.internal.compat.quirk.ExcludeStretchedVideoQualityQuirk r2 = new androidx.camera.video.internal.compat.quirk.ExcludeStretchedVideoQualityQuirk
            r2.<init>()
            r5.add(r2)
        L_0x0569:
            boolean r2 = r9.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x0576
            boolean r2 = r12.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x0576
            goto L_0x0586
        L_0x0576:
            java.lang.String r2 = "itel"
            boolean r2 = r2.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x0588
            java.lang.String r2 = "itel w6004"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x0588
        L_0x0586:
            r2 = 1
            goto L_0x0589
        L_0x0588:
            r2 = 0
        L_0x0589:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.MediaStoreVideoCannotWrite> r9 = androidx.camera.video.internal.compat.quirk.MediaStoreVideoCannotWrite.class
            boolean r2 = r3.a(r9, r2)
            if (r2 == 0) goto L_0x0599
            androidx.camera.video.internal.compat.quirk.MediaStoreVideoCannotWrite r2 = new androidx.camera.video.internal.compat.quirk.MediaStoreVideoCannotWrite
            r2.<init>()
            r5.add(r2)
        L_0x0599:
            java.lang.String r2 = "Sony"
            boolean r2 = r2.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x05ab
            java.lang.String r2 = "G3125"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x05ab
            r2 = 1
            goto L_0x05ac
        L_0x05ab:
            r2 = 0
        L_0x05ac:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk> r9 = androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk.class
            boolean r2 = r3.a(r9, r2)
            if (r2 == 0) goto L_0x05bc
            androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk r2 = new androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk
            r2.<init>()
            r5.add(r2)
        L_0x05bc:
            r0.equalsIgnoreCase(r6)
            java.lang.Class<androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk> r0 = androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class
            r2 = 0
            boolean r0 = r3.a(r0, r2)
            if (r0 == 0) goto L_0x05d0
            androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk r0 = new androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk
            r0.<init>()
            r5.add(r0)
        L_0x05d0:
            r0 = 34
            if (r8 >= r0) goto L_0x05d6
            r0 = 1
            goto L_0x05d7
        L_0x05d6:
            r0 = 0
        L_0x05d7:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk> r2 = androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk.class
            boolean r0 = r3.a(r2, r0)
            if (r0 == 0) goto L_0x05e7
            androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk r0 = new androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk
            r0.<init>()
            r5.add(r0)
        L_0x05e7:
            java.util.List r0 = androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk.a
            java.lang.String r0 = "oppo"
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x0600
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r1.toLowerCase(r0)
            java.util.List r2 = androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk.a
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0600
            goto L_0x065d
        L_0x0600:
            java.lang.String r0 = "lge"
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x0611
            java.lang.String r0 = "lg-m250"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0611
            goto L_0x065d
        L_0x0611:
            boolean r0 = r13.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x061e
            boolean r0 = r14.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x061e
            goto L_0x065d
        L_0x061e:
            java.lang.String r0 = "realme"
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x062f
            java.lang.String r0 = "rmx1941"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x062f
            goto L_0x065d
        L_0x062f:
            java.lang.String r0 = "Xiaomi"
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x0640
            java.lang.String r0 = "Redmi 6A"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0640
            goto L_0x065d
        L_0x0640:
            java.lang.String r0 = "vivo"
            boolean r2 = r0.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x064f
            boolean r2 = r10.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x064f
            goto L_0x065d
        L_0x064f:
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x065f
            java.lang.String r0 = "VIVO Y17"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x065f
        L_0x065d:
            r0 = 1
            goto L_0x0660
        L_0x065f:
            r0 = 0
        L_0x0660:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk> r2 = androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk.class
            boolean r0 = r3.a(r2, r0)
            if (r0 == 0) goto L_0x0670
            androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk r0 = new androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk
            r0.<init>()
            r5.add(r0)
        L_0x0670:
            boolean r0 = r13.equalsIgnoreCase(r6)
            java.lang.String r2 = "moto e5 play"
            if (r0 == 0) goto L_0x0680
            boolean r0 = r2.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0680
            r0 = 1
            goto L_0x0681
        L_0x0680:
            r0 = 0
        L_0x0681:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.ExtraSupportedResolutionQuirk> r8 = androidx.camera.video.internal.compat.quirk.ExtraSupportedResolutionQuirk.class
            boolean r0 = r3.a(r8, r0)
            if (r0 == 0) goto L_0x0691
            androidx.camera.video.internal.compat.quirk.ExtraSupportedResolutionQuirk r0 = new androidx.camera.video.internal.compat.quirk.ExtraSupportedResolutionQuirk
            r0.<init>()
            r5.add(r0)
        L_0x0691:
            boolean r0 = r13.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x069f
            boolean r0 = r2.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x069f
            r0 = 1
            goto L_0x06a0
        L_0x069f:
            r0 = 0
        L_0x06a0:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk> r2 = androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk.class
            boolean r0 = r3.a(r2, r0)
            if (r0 == 0) goto L_0x06b0
            androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk r0 = new androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk
            r0.<init>()
            r5.add(r0)
        L_0x06b0:
            boolean r0 = r7.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x06be
            boolean r0 = r15.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x06be
            r0 = 1
            goto L_0x06bf
        L_0x06be:
            r0 = 0
        L_0x06bf:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk> r2 = androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk.class
            boolean r0 = r3.a(r2, r0)
            if (r0 == 0) goto L_0x06cf
            androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk r0 = new androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk
            r0.<init>()
            r5.add(r0)
        L_0x06cf:
            boolean r0 = r13.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x06dd
            boolean r0 = r14.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x06dd
            r0 = 1
            goto L_0x06de
        L_0x06dd:
            r0 = 0
        L_0x06de:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk> r2 = androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class
            boolean r0 = r3.a(r2, r0)
            if (r0 == 0) goto L_0x06ee
            androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk r0 = new androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk
            r0.<init>()
            r5.add(r0)
        L_0x06ee:
            boolean r0 = r13.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x06fc
            boolean r0 = r14.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x06fc
            r0 = 1
            goto L_0x06fd
        L_0x06fc:
            r0 = 0
        L_0x06fd:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk> r2 = androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk.class
            boolean r0 = r3.a(r2, r0)
            if (r0 == 0) goto L_0x070d
            androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk r0 = new androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk
            r0.<init>()
            r5.add(r0)
        L_0x070d:
            boolean r0 = r7.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x071b
            boolean r0 = r15.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x071b
            r0 = 1
            goto L_0x071c
        L_0x071b:
            r0 = 0
        L_0x071c:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk> r2 = androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk.class
            boolean r0 = r3.a(r2, r0)
            if (r0 == 0) goto L_0x072c
            androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk r0 = new androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk
            r0.<init>()
            r5.add(r0)
        L_0x072c:
            boolean r0 = r13.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x073a
            boolean r0 = r14.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x073a
            r10 = 1
            goto L_0x073b
        L_0x073a:
            r10 = 0
        L_0x073b:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk> r0 = androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk.class
            boolean r0 = r3.a(r0, r10)
            if (r0 == 0) goto L_0x074b
            androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk r0 = new androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk
            r0.<init>()
            r5.add(r0)
        L_0x074b:
            r4.<init>((java.util.List) r5)
            defpackage.on4.a = r4
            ykb r0 = defpackage.on4.a
            defpackage.ykb.k(r0)
            return
        L_0x0756:
            r2 = r20
            jcc r2 = (defpackage.jcc) r2
            ykb r3 = new ykb
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r5 = android.os.Build.BRAND
            java.lang.String r6 = "HUAWEI"
            boolean r6 = r6.equalsIgnoreCase(r5)
            if (r6 == 0) goto L_0x0776
            java.lang.String r6 = "SNE-LX1"
            java.lang.String r7 = android.os.Build.MODEL
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x0776
            goto L_0x0788
        L_0x0776:
            java.lang.String r6 = "HONOR"
            boolean r6 = r6.equalsIgnoreCase(r5)
            if (r6 == 0) goto L_0x078a
            java.lang.String r6 = "STK-LX1"
            java.lang.String r7 = android.os.Build.MODEL
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x078a
        L_0x0788:
            r6 = 1
            goto L_0x07e6
        L_0x078a:
            java.lang.String r6 = android.os.Build.FINGERPRINT
            java.lang.String r7 = "generic"
            boolean r8 = r6.startsWith(r7)
            if (r8 != 0) goto L_0x07e5
            java.lang.String r8 = "unknown"
            boolean r6 = r6.startsWith(r8)
            if (r6 != 0) goto L_0x07e5
            java.lang.String r6 = android.os.Build.MODEL
            java.lang.String r8 = "google_sdk"
            boolean r9 = r6.contains(r8)
            if (r9 != 0) goto L_0x07e5
            java.lang.String r9 = "Emulator"
            boolean r9 = r6.contains(r9)
            if (r9 != 0) goto L_0x07e5
            java.lang.String r9 = "Cuttlefish"
            boolean r9 = r6.contains(r9)
            if (r9 != 0) goto L_0x07e5
            java.lang.String r9 = "Android SDK built for x86"
            boolean r6 = r6.contains(r9)
            if (r6 != 0) goto L_0x07e5
            java.lang.String r6 = android.os.Build.MANUFACTURER
            java.lang.String r9 = "Genymotion"
            boolean r6 = r6.contains(r9)
            if (r6 != 0) goto L_0x07e5
            boolean r6 = r5.startsWith(r7)
            if (r6 == 0) goto L_0x07d6
            java.lang.String r6 = android.os.Build.DEVICE
            boolean r6 = r6.startsWith(r7)
            if (r6 != 0) goto L_0x07e5
        L_0x07d6:
            java.lang.String r6 = android.os.Build.PRODUCT
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x07e5
            java.lang.String r6 = android.os.Build.HARDWARE
            java.lang.String r7 = "ranchu"
            r6.contains(r7)
        L_0x07e5:
            r6 = 0
        L_0x07e6:
            java.lang.Class<androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk> r7 = androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk.class
            boolean r6 = r2.a(r7, r6)
            if (r6 == 0) goto L_0x07f6
            androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk r6 = new androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk
            r6.<init>()
            r4.add(r6)
        L_0x07f6:
            java.lang.Class<androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk> r6 = androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk.class
            r7 = 1
            boolean r6 = r2.a(r6, r7)
            if (r6 == 0) goto L_0x0807
            androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk r6 = new androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk
            r6.<init>()
            r4.add(r6)
        L_0x0807:
            java.util.HashSet r6 = androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk.a
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r7 = r5.toUpperCase(r6)
            java.lang.String r8 = android.os.Build.MODEL
            java.lang.String r9 = r8.toUpperCase(r6)
            java.util.HashSet r10 = androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk.a
            android.util.Pair r7 = android.util.Pair.create(r7, r9)
            boolean r7 = r10.contains(r7)
            java.lang.Class<androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk> r9 = androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk.class
            boolean r7 = r2.a(r9, r7)
            if (r7 == 0) goto L_0x082f
            androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk r7 = new androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk
            r7.<init>()
            r4.add(r7)
        L_0x082f:
            java.util.HashSet r7 = androidx.camera.core.internal.compat.quirk.LowMemoryQuirk.a
            java.lang.String r8 = r8.toUpperCase(r6)
            boolean r7 = r7.contains(r8)
            java.lang.Class<androidx.camera.core.internal.compat.quirk.LowMemoryQuirk> r8 = androidx.camera.core.internal.compat.quirk.LowMemoryQuirk.class
            boolean r7 = r2.a(r8, r7)
            if (r7 == 0) goto L_0x0849
            androidx.camera.core.internal.compat.quirk.LowMemoryQuirk r7 = new androidx.camera.core.internal.compat.quirk.LowMemoryQuirk
            r7.<init>()
            r4.add(r7)
        L_0x0849:
            java.util.HashSet r7 = androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk.a
            boolean r7 = r0.equalsIgnoreCase(r5)
            if (r7 != 0) goto L_0x0871
            java.lang.String r7 = android.os.Build.BRAND
            boolean r1 = r1.equalsIgnoreCase(r7)
            if (r1 == 0) goto L_0x086b
            java.util.HashSet r1 = androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk.a
            java.lang.String r7 = android.os.Build.MODEL
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r7 = r7.toUpperCase(r8)
            boolean r1 = r1.contains(r7)
            if (r1 == 0) goto L_0x086b
            r1 = 1
            goto L_0x086c
        L_0x086b:
            r1 = 0
        L_0x086c:
            if (r1 == 0) goto L_0x086f
            goto L_0x0871
        L_0x086f:
            r1 = 0
            goto L_0x0872
        L_0x0871:
            r1 = 1
        L_0x0872:
            java.lang.Class<androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk> r7 = androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk.class
            boolean r1 = r2.a(r7, r1)
            if (r1 == 0) goto L_0x0882
            androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk r1 = new androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk
            r1.<init>()
            r4.add(r1)
        L_0x0882:
            java.util.HashSet r1 = androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk.a
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto L_0x089a
            java.util.HashSet r0 = androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk.a
            java.lang.String r1 = android.os.Build.DEVICE
            java.lang.String r1 = r1.toUpperCase(r6)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x089a
            r10 = 1
            goto L_0x089b
        L_0x089a:
            r10 = 0
        L_0x089b:
            java.lang.Class<androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk> r0 = androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk.class
            boolean r0 = r2.a(r0, r10)
            if (r0 == 0) goto L_0x08ab
            androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk r0 = new androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk
            r0.<init>()
            r4.add(r0)
        L_0x08ab:
            r3.<init>((java.util.List) r4)
            defpackage.nn4.a = r3
            ykb r0 = defpackage.nn4.a
            defpackage.ykb.k(r0)
            return
        L_0x08b6:
            r0 = r20
            g1a r0 = (defpackage.g1a) r0
            r0.X(r7)
            return
        L_0x08be:
            r0 = r20
            g1a r0 = (defpackage.g1a) r0
            r1 = 1
            r0.X(r1)
            return
        L_0x08c7:
            r0 = r20
            g1a r0 = (defpackage.g1a) r0
            r0.X(r8)
            return
        L_0x08cf:
            r0 = r20
            g1a r0 = (defpackage.g1a) r0
            w58 r1 = r0.A0
            long r1 = r1.h
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x08dc
            goto L_0x0900
        L_0x08dc:
            java.util.concurrent.ConcurrentHashMap r3 = r0.b
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            pf8 r1 = (defpackage.pf8) r1
            if (r1 == 0) goto L_0x0900
            ru.ok.messages.location.FrgLocationMap r2 = r0.z0
            if (r2 == 0) goto L_0x0900
            f2a r2 = r0.a
            r3 = r2
            f3a r3 = (defpackage.f3a) r3
            s58 r1 = r1.a
            double r4 = r1.a
            double r6 = r1.b
            r8 = 0
            r3.a0(r4, r6, r8)
            r1 = 1
            r0.D0 = r1
        L_0x0900:
            return
        L_0x0901:
            r0 = r20
            g1a r0 = (defpackage.g1a) r0
            w58 r1 = r0.A0
            long r1 = r1.h
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x095a
            ru.ok.messages.location.FrgLocationMap r3 = r0.z0
            if (r3 != 0) goto L_0x0912
            goto L_0x095a
        L_0x0912:
            java.util.concurrent.ConcurrentHashMap r4 = r0.b
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r1 = r4.get(r1)
            pf8 r1 = (defpackage.pf8) r1
            if (r1 != 0) goto L_0x0921
            goto L_0x095a
        L_0x0921:
            w58 r2 = r0.A0
            long r7 = r2.o
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0957
            java.util.concurrent.ConcurrentHashMap r2 = r0.c
            long r4 = r1.c
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r2 = r2.get(r4)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x0957
            java.util.Iterator r2 = r2.iterator()
        L_0x093d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0957
            java.lang.Object r4 = r2.next()
            pf8 r4 = (defpackage.pf8) r4
            long r5 = r4.j
            w58 r7 = r0.A0
            long r7 = r7.o
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x093d
            r3.h3(r4)
            goto L_0x095a
        L_0x0957:
            r3.h3(r1)
        L_0x095a:
            return
        L_0x095b:
            r0 = r20
            g1a r0 = (defpackage.g1a) r0
            ru.ok.messages.location.FrgLocationMap r1 = r0.z0
            if (r1 != 0) goto L_0x0965
            goto L_0x0ac7
        L_0x0965:
            w58 r2 = r0.A0
            int r2 = r2.d
            r3 = -1
            java.lang.String r5 = "ru.ok.tamtam.extra.LOCATION"
            r6 = 0
            if (r2 != r9) goto L_0x0a10
            s58 r2 = r0.B0
            boolean r2 = r2.a()
            if (r2 != 0) goto L_0x0981
            java.lang.String r0 = "g1a"
            java.lang.String r1 = "No last location marker. Ignore click"
            defpackage.z68.c(r0, r1, new java.lang.Object[0])
            goto L_0x0ac7
        L_0x0981:
            java.util.concurrent.ConcurrentHashMap r2 = r0.b
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r2.remove(r6)
            s58 r2 = r0.B0
            w58 r6 = r0.A0
            v58 r6 = r6.e
            w58 r7 = r1.G1
            int r7 = r7.c
            java.lang.String r8 = "LIVE_LOCATION_SEND"
            r9 = 1
            if (r7 != r9) goto L_0x09da
            sjd r3 = r1.q1
            nd r3 = r3.c()
            java.lang.String r5 = "VIEWER"
            r3.f(r8, r5)
            long r7 = r1.H1
            bvd r3 = defpackage.cjf.I(r7)
            r3.m = r2
            long r5 = r6.b
            r3.o = r5
            r2 = 1096810496(0x41600000, float:14.0)
            r3.n = r2
            cvd r2 = new cvd
            r2.<init>(r3)
            dm4 r3 = r1.p1
            java.lang.Object r3 = r3.b
            id3 r3 = (defpackage.id3) r3
            qra r3 = (defpackage.qra) r3
            q4 r3 = r3.getAccessor()
            java.lang.Class<jqg> r5 = defpackage.jqg.class
            java.lang.Object r3 = r3.g(r5)
            jqg r3 = (defpackage.jqg) r3
            r3.a(r2)
            android.content.Context r1 = r1.O1()
            int r2 = defpackage.qad.M3
            defpackage.hi7.a0(r2, r1)
            goto L_0x0a01
        L_0x09da:
            sjd r7 = r1.q1
            nd r7 = r7.c()
            java.lang.String r9 = "PICKER"
            r7.f(r8, r9)
            m5 r1 = r1.X2()
            if (r1 != 0) goto L_0x09ec
            goto L_0x0a01
        L_0x09ec:
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            r7.putExtra(r5, r2)
            java.lang.String r2 = "ru.ok.tamtam.extra.DURATION"
            long r5 = r6.b
            r7.putExtra(r2, r5)
            r1.setResult(r3, r7)
            r1.finish()
        L_0x0a01:
            zj0 r1 = new zj0
            r2 = 14
            r1.<init>(r2)
            r0.Y(r1)
            r0.e0(r4)
            goto L_0x0ac7
        L_0x0a10:
            f2a r2 = r0.a
            f3a r2 = (defpackage.f3a) r2
            qd8 r4 = r2.e0()
            if (r4 != 0) goto L_0x0a1c
            goto L_0x0ac7
        L_0x0a1c:
            pf8 r8 = r0.C0
            s58 r8 = r8.a
            boolean r8 = r8.a()
            if (r8 != 0) goto L_0x0a44
            double[] r2 = r2.d0()
            pf8 r8 = r0.C0
            of8 r8 = r8.a()
            s58 r9 = new s58
            r10 = 0
            r10 = r2[r10]
            r12 = 1
            r12 = r2[r12]
            r9.<init>(r10, r12)
            r8.a = r9
            pf8 r2 = new pf8
            r2.<init>(r8)
            r0.C0 = r2
        L_0x0a44:
            pf8 r0 = r0.C0
            s58 r0 = r0.a
            m5 r2 = r1.X2()
            if (r2 != 0) goto L_0x0a50
            goto L_0x0ac7
        L_0x0a50:
            pd6 r8 = r1.B1
            float r4 = r4.g
            if (r8 == 0) goto L_0x0a76
            int r8 = r1.I1
            if (r8 == 0) goto L_0x0a76
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r6 = "location_data"
            r5.putExtra(r6, r0)
            java.lang.String r0 = "zoom"
            r5.putExtra(r0, r4)
            pd6 r0 = r1.B1
            int r1 = r1.I1
            one.me.chatscreen.ChatScreen r0 = (one.me.chatscreen.ChatScreen) r0
            r0.D0(r1, r3, r5)
            r2.onBackPressed()
            goto L_0x0ac7
        L_0x0a76:
            g1a r8 = r1.C1
            w58 r9 = r8.A0
            f2a r9 = r8.a
            f3a r9 = (defpackage.f3a) r9
            r9.e0()
            s58 r8 = r8.B0
            taf r9 = r1.E1
            double r11 = r0.a
            double r13 = r8.a
            r10 = r9
            be r10 = (defpackage.be) r10
            double r6 = r0.b
            double r8 = r8.b
            r15 = r13
            r13 = r6
            r17 = r8
            boolean r6 = r10.f(r11, r13, r15, r17)
            if (r6 != 0) goto L_0x0aa5
            sjd r6 = r1.q1
            nd r6 = r6.c()
            java.lang.String r7 = "LOCATION_SEND_DIFFERENT_LOCATION"
            r6.e(r7)
        L_0x0aa5:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            r6.putExtra(r5, r0)
            java.lang.String r0 = "ru.ok.tamtam.extra.ZOOM"
            r6.putExtra(r0, r4)
            android.os.Bundle r0 = r1.x
            if (r0 == 0) goto L_0x0ac1
            java.lang.String r1 = "ru.ok.tamtam.extra.REQUEST_MESSAGE_ID"
            r4 = 0
            long r4 = r0.getLong(r1, r4)
            r6.putExtra(r1, r4)
        L_0x0ac1:
            r2.setResult(r3, r6)
            r2.finish()
        L_0x0ac7:
            return
        L_0x0ac8:
            r0 = r20
            g1a r0 = (defpackage.g1a) r0
            r0.W()
            return
        L_0x0ad0:
            r0 = r20
            g1a r0 = (defpackage.g1a) r0
            eud r1 = r0.v0
            r1.K()
            s58 r1 = r0.B0
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x0ae3
            goto L_0x0b5d
        L_0x0ae3:
            w58 r1 = r0.A0
            int r1 = r1.d
            r2 = 1
            if (r1 == r2) goto L_0x0aec
            r10 = 1
            goto L_0x0aed
        L_0x0aec:
            r10 = 0
        L_0x0aed:
            r0.D0 = r10
            pf8 r1 = r0.C0
            s58 r1 = r1.a
            double r10 = r1.a
            s58 r2 = r0.B0
            double r14 = r2.a
            taf r3 = r0.w
            r9 = r3
            be r9 = (defpackage.be) r9
            double r12 = r1.b
            double r1 = r2.b
            r16 = r1
            boolean r1 = r9.f(r10, r12, r14, r16)
            f2a r2 = r0.a
            if (r1 != 0) goto L_0x0b30
            w58 r1 = r0.A0
            int r1 = r1.d
            if (r1 != r8) goto L_0x0b30
            pf8 r1 = r0.C0
            of8 r1 = r1.a()
            s58 r3 = new s58
            s58 r4 = r0.B0
            double r5 = r4.a
            double r7 = r4.b
            r3.<init>(r5, r7)
            r1.a = r3
            pf8 r3 = new pf8
            r3.<init>(r1)
            r0.C0 = r3
            r0.a0()
            goto L_0x0b50
        L_0x0b30:
            pf8 r1 = r0.C0
            of8 r1 = r1.a()
            s58 r3 = new s58
            s58 r4 = r0.B0
            double r5 = r4.a
            double r7 = r4.b
            r3.<init>(r5, r7)
            r1.a = r3
            pf8 r3 = new pf8
            r3.<init>(r1)
            r0.C0 = r3
            r1 = r2
            f3a r1 = (defpackage.f3a) r1
            r1.g0()
        L_0x0b50:
            r3 = r2
            f3a r3 = (defpackage.f3a) r3
            s58 r0 = r0.B0
            double r4 = r0.a
            double r6 = r0.b
            r8 = 1
            r3.a0(r4, r6, r8)
        L_0x0b5d:
            return
        L_0x0b5e:
            r0 = r20
            g1a r0 = (defpackage.g1a) r0
            ru.ok.messages.location.FrgLocationMap r0 = r0.z0
            androidx.fragment.app.b r1 = r0.M1()
            boolean r2 = r1 instanceof ru.ok.messages.location.ActLocationMap
            if (r2 == 0) goto L_0x0b70
            r0.U2()
            goto L_0x0b73
        L_0x0b70:
            r1.onBackPressed()
        L_0x0b73:
            return
        L_0x0b74:
            r0 = r20
            g1a r0 = (defpackage.g1a) r0
            f2a r1 = r0.a
            f3a r1 = (defpackage.f3a) r1
            double[] r1 = r1.d0()
            pf8 r2 = r0.C0
            of8 r2 = r2.a()
            s58 r3 = new s58
            r4 = 0
            r4 = r1[r4]
            r6 = 1
            r6 = r1[r6]
            r3.<init>(r4, r6)
            r2.a = r3
            pf8 r1 = new pf8
            r1.<init>(r2)
            r0.C0 = r1
            w58 r1 = r0.A0
            int r1 = r1.d
            if (r1 != r8) goto L_0x0ba3
            r0.a0()
        L_0x0ba3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zj0.accept(java.lang.Object):void");
    }
}
