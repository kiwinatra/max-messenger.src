package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.Layout;
import java.text.Collator;
import java.util.List;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.InternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: zb2  reason: default package */
public final /* synthetic */ class zb2 implements zi6, osb, iv0, yi6, qk3, rm0, op7, bmf, InternalIdsResolver.ParticipantPrivateStateModifier, ExternalIdsResolver.ParticipantPrivateStateModifier, h08 {
    public final /* synthetic */ int a;

    public /* synthetic */ zb2(int i) {
        this.a = i;
    }

    public String a() {
        return ConversationFactory.lambda$joinAnonByLink$15();
    }

    public void accept(Object obj, Object obj2) {
        Collator collator = (Collator) obj;
        Throwable th = (Throwable) obj2;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ryg.I((kc2) obj);
            case 1:
                List list = (List) obj;
                return list.isEmpty() ? uh8.a : nh8.e(list);
            case 2:
                List list2 = (List) obj;
                return list2.isEmpty() ? uh8.a : nh8.e(list2);
            case 3:
                List list3 = (List) obj;
                return list3.isEmpty() ? uh8.a : nh8.e(list3);
            case 4:
                List list4 = (List) obj;
                return list4.isEmpty() ? uh8.a : nh8.e(list4);
            case 5:
                return Long.valueOf(((bj2) obj).a.a);
            case 8:
                e63 e63 = (e63) obj;
                e63.getClass();
                Bundle bundle = new Bundle();
                yvd yvd = e63.a;
                if (yvd != null) {
                    bundle.putBundle(e63.i, yvd.b());
                }
                int i = e63.b;
                if (i != -1) {
                    bundle.putInt(e63.j, i);
                }
                int i2 = e63.c;
                if (i2 != 0) {
                    bundle.putInt(e63.p, i2);
                }
                int i3 = e63.d;
                if (i3 != 0) {
                    bundle.putInt(e63.k, i3);
                }
                CharSequence charSequence = e63.f;
                if (charSequence != "") {
                    bundle.putCharSequence(e63.l, charSequence);
                }
                Bundle bundle2 = e63.g;
                if (!bundle2.isEmpty()) {
                    bundle.putBundle(e63.m, bundle2);
                }
                Uri uri = e63.e;
                if (uri != null) {
                    bundle.putParcelable(e63.o, uri);
                }
                boolean z = e63.h;
                if (!z) {
                    bundle.putBoolean(e63.n, z);
                }
                return bundle;
            case 13:
                sq3 sq3 = (sq3) obj;
                sq3.getClass();
                return new qa3(2, new fc2(1, sq3));
            case Protos.Attaches.Attach.LOCATION:
                return ryg.J((tq3) obj);
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return ((OneMeRoomDatabase) obj).y();
            case 26:
                long j = ((q44) obj).b;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
            default:
                return tb7.t(Integer.valueOf(((w03) obj).a));
        }
    }

    public jv0 h(Bundle bundle) {
        int i;
        float f;
        float f2;
        int i2;
        int i3;
        boolean z;
        Bundle bundle2 = bundle;
        switch (this.a) {
            case 7:
                return new l53(bundle2.getInt(Integer.toString(0, 36), -1), bundle2.getInt(Integer.toString(1, 36), -1), bundle2.getInt(Integer.toString(2, 36), -1), bundle2.getByteArray(Integer.toString(3, 36)));
            default:
                boolean z2 = false;
                CharSequence charSequence = bundle2.getCharSequence(Integer.toString(0, 36));
                CharSequence charSequence2 = charSequence != null ? charSequence : null;
                Layout.Alignment alignment = (Layout.Alignment) bundle2.getSerializable(Integer.toString(1, 36));
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle2.getSerializable(Integer.toString(2, 36));
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmap = (Bitmap) bundle2.getParcelable(Integer.toString(3, 36));
                Bitmap bitmap2 = bitmap != null ? bitmap : null;
                if (!bundle2.containsKey(Integer.toString(4, 36)) || !bundle2.containsKey(Integer.toString(5, 36))) {
                    i = Integer.MIN_VALUE;
                    f = -3.4028235E38f;
                } else {
                    f = bundle2.getFloat(Integer.toString(4, 36));
                    i = bundle2.getInt(Integer.toString(5, 36));
                }
                int i4 = bundle2.containsKey(Integer.toString(6, 36)) ? bundle2.getInt(Integer.toString(6, 36)) : Integer.MIN_VALUE;
                float f3 = bundle2.containsKey(Integer.toString(7, 36)) ? bundle2.getFloat(Integer.toString(7, 36)) : -3.4028235E38f;
                int i5 = bundle2.containsKey(Integer.toString(8, 36)) ? bundle2.getInt(Integer.toString(8, 36)) : Integer.MIN_VALUE;
                if (!bundle2.containsKey(Integer.toString(10, 36)) || !bundle2.containsKey(Integer.toString(9, 36))) {
                    i2 = Integer.MIN_VALUE;
                    f2 = -3.4028235E38f;
                } else {
                    float f4 = bundle2.getFloat(Integer.toString(10, 36));
                    i2 = bundle2.getInt(Integer.toString(9, 36));
                    f2 = f4;
                }
                float f5 = bundle2.containsKey(Integer.toString(11, 36)) ? bundle2.getFloat(Integer.toString(11, 36)) : -3.4028235E38f;
                float f6 = bundle2.containsKey(Integer.toString(12, 36)) ? bundle2.getFloat(Integer.toString(12, 36)) : -3.4028235E38f;
                if (bundle2.containsKey(Integer.toString(13, 36))) {
                    i3 = bundle2.getInt(Integer.toString(13, 36));
                    z = true;
                } else {
                    i3 = -16777216;
                    z = false;
                }
                if (bundle2.getBoolean(Integer.toString(14, 36), false)) {
                    z2 = z;
                }
                return new m44(charSequence2, alignment2, alignment4, bitmap2, f, i, i4, f3, i5, i2, f2, f5, f6, z2, i3, bundle2.containsKey(Integer.toString(15, 36)) ? bundle2.getInt(Integer.toString(15, 36)) : Integer.MIN_VALUE, bundle2.containsKey(Integer.toString(16, 36)) ? bundle2.getFloat(Integer.toString(16, 36)) : c44.DEFAULT_ASPECT_RATIO);
        }
    }

    public void invoke(Object obj) {
        sb5 sb5 = (sb5) obj;
        switch (this.a) {
            case 28:
                sb5.getClass();
                return;
            default:
                sb5.getClass();
                return;
        }
    }

    public Object parse(sp7 sp7) {
        switch (this.a) {
            case 18:
                return sp7.A();
            default:
                return ConversationParams.parseCallParams(sp7);
        }
    }

    public void setExternalId(ConversationParticipant conversationParticipant, ParticipantId participantId) {
        conversationParticipant.setExternalId(participantId);
    }

    public void setInternalId(ConversationParticipant conversationParticipant, ue1 ue1) {
        conversationParticipant.setInternalId(ue1);
    }

    public boolean test(Object obj) {
        return ((a32) obj).N();
    }

    public /* synthetic */ zb2(sd sdVar, ca6 ca6, da4 da4) {
        this.a = 29;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 9:
                z68.f("km3", "asyncFetchExternalContactsPresence", (Throwable) obj);
                return;
            case 10:
                ((nm3) obj).j = 2;
                return;
            case 11:
                z68.f("km3", "changeLastSearchClickTimeAsync: failed", (Throwable) obj);
                return;
            case 12:
                z68.f("km3", "changeLastShowingUnknownContactBar: failed", (Throwable) obj);
                return;
            case LangUtils.HASH_SEED:
                z68.f("st3", "asyncUpdate: exception", (Throwable) obj);
                return;
            case 19:
                ConversationFactory.lambda$hangup$22(obj);
                return;
            default:
                ConversationFactory.lambda$hangup$23((Throwable) obj);
                return;
        }
    }

    public /* synthetic */ zb2(sd sdVar, String str, long j, long j2) {
        this.a = 28;
    }
}
