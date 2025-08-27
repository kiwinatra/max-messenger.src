package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

/* renamed from: r41  reason: default package */
public final class r41 implements u41 {
    public final CallsAudioDeviceInfo a;
    public final int b = qqa.v;
    public final int c = pqa.U;
    public final int d = pqa.f0;
    public final igf e;
    public final igf f;

    public r41(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        this.a = callsAudioDeviceInfo;
        igf igf = new igf(sqa.X0);
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
        return (obj instanceof r41) && Intrinsics.areEqual((Object) this.a, (Object) ((r41) obj).a);
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
        return "Speakerphone(device=" + this.a + ")";
    }
}
