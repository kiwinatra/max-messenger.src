package ru.ok.android.externcalls.sdk.audio.internal.impl3;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;

@SourceDebugExtension({"SMAP\nCallsAudioManagerV3Impl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallsAudioManagerV3Impl.kt\nru/ok/android/externcalls/sdk/audio/internal/impl3/CallsAudioManagerV3Impl$hasWiredHeadsetAsync$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,895:1\n288#2,2:896\n*S KotlinDebug\n*F\n+ 1 CallsAudioManagerV3Impl.kt\nru/ok/android/externcalls/sdk/audio/internal/impl3/CallsAudioManagerV3Impl$hasWiredHeadsetAsync$1\n*L\n166#1:896,2\n*E\n"})
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class CallsAudioManagerV3Impl$hasWiredHeadsetAsync$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function1<Boolean, Unit> $onSuccess;
    final /* synthetic */ CallsAudioManagerV3Impl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallsAudioManagerV3Impl$hasWiredHeadsetAsync$1(Function1<? super Boolean, Unit> function1, CallsAudioManagerV3Impl callsAudioManagerV3Impl) {
        super(0);
        this.$onSuccess = function1;
        this.this$0 = callsAudioManagerV3Impl;
    }

    public final void invoke() {
        Object obj;
        Function1<Boolean, Unit> function1 = this.$onSuccess;
        Iterator it = this.this$0.callsAudioDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((CallsAudioDeviceInfo) obj).getDeviceType() == CallsAudioManager.AudioDeviceType.WIRED_HEADSET) {
                break;
            }
        }
        function1.invoke(Boolean.valueOf(obj != null));
    }
}
