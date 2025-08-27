package defpackage;

import one.me.common.drawable.SavedMessagesIconDrawable;
import ru.ok.tamtam.nano.Protos;

/* renamed from: u3h  reason: default package */
public final class u3h implements t0h {
    public static final u3h b = new u3h(0);
    public static final u3h c = new u3h(1);
    public static final u3h d = new u3h(2);
    public static final u3h e = new u3h(3);
    public static final u3h f = new u3h(4);
    public static final u3h g = new u3h(5);
    public final /* synthetic */ int a;

    public /* synthetic */ u3h(int i) {
        this.a = i;
    }

    public final boolean a(int i) {
        switch (this.a) {
            case 0:
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case Protos.Attaches.Attach.LOCATION /*14*/:
                    case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                        break;
                    default:
                        switch (i) {
                            case 22:
                            case 23:
                            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                                break;
                            default:
                                return false;
                        }
                }
                return true;
            case 1:
                return hi7.k0(i) != 0;
            case 2:
                return (i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : z3h.ALTERNATIVE_BILLING_ACTION : z3h.LOCAL_PURCHASES_UPDATED_ACTION : z3h.PURCHASES_UPDATED_ACTION : z3h.BROADCAST_ACTION_UNSPECIFIED) != null;
            case 3:
                return i == 0 || i == 1 || i == 2 || i == 3;
            case 4:
                if (i != 17) {
                    switch (i) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            return false;
                    }
                }
                return true;
            default:
                return i == 0 || i == 1;
        }
    }
}
