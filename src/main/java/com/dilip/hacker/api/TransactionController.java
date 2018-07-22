package com.dilip.hacker.api;

import org.jboss.logging.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.dilip.hacker.beans.ResponseStatus;
import com.dilip.hacker.beans.TransactionBean;

@RestController
public class TransactionController {

	private static final Logger logger = Logger.getLogger(TransactionController.class);

	@PostMapping(value = "/transaction")
	public ResponseStatus insertTransactionStatus(@RequestBody TransactionBean transactionBean) {
		logger.info("Request Recive");
		return null;

	}

}
