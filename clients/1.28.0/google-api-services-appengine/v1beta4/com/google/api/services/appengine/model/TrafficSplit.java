/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.appengine.model;

/**
 * Traffic routing configuration for versions within a single module. Traffic splits define how
 * traffic directed to the module is assigned to versions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TrafficSplit extends com.google.api.client.json.GenericJson {

  /**
   * Mapping from version IDs within the module to fractional (0.000, 1] allocations of traffic for
   * that version. Each version can be specified only once, but some versions in the module may not
   * have any traffic allocation. Modules that have traffic allocated cannot be deleted until either
   * the module is deleted or their traffic allocation is removed. Allocations must sum to 1. Up to
   * two decimal place precision is supported for IP-based splits and up to three decimal places is
   * supported for cookie-based splits.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Double> allocations;

  /**
   * Mechanism used to determine which version a request is sent to. The traffic selection algorithm
   * will be stable for either type until allocations are changed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String shardBy;

  /**
   * Mapping from version IDs within the module to fractional (0.000, 1] allocations of traffic for
   * that version. Each version can be specified only once, but some versions in the module may not
   * have any traffic allocation. Modules that have traffic allocated cannot be deleted until either
   * the module is deleted or their traffic allocation is removed. Allocations must sum to 1. Up to
   * two decimal place precision is supported for IP-based splits and up to three decimal places is
   * supported for cookie-based splits.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Double> getAllocations() {
    return allocations;
  }

  /**
   * Mapping from version IDs within the module to fractional (0.000, 1] allocations of traffic for
   * that version. Each version can be specified only once, but some versions in the module may not
   * have any traffic allocation. Modules that have traffic allocated cannot be deleted until either
   * the module is deleted or their traffic allocation is removed. Allocations must sum to 1. Up to
   * two decimal place precision is supported for IP-based splits and up to three decimal places is
   * supported for cookie-based splits.
   * @param allocations allocations or {@code null} for none
   */
  public TrafficSplit setAllocations(java.util.Map<String, java.lang.Double> allocations) {
    this.allocations = allocations;
    return this;
  }

  /**
   * Mechanism used to determine which version a request is sent to. The traffic selection algorithm
   * will be stable for either type until allocations are changed.
   * @return value or {@code null} for none
   */
  public java.lang.String getShardBy() {
    return shardBy;
  }

  /**
   * Mechanism used to determine which version a request is sent to. The traffic selection algorithm
   * will be stable for either type until allocations are changed.
   * @param shardBy shardBy or {@code null} for none
   */
  public TrafficSplit setShardBy(java.lang.String shardBy) {
    this.shardBy = shardBy;
    return this;
  }

  @Override
  public TrafficSplit set(String fieldName, Object value) {
    return (TrafficSplit) super.set(fieldName, value);
  }

  @Override
  public TrafficSplit clone() {
    return (TrafficSplit) super.clone();
  }

}
