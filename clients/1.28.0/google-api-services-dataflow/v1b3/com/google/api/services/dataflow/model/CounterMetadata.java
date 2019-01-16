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
 * CounterMetadata includes all static non-name non-value counter attributes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CounterMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Human-readable description of the counter semantics.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Counter aggregation kind.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A string referring to the unit type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String otherUnits;

  /**
   * System defined Units, see above enum.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String standardUnits;

  /**
   * Human-readable description of the counter semantics.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Human-readable description of the counter semantics.
   * @param description description or {@code null} for none
   */
  public CounterMetadata setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Counter aggregation kind.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Counter aggregation kind.
   * @param kind kind or {@code null} for none
   */
  public CounterMetadata setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A string referring to the unit type.
   * @return value or {@code null} for none
   */
  public java.lang.String getOtherUnits() {
    return otherUnits;
  }

  /**
   * A string referring to the unit type.
   * @param otherUnits otherUnits or {@code null} for none
   */
  public CounterMetadata setOtherUnits(java.lang.String otherUnits) {
    this.otherUnits = otherUnits;
    return this;
  }

  /**
   * System defined Units, see above enum.
   * @return value or {@code null} for none
   */
  public java.lang.String getStandardUnits() {
    return standardUnits;
  }

  /**
   * System defined Units, see above enum.
   * @param standardUnits standardUnits or {@code null} for none
   */
  public CounterMetadata setStandardUnits(java.lang.String standardUnits) {
    this.standardUnits = standardUnits;
    return this;
  }

  @Override
  public CounterMetadata set(String fieldName, Object value) {
    return (CounterMetadata) super.set(fieldName, value);
  }

  @Override
  public CounterMetadata clone() {
    return (CounterMetadata) super.clone();
  }

}
