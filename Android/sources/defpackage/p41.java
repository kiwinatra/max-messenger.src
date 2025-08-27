package defpackage;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

/* renamed from: p41  reason: default package */
public final class p41 implements u41 {
    public final CallsAudioDeviceInfo a;
    public final boolean b;
    public final int c = qqa.t;
    public final int d;
    public final int e;
    public final kgf f;
    public final kgf g;

    public p41(CallsAudioDeviceInfo callsAudioDeviceInfo, boolean z) {
        this.a = callsAudioDeviceInfo;
        this.b = z;
        this.d = z ? pqa.f : pqa.e;
        this.e = pqa.d0;
        kgf kgf = new kgf(sqa.V0, ArraysKt.toList((T[]) new Object[]{callsAudioDeviceInfo.getName()}));
        this.f = kgf;
        this.g = kgf;
    }

    public final int a() {
        return this.d;
    }

    public final CallsAudioDeviceInfo b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p41)) {
            return false;
        }
        p41 p41 = (p41) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) p41.a) && this.b == p41.b;
    }

    public final ngf getContentDescription() {
        return this.g;
    }

    public final int getIcon() {
        return this.e;
    }

    public final int getId() {
        return this.c;
    }

    public final ngf getTitle() {
        return this.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Bluetooth(device=" + this.a + ", isGroupCallEnabled=" + this.b + ")";
    }
}
