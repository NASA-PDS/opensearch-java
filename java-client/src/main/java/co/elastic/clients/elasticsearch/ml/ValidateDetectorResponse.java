/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.elasticsearch._types.AcknowledgedResponseBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;

// typedef: ml.validate_detector.Response
public final class ValidateDetectorResponse extends AcknowledgedResponseBase {
	// ---------------------------------------------------------------------------------------------

	protected ValidateDetectorResponse(Builder builder) {
		super(builder);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ValidateDetectorResponse}.
	 */
	public static class Builder extends AcknowledgedResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ValidateDetectorResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ValidateDetectorResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ValidateDetectorResponse build() {

			return new ValidateDetectorResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ValidateDetectorResponse
	 */
	public static final JsonpDeserializer<ValidateDetectorResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ValidateDetectorResponse::setupValidateDetectorResponseDeserializer);

	protected static void setupValidateDetectorResponseDeserializer(
			DelegatingDeserializer<ValidateDetectorResponse.Builder> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);

	}

}