package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: mwb  reason: default package */
public abstract class mwb {
    public static nwb a(byte[] bArr) {
        try {
            Tasks.Profile profile = (Tasks.Profile) ad9.mergeFrom(new Tasks.Profile(), bArr);
            Tasks.Rect rect = profile.crop;
            a20 a20 = rect != null ? new a20(rect.left, rect.top, rect.right, rect.bottom, 3) : null;
            long j = profile.requestId;
            String str = profile.firstName;
            String str2 = profile.lastName;
            String str3 = profile.photoToken;
            long j2 = profile.photoId;
            String str4 = profile.description;
            String str5 = profile.link;
            gga gga = he0.b;
            String str6 = profile.avatarType;
            gga.getClass();
            return new nwb(j, str, str2, str3, j2, a20, str4, str5, Intrinsics.areEqual((Object) str6, (Object) "PRESET_AVATAR") ? he0.PRESET_AVATAR : he0.USER_AVATAR);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        }
    }
}
