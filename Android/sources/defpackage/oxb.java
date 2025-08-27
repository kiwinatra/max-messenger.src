package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Reflection;
import one.me.profile.screens.members.ChatAdminsScreen;
import one.me.profile.screens.members.ChatMembersScreen;
import one.me.profileedit.ProfileEditScreen;
import one.me.sdk.arch.activity.ActivityWrapperWidget;
import one.me.stickerspreview.StickerPreviewScreen;
import ru.ok.messages.contacts.profile.ActContactAvatars;
import ru.ok.messages.views.ActProfilePhoto;

/* renamed from: oxb  reason: default package */
public final /* synthetic */ class oxb implements ya4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oxb(long j, Parcelable parcelable, int i) {
        this.a = i;
        this.b = j;
        this.c = parcelable;
    }

    public final Object a() {
        switch (this.a) {
            case 0:
                int ordinal = ((txb) this.c).ordinal();
                long j = this.b;
                if (ordinal == 0) {
                    String simpleName = Reflection.getOrCreateKotlinClass(ActProfilePhoto.class).getSimpleName();
                    if (simpleName != null) {
                        return new ActivityWrapperWidget(simpleName, new hg2(j, 7));
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else if (ordinal == 1) {
                    return Unit.INSTANCE;
                } else {
                    if (ordinal == 2) {
                        String simpleName2 = Reflection.getOrCreateKotlinClass(ActContactAvatars.class).getSimpleName();
                        if (simpleName2 != null) {
                            return new ActivityWrapperWidget(simpleName2, new hg2(j, 6));
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    throw new NoWhenBranchMatchedException();
                }
            case 1:
                ij2 ij2 = ij2.ADMIN;
                ij2 ij22 = (ij2) this.c;
                long j2 = this.b;
                return ij22 == ij2 ? new ChatAdminsScreen(j2) : new ChatMembersScreen(j2, ij22);
            case 2:
                return new ProfileEditScreen(this.b, (gzb) this.c);
            default:
                Bundle bundle = (Bundle) this.c;
                Long F = o54.F("chat_id", bundle);
                long longValue = F != null ? F.longValue() : 0;
                Long F2 = o54.F("forward_id", bundle);
                return new StickerPreviewScreen(this.b, longValue, F2 != null ? F2.longValue() : 0);
        }
    }

    public /* synthetic */ oxb(Enum enumR, long j, int i) {
        this.a = i;
        this.c = enumR;
        this.b = j;
    }
}
