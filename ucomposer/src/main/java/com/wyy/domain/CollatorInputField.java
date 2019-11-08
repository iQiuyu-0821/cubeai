/*-
 * ===============LICENSE_START=======================================================
 * Acumos
 * ===================================================================================
 * Copyright (C) 2017 AT&T Intellectual Property & Tech Mahindra. All rights reserved.
 * ===================================================================================
 * This Acumos software file is distributed by AT&T and Tech Mahindra
 * under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * This file is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ===============LICENSE_END=========================================================
 */

package com.wyy.domain;

import java.io.Serializable;

public class CollatorInputField implements Serializable {

	public CollatorInputField() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CollatorInputField [source_name=" + source_name + ", message_signature=" + message_signature
				+ ", parameter_name=" + parameter_name + ", parameter_type=" + parameter_type + ", parameter_tag="
				+ parameter_tag + ", mapped_to_field=" + mapped_to_field + ", error_indicator=" + error_indicator + "]";
	}

	private static final long serialVersionUID = 718850551686460066L;

	private String source_name;
	private String message_signature;
	private String parameter_name;
	private String parameter_type;
	private String parameter_tag;
	private String mapped_to_field;
	private String error_indicator;

	public String getSource_name() {
		return source_name;
	}

	public void setSource_name(String source_name) {
		this.source_name = source_name;
	}

	/**
	 * @return the message_signature
	 */
	public String getMessage_signature() {
		return message_signature;
	}

	/**
	 * @param message_signature the message_signature to set
	 */
	public void setMessage_signature(String message_signature) {
		this.message_signature = message_signature;
	}

	public String getParameter_name() {
		return parameter_name;
	}

	public void setParameter_name(String parameter_name) {
		this.parameter_name = parameter_name;
	}

	public String getParameter_type() {
		return parameter_type;
	}

	public void setParameter_type(String parameter_type) {
		this.parameter_type = parameter_type;
	}

	public String getParameter_tag() {
		return parameter_tag;
	}

	public void setParameter_tag(String parameter_tag) {
		this.parameter_tag = parameter_tag;
	}

	public String getMapped_to_field() {
		return mapped_to_field;
	}

	public void setMapped_to_field(String mapped_to_field) {
		this.mapped_to_field = mapped_to_field;
	}

	public String getError_indicator() {
		return error_indicator;
	}

	public void setError_indicator(String error_indicator) {
		this.error_indicator = error_indicator;
	}

}
