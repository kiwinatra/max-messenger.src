package org.msgpack.core;

import java.nio.charset.CharacterCodingException;

public class MessageStringCodingException extends MessagePackException {
    public final Throwable getCause() {
        return (CharacterCodingException) super.getCause();
    }
}
