package ru.ok.tamtam.nano;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import one.me.common.drawable.SavedMessagesIconDrawable;
import ru.ok.tamtam.nano.Protos;

public interface Tasks {
    public static final int EMOJI = 0;
    public static final int FAVORITE_STICKER = 3;
    public static final int FAVORITE_STICKER_SET = 4;
    public static final int RECENT = 5;
    public static final int STICKER = 1;
    public static final int STICKER_REACTION = 1;
    public static final int STICKER_SET = 2;
    public static final int UNKNOWN = 0;

    public static final class AssetsAdd extends ad9 {
        private static volatile AssetsAdd[] _emptyArray;
        public int assetType;
        public long id;
        public long requestId;

        public AssetsAdd() {
            clear();
        }

        public static AssetsAdd[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new AssetsAdd[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static AssetsAdd parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (AssetsAdd) ad9.mergeFrom(new AssetsAdd(), bArr);
        }

        public AssetsAdd clear() {
            this.requestId = 0;
            this.assetType = 0;
            this.id = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            int i = this.assetType;
            if (i != 0) {
                h += j43.f(2, i);
            }
            long j2 = this.id;
            return j2 != 0 ? h + j43.h(3, j2) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            int i = this.assetType;
            if (i != 0) {
                j43.w(2, i);
            }
            long j2 = this.id;
            if (j2 != 0) {
                j43.x(3, j2);
            }
        }

        public static AssetsAdd parseFrom(i43 i43) throws IOException {
            return new AssetsAdd().mergeFrom(i43);
        }

        public AssetsAdd mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    int p = i43.p();
                    if (p == 0 || p == 1 || p == 2 || p == 3 || p == 4 || p == 5) {
                        this.assetType = p;
                    }
                } else if (s == 24) {
                    this.id = i43.q();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class AssetsListModify extends ad9 {
        private static volatile AssetsListModify[] _emptyArray;
        public int assetType;
        public long[] ids;
        public long modifyTime;
        public long requestId;

        public AssetsListModify() {
            clear();
        }

        public static AssetsListModify[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new AssetsListModify[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static AssetsListModify parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (AssetsListModify) ad9.mergeFrom(new AssetsListModify(), bArr);
        }

        public AssetsListModify clear() {
            this.requestId = 0;
            this.assetType = 0;
            this.ids = ct.e;
            this.modifyTime = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long[] jArr;
            long j = this.requestId;
            int i = 0;
            int h = j != 0 ? j43.h(1, j) : 0;
            int i2 = this.assetType;
            if (i2 != 0) {
                h += j43.f(2, i2);
            }
            long[] jArr2 = this.ids;
            if (jArr2 != null && jArr2.length > 0) {
                int i3 = 0;
                while (true) {
                    jArr = this.ids;
                    if (i >= jArr.length) {
                        break;
                    }
                    i3 += j43.k(jArr[i]);
                    i++;
                }
                h = h + i3 + jArr.length;
            }
            long j2 = this.modifyTime;
            return j2 != 0 ? h + j43.h(4, j2) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            int i = this.assetType;
            if (i != 0) {
                j43.w(2, i);
            }
            long[] jArr = this.ids;
            if (jArr != null && jArr.length > 0) {
                int i2 = 0;
                while (true) {
                    long[] jArr2 = this.ids;
                    if (i2 >= jArr2.length) {
                        break;
                    }
                    j43.x(3, jArr2[i2]);
                    i2++;
                }
            }
            long j2 = this.modifyTime;
            if (j2 != 0) {
                j43.x(4, j2);
            }
        }

        public static AssetsListModify parseFrom(i43 i43) throws IOException {
            return new AssetsListModify().mergeFrom(i43);
        }

        public AssetsListModify mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    int p = i43.p();
                    if (p == 0 || p == 1 || p == 2 || p == 3 || p == 4 || p == 5) {
                        this.assetType = p;
                    }
                } else if (s == 24) {
                    int q = ct.q(i43, 24);
                    long[] jArr = this.ids;
                    int length = jArr == null ? 0 : jArr.length;
                    int i = q + length;
                    long[] jArr2 = new long[i];
                    if (length != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jArr2[length] = i43.q();
                        i43.s();
                        length++;
                    }
                    jArr2[length] = i43.q();
                    this.ids = jArr2;
                } else if (s == 26) {
                    int e = i43.e(i43.p());
                    int c = i43.c();
                    int i2 = 0;
                    while (i43.b() > 0) {
                        i43.q();
                        i2++;
                    }
                    i43.t(c);
                    long[] jArr3 = this.ids;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i3 = i2 + length2;
                    long[] jArr4 = new long[i3];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        jArr4[length2] = i43.q();
                        length2++;
                    }
                    this.ids = jArr4;
                    i43.d(e);
                } else if (s == 32) {
                    this.modifyTime = i43.q();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class AssetsMove extends ad9 {
        private static volatile AssetsMove[] _emptyArray;
        public int assetType;
        public long id;
        public int position;
        public long prevId;
        public long requestId;

        public AssetsMove() {
            clear();
        }

        public static AssetsMove[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new AssetsMove[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static AssetsMove parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (AssetsMove) ad9.mergeFrom(new AssetsMove(), bArr);
        }

        public AssetsMove clear() {
            this.requestId = 0;
            this.assetType = 0;
            this.id = 0;
            this.prevId = 0;
            this.position = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            int i = this.assetType;
            if (i != 0) {
                h += j43.f(2, i);
            }
            long j2 = this.id;
            if (j2 != 0) {
                h += j43.h(3, j2);
            }
            long j3 = this.prevId;
            if (j3 != 0) {
                h += j43.h(4, j3);
            }
            int i2 = this.position;
            return i2 != 0 ? h + j43.f(5, i2) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            int i = this.assetType;
            if (i != 0) {
                j43.w(2, i);
            }
            long j2 = this.id;
            if (j2 != 0) {
                j43.x(3, j2);
            }
            long j3 = this.prevId;
            if (j3 != 0) {
                j43.x(4, j3);
            }
            int i2 = this.position;
            if (i2 != 0) {
                j43.w(5, i2);
            }
        }

        public static AssetsMove parseFrom(i43 i43) throws IOException {
            return new AssetsMove().mergeFrom(i43);
        }

        public AssetsMove mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    int p = i43.p();
                    if (p == 0 || p == 1 || p == 2 || p == 3 || p == 4 || p == 5) {
                        this.assetType = p;
                    }
                } else if (s == 24) {
                    this.id = i43.q();
                } else if (s == 32) {
                    this.prevId = i43.q();
                } else if (s == 40) {
                    this.position = i43.p();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class AssetsRemove extends ad9 {
        private static volatile AssetsRemove[] _emptyArray;
        public int assetType;
        public long id;
        public long[] ids;
        public long requestId;

        public AssetsRemove() {
            clear();
        }

        public static AssetsRemove[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new AssetsRemove[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static AssetsRemove parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (AssetsRemove) ad9.mergeFrom(new AssetsRemove(), bArr);
        }

        public AssetsRemove clear() {
            this.requestId = 0;
            this.assetType = 0;
            this.id = 0;
            this.ids = ct.e;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int i = 0;
            int h = j != 0 ? j43.h(1, j) : 0;
            int i2 = this.assetType;
            if (i2 != 0) {
                h += j43.f(2, i2);
            }
            long j2 = this.id;
            if (j2 != 0) {
                h += j43.h(3, j2);
            }
            long[] jArr = this.ids;
            if (jArr == null || jArr.length <= 0) {
                return h;
            }
            int i3 = 0;
            while (true) {
                long[] jArr2 = this.ids;
                if (i >= jArr2.length) {
                    return h + i3 + jArr2.length;
                }
                i3 += j43.k(jArr2[i]);
                i++;
            }
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            int i = this.assetType;
            if (i != 0) {
                j43.w(2, i);
            }
            long j2 = this.id;
            if (j2 != 0) {
                j43.x(3, j2);
            }
            long[] jArr = this.ids;
            if (jArr != null && jArr.length > 0) {
                int i2 = 0;
                while (true) {
                    long[] jArr2 = this.ids;
                    if (i2 < jArr2.length) {
                        j43.x(4, jArr2[i2]);
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }

        public static AssetsRemove parseFrom(i43 i43) throws IOException {
            return new AssetsRemove().mergeFrom(i43);
        }

        public AssetsRemove mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    int p = i43.p();
                    if (p == 0 || p == 1 || p == 2 || p == 3 || p == 4 || p == 5) {
                        this.assetType = p;
                    }
                } else if (s == 24) {
                    this.id = i43.q();
                } else if (s == 32) {
                    int q = ct.q(i43, 32);
                    long[] jArr = this.ids;
                    int length = jArr == null ? 0 : jArr.length;
                    int i = q + length;
                    long[] jArr2 = new long[i];
                    if (length != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jArr2[length] = i43.q();
                        i43.s();
                        length++;
                    }
                    jArr2[length] = i43.q();
                    this.ids = jArr2;
                } else if (s == 34) {
                    int e = i43.e(i43.p());
                    int c = i43.c();
                    int i2 = 0;
                    while (i43.b() > 0) {
                        i43.q();
                        i2++;
                    }
                    i43.t(c);
                    long[] jArr3 = this.ids;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i3 = i2 + length2;
                    long[] jArr4 = new long[i3];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        jArr4[length2] = i43.q();
                        length2++;
                    }
                    this.ids = jArr4;
                    i43.d(e);
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class ChangeChatPhoto extends ad9 {
        private static volatile ChangeChatPhoto[] _emptyArray;
        public long chatId;
        public Rect crop;
        public String file;
        public long lastModified;
        public long requestId;

        public ChangeChatPhoto() {
            clear();
        }

        public static ChangeChatPhoto[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChangeChatPhoto[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ChangeChatPhoto parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChangeChatPhoto) ad9.mergeFrom(new ChangeChatPhoto(), bArr);
        }

        public ChangeChatPhoto clear() {
            this.requestId = 0;
            this.file = "";
            this.chatId = 0;
            this.crop = null;
            this.lastModified = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            if (!this.file.equals("")) {
                h += j43.l(2, this.file);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                h += j43.h(3, j2);
            }
            Rect rect = this.crop;
            if (rect != null) {
                h += j43.i(4, rect);
            }
            long j3 = this.lastModified;
            return j3 != 0 ? h + j43.h(5, j3) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            if (!this.file.equals("")) {
                j43.E(2, this.file);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                j43.x(3, j2);
            }
            Rect rect = this.crop;
            if (rect != null) {
                j43.y(4, rect);
            }
            long j3 = this.lastModified;
            if (j3 != 0) {
                j43.x(5, j3);
            }
        }

        public static ChangeChatPhoto parseFrom(i43 i43) throws IOException {
            return new ChangeChatPhoto().mergeFrom(i43);
        }

        public ChangeChatPhoto mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 18) {
                    this.file = i43.r();
                } else if (s == 24) {
                    this.chatId = i43.q();
                } else if (s == 34) {
                    if (this.crop == null) {
                        this.crop = new Rect();
                    }
                    i43.j(this.crop);
                } else if (s == 40) {
                    this.lastModified = i43.q();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class ChangeProfileOrChatPhoto extends ad9 {
        private static volatile ChangeProfileOrChatPhoto[] _emptyArray;
        public long chatId;
        public Rect crop;
        public String file;
        public long lastModified;
        public long requestId;

        public ChangeProfileOrChatPhoto() {
            clear();
        }

        public static ChangeProfileOrChatPhoto[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChangeProfileOrChatPhoto[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ChangeProfileOrChatPhoto parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChangeProfileOrChatPhoto) ad9.mergeFrom(new ChangeProfileOrChatPhoto(), bArr);
        }

        public ChangeProfileOrChatPhoto clear() {
            this.requestId = 0;
            this.file = "";
            this.chatId = 0;
            this.crop = null;
            this.lastModified = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            if (!this.file.equals("")) {
                h += j43.l(2, this.file);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                h += j43.h(3, j2);
            }
            Rect rect = this.crop;
            if (rect != null) {
                h += j43.i(4, rect);
            }
            long j3 = this.lastModified;
            return j3 != 0 ? h + j43.h(5, j3) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            if (!this.file.equals("")) {
                j43.E(2, this.file);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                j43.x(3, j2);
            }
            Rect rect = this.crop;
            if (rect != null) {
                j43.y(4, rect);
            }
            long j3 = this.lastModified;
            if (j3 != 0) {
                j43.x(5, j3);
            }
        }

        public static ChangeProfileOrChatPhoto parseFrom(i43 i43) throws IOException {
            return new ChangeProfileOrChatPhoto().mergeFrom(i43);
        }

        public ChangeProfileOrChatPhoto mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 18) {
                    this.file = i43.r();
                } else if (s == 24) {
                    this.chatId = i43.q();
                } else if (s == 34) {
                    if (this.crop == null) {
                        this.crop = new Rect();
                    }
                    i43.j(this.crop);
                } else if (s == 40) {
                    this.lastModified = i43.q();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class ChannelLeave extends ad9 {
        private static volatile ChannelLeave[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public long requestId;

        public ChannelLeave() {
            clear();
        }

        public static ChannelLeave[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChannelLeave[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ChannelLeave parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChannelLeave) ad9.mergeFrom(new ChannelLeave(), bArr);
        }

        public ChannelLeave clear() {
            this.requestId = 0;
            this.chatId = 0;
            this.chatServerId = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            long j3 = this.chatServerId;
            return j3 != 0 ? h + j43.h(3, j3) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                j43.x(3, j3);
            }
        }

        public static ChannelLeave parseFrom(i43 i43) throws IOException {
            return new ChannelLeave().mergeFrom(i43);
        }

        public ChannelLeave mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    this.chatId = i43.q();
                } else if (s == 24) {
                    this.chatServerId = i43.q();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class ChatClear extends ad9 {
        private static volatile ChatClear[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public boolean forAll;
        public long lastEventTime;
        public long requestId;

        public ChatClear() {
            clear();
        }

        public static ChatClear[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatClear[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatClear parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatClear) ad9.mergeFrom(new ChatClear(), bArr);
        }

        public ChatClear clear() {
            this.requestId = 0;
            this.chatId = 0;
            this.chatServerId = 0;
            this.lastEventTime = 0;
            this.forAll = false;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                h += j43.h(3, j3);
            }
            long j4 = this.lastEventTime;
            if (j4 != 0) {
                h += j43.h(4, j4);
            }
            return this.forAll ? h + j43.a(5) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                j43.x(3, j3);
            }
            long j4 = this.lastEventTime;
            if (j4 != 0) {
                j43.x(4, j4);
            }
            boolean z = this.forAll;
            if (z) {
                j43.r(5, z);
            }
        }

        public static ChatClear parseFrom(i43 i43) throws IOException {
            return new ChatClear().mergeFrom(i43);
        }

        public ChatClear mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    this.chatId = i43.q();
                } else if (s == 24) {
                    this.chatServerId = i43.q();
                } else if (s == 32) {
                    this.lastEventTime = i43.q();
                } else if (s == 40) {
                    this.forAll = i43.f();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class ChatClose extends ad9 {
        private static volatile ChatClose[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public long requestId;

        public ChatClose() {
            clear();
        }

        public static ChatClose[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatClose[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatClose parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatClose) ad9.mergeFrom(new ChatClose(), bArr);
        }

        public ChatClose clear() {
            this.requestId = 0;
            this.chatId = 0;
            this.chatServerId = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            long j3 = this.chatServerId;
            return j3 != 0 ? h + j43.h(3, j3) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                j43.x(3, j3);
            }
        }

        public static ChatClose parseFrom(i43 i43) throws IOException {
            return new ChatClose().mergeFrom(i43);
        }

        public ChatClose mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    this.chatId = i43.q();
                } else if (s == 24) {
                    this.chatServerId = i43.q();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class ChatComplain extends ad9 {
        private static volatile ChatComplain[] _emptyArray;
        public long chatId;
        public String complaint;
        public long requestId;

        public ChatComplain() {
            clear();
        }

        public static ChatComplain[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatComplain[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatComplain parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatComplain) ad9.mergeFrom(new ChatComplain(), bArr);
        }

        public ChatComplain clear() {
            this.requestId = 0;
            this.chatId = 0;
            this.complaint = "";
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            return !this.complaint.equals("") ? h + j43.l(3, this.complaint) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            if (!this.complaint.equals("")) {
                j43.E(3, this.complaint);
            }
        }

        public static ChatComplain parseFrom(i43 i43) throws IOException {
            return new ChatComplain().mergeFrom(i43);
        }

        public ChatComplain mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    this.chatId = i43.q();
                } else if (s == 26) {
                    this.complaint = i43.r();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class ChatCreate extends ad9 {
        private static volatile ChatCreate[] _emptyArray;
        public long chatId;
        public String chatType;
        public long cid;
        public long groupId;
        public long requestId;
        public String startPayload;
        public long subjectId;
        public String subjectType;

        public ChatCreate() {
            clear();
        }

        public static ChatCreate[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatCreate[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatCreate parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatCreate) ad9.mergeFrom(new ChatCreate(), bArr);
        }

        public ChatCreate clear() {
            this.requestId = 0;
            this.chatId = 0;
            this.chatType = "";
            this.groupId = 0;
            this.subjectType = "";
            this.subjectId = 0;
            this.startPayload = "";
            this.cid = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            if (!this.chatType.equals("")) {
                h += j43.l(3, this.chatType);
            }
            long j3 = this.groupId;
            if (j3 != 0) {
                h += j43.h(4, j3);
            }
            if (!this.subjectType.equals("")) {
                h += j43.l(5, this.subjectType);
            }
            long j4 = this.subjectId;
            if (j4 != 0) {
                h += j43.h(6, j4);
            }
            if (!this.startPayload.equals("")) {
                h += j43.l(7, this.startPayload);
            }
            long j5 = this.cid;
            return j5 != 0 ? h + j43.h(8, j5) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            if (!this.chatType.equals("")) {
                j43.E(3, this.chatType);
            }
            long j3 = this.groupId;
            if (j3 != 0) {
                j43.x(4, j3);
            }
            if (!this.subjectType.equals("")) {
                j43.E(5, this.subjectType);
            }
            long j4 = this.subjectId;
            if (j4 != 0) {
                j43.x(6, j4);
            }
            if (!this.startPayload.equals("")) {
                j43.E(7, this.startPayload);
            }
            long j5 = this.cid;
            if (j5 != 0) {
                j43.x(8, j5);
            }
        }

        public static ChatCreate parseFrom(i43 i43) throws IOException {
            return new ChatCreate().mergeFrom(i43);
        }

        public ChatCreate mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    this.chatId = i43.q();
                } else if (s == 26) {
                    this.chatType = i43.r();
                } else if (s == 32) {
                    this.groupId = i43.q();
                } else if (s == 42) {
                    this.subjectType = i43.r();
                } else if (s == 48) {
                    this.subjectId = i43.q();
                } else if (s == 58) {
                    this.startPayload = i43.r();
                } else if (s == 64) {
                    this.cid = i43.q();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class ChatDelete extends ad9 {
        private static volatile ChatDelete[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public boolean forAll;
        public long lastEventTime;
        public long requestId;

        public ChatDelete() {
            clear();
        }

        public static ChatDelete[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatDelete[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatDelete parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatDelete) ad9.mergeFrom(new ChatDelete(), bArr);
        }

        public ChatDelete clear() {
            this.requestId = 0;
            this.chatId = 0;
            this.chatServerId = 0;
            this.lastEventTime = 0;
            this.forAll = false;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                h += j43.h(3, j3);
            }
            long j4 = this.lastEventTime;
            if (j4 != 0) {
                h += j43.h(4, j4);
            }
            return this.forAll ? h + j43.a(5) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                j43.x(3, j3);
            }
            long j4 = this.lastEventTime;
            if (j4 != 0) {
                j43.x(4, j4);
            }
            boolean z = this.forAll;
            if (z) {
                j43.r(5, z);
            }
        }

        public static ChatDelete parseFrom(i43 i43) throws IOException {
            return new ChatDelete().mergeFrom(i43);
        }

        public ChatDelete mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    this.chatId = i43.q();
                } else if (s == 24) {
                    this.chatServerId = i43.q();
                } else if (s == 32) {
                    this.lastEventTime = i43.q();
                } else if (s == 40) {
                    this.forAll = i43.f();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class ChatGroupMark extends ad9 {
        private static volatile ChatGroupMark[] _emptyArray;
        public long chatId;
        public boolean enabled;
        public String flagType;
        public long requestId;

        public ChatGroupMark() {
            clear();
        }

        public static ChatGroupMark[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatGroupMark[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatGroupMark parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatGroupMark) ad9.mergeFrom(new ChatGroupMark(), bArr);
        }

        public ChatGroupMark clear() {
            this.requestId = 0;
            this.chatId = 0;
            this.flagType = "";
            this.enabled = false;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            if (!this.flagType.equals("")) {
                h += j43.l(3, this.flagType);
            }
            return this.enabled ? h + j43.a(4) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            if (!this.flagType.equals("")) {
                j43.E(3, this.flagType);
            }
            boolean z = this.enabled;
            if (z) {
                j43.r(4, z);
            }
        }

        public static ChatGroupMark parseFrom(i43 i43) throws IOException {
            return new ChatGroupMark().mergeFrom(i43);
        }

        public ChatGroupMark mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    this.chatId = i43.q();
                } else if (s == 26) {
                    this.flagType = i43.r();
                } else if (s == 32) {
                    this.enabled = i43.f();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class ChatHide extends ad9 {
        private static volatile ChatHide[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public long requestId;

        public ChatHide() {
            clear();
        }

        public static ChatHide[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatHide[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatHide parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatHide) ad9.mergeFrom(new ChatHide(), bArr);
        }

        public ChatHide clear() {
            this.requestId = 0;
            this.chatId = 0;
            this.chatServerId = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            long j3 = this.chatServerId;
            return j3 != 0 ? h + j43.h(3, j3) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                j43.x(3, j3);
            }
        }

        public static ChatHide parseFrom(i43 i43) throws IOException {
            return new ChatHide().mergeFrom(i43);
        }

        public ChatHide mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    this.chatId = i43.q();
                } else if (s == 24) {
                    this.chatServerId = i43.q();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class ChatMark extends ad9 {
        private static volatile ChatMark[] _emptyArray;
        public boolean awaitChatInCache;
        public long chatId;
        public long chatServerId;
        public boolean isReadReaction;
        public long mark;
        public long messageId;
        public long requestId;
        public boolean setAsUnread;

        public ChatMark() {
            clear();
        }

        public static ChatMark[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatMark[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatMark parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatMark) ad9.mergeFrom(new ChatMark(), bArr);
        }

        public ChatMark clear() {
            this.requestId = 0;
            this.chatId = 0;
            this.chatServerId = 0;
            this.mark = 0;
            this.messageId = 0;
            this.setAsUnread = false;
            this.awaitChatInCache = false;
            this.isReadReaction = false;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                h += j43.h(3, j3);
            }
            long j4 = this.mark;
            if (j4 != 0) {
                h += j43.h(4, j4);
            }
            long j5 = this.messageId;
            if (j5 != 0) {
                h += j43.h(5, j5);
            }
            if (this.setAsUnread) {
                h += j43.a(6);
            }
            if (this.awaitChatInCache) {
                h += j43.a(7);
            }
            return this.isReadReaction ? h + j43.a(8) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                j43.x(3, j3);
            }
            long j4 = this.mark;
            if (j4 != 0) {
                j43.x(4, j4);
            }
            long j5 = this.messageId;
            if (j5 != 0) {
                j43.x(5, j5);
            }
            boolean z = this.setAsUnread;
            if (z) {
                j43.r(6, z);
            }
            boolean z2 = this.awaitChatInCache;
            if (z2) {
                j43.r(7, z2);
            }
            boolean z3 = this.isReadReaction;
            if (z3) {
                j43.r(8, z3);
            }
        }

        public static ChatMark parseFrom(i43 i43) throws IOException {
            return new ChatMark().mergeFrom(i43);
        }

        public ChatMark mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    this.chatId = i43.q();
                } else if (s == 24) {
                    this.chatServerId = i43.q();
                } else if (s == 32) {
                    this.mark = i43.q();
                } else if (s == 40) {
                    this.messageId = i43.q();
                } else if (s == 48) {
                    this.setAsUnread = i43.f();
                } else if (s == 56) {
                    this.awaitChatInCache = i43.f();
                } else if (s == 64) {
                    this.isReadReaction = i43.f();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class ChatMembersUpdate extends ad9 {
        private static volatile ChatMembersUpdate[] _emptyArray;
        public long chatId;
        public String chatMemberType;
        public long chatServerId;
        public String operation;
        public long requestId;
        public boolean showHistory;
        public long[] userIds;

        public ChatMembersUpdate() {
            clear();
        }

        public static ChatMembersUpdate[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatMembersUpdate[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatMembersUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatMembersUpdate) ad9.mergeFrom(new ChatMembersUpdate(), bArr);
        }

        public ChatMembersUpdate clear() {
            this.requestId = 0;
            this.chatId = 0;
            this.chatServerId = 0;
            this.operation = "";
            this.userIds = ct.e;
            this.chatMemberType = "";
            this.showHistory = false;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long[] jArr;
            long j = this.requestId;
            int i = 0;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                h += j43.h(3, j3);
            }
            if (!this.operation.equals("")) {
                h += j43.l(4, this.operation);
            }
            long[] jArr2 = this.userIds;
            if (jArr2 != null && jArr2.length > 0) {
                int i2 = 0;
                while (true) {
                    jArr = this.userIds;
                    if (i >= jArr.length) {
                        break;
                    }
                    i2 += j43.k(jArr[i]);
                    i++;
                }
                h = h + i2 + jArr.length;
            }
            if (!this.chatMemberType.equals("")) {
                h += j43.l(6, this.chatMemberType);
            }
            return this.showHistory ? h + j43.a(7) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                j43.x(3, j3);
            }
            if (!this.operation.equals("")) {
                j43.E(4, this.operation);
            }
            long[] jArr = this.userIds;
            if (jArr != null && jArr.length > 0) {
                int i = 0;
                while (true) {
                    long[] jArr2 = this.userIds;
                    if (i >= jArr2.length) {
                        break;
                    }
                    j43.x(5, jArr2[i]);
                    i++;
                }
            }
            if (!this.chatMemberType.equals("")) {
                j43.E(6, this.chatMemberType);
            }
            boolean z = this.showHistory;
            if (z) {
                j43.r(7, z);
            }
        }

        public static ChatMembersUpdate parseFrom(i43 i43) throws IOException {
            return new ChatMembersUpdate().mergeFrom(i43);
        }

        public ChatMembersUpdate mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    this.chatId = i43.q();
                } else if (s == 24) {
                    this.chatServerId = i43.q();
                } else if (s == 34) {
                    this.operation = i43.r();
                } else if (s == 40) {
                    int q = ct.q(i43, 40);
                    long[] jArr = this.userIds;
                    int length = jArr == null ? 0 : jArr.length;
                    int i = q + length;
                    long[] jArr2 = new long[i];
                    if (length != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jArr2[length] = i43.q();
                        i43.s();
                        length++;
                    }
                    jArr2[length] = i43.q();
                    this.userIds = jArr2;
                } else if (s == 42) {
                    int e = i43.e(i43.p());
                    int c = i43.c();
                    int i2 = 0;
                    while (i43.b() > 0) {
                        i43.q();
                        i2++;
                    }
                    i43.t(c);
                    long[] jArr3 = this.userIds;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i3 = i2 + length2;
                    long[] jArr4 = new long[i3];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        jArr4[length2] = i43.q();
                        length2++;
                    }
                    this.userIds = jArr4;
                    i43.d(e);
                } else if (s == 50) {
                    this.chatMemberType = i43.r();
                } else if (s == 56) {
                    this.showHistory = i43.f();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class ChatPinSetVisibility extends ad9 {
        private static volatile ChatPinSetVisibility[] _emptyArray;
        public long chatServerId;
        public long requestId;
        public boolean show;

        public ChatPinSetVisibility() {
            clear();
        }

        public static ChatPinSetVisibility[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatPinSetVisibility[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatPinSetVisibility parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatPinSetVisibility) ad9.mergeFrom(new ChatPinSetVisibility(), bArr);
        }

        public ChatPinSetVisibility clear() {
            this.requestId = 0;
            this.chatServerId = 0;
            this.show = false;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.chatServerId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            return this.show ? h + j43.a(3) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.chatServerId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            boolean z = this.show;
            if (z) {
                j43.r(3, z);
            }
        }

        public static ChatPinSetVisibility parseFrom(i43 i43) throws IOException {
            return new ChatPinSetVisibility().mergeFrom(i43);
        }

        public ChatPinSetVisibility mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    this.chatServerId = i43.q();
                } else if (s == 24) {
                    this.show = i43.f();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class ChatSubscribe extends ad9 {
        private static volatile ChatSubscribe[] _emptyArray;
        public long chatServerId;
        public long requestId;
        public boolean subscribe;

        public ChatSubscribe() {
            clear();
        }

        public static ChatSubscribe[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatSubscribe[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatSubscribe parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatSubscribe) ad9.mergeFrom(new ChatSubscribe(), bArr);
        }

        public ChatSubscribe clear() {
            this.requestId = 0;
            this.chatServerId = 0;
            this.subscribe = false;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.chatServerId;
            if (j2 != 0) {
                h += j43.h(3, j2);
            }
            return this.subscribe ? h + j43.a(4) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.chatServerId;
            if (j2 != 0) {
                j43.x(3, j2);
            }
            boolean z = this.subscribe;
            if (z) {
                j43.r(4, z);
            }
        }

        public static ChatSubscribe parseFrom(i43 i43) throws IOException {
            return new ChatSubscribe().mergeFrom(i43);
        }

        public ChatSubscribe mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 24) {
                    this.chatServerId = i43.q();
                } else if (s == 32) {
                    this.subscribe = i43.f();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class ChatUpdate extends ad9 {
        private static volatile ChatUpdate[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public Rect crop;
        public String description;
        public boolean descriptionIsNull;
        public boolean notifyPin;
        public String photoToken;
        public boolean photoTokenIsNull;
        public long pinMessageId;
        public boolean pinMessageIdIsNull;
        public long requestId;
        public String theme;
        public boolean themeIsNull;

        public ChatUpdate() {
            clear();
        }

        public static ChatUpdate[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatUpdate[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatUpdate) ad9.mergeFrom(new ChatUpdate(), bArr);
        }

        public ChatUpdate clear() {
            this.requestId = 0;
            this.chatId = 0;
            this.chatServerId = 0;
            this.theme = "";
            this.photoToken = "";
            this.crop = null;
            this.themeIsNull = false;
            this.photoTokenIsNull = false;
            this.pinMessageId = 0;
            this.notifyPin = false;
            this.pinMessageIdIsNull = false;
            this.description = "";
            this.descriptionIsNull = false;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                h += j43.h(3, j3);
            }
            if (!this.theme.equals("")) {
                h += j43.l(4, this.theme);
            }
            if (!this.photoToken.equals("")) {
                h += j43.l(5, this.photoToken);
            }
            Rect rect = this.crop;
            if (rect != null) {
                h += j43.i(6, rect);
            }
            if (this.themeIsNull) {
                h += j43.a(7);
            }
            if (this.photoTokenIsNull) {
                h += j43.a(8);
            }
            long j4 = this.pinMessageId;
            if (j4 != 0) {
                h += j43.h(9, j4);
            }
            if (this.notifyPin) {
                h += j43.a(10);
            }
            if (this.pinMessageIdIsNull) {
                h += j43.a(11);
            }
            if (!this.description.equals("")) {
                h += j43.l(12, this.description);
            }
            return this.descriptionIsNull ? h + j43.a(13) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                j43.x(3, j3);
            }
            if (!this.theme.equals("")) {
                j43.E(4, this.theme);
            }
            if (!this.photoToken.equals("")) {
                j43.E(5, this.photoToken);
            }
            Rect rect = this.crop;
            if (rect != null) {
                j43.y(6, rect);
            }
            boolean z = this.themeIsNull;
            if (z) {
                j43.r(7, z);
            }
            boolean z2 = this.photoTokenIsNull;
            if (z2) {
                j43.r(8, z2);
            }
            long j4 = this.pinMessageId;
            if (j4 != 0) {
                j43.x(9, j4);
            }
            boolean z3 = this.notifyPin;
            if (z3) {
                j43.r(10, z3);
            }
            boolean z4 = this.pinMessageIdIsNull;
            if (z4) {
                j43.r(11, z4);
            }
            if (!this.description.equals("")) {
                j43.E(12, this.description);
            }
            boolean z5 = this.descriptionIsNull;
            if (z5) {
                j43.r(13, z5);
            }
        }

        public static ChatUpdate parseFrom(i43 i43) throws IOException {
            return new ChatUpdate().mergeFrom(i43);
        }

        public ChatUpdate mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                switch (s) {
                    case 0:
                        return this;
                    case 8:
                        this.requestId = i43.q();
                        break;
                    case 16:
                        this.chatId = i43.q();
                        break;
                    case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                        this.chatServerId = i43.q();
                        break;
                    case 34:
                        this.theme = i43.r();
                        break;
                    case 42:
                        this.photoToken = i43.r();
                        break;
                    case 50:
                        if (this.crop == null) {
                            this.crop = new Rect();
                        }
                        i43.j(this.crop);
                        break;
                    case 56:
                        this.themeIsNull = i43.f();
                        break;
                    case 64:
                        this.photoTokenIsNull = i43.f();
                        break;
                    case 72:
                        this.pinMessageId = i43.q();
                        break;
                    case 80:
                        this.notifyPin = i43.f();
                        break;
                    case 88:
                        this.pinMessageIdIsNull = i43.f();
                        break;
                    case 98:
                        this.description = i43.r();
                        break;
                    case 104:
                        this.descriptionIsNull = i43.f();
                        break;
                    default:
                        if (i43.u(s)) {
                            break;
                        } else {
                            return this;
                        }
                }
            }
        }
    }

    public static final class ChatsList extends ad9 {
        private static volatile ChatsList[] _emptyArray;
        public long chatsSync;
        public int count;
        public long marker;
        public long requestId;

        public ChatsList() {
            clear();
        }

        public static ChatsList[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatsList[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatsList parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatsList) ad9.mergeFrom(new ChatsList(), bArr);
        }

        public ChatsList clear() {
            this.requestId = 0;
            this.marker = 0;
            this.count = 0;
            this.chatsSync = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.marker;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            int i = this.count;
            if (i != 0) {
                h += j43.f(3, i);
            }
            long j3 = this.chatsSync;
            return j3 != 0 ? h + j43.h(4, j3) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.marker;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            int i = this.count;
            if (i != 0) {
                j43.w(3, i);
            }
            long j3 = this.chatsSync;
            if (j3 != 0) {
                j43.x(4, j3);
            }
        }

        public static ChatsList parseFrom(i43 i43) throws IOException {
            return new ChatsList().mergeFrom(i43);
        }

        public ChatsList mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    this.marker = i43.q();
                } else if (s == 24) {
                    this.count = i43.p();
                } else if (s == 32) {
                    this.chatsSync = i43.q();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class Config extends ad9 {
        private static volatile Config[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public String[] excludedFolders;
        public a[] folders;
        public boolean isForFolders;
        public boolean isPushToken;
        public boolean isUserSettings;
        public long requestId;
        public boolean reset;
        public long[] syncChatIds;
        public Map<String, String> userSettings;

        public Config() {
            clear();
        }

        public static Config[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Config[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static Config parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (Config) ad9.mergeFrom(new Config(), bArr);
        }

        public Config clear() {
            this.requestId = 0;
            this.chatId = 0;
            this.chatServerId = 0;
            this.isPushToken = false;
            this.isUserSettings = false;
            this.userSettings = null;
            this.reset = false;
            this.syncChatIds = ct.e;
            this.isForFolders = false;
            if (a.m == null) {
                synchronized (bj7.b) {
                    try {
                        if (a.m == null) {
                            a.m = new a[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.folders = a.m;
            this.excludedFolders = ct.g;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long[] jArr;
            long j = this.requestId;
            int i = 0;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                h += j43.h(3, j3);
            }
            if (this.isPushToken) {
                h += j43.a(4);
            }
            if (this.isUserSettings) {
                h += j43.a(5);
            }
            Map<String, String> map = this.userSettings;
            if (map != null) {
                h += bj7.a(map, 6, 9, 9);
            }
            if (this.reset) {
                h += j43.a(7);
            }
            long[] jArr2 = this.syncChatIds;
            if (jArr2 != null && jArr2.length > 0) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    jArr = this.syncChatIds;
                    if (i2 >= jArr.length) {
                        break;
                    }
                    i3 += j43.k(jArr[i2]);
                    i2++;
                }
                h = h + i3 + jArr.length;
            }
            if (this.isForFolders) {
                h += j43.a(9);
            }
            a[] aVarArr = this.folders;
            if (aVarArr != null && aVarArr.length > 0) {
                int i4 = 0;
                while (true) {
                    a[] aVarArr2 = this.folders;
                    if (i4 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i4];
                    if (aVar != null) {
                        h = j43.i(10, aVar) + h;
                    }
                    i4++;
                }
            }
            String[] strArr = this.excludedFolders;
            if (strArr == null || strArr.length <= 0) {
                return h;
            }
            int i5 = 0;
            int i6 = 0;
            while (true) {
                String[] strArr2 = this.excludedFolders;
                if (i >= strArr2.length) {
                    return h + i5 + i6;
                }
                String str = strArr2[i];
                if (str != null) {
                    i6++;
                    int q = j43.q(str);
                    i5 = j43.j(q) + q + i5;
                }
                i++;
            }
        }

        public Config mergeFrom(i43 i43) throws IOException {
            sd8 sd8 = y7e.e;
            while (true) {
                int s = i43.s();
                switch (s) {
                    case 0:
                        return this;
                    case 8:
                        this.requestId = i43.q();
                        break;
                    case 16:
                        this.chatId = i43.q();
                        break;
                    case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                        this.chatServerId = i43.q();
                        break;
                    case 32:
                        this.isPushToken = i43.f();
                        break;
                    case SavedMessagesIconDrawable.SMALL_SIZE:
                        this.isUserSettings = i43.f();
                        break;
                    case 50:
                        this.userSettings = bj7.b(i43, this.userSettings, sd8, 9, 9, (ad9) null, 10, 18);
                        break;
                    case 56:
                        this.reset = i43.f();
                        break;
                    case 64:
                        int q = ct.q(i43, 64);
                        long[] jArr = this.syncChatIds;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = q + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = i43.q();
                            i43.s();
                            length++;
                        }
                        jArr2[length] = i43.q();
                        this.syncChatIds = jArr2;
                        break;
                    case 66:
                        int e = i43.e(i43.p());
                        int c = i43.c();
                        int i2 = 0;
                        while (i43.b() > 0) {
                            i43.q();
                            i2++;
                        }
                        i43.t(c);
                        long[] jArr3 = this.syncChatIds;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = i43.q();
                            length2++;
                        }
                        this.syncChatIds = jArr4;
                        i43.d(e);
                        break;
                    case 72:
                        this.isForFolders = i43.f();
                        break;
                    case 82:
                        int q2 = ct.q(i43, 82);
                        a[] aVarArr = this.folders;
                        int length3 = aVarArr == null ? 0 : aVarArr.length;
                        int i4 = q2 + length3;
                        a[] aVarArr2 = new a[i4];
                        if (length3 != 0) {
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, length3);
                        }
                        while (length3 < i4 - 1) {
                            a aVar = new a();
                            aVarArr2[length3] = aVar;
                            i43.j(aVar);
                            i43.s();
                            length3++;
                        }
                        a aVar2 = new a();
                        aVarArr2[length3] = aVar2;
                        i43.j(aVar2);
                        this.folders = aVarArr2;
                        break;
                    case 90:
                        int q3 = ct.q(i43, 90);
                        String[] strArr = this.excludedFolders;
                        int length4 = strArr == null ? 0 : strArr.length;
                        int i5 = q3 + length4;
                        String[] strArr2 = new String[i5];
                        if (length4 != 0) {
                            System.arraycopy(strArr, 0, strArr2, 0, length4);
                        }
                        while (length4 < i5 - 1) {
                            strArr2[length4] = i43.r();
                            i43.s();
                            length4++;
                        }
                        strArr2[length4] = i43.r();
                        this.excludedFolders = strArr2;
                        break;
                    default:
                        if (i43.u(s)) {
                            break;
                        } else {
                            return this;
                        }
                }
            }
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                j43.x(3, j3);
            }
            boolean z = this.isPushToken;
            if (z) {
                j43.r(4, z);
            }
            boolean z2 = this.isUserSettings;
            if (z2) {
                j43.r(5, z2);
            }
            Map<String, String> map = this.userSettings;
            if (map != null) {
                bj7.d(j43, map, 6, 9, 9);
            }
            boolean z3 = this.reset;
            if (z3) {
                j43.r(7, z3);
            }
            long[] jArr = this.syncChatIds;
            int i = 0;
            if (jArr != null && jArr.length > 0) {
                int i2 = 0;
                while (true) {
                    long[] jArr2 = this.syncChatIds;
                    if (i2 >= jArr2.length) {
                        break;
                    }
                    j43.x(8, jArr2[i2]);
                    i2++;
                }
            }
            boolean z4 = this.isForFolders;
            if (z4) {
                j43.r(9, z4);
            }
            a[] aVarArr = this.folders;
            if (aVarArr != null && aVarArr.length > 0) {
                int i3 = 0;
                while (true) {
                    a[] aVarArr2 = this.folders;
                    if (i3 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i3];
                    if (aVar != null) {
                        j43.y(10, aVar);
                    }
                    i3++;
                }
            }
            String[] strArr = this.excludedFolders;
            if (strArr != null && strArr.length > 0) {
                while (true) {
                    String[] strArr2 = this.excludedFolders;
                    if (i < strArr2.length) {
                        String str = strArr2[i];
                        if (str != null) {
                            j43.E(11, str);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }

        public static Config parseFrom(i43 i43) throws IOException {
            return new Config().mergeFrom(i43);
        }
    }

    public static final class ConfirmPresent extends ad9 {
        private static volatile ConfirmPresent[] _emptyArray;
        public boolean accept;
        public boolean asPrivate;
        public long chatId;
        public long chatServerId;
        public long messageId;
        public long messageServerId;
        public long metadataId;
        public long presentId;
        public long requestId;

        public ConfirmPresent() {
            clear();
        }

        public static ConfirmPresent[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ConfirmPresent[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ConfirmPresent parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ConfirmPresent) ad9.mergeFrom(new ConfirmPresent(), bArr);
        }

        public ConfirmPresent clear() {
            this.requestId = 0;
            this.presentId = 0;
            this.metadataId = 0;
            this.chatId = 0;
            this.chatServerId = 0;
            this.messageId = 0;
            this.messageServerId = 0;
            this.accept = false;
            this.asPrivate = false;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.presentId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            long j3 = this.metadataId;
            if (j3 != 0) {
                h += j43.h(3, j3);
            }
            long j4 = this.chatId;
            if (j4 != 0) {
                h += j43.h(4, j4);
            }
            long j5 = this.chatServerId;
            if (j5 != 0) {
                h += j43.h(5, j5);
            }
            long j6 = this.messageId;
            if (j6 != 0) {
                h += j43.h(6, j6);
            }
            long j7 = this.messageServerId;
            if (j7 != 0) {
                h += j43.h(7, j7);
            }
            if (this.accept) {
                h += j43.a(8);
            }
            return this.asPrivate ? h + j43.a(9) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.presentId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            long j3 = this.metadataId;
            if (j3 != 0) {
                j43.x(3, j3);
            }
            long j4 = this.chatId;
            if (j4 != 0) {
                j43.x(4, j4);
            }
            long j5 = this.chatServerId;
            if (j5 != 0) {
                j43.x(5, j5);
            }
            long j6 = this.messageId;
            if (j6 != 0) {
                j43.x(6, j6);
            }
            long j7 = this.messageServerId;
            if (j7 != 0) {
                j43.x(7, j7);
            }
            boolean z = this.accept;
            if (z) {
                j43.r(8, z);
            }
            boolean z2 = this.asPrivate;
            if (z2) {
                j43.r(9, z2);
            }
        }

        public static ConfirmPresent parseFrom(i43 i43) throws IOException {
            return new ConfirmPresent().mergeFrom(i43);
        }

        public ConfirmPresent mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    this.presentId = i43.q();
                } else if (s == 24) {
                    this.metadataId = i43.q();
                } else if (s == 32) {
                    this.chatId = i43.q();
                } else if (s == 40) {
                    this.chatServerId = i43.q();
                } else if (s == 48) {
                    this.messageId = i43.q();
                } else if (s == 56) {
                    this.messageServerId = i43.q();
                } else if (s == 64) {
                    this.accept = i43.f();
                } else if (s == 72) {
                    this.asPrivate = i43.f();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class CongratsStatus extends ad9 {
        private static volatile CongratsStatus[] _emptyArray;
        public String holidayId;
        public long requestId;
        public boolean status;
        public long userId;

        public CongratsStatus() {
            clear();
        }

        public static CongratsStatus[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new CongratsStatus[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static CongratsStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (CongratsStatus) ad9.mergeFrom(new CongratsStatus(), bArr);
        }

        public CongratsStatus clear() {
            this.requestId = 0;
            this.userId = 0;
            this.status = false;
            this.holidayId = "";
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.userId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            if (this.status) {
                h += j43.a(3);
            }
            return !this.holidayId.equals("") ? h + j43.l(4, this.holidayId) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.userId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            boolean z = this.status;
            if (z) {
                j43.r(3, z);
            }
            if (!this.holidayId.equals("")) {
                j43.E(4, this.holidayId);
            }
        }

        public static CongratsStatus parseFrom(i43 i43) throws IOException {
            return new CongratsStatus().mergeFrom(i43);
        }

        public CongratsStatus mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    this.userId = i43.q();
                } else if (s == 24) {
                    this.status = i43.f();
                } else if (s == 34) {
                    this.holidayId = i43.r();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class ContactUpdate extends ad9 {
        private static volatile ContactUpdate[] _emptyArray;
        public String action;
        public long contactId;
        public String lastName;
        public String newName;
        public String oldLastName;
        public String oldName;
        public long requestId;

        public ContactUpdate() {
            clear();
        }

        public static ContactUpdate[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ContactUpdate[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ContactUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ContactUpdate) ad9.mergeFrom(new ContactUpdate(), bArr);
        }

        public ContactUpdate clear() {
            this.requestId = 0;
            this.contactId = 0;
            this.action = "";
            this.oldName = "";
            this.newName = "";
            this.lastName = "";
            this.oldLastName = "";
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.contactId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            if (!this.action.equals("")) {
                h += j43.l(3, this.action);
            }
            if (!this.oldName.equals("")) {
                h += j43.l(4, this.oldName);
            }
            if (!this.newName.equals("")) {
                h += j43.l(5, this.newName);
            }
            if (!this.lastName.equals("")) {
                h += j43.l(6, this.lastName);
            }
            return !this.oldLastName.equals("") ? h + j43.l(7, this.oldLastName) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.contactId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            if (!this.action.equals("")) {
                j43.E(3, this.action);
            }
            if (!this.oldName.equals("")) {
                j43.E(4, this.oldName);
            }
            if (!this.newName.equals("")) {
                j43.E(5, this.newName);
            }
            if (!this.lastName.equals("")) {
                j43.E(6, this.lastName);
            }
            if (!this.oldLastName.equals("")) {
                j43.E(7, this.oldLastName);
            }
        }

        public static ContactUpdate parseFrom(i43 i43) throws IOException {
            return new ContactUpdate().mergeFrom(i43);
        }

        public ContactUpdate mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    this.contactId = i43.q();
                } else if (s == 26) {
                    this.action = i43.r();
                } else if (s == 34) {
                    this.oldName = i43.r();
                } else if (s == 42) {
                    this.newName = i43.r();
                } else if (s == 50) {
                    this.lastName = i43.r();
                } else if (s == 58) {
                    this.oldLastName = i43.r();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class ContactVerify extends ad9 {
        private static volatile ContactVerify[] _emptyArray;
        public boolean confirm;
        public long contactId;
        public String localName;
        public long requestId;

        public ContactVerify() {
            clear();
        }

        public static ContactVerify[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ContactVerify[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ContactVerify parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ContactVerify) ad9.mergeFrom(new ContactVerify(), bArr);
        }

        public ContactVerify clear() {
            this.requestId = 0;
            this.contactId = 0;
            this.localName = "";
            this.confirm = false;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.contactId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            if (!this.localName.equals("")) {
                h += j43.l(3, this.localName);
            }
            return this.confirm ? h + j43.a(4) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.contactId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            if (!this.localName.equals("")) {
                j43.E(3, this.localName);
            }
            boolean z = this.confirm;
            if (z) {
                j43.r(4, z);
            }
        }

        public static ContactVerify parseFrom(i43 i43) throws IOException {
            return new ContactVerify().mergeFrom(i43);
        }

        public ContactVerify mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    this.contactId = i43.q();
                } else if (s == 26) {
                    this.localName = i43.r();
                } else if (s == 32) {
                    this.confirm = i43.f();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class DraftDiscard extends ad9 {
        private static volatile DraftDiscard[] _emptyArray;
        public long chatId;
        public long requestId;
        public long serverTime;

        public DraftDiscard() {
            clear();
        }

        public static DraftDiscard[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new DraftDiscard[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static DraftDiscard parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (DraftDiscard) ad9.mergeFrom(new DraftDiscard(), bArr);
        }

        public DraftDiscard clear() {
            this.requestId = 0;
            this.chatId = 0;
            this.serverTime = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            long j3 = this.serverTime;
            return j3 != 0 ? h + j43.h(3, j3) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            long j3 = this.serverTime;
            if (j3 != 0) {
                j43.x(3, j3);
            }
        }

        public static DraftDiscard parseFrom(i43 i43) throws IOException {
            return new DraftDiscard().mergeFrom(i43);
        }

        public DraftDiscard mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    this.chatId = i43.q();
                } else if (s == 24) {
                    this.serverTime = i43.q();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class DraftSave extends ad9 {
        private static volatile DraftSave[] _emptyArray;
        public long chatId;
        public byte[] draft;
        public long requestId;

        public DraftSave() {
            clear();
        }

        public static DraftSave[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new DraftSave[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static DraftSave parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (DraftSave) ad9.mergeFrom(new DraftSave(), bArr);
        }

        public DraftSave clear() {
            this.requestId = 0;
            this.chatId = 0;
            this.draft = ct.h;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            return !Arrays.equals(this.draft, ct.h) ? h + j43.b(3, this.draft) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            if (!Arrays.equals(this.draft, ct.h)) {
                j43.s(3, this.draft);
            }
        }

        public static DraftSave parseFrom(i43 i43) throws IOException {
            return new DraftSave().mergeFrom(i43);
        }

        public DraftSave mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    this.chatId = i43.q();
                } else if (s == 26) {
                    this.draft = i43.g();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class ExternalVideoSend extends ad9 {
        private static volatile ExternalVideoSend[] _emptyArray;
        public String attachLocalId;
        public long chatId;
        public String externalUrl;
        public long messageId;
        public long requestId;
        public String stickerId;

        public ExternalVideoSend() {
            clear();
        }

        public static ExternalVideoSend[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ExternalVideoSend[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ExternalVideoSend parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ExternalVideoSend) ad9.mergeFrom(new ExternalVideoSend(), bArr);
        }

        public ExternalVideoSend clear() {
            this.requestId = 0;
            this.externalUrl = "";
            this.attachLocalId = "";
            this.messageId = 0;
            this.chatId = 0;
            this.stickerId = "";
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            if (!this.externalUrl.equals("")) {
                h += j43.l(2, this.externalUrl);
            }
            if (!this.attachLocalId.equals("")) {
                h += j43.l(3, this.attachLocalId);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                h += j43.h(4, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                h += j43.h(5, j3);
            }
            return !this.stickerId.equals("") ? h + j43.l(6, this.stickerId) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            if (!this.externalUrl.equals("")) {
                j43.E(2, this.externalUrl);
            }
            if (!this.attachLocalId.equals("")) {
                j43.E(3, this.attachLocalId);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                j43.x(4, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                j43.x(5, j3);
            }
            if (!this.stickerId.equals("")) {
                j43.E(6, this.stickerId);
            }
        }

        public static ExternalVideoSend parseFrom(i43 i43) throws IOException {
            return new ExternalVideoSend().mergeFrom(i43);
        }

        public ExternalVideoSend mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 18) {
                    this.externalUrl = i43.r();
                } else if (s == 26) {
                    this.attachLocalId = i43.r();
                } else if (s == 32) {
                    this.messageId = i43.q();
                } else if (s == 40) {
                    this.chatId = i43.q();
                } else if (s == 50) {
                    this.stickerId = i43.r();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class FileDownload extends ad9 {
        private static volatile FileDownload[] _emptyArray;
        public String attachId;
        public long audioId;
        public boolean checkAutoloadConnection;
        public long fileId;
        public String fileName;
        public int invalidateCount;
        public long messageId;
        public long mp4GifId;
        public boolean notCopyVideoToGallery;
        public boolean notifyProgress;
        public long requestId;
        public long stickerId;
        public String url;
        public boolean useOriginalExtension;
        public long videoId;

        public FileDownload() {
            clear();
        }

        public static FileDownload[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new FileDownload[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static FileDownload parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (FileDownload) ad9.mergeFrom(new FileDownload(), bArr);
        }

        public FileDownload clear() {
            this.requestId = 0;
            this.messageId = 0;
            this.videoId = 0;
            this.audioId = 0;
            this.mp4GifId = 0;
            this.url = "";
            this.attachId = "";
            this.notifyProgress = false;
            this.stickerId = 0;
            this.fileId = 0;
            this.fileName = "";
            this.checkAutoloadConnection = false;
            this.invalidateCount = 0;
            this.useOriginalExtension = false;
            this.notCopyVideoToGallery = false;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.messageId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            long j3 = this.videoId;
            if (j3 != 0) {
                h += j43.h(3, j3);
            }
            long j4 = this.audioId;
            if (j4 != 0) {
                h += j43.h(4, j4);
            }
            long j5 = this.mp4GifId;
            if (j5 != 0) {
                h += j43.h(5, j5);
            }
            if (!this.url.equals("")) {
                h += j43.l(6, this.url);
            }
            if (!this.attachId.equals("")) {
                h += j43.l(7, this.attachId);
            }
            if (this.notifyProgress) {
                h += j43.a(8);
            }
            long j6 = this.stickerId;
            if (j6 != 0) {
                h += j43.h(9, j6);
            }
            long j7 = this.fileId;
            if (j7 != 0) {
                h += j43.h(10, j7);
            }
            if (!this.fileName.equals("")) {
                h += j43.l(11, this.fileName);
            }
            if (this.checkAutoloadConnection) {
                h += j43.a(12);
            }
            int i = this.invalidateCount;
            if (i != 0) {
                h += j43.f(13, i);
            }
            if (this.useOriginalExtension) {
                h += j43.a(14);
            }
            return this.notCopyVideoToGallery ? h + j43.a(15) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            long j3 = this.videoId;
            if (j3 != 0) {
                j43.x(3, j3);
            }
            long j4 = this.audioId;
            if (j4 != 0) {
                j43.x(4, j4);
            }
            long j5 = this.mp4GifId;
            if (j5 != 0) {
                j43.x(5, j5);
            }
            if (!this.url.equals("")) {
                j43.E(6, this.url);
            }
            if (!this.attachId.equals("")) {
                j43.E(7, this.attachId);
            }
            boolean z = this.notifyProgress;
            if (z) {
                j43.r(8, z);
            }
            long j6 = this.stickerId;
            if (j6 != 0) {
                j43.x(9, j6);
            }
            long j7 = this.fileId;
            if (j7 != 0) {
                j43.x(10, j7);
            }
            if (!this.fileName.equals("")) {
                j43.E(11, this.fileName);
            }
            boolean z2 = this.checkAutoloadConnection;
            if (z2) {
                j43.r(12, z2);
            }
            int i = this.invalidateCount;
            if (i != 0) {
                j43.w(13, i);
            }
            boolean z3 = this.useOriginalExtension;
            if (z3) {
                j43.r(14, z3);
            }
            boolean z4 = this.notCopyVideoToGallery;
            if (z4) {
                j43.r(15, z4);
            }
        }

        public static FileDownload parseFrom(i43 i43) throws IOException {
            return new FileDownload().mergeFrom(i43);
        }

        public FileDownload mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                switch (s) {
                    case 0:
                        return this;
                    case 8:
                        this.requestId = i43.q();
                        break;
                    case 16:
                        this.messageId = i43.q();
                        break;
                    case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                        this.videoId = i43.q();
                        break;
                    case 32:
                        this.audioId = i43.q();
                        break;
                    case SavedMessagesIconDrawable.SMALL_SIZE:
                        this.mp4GifId = i43.q();
                        break;
                    case 50:
                        this.url = i43.r();
                        break;
                    case 58:
                        this.attachId = i43.r();
                        break;
                    case 64:
                        this.notifyProgress = i43.f();
                        break;
                    case 72:
                        this.stickerId = i43.q();
                        break;
                    case 80:
                        this.fileId = i43.q();
                        break;
                    case 90:
                        this.fileName = i43.r();
                        break;
                    case 96:
                        this.checkAutoloadConnection = i43.f();
                        break;
                    case 104:
                        this.invalidateCount = i43.p();
                        break;
                    case 112:
                        this.useOriginalExtension = i43.f();
                        break;
                    case 120:
                        this.notCopyVideoToGallery = i43.f();
                        break;
                    default:
                        if (i43.u(s)) {
                            break;
                        } else {
                            return this;
                        }
                }
            }
        }
    }

    public static final class FileDownloadCmd extends ad9 {
        private static volatile FileDownloadCmd[] _emptyArray;
        public String attachLocalId;
        public long fileId;
        public String fileName;
        public long messageId;
        public long requestId;

        public FileDownloadCmd() {
            clear();
        }

        public static FileDownloadCmd[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new FileDownloadCmd[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static FileDownloadCmd parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (FileDownloadCmd) ad9.mergeFrom(new FileDownloadCmd(), bArr);
        }

        public FileDownloadCmd clear() {
            this.requestId = 0;
            this.fileId = 0;
            this.fileName = "";
            this.messageId = 0;
            this.attachLocalId = "";
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.fileId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            if (!this.fileName.equals("")) {
                h += j43.l(3, this.fileName);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                h += j43.h(4, j3);
            }
            return !this.attachLocalId.equals("") ? h + j43.l(5, this.attachLocalId) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.fileId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            if (!this.fileName.equals("")) {
                j43.E(3, this.fileName);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                j43.x(4, j3);
            }
            if (!this.attachLocalId.equals("")) {
                j43.E(5, this.attachLocalId);
            }
        }

        public static FileDownloadCmd parseFrom(i43 i43) throws IOException {
            return new FileDownloadCmd().mergeFrom(i43);
        }

        public FileDownloadCmd mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    this.fileId = i43.q();
                } else if (s == 26) {
                    this.fileName = i43.r();
                } else if (s == 32) {
                    this.messageId = i43.q();
                } else if (s == 42) {
                    this.attachLocalId = i43.r();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class FileUpload extends ad9 {
        private static volatile FileUpload[] _emptyArray;
        public String attachLocalId;
        public int attachType;
        public long audioId;
        public long chatId;
        public Rect crop;
        public String file;
        public long fileId;
        public String fileName;
        public long lastUpdatedFile;
        public long lastUpdatedOriginalFile;
        public long messageId;
        public String originalFile;
        public boolean profile;
        public long requestId;
        public String url;
        public long videoId;

        public FileUpload() {
            clear();
        }

        public static FileUpload[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new FileUpload[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static FileUpload parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (FileUpload) ad9.mergeFrom(new FileUpload(), bArr);
        }

        public FileUpload clear() {
            this.requestId = 0;
            this.file = "";
            this.url = "";
            this.messageId = 0;
            this.chatId = 0;
            this.profile = false;
            this.crop = null;
            this.audioId = 0;
            this.videoId = 0;
            this.fileId = 0;
            this.fileName = "";
            this.originalFile = "";
            this.lastUpdatedFile = 0;
            this.lastUpdatedOriginalFile = 0;
            this.attachType = 0;
            this.attachLocalId = "";
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            if (!this.file.equals("")) {
                h += j43.l(2, this.file);
            }
            if (!this.url.equals("")) {
                h += j43.l(3, this.url);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                h += j43.h(4, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                h += j43.h(5, j3);
            }
            if (this.profile) {
                h += j43.a(6);
            }
            Rect rect = this.crop;
            if (rect != null) {
                h += j43.i(7, rect);
            }
            long j4 = this.audioId;
            if (j4 != 0) {
                h += j43.h(8, j4);
            }
            long j5 = this.videoId;
            if (j5 != 0) {
                h += j43.h(9, j5);
            }
            long j6 = this.fileId;
            if (j6 != 0) {
                h += j43.h(10, j6);
            }
            if (!this.fileName.equals("")) {
                h += j43.l(11, this.fileName);
            }
            if (!this.originalFile.equals("")) {
                h += j43.l(12, this.originalFile);
            }
            long j7 = this.lastUpdatedFile;
            if (j7 != 0) {
                h += j43.h(13, j7);
            }
            long j8 = this.lastUpdatedOriginalFile;
            if (j8 != 0) {
                h += j43.h(14, j8);
            }
            int i = this.attachType;
            if (i != 0) {
                h += j43.f(15, i);
            }
            return !this.attachLocalId.equals("") ? h + j43.l(16, this.attachLocalId) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            if (!this.file.equals("")) {
                j43.E(2, this.file);
            }
            if (!this.url.equals("")) {
                j43.E(3, this.url);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                j43.x(4, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                j43.x(5, j3);
            }
            boolean z = this.profile;
            if (z) {
                j43.r(6, z);
            }
            Rect rect = this.crop;
            if (rect != null) {
                j43.y(7, rect);
            }
            long j4 = this.audioId;
            if (j4 != 0) {
                j43.x(8, j4);
            }
            long j5 = this.videoId;
            if (j5 != 0) {
                j43.x(9, j5);
            }
            long j6 = this.fileId;
            if (j6 != 0) {
                j43.x(10, j6);
            }
            if (!this.fileName.equals("")) {
                j43.E(11, this.fileName);
            }
            if (!this.originalFile.equals("")) {
                j43.E(12, this.originalFile);
            }
            long j7 = this.lastUpdatedFile;
            if (j7 != 0) {
                j43.x(13, j7);
            }
            long j8 = this.lastUpdatedOriginalFile;
            if (j8 != 0) {
                j43.x(14, j8);
            }
            int i = this.attachType;
            if (i != 0) {
                j43.w(15, i);
            }
            if (!this.attachLocalId.equals("")) {
                j43.E(16, this.attachLocalId);
            }
        }

        public static FileUpload parseFrom(i43 i43) throws IOException {
            return new FileUpload().mergeFrom(i43);
        }

        public FileUpload mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                switch (s) {
                    case 0:
                        return this;
                    case 8:
                        this.requestId = i43.q();
                        break;
                    case 18:
                        this.file = i43.r();
                        break;
                    case 26:
                        this.url = i43.r();
                        break;
                    case 32:
                        this.messageId = i43.q();
                        break;
                    case SavedMessagesIconDrawable.SMALL_SIZE:
                        this.chatId = i43.q();
                        break;
                    case 48:
                        this.profile = i43.f();
                        break;
                    case 58:
                        if (this.crop == null) {
                            this.crop = new Rect();
                        }
                        i43.j(this.crop);
                        break;
                    case 64:
                        this.audioId = i43.q();
                        break;
                    case 72:
                        this.videoId = i43.q();
                        break;
                    case 80:
                        this.fileId = i43.q();
                        break;
                    case 90:
                        this.fileName = i43.r();
                        break;
                    case 98:
                        this.originalFile = i43.r();
                        break;
                    case 104:
                        this.lastUpdatedFile = i43.q();
                        break;
                    case 112:
                        this.lastUpdatedOriginalFile = i43.q();
                        break;
                    case 120:
                        this.attachType = i43.p();
                        break;
                    case 130:
                        this.attachLocalId = i43.r();
                        break;
                    default:
                        if (i43.u(s)) {
                            break;
                        } else {
                            return this;
                        }
                }
            }
        }
    }

    public static final class FileUploadCmd extends ad9 {
        private static volatile FileUploadCmd[] _emptyArray;
        public String attachLocalId;
        public String file;
        public String fileName;
        public long messageId;
        public long requestId;

        public FileUploadCmd() {
            clear();
        }

        public static FileUploadCmd[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new FileUploadCmd[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static FileUploadCmd parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (FileUploadCmd) ad9.mergeFrom(new FileUploadCmd(), bArr);
        }

        public FileUploadCmd clear() {
            this.requestId = 0;
            this.file = "";
            this.messageId = 0;
            this.fileName = "";
            this.attachLocalId = "";
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            if (!this.file.equals("")) {
                h += j43.l(2, this.file);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                h += j43.h(3, j2);
            }
            if (!this.fileName.equals("")) {
                h += j43.l(4, this.fileName);
            }
            return !this.attachLocalId.equals("") ? h + j43.l(5, this.attachLocalId) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            if (!this.file.equals("")) {
                j43.E(2, this.file);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                j43.x(3, j2);
            }
            if (!this.fileName.equals("")) {
                j43.E(4, this.fileName);
            }
            if (!this.attachLocalId.equals("")) {
                j43.E(5, this.attachLocalId);
            }
        }

        public static FileUploadCmd parseFrom(i43 i43) throws IOException {
            return new FileUploadCmd().mergeFrom(i43);
        }

        public FileUploadCmd mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 18) {
                    this.file = i43.r();
                } else if (s == 24) {
                    this.messageId = i43.q();
                } else if (s == 34) {
                    this.fileName = i43.r();
                } else if (s == 42) {
                    this.attachLocalId = i43.r();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class InvalidateAndDownloadAudio extends ad9 {
        private static volatile InvalidateAndDownloadAudio[] _emptyArray;
        public long chatServerId;
        public FileDownload fileDownload;
        public String outputPath;
        public long requestId;
        public long serverMessageId;

        public InvalidateAndDownloadAudio() {
            clear();
        }

        public static InvalidateAndDownloadAudio[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new InvalidateAndDownloadAudio[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static InvalidateAndDownloadAudio parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (InvalidateAndDownloadAudio) ad9.mergeFrom(new InvalidateAndDownloadAudio(), bArr);
        }

        public InvalidateAndDownloadAudio clear() {
            this.requestId = 0;
            this.outputPath = "";
            this.chatServerId = 0;
            this.serverMessageId = 0;
            this.fileDownload = null;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            if (!this.outputPath.equals("")) {
                h += j43.l(2, this.outputPath);
            }
            long j2 = this.chatServerId;
            if (j2 != 0) {
                h += j43.h(3, j2);
            }
            long j3 = this.serverMessageId;
            if (j3 != 0) {
                h += j43.h(4, j3);
            }
            FileDownload fileDownload2 = this.fileDownload;
            return fileDownload2 != null ? h + j43.i(5, fileDownload2) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            if (!this.outputPath.equals("")) {
                j43.E(2, this.outputPath);
            }
            long j2 = this.chatServerId;
            if (j2 != 0) {
                j43.x(3, j2);
            }
            long j3 = this.serverMessageId;
            if (j3 != 0) {
                j43.x(4, j3);
            }
            FileDownload fileDownload2 = this.fileDownload;
            if (fileDownload2 != null) {
                j43.y(5, fileDownload2);
            }
        }

        public static InvalidateAndDownloadAudio parseFrom(i43 i43) throws IOException {
            return new InvalidateAndDownloadAudio().mergeFrom(i43);
        }

        public InvalidateAndDownloadAudio mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 18) {
                    this.outputPath = i43.r();
                } else if (s == 24) {
                    this.chatServerId = i43.q();
                } else if (s == 32) {
                    this.serverMessageId = i43.q();
                } else if (s == 42) {
                    if (this.fileDownload == null) {
                        this.fileDownload = new FileDownload();
                    }
                    i43.j(this.fileDownload);
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class LocationRequest extends ad9 {
        private static volatile LocationRequest[] _emptyArray;
        public boolean liveLocation;
        public long messageId;
        public long requestId;

        public LocationRequest() {
            clear();
        }

        public static LocationRequest[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new LocationRequest[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static LocationRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (LocationRequest) ad9.mergeFrom(new LocationRequest(), bArr);
        }

        public LocationRequest clear() {
            this.requestId = 0;
            this.messageId = 0;
            this.liveLocation = false;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.messageId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            return this.liveLocation ? h + j43.a(3) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            boolean z = this.liveLocation;
            if (z) {
                j43.r(3, z);
            }
        }

        public static LocationRequest parseFrom(i43 i43) throws IOException {
            return new LocationRequest().mergeFrom(i43);
        }

        public LocationRequest mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    this.messageId = i43.q();
                } else if (s == 24) {
                    this.liveLocation = i43.f();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class LocationStop extends ad9 {
        private static volatile LocationStop[] _emptyArray;
        public long chatId;
        public long messageId;
        public long requestId;

        public LocationStop() {
            clear();
        }

        public static LocationStop[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new LocationStop[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static LocationStop parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (LocationStop) ad9.mergeFrom(new LocationStop(), bArr);
        }

        public LocationStop clear() {
            this.requestId = 0;
            this.chatId = 0;
            this.messageId = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            long j3 = this.messageId;
            return j3 != 0 ? h + j43.h(3, j3) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                j43.x(3, j3);
            }
        }

        public static LocationStop parseFrom(i43 i43) throws IOException {
            return new LocationStop().mergeFrom(i43);
        }

        public LocationStop mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    this.chatId = i43.q();
                } else if (s == 24) {
                    this.messageId = i43.q();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class MsgCancelReaction extends ad9 {
        private static volatile MsgCancelReaction[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public long messageId;
        public long messageServerId;
        public long requestId;

        public MsgCancelReaction() {
            clear();
        }

        public static MsgCancelReaction[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgCancelReaction[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgCancelReaction parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgCancelReaction) ad9.mergeFrom(new MsgCancelReaction(), bArr);
        }

        public MsgCancelReaction clear() {
            this.requestId = 0;
            this.chatId = 0;
            this.messageId = 0;
            this.chatServerId = 0;
            this.messageServerId = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                h += j43.h(3, j3);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                h += j43.h(4, j4);
            }
            long j5 = this.messageServerId;
            return j5 != 0 ? h + j43.h(5, j5) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                j43.x(3, j3);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                j43.x(4, j4);
            }
            long j5 = this.messageServerId;
            if (j5 != 0) {
                j43.x(5, j5);
            }
        }

        public static MsgCancelReaction parseFrom(i43 i43) throws IOException {
            return new MsgCancelReaction().mergeFrom(i43);
        }

        public MsgCancelReaction mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    this.chatId = i43.q();
                } else if (s == 24) {
                    this.messageId = i43.q();
                } else if (s == 32) {
                    this.chatServerId = i43.q();
                } else if (s == 40) {
                    this.messageServerId = i43.q();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class MsgDelete extends ad9 {
        private static volatile MsgDelete[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public String complaint;
        public boolean forMe;
        public int itemTypeId;
        public long[] messagesId;
        public long[] messagesServerId;
        public boolean notDeleteMessageFromDb;
        public long requestId;

        public MsgDelete() {
            clear();
        }

        public static MsgDelete[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgDelete[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgDelete parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgDelete) ad9.mergeFrom(new MsgDelete(), bArr);
        }

        public MsgDelete clear() {
            this.requestId = 0;
            this.chatId = 0;
            this.chatServerId = 0;
            long[] jArr = ct.e;
            this.messagesId = jArr;
            this.messagesServerId = jArr;
            this.complaint = "";
            this.forMe = false;
            this.itemTypeId = 0;
            this.notDeleteMessageFromDb = false;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long[] jArr;
            long[] jArr2;
            long j = this.requestId;
            int i = 0;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                h += j43.h(3, j3);
            }
            long[] jArr3 = this.messagesId;
            if (jArr3 != null && jArr3.length > 0) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    jArr2 = this.messagesId;
                    if (i2 >= jArr2.length) {
                        break;
                    }
                    i3 += j43.k(jArr2[i2]);
                    i2++;
                }
                h = h + i3 + jArr2.length;
            }
            long[] jArr4 = this.messagesServerId;
            if (jArr4 != null && jArr4.length > 0) {
                int i4 = 0;
                while (true) {
                    jArr = this.messagesServerId;
                    if (i >= jArr.length) {
                        break;
                    }
                    i4 += j43.k(jArr[i]);
                    i++;
                }
                h = h + i4 + jArr.length;
            }
            if (!this.complaint.equals("")) {
                h += j43.l(6, this.complaint);
            }
            if (this.forMe) {
                h += j43.a(7);
            }
            int i5 = this.itemTypeId;
            if (i5 != 0) {
                h += j43.f(8, i5);
            }
            return this.notDeleteMessageFromDb ? h + j43.a(9) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                j43.x(3, j3);
            }
            long[] jArr = this.messagesId;
            int i = 0;
            if (jArr != null && jArr.length > 0) {
                int i2 = 0;
                while (true) {
                    long[] jArr2 = this.messagesId;
                    if (i2 >= jArr2.length) {
                        break;
                    }
                    j43.x(4, jArr2[i2]);
                    i2++;
                }
            }
            long[] jArr3 = this.messagesServerId;
            if (jArr3 != null && jArr3.length > 0) {
                while (true) {
                    long[] jArr4 = this.messagesServerId;
                    if (i >= jArr4.length) {
                        break;
                    }
                    j43.x(5, jArr4[i]);
                    i++;
                }
            }
            if (!this.complaint.equals("")) {
                j43.E(6, this.complaint);
            }
            boolean z = this.forMe;
            if (z) {
                j43.r(7, z);
            }
            int i3 = this.itemTypeId;
            if (i3 != 0) {
                j43.w(8, i3);
            }
            boolean z2 = this.notDeleteMessageFromDb;
            if (z2) {
                j43.r(9, z2);
            }
        }

        public static MsgDelete parseFrom(i43 i43) throws IOException {
            return new MsgDelete().mergeFrom(i43);
        }

        public MsgDelete mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                switch (s) {
                    case 0:
                        return this;
                    case 8:
                        this.requestId = i43.q();
                        break;
                    case 16:
                        this.chatId = i43.q();
                        break;
                    case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                        this.chatServerId = i43.q();
                        break;
                    case 32:
                        int q = ct.q(i43, 32);
                        long[] jArr = this.messagesId;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = q + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = i43.q();
                            i43.s();
                            length++;
                        }
                        jArr2[length] = i43.q();
                        this.messagesId = jArr2;
                        break;
                    case 34:
                        int e = i43.e(i43.p());
                        int c = i43.c();
                        int i2 = 0;
                        while (i43.b() > 0) {
                            i43.q();
                            i2++;
                        }
                        i43.t(c);
                        long[] jArr3 = this.messagesId;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = i43.q();
                            length2++;
                        }
                        this.messagesId = jArr4;
                        i43.d(e);
                        break;
                    case SavedMessagesIconDrawable.SMALL_SIZE:
                        int q2 = ct.q(i43, 40);
                        long[] jArr5 = this.messagesServerId;
                        int length3 = jArr5 == null ? 0 : jArr5.length;
                        int i4 = q2 + length3;
                        long[] jArr6 = new long[i4];
                        if (length3 != 0) {
                            System.arraycopy(jArr5, 0, jArr6, 0, length3);
                        }
                        while (length3 < i4 - 1) {
                            jArr6[length3] = i43.q();
                            i43.s();
                            length3++;
                        }
                        jArr6[length3] = i43.q();
                        this.messagesServerId = jArr6;
                        break;
                    case 42:
                        int e2 = i43.e(i43.p());
                        int c2 = i43.c();
                        int i5 = 0;
                        while (i43.b() > 0) {
                            i43.q();
                            i5++;
                        }
                        i43.t(c2);
                        long[] jArr7 = this.messagesServerId;
                        int length4 = jArr7 == null ? 0 : jArr7.length;
                        int i6 = i5 + length4;
                        long[] jArr8 = new long[i6];
                        if (length4 != 0) {
                            System.arraycopy(jArr7, 0, jArr8, 0, length4);
                        }
                        while (length4 < i6) {
                            jArr8[length4] = i43.q();
                            length4++;
                        }
                        this.messagesServerId = jArr8;
                        i43.d(e2);
                        break;
                    case 50:
                        this.complaint = i43.r();
                        break;
                    case 56:
                        this.forMe = i43.f();
                        break;
                    case 64:
                        this.itemTypeId = i43.p();
                        break;
                    case 72:
                        this.notDeleteMessageFromDb = i43.f();
                        break;
                    default:
                        if (i43.u(s)) {
                            break;
                        } else {
                            return this;
                        }
                }
            }
        }
    }

    public static final class MsgDeleteRange extends ad9 {
        private static volatile MsgDeleteRange[] _emptyArray;
        public long chatId;
        public long endTime;
        public int itemTypeId;
        public long requestId;
        public long startTime;

        public MsgDeleteRange() {
            clear();
        }

        public static MsgDeleteRange[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgDeleteRange[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgDeleteRange parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgDeleteRange) ad9.mergeFrom(new MsgDeleteRange(), bArr);
        }

        public MsgDeleteRange clear() {
            this.requestId = 0;
            this.chatId = 0;
            this.startTime = 0;
            this.endTime = 0;
            this.itemTypeId = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            long j3 = this.startTime;
            if (j3 != 0) {
                h += j43.h(3, j3);
            }
            long j4 = this.endTime;
            if (j4 != 0) {
                h += j43.h(4, j4);
            }
            int i = this.itemTypeId;
            return i != 0 ? h + j43.f(5, i) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            long j3 = this.startTime;
            if (j3 != 0) {
                j43.x(3, j3);
            }
            long j4 = this.endTime;
            if (j4 != 0) {
                j43.x(4, j4);
            }
            int i = this.itemTypeId;
            if (i != 0) {
                j43.w(5, i);
            }
        }

        public static MsgDeleteRange parseFrom(i43 i43) throws IOException {
            return new MsgDeleteRange().mergeFrom(i43);
        }

        public MsgDeleteRange mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    this.chatId = i43.q();
                } else if (s == 24) {
                    this.startTime = i43.q();
                } else if (s == 32) {
                    this.endTime = i43.q();
                } else if (s == 40) {
                    this.itemTypeId = i43.p();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class MsgEdit extends ad9 {
        private static volatile MsgEdit[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public boolean editAttaches;
        public long messageId;
        public long messageServerId;
        public Protos.Attaches oldAttaches;
        public Protos.MessageElements oldElements;
        public int oldStatus;
        public String oldText;
        public long requestId;
        public String text;

        public MsgEdit() {
            clear();
        }

        public static MsgEdit[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgEdit[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgEdit parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgEdit) ad9.mergeFrom(new MsgEdit(), bArr);
        }

        public MsgEdit clear() {
            this.requestId = 0;
            this.chatId = 0;
            this.messageId = 0;
            this.chatServerId = 0;
            this.messageServerId = 0;
            this.text = "";
            this.oldText = "";
            this.oldStatus = 0;
            this.oldAttaches = null;
            this.editAttaches = false;
            this.oldElements = null;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                h += j43.h(3, j3);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                h += j43.h(4, j4);
            }
            long j5 = this.messageServerId;
            if (j5 != 0) {
                h += j43.h(5, j5);
            }
            if (!this.text.equals("")) {
                h += j43.l(6, this.text);
            }
            if (!this.oldText.equals("")) {
                h += j43.l(7, this.oldText);
            }
            int i = this.oldStatus;
            if (i != 0) {
                h += j43.f(8, i);
            }
            Protos.Attaches attaches = this.oldAttaches;
            if (attaches != null) {
                h += j43.i(9, attaches);
            }
            if (this.editAttaches) {
                h += j43.a(10);
            }
            Protos.MessageElements messageElements = this.oldElements;
            return messageElements != null ? h + j43.i(11, messageElements) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                j43.x(3, j3);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                j43.x(4, j4);
            }
            long j5 = this.messageServerId;
            if (j5 != 0) {
                j43.x(5, j5);
            }
            if (!this.text.equals("")) {
                j43.E(6, this.text);
            }
            if (!this.oldText.equals("")) {
                j43.E(7, this.oldText);
            }
            int i = this.oldStatus;
            if (i != 0) {
                j43.w(8, i);
            }
            Protos.Attaches attaches = this.oldAttaches;
            if (attaches != null) {
                j43.y(9, attaches);
            }
            boolean z = this.editAttaches;
            if (z) {
                j43.r(10, z);
            }
            Protos.MessageElements messageElements = this.oldElements;
            if (messageElements != null) {
                j43.y(11, messageElements);
            }
        }

        public static MsgEdit parseFrom(i43 i43) throws IOException {
            return new MsgEdit().mergeFrom(i43);
        }

        public MsgEdit mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                switch (s) {
                    case 0:
                        return this;
                    case 8:
                        this.requestId = i43.q();
                        break;
                    case 16:
                        this.chatId = i43.q();
                        break;
                    case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                        this.messageId = i43.q();
                        break;
                    case 32:
                        this.chatServerId = i43.q();
                        break;
                    case SavedMessagesIconDrawable.SMALL_SIZE:
                        this.messageServerId = i43.q();
                        break;
                    case 50:
                        this.text = i43.r();
                        break;
                    case 58:
                        this.oldText = i43.r();
                        break;
                    case 64:
                        this.oldStatus = i43.p();
                        break;
                    case 74:
                        if (this.oldAttaches == null) {
                            this.oldAttaches = new Protos.Attaches();
                        }
                        i43.j(this.oldAttaches);
                        break;
                    case 80:
                        this.editAttaches = i43.f();
                        break;
                    case 90:
                        if (this.oldElements == null) {
                            this.oldElements = new Protos.MessageElements();
                        }
                        i43.j(this.oldElements);
                        break;
                    default:
                        if (i43.u(s)) {
                            break;
                        } else {
                            return this;
                        }
                }
            }
        }
    }

    public static final class MsgReact extends ad9 {
        private static volatile MsgReact[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public long messageId;
        public long messageServerId;
        public String reaction;
        public int reactionType;
        public long requestId;

        public MsgReact() {
            clear();
        }

        public static MsgReact[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgReact[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgReact parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgReact) ad9.mergeFrom(new MsgReact(), bArr);
        }

        public MsgReact clear() {
            this.requestId = 0;
            this.chatId = 0;
            this.messageId = 0;
            this.chatServerId = 0;
            this.messageServerId = 0;
            this.reaction = "";
            this.reactionType = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                h += j43.h(3, j3);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                h += j43.h(4, j4);
            }
            long j5 = this.messageServerId;
            if (j5 != 0) {
                h += j43.h(5, j5);
            }
            if (!this.reaction.equals("")) {
                h += j43.l(6, this.reaction);
            }
            int i = this.reactionType;
            return i != 0 ? h + j43.f(7, i) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                j43.x(3, j3);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                j43.x(4, j4);
            }
            long j5 = this.messageServerId;
            if (j5 != 0) {
                j43.x(5, j5);
            }
            if (!this.reaction.equals("")) {
                j43.E(6, this.reaction);
            }
            int i = this.reactionType;
            if (i != 0) {
                j43.w(7, i);
            }
        }

        public static MsgReact parseFrom(i43 i43) throws IOException {
            return new MsgReact().mergeFrom(i43);
        }

        public MsgReact mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    this.chatId = i43.q();
                } else if (s == 24) {
                    this.messageId = i43.q();
                } else if (s == 32) {
                    this.chatServerId = i43.q();
                } else if (s == 40) {
                    this.messageServerId = i43.q();
                } else if (s == 50) {
                    this.reaction = i43.r();
                } else if (s == 56) {
                    int p = i43.p();
                    if (p == 0 || p == 1) {
                        this.reactionType = p;
                    }
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class MsgSend extends ad9 {
        private static volatile MsgSend[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public long lastKnownDraftTime;
        public long messageId;
        public boolean notify;
        public long requestId;
        public long userId;

        public MsgSend() {
            clear();
        }

        public static MsgSend[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgSend[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgSend parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgSend) ad9.mergeFrom(new MsgSend(), bArr);
        }

        public MsgSend clear() {
            this.requestId = 0;
            this.messageId = 0;
            this.chatId = 0;
            this.chatServerId = 0;
            this.userId = 0;
            this.notify = false;
            this.lastKnownDraftTime = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.messageId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                h += j43.h(3, j3);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                h += j43.h(4, j4);
            }
            long j5 = this.userId;
            if (j5 != 0) {
                h += j43.h(5, j5);
            }
            if (this.notify) {
                h += j43.a(6);
            }
            long j6 = this.lastKnownDraftTime;
            return j6 != 0 ? h + j43.h(8, j6) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                j43.x(3, j3);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                j43.x(4, j4);
            }
            long j5 = this.userId;
            if (j5 != 0) {
                j43.x(5, j5);
            }
            boolean z = this.notify;
            if (z) {
                j43.r(6, z);
            }
            long j6 = this.lastKnownDraftTime;
            if (j6 != 0) {
                j43.x(8, j6);
            }
        }

        public static MsgSend parseFrom(i43 i43) throws IOException {
            return new MsgSend().mergeFrom(i43);
        }

        public MsgSend mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    this.messageId = i43.q();
                } else if (s == 24) {
                    this.chatId = i43.q();
                } else if (s == 32) {
                    this.chatServerId = i43.q();
                } else if (s == 40) {
                    this.userId = i43.q();
                } else if (s == 48) {
                    this.notify = i43.f();
                } else if (s == 64) {
                    this.lastKnownDraftTime = i43.q();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class MsgSendCallback extends ad9 {
        private static volatile MsgSendCallback[] _emptyArray;
        public ButtonPosition buttonPosition;
        public String buttonType;
        public String callbackId;
        public long messageId;
        public String payload;
        public long requestId;
        public long timestamp;

        public static final class ButtonPosition extends ad9 {
            private static volatile ButtonPosition[] _emptyArray;
            public int column;
            public int row;

            public ButtonPosition() {
                clear();
            }

            public static ButtonPosition[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (bj7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ButtonPosition[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static ButtonPosition parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (ButtonPosition) ad9.mergeFrom(new ButtonPosition(), bArr);
            }

            public ButtonPosition clear() {
                this.row = 0;
                this.column = 0;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                int i = this.row;
                int f = i != 0 ? j43.f(1, i) : 0;
                int i2 = this.column;
                return i2 != 0 ? f + j43.f(2, i2) : f;
            }

            public void writeTo(j43 j43) throws IOException {
                int i = this.row;
                if (i != 0) {
                    j43.w(1, i);
                }
                int i2 = this.column;
                if (i2 != 0) {
                    j43.w(2, i2);
                }
            }

            public static ButtonPosition parseFrom(i43 i43) throws IOException {
                return new ButtonPosition().mergeFrom(i43);
            }

            public ButtonPosition mergeFrom(i43 i43) throws IOException {
                while (true) {
                    int s = i43.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 8) {
                        this.row = i43.p();
                    } else if (s == 16) {
                        this.column = i43.p();
                    } else if (!i43.u(s)) {
                        return this;
                    }
                }
            }
        }

        public MsgSendCallback() {
            clear();
        }

        public static MsgSendCallback[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgSendCallback[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgSendCallback parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgSendCallback) ad9.mergeFrom(new MsgSendCallback(), bArr);
        }

        public MsgSendCallback clear() {
            this.requestId = 0;
            this.callbackId = "";
            this.payload = "";
            this.timestamp = 0;
            this.messageId = 0;
            this.buttonPosition = null;
            this.buttonType = "";
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            if (!this.callbackId.equals("")) {
                h += j43.l(2, this.callbackId);
            }
            if (!this.payload.equals("")) {
                h += j43.l(3, this.payload);
            }
            long j2 = this.timestamp;
            if (j2 != 0) {
                h += j43.h(4, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                h += j43.h(5, j3);
            }
            ButtonPosition buttonPosition2 = this.buttonPosition;
            if (buttonPosition2 != null) {
                h += j43.i(6, buttonPosition2);
            }
            return !this.buttonType.equals("") ? h + j43.l(7, this.buttonType) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            if (!this.callbackId.equals("")) {
                j43.E(2, this.callbackId);
            }
            if (!this.payload.equals("")) {
                j43.E(3, this.payload);
            }
            long j2 = this.timestamp;
            if (j2 != 0) {
                j43.x(4, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                j43.x(5, j3);
            }
            ButtonPosition buttonPosition2 = this.buttonPosition;
            if (buttonPosition2 != null) {
                j43.y(6, buttonPosition2);
            }
            if (!this.buttonType.equals("")) {
                j43.E(7, this.buttonType);
            }
        }

        public static MsgSendCallback parseFrom(i43 i43) throws IOException {
            return new MsgSendCallback().mergeFrom(i43);
        }

        public MsgSendCallback mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 18) {
                    this.callbackId = i43.r();
                } else if (s == 26) {
                    this.payload = i43.r();
                } else if (s == 32) {
                    this.timestamp = i43.q();
                } else if (s == 40) {
                    this.messageId = i43.q();
                } else if (s == 50) {
                    if (this.buttonPosition == null) {
                        this.buttonPosition = new ButtonPosition();
                    }
                    i43.j(this.buttonPosition);
                } else if (s == 58) {
                    this.buttonType = i43.r();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class MsgSharePreview extends ad9 {
        private static volatile MsgSharePreview[] _emptyArray;
        public long messageId;
        public long requestId;
        public String text;

        public MsgSharePreview() {
            clear();
        }

        public static MsgSharePreview[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgSharePreview[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgSharePreview parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgSharePreview) ad9.mergeFrom(new MsgSharePreview(), bArr);
        }

        public MsgSharePreview clear() {
            this.requestId = 0;
            this.text = "";
            this.messageId = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            if (!this.text.equals("")) {
                h += j43.l(2, this.text);
            }
            long j2 = this.messageId;
            return j2 != 0 ? h + j43.h(3, j2) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            if (!this.text.equals("")) {
                j43.E(2, this.text);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                j43.x(3, j2);
            }
        }

        public static MsgSharePreview parseFrom(i43 i43) throws IOException {
            return new MsgSharePreview().mergeFrom(i43);
        }

        public MsgSharePreview mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 18) {
                    this.text = i43.r();
                } else if (s == 24) {
                    this.messageId = i43.q();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class MsgView extends ad9 {
        private static volatile MsgView[] _emptyArray;
        public long chatId;
        public long[] messageIds;
        public boolean registerView;
        public long requestId;
        public long time;

        public MsgView() {
            clear();
        }

        public static MsgView[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgView[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgView parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgView) ad9.mergeFrom(new MsgView(), bArr);
        }

        public MsgView clear() {
            this.requestId = 0;
            this.chatId = 0;
            this.messageIds = ct.e;
            this.registerView = false;
            this.time = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long[] jArr;
            long j = this.requestId;
            int i = 0;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            long[] jArr2 = this.messageIds;
            if (jArr2 != null && jArr2.length > 0) {
                int i2 = 0;
                while (true) {
                    jArr = this.messageIds;
                    if (i >= jArr.length) {
                        break;
                    }
                    i2 += j43.k(jArr[i]);
                    i++;
                }
                h = h + i2 + jArr.length;
            }
            if (this.registerView) {
                h += j43.a(4);
            }
            long j3 = this.time;
            return j3 != 0 ? h + j43.h(5, j3) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            long[] jArr = this.messageIds;
            if (jArr != null && jArr.length > 0) {
                int i = 0;
                while (true) {
                    long[] jArr2 = this.messageIds;
                    if (i >= jArr2.length) {
                        break;
                    }
                    j43.x(3, jArr2[i]);
                    i++;
                }
            }
            boolean z = this.registerView;
            if (z) {
                j43.r(4, z);
            }
            long j3 = this.time;
            if (j3 != 0) {
                j43.x(5, j3);
            }
        }

        public static MsgView parseFrom(i43 i43) throws IOException {
            return new MsgView().mergeFrom(i43);
        }

        public MsgView mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    this.chatId = i43.q();
                } else if (s == 24) {
                    int q = ct.q(i43, 24);
                    long[] jArr = this.messageIds;
                    int length = jArr == null ? 0 : jArr.length;
                    int i = q + length;
                    long[] jArr2 = new long[i];
                    if (length != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jArr2[length] = i43.q();
                        i43.s();
                        length++;
                    }
                    jArr2[length] = i43.q();
                    this.messageIds = jArr2;
                } else if (s == 26) {
                    int e = i43.e(i43.p());
                    int c = i43.c();
                    int i2 = 0;
                    while (i43.b() > 0) {
                        i43.q();
                        i2++;
                    }
                    i43.t(c);
                    long[] jArr3 = this.messageIds;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i3 = i2 + length2;
                    long[] jArr4 = new long[i3];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        jArr4[length2] = i43.q();
                        length2++;
                    }
                    this.messageIds = jArr4;
                    i43.d(e);
                } else if (s == 32) {
                    this.registerView = i43.f();
                } else if (s == 40) {
                    this.time = i43.q();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class PhotoUpload extends ad9 {
        private static volatile PhotoUpload[] _emptyArray;
        public String attachLocalId;
        public long chatId;
        public Rect crop;
        public String file;
        public long messageId;
        public boolean profile;
        public long requestId;

        public PhotoUpload() {
            clear();
        }

        public static PhotoUpload[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new PhotoUpload[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static PhotoUpload parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (PhotoUpload) ad9.mergeFrom(new PhotoUpload(), bArr);
        }

        public PhotoUpload clear() {
            this.requestId = 0;
            this.file = "";
            this.profile = false;
            this.messageId = 0;
            this.chatId = 0;
            this.crop = null;
            this.attachLocalId = "";
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            if (!this.file.equals("")) {
                h += j43.l(2, this.file);
            }
            if (this.profile) {
                h += j43.a(3);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                h += j43.h(4, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                h += j43.h(5, j3);
            }
            Rect rect = this.crop;
            if (rect != null) {
                h += j43.i(6, rect);
            }
            return !this.attachLocalId.equals("") ? h + j43.l(7, this.attachLocalId) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            if (!this.file.equals("")) {
                j43.E(2, this.file);
            }
            boolean z = this.profile;
            if (z) {
                j43.r(3, z);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                j43.x(4, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                j43.x(5, j3);
            }
            Rect rect = this.crop;
            if (rect != null) {
                j43.y(6, rect);
            }
            if (!this.attachLocalId.equals("")) {
                j43.E(7, this.attachLocalId);
            }
        }

        public static PhotoUpload parseFrom(i43 i43) throws IOException {
            return new PhotoUpload().mergeFrom(i43);
        }

        public PhotoUpload mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 18) {
                    this.file = i43.r();
                } else if (s == 24) {
                    this.profile = i43.f();
                } else if (s == 32) {
                    this.messageId = i43.q();
                } else if (s == 40) {
                    this.chatId = i43.q();
                } else if (s == 50) {
                    if (this.crop == null) {
                        this.crop = new Rect();
                    }
                    i43.j(this.crop);
                } else if (s == 58) {
                    this.attachLocalId = i43.r();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class PrepareFileUpload extends ad9 {
        private static volatile PrepareFileUpload[] _emptyArray;
        public String attachLocalId;
        public String fileName;
        public long messageId;
        public long requestId;
        public String uri;

        public PrepareFileUpload() {
            clear();
        }

        public static PrepareFileUpload[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new PrepareFileUpload[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static PrepareFileUpload parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (PrepareFileUpload) ad9.mergeFrom(new PrepareFileUpload(), bArr);
        }

        public PrepareFileUpload clear() {
            this.requestId = 0;
            this.uri = "";
            this.messageId = 0;
            this.fileName = "";
            this.attachLocalId = "";
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            if (!this.uri.equals("")) {
                h += j43.l(2, this.uri);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                h += j43.h(3, j2);
            }
            if (!this.fileName.equals("")) {
                h += j43.l(4, this.fileName);
            }
            return !this.attachLocalId.equals("") ? h + j43.l(5, this.attachLocalId) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            if (!this.uri.equals("")) {
                j43.E(2, this.uri);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                j43.x(3, j2);
            }
            if (!this.fileName.equals("")) {
                j43.E(4, this.fileName);
            }
            if (!this.attachLocalId.equals("")) {
                j43.E(5, this.attachLocalId);
            }
        }

        public static PrepareFileUpload parseFrom(i43 i43) throws IOException {
            return new PrepareFileUpload().mergeFrom(i43);
        }

        public PrepareFileUpload mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 18) {
                    this.uri = i43.r();
                } else if (s == 24) {
                    this.messageId = i43.q();
                } else if (s == 34) {
                    this.fileName = i43.r();
                } else if (s == 42) {
                    this.attachLocalId = i43.r();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class Profile extends ad9 {
        private static volatile Profile[] _emptyArray;
        public String avatarType;
        public Rect crop;
        public String description;
        public String firstName;
        public String lastName;
        public String link;
        public long photoId;
        public String photoToken;
        public long requestId;

        public Profile() {
            clear();
        }

        public static Profile[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Profile[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static Profile parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (Profile) ad9.mergeFrom(new Profile(), bArr);
        }

        public Profile clear() {
            this.requestId = 0;
            this.photoToken = "";
            this.crop = null;
            this.description = "";
            this.link = "";
            this.photoId = 0;
            this.firstName = "";
            this.lastName = "";
            this.avatarType = "";
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            if (!this.photoToken.equals("")) {
                h += j43.l(3, this.photoToken);
            }
            Rect rect = this.crop;
            if (rect != null) {
                h += j43.i(4, rect);
            }
            if (!this.description.equals("")) {
                h += j43.l(5, this.description);
            }
            if (!this.link.equals("")) {
                h += j43.l(6, this.link);
            }
            long j2 = this.photoId;
            if (j2 != 0) {
                h += j43.h(7, j2);
            }
            if (!this.firstName.equals("")) {
                h += j43.l(8, this.firstName);
            }
            if (!this.lastName.equals("")) {
                h += j43.l(9, this.lastName);
            }
            return !this.avatarType.equals("") ? h + j43.l(10, this.avatarType) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            if (!this.photoToken.equals("")) {
                j43.E(3, this.photoToken);
            }
            Rect rect = this.crop;
            if (rect != null) {
                j43.y(4, rect);
            }
            if (!this.description.equals("")) {
                j43.E(5, this.description);
            }
            if (!this.link.equals("")) {
                j43.E(6, this.link);
            }
            long j2 = this.photoId;
            if (j2 != 0) {
                j43.x(7, j2);
            }
            if (!this.firstName.equals("")) {
                j43.E(8, this.firstName);
            }
            if (!this.lastName.equals("")) {
                j43.E(9, this.lastName);
            }
            if (!this.avatarType.equals("")) {
                j43.E(10, this.avatarType);
            }
        }

        public static Profile parseFrom(i43 i43) throws IOException {
            return new Profile().mergeFrom(i43);
        }

        public Profile mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 26) {
                    this.photoToken = i43.r();
                } else if (s == 34) {
                    if (this.crop == null) {
                        this.crop = new Rect();
                    }
                    i43.j(this.crop);
                } else if (s == 42) {
                    this.description = i43.r();
                } else if (s == 50) {
                    this.link = i43.r();
                } else if (s == 56) {
                    this.photoId = i43.q();
                } else if (s == 66) {
                    this.firstName = i43.r();
                } else if (s == 74) {
                    this.lastName = i43.r();
                } else if (s == 82) {
                    this.avatarType = i43.r();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class Rect extends ad9 {
        private static volatile Rect[] _emptyArray;
        public float bottom;
        public float left;
        public float right;
        public float top;

        public Rect() {
            clear();
        }

        public static Rect[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Rect[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static Rect parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (Rect) ad9.mergeFrom(new Rect(), bArr);
        }

        public Rect clear() {
            this.left = c44.DEFAULT_ASPECT_RATIO;
            this.top = c44.DEFAULT_ASPECT_RATIO;
            this.right = c44.DEFAULT_ASPECT_RATIO;
            this.bottom = c44.DEFAULT_ASPECT_RATIO;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int e = Float.floatToIntBits(this.left) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO) ? j43.e(1) : 0;
            if (Float.floatToIntBits(this.top) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                e += j43.e(2);
            }
            if (Float.floatToIntBits(this.right) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                e += j43.e(3);
            }
            return Float.floatToIntBits(this.bottom) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO) ? e + j43.e(4) : e;
        }

        public void writeTo(j43 j43) throws IOException {
            if (Float.floatToIntBits(this.left) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                j43.v(this.left, 1);
            }
            if (Float.floatToIntBits(this.top) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                j43.v(this.top, 2);
            }
            if (Float.floatToIntBits(this.right) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                j43.v(this.right, 3);
            }
            if (Float.floatToIntBits(this.bottom) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                j43.v(this.bottom, 4);
            }
        }

        public static Rect parseFrom(i43 i43) throws IOException {
            return new Rect().mergeFrom(i43);
        }

        public Rect mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 13) {
                    this.left = i43.i();
                } else if (s == 21) {
                    this.top = i43.i();
                } else if (s == 29) {
                    this.right = i43.i();
                } else if (s == 37) {
                    this.bottom = i43.i();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class RemoveContactPhoto extends ad9 {
        private static volatile RemoveContactPhoto[] _emptyArray;
        public long photoId;
        public long requestId;

        public RemoveContactPhoto() {
            clear();
        }

        public static RemoveContactPhoto[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new RemoveContactPhoto[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static RemoveContactPhoto parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (RemoveContactPhoto) ad9.mergeFrom(new RemoveContactPhoto(), bArr);
        }

        public RemoveContactPhoto clear() {
            this.requestId = 0;
            this.photoId = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.photoId;
            return j2 != 0 ? h + j43.h(2, j2) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.photoId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
        }

        public static RemoveContactPhoto parseFrom(i43 i43) throws IOException {
            return new RemoveContactPhoto().mergeFrom(i43);
        }

        public RemoveContactPhoto mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    this.photoId = i43.q();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class SuspendBot extends ad9 {
        private static volatile SuspendBot[] _emptyArray;
        public long botId;
        public long chatId;
        public long requestId;
        public boolean suspend;

        public SuspendBot() {
            clear();
        }

        public static SuspendBot[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new SuspendBot[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static SuspendBot parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SuspendBot) ad9.mergeFrom(new SuspendBot(), bArr);
        }

        public SuspendBot clear() {
            this.requestId = 0;
            this.botId = 0;
            this.chatId = 0;
            this.suspend = false;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.botId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                h += j43.h(3, j3);
            }
            return this.suspend ? h + j43.a(4) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.botId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                j43.x(3, j3);
            }
            boolean z = this.suspend;
            if (z) {
                j43.r(4, z);
            }
        }

        public static SuspendBot parseFrom(i43 i43) throws IOException {
            return new SuspendBot().mergeFrom(i43);
        }

        public SuspendBot mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    this.botId = i43.q();
                } else if (s == 24) {
                    this.chatId = i43.q();
                } else if (s == 32) {
                    this.suspend = i43.f();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class SyncChatHistory extends ad9 {
        private static volatile SyncChatHistory[] _emptyArray;
        public long chatId;
        public int count;
        public int itemTypeId;
        public long taskId;

        public SyncChatHistory() {
            clear();
        }

        public static SyncChatHistory[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new SyncChatHistory[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static SyncChatHistory parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SyncChatHistory) ad9.mergeFrom(new SyncChatHistory(), bArr);
        }

        public SyncChatHistory clear() {
            this.taskId = 0;
            this.chatId = 0;
            this.count = 0;
            this.itemTypeId = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.taskId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            int i = this.count;
            if (i != 0) {
                h += j43.f(3, i);
            }
            int i2 = this.itemTypeId;
            return i2 != 0 ? h + j43.f(4, i2) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.taskId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            int i = this.count;
            if (i != 0) {
                j43.w(3, i);
            }
            int i2 = this.itemTypeId;
            if (i2 != 0) {
                j43.w(4, i2);
            }
        }

        public static SyncChatHistory parseFrom(i43 i43) throws IOException {
            return new SyncChatHistory().mergeFrom(i43);
        }

        public SyncChatHistory mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.taskId = i43.q();
                } else if (s == 16) {
                    this.chatId = i43.q();
                } else if (s == 24) {
                    this.count = i43.p();
                } else if (s == 32) {
                    this.itemTypeId = i43.p();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class UpdateFireTimeProtoTask extends ad9 {
        private static volatile UpdateFireTimeProtoTask[] _emptyArray;
        public long chatId;
        public long fireTime;
        public long messageId;
        public boolean notifySender;
        public long requestId;

        public UpdateFireTimeProtoTask() {
            clear();
        }

        public static UpdateFireTimeProtoTask[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new UpdateFireTimeProtoTask[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static UpdateFireTimeProtoTask parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (UpdateFireTimeProtoTask) ad9.mergeFrom(new UpdateFireTimeProtoTask(), bArr);
        }

        public UpdateFireTimeProtoTask clear() {
            this.requestId = 0;
            this.chatId = 0;
            this.messageId = 0;
            this.fireTime = 0;
            this.notifySender = false;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                h += j43.h(3, j3);
            }
            long j4 = this.fireTime;
            if (j4 != 0) {
                h += j43.h(4, j4);
            }
            return this.notifySender ? h + j43.a(5) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                j43.x(3, j3);
            }
            long j4 = this.fireTime;
            if (j4 != 0) {
                j43.x(4, j4);
            }
            boolean z = this.notifySender;
            if (z) {
                j43.r(5, z);
            }
        }

        public static UpdateFireTimeProtoTask parseFrom(i43 i43) throws IOException {
            return new UpdateFireTimeProtoTask().mergeFrom(i43);
        }

        public UpdateFireTimeProtoTask mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    this.chatId = i43.q();
                } else if (s == 24) {
                    this.messageId = i43.q();
                } else if (s == 32) {
                    this.fireTime = i43.q();
                } else if (s == 40) {
                    this.notifySender = i43.f();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class VideoConvert extends ad9 {
        private static volatile VideoConvert[] _emptyArray;
        public String attachLocalId;
        public String dstPath;
        public float endPosition;
        public long messageId;
        public Quality quality;
        public long requestId;
        public String srcPath;
        public float startPosition;

        public static final class Quality extends ad9 {
            private static volatile Quality[] _emptyArray;
            public int bitrate;
            public int height;
            public boolean isOriginal;
            public int ordinal;
            public int width;

            public Quality() {
                clear();
            }

            public static Quality[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (bj7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new Quality[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static Quality parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (Quality) ad9.mergeFrom(new Quality(), bArr);
            }

            public Quality clear() {
                this.ordinal = 0;
                this.width = 0;
                this.height = 0;
                this.isOriginal = false;
                this.bitrate = 0;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                int i = this.ordinal;
                int f = i != 0 ? j43.f(1, i) : 0;
                int i2 = this.width;
                if (i2 != 0) {
                    f += j43.f(2, i2);
                }
                int i3 = this.height;
                if (i3 != 0) {
                    f += j43.f(3, i3);
                }
                if (this.isOriginal) {
                    f += j43.a(4);
                }
                int i4 = this.bitrate;
                return i4 != 0 ? f + j43.f(5, i4) : f;
            }

            public void writeTo(j43 j43) throws IOException {
                int i = this.ordinal;
                if (i != 0) {
                    j43.w(1, i);
                }
                int i2 = this.width;
                if (i2 != 0) {
                    j43.w(2, i2);
                }
                int i3 = this.height;
                if (i3 != 0) {
                    j43.w(3, i3);
                }
                boolean z = this.isOriginal;
                if (z) {
                    j43.r(4, z);
                }
                int i4 = this.bitrate;
                if (i4 != 0) {
                    j43.w(5, i4);
                }
            }

            public static Quality parseFrom(i43 i43) throws IOException {
                return new Quality().mergeFrom(i43);
            }

            public Quality mergeFrom(i43 i43) throws IOException {
                while (true) {
                    int s = i43.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 8) {
                        this.ordinal = i43.p();
                    } else if (s == 16) {
                        this.width = i43.p();
                    } else if (s == 24) {
                        this.height = i43.p();
                    } else if (s == 32) {
                        this.isOriginal = i43.f();
                    } else if (s == 40) {
                        this.bitrate = i43.p();
                    } else if (!i43.u(s)) {
                        return this;
                    }
                }
            }
        }

        public VideoConvert() {
            clear();
        }

        public static VideoConvert[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new VideoConvert[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static VideoConvert parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (VideoConvert) ad9.mergeFrom(new VideoConvert(), bArr);
        }

        public VideoConvert clear() {
            this.requestId = 0;
            this.srcPath = "";
            this.dstPath = "";
            this.quality = null;
            this.messageId = 0;
            this.attachLocalId = "";
            this.startPosition = c44.DEFAULT_ASPECT_RATIO;
            this.endPosition = c44.DEFAULT_ASPECT_RATIO;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            if (!this.srcPath.equals("")) {
                h += j43.l(2, this.srcPath);
            }
            if (!this.dstPath.equals("")) {
                h += j43.l(3, this.dstPath);
            }
            Quality quality2 = this.quality;
            if (quality2 != null) {
                h += j43.i(4, quality2);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                h += j43.h(5, j2);
            }
            if (!this.attachLocalId.equals("")) {
                h += j43.l(6, this.attachLocalId);
            }
            if (Float.floatToIntBits(this.startPosition) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                h += j43.e(7);
            }
            return Float.floatToIntBits(this.endPosition) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO) ? h + j43.e(8) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            if (!this.srcPath.equals("")) {
                j43.E(2, this.srcPath);
            }
            if (!this.dstPath.equals("")) {
                j43.E(3, this.dstPath);
            }
            Quality quality2 = this.quality;
            if (quality2 != null) {
                j43.y(4, quality2);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                j43.x(5, j2);
            }
            if (!this.attachLocalId.equals("")) {
                j43.E(6, this.attachLocalId);
            }
            if (Float.floatToIntBits(this.startPosition) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                j43.v(this.startPosition, 7);
            }
            if (Float.floatToIntBits(this.endPosition) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                j43.v(this.endPosition, 8);
            }
        }

        public static VideoConvert parseFrom(i43 i43) throws IOException {
            return new VideoConvert().mergeFrom(i43);
        }

        public VideoConvert mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 18) {
                    this.srcPath = i43.r();
                } else if (s == 26) {
                    this.dstPath = i43.r();
                } else if (s == 34) {
                    if (this.quality == null) {
                        this.quality = new Quality();
                    }
                    i43.j(this.quality);
                } else if (s == 40) {
                    this.messageId = i43.q();
                } else if (s == 50) {
                    this.attachLocalId = i43.r();
                } else if (s == 61) {
                    this.startPosition = i43.i();
                } else if (s == 69) {
                    this.endPosition = i43.i();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class VideoPlay extends ad9 {
        private static volatile VideoPlay[] _emptyArray;
        public String attachLocalId;
        public long chatServerId;
        public long messageId;
        public long messageServerId;
        public long requestId;
        public boolean startDownload;
        public String token;
        public long videoId;

        public VideoPlay() {
            clear();
        }

        public static VideoPlay[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new VideoPlay[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static VideoPlay parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (VideoPlay) ad9.mergeFrom(new VideoPlay(), bArr);
        }

        public VideoPlay clear() {
            this.requestId = 0;
            this.videoId = 0;
            this.messageId = 0;
            this.attachLocalId = "";
            this.startDownload = false;
            this.chatServerId = 0;
            this.messageServerId = 0;
            this.token = "";
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            long j2 = this.videoId;
            if (j2 != 0) {
                h += j43.h(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                h += j43.h(3, j3);
            }
            if (!this.attachLocalId.equals("")) {
                h += j43.l(4, this.attachLocalId);
            }
            if (this.startDownload) {
                h += j43.a(5);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                h += j43.h(6, j4);
            }
            long j5 = this.messageServerId;
            if (j5 != 0) {
                h += j43.h(7, j5);
            }
            return !this.token.equals("") ? h + j43.l(8, this.token) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            long j2 = this.videoId;
            if (j2 != 0) {
                j43.x(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                j43.x(3, j3);
            }
            if (!this.attachLocalId.equals("")) {
                j43.E(4, this.attachLocalId);
            }
            boolean z = this.startDownload;
            if (z) {
                j43.r(5, z);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                j43.x(6, j4);
            }
            long j5 = this.messageServerId;
            if (j5 != 0) {
                j43.x(7, j5);
            }
            if (!this.token.equals("")) {
                j43.E(8, this.token);
            }
        }

        public static VideoPlay parseFrom(i43 i43) throws IOException {
            return new VideoPlay().mergeFrom(i43);
        }

        public VideoPlay mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 16) {
                    this.videoId = i43.q();
                } else if (s == 24) {
                    this.messageId = i43.q();
                } else if (s == 34) {
                    this.attachLocalId = i43.r();
                } else if (s == 40) {
                    this.startDownload = i43.f();
                } else if (s == 48) {
                    this.chatServerId = i43.q();
                } else if (s == 56) {
                    this.messageServerId = i43.q();
                } else if (s == 66) {
                    this.token = i43.r();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class VideoUpload extends ad9 {
        private static volatile VideoUpload[] _emptyArray;
        public String attachLocalId;
        public boolean audio;
        public String file;
        public long messageId;
        public long requestId;

        public VideoUpload() {
            clear();
        }

        public static VideoUpload[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new VideoUpload[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static VideoUpload parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (VideoUpload) ad9.mergeFrom(new VideoUpload(), bArr);
        }

        public VideoUpload clear() {
            this.requestId = 0;
            this.file = "";
            this.audio = false;
            this.messageId = 0;
            this.attachLocalId = "";
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.requestId;
            int h = j != 0 ? j43.h(1, j) : 0;
            if (!this.file.equals("")) {
                h += j43.l(2, this.file);
            }
            if (this.audio) {
                h += j43.a(3);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                h += j43.h(4, j2);
            }
            return !this.attachLocalId.equals("") ? h + j43.l(5, this.attachLocalId) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                j43.x(1, j);
            }
            if (!this.file.equals("")) {
                j43.E(2, this.file);
            }
            boolean z = this.audio;
            if (z) {
                j43.r(3, z);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                j43.x(4, j2);
            }
            if (!this.attachLocalId.equals("")) {
                j43.E(5, this.attachLocalId);
            }
        }

        public static VideoUpload parseFrom(i43 i43) throws IOException {
            return new VideoUpload().mergeFrom(i43);
        }

        public VideoUpload mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.requestId = i43.q();
                } else if (s == 18) {
                    this.file = i43.r();
                } else if (s == 24) {
                    this.audio = i43.f();
                } else if (s == 32) {
                    this.messageId = i43.q();
                } else if (s == 42) {
                    this.attachLocalId = i43.r();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }
}
