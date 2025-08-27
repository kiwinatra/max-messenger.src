package defpackage;

import kotlin.jvm.functions.Function0;
import ru.ok.tamtam.android.calls.MediaProjectionService;

/* renamed from: qu8  reason: default package */
public final /* synthetic */ class qu8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaProjectionService b;

    public /* synthetic */ qu8(MediaProjectionService mediaProjectionService, int i) {
        this.a = i;
        this.b = mediaProjectionService;
    }

    public final Object invoke() {
        MediaProjectionService mediaProjectionService = this.b;
        switch (this.a) {
            case 0:
                int i = MediaProjectionService.v;
                return ((sjd) o5a.R(mediaProjectionService)).k();
            default:
                int i2 = MediaProjectionService.v;
                return ((sjd) o5a.R(mediaProjectionService)).o();
        }
    }
}
