package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;

/* renamed from: on1  reason: default package */
public final class on1 extends FrameLayout implements w9b {
    public static final /* synthetic */ int x0 = 0;
    public final Lazy a = LazyKt.lazy(new lj1(12));
    public final Handler b = new Handler(Looper.getMainLooper());
    public TextureViewRenderer c;
    public mn1 o;
    public Function0 v;
    public boolean v0;
    public o0g w;
    public boolean w0;
    public boolean x;
    public x8g y;
    public final Lazy z = LazyKt.lazy(LazyThreadSafetyMode.NONE, new nm1(1, this));

    public on1(Context context) {
        super(context, (AttributeSet) null, 0);
        p6g videoLayoutUpdatesController;
        setClipChildren(false);
        setClipToPadding(false);
        addOnLayoutChangeListener(new dr0(3, this));
        if (isLaidOut() && this.c != null && (videoLayoutUpdatesController = getVideoLayoutUpdatesController()) != null) {
            videoLayoutUpdatesController.a(this, this.y);
        }
    }

    public static Unit a(on1 on1) {
        on1.b.post(on1.getUpdateWhenReadyRunnable());
        return Unit.INSTANCE;
    }

    private final FrameLayout.LayoutParams getParams() {
        if (this.v0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            return layoutParams;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        return layoutParams2;
    }

    private final Runnable getUpdateWhenReadyRunnable() {
        return (Runnable) this.z.getValue();
    }

    private final x9b getVideoController() {
        return (x9b) this.a.getValue();
    }

    /* access modifiers changed from: private */
    public final p6g getVideoLayoutUpdatesController() {
        Function0 function0 = this.v;
        if (function0 != null) {
            return (p6g) function0.invoke();
        }
        return null;
    }

    public final void c() {
        TextureViewRenderer textureViewRenderer = this.c;
        if (textureViewRenderer != null) {
            x8g x8g = this.y;
            if (x8g != null) {
                ((y9b) getVideoController()).removeParticipantView(x8g.b, textureViewRenderer);
            }
            p6g videoLayoutUpdatesController = getVideoLayoutUpdatesController();
            if (videoLayoutUpdatesController != null) {
                videoLayoutUpdatesController.c(textureViewRenderer);
            }
            ((y9b) getVideoController()).releaseParticipantView(textureViewRenderer);
            removeAllViews();
        }
        mn1 mn1 = this.o;
        if (mn1 != null) {
            mn1.b(false);
        }
        this.y = null;
        this.c = null;
        this.w0 = false;
        this.b.removeCallbacks(getUpdateWhenReadyRunnable());
        ((y9b) getVideoController()).v.remove(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r5 != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r8 = this;
            o0g r0 = r8.w
            boolean r1 = r8.x
            r2 = 0
            if (r0 != 0) goto L_0x0008
            goto L_0x0023
        L_0x0008:
            boolean r3 = r0.b
            boolean r4 = r0.g
            if (r3 == 0) goto L_0x0011
            if (r4 == 0) goto L_0x0011
            goto L_0x0023
        L_0x0011:
            x8g r3 = r0.d
            boolean r5 = r0.c
            if (r1 == 0) goto L_0x001b
            if (r5 == 0) goto L_0x001b
        L_0x0019:
            r2 = r3
            goto L_0x0023
        L_0x001b:
            if (r4 == 0) goto L_0x0020
            x8g r2 = r0.h
            goto L_0x0023
        L_0x0020:
            if (r5 == 0) goto L_0x0023
            goto L_0x0019
        L_0x0023:
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0031
            boolean r4 = r0.e
            if (r4 == 0) goto L_0x0031
            boolean r0 = r0.f
            if (r0 == 0) goto L_0x0031
            r0 = r1
            goto L_0x0032
        L_0x0031:
            r0 = r3
        L_0x0032:
            if (r2 == 0) goto L_0x003a
            boolean r4 = r2.a
            if (r4 == 0) goto L_0x003a
            r4 = r1
            goto L_0x003b
        L_0x003a:
            r4 = r3
        L_0x003b:
            if (r0 == 0) goto L_0x0041
            if (r4 == 0) goto L_0x0041
            r0 = r1
            goto L_0x0042
        L_0x0041:
            r0 = r3
        L_0x0042:
            if (r0 == 0) goto L_0x0101
            if (r2 == 0) goto L_0x00f5
            x8g r4 = r8.y
            ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey r5 = r2.b
            if (r4 != 0) goto L_0x004d
            goto L_0x007e
        L_0x004d:
            ru.ok.android.externcalls.sdk.ui.TextureViewRenderer r6 = r8.c
            if (r6 == 0) goto L_0x007e
            p6g r7 = r8.getVideoLayoutUpdatesController()
            if (r7 == 0) goto L_0x005a
            r7.c(r6)
        L_0x005a:
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r2)
            if (r7 != 0) goto L_0x0075
            x9b r7 = r8.getVideoController()
            y9b r7 = (defpackage.y9b) r7
            r7.getClass()
            ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey r4 = r4.b
            r7.removeParticipantView(r4, r6)
            x9b r4 = r8.getVideoController()
            r4.setParticipantView(r5, r6)
        L_0x0075:
            p6g r4 = r8.getVideoLayoutUpdatesController()
            if (r4 == 0) goto L_0x007e
            r4.a(r6, r2)
        L_0x007e:
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            ru.ok.android.externcalls.sdk.ui.TextureViewRenderer r6 = r8.c
            r4.element = r6
            if (r6 != 0) goto L_0x00f2
            x9b r6 = r8.getVideoController()
            android.content.Context r7 = r8.getContext()
            y9b r6 = (defpackage.y9b) r6
            ru.ok.android.externcalls.sdk.ui.RendererView r6 = r6.createVideoViewInstance(r7)
            r4.element = r6
            android.view.View r6 = (android.view.View) r6
            android.widget.FrameLayout$LayoutParams r7 = r8.getParams()
            r8.addView(r6, r3, r7)
            x9b r6 = r8.getVideoController()
            T r7 = r4.element
            ru.ok.android.externcalls.sdk.ui.RendererView r7 = (ru.ok.android.externcalls.sdk.ui.RendererView) r7
            r6.setParticipantView(r5, r7)
            p6g r5 = r8.getVideoLayoutUpdatesController()
            if (r5 == 0) goto L_0x00ba
            T r6 = r4.element
            android.view.View r6 = (android.view.View) r6
            r5.a(r6, r2)
        L_0x00ba:
            T r5 = r4.element
            ru.ok.android.externcalls.sdk.ui.TextureViewRenderer r5 = (ru.ok.android.externcalls.sdk.ui.TextureViewRenderer) r5
            r8.c = r5
            boolean r5 = r8.isLaidOut()
            if (r5 == 0) goto L_0x00dc
            boolean r5 = r8.isLayoutRequested()
            if (r5 != 0) goto L_0x00dc
            p6g r5 = r8.getVideoLayoutUpdatesController()
            if (r5 == 0) goto L_0x00e5
            T r6 = r4.element
            android.view.View r6 = (android.view.View) r6
            x8g r7 = r8.y
            r5.a(r6, r7)
            goto L_0x00e5
        L_0x00dc:
            nn1 r5 = new nn1
            r6 = 0
            r5.<init>(r6, r8, r4)
            r8.addOnLayoutChangeListener(r5)
        L_0x00e5:
            T r4 = r4.element
            ru.ok.android.externcalls.sdk.ui.TextureViewRenderer r4 = (ru.ok.android.externcalls.sdk.ui.TextureViewRenderer) r4
            r6 r5 = new r6
            r6 = 6
            r5.<init>(r6, r8)
            r4.setFrameSizeListener(r5)
        L_0x00f2:
            r8.y = r2
            goto L_0x0104
        L_0x00f5:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x0101:
            r8.c()
        L_0x0104:
            mn1 r2 = r8.o
            if (r2 == 0) goto L_0x0113
            boolean r4 = r8.w0
            if (r4 == 0) goto L_0x010f
            if (r0 == 0) goto L_0x010f
            goto L_0x0110
        L_0x010f:
            r1 = r3
        L_0x0110:
            r2.b(r1)
        L_0x0113:
            x9b r0 = r8.getVideoController()
            y9b r0 = (defpackage.y9b) r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = r0.v
            r0.add(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.on1.d():void");
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        p6g videoLayoutUpdatesController = getVideoLayoutUpdatesController();
        if (videoLayoutUpdatesController != null) {
            videoLayoutUpdatesController.a(this, this.y);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p6g videoLayoutUpdatesController = getVideoLayoutUpdatesController();
        if (videoLayoutUpdatesController != null) {
            videoLayoutUpdatesController.c(this);
        }
        c();
    }

    public final void setFullScreen(boolean z2) {
        TextureViewRenderer textureViewRenderer = this.c;
        if (textureViewRenderer != null) {
            ViewGroup.LayoutParams layoutParams = textureViewRenderer.getLayoutParams();
            if (layoutParams != null) {
                setLayoutParams(getParams());
                textureViewRenderer.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        this.v0 = z2;
    }

    public final void setListener(mn1 mn1) {
        this.o = mn1;
    }

    public final void setVideoLayoutUpdatesControllerProvider(Function0<p6g> function0) {
        this.v = function0;
    }
}
