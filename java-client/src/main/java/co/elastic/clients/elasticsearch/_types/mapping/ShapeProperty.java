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

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.ShapeProperty
@JsonpDeserializable
public final class ShapeProperty extends DocValuesPropertyBase implements PropertyVariant {
	@Nullable
	private final Boolean coerce;

	@Nullable
	private final Boolean ignoreMalformed;

	@Nullable
	private final Boolean ignoreZValue;

	@Nullable
	private final ShapeOrientation orientation;

	// ---------------------------------------------------------------------------------------------

	public ShapeProperty(Builder builder) {
		super(builder);

		this.coerce = builder.coerce;
		this.ignoreMalformed = builder.ignoreMalformed;
		this.ignoreZValue = builder.ignoreZValue;
		this.orientation = builder.orientation;

	}

	public ShapeProperty(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Property} variant type
	 */
	@Override
	public String _variantType() {
		return "shape";
	}

	/**
	 * API name: {@code coerce}
	 */
	@Nullable
	public Boolean coerce() {
		return this.coerce;
	}

	/**
	 * API name: {@code ignore_malformed}
	 */
	@Nullable
	public Boolean ignoreMalformed() {
		return this.ignoreMalformed;
	}

	/**
	 * API name: {@code ignore_z_value}
	 */
	@Nullable
	public Boolean ignoreZValue() {
		return this.ignoreZValue;
	}

	/**
	 * API name: {@code orientation}
	 */
	@Nullable
	public ShapeOrientation orientation() {
		return this.orientation;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "shape");
		super.serializeInternal(generator, mapper);
		if (this.coerce != null) {

			generator.writeKey("coerce");
			generator.write(this.coerce);

		}
		if (this.ignoreMalformed != null) {

			generator.writeKey("ignore_malformed");
			generator.write(this.ignoreMalformed);

		}
		if (this.ignoreZValue != null) {

			generator.writeKey("ignore_z_value");
			generator.write(this.ignoreZValue);

		}
		if (this.orientation != null) {

			generator.writeKey("orientation");
			this.orientation.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShapeProperty}.
	 */
	public static class Builder extends DocValuesPropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ShapeProperty> {
		@Nullable
		private Boolean coerce;

		@Nullable
		private Boolean ignoreMalformed;

		@Nullable
		private Boolean ignoreZValue;

		@Nullable
		private ShapeOrientation orientation;

		/**
		 * API name: {@code coerce}
		 */
		public Builder coerce(@Nullable Boolean value) {
			this.coerce = value;
			return this;
		}

		/**
		 * API name: {@code ignore_malformed}
		 */
		public Builder ignoreMalformed(@Nullable Boolean value) {
			this.ignoreMalformed = value;
			return this;
		}

		/**
		 * API name: {@code ignore_z_value}
		 */
		public Builder ignoreZValue(@Nullable Boolean value) {
			this.ignoreZValue = value;
			return this;
		}

		/**
		 * API name: {@code orientation}
		 */
		public Builder orientation(@Nullable ShapeOrientation value) {
			this.orientation = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ShapeProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShapeProperty build() {

			return new ShapeProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShapeProperty}
	 */
	public static final JsonpDeserializer<ShapeProperty> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ShapeProperty::setupShapePropertyDeserializer, Builder::build);

	protected static void setupShapePropertyDeserializer(DelegatingDeserializer<ShapeProperty.Builder> op) {
		DocValuesPropertyBase.setupDocValuesPropertyBaseDeserializer(op);
		op.add(Builder::coerce, JsonpDeserializer.booleanDeserializer(), "coerce");
		op.add(Builder::ignoreMalformed, JsonpDeserializer.booleanDeserializer(), "ignore_malformed");
		op.add(Builder::ignoreZValue, JsonpDeserializer.booleanDeserializer(), "ignore_z_value");
		op.add(Builder::orientation, ShapeOrientation._DESERIALIZER, "orientation");

		op.ignore("type");
	}

}