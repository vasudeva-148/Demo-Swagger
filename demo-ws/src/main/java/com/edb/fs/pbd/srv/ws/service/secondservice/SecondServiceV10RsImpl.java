/*
 * This software is produced by EDB Business Partner AS. Unauthorized  redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EDB Business Partner AS is strictly prohibited.
 * Copyright (c) <year> EDB Business Partner AS. ALL RIGHTS RESERVED.
 */
package com.edb.fs.pbd.srv.ws.service.secondservice;

import com.edb.fs.pbd.srv.ws.infra.jaxrs.AbstractJaxRsService;
import com.edb.fs.pbd.srv.ws.infra.jaxrs.PbdRsService;
import com.edb.fs.pbd.srv.ws.secondservice.v1_0.SecondServiceRequest;
import com.edb.fs.pbd.srv.ws.secondservice.v1_0.SecondServiceResponse;

@PbdRsService
public class SecondServiceV10RsImpl extends AbstractJaxRsService implements SecondServiceV10Rs {
	public SecondServiceV10RsImpl() {

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SecondServiceResponse secondServiceList(
			SecondServiceRequest secondServiceRequest) {
		return null;
	}
}
