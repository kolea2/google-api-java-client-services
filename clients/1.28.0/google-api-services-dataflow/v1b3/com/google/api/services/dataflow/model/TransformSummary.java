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
 * Description of the type, names/ids, and input/outputs for a transform.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TransformSummary extends com.google.api.client.json.GenericJson {

  /**
   * Transform-specific display data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DisplayData> displayData;

  static {
    // hack to force ProGuard to consider DisplayData used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DisplayData.class);
  }

  /**
   * SDK generated id of this transform instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * User names for all collection inputs to this transform.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> inputCollectionName;

  /**
   * Type of transform.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * User provided name for this transform instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * User  names for all collection outputs to this transform.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> outputCollectionName;

  /**
   * Transform-specific display data.
   * @return value or {@code null} for none
   */
  public java.util.List<DisplayData> getDisplayData() {
    return displayData;
  }

  /**
   * Transform-specific display data.
   * @param displayData displayData or {@code null} for none
   */
  public TransformSummary setDisplayData(java.util.List<DisplayData> displayData) {
    this.displayData = displayData;
    return this;
  }

  /**
   * SDK generated id of this transform instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * SDK generated id of this transform instance.
   * @param id id or {@code null} for none
   */
  public TransformSummary setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * User names for all collection inputs to this transform.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getInputCollectionName() {
    return inputCollectionName;
  }

  /**
   * User names for all collection inputs to this transform.
   * @param inputCollectionName inputCollectionName or {@code null} for none
   */
  public TransformSummary setInputCollectionName(java.util.List<java.lang.String> inputCollectionName) {
    this.inputCollectionName = inputCollectionName;
    return this;
  }

  /**
   * Type of transform.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Type of transform.
   * @param kind kind or {@code null} for none
   */
  public TransformSummary setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * User provided name for this transform instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * User provided name for this transform instance.
   * @param name name or {@code null} for none
   */
  public TransformSummary setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * User  names for all collection outputs to this transform.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getOutputCollectionName() {
    return outputCollectionName;
  }

  /**
   * User  names for all collection outputs to this transform.
   * @param outputCollectionName outputCollectionName or {@code null} for none
   */
  public TransformSummary setOutputCollectionName(java.util.List<java.lang.String> outputCollectionName) {
    this.outputCollectionName = outputCollectionName;
    return this;
  }

  @Override
  public TransformSummary set(String fieldName, Object value) {
    return (TransformSummary) super.set(fieldName, value);
  }

  @Override
  public TransformSummary clone() {
    return (TransformSummary) super.clone();
  }

}
