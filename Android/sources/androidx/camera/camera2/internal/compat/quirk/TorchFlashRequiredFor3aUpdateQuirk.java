package androidx.camera.camera2.internal.compat.quirk;

import java.util.Arrays;
import java.util.List;

public class TorchFlashRequiredFor3aUpdateQuirk implements icc {
    public static final List b = Arrays.asList(new String[]{"PIXEL 6A", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7A", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"});
    public final qt1 a;

    public TorchFlashRequiredFor3aUpdateQuirk(qt1 qt1) {
        this.a = qt1;
    }
}
