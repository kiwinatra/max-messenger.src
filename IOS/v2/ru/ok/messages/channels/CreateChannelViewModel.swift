package ru.ok.messages.channels;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ok/messages/channels/CreateChannelViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCreateChannelViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateChannelViewModel.kt\nru/ok/messages/channels/CreateChannelViewModel\n+ 2 SavedStateHandleExt.kt\nru/ok/tamtam/shared/lifecycle/SavedStateHandleExtKt\n*L\n1#1,151:1\n7#2,16:152\n7#2,16:168\n7#2,16:184\n7#2,16:200\n7#2,16:216\n7#2,16:232\n7#2,16:248\n7#2,16:264\n7#2,16:280\n*S KotlinDebug\n*F\n+ 1 CreateChannelViewModel.kt\nru/ok/messages/channels/CreateChannelViewModel\n*L\n40#1:152,16\n41#1:168,16\n43#1:184,16\n44#1:200,16\n45#1:216,16\n71#1:232,16\n73#1:248,16\n75#1:264,16\n77#1:280,16\n*E\n"})
public final class CreateChannelViewModel extends AndroidViewModel {
    public static final /* synthetic */ KProperty[] G;
    public final int A;
    public final rt6 B;
    public final er7 C;
    public final wie D;
    public final e4 E;
    public final faf F;
    public final ln5 d;
    public final m95 e;
    public final bud f;
    public final gaf g;
    public final l34 h;
    public final m34 i;
    public final n34 j;
    public final o34 k;
    public final vs6 l;
    public final xme m;
    public final etc n;
    public final xme o;
    public final etc p;
    public final xme q;
    public final etc r;
    public final xme s;
    public final etc t;
    public final xme u;
    public final etc v;
    public final xme w;
    public final etc x;
    public final pl6 y = new pl6(false, false, false, false, true, (List) null, false, 977);
    public final int z;

    static {
        Class<CreateChannelViewModel> cls = CreateChannelViewModel.class;
        G = new KProperty[]{rae.s(cls, "iconFilePath", "getIconFilePath()Ljava/lang/String;", 0), rae.s(cls, "croppedIconPath", "getCroppedIconPath()Ljava/lang/String;", 0), rae.s(cls, "createChannelRequestId", "getCreateChannelRequestId()J", 0), rae.s(cls, "relativeCrop", "getRelativeCrop()Landroid/graphics/RectF;", 0), rae.s(cls, "absoluteCrop", "getAbsoluteCrop()Landroid/graphics/Rect;", 0), rae.s(cls, "channelName", "getChannelName()Ljava/lang/String;", 0), rae.s(cls, "channelDescription", "getChannelDescription()Ljava/lang/String;", 0), rae.s(cls, "takenPhotoFileName", "getTakenPhotoFileName()Ljava/lang/String;", 0), rae.s(cls, "pickAvatarBottomDialogShown", "getPickAvatarBottomDialogShown()Z", 0)};
    }

    public CreateChannelViewModel(Application application, hdd hdd, ln5 ln5, m95 m95, bud bud, gaf gaf) {
        super(application);
        this.d = ln5;
        this.e = m95;
        this.f = bud;
        this.g = gaf;
        this.h = new l34(hdd, 0);
        this.i = new m34(hdd, 0);
        this.j = new n34(hdd, 0);
        this.k = new o34(hdd, 0);
        this.l = new vs6(14, (Object) hdd);
        xme a = f6e.a((Object) null);
        this.m = a;
        this.n = new etc(a);
        xme a2 = f6e.a((Object) null);
        this.o = a2;
        this.p = new etc(a2);
        xme a3 = f6e.a((Object) null);
        this.q = a3;
        this.r = new etc(a3);
        xme a4 = f6e.a((Object) null);
        this.s = a4;
        this.t = new etc(a4);
        xme a5 = f6e.a((Object) null);
        this.u = a5;
        this.v = new etc(a5);
        xme a6 = f6e.a((Object) null);
        this.w = a6;
        this.x = new etc(a6);
        akd akd = (akd) bud;
        this.z = akd.t();
        this.A = akd.s();
        this.B = new rt6(14, (Object) hdd);
        this.C = new er7(14, (Object) hdd);
        this.D = new wie(14, (Object) hdd);
        this.E = new e4(12, (Object) hdd);
        this.F = new faf(m95, new wk(13, this, application));
    }

    public final String j() {
        return (String) this.i.getValue(this, G[1]);
    }

    public final void k() {
        o85 o85 = new o85(Boolean.FALSE);
        xme xme = this.m;
        xme.getClass();
        xme.m((Object) null, o85);
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.D.setValue(this, G[7], valueOf);
        ev0.v(b0h.C(this), ((osa) this.g).a(), (f14) null, new k34(this, (Continuation) null), 2);
    }

    public final void l(String str) {
        this.h.setValue(this, G[0], str);
    }
}
