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

package com.google.api.services.doubleclicksearch.model;

/**
 * A list of conversions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DoubleClick Search API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConversionList extends com.google.api.client.json.GenericJson {

  /**
   * The conversions being requested.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Conversion> conversion;

  static {
    // hack to force ProGuard to consider Conversion used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Conversion.class);
  }

  /**
   * Identifies this as a ConversionList resource. Value: the fixed string
   * doubleclicksearch#conversionList.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The conversions being requested.
   * @return value or {@code null} for none
   */
  public java.util.List<Conversion> getConversion() {
    return conversion;
  }

  /**
   * The conversions being requested.
   * @param conversion conversion or {@code null} for none
   */
  public ConversionList setConversion(java.util.List<Conversion> conversion) {
    this.conversion = conversion;
    return this;
  }

  /**
   * Identifies this as a ConversionList resource. Value: the fixed string
   * doubleclicksearch#conversionList.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies this as a ConversionList resource. Value: the fixed string
   * doubleclicksearch#conversionList.
   * @param kind kind or {@code null} for none
   */
  public ConversionList setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public ConversionList set(String fieldName, Object value) {
    return (ConversionList) super.set(fieldName, value);
  }

  @Override
  public ConversionList clone() {
    return (ConversionList) super.clone();
  }

}
