package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.profile.screens.members.ChatMembersScreen;

/* renamed from: ak2  reason: default package */
public final class ak2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ak2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj) {
        int i = 2;
        boolean z = false;
        switch (this.a) {
            case 0:
                if (((Number) obj).intValue() == 10101 && (!((Set) this.b).isEmpty())) {
                    KProperty[] kPropertyArr = ChatMembersScreen.X;
                    ChatMembersScreen chatMembersScreen = (ChatMembersScreen) this.c;
                    Set set = (Set) chatMembersScreen.e0().y.a.getValue();
                    if (set == null) {
                        set = SetsKt.emptySet();
                    }
                    lk2 d0 = chatMembersScreen.d0();
                    xag.g(d0, ((osa) ((gaf) d0.w.getValue())).b(), (f14) null, new ik2(set, d0, (Continuation) null), 2);
                }
                return Unit.INSTANCE;
            case 1:
                zo3 zo3 = (zo3) obj;
                if (!((tw2) this.b).M0.a(zo3.a) && !zo3.Y) {
                    List list = zo3.o;
                    if (list != null) {
                        Iterable iterable = list;
                        Long l = (Long) this.c;
                        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                            Iterator it = iterable.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    long longValue = ((Number) it.next()).longValue();
                                    if (l != null && longValue == l.longValue()) {
                                    }
                                }
                            }
                        }
                    }
                    return Boolean.valueOf(z);
                }
                z = true;
                return Boolean.valueOf(z);
            case 2:
                Throwable th = (Throwable) obj;
                ((rh3) this.b).d((th3) this.c);
                return Unit.INSTANCE;
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ((AtomicBoolean) this.b).set(booleanValue);
                ((ltb) ((jtb) ((Lazy) this.c).getValue())).a.i("app.debug.fresco", booleanValue);
                if (!booleanValue) {
                    i = 6;
                }
                bg5.a.a = i;
                return Unit.INSTANCE;
            default:
                zo3 zo32 = (zo3) obj;
                if (!((jib) this.b).C0.a(zo32.a) && !zo32.Y) {
                    List list2 = zo32.o;
                    if (list2 != null) {
                        Iterable iterable2 = list2;
                        Long l2 = (Long) this.c;
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it2 = iterable2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    long longValue2 = ((Number) it2.next()).longValue();
                                    if (l2 != null && longValue2 == l2.longValue()) {
                                    }
                                }
                            }
                        }
                    }
                    return Boolean.valueOf(z);
                }
                z = true;
                return Boolean.valueOf(z);
        }
    }
}
