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

package org.opensearch.clients.elasticsearch.nodes;

import org.opensearch.clients.ApiClient;
import org.opensearch.clients.elasticsearch._types.ElasticsearchException;
import org.opensearch.clients.elasticsearch._types.ErrorResponse;
import org.opensearch.clients.transport.ElasticsearchTransport;
import org.opensearch.clients.transport.JsonEndpoint;
import org.opensearch.clients.transport.TransportOptions;
import org.opensearch.clients.util.ObjectBuilder;

import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the nodes namespace.
 */
public class ElasticsearchNodesClient extends ApiClient<ElasticsearchTransport, ElasticsearchNodesClient> {

	public ElasticsearchNodesClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchNodesClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchNodesClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchNodesClient(this.transport, transportOptions);
	}

	// ----- Endpoint: nodes.hot_threads

	/**
	 * Returns information about hot threads on each node in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-hot-threads.html">Documentation
	 *      on elastic.co</a>
	 */

	public HotThreadsResponse hotThreads(HotThreadsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<HotThreadsRequest, HotThreadsResponse, ErrorResponse> endpoint =
				(JsonEndpoint<HotThreadsRequest, HotThreadsResponse, ErrorResponse>) HotThreadsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about hot threads on each node in the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link HotThreadsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-hot-threads.html">Documentation
	 *      on elastic.co</a>
	 */

	public final HotThreadsResponse hotThreads(Function<HotThreadsRequest.Builder, ObjectBuilder<HotThreadsRequest>> fn)
			throws IOException, ElasticsearchException {
		return hotThreads(fn.apply(new HotThreadsRequest.Builder()).build());
	}

	/**
	 * Returns information about hot threads on each node in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-hot-threads.html">Documentation
	 *      on elastic.co</a>
	 */

	public HotThreadsResponse hotThreads() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new HotThreadsRequest.Builder().build(), HotThreadsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: nodes.info

	/**
	 * Returns information about nodes in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-info.html">Documentation
	 *      on elastic.co</a>
	 */

	public NodesInfoResponse info(NodesInfoRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<NodesInfoRequest, NodesInfoResponse, ErrorResponse> endpoint =
				(JsonEndpoint<NodesInfoRequest, NodesInfoResponse, ErrorResponse>) NodesInfoRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about nodes in the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link NodesInfoRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-info.html">Documentation
	 *      on elastic.co</a>
	 */

	public final NodesInfoResponse info(Function<NodesInfoRequest.Builder, ObjectBuilder<NodesInfoRequest>> fn)
			throws IOException, ElasticsearchException {
		return info(fn.apply(new NodesInfoRequest.Builder()).build());
	}

	/**
	 * Returns information about nodes in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-info.html">Documentation
	 *      on elastic.co</a>
	 */

	public NodesInfoResponse info() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new NodesInfoRequest.Builder().build(), NodesInfoRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: nodes.reload_secure_settings

	/**
	 * Reloads secure settings.
	 */

	public ReloadSecureSettingsResponse reloadSecureSettings(ReloadSecureSettingsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ReloadSecureSettingsRequest, ReloadSecureSettingsResponse, ErrorResponse> endpoint =
				(JsonEndpoint<ReloadSecureSettingsRequest, ReloadSecureSettingsResponse, ErrorResponse>)
						ReloadSecureSettingsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Reloads secure settings.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ReloadSecureSettingsRequest}
	 */

	public final ReloadSecureSettingsResponse reloadSecureSettings(
			Function<ReloadSecureSettingsRequest.Builder, ObjectBuilder<ReloadSecureSettingsRequest>> fn)
			throws IOException, ElasticsearchException {
		return reloadSecureSettings(fn.apply(new ReloadSecureSettingsRequest.Builder()).build());
	}

	/**
	 * Reloads secure settings.
	 */

	public ReloadSecureSettingsResponse reloadSecureSettings() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ReloadSecureSettingsRequest.Builder().build(),
				ReloadSecureSettingsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: nodes.stats

	/**
	 * Returns statistical information about nodes in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public NodesStatsResponse stats(NodesStatsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<NodesStatsRequest, NodesStatsResponse, ErrorResponse> endpoint =
				(JsonEndpoint<NodesStatsRequest, NodesStatsResponse, ErrorResponse>) NodesStatsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns statistical information about nodes in the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link NodesStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public final NodesStatsResponse stats(Function<NodesStatsRequest.Builder, ObjectBuilder<NodesStatsRequest>> fn)
			throws IOException, ElasticsearchException {
		return stats(fn.apply(new NodesStatsRequest.Builder()).build());
	}

	/**
	 * Returns statistical information about nodes in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public NodesStatsResponse stats() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new NodesStatsRequest.Builder().build(), NodesStatsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: nodes.usage

	/**
	 * Returns low-level information about REST actions usage on nodes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-usage.html">Documentation
	 *      on elastic.co</a>
	 */

	public NodesUsageResponse usage(NodesUsageRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<NodesUsageRequest, NodesUsageResponse, ErrorResponse> endpoint =
				(JsonEndpoint<NodesUsageRequest, NodesUsageResponse, ErrorResponse>) NodesUsageRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns low-level information about REST actions usage on nodes.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link NodesUsageRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-usage.html">Documentation
	 *      on elastic.co</a>
	 */

	public final NodesUsageResponse usage(Function<NodesUsageRequest.Builder, ObjectBuilder<NodesUsageRequest>> fn)
			throws IOException, ElasticsearchException {
		return usage(fn.apply(new NodesUsageRequest.Builder()).build());
	}

	/**
	 * Returns low-level information about REST actions usage on nodes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cluster-nodes-usage.html">Documentation
	 *      on elastic.co</a>
	 */

	public NodesUsageResponse usage() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new NodesUsageRequest.Builder().build(), NodesUsageRequest._ENDPOINT,
				this.transportOptions);
	}

}