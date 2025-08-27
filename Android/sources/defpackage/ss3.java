package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: ss3  reason: default package */
public abstract class ss3 {
    public static ts3 a(byte[] bArr) {
        int i;
        int i2 = 4;
        try {
            Tasks.ContactUpdate contactUpdate = (Tasks.ContactUpdate) ad9.mergeFrom(new Tasks.ContactUpdate(), bArr);
            long j = contactUpdate.requestId;
            long j2 = contactUpdate.contactId;
            String str = contactUpdate.action;
            str.getClass();
            char c = 65535;
            switch (str.hashCode()) {
                case -1881281404:
                    if (str.equals("REMOVE")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1785516855:
                    if (str.equals("UPDATE")) {
                        c = 1;
                        break;
                    }
                    break;
                case 64641:
                    if (str.equals("ADD")) {
                        c = 2;
                        break;
                    }
                    break;
                case 63294573:
                    if (str.equals("BLOCK")) {
                        c = 3;
                        break;
                    }
                    break;
                case 424769908:
                    if (str.equals("UNBLOCK")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    i = 3;
                    break;
                case 1:
                    i2 = 5;
                    break;
                case 2:
                    break;
                case 3:
                    i = 1;
                    break;
                case 4:
                    i = 2;
                    break;
                default:
                    throw new IllegalArgumentException(wj6.k("No such value ", str, " for ContactUpdateAction"));
            }
            i = i2;
            return new ts3(i, j, j2, contactUpdate.oldName, contactUpdate.oldLastName, contactUpdate.newName, contactUpdate.lastName);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        }
    }
}
