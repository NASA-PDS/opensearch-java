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

package org.opensearch.clients.elasticsearch._types.aggregations;

import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;

import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.NormalizeAggregation

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/aggregations/pipeline.ts#L189-L191">API
 *      specification</a>
 */
@JsonpDeserializable
public class NormalizeAggregation extends PipelineAggregationBase implements AggregationVariant {
	@Nullable
	private final NormalizeMethod method;

	// ---------------------------------------------------------------------------------------------

	private NormalizeAggregation(Builder builder) {
		super(builder);

		this.method = builder.method;

	}

	public static NormalizeAggregation of(Function<Builder, ObjectBuilder<NormalizeAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.Normalize;
	}

	/**
	 * API name: {@code method}
	 */
	@Nullable
	public final NormalizeMethod method() {
		return this.method;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.method != null) {
			generator.writeKey("method");
			this.method.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NormalizeAggregation}.
	 */

	public static class Builder extends PipelineAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<NormalizeAggregation> {
		@Nullable
		private NormalizeMethod method;

		/**
		 * API name: {@code method}
		 */
		public final Builder method(@Nullable NormalizeMethod value) {
			this.method = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NormalizeAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NormalizeAggregation build() {
			_checkSingleUse();

			return new NormalizeAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NormalizeAggregation}
	 */
	public static final JsonpDeserializer<NormalizeAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NormalizeAggregation::setupNormalizeAggregationDeserializer);

	protected static void setupNormalizeAggregationDeserializer(ObjectDeserializer<NormalizeAggregation.Builder> op) {
		PipelineAggregationBase.setupPipelineAggregationBaseDeserializer(op);
		op.add(Builder::method, NormalizeMethod._DESERIALIZER, "method");

	}

}