package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.c;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.profile.ProfileScreen;
import ru.ok.messages.settings.folders.settings.presentation.FolderSettingsFragment;
import ru.ok.messages.utils.context_actions.dialog.ContextActionsDialog;

/* renamed from: ir0  reason: default package */
public final /* synthetic */ class ir0 implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ir0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        Object obj4;
        switch (this.a) {
            case 0:
                ImageView imageView = (ImageView) obj;
                ((Boolean) obj2).getClass();
                k2b k2b = (k2b) obj3;
                int ordinal = ((kr0) this.b).H0.ordinal();
                if (ordinal == 0) {
                    k2b.getIcon().a.a.getClass();
                    i = -16745729;
                } else if (ordinal == 1) {
                    i = k2b.getIcon().a.a.a;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                imageView.setImageTintList(ColorStateList.valueOf(i));
                return Unit.INSTANCE;
            case 1:
                return new ku0(obj3, (ru0) this.b, (vpd) obj);
            case 2:
                CoroutineContext coroutineContext = (CoroutineContext) obj3;
                ((Function1) this.b).invoke((Throwable) obj);
                return Unit.INSTANCE;
            case 3:
                View view = (View) obj;
                Integer num = (Integer) obj3;
                num.intValue();
                FolderSettingsFragment folderSettingsFragment = (FolderSettingsFragment) this.b;
                folderSettingsFragment.i3().n = num;
                folderSettingsFragment.i3().o = (x16) obj2;
                folderSettingsFragment.C1.f().setScrollEnabled(false);
                String str = ContextActionsDialog.G1;
                c N1 = folderSettingsFragment.N1();
                List list = folderSettingsFragment.i3().p;
                ContextActionsDialog contextActionsDialog = new ContextActionsDialog();
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("ru.ok.messages.CONTEXT_ACTIONS_KEY", new ArrayList(list));
                contextActionsDialog.L2(bundle);
                contextActionsDialog.Y2(N1, ContextActionsDialog.G1);
                return Unit.INSTANCE;
            case 4:
                long longValue = ((Long) obj).longValue();
                hqc hqc = (hqc) obj2;
                View view2 = (View) obj3;
                yrc yrc = ((MessagesListWidget) this.b).Q0;
                if (yrc != null) {
                    Iterator it = yrc.e.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj4 = it.next();
                            vrc vrc = (vrc) obj4;
                            if (vrc.a != longValue || !Intrinsics.areEqual((Object) vrc.c, (Object) hqc)) {
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    vrc vrc2 = (vrc) obj4;
                    if (vrc2 == null) {
                        String str2 = yrc.d;
                        a67 a67 = z68.b;
                        if (a67 != null && a67.c()) {
                            a67.d(w78.o, str2, "Can't play reaction effect because don't have state, reaction:" + hqc + ", l:" + longValue, (Throwable) null);
                        }
                    } else {
                        pzc N = yrc.a.N(vrc2.a);
                        if (yrc.f(N != null ? N.q() : -1)) {
                            String str3 = yrc.d;
                            a67 a672 = z68.b;
                            if (a672 != null && a672.c()) {
                                a672.d(w78.o, str3, "Make reaction effect pending, reaction:" + hqc + ", msgId:" + longValue, (Throwable) null);
                            }
                            yrc.f.add(Long.valueOf(vrc2.a));
                        } else {
                            yrc.f.remove(Long.valueOf(vrc2.a));
                            yrc.e.remove(vrc2);
                            View view3 = N.a;
                            u3b.a(view3, new wnf(view3, yrc, view2, vrc2, hqc, longValue));
                        }
                    }
                }
                return Unit.INSTANCE;
            case 5:
                View view4 = (View) obj;
                iog iog = (iog) obj2;
                Rect rect = (Rect) obj3;
                KProperty[] kPropertyArr = ProfileScreen.D0;
                ProfileScreen profileScreen = (ProfileScreen) this.b;
                profileScreen.getClass();
                AppBarLayout appBarLayout = (AppBarLayout) profileScreen.v.getValue(profileScreen, ProfileScreen.D0[0]);
                appBarLayout.setPadding(appBarLayout.getPaddingLeft(), MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density), appBarLayout.getPaddingRight(), appBarLayout.getPaddingBottom());
                return iog;
            default:
                Throwable th = (Throwable) obj;
                Unit unit = (Unit) obj2;
                CoroutineContext coroutineContext2 = (CoroutineContext) obj3;
                ((mrd) this.b).c();
                return Unit.INSTANCE;
        }
    }
}
