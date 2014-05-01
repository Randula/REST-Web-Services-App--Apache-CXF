package com.expr.server.controller.impl;

import com.expr.server.controller.RequestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.Response;
import java.util.Map;


public class RequestControllerImpl implements RequestController {

    private static final Logger logger = LoggerFactory.getLogger(RequestControllerImpl.class);

    @Override
    public Response getValue(Map<String, Object> request) {
        logger.debug("Received Request [{}]", request);
        request.put("Status", "Success");
        return Response.status(Response.Status.ACCEPTED).entity(request).build();
    }
}
