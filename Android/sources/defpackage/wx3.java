package defpackage;

import android.util.Log;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.login.inputname.InputNameScreen;
import one.me.profile.screens.members.ChatMembersScreen;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.sdk.arch.Widget;
import one.me.startconversation.StartConversationScreen;

/* renamed from: wx3  reason: default package */
public final class wx3 extends xla {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wx3(int i, Object obj) {
        super(false);
        this.d = i;
        this.e = obj;
    }

    public void a() {
        switch (this.d) {
            case 5:
                boolean isLoggable = Log.isLoggable("FragmentManager", 3);
                c cVar = (c) this.e;
                if (isLoggable) {
                    Objects.toString(cVar);
                }
                xe0 xe0 = cVar.h;
                if (xe0 != null) {
                    xe0.s = false;
                    y86 y86 = new y86(2, (Object) cVar);
                    if (xe0.q == null) {
                        xe0.q = new ArrayList();
                    }
                    xe0.q.add(y86);
                    cVar.h.e(false);
                    cVar.A(true);
                    cVar.F();
                }
                cVar.h = null;
                return;
            default:
                return;
        }
    }

    public final void b() {
        Object value;
        Object obj = this.e;
        switch (this.d) {
            case 0:
                zx3 zx3 = (zx3) obj;
                if (!zx3.router.i().m()) {
                    f(false);
                    zx3.getOnBackPressedDispatcher().d();
                    if (!zx3.isBeingDestroyed) {
                        f(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                u9a u9a = CallIncomingScreen.x;
                xme xme = ((CallIncomingScreen) obj).c0().z;
                do {
                    value = xme.getValue();
                    f81 f81 = (f81) value;
                } while (!xme.b(value, new e81(false)));
                return;
            case 2:
                ((o81) obj).i();
                return;
            case 3:
                gga gga = CallScreen.J0;
                ((CallScreen) obj).g0(false);
                return;
            case 4:
                KProperty[] kPropertyArr = ChatMembersScreen.X;
                ChatMembersScreen chatMembersScreen = (ChatMembersScreen) obj;
                if (chatMembersScreen.e0().k()) {
                    chatMembersScreen.e0().j();
                    return;
                } else {
                    chatMembersScreen.getRouter().C();
                    return;
                }
            case 5:
                c cVar = (c) obj;
                if (Log.isLoggable("FragmentManager", 3)) {
                    Objects.toString(cVar);
                }
                cVar.A(true);
                xe0 xe0 = cVar.h;
                wx3 wx3 = cVar.i;
                if (xe0 != null) {
                    ArrayList arrayList = cVar.n;
                    if (!arrayList.isEmpty()) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet(c.G(cVar.h));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            rae.w(it.next());
                            Iterator it2 = linkedHashSet.iterator();
                            if (it2.hasNext()) {
                                a aVar = (a) it2.next();
                                throw null;
                            }
                        }
                    }
                    Iterator it3 = cVar.h.a.iterator();
                    while (it3.hasNext()) {
                        a aVar2 = ((md6) it3.next()).b;
                        if (aVar2 != null) {
                            aVar2.w0 = false;
                        }
                    }
                    Iterator it4 = cVar.f(new ArrayList(Collections.singletonList(cVar.h)), 0, 1).iterator();
                    while (it4.hasNext()) {
                        tge tge = (tge) it4.next();
                        ArrayList arrayList2 = tge.c;
                        tge.j(arrayList2);
                        tge.c(arrayList2);
                    }
                    Iterator it5 = cVar.h.a.iterator();
                    while (it5.hasNext()) {
                        a aVar3 = ((md6) it5.next()).b;
                        if (aVar3 != null && aVar3.R0 == null) {
                            cVar.g(aVar3).k();
                        }
                    }
                    cVar.h = null;
                    cVar.m0();
                    if (Log.isLoggable("FragmentManager", 3)) {
                        boolean z = wx3.a;
                        cVar.toString();
                        return;
                    }
                    return;
                } else if (wx3.a) {
                    cVar.U();
                    return;
                } else {
                    cVar.g.d();
                    return;
                }
            case 6:
                KProperty[] kPropertyArr2 = InputNameScreen.z0;
                ((InputNameScreen) obj).h0();
                return;
            case 7:
                ((Function1) obj).invoke(this);
                return;
            case 8:
                KProperty[] kPropertyArr3 = ProfileEditAdminPermissionsWidget.v0;
                ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = (ProfileEditAdminPermissionsWidget) obj;
                int ordinal = profileEditAdminPermissionsWidget.d0().ordinal();
                if (ordinal == 0) {
                    profileEditAdminPermissionsWidget.getRouter().C();
                    return;
                } else if (ordinal == 1) {
                    profileEditAdminPermissionsWidget.e0().q();
                    return;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            case 9:
                ((wkd) obj).j();
                return;
            default:
                KProperty[] kPropertyArr4 = StartConversationScreen.E0;
                StartConversationScreen startConversationScreen = (StartConversationScreen) obj;
                startConversationScreen.getClass();
                pza searchView = ((h3b) startConversationScreen.X.getValue(startConversationScreen, StartConversationScreen.E0[4])).getSearchView();
                if (searchView != null) {
                    searchView.b();
                    return;
                }
                return;
        }
    }

    public void c(we0 we0) {
        switch (this.d) {
            case 5:
                boolean isLoggable = Log.isLoggable("FragmentManager", 2);
                c cVar = (c) this.e;
                if (isLoggable) {
                    Objects.toString(cVar);
                }
                if (cVar.h != null) {
                    Iterator it = cVar.f(new ArrayList(Collections.singletonList(cVar.h)), 0, 1).iterator();
                    while (it.hasNext()) {
                        tge tge = (tge) it.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            tge.getClass();
                            float f = we0.c;
                        }
                        ArrayList arrayList = tge.c;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            CollectionsKt__MutableCollectionsKt.addAll(arrayList2, ((qge) it2.next()).k);
                        }
                        List list = CollectionsKt.toList(CollectionsKt.toSet(arrayList2));
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ((pge) list.get(i)).c(we0);
                        }
                    }
                    Iterator it3 = cVar.n.iterator();
                    if (it3.hasNext()) {
                        rae.w(it3.next());
                        throw null;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void d() {
        switch (this.d) {
            case 5:
                boolean isLoggable = Log.isLoggable("FragmentManager", 3);
                c cVar = (c) this.e;
                if (isLoggable) {
                    Objects.toString(cVar);
                }
                cVar.x();
                cVar.y(new dd6(cVar), false);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wx3(Widget widget, int i) {
        super(true);
        this.d = i;
        this.e = widget;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wx3(StartConversationScreen startConversationScreen, boolean z) {
        super(z);
        this.d = 10;
        this.e = startConversationScreen;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wx3(boolean z, Function1 function1) {
        super(z);
        this.d = 7;
        this.e = function1;
    }
}
