package com.poccupine.hometest.handler;



import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

import java.net.URI;
import java.util.Collections;

public class BadRequestException extends AbstractThrowableProblem {

    public BadRequestException(String message) {
        super(URI.create("/bad-request"), message, Status.BAD_REQUEST, null, null, null, Collections.singletonMap(message, message));
    }
}
