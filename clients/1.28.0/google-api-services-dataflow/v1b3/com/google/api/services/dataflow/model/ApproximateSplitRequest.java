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

package com.google.api.services.dataflow.model;

/**
 * A suggestion by the service to the worker to dynamically split the WorkItem.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ApproximateSplitRequest extends com.google.api.client.json.GenericJson {

  /**
   * A fraction at which to split the work item, from 0.0 (beginning of the input) to 1.0 (end of
   * the input).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double fractionConsumed;

  /**
   * The fraction of the remainder of work to split the work item at, from 0.0 (split at the current
   * position) to 1.0 (end of the input).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double fractionOfRemainder;

  /**
   * A Position at which to split the work item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Position position;

  /**
   * A fraction at which to split the work item, from 0.0 (beginning of the input) to 1.0 (end of
   * the input).
   * @return value or {@code null} for none
   */
  public java.lang.Double getFractionConsumed() {
    return fractionConsumed;
  }

  /**
   * A fraction at which to split the work item, from 0.0 (beginning of the input) to 1.0 (end of
   * the input).
   * @param fractionConsumed fractionConsumed or {@code null} for none
   */
  public ApproximateSplitRequest setFractionConsumed(java.lang.Double fractionConsumed) {
    this.fractionConsumed = fractionConsumed;
    return this;
  }

  /**
   * The fraction of the remainder of work to split the work item at, from 0.0 (split at the current
   * position) to 1.0 (end of the input).
   * @return value or {@code null} for none
   */
  public java.lang.Double getFractionOfRemainder() {
    return fractionOfRemainder;
  }

  /**
   * The fraction of the remainder of work to split the work item at, from 0.0 (split at the current
   * position) to 1.0 (end of the input).
   * @param fractionOfRemainder fractionOfRemainder or {@code null} for none
   */
  public ApproximateSplitRequest setFractionOfRemainder(java.lang.Double fractionOfRemainder) {
    this.fractionOfRemainder = fractionOfRemainder;
    return this;
  }

  /**
   * A Position at which to split the work item.
   * @return value or {@code null} for none
   */
  public Position getPosition() {
    return position;
  }

  /**
   * A Position at which to split the work item.
   * @param position position or {@code null} for none
   */
  public ApproximateSplitRequest setPosition(Position position) {
    this.position = position;
    return this;
  }

  @Override
  public ApproximateSplitRequest set(String fieldName, Object value) {
    return (ApproximateSplitRequest) super.set(fieldName, value);
  }

  @Override
  public ApproximateSplitRequest clone() {
    return (ApproximateSplitRequest) super.clone();
  }

}
