/*
 * This software is produced by EDB Business Partner AS. Unauthorized  redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EDB Business Partner AS is strictly prohibited.
 * Copyright (c) <year> EDB Business Partner AS. ALL RIGHTS RESERVED.
 */
package com.edb.fs.pbd.srv.ws.service.firstservice;

import com.edb.fs.pbd.srv.ws.firstservice.v1_0.FirstServiceRequest;
import com.edb.fs.pbd.srv.ws.firstservice.v1_0.FirstServiceResponse;
import com.edb.fs.pbd.srv.ws.infra.jaxrs.AbstractJaxRsService;
import com.edb.fs.pbd.srv.ws.infra.jaxrs.PbdRsService;

@PbdRsService
public class FirstServiceV10RsImpl extends AbstractJaxRsService implements FirstServiceV10Rs {
	public FirstServiceV10RsImpl() {

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FirstServiceResponse firstServiceList(
			FirstServiceRequest firstServiceRequest) {
		return null;
	}
}
