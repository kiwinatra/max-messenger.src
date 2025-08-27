package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

/* renamed from: q41  reason: default package */
public final class q41 implements u41 {
    public final CallsAudioDeviceInfo a;
    public final int b = qqa.u;
    public final int c = pqa.U;
    public final int d = pqa.e0;
    public final igf e;
    public final igf f;

    public q41(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        this.a = callsAudioDeviceInfo;
        igf igf = new igf(sqa.W0);
        this.e = igf;
        this.f = igf;
    }

    public final int a() {
        return this.c;
    }

    public final CallsAudioDeviceInfo b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q41) && Intrinsics.areEqual((Object) this.a, (Object) ((q41) obj).a);
    }

    public final ngf getContentDescription() {
        return this.f;
    }

    public final int getIcon() {
        return this.d;
    }

    public final int getId() {
        return this.b;
    }

    public final ngf getTitle() {
        return this.e;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Earpiece(device=" + this.a + ")";
    }
}
