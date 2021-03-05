/*
 * This software is produced by EDB Business Partner AS. Unauthorized  redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EDB Business Partner AS is strictly prohibited.
 * Copyright (c) <year> EDB Business Partner AS. ALL RIGHTS RESERVED.
 */
package com.edb.fs.pbd.srv.ws.service.secondservice;

import com.edb.fs.pbd.srv.ws.infra.jaxrs.PbdRestConstants;
import com.edb.fs.pbd.srv.ws.secondservice.v1_0.SecondServiceRequest;
import com.edb.fs.pbd.srv.ws.secondservice.v1_0.SecondServiceResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(value = "secondservice")
@Consumes({ MediaType.APPLICATION_JSON + PbdRestConstants.CHARSET_UTF8 })
@Produces({ MediaType.APPLICATION_JSON + PbdRestConstants.CHARSET_UTF8 })
@Api(value = "secondservice")
public interface SecondServiceV10Rs {

	@Valid
	@POST
	@Path(value = "/secondservicelist")
	@ApiOperation("secondServiceList")
	@ApiResponses({
			@ApiResponse(code = HttpServletResponse.SC_BAD_REQUEST, message = PbdRestConstants.BAD_REQUEST_MESSAGE) })
	SecondServiceResponse secondServiceList(
			@NotNull @Valid SecondServiceRequest secondServiceRequest);
}
