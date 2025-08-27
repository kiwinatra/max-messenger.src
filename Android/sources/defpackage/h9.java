package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.profile.screens.addadmins.AddChatAdminsScreen;
import org.apache.http.util.LangUtils;
import ru.ok.messages.media.attaches.AudioAttachView;
import ru.ok.tamtam.nano.Protos;

/* renamed from: h9  reason: default package */
public final /* synthetic */ class h9 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ h9(int i) {
        this.a = i;
    }

    public final Object invoke(Object obj) {
        Activity d;
        boolean z = true;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup == null) {
                    return null;
                }
                if (viewGroup.getChildCount() <= 0) {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    return new mag(0, viewGroup);
                }
                return null;
            case 1:
                return ((pzc) obj).a;
            case 2:
                return (Activity) ((WeakReference) obj).get();
            case 3:
                Activity activity = (Activity) obj;
                if (!activity.isDestroyed() && !activity.isFinishing()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                return ((Activity) obj).getWindow().getDecorView().getRootView();
            case 5:
                ((Long) obj).longValue();
                KProperty[] kPropertyArr = AddChatAdminsScreen.w0;
                return CollectionsKt.emptyList();
            case 6:
                return ((bb) obj).b.toString();
            case 7:
                vk3 vk3 = (vk3) obj;
                if (!vk3.w && !vk3.B() && vk3.n() == 0 && (!vk3.x() || !vk3.A())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                return ((bb) obj).b.toString();
            case 9:
                Long l = (Long) obj;
                return f6e.a((Object) null);
            case 10:
                return ((nk) obj).f;
            case 11:
                return Boolean.valueOf(((gz6) obj) instanceof fz6);
            case 12:
                return Boolean.valueOf(((gz6) obj) instanceof fz6);
            case 13:
                int i = AudioAttachView.I0;
                return Boolean.valueOf(((View) obj).isClickable());
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return Boolean.TRUE;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new t8b(((Integer) obj).intValue());
            case 16:
                return new t8b(((Integer) obj).intValue());
            case LangUtils.HASH_SEED /*17*/:
                return Boolean.valueOf(!((vk3) obj).x());
            case 18:
                return obj instanceof Iterable ? (Iterable) obj : CollectionsKt.listOf(obj);
            case 19:
                return obj instanceof Iterable ? (Iterable) obj : CollectionsKt.listOf(obj);
            case 20:
                Intent intent = (Intent) obj;
                intent.setAction("action-open-call");
                intent.setFlags(268435456);
                return Unit.INSTANCE;
            case 21:
                KProperty[] kPropertyArr2 = CallLinkInfoScreen.z0;
                ((k2b) obj).getIcon().getClass();
                return -1;
            case 22:
                KProperty[] kPropertyArr3 = CallLinkInfoScreen.z0;
                ((k2b) obj).c().getClass();
                return 0;
            case 23:
                View view2 = (View) obj;
                KProperty[] kPropertyArr4 = CallLinkInfoScreen.z0;
                b71 b71 = b71.b;
                if (!b71.W0().d() && (d = ((bta) b71.W0().a()).e().x().d()) != null) {
                    d.finish();
                }
                return Unit.INSTANCE;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                KProperty[] kPropertyArr5 = CallLinkInfoScreen.z0;
                ((k2b) obj).getIcon().getClass();
                return -16745729;
            case 25:
                KProperty[] kPropertyArr6 = CallLinkInfoScreen.z0;
                ((k2b) obj).c().a.getClass();
                return Integer.valueOf(w53.h(-16745729, 50));
            case 26:
                k2b k2b = (k2b) obj;
                KProperty[] kPropertyArr7 = CallMoreBottomSheet.v0;
                return Integer.valueOf(l2b.d.a.g);
            case 27:
                return obj instanceof Iterable ? (Iterable) obj : CollectionsKt.listOf(obj);
            default:
                return obj instanceof Iterable ? (Iterable) obj : CollectionsKt.listOf(obj);
        }
    }
}
