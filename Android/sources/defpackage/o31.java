package defpackage;

import kotlin.TuplesKt;
import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: o31  reason: default package */
public final class o31 implements ya4 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ boolean v;

    public o31(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.o = z3;
        this.v = z4;
    }

    public final Object a() {
        CallScreen.J0.getClass();
        return new CallScreen(o54.f(TuplesKt.to("type", "LINK"), TuplesKt.to("link", this.a), TuplesKt.to("video_enabled", Boolean.valueOf(this.b)), TuplesKt.to("microphone_enabled", Boolean.valueOf(this.c)), TuplesKt.to("front_camera_enabled", Boolean.valueOf(this.o)), TuplesKt.to("is_new", Boolean.valueOf(this.v))));
    }
}
