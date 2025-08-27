package ru.ok.android.externcalls.sdk.audio.internal.tracer;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import ru.ok.android.externcalls.sdk.audio.BuildConfig;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lxof;", "invoke", "()Lxof;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class TracerLiteFacade$tracerLite$2 extends Lambda implements Function0<xof> {
    final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TracerLiteFacade$tracerLite$2(Context context) {
        super(0);
        this.$context = context;
    }

    public final xof invoke() {
        Context applicationContext = this.$context.getApplicationContext();
        AnonymousClass1 r1 = AnonymousClass1.INSTANCE;
        vof vof = new vof();
        r1.invoke(vof);
        xof xof = new xof(applicationContext, BuildConfig.LIBRARY_PACKAGE_NAME, new xe8(vof));
        xof.b(TracerLiteFacade.KEY_AUDIOMANAGER_VERSION, BuildConfig.SDK_VERSION);
        return xof;
    }
}
