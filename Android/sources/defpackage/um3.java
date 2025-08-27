package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* renamed from: um3  reason: default package */
public final class um3 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final List f;
    public final long g;
    public final long h;
    public final sm3 i;
    public final int j;
    public final tm3 k;
    public final int l;
    public final int m;
    public final List n;
    public final String o;
    public final String p;
    public final String q;
    public final long r;
    public final long s;
    public final long t;
    public final qm3 u;
    public final int[] v;

    public um3(nm3 nm3) {
        this.a = nm3.a;
        this.b = nm3.d;
        this.c = nm3.b;
        this.d = nm3.c;
        this.e = nm3.e;
        ArrayList arrayList = new ArrayList(nm3.f);
        arrayList.removeIf(new lm3(0));
        arrayList.sort(Comparator.comparing(new mm3(0)));
        this.f = Collections.unmodifiableList(arrayList);
        this.g = nm3.g;
        this.h = nm3.h;
        this.i = nm3.i;
        this.j = nm3.j;
        this.k = nm3.k;
        this.l = nm3.l;
        this.m = nm3.m;
        this.n = nm3.n;
        this.o = nm3.o;
        this.p = nm3.p;
        this.q = nm3.q;
        this.r = nm3.r;
        this.s = nm3.s;
        this.t = nm3.t;
        this.u = nm3.u;
        this.v = nm3.v;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [nm3, java.lang.Object] */
    public static um3 b(byte[] bArr) {
        tm3 tm3;
        int i2;
        byte[] bArr2 = b.a;
        try {
            Protos.Contact contact = (Protos.Contact) ad9.mergeFrom(new Protos.Contact(), bArr);
            ? obj = new Object();
            obj.a = contact.serverId;
            obj.b = contact.baseUrl;
            obj.c = contact.baseRawUrl;
            obj.d = contact.deviceAvatarUrl;
            obj.e = contact.photoId;
            obj.g = contact.lastUpdateTime;
            obj.h = contact.serverPhone;
            obj.m = contact.settings;
            obj.o = contact.description;
            obj.p = contact.link;
            obj.q = contact.birthday;
            obj.r = contact.lastSearchClickTime;
            obj.s = contact.lastSyncTime;
            obj.t = contact.lastShowingUnknownContactBar;
            obj.v = contact.profileOptions;
            Protos.Contact.MenuButton menuButton = contact.menuButton;
            obj.u = menuButton == null ? null : new qm3(menuButton.text);
            ArrayList arrayList = new ArrayList();
            Protos.Contact.ContactName[] contactNameArr = contact.names;
            if (contactNameArr != null && contactNameArr.length > 0) {
                for (Protos.Contact.ContactName contactName : contactNameArr) {
                    String str = contactName.name;
                    String str2 = contactName.lastName;
                    om3 om3 = om3.o;
                    int i3 = contactName.type;
                    if (i3 != 0) {
                        if (i3 == 1) {
                            om3 = om3.a;
                        } else if (i3 == 2) {
                            om3 = om3.b;
                        } else if (i3 == 3) {
                            om3 = om3.c;
                        }
                    }
                    arrayList.add(new pm3(str, om3, str2));
                }
            }
            obj.f = arrayList;
            int i4 = contact.status;
            obj.i = i4 != 1 ? i4 != 2 ? null : sm3.b : sm3.a;
            int i5 = contact.type;
            if (i5 == 0) {
                tm3 = tm3.a;
            } else if (i5 == 1) {
                tm3 = tm3.b;
            } else {
                throw new IllegalArgumentException("unknown proto.type " + contact.type);
            }
            obj.k = tm3;
            int i6 = contact.gender;
            if (i6 == 0) {
                i2 = 1;
            } else if (i6 == 1) {
                i2 = 2;
            } else if (i6 == 2) {
                i2 = 3;
            } else {
                throw new IllegalArgumentException("unknown proto.gender " + contact.gender);
            }
            obj.l = i2;
            ArrayList arrayList2 = new ArrayList();
            int[] iArr = contact.options;
            if (iArr != null && iArr.length > 0) {
                int length = iArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    int i8 = iArr[i7];
                    arrayList2.add(i8 != 0 ? i8 != 1 ? i8 != 2 ? i8 != 3 ? null : rm3.o : rm3.c : rm3.b : rm3.a);
                }
            }
            obj.n = arrayList2;
            return obj.a();
        } catch (InvalidProtocolBufferNanoException e2) {
            throw new IOException(e2);
        }
    }

    public final boolean a() {
        List list = this.f;
        if (list.isEmpty()) {
            return true;
        }
        return ((pm3) list.get(0)).equals(pm3.e);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [nm3, java.lang.Object] */
    public final nm3 c() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.c;
        obj.c = this.d;
        obj.d = this.b;
        obj.e = this.e;
        obj.f = new ArrayList(this.f);
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.k = this.k;
        obj.l = this.l;
        obj.m = this.m;
        obj.n = new ArrayList(this.n);
        obj.o = this.o;
        obj.p = this.p;
        obj.q = this.q;
        obj.r = this.r;
        obj.s = this.s;
        obj.t = this.t;
        obj.u = this.u;
        obj.v = this.v;
        return obj;
    }

    public final byte[] d() {
        int i2;
        int i3;
        byte[] bArr = b.a;
        Protos.Contact contact = new Protos.Contact();
        contact.serverId = this.a;
        String str = "";
        String str2 = this.c;
        if (str2 == null) {
            str2 = str;
        }
        contact.baseUrl = str2;
        String str3 = this.d;
        if (str3 == null) {
            str3 = str;
        }
        contact.baseRawUrl = str3;
        String str4 = this.b;
        if (str4 == null) {
            str4 = str;
        }
        contact.deviceAvatarUrl = str4;
        contact.photoId = this.e;
        contact.lastUpdateTime = this.g;
        contact.serverPhone = this.h;
        contact.settings = this.m;
        String str5 = this.o;
        if (str5 == null) {
            str5 = str;
        }
        contact.description = str5;
        String str6 = this.p;
        if (str6 == null) {
            str6 = str;
        }
        contact.link = str6;
        String str7 = this.q;
        if (str7 == null) {
            str7 = str;
        }
        contact.birthday = str7;
        contact.lastSearchClickTime = this.r;
        contact.lastSyncTime = this.s;
        contact.lastShowingUnknownContactBar = this.t;
        contact.profileOptions = this.v;
        List list = this.f;
        if (!list.isEmpty()) {
            int size = list.size();
            contact.names = new Protos.Contact.ContactName[size];
            for (int i4 = 0; i4 < size; i4++) {
                pm3 pm3 = (pm3) list.get(i4);
                Protos.Contact.ContactName contactName = new Protos.Contact.ContactName();
                String str8 = pm3.a;
                if (str8 == null) {
                    str8 = str;
                }
                contactName.name = str8;
                String str9 = pm3.b;
                if (str9 == null) {
                    str9 = str;
                }
                contactName.lastName = str9;
                int ordinal = pm3.c.ordinal();
                if (ordinal == 0) {
                    i3 = 1;
                } else if (ordinal == 1) {
                    i3 = 2;
                } else if (ordinal == 2) {
                    i3 = 3;
                } else if (ordinal == 3) {
                    i3 = 0;
                } else {
                    throw new IncompatibleClassChangeError();
                }
                contactName.type = i3;
                contact.names[i4] = contactName;
            }
        }
        sm3 sm3 = this.i;
        if (sm3 == null) {
            contact.status = 0;
        } else if (sm3 == sm3.a) {
            contact.status = 1;
        } else if (sm3 == sm3.b) {
            contact.status = 2;
        } else {
            throw new IllegalArgumentException("unknown status " + sm3);
        }
        int ordinal2 = this.k.ordinal();
        if (ordinal2 == 0) {
            contact.type = 0;
        } else if (ordinal2 == 1) {
            contact.type = 1;
        } else {
            throw new IllegalArgumentException("unknown type");
        }
        int y = tr1.y(this.l);
        if (y == 0) {
            contact.gender = 0;
        } else if (y == 1) {
            contact.gender = 1;
        } else if (y == 2) {
            contact.gender = 2;
        } else {
            throw new IllegalArgumentException("unknown type");
        }
        qm3 qm3 = this.u;
        if (qm3 != null) {
            Protos.Contact.MenuButton menuButton = new Protos.Contact.MenuButton();
            String str10 = qm3.a;
            if (str10 != null) {
                str = str10;
            }
            menuButton.text = str;
            contact.menuButton = menuButton;
        }
        List list2 = this.n;
        if (!list2.isEmpty()) {
            contact.options = new int[list2.size()];
            for (int i5 = 0; i5 < contact.options.length; i5++) {
                int ordinal3 = ((rm3) list2.get(i5)).ordinal();
                if (ordinal3 == 0) {
                    i2 = 0;
                } else if (ordinal3 == 1) {
                    i2 = 1;
                } else if (ordinal3 == 2) {
                    i2 = 2;
                } else if (ordinal3 == 3) {
                    i2 = 3;
                } else {
                    throw new IncompatibleClassChangeError();
                }
                contact.options[i5] = i2;
            }
        }
        return ad9.toByteArray(contact);
    }

    public final String toString() {
        return "ContactData{serverId=" + this.a + ", deviceAvatarUrl='" + this.b + "', baseUrl='" + this.c + "', baseRawUrl='" + this.d + "', photoId=" + this.e + ", names=" + this.f + ", lastUpdateTime=" + this.g + ", serverPhone=" + this.h + ", status=" + this.i + ", type=" + this.k + ", gender=" + g63.r(this.l) + ", settings=" + this.m + ", options=" + this.n + ", description='" + this.o + "', link='" + this.p + "', birthday='" + this.q + "', lastSearchClickTime=" + this.r + ", lastSyncTime=" + this.s + ", lastShowingUnknownContactBar=" + this.t + "', menuButton=" + this.u + ", profileOptions=" + this.v + '}';
    }
}
