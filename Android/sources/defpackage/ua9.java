package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* renamed from: ua9  reason: default package */
public abstract class ua9 {
    public static final /* synthetic */ int a = 0;

    public static ArrayList a(Protos.MessageElements messageElements) {
        sa9 sa9;
        sa9 sa92;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            Protos.MessageElement[] messageElementArr = messageElements.elements;
            if (i >= messageElementArr.length) {
                return arrayList;
            }
            Protos.MessageElement messageElement = messageElementArr[i];
            int i2 = messageElement.type;
            Map map = null;
            switch (i2) {
                case 0:
                    sa92 = sa9.a;
                    break;
                case 1:
                    sa92 = sa9.b;
                    break;
                case 2:
                    sa92 = sa9.o;
                    break;
                case 3:
                    sa92 = sa9.c;
                    break;
                case 4:
                    sa92 = sa9.v;
                    break;
                case 5:
                    sa92 = sa9.w;
                    break;
                case 6:
                    sa92 = sa9.x;
                    break;
                case 7:
                    sa92 = sa9.z;
                    break;
                case 8:
                    sa92 = sa9.X;
                    break;
                case 9:
                    sa92 = sa9.y;
                    break;
                case 10:
                    sa92 = sa9.Y;
                    break;
                default:
                    Locale locale = Locale.ENGLISH;
                    z68.f("ua9", "Unknown protoElement type = " + i2, (Throwable) null);
                    sa9 = null;
                    break;
            }
            sa9 = sa92;
            long j = messageElement.entityId;
            String str = TextUtils.isEmpty(messageElement.entityName) ? null : messageElement.entityName;
            int i3 = messageElement.from;
            int i4 = messageElement.length;
            Protos.MessageElement.LinkAttributes linkAttributes = messageElement.linkAttributes;
            if (linkAttributes != null) {
                map = Collections.singletonMap("url", linkAttributes.url);
            }
            arrayList.add(new ta9(j, str, sa9, i3, i4, map));
            i++;
        }
    }

    public static byte[] b(List list) {
        return ad9.toByteArray(c(list));
    }

    public static Protos.MessageElements c(List list) {
        Protos.MessageElements messageElements = new Protos.MessageElements();
        messageElements.elements = new Protos.MessageElement[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ta9 ta9 = (ta9) list.get(i);
            Protos.MessageElement messageElement = new Protos.MessageElement();
            messageElement.entityId = ta9.a;
            byte[] bArr = b.a;
            String str = ta9.b;
            if (str == null) {
                str = "";
            }
            messageElement.entityName = str;
            messageElement.from = ta9.d;
            messageElement.length = ta9.e;
            switch (ta9.c.ordinal()) {
                case 0:
                    messageElement.type = 0;
                    break;
                case 1:
                    messageElement.type = 1;
                    break;
                case 2:
                    messageElement.type = 3;
                    break;
                case 3:
                    messageElement.type = 2;
                    break;
                case 4:
                    messageElement.type = 4;
                    break;
                case 5:
                    messageElement.type = 5;
                    Map map = ta9.f;
                    if (map.containsKey("url")) {
                        Protos.MessageElement.LinkAttributes linkAttributes = new Protos.MessageElement.LinkAttributes();
                        messageElement.linkAttributes = linkAttributes;
                        linkAttributes.url = (String) map.get("url");
                        break;
                    } else {
                        throw new IllegalStateException("There are not enough attributes for the type = LINK");
                    }
                case 6:
                    messageElement.type = 6;
                    break;
                case 7:
                    messageElement.type = 9;
                    break;
                case 8:
                    messageElement.type = 7;
                    break;
                case 9:
                    messageElement.type = 8;
                    break;
                case 10:
                    messageElement.type = 10;
                    break;
            }
            messageElements.elements[i] = messageElement;
        }
        return messageElements;
    }
}
