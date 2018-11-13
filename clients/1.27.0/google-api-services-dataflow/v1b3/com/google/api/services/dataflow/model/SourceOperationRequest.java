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
 * A work item that represents the different operations that can be performed on a user-defined
 * Source specification.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SourceOperationRequest extends com.google.api.client.json.GenericJson {

  /**
   * Information about a request to get metadata about a source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SourceGetMetadataRequest getMetadata;

  /**
   * User-provided name of the Read instruction for this source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * System-defined name for the Read instruction for this source in the original workflow graph.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String originalName;

  /**
   * Information about a request to split a source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SourceSplitRequest split;

  /**
   * System-defined name of the stage containing the source operation. Unique across the workflow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stageName;

  /**
   * System-defined name of the Read instruction for this source. Unique across the workflow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String systemName;

  /**
   * Information about a request to get metadata about a source.
   * @return value or {@code null} for none
   */
  public SourceGetMetadataRequest getGetMetadata() {
    return getMetadata;
  }

  /**
   * Information about a request to get metadata about a source.
   * @param getMetadata getMetadata or {@code null} for none
   */
  public SourceOperationRequest setGetMetadata(SourceGetMetadataRequest getMetadata) {
    this.getMetadata = getMetadata;
    return this;
  }

  /**
   * User-provided name of the Read instruction for this source.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * User-provided name of the Read instruction for this source.
   * @param name name or {@code null} for none
   */
  public SourceOperationRequest setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * System-defined name for the Read instruction for this source in the original workflow graph.
   * @return value or {@code null} for none
   */
  public java.lang.String getOriginalName() {
    return originalName;
  }

  /**
   * System-defined name for the Read instruction for this source in the original workflow graph.
   * @param originalName originalName or {@code null} for none
   */
  public SourceOperationRequest setOriginalName(java.lang.String originalName) {
    this.originalName = originalName;
    return this;
  }

  /**
   * Information about a request to split a source.
   * @return value or {@code null} for none
   */
  public SourceSplitRequest getSplit() {
    return split;
  }

  /**
   * Information about a request to split a source.
   * @param split split or {@code null} for none
   */
  public SourceOperationRequest setSplit(SourceSplitRequest split) {
    this.split = split;
    return this;
  }

  /**
   * System-defined name of the stage containing the source operation. Unique across the workflow.
   * @return value or {@code null} for none
   */
  public java.lang.String getStageName() {
    return stageName;
  }

  /**
   * System-defined name of the stage containing the source operation. Unique across the workflow.
   * @param stageName stageName or {@code null} for none
   */
  public SourceOperationRequest setStageName(java.lang.String stageName) {
    this.stageName = stageName;
    return this;
  }

  /**
   * System-defined name of the Read instruction for this source. Unique across the workflow.
   * @return value or {@code null} for none
   */
  public java.lang.String getSystemName() {
    return systemName;
  }

  /**
   * System-defined name of the Read instruction for this source. Unique across the workflow.
   * @param systemName systemName or {@code null} for none
   */
  public SourceOperationRequest setSystemName(java.lang.String systemName) {
    this.systemName = systemName;
    return this;
  }

  @Override
  public SourceOperationRequest set(String fieldName, Object value) {
    return (SourceOperationRequest) super.set(fieldName, value);
  }

  @Override
  public SourceOperationRequest clone() {
    return (SourceOperationRequest) super.clone();
  }

}