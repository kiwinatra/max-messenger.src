package ru.ok.android.externcalls.sdk.ui;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.webrtc.RendererCommon;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\t\u0010\nJ+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\t\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000bH&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u001d\u0010\u001eJG\u0010%\u001a\u00020\u000f26\u0010\u001c\u001a2\u0012\u0013\u0012\u00110 ¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110 ¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000f0\u001fH&¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000fH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000fH&¢\u0006\u0004\b)\u0010(R\u0014\u0010,\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001c\u0010/\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b-\u0010+\"\u0004\b.\u0010\u0011ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u00060À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/ui/RendererView;", "", "Lnd1;", "renderer", "Lorg/webrtc/RendererCommon$RendererEvents;", "rendererEvents", "Lorg/webrtc/RendererCommon$GlDrawer;", "drawer", "", "init", "(Lnd1;Lorg/webrtc/RendererCommon$RendererEvents;Lorg/webrtc/RendererCommon$GlDrawer;)Z", "Lru/ok/android/externcalls/sdk/ui/FrameDecorator;", "frameDecorator", "(Lnd1;Lorg/webrtc/RendererCommon$RendererEvents;Lru/ok/android/externcalls/sdk/ui/FrameDecorator;)Z", "mirror", "", "setMirror", "(Z)V", "Lorg/webrtc/RendererCommon$ScalingType;", "scalingType", "setScalingType", "(Lorg/webrtc/RendererCommon$ScalingType;)V", "scalingTypeMatchOrientation", "scalingTypeMismatchOrientation", "(Lorg/webrtc/RendererCommon$ScalingType;Lorg/webrtc/RendererCommon$ScalingType;)V", "decorator", "setFrameDecorator", "(Lru/ok/android/externcalls/sdk/ui/FrameDecorator;)V", "listener", "setRenderEventsListener", "(Lorg/webrtc/RendererCommon$RendererEvents;)V", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "width", "height", "setFrameSizeListener", "(Lkotlin/jvm/functions/Function2;)V", "clearImage", "()V", "release", "getHasImage", "()Z", "hasImage", "getUseAlternateLayout", "setUseAlternateLayout", "useAlternateLayout", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public interface RendererView {
    static /* synthetic */ boolean init$default(RendererView rendererView, nd1 nd1, RendererCommon.RendererEvents rendererEvents, FrameDecorator frameDecorator, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                frameDecorator = FrameDecorator.Companion.getEMPTY();
            }
            return rendererView.init(nd1, rendererEvents, frameDecorator);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
    }

    void clearImage() {
    }

    boolean getHasImage();

    boolean getUseAlternateLayout();

    @Deprecated(message = "use init(CallOpenGLRenderer, RendererCommon.RendererEvents, FrameDecorator)")
    boolean init(nd1 nd1, RendererCommon.RendererEvents rendererEvents, RendererCommon.GlDrawer glDrawer);

    boolean init(nd1 nd1, RendererCommon.RendererEvents rendererEvents, FrameDecorator frameDecorator);

    void release();

    void setFrameDecorator(FrameDecorator frameDecorator);

    void setFrameSizeListener(Function2<? super Integer, ? super Integer, Unit> function2);

    void setMirror(boolean z) {
    }

    void setRenderEventsListener(RendererCommon.RendererEvents rendererEvents);

    void setScalingType(RendererCommon.ScalingType scalingType);

    void setScalingType(RendererCommon.ScalingType scalingType, RendererCommon.ScalingType scalingType2);

    void setUseAlternateLayout(boolean z);
}
