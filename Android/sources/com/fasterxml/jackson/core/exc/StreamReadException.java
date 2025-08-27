package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.JsonProcessingException;

public abstract class StreamReadException extends JsonProcessingException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StreamReadException(pp7 pp7, String str) {
        super(str, pp7 == null ? null : pp7.o(), (NumberFormatException) null);
    }
}
